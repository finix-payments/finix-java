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
import model.ApplicationLinksApplicationProfile;

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
 * Error422InvalidFieldListEmbeddedLinks
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-03T16:00:09.531596-05:00[America/Chicago]")
public class Error422InvalidFieldListEmbeddedLinks {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private ApplicationLinksApplicationProfile source;

  public Error422InvalidFieldListEmbeddedLinks() { 
  }

  public Error422InvalidFieldListEmbeddedLinks source(ApplicationLinksApplicationProfile source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getSource() {
    return source;
  }


  public void setSource(ApplicationLinksApplicationProfile source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error422InvalidFieldListEmbeddedLinks error422InvalidFieldListEmbeddedLinks = (Error422InvalidFieldListEmbeddedLinks) o;
    return Objects.equals(this.source, error422InvalidFieldListEmbeddedLinks.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error422InvalidFieldListEmbeddedLinks {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Error422InvalidFieldListEmbeddedLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Error422InvalidFieldListEmbeddedLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error422InvalidFieldListEmbeddedLinks is not found in the empty JSON string", Error422InvalidFieldListEmbeddedLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Error422InvalidFieldListEmbeddedLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Error422InvalidFieldListEmbeddedLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      // validate the optional field `source`
      if (jsonObj.getAsJsonObject("source") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("source"));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error422InvalidFieldListEmbeddedLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error422InvalidFieldListEmbeddedLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error422InvalidFieldListEmbeddedLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error422InvalidFieldListEmbeddedLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<Error422InvalidFieldListEmbeddedLinks>() {
           @Override
           public void write(JsonWriter out, Error422InvalidFieldListEmbeddedLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Error422InvalidFieldListEmbeddedLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Error422InvalidFieldListEmbeddedLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error422InvalidFieldListEmbeddedLinks
  * @throws IOException if the JSON string is invalid with respect to Error422InvalidFieldListEmbeddedLinks
  */
  public static Error422InvalidFieldListEmbeddedLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error422InvalidFieldListEmbeddedLinks.class);
  }

 /**
  * Convert an instance of Error422InvalidFieldListEmbeddedLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
