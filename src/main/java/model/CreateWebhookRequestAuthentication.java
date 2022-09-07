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
import model.CreateWebhookRequestAuthenticationBasic;
import model.CreateWebhookRequestAuthenticationBearer;

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
 * The authentication settings that are used to send webhook events.
 */
@ApiModel(description = "The authentication settings that are used to send webhook events.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateWebhookRequestAuthentication {
  public static final String SERIALIZED_NAME_BASIC = "basic";
  @SerializedName(SERIALIZED_NAME_BASIC)
  private CreateWebhookRequestAuthenticationBasic basic;

  public static final String SERIALIZED_NAME_BEARER = "bearer";
  @SerializedName(SERIALIZED_NAME_BEARER)
  private CreateWebhookRequestAuthenticationBearer bearer;

  /**
   * The type of authentication the webhook will use: - **NONE**: No authentication will be used. - **BASIC**: Basic authentication. - **BEARER**: Oauth2&#39;s Bearer Token.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONE("NONE"),
    
    BASIC("BASIC"),
    
    BEARER("BEARER"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
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

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        TypeEnum unknownDefault = TypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public CreateWebhookRequestAuthentication() { 
  }

  public CreateWebhookRequestAuthentication basic(CreateWebhookRequestAuthenticationBasic basic) {
    
    this.basic = basic;
    return this;
  }

   /**
   * Get basic
   * @return basic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateWebhookRequestAuthenticationBasic getBasic() {
    return basic;
  }


  public void setBasic(CreateWebhookRequestAuthenticationBasic basic) {
    this.basic = basic;
  }


  public CreateWebhookRequestAuthentication bearer(CreateWebhookRequestAuthenticationBearer bearer) {
    
    this.bearer = bearer;
    return this;
  }

   /**
   * Get bearer
   * @return bearer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateWebhookRequestAuthenticationBearer getBearer() {
    return bearer;
  }


  public void setBearer(CreateWebhookRequestAuthenticationBearer bearer) {
    this.bearer = bearer;
  }


  public CreateWebhookRequestAuthentication type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of authentication the webhook will use: - **NONE**: No authentication will be used. - **BASIC**: Basic authentication. - **BEARER**: Oauth2&#39;s Bearer Token.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of authentication the webhook will use: - **NONE**: No authentication will be used. - **BASIC**: Basic authentication. - **BEARER**: Oauth2's Bearer Token.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookRequestAuthentication createWebhookRequestAuthentication = (CreateWebhookRequestAuthentication) o;
    return Objects.equals(this.basic, createWebhookRequestAuthentication.basic) &&
        Objects.equals(this.bearer, createWebhookRequestAuthentication.bearer) &&
        Objects.equals(this.type, createWebhookRequestAuthentication.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basic, bearer, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebhookRequestAuthentication {\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    bearer: ").append(toIndentedString(bearer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("basic");
    openapiFields.add("bearer");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateWebhookRequestAuthentication
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateWebhookRequestAuthentication.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWebhookRequestAuthentication is not found in the empty JSON string", CreateWebhookRequestAuthentication.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateWebhookRequestAuthentication.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWebhookRequestAuthentication` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `basic`
     // if (jsonObj.getAsJsonObject("basic") != null) {
       //CreateWebhookRequestAuthenticationBasic.validateJsonObject(jsonObj.getAsJsonObject("basic"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `bearer`
     // if (jsonObj.getAsJsonObject("bearer") != null) {
       //CreateWebhookRequestAuthenticationBearer.validateJsonObject(jsonObj.getAsJsonObject("bearer"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWebhookRequestAuthentication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWebhookRequestAuthentication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWebhookRequestAuthentication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWebhookRequestAuthentication.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWebhookRequestAuthentication>() {
           @Override
           public void write(JsonWriter out, CreateWebhookRequestAuthentication value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWebhookRequestAuthentication read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateWebhookRequestAuthentication given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateWebhookRequestAuthentication
  * @throws IOException if the JSON string is invalid with respect to CreateWebhookRequestAuthentication
  */
  public static CreateWebhookRequestAuthentication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWebhookRequestAuthentication.class);
  }

 /**
  * Convert an instance of CreateWebhookRequestAuthentication to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

