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
import model.AdditionalBuyerCharges;
import model.AdditionalPurchaseData;
import model.CardPresentInstrumentForm;
import model.ConfigurationDetails;
import model.CreateTransferRequest3dSecureAuthentication;
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
 * Create a &#x60;transfer&#x60;.
 */
@ApiModel(description = "Create a `transfer`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTransferRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_BUYER_CHARGES = "additional_buyer_charges";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_BUYER_CHARGES)
  private AdditionalBuyerCharges additionalBuyerCharges;

  public static final String SERIALIZED_NAME_ADDITIONAL_PURCHASE_DATA = "additional_purchase_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PURCHASE_DATA)
  private AdditionalPurchaseData additionalPurchaseData;

  public static final String SERIALIZED_NAME_ADJUSTMENT_REQUEST = "adjustment_request";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_REQUEST)
  private Boolean adjustmentRequest;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_DEVICE_CONFIGURATION = "device_configuration";
  @SerializedName(SERIALIZED_NAME_DEVICE_CONFIGURATION)
  private ConfigurationDetails deviceConfiguration;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Long fee;

  public static final String SERIALIZED_NAME_FRAUD_SESSION_ID = "fraud_session_id";
  @SerializedName(SERIALIZED_NAME_FRAUD_SESSION_ID)
  private String fraudSessionId;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_ID = "idempotency_id";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_ID)
  private String idempotencyId;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  /**
   * Details the operation that&#39;ll be performed in the transaction.
   */
  @JsonAdapter(OperationKeyEnum.Adapter.class)
  public enum OperationKeyEnum {
    PUSH_TO_CARD("PUSH_TO_CARD"),
    
    PULL_FROM_CARD("PULL_FROM_CARD"),
    
    CARD_PRESENT_DEBIT("CARD_PRESENT_DEBIT"),
    
    CARD_PRESENT_UNREFERENCED_REFUND("CARD_PRESENT_UNREFERENCED_REFUND"),
    
    SALE("SALE"),
    
    UNREFERENCED_REFUND("UNREFERENCED_REFUND"),
    
    MERCHANT_CREDIT_ADJUSTMENT("MERCHANT_CREDIT_ADJUSTMENT"),
    
    MERCHANT_DEBIT_ADJUSTMENT("MERCHANT_DEBIT_ADJUSTMENT"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    OperationKeyEnum(String value) {
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

    public static OperationKeyEnum fromValue(String value) {
        for (OperationKeyEnum b : OperationKeyEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        if (value.equals(null) && value.length() == 0) {
            return null;
        }
        OperationKeyEnum unknownDefault = OperationKeyEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<OperationKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationKeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationKeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationKeyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION_KEY = "operation_key";
  @SerializedName(SERIALIZED_NAME_OPERATION_KEY)
  private OperationKeyEnum operationKey;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT = "payment_instrument";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT)
  private CardPresentInstrumentForm paymentInstrument;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_STATEMENT_DESCRIPTOR = "statement_descriptor";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DESCRIPTOR)
  private String statementDescriptor;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_3D_SECURE_AUTHENTICATION = "3d_secure_authentication";
  @SerializedName(SERIALIZED_NAME_3D_SECURE_AUTHENTICATION)
  private CreateTransferRequest3dSecureAuthentication _3dSecureAuthentication;

  public CreateTransferRequest() { 
  }

  public CreateTransferRequest additionalBuyerCharges(AdditionalBuyerCharges additionalBuyerCharges) {
    
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


  public CreateTransferRequest additionalPurchaseData(AdditionalPurchaseData additionalPurchaseData) {
    
    this.additionalPurchaseData = additionalPurchaseData;
    return this;
  }

   /**
   * Get additionalPurchaseData
   * @return additionalPurchaseData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdditionalPurchaseData getAdditionalPurchaseData() {
    return additionalPurchaseData;
  }


  public void setAdditionalPurchaseData(AdditionalPurchaseData additionalPurchaseData) {
    this.additionalPurchaseData = additionalPurchaseData;
  }


  public CreateTransferRequest adjustmentRequest(Boolean adjustmentRequest) {
    
    this.adjustmentRequest = adjustmentRequest;
    return this;
  }

   /**
   * Details if the &#x60;transfer&#x60; was created to adjust funds.
   * @return adjustmentRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `transfer` was created to adjust funds.")

  public Boolean getAdjustmentRequest() {
    return adjustmentRequest;
  }


  public void setAdjustmentRequest(Boolean adjustmentRequest) {
    this.adjustmentRequest = adjustmentRequest;
  }


  public CreateTransferRequest amount(Long amount) {
    
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


  public CreateTransferRequest currency(Currency currency) {
    
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


  public CreateTransferRequest destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * ID of the &#x60;Payment Instrument&#x60; where funds will be sent.
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Payment Instrument` where funds will be sent.")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public CreateTransferRequest device(String device) {
    
    this.device = device;
    return this;
  }

   /**
   * The ID of the activated device.
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the activated device.")

  public String getDevice() {
    return device;
  }


  public void setDevice(String device) {
    this.device = device;
  }


  public CreateTransferRequest deviceConfiguration(ConfigurationDetails deviceConfiguration) {
    
    this.deviceConfiguration = deviceConfiguration;
    return this;
  }

   /**
   * Get deviceConfiguration
   * @return deviceConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigurationDetails getDeviceConfiguration() {
    return deviceConfiguration;
  }


  public void setDeviceConfiguration(ConfigurationDetails deviceConfiguration) {
    this.deviceConfiguration = deviceConfiguration;
  }


  public CreateTransferRequest fee(Long fee) {
    
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


  public CreateTransferRequest fraudSessionId(String fraudSessionId) {
    
    this.fraudSessionId = fraudSessionId;
    return this;
  }

   /**
   * The &#x60;fraud_session_session&#x60; ID you want to review for fraud. For more info, see [Fraud Detection](/docs/guides/payments/fraud-detection/).
   * @return fraudSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `fraud_session_session` ID you want to review for fraud. For more info, see [Fraud Detection](/docs/guides/payments/fraud-detection/).")

  public String getFraudSessionId() {
    return fraudSessionId;
  }


  public void setFraudSessionId(String fraudSessionId) {
    this.fraudSessionId = fraudSessionId;
  }


  public CreateTransferRequest idempotencyId(String idempotencyId) {
    
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


  public CreateTransferRequest merchant(String merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * ID of the &#x60;Merchant&#x60; the &#x60;Transfer&#x60; was created under.
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Merchant` the `Transfer` was created under.")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public CreateTransferRequest operationKey(OperationKeyEnum operationKey) {
    
    this.operationKey = operationKey;
    return this;
  }

   /**
   * Details the operation that&#39;ll be performed in the transaction.
   * @return operationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details the operation that'll be performed in the transaction.")

  public OperationKeyEnum getOperationKey() {
    return operationKey;
  }


  public void setOperationKey(OperationKeyEnum operationKey) {
    this.operationKey = operationKey;
  }


  public CreateTransferRequest paymentInstrument(CardPresentInstrumentForm paymentInstrument) {
    
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardPresentInstrumentForm getPaymentInstrument() {
    return paymentInstrument;
  }


  public void setPaymentInstrument(CardPresentInstrumentForm paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }


  public CreateTransferRequest processor(String processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * Name of the transaction processor.
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the transaction processor.")

  public String getProcessor() {
    return processor;
  }


  public void setProcessor(String processor) {
    this.processor = processor;
  }


  public CreateTransferRequest source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * ID of the &#x60;Payment Instrument&#x60; where funds get debited.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Payment Instrument` where funds get debited.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public CreateTransferRequest statementDescriptor(String statementDescriptor) {
    
    this.statementDescriptor = statementDescriptor;
    return this;
  }

   /**
   * The description of the transaction that appears on the buyer&#39;s bank or card statement.
   * @return statementDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the transaction that appears on the buyer's bank or card statement.")

  public String getStatementDescriptor() {
    return statementDescriptor;
  }


  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }


  public CreateTransferRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateTransferRequest putTagsItem(String key, String tagsItem) {
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


  public CreateTransferRequest _3dSecureAuthentication(CreateTransferRequest3dSecureAuthentication _3dSecureAuthentication) {
    
    this._3dSecureAuthentication = _3dSecureAuthentication;
    return this;
  }

   /**
   * Get _3dSecureAuthentication
   * @return _3dSecureAuthentication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateTransferRequest3dSecureAuthentication get3dSecureAuthentication() {
    return _3dSecureAuthentication;
  }


  public void set3dSecureAuthentication(CreateTransferRequest3dSecureAuthentication _3dSecureAuthentication) {
    this._3dSecureAuthentication = _3dSecureAuthentication;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransferRequest createTransferRequest = (CreateTransferRequest) o;
    return Objects.equals(this.additionalBuyerCharges, createTransferRequest.additionalBuyerCharges) &&
        Objects.equals(this.additionalPurchaseData, createTransferRequest.additionalPurchaseData) &&
        Objects.equals(this.adjustmentRequest, createTransferRequest.adjustmentRequest) &&
        Objects.equals(this.amount, createTransferRequest.amount) &&
        Objects.equals(this.currency, createTransferRequest.currency) &&
        Objects.equals(this.destination, createTransferRequest.destination) &&
        Objects.equals(this.device, createTransferRequest.device) &&
        Objects.equals(this.deviceConfiguration, createTransferRequest.deviceConfiguration) &&
        Objects.equals(this.fee, createTransferRequest.fee) &&
        Objects.equals(this.fraudSessionId, createTransferRequest.fraudSessionId) &&
        Objects.equals(this.idempotencyId, createTransferRequest.idempotencyId) &&
        Objects.equals(this.merchant, createTransferRequest.merchant) &&
        Objects.equals(this.operationKey, createTransferRequest.operationKey) &&
        Objects.equals(this.paymentInstrument, createTransferRequest.paymentInstrument) &&
        Objects.equals(this.processor, createTransferRequest.processor) &&
        Objects.equals(this.source, createTransferRequest.source) &&
        Objects.equals(this.statementDescriptor, createTransferRequest.statementDescriptor) &&
        Objects.equals(this.tags, createTransferRequest.tags) &&
        Objects.equals(this._3dSecureAuthentication, createTransferRequest._3dSecureAuthentication);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalBuyerCharges, additionalPurchaseData, adjustmentRequest, amount, currency, destination, device, deviceConfiguration, fee, fraudSessionId, idempotencyId, merchant, operationKey, paymentInstrument, processor, source, statementDescriptor, tags, _3dSecureAuthentication);
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
    sb.append("class CreateTransferRequest {\n");
    sb.append("    additionalBuyerCharges: ").append(toIndentedString(additionalBuyerCharges)).append("\n");
    sb.append("    additionalPurchaseData: ").append(toIndentedString(additionalPurchaseData)).append("\n");
    sb.append("    adjustmentRequest: ").append(toIndentedString(adjustmentRequest)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceConfiguration: ").append(toIndentedString(deviceConfiguration)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    fraudSessionId: ").append(toIndentedString(fraudSessionId)).append("\n");
    sb.append("    idempotencyId: ").append(toIndentedString(idempotencyId)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    operationKey: ").append(toIndentedString(operationKey)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    _3dSecureAuthentication: ").append(toIndentedString(_3dSecureAuthentication)).append("\n");
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
    openapiFields.add("additional_buyer_charges");
    openapiFields.add("additional_purchase_data");
    openapiFields.add("adjustment_request");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("destination");
    openapiFields.add("device");
    openapiFields.add("device_configuration");
    openapiFields.add("fee");
    openapiFields.add("fraud_session_id");
    openapiFields.add("idempotency_id");
    openapiFields.add("merchant");
    openapiFields.add("operation_key");
    openapiFields.add("payment_instrument");
    openapiFields.add("processor");
    openapiFields.add("source");
    openapiFields.add("statement_descriptor");
    openapiFields.add("tags");
    openapiFields.add("3d_secure_authentication");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateTransferRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateTransferRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTransferRequest is not found in the empty JSON string", CreateTransferRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateTransferRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTransferRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateTransferRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `additional_purchase_data`
     // if (jsonObj.getAsJsonObject("additional_purchase_data") != null) {
       //AdditionalPurchaseData.validateJsonObject(jsonObj.getAsJsonObject("additional_purchase_data"));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `device_configuration`
     // if (jsonObj.getAsJsonObject("device_configuration") != null) {
       //ConfigurationDetails.validateJsonObject(jsonObj.getAsJsonObject("device_configuration"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fraud_session_id") != null && !jsonObj.get("fraud_session_id").isJsonNull()  && !jsonObj.get("fraud_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fraud_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fraud_session_id").toString()));
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
      if (jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()  && !jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("operation_key") != null && !jsonObj.get("operation_key").isJsonNull()  && !jsonObj.get("operation_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_key").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `payment_instrument`
     // if (jsonObj.getAsJsonObject("payment_instrument") != null) {
       //CardPresentInstrumentForm.validateJsonObject(jsonObj.getAsJsonObject("payment_instrument"));
     // }

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
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()  && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `3d_secure_authentication`
     // if (jsonObj.getAsJsonObject("3d_secure_authentication") != null) {
       //CreateTransferRequest3dSecureAuthentication.validateJsonObject(jsonObj.getAsJsonObject("3d_secure_authentication"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTransferRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTransferRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTransferRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTransferRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTransferRequest>() {
           @Override
           public void write(JsonWriter out, CreateTransferRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTransferRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTransferRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTransferRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTransferRequest
  */
  public static CreateTransferRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTransferRequest.class);
  }

 /**
  * Convert an instance of CreateTransferRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

