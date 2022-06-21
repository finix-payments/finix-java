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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.RiskProfileLinks;
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
 * RiskProfile
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-21T11:54:05.123637-05:00[America/Chicago]")
public class RiskProfile {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_AVS_FAILURE_ALLOWED = "avs_failure_allowed";
  @SerializedName(SERIALIZED_NAME_AVS_FAILURE_ALLOWED)
  private Boolean avsFailureAllowed;

  public static final String SERIALIZED_NAME_CSC_FAILURE_ALLOWED = "csc_failure_allowed";
  @SerializedName(SERIALIZED_NAME_CSC_FAILURE_ALLOWED)
  private Boolean cscFailureAllowed;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private RiskProfileLinks links;

  public RiskProfile() { 
  }

  public RiskProfile tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public RiskProfile putTagsItem(String key, String tagsItem) {
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


  public RiskProfile id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RiskProfile createdAt(OffsetDateTime createdAt) {
    
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


  public RiskProfile updatedAt(OffsetDateTime updatedAt) {
    
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


  public RiskProfile application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the resource.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public RiskProfile avsFailureAllowed(Boolean avsFailureAllowed) {
    
    this.avsFailureAllowed = avsFailureAllowed;
    return this;
  }

   /**
   * Get avsFailureAllowed
   * @return avsFailureAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAvsFailureAllowed() {
    return avsFailureAllowed;
  }


  public void setAvsFailureAllowed(Boolean avsFailureAllowed) {
    this.avsFailureAllowed = avsFailureAllowed;
  }


  public RiskProfile cscFailureAllowed(Boolean cscFailureAllowed) {
    
    this.cscFailureAllowed = cscFailureAllowed;
    return this;
  }

   /**
   * Get cscFailureAllowed
   * @return cscFailureAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCscFailureAllowed() {
    return cscFailureAllowed;
  }


  public void setCscFailureAllowed(Boolean cscFailureAllowed) {
    this.cscFailureAllowed = cscFailureAllowed;
  }


  public RiskProfile links(RiskProfileLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskProfileLinks getLinks() {
    return links;
  }


  public void setLinks(RiskProfileLinks links) {
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
    RiskProfile riskProfile = (RiskProfile) o;
    return Objects.equals(this.tags, riskProfile.tags) &&
        Objects.equals(this.id, riskProfile.id) &&
        Objects.equals(this.createdAt, riskProfile.createdAt) &&
        Objects.equals(this.updatedAt, riskProfile.updatedAt) &&
        Objects.equals(this.application, riskProfile.application) &&
        Objects.equals(this.avsFailureAllowed, riskProfile.avsFailureAllowed) &&
        Objects.equals(this.cscFailureAllowed, riskProfile.cscFailureAllowed) &&
        Objects.equals(this.links, riskProfile.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, id, createdAt, updatedAt, application, avsFailureAllowed, cscFailureAllowed, links);
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
    sb.append("class RiskProfile {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    avsFailureAllowed: ").append(toIndentedString(avsFailureAllowed)).append("\n");
    sb.append("    cscFailureAllowed: ").append(toIndentedString(cscFailureAllowed)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("application");
    openapiFields.add("avs_failure_allowed");
    openapiFields.add("csc_failure_allowed");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RiskProfile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RiskProfile.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RiskProfile is not found in the empty JSON string", RiskProfile.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RiskProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RiskProfile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()  && !jsonObj.get("application").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //RiskProfileLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RiskProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RiskProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RiskProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RiskProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<RiskProfile>() {
           @Override
           public void write(JsonWriter out, RiskProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RiskProfile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RiskProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RiskProfile
  * @throws IOException if the JSON string is invalid with respect to RiskProfile
  */
  public static RiskProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RiskProfile.class);
  }

 /**
  * Convert an instance of RiskProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

