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
import model.Currency;
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
 * CreateFeeRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateFeeRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  /**
   * Subtype of the fee. Set to **CUSTOM**.
   */
  @JsonAdapter(FeeSubtypeEnum.Adapter.class)
  public enum FeeSubtypeEnum {
    CUSTOM("CUSTOM"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    FeeSubtypeEnum(String value) {
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

    public static FeeSubtypeEnum fromValue(String value) {
        for (FeeSubtypeEnum b : FeeSubtypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        FeeSubtypeEnum unknownDefault = FeeSubtypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<FeeSubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeSubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeSubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeSubtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_SUBTYPE = "fee_subtype";
  @SerializedName(SERIALIZED_NAME_FEE_SUBTYPE)
  private FeeSubtypeEnum feeSubtype;

  /**
   * The type of the fee. Must be set to **CUSTOM**.
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
  public enum FeeTypeEnum {
    CUSTOM("CUSTOM"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    FeeTypeEnum(String value) {
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

    public static FeeTypeEnum fromValue(String value) {
        for (FeeTypeEnum b : FeeTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        FeeTypeEnum unknownDefault = FeeTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<FeeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_TYPE = "fee_type";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private FeeTypeEnum feeType;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_LINKED_ID = "linked_id";
  @SerializedName(SERIALIZED_NAME_LINKED_ID)
  private String linkedId;

  /**
   * The type of entity the fee is linked to (**null** by default).
   */
  @JsonAdapter(LinkedTypeEnum.Adapter.class)
  public enum LinkedTypeEnum {
    APPLICATION("APPLICATION"),
    
    PLATFORM("PLATFORM"),
    
    SUBSCRIPTION("SUBSCRIPTION"),
    
    TRANSFER("TRANSFER"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    LinkedTypeEnum(String value) {
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

    public static LinkedTypeEnum fromValue(String value) {
        for (LinkedTypeEnum b : LinkedTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        LinkedTypeEnum unknownDefault = LinkedTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<LinkedTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LinkedTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LinkedTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LinkedTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LINKED_TYPE = "linked_type";
  @SerializedName(SERIALIZED_NAME_LINKED_TYPE)
  private LinkedTypeEnum linkedType;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_SETTLEMENT_DELAY_DAYS = "settlement_delay_days";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DELAY_DAYS)
  private Long settlementDelayDays;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public CreateFeeRequest() { 
  }

  public CreateFeeRequest amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public CreateFeeRequest currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public CreateFeeRequest feeSubtype(FeeSubtypeEnum feeSubtype) {
    
    this.feeSubtype = feeSubtype;
    return this;
  }

   /**
   * Subtype of the fee. Set to **CUSTOM**.
   * @return feeSubtype
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Subtype of the fee. Set to **CUSTOM**.")

  public FeeSubtypeEnum getFeeSubtype() {
    return feeSubtype;
  }


  public void setFeeSubtype(FeeSubtypeEnum feeSubtype) {
    this.feeSubtype = feeSubtype;
  }


  public CreateFeeRequest feeType(FeeTypeEnum feeType) {
    
    this.feeType = feeType;
    return this;
  }

   /**
   * The type of the fee. Must be set to **CUSTOM**.
   * @return feeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the fee. Must be set to **CUSTOM**.")

  public FeeTypeEnum getFeeType() {
    return feeType;
  }


  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }


  public CreateFeeRequest label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The display name of the &#x60;Fee&#x60; that can be used for filtering purposes.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the `Fee` that can be used for filtering purposes.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public CreateFeeRequest linkedId(String linkedId) {
    
    this.linkedId = linkedId;
    return this;
  }

   /**
   * ID of the linked resource
   * @return linkedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the linked resource")

  public String getLinkedId() {
    return linkedId;
  }


  public void setLinkedId(String linkedId) {
    this.linkedId = linkedId;
  }


  public CreateFeeRequest linkedType(LinkedTypeEnum linkedType) {
    
    this.linkedType = linkedType;
    return this;
  }

   /**
   * The type of entity the fee is linked to (**null** by default).
   * @return linkedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of entity the fee is linked to (**null** by default).")

  public LinkedTypeEnum getLinkedType() {
    return linkedType;
  }


  public void setLinkedType(LinkedTypeEnum linkedType) {
    this.linkedType = linkedType;
  }


  public CreateFeeRequest merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The ID of the resource.
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the resource.")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public CreateFeeRequest settlementDelayDays(Long settlementDelayDays) {
    
    this.settlementDelayDays = settlementDelayDays;
    return this;
  }

   /**
   * Delays in days, when the fee will be submitted for settlement.
   * @return settlementDelayDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Delays in days, when the fee will be submitted for settlement.")

  public Long getSettlementDelayDays() {
    return settlementDelayDays;
  }


  public void setSettlementDelayDays(Long settlementDelayDays) {
    this.settlementDelayDays = settlementDelayDays;
  }


  public CreateFeeRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateFeeRequest putTagsItem(String key, String tagsItem) {
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
    CreateFeeRequest createFeeRequest = (CreateFeeRequest) o;
    return Objects.equals(this.amount, createFeeRequest.amount) &&
        Objects.equals(this.currency, createFeeRequest.currency) &&
        Objects.equals(this.feeSubtype, createFeeRequest.feeSubtype) &&
        Objects.equals(this.feeType, createFeeRequest.feeType) &&
        Objects.equals(this.label, createFeeRequest.label) &&
        Objects.equals(this.linkedId, createFeeRequest.linkedId) &&
        Objects.equals(this.linkedType, createFeeRequest.linkedType) &&
        Objects.equals(this.merchantId, createFeeRequest.merchantId) &&
        Objects.equals(this.settlementDelayDays, createFeeRequest.settlementDelayDays) &&
        Objects.equals(this.tags, createFeeRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, feeSubtype, feeType, label, linkedId, linkedType, merchantId, settlementDelayDays, tags);
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
    sb.append("class CreateFeeRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    feeSubtype: ").append(toIndentedString(feeSubtype)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    linkedId: ").append(toIndentedString(linkedId)).append("\n");
    sb.append("    linkedType: ").append(toIndentedString(linkedType)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    settlementDelayDays: ").append(toIndentedString(settlementDelayDays)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("fee_subtype");
    openapiFields.add("fee_type");
    openapiFields.add("label");
    openapiFields.add("linked_id");
    openapiFields.add("linked_type");
    openapiFields.add("merchant_id");
    openapiFields.add("settlement_delay_days");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("fee_subtype");
    openapiRequiredFields.add("fee_type");
    openapiRequiredFields.add("merchant_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateFeeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateFeeRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFeeRequest is not found in the empty JSON string", CreateFeeRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateFeeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFeeRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateFeeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fee_subtype") != null && !jsonObj.get("fee_subtype").isJsonNull()  && !jsonObj.get("fee_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_subtype").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fee_type") != null && !jsonObj.get("fee_type").isJsonNull()  && !jsonObj.get("fee_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()  && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("linked_id") != null && !jsonObj.get("linked_id").isJsonNull()  && !jsonObj.get("linked_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_id").toString()));
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
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonNull()  && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFeeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFeeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFeeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFeeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFeeRequest>() {
           @Override
           public void write(JsonWriter out, CreateFeeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFeeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateFeeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFeeRequest
  * @throws IOException if the JSON string is invalid with respect to CreateFeeRequest
  */
  public static CreateFeeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFeeRequest.class);
  }

 /**
  * Convert an instance of CreateFeeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

