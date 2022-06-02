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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;

import invoker.JSON;

/**
 * CreateTransferRequest
 */
@Builder
@AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-27T11:05:36.428255-05:00[America/Chicago]")
public class CreateTransferRequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_ADJUSTMENT_REQUEST = "adjustment_request";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_REQUEST)
  private Boolean adjustmentRequest;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CONFIG_OVERRIDE = "config_override";
  @SerializedName(SERIALIZED_NAME_CONFIG_OVERRIDE)
  private Map<String, String> configOverride = null;

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
  private DeviceConfigurationForm deviceConfiguration;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Long fee;

  /**
   * Gets or Sets gateway
   */
  @JsonAdapter(GatewayEnum.Adapter.class)
  public enum GatewayEnum {
    CLOUD_V1("TRIPOS_CLOUD_V1"),
    
    MOBILE_V1("TRIPOS_MOBILE_V1");

    private String value;

    GatewayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GatewayEnum fromValue(String value) {
      for (GatewayEnum b : GatewayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GatewayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GatewayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GatewayEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GatewayEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private GatewayEnum gateway;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_ID = "idempotency_id";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_ID)
  private String idempotencyId;

  /**
   * Gets or Sets inputMethod
   */
  @JsonAdapter(InputMethodEnum.Adapter.class)
  public enum InputMethodEnum {
    UNKNOWN("UNKNOWN"),
    
    SWIPED("SWIPED"),
    
    MANUAL_KEY_ENTRY("MANUAL_KEY_ENTRY"),
    
    CONTACTLESS_MSD("CONTACTLESS_MSD"),
    
    CONTACTLESS_EMV("CONTACTLESS_EMV"),
    
    SWIPED_FALLBACK("SWIPED_FALLBACK"),
    
    KEYED_FALLBACK("KEYED_FALLBACK"),
    
    CONTACTLESS("CONTACTLESS"),
    
    DIGITAL_WALLET("DIGITAL_WALLET"),
    
    CHIP_ENTRY("CHIP_ENTRY");

    private String value;

    InputMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InputMethodEnum fromValue(String value) {
      for (InputMethodEnum b : InputMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InputMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InputMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InputMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InputMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INPUT_METHOD = "input_method";
  @SerializedName(SERIALIZED_NAME_INPUT_METHOD)
  private InputMethodEnum inputMethod;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private String merchantIdentity;

  /**
   * Gets or Sets operationKey
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
    
    MERCHANT_DEBIT_ADJUSTMENT("MERCHANT_DEBIT_ADJUSTMENT");

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

    public static OperationKeyEnum fromValue(String value) {
      for (OperationKeyEnum b : OperationKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public CreateTransferRequest() { 
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


  public CreateTransferRequest adjustmentRequest(Boolean adjustmentRequest) {
    
    this.adjustmentRequest = adjustmentRequest;
    return this;
  }

   /**
   * Get adjustmentRequest
   * @return adjustmentRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public CreateTransferRequest configOverride(Map<String, String> configOverride) {
    
    this.configOverride = configOverride;
    return this;
  }

  public CreateTransferRequest putConfigOverrideItem(String key, String configOverrideItem) {
    if (this.configOverride == null) {
      this.configOverride = new HashMap<>();
    }
    this.configOverride.put(key, configOverrideItem);
    return this;
  }

   /**
   * Get configOverride
   * @return configOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getConfigOverride() {
    return configOverride;
  }


  public void setConfigOverride(Map<String, String> configOverride) {
    this.configOverride = configOverride;
  }


  public CreateTransferRequest currency(Currency currency) {
    
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


  public CreateTransferRequest destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDevice() {
    return device;
  }


  public void setDevice(String device) {
    this.device = device;
  }


  public CreateTransferRequest deviceConfiguration(DeviceConfigurationForm deviceConfiguration) {
    
    this.deviceConfiguration = deviceConfiguration;
    return this;
  }

   /**
   * Get deviceConfiguration
   * @return deviceConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceConfigurationForm getDeviceConfiguration() {
    return deviceConfiguration;
  }


  public void setDeviceConfiguration(DeviceConfigurationForm deviceConfiguration) {
    this.deviceConfiguration = deviceConfiguration;
  }


  public CreateTransferRequest fee(Long fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFee() {
    return fee;
  }


  public void setFee(Long fee) {
    this.fee = fee;
  }


  public CreateTransferRequest gateway(GatewayEnum gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayEnum getGateway() {
    return gateway;
  }


  public void setGateway(GatewayEnum gateway) {
    this.gateway = gateway;
  }


  public CreateTransferRequest idempotencyId(String idempotencyId) {
    
    this.idempotencyId = idempotencyId;
    return this;
  }

   /**
   * Get idempotencyId
   * @return idempotencyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdempotencyId() {
    return idempotencyId;
  }


  public void setIdempotencyId(String idempotencyId) {
    this.idempotencyId = idempotencyId;
  }


  public CreateTransferRequest inputMethod(InputMethodEnum inputMethod) {
    
    this.inputMethod = inputMethod;
    return this;
  }

   /**
   * Get inputMethod
   * @return inputMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InputMethodEnum getInputMethod() {
    return inputMethod;
  }


  public void setInputMethod(InputMethodEnum inputMethod) {
    this.inputMethod = inputMethod;
  }


  public CreateTransferRequest merchant(String merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public CreateTransferRequest merchantIdentity(String merchantIdentity) {
    
    this.merchantIdentity = merchantIdentity;
    return this;
  }

   /**
   * Get merchantIdentity
   * @return merchantIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMerchantIdentity() {
    return merchantIdentity;
  }


  public void setMerchantIdentity(String merchantIdentity) {
    this.merchantIdentity = merchantIdentity;
  }


  public CreateTransferRequest operationKey(OperationKeyEnum operationKey) {
    
    this.operationKey = operationKey;
    return this;
  }

   /**
   * Get operationKey
   * @return operationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get processor
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get statementDescriptor
   * @return statementDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatementDescriptor() {
    return statementDescriptor;
  }


  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
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
    return Objects.equals(this.tags, createTransferRequest.tags) &&
        Objects.equals(this.adjustmentRequest, createTransferRequest.adjustmentRequest) &&
        Objects.equals(this.amount, createTransferRequest.amount) &&
        Objects.equals(this.configOverride, createTransferRequest.configOverride) &&
        Objects.equals(this.currency, createTransferRequest.currency) &&
        Objects.equals(this.destination, createTransferRequest.destination) &&
        Objects.equals(this.device, createTransferRequest.device) &&
        Objects.equals(this.deviceConfiguration, createTransferRequest.deviceConfiguration) &&
        Objects.equals(this.fee, createTransferRequest.fee) &&
        Objects.equals(this.gateway, createTransferRequest.gateway) &&
        Objects.equals(this.idempotencyId, createTransferRequest.idempotencyId) &&
        Objects.equals(this.inputMethod, createTransferRequest.inputMethod) &&
        Objects.equals(this.merchant, createTransferRequest.merchant) &&
        Objects.equals(this.merchantIdentity, createTransferRequest.merchantIdentity) &&
        Objects.equals(this.operationKey, createTransferRequest.operationKey) &&
        Objects.equals(this.paymentInstrument, createTransferRequest.paymentInstrument) &&
        Objects.equals(this.processor, createTransferRequest.processor) &&
        Objects.equals(this.source, createTransferRequest.source) &&
        Objects.equals(this.statementDescriptor, createTransferRequest.statementDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, adjustmentRequest, amount, configOverride, currency, destination, device, deviceConfiguration, fee, gateway, idempotencyId, inputMethod, merchant, merchantIdentity, operationKey, paymentInstrument, processor, source, statementDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransferRequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    adjustmentRequest: ").append(toIndentedString(adjustmentRequest)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    configOverride: ").append(toIndentedString(configOverride)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceConfiguration: ").append(toIndentedString(deviceConfiguration)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    idempotencyId: ").append(toIndentedString(idempotencyId)).append("\n");
    sb.append("    inputMethod: ").append(toIndentedString(inputMethod)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantIdentity: ").append(toIndentedString(merchantIdentity)).append("\n");
    sb.append("    operationKey: ").append(toIndentedString(operationKey)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
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
    openapiFields.add("adjustment_request");
    openapiFields.add("amount");
    openapiFields.add("config_override");
    openapiFields.add("currency");
    openapiFields.add("destination");
    openapiFields.add("device");
    openapiFields.add("device_configuration");
    openapiFields.add("fee");
    openapiFields.add("gateway");
    openapiFields.add("idempotency_id");
    openapiFields.add("input_method");
    openapiFields.add("merchant");
    openapiFields.add("merchant_identity");
    openapiFields.add("operation_key");
    openapiFields.add("payment_instrument");
    openapiFields.add("processor");
    openapiFields.add("source");
    openapiFields.add("statement_descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
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
      if (jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()  && !jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()  && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      // validate the optional field `device_configuration`
      if (jsonObj.getAsJsonObject("device_configuration") != null) {
       DeviceConfigurationForm.validateJsonObject(jsonObj.getAsJsonObject("device_configuration"));
      }
      if (jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull()  && !jsonObj.get("gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway").toString()));
      }
      if (jsonObj.get("idempotency_id") != null && !jsonObj.get("idempotency_id").isJsonNull()  && !jsonObj.get("idempotency_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotency_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotency_id").toString()));
      }
      if (jsonObj.get("input_method") != null && !jsonObj.get("input_method").isJsonNull()  && !jsonObj.get("input_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input_method").toString()));
      }
      if (jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()  && !jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
      if (jsonObj.get("merchant_identity") != null && !jsonObj.get("merchant_identity").isJsonNull()  && !jsonObj.get("merchant_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_identity").toString()));
      }
      if (jsonObj.get("operation_key") != null && !jsonObj.get("operation_key").isJsonNull()  && !jsonObj.get("operation_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_key").toString()));
      }
      // validate the optional field `payment_instrument`
      if (jsonObj.getAsJsonObject("payment_instrument") != null) {
       CardPresentInstrumentForm.validateJsonObject(jsonObj.getAsJsonObject("payment_instrument"));
      }
      if (jsonObj.get("processor") != null && !jsonObj.get("processor").isJsonNull()  && !jsonObj.get("processor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor").toString()));
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()  && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (jsonObj.get("statement_descriptor") != null && !jsonObj.get("statement_descriptor").isJsonNull()  && !jsonObj.get("statement_descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statement_descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statement_descriptor").toString()));
      }
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

