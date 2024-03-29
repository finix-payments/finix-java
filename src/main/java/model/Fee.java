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
import model.Currency;
import model.FeeLinks;
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
 * An out of flow &#x60;fee&#x60; that is added to a &#x60;settlement&#x60;.
 */
@ApiModel(description = "An out of flow `fee` that is added to a `settlement`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Fee {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * Subtype of the &#x60;fee&#x60;.
   */
  @JsonAdapter(FeeSubtypeEnum.Adapter.class)
  public enum FeeSubtypeEnum {
    CUSTOM("CUSTOM"),
    
    APPLICATION_FEE("APPLICATION_FEE"),
    
    PLATFORM_FEE("PLATFORM_FEE"),
    
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
   * The type of &#x60;fee&#x60;.
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
  public enum FeeTypeEnum {
    APPLICATION_FEE("APPLICATION_FEE"),
    
    ACH_BASIS_POINTS("ACH_BASIS_POINTS"),
    
    ACH_FIXED("ACH_FIXED"),
    
    CARD_BASIS_POINTS("CARD_BASIS_POINTS"),
    
    CARD_FIXED("CARD_FIXED"),
    
    CARD_INTERCHANGE("CARD_INTERCHANGE"),
    
    VISA_BASIS_POINTS("VISA_BASIS_POINTS"),
    
    VISA_FIXED("VISA_FIXED"),
    
    VISA_INTERCHANGE("VISA_INTERCHANGE"),
    
    VISA_ASSESSMENT_BASIS_POINTS("VISA_ASSESSMENT_BASIS_POINTS"),
    
    VISA_ACQUIRER_PROCESSING_FIXED("VISA_ACQUIRER_PROCESSING_FIXED"),
    
    VISA_CREDIT_VOUCHER_FIXED("VISA_CREDIT_VOUCHER_FIXED"),
    
    VISA_BASE_II_SYSTEM_FILE_TRANSMISSION_FIXED("VISA_BASE_II_SYSTEM_FILE_TRANSMISSION_FIXED"),
    
    VISA_BASE_II_CREDIT_VOUCHER_FIXED("VISA_BASE_II_CREDIT_VOUCHER_FIXED"),
    
    VISA_KILOBYTE_ACCESS_FIXED("VISA_KILOBYTE_ACCESS_FIXED"),
    
    DISCOVER_BASIS_POINTS("DISCOVER_BASIS_POINTS"),
    
    DISCOVER_FIXED("DISCOVER_FIXED"),
    
    DISCOVER_INTERCHANGE("DISCOVER_INTERCHANGE"),
    
    DISCOVER_ASSESSMENT_BASIS_POINTS("DISCOVER_ASSESSMENT_BASIS_POINTS"),
    
    DISCOVER_DATA_USAGE_FIXED("DISCOVER_DATA_USAGE_FIXED"),
    
    DISCOVER_NETWORK_AUTHORIZATION_FIXED("DISCOVER_NETWORK_AUTHORIZATION_FIXED"),
    
    DINERS_CLUB_BASIS_POINTS("DINERS_CLUB_BASIS_POINTS"),
    
    DINERS_CLUB_FIXED("DINERS_CLUB_FIXED"),
    
    DINERS_CLUB_INTERCHANGE("DINERS_CLUB_INTERCHANGE"),
    
    MASTERCARD_BASIS_POINTS("MASTERCARD_BASIS_POINTS"),
    
    MASTERCARD_FIXED("MASTERCARD_FIXED"),
    
    MASTERCARD_INTERCHANGE("MASTERCARD_INTERCHANGE"),
    
    MASTERCARD_ASSESSMENT_UNDER_1K_BASIS_POINTS("MASTERCARD_ASSESSMENT_UNDER_1K_BASIS_POINTS"),
    
    MASTERCARD_ASSESSMENT_OVER_1K_BASIS_POINTS("MASTERCARD_ASSESSMENT_OVER_1K_BASIS_POINTS"),
    
    MASTERCARD_ACQUIRER_FEE_BASIS_POINTS("MASTERCARD_ACQUIRER_FEE_BASIS_POINTS"),
    
    JCB_BASIS_POINTS("JCB_BASIS_POINTS"),
    
    JCB_FIXED("JCB_FIXED"),
    
    JCB_INTERCHANGE("JCB_INTERCHANGE"),
    
    AMERICAN_EXPRESS_BASIS_POINTS("AMERICAN_EXPRESS_BASIS_POINTS"),
    
    AMERICAN_EXPRESS_FIXED("AMERICAN_EXPRESS_FIXED"),
    
    AMERICAN_EXPRESS_INTERCHANGE("AMERICAN_EXPRESS_INTERCHANGE"),
    
    AMERICAN_EXPRESS_ASSESSMENT_BASIS_POINTS("AMERICAN_EXPRESS_ASSESSMENT_BASIS_POINTS"),
    
    DISPUTE_INQUIRY_FIXED_FEE("DISPUTE_INQUIRY_FIXED_FEE"),
    
    DISPUTE_FIXED_FEE("DISPUTE_FIXED_FEE"),
    
    QUALIFIED_TIER_BASIS_POINTS_FEE("QUALIFIED_TIER_BASIS_POINTS_FEE"),
    
    QUALIFIED_TIER_FIXED_FEE("QUALIFIED_TIER_FIXED_FEE"),
    
    CUSTOM("CUSTOM"),
    
    ACH_DEBIT_RETURN_FIXED_FEE("ACH_DEBIT_RETURN_FIXED_FEE"),
    
    ACH_CREDIT_RETURN_FIXED_FEE("ACH_CREDIT_RETURN_FIXED_FEE"),
    
    ANCILLARY_FIXED_FEE_PRIMARY("ANCILLARY_FIXED_FEE_PRIMARY"),
    
    ANCILLARY_FIXED_FEE_SECONDARY("ANCILLARY_FIXED_FEE_SECONDARY"),
    
    SETTLEMENT_V2_TRANSFER("SETTLEMENT_V2_TRANSFER"),
    
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
   * The type of entity the &#x60;fee&#x60; is linked to (**null** by default).
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

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private FeeLinks links;

  public Fee() { 
  }

  public Fee id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;fee&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FExxxxxxxxxxxxxxxxxx", value = "The ID of the `fee` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Fee createdAt(OffsetDateTime createdAt) {
    
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


  public Fee updatedAt(OffsetDateTime updatedAt) {
    
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


  public Fee amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the fee in cents.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the fee in cents.")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public Fee currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public Fee displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the &#x60;fee&#x60; object that was include in &#x60;display_name&#x60; when creating the fee.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the `fee` object that was include in `display_name` when creating the fee.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Fee feeSubtype(FeeSubtypeEnum feeSubtype) {
    
    this.feeSubtype = feeSubtype;
    return this;
  }

   /**
   * Subtype of the &#x60;fee&#x60;.
   * @return feeSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subtype of the `fee`.")

  public FeeSubtypeEnum getFeeSubtype() {
    return feeSubtype;
  }


  public void setFeeSubtype(FeeSubtypeEnum feeSubtype) {
    this.feeSubtype = feeSubtype;
  }


  public Fee feeType(FeeTypeEnum feeType) {
    
    this.feeType = feeType;
    return this;
  }

   /**
   * The type of &#x60;fee&#x60;.
   * @return feeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of `fee`.")

  public FeeTypeEnum getFeeType() {
    return feeType;
  }


  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }


  public Fee label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The name of the &#x60;fee&#x60; object that was include in &#x60;label&#x60; when creating the fee.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the `fee` object that was include in `label` when creating the fee.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public Fee linkedId(String linkedId) {
    
    this.linkedId = linkedId;
    return this;
  }

   /**
   * ID of the linked resource.
   * @return linkedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the linked resource.")

  public String getLinkedId() {
    return linkedId;
  }


  public void setLinkedId(String linkedId) {
    this.linkedId = linkedId;
  }


  public Fee linkedType(LinkedTypeEnum linkedType) {
    
    this.linkedType = linkedType;
    return this;
  }

   /**
   * The type of entity the &#x60;fee&#x60; is linked to (**null** by default).
   * @return linkedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of entity the `fee` is linked to (**null** by default).")

  public LinkedTypeEnum getLinkedType() {
    return linkedType;
  }


  public void setLinkedType(LinkedTypeEnum linkedType) {
    this.linkedType = linkedType;
  }


  public Fee merchant(String merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * The &#x60;Merchant&#x60; ID that the fee is being debited from.
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `Merchant` ID that the fee is being debited from.")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public Fee tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Fee putTagsItem(String key, String tagsItem) {
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


  public Fee links(FeeLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeeLinks getLinks() {
    return links;
  }


  public void setLinks(FeeLinks links) {
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
    Fee fee = (Fee) o;
    return Objects.equals(this.id, fee.id) &&
        Objects.equals(this.createdAt, fee.createdAt) &&
        Objects.equals(this.updatedAt, fee.updatedAt) &&
        Objects.equals(this.amount, fee.amount) &&
        Objects.equals(this.currency, fee.currency) &&
        Objects.equals(this.displayName, fee.displayName) &&
        Objects.equals(this.feeSubtype, fee.feeSubtype) &&
        Objects.equals(this.feeType, fee.feeType) &&
        Objects.equals(this.label, fee.label) &&
        Objects.equals(this.linkedId, fee.linkedId) &&
        Objects.equals(this.linkedType, fee.linkedType) &&
        Objects.equals(this.merchant, fee.merchant) &&
        Objects.equals(this.tags, fee.tags) &&
        Objects.equals(this.links, fee.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, amount, currency, displayName, feeSubtype, feeType, label, linkedId, linkedType, merchant, tags, links);
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
    sb.append("class Fee {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    feeSubtype: ").append(toIndentedString(feeSubtype)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    linkedId: ").append(toIndentedString(linkedId)).append("\n");
    sb.append("    linkedType: ").append(toIndentedString(linkedType)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("display_name");
    openapiFields.add("fee_subtype");
    openapiFields.add("fee_type");
    openapiFields.add("label");
    openapiFields.add("linked_id");
    openapiFields.add("linked_type");
    openapiFields.add("merchant");
    openapiFields.add("tags");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Fee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Fee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Fee is not found in the empty JSON string", Fee.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Fee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Fee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()  && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
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
      if (jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()  && !jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //FeeLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Fee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Fee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Fee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Fee.class));

       return (TypeAdapter<T>) new TypeAdapter<Fee>() {
           @Override
           public void write(JsonWriter out, Fee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Fee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Fee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Fee
  * @throws IOException if the JSON string is invalid with respect to Fee
  */
  public static Fee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Fee.class);
  }

 /**
  * Convert an instance of Fee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

