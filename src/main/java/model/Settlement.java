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
import model.SettlementLinks;
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
public class Settlement {
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

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_FUNDS_FLOW = "funds_flow";
  @SerializedName(SERIALIZED_NAME_FUNDS_FLOW)
  private String fundsFlow;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_NET_AMOUNT = "net_amount";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT)
  private Long netAmount;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor;

  /**
   * The status of the &#x60;Settlement&#x60;. Available values include:&lt;ul&gt;&lt;li&gt;**PENDING**&lt;li&gt;**AWAITING_APPROVAL**&lt;li&gt;**APPROVED**.&lt;/ul&gt; Merchants only receive payouts when &#x60;Settlements&#x60; are **APPROVED** and receive the resulting funding &#x60;Transfer&#x60; . For more information, see [Payouts](/guides/payouts/payouts/).
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPROVED("APPROVED"),
    
    AWAITING_APPROVAL("AWAITING_APPROVAL"),
    
    CANCELLED("CANCELLED"),
    
    PENDING("PENDING"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    StatusEnum(String value) {
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

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        StatusEnum unknownDefault = StatusEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Long totalAmount;

  public static final String SERIALIZED_NAME_TOTAL_FEE = "total_fee";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEE)
  private Long totalFee;

  public static final String SERIALIZED_NAME_TOTAL_FEES = "total_fees";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEES)
  private Long totalFees;

  /**
   * Type of &#x60;Settlement&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MERCHANT_REVENUE("MERCHANT_REVENUE"),
    
    PLATFORM_FEE("PLATFORM_FEE"),
    
    PARTNER_FEE("PARTNER_FEE"),
    
    NOOP("NOOP"),
    
    MERCHANT("MERCHANT"),
    
    APPLICATION("APPLICATION"),
    
    PLATFORM("PLATFORM"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
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

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        TypeEnum unknownDefault = TypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SettlementLinks links;

  public Settlement() { 
  }

  public Settlement id(String id) {
    
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


  public Settlement createdAt(OffsetDateTime createdAt) {
    
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


  public Settlement updatedAt(OffsetDateTime updatedAt) {
    
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


  public Settlement application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the &#x60;Application&#x60; resource the &#x60;Settlement&#x60; was created under.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Application` resource the `Settlement` was created under.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public Settlement currency(Currency currency) {
    
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


  public Settlement destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * ID of the &#x60;Payment Instrument&#x60; where funds will be sent.
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PIxxxxxxxxxxxxxxxxxx", value = "ID of the `Payment Instrument` where funds will be sent.")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public Settlement fundsFlow(String fundsFlow) {
    
    this.fundsFlow = fundsFlow;
    return this;
  }

   /**
   * Details how funds will be dispersed in the &#x60;Funding Transfer&#x60; (usually **null**).
   * @return fundsFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details how funds will be dispersed in the `Funding Transfer` (usually **null**).")

  public String getFundsFlow() {
    return fundsFlow;
  }


  public void setFundsFlow(String fundsFlow) {
    this.fundsFlow = fundsFlow;
  }


  public Settlement identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * The ID of the resource.
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public Settlement merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The ID of the resource.
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public Settlement netAmount(Long netAmount) {
    
    this.netAmount = netAmount;
    return this;
  }

   /**
   * The amount in cents that will be deposited into the merchant&#39;s bank account.
   * @return netAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount in cents that will be deposited into the merchant's bank account.")

  public Long getNetAmount() {
    return netAmount;
  }


  public void setNetAmount(Long netAmount) {
    this.netAmount = netAmount;
  }


  public Settlement paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The type of &#x60;Payment Instrument&#x60; used in the &#x60;Funding Transfer&#x60; (or the original payment).
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of `Payment Instrument` used in the `Funding Transfer` (or the original payment).")

  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  public Settlement processor(String processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * Name of the &#x60;Settlement&#x60; processor.
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the `Settlement` processor.")

  public String getProcessor() {
    return processor;
  }


  public void setProcessor(String processor) {
    this.processor = processor;
  }


  public Settlement status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the &#x60;Settlement&#x60;. Available values include:&lt;ul&gt;&lt;li&gt;**PENDING**&lt;li&gt;**AWAITING_APPROVAL**&lt;li&gt;**APPROVED**.&lt;/ul&gt; Merchants only receive payouts when &#x60;Settlements&#x60; are **APPROVED** and receive the resulting funding &#x60;Transfer&#x60; . For more information, see [Payouts](/guides/payouts/payouts/).
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the `Settlement`. Available values include:<ul><li>**PENDING**<li>**AWAITING_APPROVAL**<li>**APPROVED**.</ul> Merchants only receive payouts when `Settlements` are **APPROVED** and receive the resulting funding `Transfer` . For more information, see [Payouts](/guides/payouts/payouts/).")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Settlement tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Settlement putTagsItem(String key, String tagsItem) {
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


  public Settlement totalAmount(Long totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount of the &#x60;Settlement&#x60; (in cents).
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of the `Settlement` (in cents).")

  public Long getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }


  public Settlement totalFee(Long totalFee) {
    
    this.totalFee = totalFee;
    return this;
  }

   /**
   * Sum of the fees in the &#x60;Settlement&#x60;.
   * @return totalFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of the fees in the `Settlement`.")

  public Long getTotalFee() {
    return totalFee;
  }


  public void setTotalFee(Long totalFee) {
    this.totalFee = totalFee;
  }


  public Settlement totalFees(Long totalFees) {
    
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Sum of the fees  (including Subcription Billing) in the &#x60;Settlement&#x60;.
   * @return totalFees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of the fees  (including Subcription Billing) in the `Settlement`.")

  public Long getTotalFees() {
    return totalFees;
  }


  public void setTotalFees(Long totalFees) {
    this.totalFees = totalFees;
  }


  public Settlement type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of &#x60;Settlement&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of `Settlement`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Settlement links(SettlementLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SettlementLinks getLinks() {
    return links;
  }


  public void setLinks(SettlementLinks links) {
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
    Settlement settlement = (Settlement) o;
    return Objects.equals(this.id, settlement.id) &&
        Objects.equals(this.createdAt, settlement.createdAt) &&
        Objects.equals(this.updatedAt, settlement.updatedAt) &&
        Objects.equals(this.application, settlement.application) &&
        Objects.equals(this.currency, settlement.currency) &&
        Objects.equals(this.destination, settlement.destination) &&
        Objects.equals(this.fundsFlow, settlement.fundsFlow) &&
        Objects.equals(this.identity, settlement.identity) &&
        Objects.equals(this.merchantId, settlement.merchantId) &&
        Objects.equals(this.netAmount, settlement.netAmount) &&
        Objects.equals(this.paymentType, settlement.paymentType) &&
        Objects.equals(this.processor, settlement.processor) &&
        Objects.equals(this.status, settlement.status) &&
        Objects.equals(this.tags, settlement.tags) &&
        Objects.equals(this.totalAmount, settlement.totalAmount) &&
        Objects.equals(this.totalFee, settlement.totalFee) &&
        Objects.equals(this.totalFees, settlement.totalFees) &&
        Objects.equals(this.type, settlement.type) &&
        Objects.equals(this.links, settlement.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, application, currency, destination, fundsFlow, identity, merchantId, netAmount, paymentType, processor, status, tags, totalAmount, totalFee, totalFees, type, links);
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
    sb.append("class Settlement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    fundsFlow: ").append(toIndentedString(fundsFlow)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("currency");
    openapiFields.add("destination");
    openapiFields.add("funds_flow");
    openapiFields.add("identity");
    openapiFields.add("merchant_id");
    openapiFields.add("net_amount");
    openapiFields.add("payment_type");
    openapiFields.add("processor");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("total_amount");
    openapiFields.add("total_fee");
    openapiFields.add("total_fees");
    openapiFields.add("type");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Settlement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Settlement.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Settlement is not found in the empty JSON string", Settlement.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Settlement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Settlement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()  && !jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("funds_flow") != null && !jsonObj.get("funds_flow").isJsonNull()  && !jsonObj.get("funds_flow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `funds_flow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("funds_flow").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()  && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonNull()  && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonNull()  && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor") != null && !jsonObj.get("processor").isJsonNull()  && !jsonObj.get("processor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor").toString()));
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
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //SettlementLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Settlement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Settlement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Settlement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Settlement.class));

       return (TypeAdapter<T>) new TypeAdapter<Settlement>() {
           @Override
           public void write(JsonWriter out, Settlement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Settlement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Settlement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Settlement
  * @throws IOException if the JSON string is invalid with respect to Settlement
  */
  public static Settlement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Settlement.class);
  }

 /**
  * Convert an instance of Settlement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

