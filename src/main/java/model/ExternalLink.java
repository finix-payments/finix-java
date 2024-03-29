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
 * ExternalLink
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalLink {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt;

  public static final String SERIALIZED_NAME_FILE_ID = "file_id";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public ExternalLink() { 
  }

  public ExternalLink id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;external_Link&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `external_Link` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ExternalLink createdAt(OffsetDateTime createdAt) {
    
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


  public ExternalLink duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Details how long the &#x60;url&#x60; will be avalible for users to upload files to.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details how long the `url` will be avalible for users to upload files to.")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public ExternalLink expired(Boolean expired) {
    
    this.expired = expired;
    return this;
  }

   /**
   * &lt;ul&gt;&lt;li&gt;If &lt;strong&gt;TRUE&lt;/strong&gt; the link has expired&lt;br&gt;&lt;li&gt;If &lt;strong&gt;FALSE&lt;/strong&gt;, the link is active and files can still be uploaded or downloaded from the link.
   * @return expired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<ul><li>If <strong>TRUE</strong> the link has expired<br><li>If <strong>FALSE</strong>, the link is active and files can still be uploaded or downloaded from the link.")

  public Boolean getExpired() {
    return expired;
  }


  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  public ExternalLink expiresAt(String expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The timestamp that the external link expires at.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp that the external link expires at.")

  public String getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public ExternalLink fileId(String fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * The &#x60;File&#x60; ID the &#x60;external_link&#x60; is related to.
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `File` ID the `external_link` is related to.")

  public String getFileId() {
    return fileId;
  }


  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  public ExternalLink tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ExternalLink putTagsItem(String key, String tagsItem) {
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


  public ExternalLink type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Sets if the link is for uploading or downloading files from Finix.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets if the link is for uploading or downloading files from Finix.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ExternalLink url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL you can share with merchants to **UPLOAD** or **DOWNLOAD** files depending on the request sent.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL you can share with merchants to **UPLOAD** or **DOWNLOAD** files depending on the request sent.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ExternalLink userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the &#x60;user&#x60; that requested to create this link.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `user` that requested to create this link.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalLink externalLink = (ExternalLink) o;
    return Objects.equals(this.id, externalLink.id) &&
        Objects.equals(this.createdAt, externalLink.createdAt) &&
        Objects.equals(this.duration, externalLink.duration) &&
        Objects.equals(this.expired, externalLink.expired) &&
        Objects.equals(this.expiresAt, externalLink.expiresAt) &&
        Objects.equals(this.fileId, externalLink.fileId) &&
        Objects.equals(this.tags, externalLink.tags) &&
        Objects.equals(this.type, externalLink.type) &&
        Objects.equals(this.url, externalLink.url) &&
        Objects.equals(this.userId, externalLink.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, duration, expired, expiresAt, fileId, tags, type, url, userId);
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
    sb.append("class ExternalLink {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("expired");
    openapiFields.add("expires_at");
    openapiFields.add("file_id");
    openapiFields.add("tags");
    openapiFields.add("type");
    openapiFields.add("url");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalLink
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExternalLink.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalLink is not found in the empty JSON string", ExternalLink.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalLink.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalLink` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()  && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()  && !jsonObj.get("expires_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_at").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("file_id") != null && !jsonObj.get("file_id").isJsonNull()  && !jsonObj.get("file_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()  && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()  && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalLink.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalLink>() {
           @Override
           public void write(JsonWriter out, ExternalLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalLink read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalLink
  * @throws IOException if the JSON string is invalid with respect to ExternalLink
  */
  public static ExternalLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalLink.class);
  }

 /**
  * Convert an instance of ExternalLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

