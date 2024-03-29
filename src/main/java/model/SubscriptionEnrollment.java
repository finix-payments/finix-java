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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.SubscriptionEnrollmentLinks;
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
public class SubscriptionEnrollment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

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

  public static final String SERIALIZED_NAME_SUBSCRIPTION_SCHEDULE = "subscription_schedule";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SCHEDULE)
  private String subscriptionSchedule;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SubscriptionEnrollmentLinks links;

  public SubscriptionEnrollment() { 
  }

  public SubscriptionEnrollment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the &#x60;subscription_enrollment&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `subscription_enrollment`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SubscriptionEnrollment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SubscriptionEnrollment updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the object was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SubscriptionEnrollment createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the &#x60;User&#x60; who created the &#x60;subscription_enrollment&#x60;.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `User` who created the `subscription_enrollment`.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public SubscriptionEnrollment endedAt(String endedAt) {
    
    this.endedAt = endedAt;
    return this;
  }

   /**
   * When the &#x60;subscription_enrollment&#x60; will end in **DateTime** format.
   * @return endedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the `subscription_enrollment` will end in **DateTime** format.")

  public String getEndedAt() {
    return endedAt;
  }


  public void setEndedAt(String endedAt) {
    this.endedAt = endedAt;
  }


  public SubscriptionEnrollment merchant(String merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * ID of the &#x60;Merchant&#x60; resource.
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Merchant` resource.")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public SubscriptionEnrollment nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Human readable name.
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "super important thing", value = "Human readable name.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public SubscriptionEnrollment startedAt(String startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * When the &#x60;subscription_enrollment&#x60; will begin in **DateTime** format.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the `subscription_enrollment` will begin in **DateTime** format.")

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public SubscriptionEnrollment subscriptionSchedule(String subscriptionSchedule) {
    
    this.subscriptionSchedule = subscriptionSchedule;
    return this;
  }

   /**
   * ID of the &#x60;Subscription Schedule&#x60;.
   * @return subscriptionSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Subscription Schedule`.")

  public String getSubscriptionSchedule() {
    return subscriptionSchedule;
  }


  public void setSubscriptionSchedule(String subscriptionSchedule) {
    this.subscriptionSchedule = subscriptionSchedule;
  }


  public SubscriptionEnrollment tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SubscriptionEnrollment putTagsItem(String key, String tagsItem) {
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


  public SubscriptionEnrollment links(SubscriptionEnrollmentLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionEnrollmentLinks getLinks() {
    return links;
  }


  public void setLinks(SubscriptionEnrollmentLinks links) {
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
    SubscriptionEnrollment subscriptionEnrollment = (SubscriptionEnrollment) o;
    return Objects.equals(this.id, subscriptionEnrollment.id) &&
        Objects.equals(this.createdAt, subscriptionEnrollment.createdAt) &&
        Objects.equals(this.updatedAt, subscriptionEnrollment.updatedAt) &&
        Objects.equals(this.createdBy, subscriptionEnrollment.createdBy) &&
        Objects.equals(this.endedAt, subscriptionEnrollment.endedAt) &&
        Objects.equals(this.merchant, subscriptionEnrollment.merchant) &&
        Objects.equals(this.nickname, subscriptionEnrollment.nickname) &&
        Objects.equals(this.startedAt, subscriptionEnrollment.startedAt) &&
        Objects.equals(this.subscriptionSchedule, subscriptionEnrollment.subscriptionSchedule) &&
        Objects.equals(this.tags, subscriptionEnrollment.tags) &&
        Objects.equals(this.links, subscriptionEnrollment.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, createdBy, endedAt, merchant, nickname, startedAt, subscriptionSchedule, tags, links);
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
    sb.append("class SubscriptionEnrollment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    subscriptionSchedule: ").append(toIndentedString(subscriptionSchedule)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("created_by");
    openapiFields.add("ended_at");
    openapiFields.add("merchant");
    openapiFields.add("nickname");
    openapiFields.add("started_at");
    openapiFields.add("subscription_schedule");
    openapiFields.add("tags");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionEnrollment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionEnrollment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionEnrollment is not found in the empty JSON string", SubscriptionEnrollment.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionEnrollment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionEnrollment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()  && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()  && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
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
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("subscription_schedule") != null && !jsonObj.get("subscription_schedule").isJsonNull()  && !jsonObj.get("subscription_schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_schedule").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //SubscriptionEnrollmentLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionEnrollment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionEnrollment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionEnrollment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionEnrollment.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionEnrollment>() {
           @Override
           public void write(JsonWriter out, SubscriptionEnrollment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionEnrollment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionEnrollment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionEnrollment
  * @throws IOException if the JSON string is invalid with respect to SubscriptionEnrollment
  */
  public static SubscriptionEnrollment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionEnrollment.class);
  }

 /**
  * Convert an instance of SubscriptionEnrollment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

