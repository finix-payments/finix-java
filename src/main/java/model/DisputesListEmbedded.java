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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import model.Dispute;

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
 * List of &#x60;Dispute&#x60; objects.
 */
@ApiModel(description = "List of `Dispute` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DisputesListEmbedded {
  public static final String SERIALIZED_NAME_DISPUTES = "disputes";
  @SerializedName(SERIALIZED_NAME_DISPUTES)
  private Set<Dispute> disputes = null;

  public DisputesListEmbedded() { 
  }

  public DisputesListEmbedded disputes(Set<Dispute> disputes) {
    
    this.disputes = disputes;
    return this;
  }

  public DisputesListEmbedded addDisputesItem(Dispute disputesItem) {
    if (this.disputes == null) {
      this.disputes = new LinkedHashSet<>();
    }
    this.disputes.add(disputesItem);
    return this;
  }

   /**
   * &#x60;Dispute&#x60; objects.
   * @return disputes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Dispute` objects.")

  public Set<Dispute> getDisputes() {
    return disputes;
  }


  public void setDisputes(Set<Dispute> disputes) {
    this.disputes = disputes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputesListEmbedded disputesListEmbedded = (DisputesListEmbedded) o;
    return Objects.equals(this.disputes, disputesListEmbedded.disputes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputesListEmbedded {\n");
    sb.append("    disputes: ").append(toIndentedString(disputes)).append("\n");
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
    openapiFields.add("disputes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DisputesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DisputesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisputesListEmbedded is not found in the empty JSON string", DisputesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DisputesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DisputesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraydisputes = jsonObj.getAsJsonArray("disputes");
      if (jsonArraydisputes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("disputes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `disputes` to be an array in the JSON string but got `%s`", jsonObj.get("disputes").toString()));
        }

        // validate the optional field `disputes` (array)
        for (int i = 0; i < jsonArraydisputes.size(); i++) {
          Dispute.validateJsonObject(jsonArraydisputes.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisputesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisputesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisputesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisputesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<DisputesListEmbedded>() {
           @Override
           public void write(JsonWriter out, DisputesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DisputesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DisputesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisputesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to DisputesListEmbedded
  */
  public static DisputesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisputesListEmbedded.class);
  }

 /**
  * Convert an instance of DisputesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

