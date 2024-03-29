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
import model.SubscriptionScheduleFixedTimeIntervalOffset;
import model.SubscriptionScheduleLinks;
import model.SubscriptionSchedulePeriodOffset;
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
public class SubscriptionSchedule {
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

  public static final String SERIALIZED_NAME_FIXED_TIME_INTERVAL_OFFSET = "fixed_time_interval_offset";
  @SerializedName(SERIALIZED_NAME_FIXED_TIME_INTERVAL_OFFSET)
  private SubscriptionScheduleFixedTimeIntervalOffset fixedTimeIntervalOffset;

  /**
   * &#x60;Subscription Schedule&#x60; type. For subscriptions, the type is **FEE**.
   */
  @JsonAdapter(LineItemTypeEnum.Adapter.class)
  public enum LineItemTypeEnum {
    FEE("FEE"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    LineItemTypeEnum(String value) {
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

    public static LineItemTypeEnum fromValue(String value) {
        for (LineItemTypeEnum b : LineItemTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        LineItemTypeEnum unknownDefault = LineItemTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<LineItemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LineItemTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LineItemTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LineItemTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LINE_ITEM_TYPE = "line_item_type";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM_TYPE)
  private LineItemTypeEnum lineItemType;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_PERIOD_OFFSET = "period_offset";
  @SerializedName(SERIALIZED_NAME_PERIOD_OFFSET)
  private SubscriptionSchedulePeriodOffset periodOffset;

  /**
   * &#x60;Subscription Schedule&#x60; type.
   */
  @JsonAdapter(SubscriptionTypeEnum.Adapter.class)
  public enum SubscriptionTypeEnum {
    PERIODIC_MONTHLY("PERIODIC_MONTHLY"),
    
    PERIODIC_YEARLY("PERIODIC_YEARLY"),
    
    FIXED_TIME_INTERVAL("FIXED_TIME_INTERVAL"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    SubscriptionTypeEnum(String value) {
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

    public static SubscriptionTypeEnum fromValue(String value) {
        for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        SubscriptionTypeEnum unknownDefault = SubscriptionTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<SubscriptionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriptionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIPTION_TYPE = "subscription_type";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_TYPE)
  private SubscriptionTypeEnum subscriptionType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SubscriptionScheduleLinks links;

  public SubscriptionSchedule() { 
  }

  public SubscriptionSchedule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the &#x60;Subscription Schedule&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUBSCHEDULE_uxsUJrgbQZEXsWm9toq6gZ", value = "ID of the `Subscription Schedule`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SubscriptionSchedule createdAt(OffsetDateTime createdAt) {
    
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


  public SubscriptionSchedule updatedAt(OffsetDateTime updatedAt) {
    
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


  public SubscriptionSchedule createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * &#x60;User&#x60; ID who created the schedule.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`User` ID who created the schedule.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public SubscriptionSchedule fixedTimeIntervalOffset(SubscriptionScheduleFixedTimeIntervalOffset fixedTimeIntervalOffset) {
    
    this.fixedTimeIntervalOffset = fixedTimeIntervalOffset;
    return this;
  }

   /**
   * Get fixedTimeIntervalOffset
   * @return fixedTimeIntervalOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionScheduleFixedTimeIntervalOffset getFixedTimeIntervalOffset() {
    return fixedTimeIntervalOffset;
  }


  public void setFixedTimeIntervalOffset(SubscriptionScheduleFixedTimeIntervalOffset fixedTimeIntervalOffset) {
    this.fixedTimeIntervalOffset = fixedTimeIntervalOffset;
  }


  public SubscriptionSchedule lineItemType(LineItemTypeEnum lineItemType) {
    
    this.lineItemType = lineItemType;
    return this;
  }

   /**
   * &#x60;Subscription Schedule&#x60; type. For subscriptions, the type is **FEE**.
   * @return lineItemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Subscription Schedule` type. For subscriptions, the type is **FEE**.")

  public LineItemTypeEnum getLineItemType() {
    return lineItemType;
  }


  public void setLineItemType(LineItemTypeEnum lineItemType) {
    this.lineItemType = lineItemType;
  }


  public SubscriptionSchedule nickname(String nickname) {
    
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


  public SubscriptionSchedule periodOffset(SubscriptionSchedulePeriodOffset periodOffset) {
    
    this.periodOffset = periodOffset;
    return this;
  }

   /**
   * Get periodOffset
   * @return periodOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionSchedulePeriodOffset getPeriodOffset() {
    return periodOffset;
  }


  public void setPeriodOffset(SubscriptionSchedulePeriodOffset periodOffset) {
    this.periodOffset = periodOffset;
  }


  public SubscriptionSchedule subscriptionType(SubscriptionTypeEnum subscriptionType) {
    
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * &#x60;Subscription Schedule&#x60; type.
   * @return subscriptionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Subscription Schedule` type.")

  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }


  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  public SubscriptionSchedule tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SubscriptionSchedule putTagsItem(String key, String tagsItem) {
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


  public SubscriptionSchedule links(SubscriptionScheduleLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionScheduleLinks getLinks() {
    return links;
  }


  public void setLinks(SubscriptionScheduleLinks links) {
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
    SubscriptionSchedule subscriptionSchedule = (SubscriptionSchedule) o;
    return Objects.equals(this.id, subscriptionSchedule.id) &&
        Objects.equals(this.createdAt, subscriptionSchedule.createdAt) &&
        Objects.equals(this.updatedAt, subscriptionSchedule.updatedAt) &&
        Objects.equals(this.createdBy, subscriptionSchedule.createdBy) &&
        Objects.equals(this.fixedTimeIntervalOffset, subscriptionSchedule.fixedTimeIntervalOffset) &&
        Objects.equals(this.lineItemType, subscriptionSchedule.lineItemType) &&
        Objects.equals(this.nickname, subscriptionSchedule.nickname) &&
        Objects.equals(this.periodOffset, subscriptionSchedule.periodOffset) &&
        Objects.equals(this.subscriptionType, subscriptionSchedule.subscriptionType) &&
        Objects.equals(this.tags, subscriptionSchedule.tags) &&
        Objects.equals(this.links, subscriptionSchedule.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, createdBy, fixedTimeIntervalOffset, lineItemType, nickname, periodOffset, subscriptionType, tags, links);
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
    sb.append("class SubscriptionSchedule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    fixedTimeIntervalOffset: ").append(toIndentedString(fixedTimeIntervalOffset)).append("\n");
    sb.append("    lineItemType: ").append(toIndentedString(lineItemType)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    periodOffset: ").append(toIndentedString(periodOffset)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
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
    openapiFields.add("fixed_time_interval_offset");
    openapiFields.add("line_item_type");
    openapiFields.add("nickname");
    openapiFields.add("period_offset");
    openapiFields.add("subscription_type");
    openapiFields.add("tags");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionSchedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionSchedule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionSchedule is not found in the empty JSON string", SubscriptionSchedule.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionSchedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionSchedule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `fixed_time_interval_offset`
     // if (jsonObj.getAsJsonObject("fixed_time_interval_offset") != null) {
       //SubscriptionScheduleFixedTimeIntervalOffset.validateJsonObject(jsonObj.getAsJsonObject("fixed_time_interval_offset"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("line_item_type") != null && !jsonObj.get("line_item_type").isJsonNull()  && !jsonObj.get("line_item_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_item_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_item_type").toString()));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `period_offset`
     // if (jsonObj.getAsJsonObject("period_offset") != null) {
       //SubscriptionSchedulePeriodOffset.validateJsonObject(jsonObj.getAsJsonObject("period_offset"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("subscription_type") != null && !jsonObj.get("subscription_type").isJsonNull()  && !jsonObj.get("subscription_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_type").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //SubscriptionScheduleLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionSchedule>() {
           @Override
           public void write(JsonWriter out, SubscriptionSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionSchedule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionSchedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionSchedule
  * @throws IOException if the JSON string is invalid with respect to SubscriptionSchedule
  */
  public static SubscriptionSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionSchedule.class);
  }

 /**
  * Convert an instance of SubscriptionSchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

