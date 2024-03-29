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
 * ListAuthorizationsQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListAuthorizationsQueryParams {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_AMOUNT_GT = "amount.gt";
  @SerializedName(SERIALIZED_NAME_AMOUNT_GT)
  private Long amountGt;

  public static final String SERIALIZED_NAME_AMOUNT_GTE = "amount.gte";
  @SerializedName(SERIALIZED_NAME_AMOUNT_GTE)
  private Long amountGte;

  public static final String SERIALIZED_NAME_AMOUNT_LT = "amount.lt";
  @SerializedName(SERIALIZED_NAME_AMOUNT_LT)
  private Long amountLt;

  public static final String SERIALIZED_NAME_AMOUNT_LTE = "amount.lte";
  @SerializedName(SERIALIZED_NAME_AMOUNT_LTE)
  private Long amountLte;

  public static final String SERIALIZED_NAME_BEFORE_CURSOR = "before_cursor";
  @SerializedName(SERIALIZED_NAME_BEFORE_CURSOR)
  private String beforeCursor;

  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "created_at.gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "created_at.lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_ID = "idempotency_id";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_ID)
  private String idempotencyId;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_UPDATED_AT_GTE = "updated_at.gte";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_GTE)
  private String updatedAtGte;

  public static final String SERIALIZED_NAME_UPDATED_AT_LTE = "updated_at.lte";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_LTE)
  private String updatedAtLte;

  public static final String SERIALIZED_NAME_TRACE_ID = "trace_id";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_IS_VOID = "is_void";
  @SerializedName(SERIALIZED_NAME_IS_VOID)
  private String isVoid;

  public static final String SERIALIZED_NAME_INSTRUMENT_BIN = "instrument_bin";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_BIN)
  private String instrumentBin;

  public static final String SERIALIZED_NAME_INSTRUMENT_ACCOUNT_LAST4 = "instrument_account_last4";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ACCOUNT_LAST4)
  private String instrumentAccountLast4;

  public static final String SERIALIZED_NAME_INSTRUMENT_BRAND_TYPE = "instrument_brand_type";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_BRAND_TYPE)
  private String instrumentBrandType;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY_ID = "merchant_identity_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY_ID)
  private String merchantIdentityId;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY_NAME = "merchant_identity_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY_NAME)
  private String merchantIdentityName;

  public static final String SERIALIZED_NAME_INSTRUMENT_NAME = "instrument_name";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_NAME)
  private String instrumentName;

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrument_type";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private String instrumentType;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MERCHANT_MID = "merchant_mid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_MID)
  private String merchantMid;

  public static final String SERIALIZED_NAME_INSTRUMENT_CARD_LAST4 = "instrument_card_last4";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_CARD_LAST4)
  private String instrumentCardLast4;

  public static final String SERIALIZED_NAME_MERCHANT_PROCESSOR_ID = "merchant_processor_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROCESSOR_ID)
  private String merchantProcessorId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AFTER_CURSOR = "after_cursor";
  @SerializedName(SERIALIZED_NAME_AFTER_CURSOR)
  private String afterCursor;

  public ListAuthorizationsQueryParams() { 
  }

  public ListAuthorizationsQueryParams amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Filter by an amount equal to the given value.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by an amount equal to the given value.")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public ListAuthorizationsQueryParams amountGt(Long amountGt) {
    
    this.amountGt = amountGt;
    return this;
  }

   /**
   * Filter by an amount greater than.
   * @return amountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by an amount greater than.")

  public Long getAmountGt() {
    return amountGt;
  }


  public void setAmountGt(Long amountGt) {
    this.amountGt = amountGt;
  }


  public ListAuthorizationsQueryParams amountGte(Long amountGte) {
    
    this.amountGte = amountGte;
    return this;
  }

   /**
   * Filter by an amount greater than or equal.
   * @return amountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by an amount greater than or equal.")

  public Long getAmountGte() {
    return amountGte;
  }


  public void setAmountGte(Long amountGte) {
    this.amountGte = amountGte;
  }


  public ListAuthorizationsQueryParams amountLt(Long amountLt) {
    
    this.amountLt = amountLt;
    return this;
  }

   /**
   * Filter by an amount less than.
   * @return amountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by an amount less than.")

  public Long getAmountLt() {
    return amountLt;
  }


  public void setAmountLt(Long amountLt) {
    this.amountLt = amountLt;
  }


  public ListAuthorizationsQueryParams amountLte(Long amountLte) {
    
    this.amountLte = amountLte;
    return this;
  }

   /**
   * Filter by an amount less than or equal.
   * @return amountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by an amount less than or equal.")

  public Long getAmountLte() {
    return amountLte;
  }


  public void setAmountLte(Long amountLte) {
    this.amountLte = amountLte;
  }


  public ListAuthorizationsQueryParams beforeCursor(String beforeCursor) {
    
    this.beforeCursor = beforeCursor;
    return this;
  }

   /**
   * Return every resource created before the cursor value.
   * @return beforeCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return every resource created before the cursor value.")

  public String getBeforeCursor() {
    return beforeCursor;
  }


  public void setBeforeCursor(String beforeCursor) {
    this.beforeCursor = beforeCursor;
  }


  public ListAuthorizationsQueryParams createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Filter where &#x60;created_at&#x60; is after the given date.
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `created_at` is after the given date.")

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public ListAuthorizationsQueryParams createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Filter where &#x60;created_at&#x60; is before the given date.
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `created_at` is before the given date.")

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public ListAuthorizationsQueryParams idempotencyId(String idempotencyId) {
    
    this.idempotencyId = idempotencyId;
    return this;
  }

   /**
   * Filter by &#x60;idempotency_id&#x60;.
   * @return idempotencyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `idempotency_id`.")

  public String getIdempotencyId() {
    return idempotencyId;
  }


  public void setIdempotencyId(String idempotencyId) {
    this.idempotencyId = idempotencyId;
  }


  public ListAuthorizationsQueryParams limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The numbers of items to return.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numbers of items to return.")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public ListAuthorizationsQueryParams sort(String sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Specify key to be used for sorting the collection.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify key to be used for sorting the collection.")

  public String getSort() {
    return sort;
  }


  public void setSort(String sort) {
    this.sort = sort;
  }


  public ListAuthorizationsQueryParams state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Filter by Transaction state.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by Transaction state.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public ListAuthorizationsQueryParams updatedAtGte(String updatedAtGte) {
    
    this.updatedAtGte = updatedAtGte;
    return this;
  }

   /**
   * Filter where &#x60;updated_at&#x60; is after the given date.
   * @return updatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `updated_at` is after the given date.")

  public String getUpdatedAtGte() {
    return updatedAtGte;
  }


  public void setUpdatedAtGte(String updatedAtGte) {
    this.updatedAtGte = updatedAtGte;
  }


  public ListAuthorizationsQueryParams updatedAtLte(String updatedAtLte) {
    
    this.updatedAtLte = updatedAtLte;
    return this;
  }

   /**
   * Filter where &#x60;updated_at&#x60; is before the given date.
   * @return updatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `updated_at` is before the given date.")

  public String getUpdatedAtLte() {
    return updatedAtLte;
  }


  public void setUpdatedAtLte(String updatedAtLte) {
    this.updatedAtLte = updatedAtLte;
  }


  public ListAuthorizationsQueryParams traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * Filter by &#x60;trace_id&#x60;.
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `trace_id`.")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public ListAuthorizationsQueryParams isVoid(String isVoid) {
    
    this.isVoid = isVoid;
    return this;
  }

   /**
   * Filter by &#x60;idempotency_id&#x60;.
   * @return isVoid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `idempotency_id`.")

  public String getIsVoid() {
    return isVoid;
  }


  public void setIsVoid(String isVoid) {
    this.isVoid = isVoid;
  }


  public ListAuthorizationsQueryParams instrumentBin(String instrumentBin) {
    
    this.instrumentBin = instrumentBin;
    return this;
  }

   /**
   * Filter by Bank Identification Number (BIN). The BIN is the first 6 digits of the masked number.
   * @return instrumentBin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by Bank Identification Number (BIN). The BIN is the first 6 digits of the masked number.")

  public String getInstrumentBin() {
    return instrumentBin;
  }


  public void setInstrumentBin(String instrumentBin) {
    this.instrumentBin = instrumentBin;
  }


  public ListAuthorizationsQueryParams instrumentAccountLast4(String instrumentAccountLast4) {
    
    this.instrumentAccountLast4 = instrumentAccountLast4;
    return this;
  }

   /**
   * Filter Transactions by the last 4 digits of the bank account. The bank account last 4 are the last 4 digits of the masked number instrument_account_last4&#x3D;9444 BIN.
   * @return instrumentAccountLast4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter Transactions by the last 4 digits of the bank account. The bank account last 4 are the last 4 digits of the masked number instrument_account_last4=9444 BIN.")

  public String getInstrumentAccountLast4() {
    return instrumentAccountLast4;
  }


  public void setInstrumentAccountLast4(String instrumentAccountLast4) {
    this.instrumentAccountLast4 = instrumentAccountLast4;
  }


  public ListAuthorizationsQueryParams instrumentBrandType(String instrumentBrandType) {
    
    this.instrumentBrandType = instrumentBrandType;
    return this;
  }

   /**
   * Filter by card brand. Available card brand types can be found in the drop-down.
   * @return instrumentBrandType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by card brand. Available card brand types can be found in the drop-down.")

  public String getInstrumentBrandType() {
    return instrumentBrandType;
  }


  public void setInstrumentBrandType(String instrumentBrandType) {
    this.instrumentBrandType = instrumentBrandType;
  }


  public ListAuthorizationsQueryParams merchantIdentityId(String merchantIdentityId) {
    
    this.merchantIdentityId = merchantIdentityId;
    return this;
  }

   /**
   * Filter by &#x60;Identity&#x60; ID.
   * @return merchantIdentityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `Identity` ID.")

  public String getMerchantIdentityId() {
    return merchantIdentityId;
  }


  public void setMerchantIdentityId(String merchantIdentityId) {
    this.merchantIdentityId = merchantIdentityId;
  }


  public ListAuthorizationsQueryParams merchantIdentityName(String merchantIdentityName) {
    
    this.merchantIdentityName = merchantIdentityName;
    return this;
  }

   /**
   * Filter Transactions by &#x60;Identity&#x60; name. The name is not case-sensitive.
   * @return merchantIdentityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter Transactions by `Identity` name. The name is not case-sensitive.")

  public String getMerchantIdentityName() {
    return merchantIdentityName;
  }


  public void setMerchantIdentityName(String merchantIdentityName) {
    this.merchantIdentityName = merchantIdentityName;
  }


  public ListAuthorizationsQueryParams instrumentName(String instrumentName) {
    
    this.instrumentName = instrumentName;
    return this;
  }

   /**
   * Filter Transactions by &#x60;Payment Instrument&#x60; name.
   * @return instrumentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter Transactions by `Payment Instrument` name.")

  public String getInstrumentName() {
    return instrumentName;
  }


  public void setInstrumentName(String instrumentName) {
    this.instrumentName = instrumentName;
  }


  public ListAuthorizationsQueryParams instrumentType(String instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * Filter Transactions by &#x60;Payment Instrument&#x60; type. Available instrument types include: Bank Account or Payment Card.
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter Transactions by `Payment Instrument` type. Available instrument types include: Bank Account or Payment Card.")

  public String getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }


  public ListAuthorizationsQueryParams merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Filter by &#x60;Merchant&#x60; ID.
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `Merchant` ID.")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public ListAuthorizationsQueryParams merchantMid(String merchantMid) {
    
    this.merchantMid = merchantMid;
    return this;
  }

   /**
   * Filter by Merchant Identification Number (MID).
   * @return merchantMid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by Merchant Identification Number (MID).")

  public String getMerchantMid() {
    return merchantMid;
  }


  public void setMerchantMid(String merchantMid) {
    this.merchantMid = merchantMid;
  }


  public ListAuthorizationsQueryParams instrumentCardLast4(String instrumentCardLast4) {
    
    this.instrumentCardLast4 = instrumentCardLast4;
    return this;
  }

   /**
   * Filter by the payment card last 4 digits.
   * @return instrumentCardLast4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the payment card last 4 digits.")

  public String getInstrumentCardLast4() {
    return instrumentCardLast4;
  }


  public void setInstrumentCardLast4(String instrumentCardLast4) {
    this.instrumentCardLast4 = instrumentCardLast4;
  }


  public ListAuthorizationsQueryParams merchantProcessorId(String merchantProcessorId) {
    
    this.merchantProcessorId = merchantProcessorId;
    return this;
  }

   /**
   * Filter by &#x60;Processor&#x60; ID.
   * @return merchantProcessorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `Processor` ID.")

  public String getMerchantProcessorId() {
    return merchantProcessorId;
  }


  public void setMerchantProcessorId(String merchantProcessorId) {
    this.merchantProcessorId = merchantProcessorId;
  }


  public ListAuthorizationsQueryParams type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the &#x60;Authorization&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the `Authorization`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ListAuthorizationsQueryParams afterCursor(String afterCursor) {
    
    this.afterCursor = afterCursor;
    return this;
  }

   /**
   * Return every resource created after the cursor value.
   * @return afterCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return every resource created after the cursor value.")

  public String getAfterCursor() {
    return afterCursor;
  }


  public void setAfterCursor(String afterCursor) {
    this.afterCursor = afterCursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAuthorizationsQueryParams listAuthorizationsQueryParams = (ListAuthorizationsQueryParams) o;
    return Objects.equals(this.amount, listAuthorizationsQueryParams.amount) &&
        Objects.equals(this.amountGt, listAuthorizationsQueryParams.amountGt) &&
        Objects.equals(this.amountGte, listAuthorizationsQueryParams.amountGte) &&
        Objects.equals(this.amountLt, listAuthorizationsQueryParams.amountLt) &&
        Objects.equals(this.amountLte, listAuthorizationsQueryParams.amountLte) &&
        Objects.equals(this.beforeCursor, listAuthorizationsQueryParams.beforeCursor) &&
        Objects.equals(this.createdAtGte, listAuthorizationsQueryParams.createdAtGte) &&
        Objects.equals(this.createdAtLte, listAuthorizationsQueryParams.createdAtLte) &&
        Objects.equals(this.idempotencyId, listAuthorizationsQueryParams.idempotencyId) &&
        Objects.equals(this.limit, listAuthorizationsQueryParams.limit) &&
        Objects.equals(this.sort, listAuthorizationsQueryParams.sort) &&
        Objects.equals(this.state, listAuthorizationsQueryParams.state) &&
        Objects.equals(this.updatedAtGte, listAuthorizationsQueryParams.updatedAtGte) &&
        Objects.equals(this.updatedAtLte, listAuthorizationsQueryParams.updatedAtLte) &&
        Objects.equals(this.traceId, listAuthorizationsQueryParams.traceId) &&
        Objects.equals(this.isVoid, listAuthorizationsQueryParams.isVoid) &&
        Objects.equals(this.instrumentBin, listAuthorizationsQueryParams.instrumentBin) &&
        Objects.equals(this.instrumentAccountLast4, listAuthorizationsQueryParams.instrumentAccountLast4) &&
        Objects.equals(this.instrumentBrandType, listAuthorizationsQueryParams.instrumentBrandType) &&
        Objects.equals(this.merchantIdentityId, listAuthorizationsQueryParams.merchantIdentityId) &&
        Objects.equals(this.merchantIdentityName, listAuthorizationsQueryParams.merchantIdentityName) &&
        Objects.equals(this.instrumentName, listAuthorizationsQueryParams.instrumentName) &&
        Objects.equals(this.instrumentType, listAuthorizationsQueryParams.instrumentType) &&
        Objects.equals(this.merchantId, listAuthorizationsQueryParams.merchantId) &&
        Objects.equals(this.merchantMid, listAuthorizationsQueryParams.merchantMid) &&
        Objects.equals(this.instrumentCardLast4, listAuthorizationsQueryParams.instrumentCardLast4) &&
        Objects.equals(this.merchantProcessorId, listAuthorizationsQueryParams.merchantProcessorId) &&
        Objects.equals(this.type, listAuthorizationsQueryParams.type) &&
        Objects.equals(this.afterCursor, listAuthorizationsQueryParams.afterCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountGt, amountGte, amountLt, amountLte, beforeCursor, createdAtGte, createdAtLte, idempotencyId, limit, sort, state, updatedAtGte, updatedAtLte, traceId, isVoid, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type, afterCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAuthorizationsQueryParams {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountGt: ").append(toIndentedString(amountGt)).append("\n");
    sb.append("    amountGte: ").append(toIndentedString(amountGte)).append("\n");
    sb.append("    amountLt: ").append(toIndentedString(amountLt)).append("\n");
    sb.append("    amountLte: ").append(toIndentedString(amountLte)).append("\n");
    sb.append("    beforeCursor: ").append(toIndentedString(beforeCursor)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    idempotencyId: ").append(toIndentedString(idempotencyId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
    sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    isVoid: ").append(toIndentedString(isVoid)).append("\n");
    sb.append("    instrumentBin: ").append(toIndentedString(instrumentBin)).append("\n");
    sb.append("    instrumentAccountLast4: ").append(toIndentedString(instrumentAccountLast4)).append("\n");
    sb.append("    instrumentBrandType: ").append(toIndentedString(instrumentBrandType)).append("\n");
    sb.append("    merchantIdentityId: ").append(toIndentedString(merchantIdentityId)).append("\n");
    sb.append("    merchantIdentityName: ").append(toIndentedString(merchantIdentityName)).append("\n");
    sb.append("    instrumentName: ").append(toIndentedString(instrumentName)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantMid: ").append(toIndentedString(merchantMid)).append("\n");
    sb.append("    instrumentCardLast4: ").append(toIndentedString(instrumentCardLast4)).append("\n");
    sb.append("    merchantProcessorId: ").append(toIndentedString(merchantProcessorId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    afterCursor: ").append(toIndentedString(afterCursor)).append("\n");
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
    openapiFields.add("amount.gt");
    openapiFields.add("amount.gte");
    openapiFields.add("amount.lt");
    openapiFields.add("amount.lte");
    openapiFields.add("before_cursor");
    openapiFields.add("created_at.gte");
    openapiFields.add("created_at.lte");
    openapiFields.add("idempotency_id");
    openapiFields.add("limit");
    openapiFields.add("sort");
    openapiFields.add("state");
    openapiFields.add("updated_at.gte");
    openapiFields.add("updated_at.lte");
    openapiFields.add("trace_id");
    openapiFields.add("is_void");
    openapiFields.add("instrument_bin");
    openapiFields.add("instrument_account_last4");
    openapiFields.add("instrument_brand_type");
    openapiFields.add("merchant_identity_id");
    openapiFields.add("merchant_identity_name");
    openapiFields.add("instrument_name");
    openapiFields.add("instrument_type");
    openapiFields.add("merchant_id");
    openapiFields.add("merchant_mid");
    openapiFields.add("instrument_card_last4");
    openapiFields.add("merchant_processor_id");
    openapiFields.add("type");
    openapiFields.add("after_cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAuthorizationsQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListAuthorizationsQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAuthorizationsQueryParams is not found in the empty JSON string", ListAuthorizationsQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAuthorizationsQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAuthorizationsQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("before_cursor") != null && !jsonObj.get("before_cursor").isJsonNull()  && !jsonObj.get("before_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `before_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("before_cursor").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("created_at.gte") != null && !jsonObj.get("created_at.gte").isJsonNull()  && !jsonObj.get("created_at.gte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at.gte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at.gte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("created_at.lte") != null && !jsonObj.get("created_at.lte").isJsonNull()  && !jsonObj.get("created_at.lte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at.lte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at.lte").toString()));
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
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()  && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
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
      if (jsonObj.get("updated_at.gte") != null && !jsonObj.get("updated_at.gte").isJsonNull()  && !jsonObj.get("updated_at.gte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at.gte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at.gte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("updated_at.lte") != null && !jsonObj.get("updated_at.lte").isJsonNull()  && !jsonObj.get("updated_at.lte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at.lte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at.lte").toString()));
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
      if (jsonObj.get("is_void") != null && !jsonObj.get("is_void").isJsonNull()  && !jsonObj.get("is_void").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_void` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_void").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("instrument_bin") != null && !jsonObj.get("instrument_bin").isJsonNull()  && !jsonObj.get("instrument_bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_bin").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("instrument_account_last4") != null && !jsonObj.get("instrument_account_last4").isJsonNull()  && !jsonObj.get("instrument_account_last4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_account_last4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_account_last4").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("instrument_brand_type") != null && !jsonObj.get("instrument_brand_type").isJsonNull()  && !jsonObj.get("instrument_brand_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_brand_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_brand_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_identity_id") != null && !jsonObj.get("merchant_identity_id").isJsonNull()  && !jsonObj.get("merchant_identity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_identity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_identity_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_identity_name") != null && !jsonObj.get("merchant_identity_name").isJsonNull()  && !jsonObj.get("merchant_identity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_identity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_identity_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("instrument_name") != null && !jsonObj.get("instrument_name").isJsonNull()  && !jsonObj.get("instrument_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("instrument_type") != null && !jsonObj.get("instrument_type").isJsonNull()  && !jsonObj.get("instrument_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_type").toString()));
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
      if (jsonObj.get("merchant_mid") != null && !jsonObj.get("merchant_mid").isJsonNull()  && !jsonObj.get("merchant_mid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_mid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_mid").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("instrument_card_last4") != null && !jsonObj.get("instrument_card_last4").isJsonNull()  && !jsonObj.get("instrument_card_last4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_card_last4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_card_last4").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_processor_id") != null && !jsonObj.get("merchant_processor_id").isJsonNull()  && !jsonObj.get("merchant_processor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_processor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_processor_id").toString()));
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
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("after_cursor") != null && !jsonObj.get("after_cursor").isJsonNull()  && !jsonObj.get("after_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after_cursor").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAuthorizationsQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAuthorizationsQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAuthorizationsQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAuthorizationsQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAuthorizationsQueryParams>() {
           @Override
           public void write(JsonWriter out, ListAuthorizationsQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAuthorizationsQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAuthorizationsQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAuthorizationsQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListAuthorizationsQueryParams
  */
  public static ListAuthorizationsQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAuthorizationsQueryParams.class);
  }

 /**
  * Convert an instance of ListAuthorizationsQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

