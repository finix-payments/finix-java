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
 * The bearer authentication configuration. Null if bearer is not being used.
 */
@ApiModel(description = "The bearer authentication configuration. Null if bearer is not being used.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateWebhookRequestAuthenticationBearer {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public CreateWebhookRequestAuthenticationBearer() { 
  }

  public CreateWebhookRequestAuthenticationBearer token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The string that Finix will send as the bearer token.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The string that Finix will send as the bearer token.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookRequestAuthenticationBearer createWebhookRequestAuthenticationBearer = (CreateWebhookRequestAuthenticationBearer) o;
    return Objects.equals(this.token, createWebhookRequestAuthenticationBearer.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebhookRequestAuthenticationBearer {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateWebhookRequestAuthenticationBearer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateWebhookRequestAuthenticationBearer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWebhookRequestAuthenticationBearer is not found in the empty JSON string", CreateWebhookRequestAuthenticationBearer.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateWebhookRequestAuthenticationBearer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWebhookRequestAuthenticationBearer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()  && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWebhookRequestAuthenticationBearer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWebhookRequestAuthenticationBearer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWebhookRequestAuthenticationBearer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWebhookRequestAuthenticationBearer.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWebhookRequestAuthenticationBearer>() {
           @Override
           public void write(JsonWriter out, CreateWebhookRequestAuthenticationBearer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWebhookRequestAuthenticationBearer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateWebhookRequestAuthenticationBearer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateWebhookRequestAuthenticationBearer
  * @throws IOException if the JSON string is invalid with respect to CreateWebhookRequestAuthenticationBearer
  */
  public static CreateWebhookRequestAuthenticationBearer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWebhookRequestAuthenticationBearer.class);
  }

 /**
  * Convert an instance of CreateWebhookRequestAuthenticationBearer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

