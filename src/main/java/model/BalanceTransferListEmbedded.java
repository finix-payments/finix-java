/*
 * Finix API
 */


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.BalanceTransferList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import invoker.JSON;

/**
 * List of &#x60;balance_transfer&#x60; objects.
 */
@ApiModel(description = "List of `balance_transfer` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BalanceTransferListEmbedded {
  public static final String SERIALIZED_NAME_BALANCE_TRANSFERS = "balance_transfers";
  @SerializedName(SERIALIZED_NAME_BALANCE_TRANSFERS)
  private List<BalanceTransferList> balanceTransfers = null;

  public BalanceTransferListEmbedded() { 
  }

  public BalanceTransferListEmbedded balanceTransfers(List<BalanceTransferList> balanceTransfers) {
    
    this.balanceTransfers = balanceTransfers;
    return this;
  }

  public BalanceTransferListEmbedded addBalanceTransfersItem(BalanceTransferList balanceTransfersItem) {
    if (this.balanceTransfers == null) {
      this.balanceTransfers = new ArrayList<>();
    }
    this.balanceTransfers.add(balanceTransfersItem);
    return this;
  }

   /**
   * &#x60;balance_transfer&#x60; objects.
   * @return balanceTransfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`balance_transfer` objects.")

  public List<BalanceTransferList> getBalanceTransfers() {
    return balanceTransfers;
  }


  public void setBalanceTransfers(List<BalanceTransferList> balanceTransfers) {
    this.balanceTransfers = balanceTransfers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceTransferListEmbedded balanceTransferListEmbedded = (BalanceTransferListEmbedded) o;
    return Objects.equals(this.balanceTransfers, balanceTransferListEmbedded.balanceTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceTransfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceTransferListEmbedded {\n");
    sb.append("    balanceTransfers: ").append(toIndentedString(balanceTransfers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("balance_transfers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BalanceTransferListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BalanceTransferListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceTransferListEmbedded is not found in the empty JSON string", BalanceTransferListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BalanceTransferListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BalanceTransferListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraybalanceTransfers = jsonObj.getAsJsonArray("balance_transfers");
      if (jsonArraybalanceTransfers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("balance_transfers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `balance_transfers` to be an array in the JSON string but got `%s`", jsonObj.get("balance_transfers").toString()));
        }

        // validate the optional field `balance_transfers` (array)
        for (int i = 0; i < jsonArraybalanceTransfers.size(); i++) {
          BalanceTransferList.validateJsonObject(jsonArraybalanceTransfers.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceTransferListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceTransferListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceTransferListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceTransferListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceTransferListEmbedded>() {
           @Override
           public void write(JsonWriter out, BalanceTransferListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceTransferListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BalanceTransferListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalanceTransferListEmbedded
  * @throws IOException if the JSON string is invalid with respect to BalanceTransferListEmbedded
  */
  public static BalanceTransferListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceTransferListEmbedded.class);
  }

 /**
  * Convert an instance of BalanceTransferListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

