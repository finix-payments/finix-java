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
import model.Error404NotFoundListEmbeddedErrorsInner;

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
 * Error404NotFoundListEmbedded
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Error404NotFoundListEmbedded {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error404NotFoundListEmbeddedErrorsInner> errors = null;

  public Error404NotFoundListEmbedded() { 
  }

  public Error404NotFoundListEmbedded errors(List<Error404NotFoundListEmbeddedErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public Error404NotFoundListEmbedded addErrorsItem(Error404NotFoundListEmbeddedErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Error404NotFoundListEmbeddedErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<Error404NotFoundListEmbeddedErrorsInner> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error404NotFoundListEmbedded error404NotFoundListEmbedded = (Error404NotFoundListEmbedded) o;
    return Objects.equals(this.errors, error404NotFoundListEmbedded.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error404NotFoundListEmbedded {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Error404NotFoundListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Error404NotFoundListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error404NotFoundListEmbedded is not found in the empty JSON string", Error404NotFoundListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Error404NotFoundListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Error404NotFoundListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull() && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error404NotFoundListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error404NotFoundListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error404NotFoundListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error404NotFoundListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<Error404NotFoundListEmbedded>() {
           @Override
           public void write(JsonWriter out, Error404NotFoundListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Error404NotFoundListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Error404NotFoundListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error404NotFoundListEmbedded
  * @throws IOException if the JSON string is invalid with respect to Error404NotFoundListEmbedded
  */
  public static Error404NotFoundListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error404NotFoundListEmbedded.class);
  }

 /**
  * Convert an instance of Error404NotFoundListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

