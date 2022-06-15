/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2018-01-01
 * Contact: support@finixpayments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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
import model.Transfer;

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
 * AdjustmentTransfersListEmbedded
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T16:04:59.372163-05:00[America/Chicago]")
public class AdjustmentTransfersListEmbedded {
  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private List<Transfer> transfers = null;

  public AdjustmentTransfersListEmbedded() { 
  }

  public AdjustmentTransfersListEmbedded transfers(List<Transfer> transfers) {
    
    this.transfers = transfers;
    return this;
  }

  public AdjustmentTransfersListEmbedded addTransfersItem(Transfer transfersItem) {
    if (this.transfers == null) {
      this.transfers = new ArrayList<>();
    }
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Transfer> getTransfers() {
    return transfers;
  }


  public void setTransfers(List<Transfer> transfers) {
    this.transfers = transfers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustmentTransfersListEmbedded adjustmentTransfersListEmbedded = (AdjustmentTransfersListEmbedded) o;
    return Objects.equals(this.transfers, adjustmentTransfersListEmbedded.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentTransfersListEmbedded {\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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
    openapiFields.add("transfers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdjustmentTransfersListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdjustmentTransfersListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdjustmentTransfersListEmbedded is not found in the empty JSON string", AdjustmentTransfersListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdjustmentTransfersListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdjustmentTransfersListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraytransfers = jsonObj.getAsJsonArray("transfers");
      if (jsonArraytransfers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("transfers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `transfers` to be an array in the JSON string but got `%s`", jsonObj.get("transfers").toString()));
        }

        // validate the optional field `transfers` (array)
        for (int i = 0; i < jsonArraytransfers.size(); i++) {
          Transfer.validateJsonObject(jsonArraytransfers.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdjustmentTransfersListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdjustmentTransfersListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdjustmentTransfersListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdjustmentTransfersListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<AdjustmentTransfersListEmbedded>() {
           @Override
           public void write(JsonWriter out, AdjustmentTransfersListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdjustmentTransfersListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdjustmentTransfersListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdjustmentTransfersListEmbedded
  * @throws IOException if the JSON string is invalid with respect to AdjustmentTransfersListEmbedded
  */
  public static AdjustmentTransfersListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdjustmentTransfersListEmbedded.class);
  }

 /**
  * Convert an instance of AdjustmentTransfersListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

