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
import model.CreateSubscriptionScheduleRequestFixedTimeIntervalOffset;
import model.CreateSubscriptionScheduleRequestPeriodOffset;
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
public class CreateSubscriptionScheduleRequest {
  public static final String SERIALIZED_NAME_FIXED_TIME_INTERVAL_OFFSET = "fixed_time_interval_offset";
  @SerializedName(SERIALIZED_NAME_FIXED_TIME_INTERVAL_OFFSET)
  private CreateSubscriptionScheduleRequestFixedTimeIntervalOffset fixedTimeIntervalOffset;

  /**
   * Subscription Schedule type. For subscriptions, the type is **FEE**.
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
  private CreateSubscriptionScheduleRequestPeriodOffset periodOffset;

  /**
   * Specify the type of schedule: - **FIXED\\_TIME\\_INTERVAL**: Charges a Merchant on a fixed hourly interval. - **PERIODIC\\_MONTHLY**: Charges a Merchant once a month on a specific day. - **PERIODIC\\_YEARLY**: Charges a Merchant once a year on a specific day and month.
   */
  @JsonAdapter(SubscriptionTypeEnum.Adapter.class)
  public enum SubscriptionTypeEnum {
    FIXED_TIME_INTERVAL("FIXED_TIME_INTERVAL"),
    
    PERIODIC_MONTHLY("PERIODIC_MONTHLY"),
    
    PERIODIC_YEARLY("PERIODIC_YEARLY"),
    
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

  public CreateSubscriptionScheduleRequest() { 
  }

  public CreateSubscriptionScheduleRequest fixedTimeIntervalOffset(CreateSubscriptionScheduleRequestFixedTimeIntervalOffset fixedTimeIntervalOffset) {
    
    this.fixedTimeIntervalOffset = fixedTimeIntervalOffset;
    return this;
  }

   /**
   * Get fixedTimeIntervalOffset
   * @return fixedTimeIntervalOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateSubscriptionScheduleRequestFixedTimeIntervalOffset getFixedTimeIntervalOffset() {
    return fixedTimeIntervalOffset;
  }


  public void setFixedTimeIntervalOffset(CreateSubscriptionScheduleRequestFixedTimeIntervalOffset fixedTimeIntervalOffset) {
    this.fixedTimeIntervalOffset = fixedTimeIntervalOffset;
  }


  public CreateSubscriptionScheduleRequest lineItemType(LineItemTypeEnum lineItemType) {
    
    this.lineItemType = lineItemType;
    return this;
  }

   /**
   * Subscription Schedule type. For subscriptions, the type is **FEE**.
   * @return lineItemType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Subscription Schedule type. For subscriptions, the type is **FEE**.")

  public LineItemTypeEnum getLineItemType() {
    return lineItemType;
  }


  public void setLineItemType(LineItemTypeEnum lineItemType) {
    this.lineItemType = lineItemType;
  }


  public CreateSubscriptionScheduleRequest nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Human readable name.
   * @return nickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "super important thing", required = true, value = "Human readable name.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public CreateSubscriptionScheduleRequest periodOffset(CreateSubscriptionScheduleRequestPeriodOffset periodOffset) {
    
    this.periodOffset = periodOffset;
    return this;
  }

   /**
   * Get periodOffset
   * @return periodOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateSubscriptionScheduleRequestPeriodOffset getPeriodOffset() {
    return periodOffset;
  }


  public void setPeriodOffset(CreateSubscriptionScheduleRequestPeriodOffset periodOffset) {
    this.periodOffset = periodOffset;
  }


  public CreateSubscriptionScheduleRequest subscriptionType(SubscriptionTypeEnum subscriptionType) {
    
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Specify the type of schedule: - **FIXED\\_TIME\\_INTERVAL**: Charges a Merchant on a fixed hourly interval. - **PERIODIC\\_MONTHLY**: Charges a Merchant once a month on a specific day. - **PERIODIC\\_YEARLY**: Charges a Merchant once a year on a specific day and month.
   * @return subscriptionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FIXED_TIME_INTERVAL", required = true, value = "Specify the type of schedule: - **FIXED\\_TIME\\_INTERVAL**: Charges a Merchant on a fixed hourly interval. - **PERIODIC\\_MONTHLY**: Charges a Merchant once a month on a specific day. - **PERIODIC\\_YEARLY**: Charges a Merchant once a year on a specific day and month.")

  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }


  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  public CreateSubscriptionScheduleRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateSubscriptionScheduleRequest putTagsItem(String key, String tagsItem) {
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
    CreateSubscriptionScheduleRequest createSubscriptionScheduleRequest = (CreateSubscriptionScheduleRequest) o;
    return Objects.equals(this.fixedTimeIntervalOffset, createSubscriptionScheduleRequest.fixedTimeIntervalOffset) &&
        Objects.equals(this.lineItemType, createSubscriptionScheduleRequest.lineItemType) &&
        Objects.equals(this.nickname, createSubscriptionScheduleRequest.nickname) &&
        Objects.equals(this.periodOffset, createSubscriptionScheduleRequest.periodOffset) &&
        Objects.equals(this.subscriptionType, createSubscriptionScheduleRequest.subscriptionType) &&
        Objects.equals(this.tags, createSubscriptionScheduleRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedTimeIntervalOffset, lineItemType, nickname, periodOffset, subscriptionType, tags);
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
    sb.append("class CreateSubscriptionScheduleRequest {\n");
    sb.append("    fixedTimeIntervalOffset: ").append(toIndentedString(fixedTimeIntervalOffset)).append("\n");
    sb.append("    lineItemType: ").append(toIndentedString(lineItemType)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    periodOffset: ").append(toIndentedString(periodOffset)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
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
    openapiFields.add("fixed_time_interval_offset");
    openapiFields.add("line_item_type");
    openapiFields.add("nickname");
    openapiFields.add("period_offset");
    openapiFields.add("subscription_type");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("line_item_type");
    openapiRequiredFields.add("nickname");
    openapiRequiredFields.add("subscription_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSubscriptionScheduleRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateSubscriptionScheduleRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubscriptionScheduleRequest is not found in the empty JSON string", CreateSubscriptionScheduleRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSubscriptionScheduleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSubscriptionScheduleRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateSubscriptionScheduleRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `fixed_time_interval_offset`
     // if (jsonObj.getAsJsonObject("fixed_time_interval_offset") != null) {
       //CreateSubscriptionScheduleRequestFixedTimeIntervalOffset.validateJsonObject(jsonObj.getAsJsonObject("fixed_time_interval_offset"));
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
       //CreateSubscriptionScheduleRequestPeriodOffset.validateJsonObject(jsonObj.getAsJsonObject("period_offset"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("subscription_type") != null && !jsonObj.get("subscription_type").isJsonNull()  && !jsonObj.get("subscription_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_type").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionScheduleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionScheduleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionScheduleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionScheduleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionScheduleRequest>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionScheduleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionScheduleRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionScheduleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionScheduleRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionScheduleRequest
  */
  public static CreateSubscriptionScheduleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionScheduleRequest.class);
  }

 /**
  * Convert an instance of CreateSubscriptionScheduleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

