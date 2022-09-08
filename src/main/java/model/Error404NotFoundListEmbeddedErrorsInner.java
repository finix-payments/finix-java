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
import model.Error402PaymentRequiredEmbeddedErrorsInnerLinks;
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
 * Error404NotFoundListEmbeddedErrorsInner
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Error404NotFoundListEmbeddedErrorsInner {
  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    NOT_FOUND("NOT_FOUND"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

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

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static CodeEnum fromValue(String value) {
        for (CodeEnum b : CodeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        CodeEnum unknownDefault = CodeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
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

  public static final String SERIALIZED_NAME_LOGREF = "logref";
  @SerializedName(SERIALIZED_NAME_LOGREF)
  private LogRef logref;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Error402PaymentRequiredEmbeddedErrorsInnerLinks links;

  public Error404NotFoundListEmbeddedErrorsInner() { 
  }

  public Error404NotFoundListEmbeddedErrorsInner code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public Error404NotFoundListEmbeddedErrorsInner logref(LogRef logref) {
    
    this.logref = logref;
    return this;
  }

   /**
   * Get logref
   * @return logref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LogRef getLogref() {
    return logref;
  }


  public void setLogref(LogRef logref) {
    this.logref = logref;
  }


  public Error404NotFoundListEmbeddedErrorsInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Error404NotFoundListEmbeddedErrorsInner links(Error402PaymentRequiredEmbeddedErrorsInnerLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error402PaymentRequiredEmbeddedErrorsInnerLinks getLinks() {
    return links;
  }


  public void setLinks(Error402PaymentRequiredEmbeddedErrorsInnerLinks links) {
    this.links = links;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public Error404NotFoundListEmbeddedErrorsInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error404NotFoundListEmbeddedErrorsInner error404NotFoundListEmbeddedErrorsInner = (Error404NotFoundListEmbeddedErrorsInner) o;
    return Objects.equals(this.code, error404NotFoundListEmbeddedErrorsInner.code) &&
        Objects.equals(this.logref, error404NotFoundListEmbeddedErrorsInner.logref) &&
        Objects.equals(this.message, error404NotFoundListEmbeddedErrorsInner.message) &&
        Objects.equals(this.links, error404NotFoundListEmbeddedErrorsInner.links)&&
        Objects.equals(this.additionalProperties, error404NotFoundListEmbeddedErrorsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, logref, message, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error404NotFoundListEmbeddedErrorsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    logref: ").append(toIndentedString(logref)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("logref");
    openapiFields.add("message");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Error404NotFoundListEmbeddedErrorsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Error404NotFoundListEmbeddedErrorsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error404NotFoundListEmbeddedErrorsInner is not found in the empty JSON string", Error404NotFoundListEmbeddedErrorsInner.openapiRequiredFields.toString()));
        }
      }
     /*       */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()  && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `logref`
     // if (jsonObj.getAsJsonObject("logref") != null) {
       //LogRef.validateJsonObject(jsonObj.getAsJsonObject("logref"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()  && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //Error402PaymentRequiredEmbeddedErrorsInnerLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error404NotFoundListEmbeddedErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error404NotFoundListEmbeddedErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error404NotFoundListEmbeddedErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error404NotFoundListEmbeddedErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<Error404NotFoundListEmbeddedErrorsInner>() {
           @Override
           public void write(JsonWriter out, Error404NotFoundListEmbeddedErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Error404NotFoundListEmbeddedErrorsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Error404NotFoundListEmbeddedErrorsInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Error404NotFoundListEmbeddedErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error404NotFoundListEmbeddedErrorsInner
  * @throws IOException if the JSON string is invalid with respect to Error404NotFoundListEmbeddedErrorsInner
  */
  public static Error404NotFoundListEmbeddedErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error404NotFoundListEmbeddedErrorsInner.class);
  }

 /**
  * Convert an instance of Error404NotFoundListEmbeddedErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

