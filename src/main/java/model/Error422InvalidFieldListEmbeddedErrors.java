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
import model.Error422InvalidFieldListEmbeddedLinks;
import model.LogRef;

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
 * Error422InvalidFieldListEmbeddedErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-27T11:05:36.428255-05:00[America/Chicago]")
public class Error422InvalidFieldListEmbeddedErrors {
  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INVALID_FIELD("INVALID_FIELD");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_LOGREF = "logref";
  @SerializedName(SERIALIZED_NAME_LOGREF)
  private LogRef logref;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Error422InvalidFieldListEmbeddedLinks links;

  public Error422InvalidFieldListEmbeddedErrors() { 
  }

  public Error422InvalidFieldListEmbeddedErrors code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public Error422InvalidFieldListEmbeddedErrors field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public Error422InvalidFieldListEmbeddedErrors logref(LogRef logref) {
    
    this.logref = logref;
    return this;
  }

   /**
   * Get logref
   * @return logref
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LogRef getLogref() {
    return logref;
  }


  public void setLogref(LogRef logref) {
    this.logref = logref;
  }


  public Error422InvalidFieldListEmbeddedErrors message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Error422InvalidFieldListEmbeddedErrors links(Error422InvalidFieldListEmbeddedLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Error422InvalidFieldListEmbeddedLinks getLinks() {
    return links;
  }


  public void setLinks(Error422InvalidFieldListEmbeddedLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error422InvalidFieldListEmbeddedErrors error422InvalidFieldListEmbeddedErrors = (Error422InvalidFieldListEmbeddedErrors) o;
    return Objects.equals(this.code, error422InvalidFieldListEmbeddedErrors.code) &&
        Objects.equals(this.field, error422InvalidFieldListEmbeddedErrors.field) &&
        Objects.equals(this.logref, error422InvalidFieldListEmbeddedErrors.logref) &&
        Objects.equals(this.message, error422InvalidFieldListEmbeddedErrors.message) &&
        Objects.equals(this.links, error422InvalidFieldListEmbeddedErrors.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, logref, message, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error422InvalidFieldListEmbeddedErrors {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    logref: ").append(toIndentedString(logref)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("field");
    openapiFields.add("logref");
    openapiFields.add("message");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("logref");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("_links");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Error422InvalidFieldListEmbeddedErrors
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Error422InvalidFieldListEmbeddedErrors.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error422InvalidFieldListEmbeddedErrors is not found in the empty JSON string", Error422InvalidFieldListEmbeddedErrors.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Error422InvalidFieldListEmbeddedErrors.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Error422InvalidFieldListEmbeddedErrors` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : Error422InvalidFieldListEmbeddedErrors.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()  && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()  && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      // validate the optional field `logref`
      if (jsonObj.getAsJsonObject("logref") != null) {
       LogRef.validateJsonObject(jsonObj.getAsJsonObject("logref"));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()  && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.getAsJsonObject("_links") != null) {
       Error422InvalidFieldListEmbeddedLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error422InvalidFieldListEmbeddedErrors.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error422InvalidFieldListEmbeddedErrors' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error422InvalidFieldListEmbeddedErrors> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error422InvalidFieldListEmbeddedErrors.class));

       return (TypeAdapter<T>) new TypeAdapter<Error422InvalidFieldListEmbeddedErrors>() {
           @Override
           public void write(JsonWriter out, Error422InvalidFieldListEmbeddedErrors value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Error422InvalidFieldListEmbeddedErrors read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Error422InvalidFieldListEmbeddedErrors given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error422InvalidFieldListEmbeddedErrors
  * @throws IOException if the JSON string is invalid with respect to Error422InvalidFieldListEmbeddedErrors
  */
  public static Error422InvalidFieldListEmbeddedErrors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error422InvalidFieldListEmbeddedErrors.class);
  }

 /**
  * Convert an instance of Error422InvalidFieldListEmbeddedErrors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

