/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
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
 * ListSubscriptionSchedulesQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListSubscriptionSchedulesQueryParams {
  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ListSubscriptionSchedulesQueryParams() { 
  }

  public ListSubscriptionSchedulesQueryParams nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Filter by the object&#39;s &#x60;nickname&#x60;.
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the object's `nickname`.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public ListSubscriptionSchedulesQueryParams type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Filter by the object&#39;s &#x60;type&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the object's `type`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
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
    ListSubscriptionSchedulesQueryParams listSubscriptionSchedulesQueryParams = (ListSubscriptionSchedulesQueryParams) o;
    return Objects.equals(this.nickname, listSubscriptionSchedulesQueryParams.nickname) &&
        Objects.equals(this.type, listSubscriptionSchedulesQueryParams.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickname, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSubscriptionSchedulesQueryParams {\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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
    openapiFields.add("nickname");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListSubscriptionSchedulesQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListSubscriptionSchedulesQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListSubscriptionSchedulesQueryParams is not found in the empty JSON string", ListSubscriptionSchedulesQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListSubscriptionSchedulesQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListSubscriptionSchedulesQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonNull()  && !jsonObj.get("nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nickname").toString()));
      }
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
       if (!ListSubscriptionSchedulesQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListSubscriptionSchedulesQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListSubscriptionSchedulesQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListSubscriptionSchedulesQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListSubscriptionSchedulesQueryParams>() {
           @Override
           public void write(JsonWriter out, ListSubscriptionSchedulesQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListSubscriptionSchedulesQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListSubscriptionSchedulesQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListSubscriptionSchedulesQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListSubscriptionSchedulesQueryParams
  */
  public static ListSubscriptionSchedulesQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListSubscriptionSchedulesQueryParams.class);
  }

 /**
  * Convert an instance of ListSubscriptionSchedulesQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

