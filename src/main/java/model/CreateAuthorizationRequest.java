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
import model.CreateAuthorizationRequest3dSecureAuthentication;
import model.Currency;
import model.OperationKey;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAuthorizationRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_BUYER_CHARGES = "additional_buyer_charges";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_BUYER_CHARGES)
  private AdditionalBuyerCharges additionalBuyerCharges;

  public static final String SERIALIZED_NAME_ADDITIONAL_PURCHASE_DATA = "additional_purchase_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PURCHASE_DATA)
  private AdditionalPurchaseData additionalPurchaseData;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_FRAUD_SESSION_ID = "fraud_session_id";
  @SerializedName(SERIALIZED_NAME_FRAUD_SESSION_ID)
  private String fraudSessionId;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_ID = "idempotency_id";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_ID)
  private String idempotencyId;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_OPERATION_KEY = "operation_key";
  @SerializedName(SERIALIZED_NAME_OPERATION_KEY)
  private OperationKey operationKey;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_3D_SECURE_AUTHENTICATION = "3d_secure_authentication";
  @SerializedName(SERIALIZED_NAME_3D_SECURE_AUTHENTICATION)
  private CreateAuthorizationRequest3dSecureAuthentication _3dSecureAuthentication;

  public CreateAuthorizationRequest() { 
  }

  public CreateAuthorizationRequest additionalBuyerCharges(AdditionalBuyerCharges additionalBuyerCharges) {
    
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


  public CreateAuthorizationRequest device(String device) {
    
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


  public CreateAuthorizationRequest fraudSessionId(String fraudSessionId) {
    
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


  public CreateAuthorizationRequest operationKey(OperationKey operationKey) {
    
    this.operationKey = operationKey;
    return this;
  }

   /**
   * Get operationKey
   * @return operationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OperationKey getOperationKey() {
    return operationKey;
  }


  public void setOperationKey(OperationKey operationKey) {
    this.operationKey = operationKey;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthorizationRequest createAuthorizationRequest = (CreateAuthorizationRequest) o;
    return Objects.equals(this.additionalBuyerCharges, createAuthorizationRequest.additionalBuyerCharges) &&
        Objects.equals(this.additionalPurchaseData, createAuthorizationRequest.additionalPurchaseData) &&
        Objects.equals(this.amount, createAuthorizationRequest.amount) &&
        Objects.equals(this.currency, createAuthorizationRequest.currency) &&
        Objects.equals(this.device, createAuthorizationRequest.device) &&
        Objects.equals(this.fraudSessionId, createAuthorizationRequest.fraudSessionId) &&
        Objects.equals(this.idempotencyId, createAuthorizationRequest.idempotencyId) &&
        Objects.equals(this.merchant, createAuthorizationRequest.merchant) &&
        Objects.equals(this.operationKey, createAuthorizationRequest.operationKey) &&
        Objects.equals(this.source, createAuthorizationRequest.source) &&
        Objects.equals(this.tags, createAuthorizationRequest.tags) &&
        Objects.equals(this._3dSecureAuthentication, createAuthorizationRequest._3dSecureAuthentication);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalBuyerCharges, additionalPurchaseData, amount, currency, device, fraudSessionId, idempotencyId, merchant, operationKey, source, tags, _3dSecureAuthentication);
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
    sb.append("    additionalBuyerCharges: ").append(toIndentedString(additionalBuyerCharges)).append("\n");
    sb.append("    additionalPurchaseData: ").append(toIndentedString(additionalPurchaseData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    fraudSessionId: ").append(toIndentedString(fraudSessionId)).append("\n");
    sb.append("    idempotencyId: ").append(toIndentedString(idempotencyId)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    operationKey: ").append(toIndentedString(operationKey)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("device");
    openapiFields.add("fraud_session_id");
    openapiFields.add("idempotency_id");
    openapiFields.add("merchant");
    openapiFields.add("operation_key");
    openapiFields.add("source");
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
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()  && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
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
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()  && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `3d_secure_authentication`
     // if (jsonObj.getAsJsonObject("3d_secure_authentication") != null) {
       //CreateAuthorizationRequest3dSecureAuthentication.validateJsonObject(jsonObj.getAsJsonObject("3d_secure_authentication"));
     // }

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

