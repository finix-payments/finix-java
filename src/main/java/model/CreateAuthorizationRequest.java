/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
 * Contact: support@finixpayments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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
import model.AdditionalPurchaseData;
import model.CreateAuthorizationRequest3dSecureAuthentication;
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
 * Create an &#x60;Authorization&#x60; resource.
 */
@ApiModel(description = "Create an `Authorization` resource.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T10:10:10.206624-07:00[America/Los_Angeles]")
public class CreateAuthorizationRequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_ID = "idempotency_id";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_ID)
  private String idempotencyId;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private String merchantIdentity;

  /**
   * Name of the transaction processor.
   */
  @JsonAdapter(ProcessorEnum.Adapter.class)
  public enum ProcessorEnum {
    AFFIPAY_V1("AFFIPAY_V1"),
    
    CHECKOUT_V1("CHECKOUT_V1"),
    
    DUMMY_V1("DUMMY_V1"),
    
    ELAVON_V1("ELAVON_V1"),
    
    EXPRESS_V1("EXPRESS_V1"),
    
    FINIX_VISA_SANDBOX_V1("FINIX_VISA_SANDBOX_V1"),
    
    LITLE_V1("LITLE_V1"),
    
    MASTERCARD_V1("MASTERCARD_V1"),
    
    MICROBILT_V1("MICROBILT_V1"),
    
    MYTHICAL_V1("MYTHICAL_V1"),
    
    NMI_V1("NMI_V1"),
    
    SKRILL_V1("SKRILL_V1"),
    
    STRIPE_V1("STRIPE_V1"),
    
    TRIPOS_CLOUD_V1("TRIPOS_CLOUD_V1"),
    
    TRIPOS_MOBILE_V1("TRIPOS_MOBILE_V1"),
    
    TRULIOO_V1("TRULIOO_V1"),
    
    VANTIV_V1("VANTIV_V1"),
    
    VISA_V1("VISA_V1");

    private String value;

    ProcessorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProcessorEnum fromValue(String value) {
      for (ProcessorEnum b : ProcessorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProcessorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProcessorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProcessorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProcessorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private ProcessorEnum processor;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_ADDITIONAL_PURCHASE_DATA = "additional_purchase_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PURCHASE_DATA)
  private AdditionalPurchaseData additionalPurchaseData;

  public static final String SERIALIZED_NAME_3D_SECURE_AUTHENTICATION = "3d_secure_authentication";
  @SerializedName(SERIALIZED_NAME_3D_SECURE_AUTHENTICATION)
  private CreateAuthorizationRequest3dSecureAuthentication _3dSecureAuthentication;

  public static final String SERIALIZED_NAME_OPERATION_KEY = "operation_key";
  @SerializedName(SERIALIZED_NAME_OPERATION_KEY)
  private String operationKey;

  public CreateAuthorizationRequest() { 
  }

  public CreateAuthorizationRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateAuthorizationRequest putTagsItem(String key, String tagsItem) {
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


  public CreateAuthorizationRequest amount(Long amount) {
    
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


  public CreateAuthorizationRequest currency(Currency currency) {
    
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


  public CreateAuthorizationRequest idempotencyId(String idempotencyId) {
    
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


  public CreateAuthorizationRequest merchant(String merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * The ID of the resource.
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public CreateAuthorizationRequest merchantIdentity(String merchantIdentity) {
    
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


  public CreateAuthorizationRequest processor(ProcessorEnum processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * Name of the transaction processor.
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the transaction processor.")

  public ProcessorEnum getProcessor() {
    return processor;
  }


  public void setProcessor(ProcessorEnum processor) {
    this.processor = processor;
  }


  public CreateAuthorizationRequest source(String source) {
    
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


  public CreateAuthorizationRequest additionalPurchaseData(AdditionalPurchaseData additionalPurchaseData) {
    
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


  public CreateAuthorizationRequest _3dSecureAuthentication(CreateAuthorizationRequest3dSecureAuthentication _3dSecureAuthentication) {
    
    this._3dSecureAuthentication = _3dSecureAuthentication;
    return this;
  }

   /**
   * Get _3dSecureAuthentication
   * @return _3dSecureAuthentication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAuthorizationRequest3dSecureAuthentication get3dSecureAuthentication() {
    return _3dSecureAuthentication;
  }


  public void set3dSecureAuthentication(CreateAuthorizationRequest3dSecureAuthentication _3dSecureAuthentication) {
    this._3dSecureAuthentication = _3dSecureAuthentication;
  }


  public CreateAuthorizationRequest operationKey(String operationKey) {
    
    this.operationKey = operationKey;
    return this;
  }

   /**
   * Describes the operation to be performed in the transaction. - **CARD\\_PRESENT\\_AUTHORIZATION**: When making in-person payment with EMV card.
   * @return operationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes the operation to be performed in the transaction. - **CARD\\_PRESENT\\_AUTHORIZATION**: When making in-person payment with EMV card.")

  public String getOperationKey() {
    return operationKey;
  }


  public void setOperationKey(String operationKey) {
    this.operationKey = operationKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthorizationRequest createAuthorizationRequest = (CreateAuthorizationRequest) o;
    return Objects.equals(this.tags, createAuthorizationRequest.tags) &&
        Objects.equals(this.amount, createAuthorizationRequest.amount) &&
        Objects.equals(this.currency, createAuthorizationRequest.currency) &&
        Objects.equals(this.idempotencyId, createAuthorizationRequest.idempotencyId) &&
        Objects.equals(this.merchant, createAuthorizationRequest.merchant) &&
        Objects.equals(this.merchantIdentity, createAuthorizationRequest.merchantIdentity) &&
        Objects.equals(this.processor, createAuthorizationRequest.processor) &&
        Objects.equals(this.source, createAuthorizationRequest.source) &&
        Objects.equals(this.additionalPurchaseData, createAuthorizationRequest.additionalPurchaseData) &&
        Objects.equals(this._3dSecureAuthentication, createAuthorizationRequest._3dSecureAuthentication) &&
        Objects.equals(this.operationKey, createAuthorizationRequest.operationKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, amount, currency, idempotencyId, merchant, merchantIdentity, processor, source, additionalPurchaseData, _3dSecureAuthentication, operationKey);
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
    sb.append("class CreateAuthorizationRequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    idempotencyId: ").append(toIndentedString(idempotencyId)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantIdentity: ").append(toIndentedString(merchantIdentity)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    additionalPurchaseData: ").append(toIndentedString(additionalPurchaseData)).append("\n");
    sb.append("    _3dSecureAuthentication: ").append(toIndentedString(_3dSecureAuthentication)).append("\n");
    sb.append("    operationKey: ").append(toIndentedString(operationKey)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("idempotency_id");
    openapiFields.add("merchant");
    openapiFields.add("merchant_identity");
    openapiFields.add("processor");
    openapiFields.add("source");
    openapiFields.add("additional_purchase_data");
    openapiFields.add("3d_secure_authentication");
    openapiFields.add("operation_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAuthorizationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateAuthorizationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAuthorizationRequest is not found in the empty JSON string", CreateAuthorizationRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateAuthorizationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAuthorizationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateAuthorizationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
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
      if (jsonObj.get("merchant_identity") != null && !jsonObj.get("merchant_identity").isJsonNull()  && !jsonObj.get("merchant_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_identity").toString()));
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
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()  && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `3d_secure_authentication`
     // if (jsonObj.getAsJsonObject("3d_secure_authentication") != null) {
       //CreateAuthorizationRequest3dSecureAuthentication.validateJsonObject(jsonObj.getAsJsonObject("3d_secure_authentication"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("operation_key") != null && !jsonObj.get("operation_key").isJsonNull()  && !jsonObj.get("operation_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_key").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAuthorizationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAuthorizationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAuthorizationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAuthorizationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAuthorizationRequest>() {
           @Override
           public void write(JsonWriter out, CreateAuthorizationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAuthorizationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAuthorizationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAuthorizationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateAuthorizationRequest
  */
  public static CreateAuthorizationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAuthorizationRequest.class);
  }

 /**
  * Convert an instance of CreateAuthorizationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

