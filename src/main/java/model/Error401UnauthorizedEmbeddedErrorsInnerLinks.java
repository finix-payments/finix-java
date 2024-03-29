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
 * Error401UnauthorizedEmbeddedErrorsInnerLinks
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Error401UnauthorizedEmbeddedErrorsInnerLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksApplicationProfile self;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private ApplicationLinksApplicationProfile source;

  public Error401UnauthorizedEmbeddedErrorsInnerLinks() { 
  }

  public Error401UnauthorizedEmbeddedErrorsInnerLinks self(ApplicationLinksApplicationProfile self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getSelf() {
    return self;
  }


  public void setSelf(ApplicationLinksApplicationProfile self) {
    this.self = self;
  }


  public Error401UnauthorizedEmbeddedErrorsInnerLinks source(ApplicationLinksApplicationProfile source) {
    
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
  public Error401UnauthorizedEmbeddedErrorsInnerLinks putAdditionalProperty(String key, Object value) {
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
    Error401UnauthorizedEmbeddedErrorsInnerLinks error401UnauthorizedEmbeddedErrorsInnerLinks = (Error401UnauthorizedEmbeddedErrorsInnerLinks) o;
    return Objects.equals(this.self, error401UnauthorizedEmbeddedErrorsInnerLinks.self) &&
        Objects.equals(this.source, error401UnauthorizedEmbeddedErrorsInnerLinks.source)&&
        Objects.equals(this.additionalProperties, error401UnauthorizedEmbeddedErrorsInnerLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error401UnauthorizedEmbeddedErrorsInnerLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Error401UnauthorizedEmbeddedErrorsInnerLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Error401UnauthorizedEmbeddedErrorsInnerLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error401UnauthorizedEmbeddedErrorsInnerLinks is not found in the empty JSON string", Error401UnauthorizedEmbeddedErrorsInnerLinks.openapiRequiredFields.toString()));
        }
      }
     /*       */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `self`
     // if (jsonObj.getAsJsonObject("self") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("self"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `source`
     // if (jsonObj.getAsJsonObject("source") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("source"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error401UnauthorizedEmbeddedErrorsInnerLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error401UnauthorizedEmbeddedErrorsInnerLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error401UnauthorizedEmbeddedErrorsInnerLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error401UnauthorizedEmbeddedErrorsInnerLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<Error401UnauthorizedEmbeddedErrorsInnerLinks>() {
           @Override
           public void write(JsonWriter out, Error401UnauthorizedEmbeddedErrorsInnerLinks value) throws IOException {
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
           public Error401UnauthorizedEmbeddedErrorsInnerLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Error401UnauthorizedEmbeddedErrorsInnerLinks instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Error401UnauthorizedEmbeddedErrorsInnerLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error401UnauthorizedEmbeddedErrorsInnerLinks
  * @throws IOException if the JSON string is invalid with respect to Error401UnauthorizedEmbeddedErrorsInnerLinks
  */
  public static Error401UnauthorizedEmbeddedErrorsInnerLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error401UnauthorizedEmbeddedErrorsInnerLinks.class);
  }

 /**
  * Convert an instance of Error401UnauthorizedEmbeddedErrorsInnerLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

