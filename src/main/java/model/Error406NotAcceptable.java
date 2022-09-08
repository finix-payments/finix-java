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
import model.Error404NotFoundListEmbedded;

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
 * Error406NotAcceptable
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Error406NotAcceptable {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private Error404NotFoundListEmbedded embedded;

  public Error406NotAcceptable() { 
  }

  public Error406NotAcceptable total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }


  public Error406NotAcceptable embedded(Error404NotFoundListEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error404NotFoundListEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(Error404NotFoundListEmbedded embedded) {
    this.embedded = embedded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error406NotAcceptable error406NotAcceptable = (Error406NotAcceptable) o;
    return Objects.equals(this.total, error406NotAcceptable.total) &&
        Objects.equals(this.embedded, error406NotAcceptable.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, embedded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error406NotAcceptable {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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
    openapiFields.add("total");
    openapiFields.add("_embedded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Error406NotAcceptable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Error406NotAcceptable.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error406NotAcceptable is not found in the empty JSON string", Error406NotAcceptable.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Error406NotAcceptable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Error406NotAcceptable` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_embedded`
     // if (jsonObj.getAsJsonObject("_embedded") != null) {
       //Error404NotFoundListEmbedded.validateJsonObject(jsonObj.getAsJsonObject("_embedded"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error406NotAcceptable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error406NotAcceptable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error406NotAcceptable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error406NotAcceptable.class));

       return (TypeAdapter<T>) new TypeAdapter<Error406NotAcceptable>() {
           @Override
           public void write(JsonWriter out, Error406NotAcceptable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Error406NotAcceptable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Error406NotAcceptable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error406NotAcceptable
  * @throws IOException if the JSON string is invalid with respect to Error406NotAcceptable
  */
  public static Error406NotAcceptable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error406NotAcceptable.class);
  }

 /**
  * Convert an instance of Error406NotAcceptable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

