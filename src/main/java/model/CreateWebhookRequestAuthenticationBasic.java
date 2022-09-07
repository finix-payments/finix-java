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
 * The basic authentication configuration. Null if basic is not being used.
 */
@ApiModel(description = "The basic authentication configuration. Null if basic is not being used.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateWebhookRequestAuthenticationBasic {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public CreateWebhookRequestAuthenticationBasic() { 
  }

  public CreateWebhookRequestAuthenticationBasic username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The username that will be used for basic authentication
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The username that will be used for basic authentication")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public CreateWebhookRequestAuthenticationBasic password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password to be used for basic authentication.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password to be used for basic authentication.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookRequestAuthenticationBasic createWebhookRequestAuthenticationBasic = (CreateWebhookRequestAuthenticationBasic) o;
    return Objects.equals(this.username, createWebhookRequestAuthenticationBasic.username) &&
        Objects.equals(this.password, createWebhookRequestAuthenticationBasic.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebhookRequestAuthenticationBasic {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateWebhookRequestAuthenticationBasic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateWebhookRequestAuthenticationBasic.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWebhookRequestAuthenticationBasic is not found in the empty JSON string", CreateWebhookRequestAuthenticationBasic.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateWebhookRequestAuthenticationBasic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWebhookRequestAuthenticationBasic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()  && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()  && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWebhookRequestAuthenticationBasic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWebhookRequestAuthenticationBasic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWebhookRequestAuthenticationBasic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWebhookRequestAuthenticationBasic.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWebhookRequestAuthenticationBasic>() {
           @Override
           public void write(JsonWriter out, CreateWebhookRequestAuthenticationBasic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWebhookRequestAuthenticationBasic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateWebhookRequestAuthenticationBasic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateWebhookRequestAuthenticationBasic
  * @throws IOException if the JSON string is invalid with respect to CreateWebhookRequestAuthenticationBasic
  */
  public static CreateWebhookRequestAuthenticationBasic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWebhookRequestAuthenticationBasic.class);
  }

 /**
  * Convert an instance of CreateWebhookRequestAuthenticationBasic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

