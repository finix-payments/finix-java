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
import model.AuthorizationCapturedExternalResponsesInner;
import model.AuthorizationLinks;
import model.CardPresentDetails;
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
 * A captured authorization
 */
@ApiModel(description = "A captured authorization")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizationCaptured {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_3DS_REDIRECT_URL = "3ds_redirect_url";
  @SerializedName(SERIALIZED_NAME_3DS_REDIRECT_URL)
  private String _3dsRedirectUrl;

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

  public static final String SERIALIZED_NAME_CAPTURE_AMOUNT = "capture_amount";
  @SerializedName(SERIALIZED_NAME_CAPTURE_AMOUNT)
  private Long captureAmount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_EXTERNAL_RESPONSES = "external_responses";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_RESPONSES)
  private List<AuthorizationCapturedExternalResponsesInner> externalResponses = null;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_ID = "idempotency_id";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_ID)
  private String idempotencyId;

  public static final String SERIALIZED_NAME_IS_VOID = "is_void";
  @SerializedName(SERIALIZED_NAME_IS_VOID)
  private Boolean isVoid;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private String merchantIdentity;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<String> messages = null;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private Object raw;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  /**
   * The state of the &#x60;Transfer&#x60;.
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

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_TRACE_ID = "trace_id";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_TRANSFER = "transfer";
  @SerializedName(SERIALIZED_NAME_TRANSFER)
  private String transfer;

  public static final String SERIALIZED_NAME_VOID_STATE = "void_state";
  @SerializedName(SERIALIZED_NAME_VOID_STATE)
  private String voidState;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private AuthorizationLinks links;

  public AuthorizationCaptured() { 
  }

  public AuthorizationCaptured id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;Authorization&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUxxxxxxxxxxxxxxxxxx", value = "The ID of the `Authorization` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AuthorizationCaptured createdAt(OffsetDateTime createdAt) {
    
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


  public AuthorizationCaptured updatedAt(OffsetDateTime updatedAt) {
    
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


  public AuthorizationCaptured _3dsRedirectUrl(String _3dsRedirectUrl) {
    
    this._3dsRedirectUrl = _3dsRedirectUrl;
    return this;
  }

   /**
   * The redirect URL used for 3DS transactions (if supported by the processor).
   * @return _3dsRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The redirect URL used for 3DS transactions (if supported by the processor).")

  public String get3dsRedirectUrl() {
    return _3dsRedirectUrl;
  }


  public void set3dsRedirectUrl(String _3dsRedirectUrl) {
    this._3dsRedirectUrl = _3dsRedirectUrl;
  }


  public AuthorizationCaptured additionalBuyerCharges(AdditionalBuyerCharges additionalBuyerCharges) {
    
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


  public AuthorizationCaptured amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).
   * minimum: 0
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


  public AuthorizationCaptured application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the &#x60;Application&#x60; resource the &#x60;Authorization&#x60; was created under.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Application` resource the `Authorization` was created under.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public AuthorizationCaptured cardPresentDetails(CardPresentDetails cardPresentDetails) {
    
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


  public AuthorizationCaptured captureAmount(Long captureAmount) {
    
    this.captureAmount = captureAmount;
    return this;
  }

   /**
   * The amount of the  &#x60;Authorization&#x60;  you would like to capture in cents. Must be less than or equal to the &#x60;amount&#x60; of the &#x60;Authorization&#x60;.
   * @return captureAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the  `Authorization`  you would like to capture in cents. Must be less than or equal to the `amount` of the `Authorization`.")

  public Long getCaptureAmount() {
    return captureAmount;
  }


  public void setCaptureAmount(Long captureAmount) {
    this.captureAmount = captureAmount;
  }


  public AuthorizationCaptured currency(Currency currency) {
    
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


  public AuthorizationCaptured device(String device) {
    
    this.device = device;
    return this;
  }

   /**
   * The ID of the activated device.
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DVxxxxxxxxxxxxxxxxxx", value = "The ID of the activated device.")

  public String getDevice() {
    return device;
  }


  public void setDevice(String device) {
    this.device = device;
  }


  public AuthorizationCaptured expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Authorization expiration time.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authorization expiration time.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public AuthorizationCaptured externalResponses(List<AuthorizationCapturedExternalResponsesInner> externalResponses) {
    
    this.externalResponses = externalResponses;
    return this;
  }

  public AuthorizationCaptured addExternalResponsesItem(AuthorizationCapturedExternalResponsesInner externalResponsesItem) {
    if (this.externalResponses == null) {
      this.externalResponses = new ArrayList<>();
    }
    this.externalResponses.add(externalResponsesItem);
    return this;
  }

   /**
   * Get externalResponses
   * @return externalResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AuthorizationCapturedExternalResponsesInner> getExternalResponses() {
    return externalResponses;
  }


  public void setExternalResponses(List<AuthorizationCapturedExternalResponsesInner> externalResponses) {
    this.externalResponses = externalResponses;
  }


  public AuthorizationCaptured failureCode(String failureCode) {
    
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


  public AuthorizationCaptured failureMessage(String failureMessage) {
    
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


  public AuthorizationCaptured idempotencyId(String idempotencyId) {
    
    this.idempotencyId = idempotencyId;
    return this;
  }

   /**
   * A randomly generated value that&#39;ll be associated with the request.
   * @return idempotencyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A randomly generated value that'll be associated with the request.")

  public String getIdempotencyId() {
    return idempotencyId;
  }


  public void setIdempotencyId(String idempotencyId) {
    this.idempotencyId = idempotencyId;
  }


  public AuthorizationCaptured isVoid(Boolean isVoid) {
    
    this.isVoid = isVoid;
    return this;
  }

   /**
   * Details if the &#x60;Authorization&#x60; is void.
   * @return isVoid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Authorization` is void.")

  public Boolean getIsVoid() {
    return isVoid;
  }


  public void setIsVoid(Boolean isVoid) {
    this.isVoid = isVoid;
  }


  public AuthorizationCaptured merchantIdentity(String merchantIdentity) {
    
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


  public AuthorizationCaptured messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public AuthorizationCaptured addMessagesItem(String messagesItem) {
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


  public AuthorizationCaptured raw(Object raw) {
    
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


  public AuthorizationCaptured source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * ID of the &#x60;Payment Instrument&#x60; where funds get debited.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PIxxxxxxxxxxxxxxxxxx", value = "ID of the `Payment Instrument` where funds get debited.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public AuthorizationCaptured state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the &#x60;Transfer&#x60;.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the `Transfer`.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public AuthorizationCaptured tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AuthorizationCaptured putTagsItem(String key, String tagsItem) {
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


  public AuthorizationCaptured traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * Trace ID of the &#x60;Authorization&#x60;. The processor sends back the &#x60;trace_id&#x60; so you can track the authorization end-to-end.
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trace ID of the `Authorization`. The processor sends back the `trace_id` so you can track the authorization end-to-end.")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public AuthorizationCaptured transfer(String transfer) {
    
    this.transfer = transfer;
    return this;
  }

   /**
   * The ID of the &#x60;transfer&#x60; resource that gets created when the &#x60;Authorization&#x60; moves to **SUCCEEDED**.
   * @return transfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRxxxxxxxxxxxxxxxxxx", value = "The ID of the `transfer` resource that gets created when the `Authorization` moves to **SUCCEEDED**.")

  public String getTransfer() {
    return transfer;
  }


  public void setTransfer(String transfer) {
    this.transfer = transfer;
  }


  public AuthorizationCaptured voidState(String voidState) {
    
    this.voidState = voidState;
    return this;
  }

   /**
   * Details if the &#x60;Authorization&#x60; has been voided.
   * @return voidState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Authorization` has been voided.")

  public String getVoidState() {
    return voidState;
  }


  public void setVoidState(String voidState) {
    this.voidState = voidState;
  }


  public AuthorizationCaptured links(AuthorizationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizationLinks getLinks() {
    return links;
  }


  public void setLinks(AuthorizationLinks links) {
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
    AuthorizationCaptured authorizationCaptured = (AuthorizationCaptured) o;
    return Objects.equals(this.id, authorizationCaptured.id) &&
        Objects.equals(this.createdAt, authorizationCaptured.createdAt) &&
        Objects.equals(this.updatedAt, authorizationCaptured.updatedAt) &&
        Objects.equals(this._3dsRedirectUrl, authorizationCaptured._3dsRedirectUrl) &&
        Objects.equals(this.additionalBuyerCharges, authorizationCaptured.additionalBuyerCharges) &&
        Objects.equals(this.amount, authorizationCaptured.amount) &&
        Objects.equals(this.application, authorizationCaptured.application) &&
        Objects.equals(this.cardPresentDetails, authorizationCaptured.cardPresentDetails) &&
        Objects.equals(this.captureAmount, authorizationCaptured.captureAmount) &&
        Objects.equals(this.currency, authorizationCaptured.currency) &&
        Objects.equals(this.device, authorizationCaptured.device) &&
        Objects.equals(this.expiresAt, authorizationCaptured.expiresAt) &&
        Objects.equals(this.externalResponses, authorizationCaptured.externalResponses) &&
        Objects.equals(this.failureCode, authorizationCaptured.failureCode) &&
        Objects.equals(this.failureMessage, authorizationCaptured.failureMessage) &&
        Objects.equals(this.idempotencyId, authorizationCaptured.idempotencyId) &&
        Objects.equals(this.isVoid, authorizationCaptured.isVoid) &&
        Objects.equals(this.merchantIdentity, authorizationCaptured.merchantIdentity) &&
        Objects.equals(this.messages, authorizationCaptured.messages) &&
        Objects.equals(this.raw, authorizationCaptured.raw) &&
        Objects.equals(this.source, authorizationCaptured.source) &&
        Objects.equals(this.state, authorizationCaptured.state) &&
        Objects.equals(this.tags, authorizationCaptured.tags) &&
        Objects.equals(this.traceId, authorizationCaptured.traceId) &&
        Objects.equals(this.transfer, authorizationCaptured.transfer) &&
        Objects.equals(this.voidState, authorizationCaptured.voidState) &&
        Objects.equals(this.links, authorizationCaptured.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, _3dsRedirectUrl, additionalBuyerCharges, amount, application, cardPresentDetails, captureAmount, currency, device, expiresAt, externalResponses, failureCode, failureMessage, idempotencyId, isVoid, merchantIdentity, messages, raw, source, state, tags, traceId, transfer, voidState, links);
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
    sb.append("class AuthorizationCaptured {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    _3dsRedirectUrl: ").append(toIndentedString(_3dsRedirectUrl)).append("\n");
    sb.append("    additionalBuyerCharges: ").append(toIndentedString(additionalBuyerCharges)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    cardPresentDetails: ").append(toIndentedString(cardPresentDetails)).append("\n");
    sb.append("    captureAmount: ").append(toIndentedString(captureAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    externalResponses: ").append(toIndentedString(externalResponses)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    idempotencyId: ").append(toIndentedString(idempotencyId)).append("\n");
    sb.append("    isVoid: ").append(toIndentedString(isVoid)).append("\n");
    sb.append("    merchantIdentity: ").append(toIndentedString(merchantIdentity)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
    sb.append("    voidState: ").append(toIndentedString(voidState)).append("\n");
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
    openapiFields.add("3ds_redirect_url");
    openapiFields.add("additional_buyer_charges");
    openapiFields.add("amount");
    openapiFields.add("application");
    openapiFields.add("card_present_details");
    openapiFields.add("capture_amount");
    openapiFields.add("currency");
    openapiFields.add("device");
    openapiFields.add("expires_at");
    openapiFields.add("external_responses");
    openapiFields.add("failure_code");
    openapiFields.add("failure_message");
    openapiFields.add("idempotency_id");
    openapiFields.add("is_void");
    openapiFields.add("merchant_identity");
    openapiFields.add("messages");
    openapiFields.add("raw");
    openapiFields.add("source");
    openapiFields.add("state");
    openapiFields.add("tags");
    openapiFields.add("trace_id");
    openapiFields.add("transfer");
    openapiFields.add("void_state");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizationCaptured
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorizationCaptured.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationCaptured is not found in the empty JSON string", AuthorizationCaptured.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthorizationCaptured.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizationCaptured` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("3ds_redirect_url") != null && !jsonObj.get("3ds_redirect_url").isJsonNull()  && !jsonObj.get("3ds_redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `3ds_redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("3ds_redirect_url").toString()));
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
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()  && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      JsonArray jsonArrayexternalResponses = jsonObj.getAsJsonArray("external_responses");
      if (jsonArrayexternalResponses != null) {
        // ensure the json data is an array
        if (!jsonObj.get("external_responses").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `external_responses` to be an array in the JSON string but got `%s`", jsonObj.get("external_responses").toString()));
        }

        // validate the optional field `external_responses` (array)
        for (int i = 0; i < jsonArrayexternalResponses.size(); i++) {
          AuthorizationCapturedExternalResponsesInner.validateJsonObject(jsonArrayexternalResponses.get(i).getAsJsonObject());
        }
          ;
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
      if (jsonObj.get("trace_id") != null && !jsonObj.get("trace_id").isJsonNull()  && !jsonObj.get("trace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trace_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("transfer") != null && !jsonObj.get("transfer").isJsonNull()  && !jsonObj.get("transfer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("void_state") != null && !jsonObj.get("void_state").isJsonNull()  && !jsonObj.get("void_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `void_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("void_state").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //AuthorizationLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationCaptured.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationCaptured' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationCaptured> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationCaptured.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationCaptured>() {
           @Override
           public void write(JsonWriter out, AuthorizationCaptured value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizationCaptured read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizationCaptured given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationCaptured
  * @throws IOException if the JSON string is invalid with respect to AuthorizationCaptured
  */
  public static AuthorizationCaptured fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationCaptured.class);
  }

 /**
  * Convert an instance of AuthorizationCaptured to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

