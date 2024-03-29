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
 * ModelFile
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelFile {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_IDENTITY_ID = "identity_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_ID)
  private String identityId;

  public static final String SERIALIZED_NAME_LINKED_TO = "linked_to";
  @SerializedName(SERIALIZED_NAME_LINKED_TO)
  private String linkedTo;

  public static final String SERIALIZED_NAME_LINKED_TYPE = "linked_type";
  @SerializedName(SERIALIZED_NAME_LINKED_TYPE)
  private String linkedType;

  public static final String SERIALIZED_NAME_PLATFORM_ID = "platform_id";
  @SerializedName(SERIALIZED_NAME_PLATFORM_ID)
  private String platformId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ModelFile() { 
  }

  public ModelFile id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;File&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `File` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ModelFile createdAt(OffsetDateTime createdAt) {
    
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


  public ModelFile updatedAt(OffsetDateTime updatedAt) {
    
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


  public ModelFile applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the &#x60;Application&#x60; that the &#x60;File&#x60; was created under.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Application` that the `File` was created under.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public ModelFile displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the &#x60;File&#x60; object. If you don&#39;t provide a name, Finix will name the object with the convention: **FILE_(file_id)**.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the `File` object. If you don't provide a name, Finix will name the object with the convention: **FILE_(file_id)**.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ModelFile extension(String extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * The extension of the file.
   * @return extension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The extension of the file.")

  public String getExtension() {
    return extension;
  }


  public void setExtension(String extension) {
    this.extension = extension;
  }


  public ModelFile identityId(String identityId) {
    
    this.identityId = identityId;
    return this;
  }

   /**
   * ID of the &#x60;Identity&#x60; that created the &#x60;File&#x60;.
   * @return identityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Identity` that created the `File`.")

  public String getIdentityId() {
    return identityId;
  }


  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }


  public ModelFile linkedTo(String linkedTo) {
    
    this.linkedTo = linkedTo;
    return this;
  }

   /**
   * The resource ID the &#x60;File&#x60; is linked to.
   * @return linkedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The resource ID the `File` is linked to.")

  public String getLinkedTo() {
    return linkedTo;
  }


  public void setLinkedTo(String linkedTo) {
    this.linkedTo = linkedTo;
  }


  public ModelFile linkedType(String linkedType) {
    
    this.linkedType = linkedType;
    return this;
  }

   /**
   * Autofills to **Merchant**.
   * @return linkedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Autofills to **Merchant**.")

  public String getLinkedType() {
    return linkedType;
  }


  public void setLinkedType(String linkedType) {
    this.linkedType = linkedType;
  }


  public ModelFile platformId(String platformId) {
    
    this.platformId = platformId;
    return this;
  }

   /**
   * The ID of the &#x60;Platform&#x60; that the &#x60;File&#x60; was created under.
   * @return platformId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Platform` that the `File` was created under.")

  public String getPlatformId() {
    return platformId;
  }


  public void setPlatformId(String platformId) {
    this.platformId = platformId;
  }


  public ModelFile status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the file&#39;s review. The statuses available includes:&lt;br&gt;&lt;li&gt;&lt;strong&gt;REQUIRES_UPLOAD&lt;/strong&gt;: A file still needs to be uploaded to the file object.&lt;br&gt;&lt;li&gt;&lt;strong&gt;PENDING&lt;/strong&gt;: Finix&#39;s underwriting team is still reviewing the uploaded files.&lt;br&gt;&lt;li&gt;&lt;strong&gt;INVALID&lt;/strong&gt;: The file couldn&#39;t be read.&lt;br&gt;&lt;li&gt;&lt;strong&gt;UPLOADED&lt;/strong&gt;: The file has been uploaded to the resource.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the file's review. The statuses available includes:<br><li><strong>REQUIRES_UPLOAD</strong>: A file still needs to be uploaded to the file object.<br><li><strong>PENDING</strong>: Finix's underwriting team is still reviewing the uploaded files.<br><li><strong>INVALID</strong>: The file couldn't be read.<br><li><strong>UPLOADED</strong>: The file has been uploaded to the resource.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ModelFile tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ModelFile putTagsItem(String key, String tagsItem) {
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


  public ModelFile type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of document.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of document.")

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
    ModelFile _file = (ModelFile) o;
    return Objects.equals(this.id, _file.id) &&
        Objects.equals(this.createdAt, _file.createdAt) &&
        Objects.equals(this.updatedAt, _file.updatedAt) &&
        Objects.equals(this.applicationId, _file.applicationId) &&
        Objects.equals(this.displayName, _file.displayName) &&
        Objects.equals(this.extension, _file.extension) &&
        Objects.equals(this.identityId, _file.identityId) &&
        Objects.equals(this.linkedTo, _file.linkedTo) &&
        Objects.equals(this.linkedType, _file.linkedType) &&
        Objects.equals(this.platformId, _file.platformId) &&
        Objects.equals(this.status, _file.status) &&
        Objects.equals(this.tags, _file.tags) &&
        Objects.equals(this.type, _file.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, applicationId, displayName, extension, identityId, linkedTo, linkedType, platformId, status, tags, type);
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
    sb.append("class ModelFile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    linkedTo: ").append(toIndentedString(linkedTo)).append("\n");
    sb.append("    linkedType: ").append(toIndentedString(linkedType)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("application_id");
    openapiFields.add("display_name");
    openapiFields.add("extension");
    openapiFields.add("identity_id");
    openapiFields.add("linked_to");
    openapiFields.add("linked_type");
    openapiFields.add("platform_id");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelFile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModelFile.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelFile is not found in the empty JSON string", ModelFile.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelFile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("application_id") != null && !jsonObj.get("application_id").isJsonNull()  && !jsonObj.get("application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()  && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()  && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("identity_id") != null && !jsonObj.get("identity_id").isJsonNull()  && !jsonObj.get("identity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("linked_to") != null && !jsonObj.get("linked_to").isJsonNull()  && !jsonObj.get("linked_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_to").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("linked_type") != null && !jsonObj.get("linked_type").isJsonNull()  && !jsonObj.get("linked_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("platform_id") != null && !jsonObj.get("platform_id").isJsonNull()  && !jsonObj.get("platform_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()  && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
       if (!ModelFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelFile.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelFile>() {
           @Override
           public void write(JsonWriter out, ModelFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelFile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelFile
  * @throws IOException if the JSON string is invalid with respect to ModelFile
  */
  public static ModelFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelFile.class);
  }

 /**
  * Convert an instance of ModelFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

