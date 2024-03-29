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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.AdditionalBuyerCharges;
import model.CardPresentDetails;
import model.Currency;
import model.FeeType;
import model.TransferLinks;
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
public class Transfer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ADDITIONAL_BUYER_CHARGES = "additional_buyer_charges";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_BUYER_CHARGES)
  private AdditionalBuyerCharges additionalBuyerCharges;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_CARD_PRESENT_DETAILS = "card_present_details";
  @SerializedName(SERIALIZED_NAME_CARD_PRESENT_DETAILS)
  private CardPresentDetails cardPresentDetails;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_EXTERNALLY_FUNDED = "externally_funded";
  @SerializedName(SERIALIZED_NAME_EXTERNALLY_FUNDED)
  private String externallyFunded;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Long fee;

  public static final String SERIALIZED_NAME_FEE_TYPE = "fee_type";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private FeeType feeType;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_ID = "idempotency_id";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_ID)
  private String idempotencyId;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private String merchantIdentity;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<String> messages = null;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private Object raw;

  public static final String SERIALIZED_NAME_READY_TO_SETTLE_AT = "ready_to_settle_at";
  @SerializedName(SERIALIZED_NAME_READY_TO_SETTLE_AT)
  private OffsetDateTime readyToSettleAt;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  /**
   * The stauts of the &#x60;Transfer&#x60;.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    CANCELED("CANCELED"),
    
    PENDING("PENDING"),
    
    FAILED("FAILED"),
    
    SUCCEEDED("SUCCEEDED"),
    
    UNKNOWN("UNKNOWN"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    StateEnum(String value) {
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

    public static StateEnum fromValue(String value) {
        for (StateEnum b : StateEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        StateEnum unknownDefault = StateEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_STATEMENT_DESCRIPTOR = "statement_descriptor";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DESCRIPTOR)
  private String statementDescriptor;

  /**
   * Additional information describing the &#x60;payment_type&#x60;.
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    API("API"),
    
    APPLICATION_FEE("APPLICATION_FEE"),
    
    DISPUTE("DISPUTE"),
    
    MERCHANT_CREDIT("MERCHANT_CREDIT"),
    
    MERCHANT_CREDIT_ADJUSTMENT("MERCHANT_CREDIT_ADJUSTMENT"),
    
    MERCHANT_DEBIT("MERCHANT_DEBIT"),
    
    MERCHANT_DEBIT_ADJUSTMENT("MERCHANT_DEBIT_ADJUSTMENT"),
    
    PLATFORM_CREDIT("PLATFORM_CREDIT"),
    
    PLATFORM_CREDIT_ADJUSTMENT("PLATFORM_CREDIT_ADJUSTMENT"),
    
    PLATFORM_DEBIT("PLATFORM_DEBIT"),
    
    PLATFORM_DEBIT_ADJUSTMENT("PLATFORM_DEBIT_ADJUSTMENT"),
    
    PLATFORM_FEE("PLATFORM_FEE"),
    
    SETTLEMENT_MERCHANT("SETTLEMENT_MERCHANT"),
    
    SETTLEMENT_NOOP("SETTLEMENT_NOOP"),
    
    SETTLEMENT_PARTNER("SETTLEMENT_PARTNER"),
    
    SETTLEMENT_PLATFORM("SETTLEMENT_PLATFORM"),
    
    SPLIT_PAYOUT("SPLIT_PAYOUT"),
    
    SPLIT_PAYOUT_ADJUSTMENT("SPLIT_PAYOUT_ADJUSTMENT"),
    
    SYSTEM("SYSTEM"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    SubtypeEnum(String value) {
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

    public static SubtypeEnum fromValue(String value) {
        for (SubtypeEnum b : SubtypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        SubtypeEnum unknownDefault = SubtypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private SubtypeEnum subtype;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_TRACE_ID = "trace_id";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  /**
   * Type of &#x60;Transfer&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DEBIT("DEBIT"),
    
    CREDIT("CREDIT"),
    
    REVERSAL("REVERSAL"),
    
    FEE("FEE"),
    
    ADJUSTMENT("ADJUSTMENT"),
    
    DISPUTE("DISPUTE"),
    
    RESERVE("RESERVE"),
    
    SETTLEMENT("SETTLEMENT"),
    
    UNKNOWN("UNKNOWN"),
    
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
  private TransferLinks links;

  public Transfer() { 
  }

  public Transfer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;Transfer&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Transfer` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transfer createdAt(OffsetDateTime createdAt) {
    
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


  public Transfer updatedAt(OffsetDateTime updatedAt) {
    
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


  public Transfer additionalBuyerCharges(AdditionalBuyerCharges additionalBuyerCharges) {
    
    this.additionalBuyerCharges = additionalBuyerCharges;
    return this;
  }

   /**
   * Get additionalBuyerCharges
   * @return additionalBuyerCharges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdditionalBuyerCharges getAdditionalBuyerCharges() {
    return additionalBuyerCharges;
  }


  public void setAdditionalBuyerCharges(AdditionalBuyerCharges additionalBuyerCharges) {
    this.additionalBuyerCharges = additionalBuyerCharges;
  }


  public Transfer amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public Transfer application(String application) {
    
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


  public Transfer cardPresentDetails(CardPresentDetails cardPresentDetails) {
    
    this.cardPresentDetails = cardPresentDetails;
    return this;
  }

   /**
   * Get cardPresentDetails
   * @return cardPresentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardPresentDetails getCardPresentDetails() {
    return cardPresentDetails;
  }


  public void setCardPresentDetails(CardPresentDetails cardPresentDetails) {
    this.cardPresentDetails = cardPresentDetails;
  }


  public Transfer currency(Currency currency) {
    
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


  public Transfer destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * The ID of the destination.
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the destination.")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public Transfer device(String device) {
    
    this.device = device;
    return this;
  }

   /**
   * The ID of the resource.
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getDevice() {
    return device;
  }


  public void setDevice(String device) {
    this.device = device;
  }


  public Transfer externallyFunded(String externallyFunded) {
    
    this.externallyFunded = externallyFunded;
    return this;
  }

   /**
   * Details if the &#x60;Transfer&#x60; will be settled externally by card processors.
   * @return externallyFunded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Transfer` will be settled externally by card processors.")

  public String getExternallyFunded() {
    return externallyFunded;
  }


  public void setExternallyFunded(String externallyFunded) {
    this.externallyFunded = externallyFunded;
  }


  public Transfer failureCode(String failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * The code of the failure so the decline can be handled programmatically. For more info on how to handle the failure, see [Failure Codes](/docs/guides/developers/errors/#failure-codes).
   * @return failureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The code of the failure so the decline can be handled programmatically. For more info on how to handle the failure, see [Failure Codes](/docs/guides/developers/errors/#failure-codes).")

  public String getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public Transfer failureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * A human-readable description of why the transaction was declined. This will also include a suggestion on how to complete the payment.
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description of why the transaction was declined. This will also include a suggestion on how to complete the payment.")

  public String getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public Transfer fee(Long fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * The amount of the &#x60;Transfer&#x60; you&#39;d like to collect as your fee in cents. Defaults to zero (must be less than or equal to the &#x60;amount&#x60;).
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the `Transfer` you'd like to collect as your fee in cents. Defaults to zero (must be less than or equal to the `amount`).")

  public Long getFee() {
    return fee;
  }


  public void setFee(Long fee) {
    this.fee = fee;
  }


  public Transfer feeType(FeeType feeType) {
    
    this.feeType = feeType;
    return this;
  }

   /**
   * Get feeType
   * @return feeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeeType getFeeType() {
    return feeType;
  }


  public void setFeeType(FeeType feeType) {
    this.feeType = feeType;
  }


  public Transfer idempotencyId(String idempotencyId) {
    
    this.idempotencyId = idempotencyId;
    return this;
  }

   /**
   * ID to [idempotently](#section/Idempotency-Requests) identifty the transfer.
   * @return idempotencyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID to [idempotently](#section/Idempotency-Requests) identifty the transfer.")

  public String getIdempotencyId() {
    return idempotencyId;
  }


  public void setIdempotencyId(String idempotencyId) {
    this.idempotencyId = idempotencyId;
  }


  public Transfer merchantIdentity(String merchantIdentity) {
    
    this.merchantIdentity = merchantIdentity;
    return this;
  }

   /**
   * The ID of the resource.
   * @return merchantIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getMerchantIdentity() {
    return merchantIdentity;
  }


  public void setMerchantIdentity(String merchantIdentity) {
    this.merchantIdentity = merchantIdentity;
  }


  public Transfer messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public Transfer addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Message field that provides additional details. This field is typically **null**.
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message field that provides additional details. This field is typically **null**.")

  public List<String> getMessages() {
    return messages;
  }


  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  public Transfer raw(Object raw) {
    
    this.raw = raw;
    return this;
  }

   /**
   * Raw response from the processor.
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw response from the processor.")

  public Object getRaw() {
    return raw;
  }


  public void setRaw(Object raw) {
    this.raw = raw;
  }


  public Transfer readyToSettleAt(OffsetDateTime readyToSettleAt) {
    
    this.readyToSettleAt = readyToSettleAt;
    return this;
  }

   /**
   * Timestamp of when the &#x60;Transfer&#x60; is ready to be settled at.
   * @return readyToSettleAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the `Transfer` is ready to be settled at.")

  public OffsetDateTime getReadyToSettleAt() {
    return readyToSettleAt;
  }


  public void setReadyToSettleAt(OffsetDateTime readyToSettleAt) {
    this.readyToSettleAt = readyToSettleAt;
  }


  public Transfer source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The ID of the resource.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public Transfer state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The stauts of the &#x60;Transfer&#x60;.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stauts of the `Transfer`.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public Transfer statementDescriptor(String statementDescriptor) {
    
    this.statementDescriptor = statementDescriptor;
    return this;
  }

   /**
   * The description of the merchant that appears on the buyer&#39;s bank or card statement.
   * @return statementDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the merchant that appears on the buyer's bank or card statement.")

  public String getStatementDescriptor() {
    return statementDescriptor;
  }


  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }


  public Transfer subtype(SubtypeEnum subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Additional information describing the &#x60;payment_type&#x60;.
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information describing the `payment_type`.")

  public SubtypeEnum getSubtype() {
    return subtype;
  }


  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }


  public Transfer tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Transfer putTagsItem(String key, String tagsItem) {
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


  public Transfer traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * Trace ID of the &#x60;Transfer&#x60;. The processor sends back the &#x60;trace_id&#x60; so you can track the &#x60;Transfer&#x60; end-to-end.
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trace ID of the `Transfer`. The processor sends back the `trace_id` so you can track the `Transfer` end-to-end.")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public Transfer type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of &#x60;Transfer&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of `Transfer`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Transfer links(TransferLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinks getLinks() {
    return links;
  }


  public void setLinks(TransferLinks links) {
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
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.id, transfer.id) &&
        Objects.equals(this.createdAt, transfer.createdAt) &&
        Objects.equals(this.updatedAt, transfer.updatedAt) &&
        Objects.equals(this.additionalBuyerCharges, transfer.additionalBuyerCharges) &&
        Objects.equals(this.amount, transfer.amount) &&
        Objects.equals(this.application, transfer.application) &&
        Objects.equals(this.cardPresentDetails, transfer.cardPresentDetails) &&
        Objects.equals(this.currency, transfer.currency) &&
        Objects.equals(this.destination, transfer.destination) &&
        Objects.equals(this.device, transfer.device) &&
        Objects.equals(this.externallyFunded, transfer.externallyFunded) &&
        Objects.equals(this.failureCode, transfer.failureCode) &&
        Objects.equals(this.failureMessage, transfer.failureMessage) &&
        Objects.equals(this.fee, transfer.fee) &&
        Objects.equals(this.feeType, transfer.feeType) &&
        Objects.equals(this.idempotencyId, transfer.idempotencyId) &&
        Objects.equals(this.merchantIdentity, transfer.merchantIdentity) &&
        Objects.equals(this.messages, transfer.messages) &&
        Objects.equals(this.raw, transfer.raw) &&
        Objects.equals(this.readyToSettleAt, transfer.readyToSettleAt) &&
        Objects.equals(this.source, transfer.source) &&
        Objects.equals(this.state, transfer.state) &&
        Objects.equals(this.statementDescriptor, transfer.statementDescriptor) &&
        Objects.equals(this.subtype, transfer.subtype) &&
        Objects.equals(this.tags, transfer.tags) &&
        Objects.equals(this.traceId, transfer.traceId) &&
        Objects.equals(this.type, transfer.type) &&
        Objects.equals(this.links, transfer.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, additionalBuyerCharges, amount, application, cardPresentDetails, currency, destination, device, externallyFunded, failureCode, failureMessage, fee, feeType, idempotencyId, merchantIdentity, messages, raw, readyToSettleAt, source, state, statementDescriptor, subtype, tags, traceId, type, links);
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
    sb.append("class Transfer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    additionalBuyerCharges: ").append(toIndentedString(additionalBuyerCharges)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    cardPresentDetails: ").append(toIndentedString(cardPresentDetails)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    externallyFunded: ").append(toIndentedString(externallyFunded)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    idempotencyId: ").append(toIndentedString(idempotencyId)).append("\n");
    sb.append("    merchantIdentity: ").append(toIndentedString(merchantIdentity)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    readyToSettleAt: ").append(toIndentedString(readyToSettleAt)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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
    openapiFields.add("additional_buyer_charges");
    openapiFields.add("amount");
    openapiFields.add("application");
    openapiFields.add("card_present_details");
    openapiFields.add("currency");
    openapiFields.add("destination");
    openapiFields.add("device");
    openapiFields.add("externally_funded");
    openapiFields.add("failure_code");
    openapiFields.add("failure_message");
    openapiFields.add("fee");
    openapiFields.add("fee_type");
    openapiFields.add("idempotency_id");
    openapiFields.add("merchant_identity");
    openapiFields.add("messages");
    openapiFields.add("raw");
    openapiFields.add("ready_to_settle_at");
    openapiFields.add("source");
    openapiFields.add("state");
    openapiFields.add("statement_descriptor");
    openapiFields.add("subtype");
    openapiFields.add("tags");
    openapiFields.add("trace_id");
    openapiFields.add("type");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Transfer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Transfer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Transfer is not found in the empty JSON string", Transfer.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Transfer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Transfer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `additional_buyer_charges`
     // if (jsonObj.getAsJsonObject("additional_buyer_charges") != null) {
       //AdditionalBuyerCharges.validateJsonObject(jsonObj.getAsJsonObject("additional_buyer_charges"));
     // }

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
      // validate the optional field `card_present_details`
     // if (jsonObj.getAsJsonObject("card_present_details") != null) {
       //CardPresentDetails.validateJsonObject(jsonObj.getAsJsonObject("card_present_details"));
     // }

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
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()  && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("externally_funded") != null && !jsonObj.get("externally_funded").isJsonNull()  && !jsonObj.get("externally_funded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externally_funded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externally_funded").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("failure_code") != null && !jsonObj.get("failure_code").isJsonNull()  && !jsonObj.get("failure_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("failure_message") != null && !jsonObj.get("failure_message").isJsonNull()  && !jsonObj.get("failure_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_message").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("idempotency_id") != null && !jsonObj.get("idempotency_id").isJsonNull()  && !jsonObj.get("idempotency_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotency_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotency_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_identity") != null && !jsonObj.get("merchant_identity").isJsonNull()  && !jsonObj.get("merchant_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_identity").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("messages") != null && !jsonObj.get("messages").isJsonNull() && !jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()  && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()  && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("statement_descriptor") != null && !jsonObj.get("statement_descriptor").isJsonNull()  && !jsonObj.get("statement_descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statement_descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statement_descriptor").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("subtype") != null && !jsonObj.get("subtype").isJsonNull()  && !jsonObj.get("subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("trace_id") != null && !jsonObj.get("trace_id").isJsonNull()  && !jsonObj.get("trace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trace_id").toString()));
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
       if (!Transfer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Transfer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Transfer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Transfer.class));

       return (TypeAdapter<T>) new TypeAdapter<Transfer>() {
           @Override
           public void write(JsonWriter out, Transfer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Transfer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Transfer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Transfer
  * @throws IOException if the JSON string is invalid with respect to Transfer
  */
  public static Transfer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Transfer.class);
  }

 /**
  * Convert an instance of Transfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

