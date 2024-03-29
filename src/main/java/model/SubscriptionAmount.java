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
import model.SubscriptionAmountFeeAmountData;
import model.SubscriptionAmountLinks;

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
public class SubscriptionAmount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * &#x60;Subscription Amount&#x60; type. The only type supported as of now is **FEE**.
   */
  @JsonAdapter(AmountTypeEnum.Adapter.class)
  public enum AmountTypeEnum {
    FEE("FEE"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    AmountTypeEnum(String value) {
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

    public static AmountTypeEnum fromValue(String value) {
        for (AmountTypeEnum b : AmountTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        AmountTypeEnum unknownDefault = AmountTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<AmountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AmountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AmountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AmountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AMOUNT_TYPE = "amount_type";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TYPE)
  private AmountTypeEnum amountType;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_FEE_AMOUNT_DATA = "fee_amount_data";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT_DATA)
  private SubscriptionAmountFeeAmountData feeAmountData;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_SCHEDULE = "subscription_schedule";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SCHEDULE)
  private String subscriptionSchedule;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SubscriptionAmountLinks links;

  public SubscriptionAmount() { 
  }

  public SubscriptionAmount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the &#x60;Subscription Amount&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Subscription Amount`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SubscriptionAmount createdAt(OffsetDateTime createdAt) {
    
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


  public SubscriptionAmount updatedAt(OffsetDateTime updatedAt) {
    
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


  public SubscriptionAmount amountType(AmountTypeEnum amountType) {
    
    this.amountType = amountType;
    return this;
  }

   /**
   * &#x60;Subscription Amount&#x60; type. The only type supported as of now is **FEE**.
   * @return amountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FEE", value = "`Subscription Amount` type. The only type supported as of now is **FEE**.")

  public AmountTypeEnum getAmountType() {
    return amountType;
  }


  public void setAmountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
  }


  public SubscriptionAmount createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The ID of the &#x60;User&#x60; that created the &#x60;Subscription Amount&#x60;.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `User` that created the `Subscription Amount`.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public SubscriptionAmount feeAmountData(SubscriptionAmountFeeAmountData feeAmountData) {
    
    this.feeAmountData = feeAmountData;
    return this;
  }

   /**
   * Get feeAmountData
   * @return feeAmountData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionAmountFeeAmountData getFeeAmountData() {
    return feeAmountData;
  }


  public void setFeeAmountData(SubscriptionAmountFeeAmountData feeAmountData) {
    this.feeAmountData = feeAmountData;
  }


  public SubscriptionAmount nickname(String nickname) {
    
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


  public SubscriptionAmount subscriptionSchedule(String subscriptionSchedule) {
    
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


  public SubscriptionAmount tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SubscriptionAmount putTagsItem(String key, String tagsItem) {
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


  public SubscriptionAmount links(SubscriptionAmountLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionAmountLinks getLinks() {
    return links;
  }


  public void setLinks(SubscriptionAmountLinks links) {
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
    SubscriptionAmount subscriptionAmount = (SubscriptionAmount) o;
    return Objects.equals(this.id, subscriptionAmount.id) &&
        Objects.equals(this.createdAt, subscriptionAmount.createdAt) &&
        Objects.equals(this.updatedAt, subscriptionAmount.updatedAt) &&
        Objects.equals(this.amountType, subscriptionAmount.amountType) &&
        Objects.equals(this.createdBy, subscriptionAmount.createdBy) &&
        Objects.equals(this.feeAmountData, subscriptionAmount.feeAmountData) &&
        Objects.equals(this.nickname, subscriptionAmount.nickname) &&
        Objects.equals(this.subscriptionSchedule, subscriptionAmount.subscriptionSchedule) &&
        Objects.equals(this.tags, subscriptionAmount.tags) &&
        Objects.equals(this.links, subscriptionAmount.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, amountType, createdBy, feeAmountData, nickname, subscriptionSchedule, tags, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAmount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    feeAmountData: ").append(toIndentedString(feeAmountData)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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
    openapiFields.add("amount_type");
    openapiFields.add("created_by");
    openapiFields.add("fee_amount_data");
    openapiFields.add("nickname");
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
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionAmount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionAmount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionAmount is not found in the empty JSON string", SubscriptionAmount.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionAmount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionAmount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("amount_type") != null && !jsonObj.get("amount_type").isJsonNull()  && !jsonObj.get("amount_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_type").toString()));
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
      // validate the optional field `fee_amount_data`
     // if (jsonObj.getAsJsonObject("fee_amount_data") != null) {
       //SubscriptionAmountFeeAmountData.validateJsonObject(jsonObj.getAsJsonObject("fee_amount_data"));
     // }

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
      if (jsonObj.get("subscription_schedule") != null && !jsonObj.get("subscription_schedule").isJsonNull()  && !jsonObj.get("subscription_schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_schedule").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //SubscriptionAmountLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionAmount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionAmount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionAmount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionAmount.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionAmount>() {
           @Override
           public void write(JsonWriter out, SubscriptionAmount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionAmount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionAmount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionAmount
  * @throws IOException if the JSON string is invalid with respect to SubscriptionAmount
  */
  public static SubscriptionAmount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionAmount.class);
  }

 /**
  * Convert an instance of SubscriptionAmount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

