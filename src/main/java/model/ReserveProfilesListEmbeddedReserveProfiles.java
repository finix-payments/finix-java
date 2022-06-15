/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2018-01-01
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
import model.ReserveProfilesListEmbeddedLinks;
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
 * ReserveProfilesListEmbeddedReserveProfiles
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-14T15:32:10.087418-05:00[America/Chicago]")
public class ReserveProfilesListEmbeddedReserveProfiles {
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

  public static final String SERIALIZED_NAME_RESERVE_DAYS = "reserve_days";
  @SerializedName(SERIALIZED_NAME_RESERVE_DAYS)
  private Integer reserveDays;

  public static final String SERIALIZED_NAME_RESERVE_PERCENTAGE = "reserve_percentage";
  @SerializedName(SERIALIZED_NAME_RESERVE_PERCENTAGE)
  private Integer reservePercentage;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ReserveProfilesListEmbeddedLinks links;

  public ReserveProfilesListEmbeddedReserveProfiles() { 
  }

  public ReserveProfilesListEmbeddedReserveProfiles tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ReserveProfilesListEmbeddedReserveProfiles putTagsItem(String key, String tagsItem) {
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


  public ReserveProfilesListEmbeddedReserveProfiles id(String id) {
    
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


  public ReserveProfilesListEmbeddedReserveProfiles createdAt(OffsetDateTime createdAt) {
    
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


  public ReserveProfilesListEmbeddedReserveProfiles updatedAt(OffsetDateTime updatedAt) {
    
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


  public ReserveProfilesListEmbeddedReserveProfiles application(String application) {
    
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


  public ReserveProfilesListEmbeddedReserveProfiles reserveDays(Integer reserveDays) {
    
    this.reserveDays = reserveDays;
    return this;
  }

   /**
   * Get reserveDays
   * @return reserveDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReserveDays() {
    return reserveDays;
  }


  public void setReserveDays(Integer reserveDays) {
    this.reserveDays = reserveDays;
  }


  public ReserveProfilesListEmbeddedReserveProfiles reservePercentage(Integer reservePercentage) {
    
    this.reservePercentage = reservePercentage;
    return this;
  }

   /**
   * Get reservePercentage
   * @return reservePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReservePercentage() {
    return reservePercentage;
  }


  public void setReservePercentage(Integer reservePercentage) {
    this.reservePercentage = reservePercentage;
  }


  public ReserveProfilesListEmbeddedReserveProfiles links(ReserveProfilesListEmbeddedLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReserveProfilesListEmbeddedLinks getLinks() {
    return links;
  }


  public void setLinks(ReserveProfilesListEmbeddedLinks links) {
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
    ReserveProfilesListEmbeddedReserveProfiles reserveProfilesListEmbeddedReserveProfiles = (ReserveProfilesListEmbeddedReserveProfiles) o;
    return Objects.equals(this.tags, reserveProfilesListEmbeddedReserveProfiles.tags) &&
        Objects.equals(this.id, reserveProfilesListEmbeddedReserveProfiles.id) &&
        Objects.equals(this.createdAt, reserveProfilesListEmbeddedReserveProfiles.createdAt) &&
        Objects.equals(this.updatedAt, reserveProfilesListEmbeddedReserveProfiles.updatedAt) &&
        Objects.equals(this.application, reserveProfilesListEmbeddedReserveProfiles.application) &&
        Objects.equals(this.reserveDays, reserveProfilesListEmbeddedReserveProfiles.reserveDays) &&
        Objects.equals(this.reservePercentage, reserveProfilesListEmbeddedReserveProfiles.reservePercentage) &&
        Objects.equals(this.links, reserveProfilesListEmbeddedReserveProfiles.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, id, createdAt, updatedAt, application, reserveDays, reservePercentage, links);
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
    sb.append("class ReserveProfilesListEmbeddedReserveProfiles {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    reserveDays: ").append(toIndentedString(reserveDays)).append("\n");
    sb.append("    reservePercentage: ").append(toIndentedString(reservePercentage)).append("\n");
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
    openapiFields.add("reserve_days");
    openapiFields.add("reserve_percentage");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReserveProfilesListEmbeddedReserveProfiles
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReserveProfilesListEmbeddedReserveProfiles.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReserveProfilesListEmbeddedReserveProfiles is not found in the empty JSON string", ReserveProfilesListEmbeddedReserveProfiles.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReserveProfilesListEmbeddedReserveProfiles.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReserveProfilesListEmbeddedReserveProfiles` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()  && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()  && !jsonObj.get("application").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application").toString()));
      }
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //ReserveProfilesListEmbeddedLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReserveProfilesListEmbeddedReserveProfiles.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReserveProfilesListEmbeddedReserveProfiles' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReserveProfilesListEmbeddedReserveProfiles> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReserveProfilesListEmbeddedReserveProfiles.class));

       return (TypeAdapter<T>) new TypeAdapter<ReserveProfilesListEmbeddedReserveProfiles>() {
           @Override
           public void write(JsonWriter out, ReserveProfilesListEmbeddedReserveProfiles value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReserveProfilesListEmbeddedReserveProfiles read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReserveProfilesListEmbeddedReserveProfiles given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReserveProfilesListEmbeddedReserveProfiles
  * @throws IOException if the JSON string is invalid with respect to ReserveProfilesListEmbeddedReserveProfiles
  */
  public static ReserveProfilesListEmbeddedReserveProfiles fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReserveProfilesListEmbeddedReserveProfiles.class);
  }

 /**
  * Convert an instance of ReserveProfilesListEmbeddedReserveProfiles to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

