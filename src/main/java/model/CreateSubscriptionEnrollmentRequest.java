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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * 
 */
@ApiModel(description = "")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSubscriptionEnrollmentRequest {
  public static final String SERIALIZED_NAME_ENDED_AT = "ended_at";
  @SerializedName(SERIALIZED_NAME_ENDED_AT)
  private String endedAt;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public CreateSubscriptionEnrollmentRequest() { 
  }

  public CreateSubscriptionEnrollmentRequest endedAt(String endedAt) {
    
    this.endedAt = endedAt;
    return this;
  }

   /**
   * When the &#x60;subscription_enrollment&#x60; will end in **DateTime** format. If left **null**, the Fee will continue in perpetuity and won&#39;t end.
   * @return endedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the `subscription_enrollment` will end in **DateTime** format. If left **null**, the Fee will continue in perpetuity and won't end.")

  public String getEndedAt() {
    return endedAt;
  }


  public void setEndedAt(String endedAt) {
    this.endedAt = endedAt;
  }


  public CreateSubscriptionEnrollmentRequest merchant(String merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * ID of the &#x60;Merchant&#x60; resource.
   * @return merchant
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the `Merchant` resource.")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public CreateSubscriptionEnrollmentRequest nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Human readable name.
   * @return nickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Human readable name.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public CreateSubscriptionEnrollmentRequest startedAt(String startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * When the &#x60;subscription_enrollment&#x60; will begin in **DateTime** format. The start date must be a future date.
   * @return startedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When the `subscription_enrollment` will begin in **DateTime** format. The start date must be a future date.")

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public CreateSubscriptionEnrollmentRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateSubscriptionEnrollmentRequest putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Key value pair for annotating custom meta data (e.g. order numbers).
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key value pair for annotating custom meta data (e.g. order numbers).")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionEnrollmentRequest createSubscriptionEnrollmentRequest = (CreateSubscriptionEnrollmentRequest) o;
    return Objects.equals(this.endedAt, createSubscriptionEnrollmentRequest.endedAt) &&
        Objects.equals(this.merchant, createSubscriptionEnrollmentRequest.merchant) &&
        Objects.equals(this.nickname, createSubscriptionEnrollmentRequest.nickname) &&
        Objects.equals(this.startedAt, createSubscriptionEnrollmentRequest.startedAt) &&
        Objects.equals(this.tags, createSubscriptionEnrollmentRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endedAt, merchant, nickname, startedAt, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionEnrollmentRequest {\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("ended_at");
    openapiFields.add("merchant");
    openapiFields.add("nickname");
    openapiFields.add("started_at");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchant");
    openapiRequiredFields.add("nickname");
    openapiRequiredFields.add("started_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSubscriptionEnrollmentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateSubscriptionEnrollmentRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubscriptionEnrollmentRequest is not found in the empty JSON string", CreateSubscriptionEnrollmentRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSubscriptionEnrollmentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSubscriptionEnrollmentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateSubscriptionEnrollmentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("ended_at") != null && !jsonObj.get("ended_at").isJsonNull()  && !jsonObj.get("ended_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ended_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ended_at").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()  && !jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
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
      if (jsonObj.get("started_at") != null && !jsonObj.get("started_at").isJsonNull()  && !jsonObj.get("started_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `started_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("started_at").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionEnrollmentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionEnrollmentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionEnrollmentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionEnrollmentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionEnrollmentRequest>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionEnrollmentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionEnrollmentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionEnrollmentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionEnrollmentRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionEnrollmentRequest
  */
  public static CreateSubscriptionEnrollmentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionEnrollmentRequest.class);
  }

 /**
  * Convert an instance of CreateSubscriptionEnrollmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

