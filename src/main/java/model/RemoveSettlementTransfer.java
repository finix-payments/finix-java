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
 * RemoveSettlementTransfer
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RemoveSettlementTransfer {
  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private List<String> transfers = null;

  public RemoveSettlementTransfer() { 
  }

  public RemoveSettlementTransfer transfers(List<String> transfers) {
    
    this.transfers = transfers;
    return this;
  }

  public RemoveSettlementTransfer addTransfersItem(String transfersItem) {
    if (this.transfers == null) {
      this.transfers = new ArrayList<>();
    }
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * ID of &#x60;Transfer&#x60; resource.
   * @return transfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of `Transfer` resource.")

  public List<String> getTransfers() {
    return transfers;
  }


  public void setTransfers(List<String> transfers) {
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
    RemoveSettlementTransfer removeSettlementTransfer = (RemoveSettlementTransfer) o;
    return Objects.equals(this.transfers, removeSettlementTransfer.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveSettlementTransfer {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to RemoveSettlementTransfer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RemoveSettlementTransfer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemoveSettlementTransfer is not found in the empty JSON string", RemoveSettlementTransfer.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RemoveSettlementTransfer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RemoveSettlementTransfer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("transfers") != null && !jsonObj.get("transfers").isJsonNull() && !jsonObj.get("transfers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfers` to be an array in the JSON string but got `%s`", jsonObj.get("transfers").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemoveSettlementTransfer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemoveSettlementTransfer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemoveSettlementTransfer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemoveSettlementTransfer.class));

       return (TypeAdapter<T>) new TypeAdapter<RemoveSettlementTransfer>() {
           @Override
           public void write(JsonWriter out, RemoveSettlementTransfer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RemoveSettlementTransfer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RemoveSettlementTransfer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RemoveSettlementTransfer
  * @throws IOException if the JSON string is invalid with respect to RemoveSettlementTransfer
  */
  public static RemoveSettlementTransfer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemoveSettlementTransfer.class);
  }

 /**
  * Convert an instance of RemoveSettlementTransfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

