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
 * UpdateMerchantRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateMerchantRequest {
  public static final String SERIALIZED_NAME_CARD_CVV_REQUIRED = "card_cvv_required";
  @SerializedName(SERIALIZED_NAME_CARD_CVV_REQUIRED)
  private Boolean cardCvvRequired;

  public static final String SERIALIZED_NAME_CARD_EXPIRATION_DATE_REQUIRED = "card_expiration_date_required";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRATION_DATE_REQUIRED)
  private Boolean cardExpirationDateRequired;

  public static final String SERIALIZED_NAME_CONVENIENCE_CHARGES_ENABLED = "convenience_charges_enabled";
  @SerializedName(SERIALIZED_NAME_CONVENIENCE_CHARGES_ENABLED)
  private Boolean convenienceChargesEnabled;

  public static final String SERIALIZED_NAME_CREATING_TRANSFER_FROM_REPORT_ENABLED = "creating_transfer_from_report_enabled";
  @SerializedName(SERIALIZED_NAME_CREATING_TRANSFER_FROM_REPORT_ENABLED)
  private Boolean creatingTransferFromReportEnabled;

  public static final String SERIALIZED_NAME_FEE_READY_TO_SETTLE_UPON = "fee_ready_to_settle_upon";
  @SerializedName(SERIALIZED_NAME_FEE_READY_TO_SETTLE_UPON)
  private String feeReadyToSettleUpon;

  public static final String SERIALIZED_NAME_GROSS_SETTLEMENT_ENABLED = "gross_settlement_enabled";
  @SerializedName(SERIALIZED_NAME_GROSS_SETTLEMENT_ENABLED)
  private Boolean grossSettlementEnabled;

  public static final String SERIALIZED_NAME_LEVEL_TWO_LEVEL_THREE_DATA_ENABLED = "level_two_level_three_data_enabled";
  @SerializedName(SERIALIZED_NAME_LEVEL_TWO_LEVEL_THREE_DATA_ENABLED)
  private Boolean levelTwoLevelThreeDataEnabled;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_PROCESSING_ENABLED = "processing_enabled";
  @SerializedName(SERIALIZED_NAME_PROCESSING_ENABLED)
  private Boolean processingEnabled;

  public static final String SERIALIZED_NAME_READY_TO_SETTLE_UPON = "ready_to_settle_upon";
  @SerializedName(SERIALIZED_NAME_READY_TO_SETTLE_UPON)
  private String readyToSettleUpon;

  public static final String SERIALIZED_NAME_RENT_SURCHARGES_ENABLED = "rent_surcharges_enabled";
  @SerializedName(SERIALIZED_NAME_RENT_SURCHARGES_ENABLED)
  private Boolean rentSurchargesEnabled;

  public static final String SERIALIZED_NAME_SETTLEMENT_ENABLED = "settlement_enabled";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ENABLED)
  private Boolean settlementEnabled;

  public static final String SERIALIZED_NAME_SETTLEMENT_FUNDING_IDENTIFIER = "settlement_funding_identifier";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_FUNDING_IDENTIFIER)
  private String settlementFundingIdentifier;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public UpdateMerchantRequest() { 
  }

  public UpdateMerchantRequest cardCvvRequired(Boolean cardCvvRequired) {
    
    this.cardCvvRequired = cardCvvRequired;
    return this;
  }

   /**
   * Set to **true** to require the card&#39;s CVV code.
   * @return cardCvvRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** to require the card's CVV code.")

  public Boolean getCardCvvRequired() {
    return cardCvvRequired;
  }


  public void setCardCvvRequired(Boolean cardCvvRequired) {
    this.cardCvvRequired = cardCvvRequired;
  }


  public UpdateMerchantRequest cardExpirationDateRequired(Boolean cardExpirationDateRequired) {
    
    this.cardExpirationDateRequired = cardExpirationDateRequired;
    return this;
  }

   /**
   * Set to **true** to require the card&#39;s expiration date.
   * @return cardExpirationDateRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** to require the card's expiration date.")

  public Boolean getCardExpirationDateRequired() {
    return cardExpirationDateRequired;
  }


  public void setCardExpirationDateRequired(Boolean cardExpirationDateRequired) {
    this.cardExpirationDateRequired = cardExpirationDateRequired;
  }


  public UpdateMerchantRequest convenienceChargesEnabled(Boolean convenienceChargesEnabled) {
    
    this.convenienceChargesEnabled = convenienceChargesEnabled;
    return this;
  }

   /**
   * Set to **true** if you want to enable the &#x60;Merchant&#x60; to accept convenience fees and/or service fees.
   * @return convenienceChargesEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** if you want to enable the `Merchant` to accept convenience fees and/or service fees.")

  public Boolean getConvenienceChargesEnabled() {
    return convenienceChargesEnabled;
  }


  public void setConvenienceChargesEnabled(Boolean convenienceChargesEnabled) {
    this.convenienceChargesEnabled = convenienceChargesEnabled;
  }


  public UpdateMerchantRequest creatingTransferFromReportEnabled(Boolean creatingTransferFromReportEnabled) {
    
    this.creatingTransferFromReportEnabled = creatingTransferFromReportEnabled;
    return this;
  }

   /**
   * Set to **true** to automatically create &#x60;Transfers&#x60; once settlement reports get generated.
   * @return creatingTransferFromReportEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** to automatically create `Transfers` once settlement reports get generated.")

  public Boolean getCreatingTransferFromReportEnabled() {
    return creatingTransferFromReportEnabled;
  }


  public void setCreatingTransferFromReportEnabled(Boolean creatingTransferFromReportEnabled) {
    this.creatingTransferFromReportEnabled = creatingTransferFromReportEnabled;
  }


  public UpdateMerchantRequest feeReadyToSettleUpon(String feeReadyToSettleUpon) {
    
    this.feeReadyToSettleUpon = feeReadyToSettleUpon;
    return this;
  }

   /**
   * Details how the &#x60;Merchant&#x60; settles fees.
   * @return feeReadyToSettleUpon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details how the `Merchant` settles fees.")

  public String getFeeReadyToSettleUpon() {
    return feeReadyToSettleUpon;
  }


  public void setFeeReadyToSettleUpon(String feeReadyToSettleUpon) {
    this.feeReadyToSettleUpon = feeReadyToSettleUpon;
  }


  public UpdateMerchantRequest grossSettlementEnabled(Boolean grossSettlementEnabled) {
    
    this.grossSettlementEnabled = grossSettlementEnabled;
    return this;
  }

   /**
   * Set to **true** to enable gross settlements.
   * @return grossSettlementEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** to enable gross settlements.")

  public Boolean getGrossSettlementEnabled() {
    return grossSettlementEnabled;
  }


  public void setGrossSettlementEnabled(Boolean grossSettlementEnabled) {
    this.grossSettlementEnabled = grossSettlementEnabled;
  }


  public UpdateMerchantRequest levelTwoLevelThreeDataEnabled(Boolean levelTwoLevelThreeDataEnabled) {
    
    this.levelTwoLevelThreeDataEnabled = levelTwoLevelThreeDataEnabled;
    return this;
  }

   /**
   * Set to **true** to enable the &#x60;Merchant&#x60; for Level 2 and Level 3 processing. Default value is **false**.
   * @return levelTwoLevelThreeDataEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** to enable the `Merchant` for Level 2 and Level 3 processing. Default value is **false**.")

  public Boolean getLevelTwoLevelThreeDataEnabled() {
    return levelTwoLevelThreeDataEnabled;
  }


  public void setLevelTwoLevelThreeDataEnabled(Boolean levelTwoLevelThreeDataEnabled) {
    this.levelTwoLevelThreeDataEnabled = levelTwoLevelThreeDataEnabled;
  }


  public UpdateMerchantRequest merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The legal name saved in the &#x60;Merchant&#x60; resource.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The legal name saved in the `Merchant` resource.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public UpdateMerchantRequest processingEnabled(Boolean processingEnabled) {
    
    this.processingEnabled = processingEnabled;
    return this;
  }

   /**
   * Details if transaction processing is enabled for the &#x60;Merchant&#x60;.
   * @return processingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if transaction processing is enabled for the `Merchant`.")

  public Boolean getProcessingEnabled() {
    return processingEnabled;
  }


  public void setProcessingEnabled(Boolean processingEnabled) {
    this.processingEnabled = processingEnabled;
  }


  public UpdateMerchantRequest readyToSettleUpon(String readyToSettleUpon) {
    
    this.readyToSettleUpon = readyToSettleUpon;
    return this;
  }

   /**
   * Details how &#x60;Authorizations&#x60; captured by the &#x60;Merchant&#x60; are settled.
   * @return readyToSettleUpon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details how `Authorizations` captured by the `Merchant` are settled.")

  public String getReadyToSettleUpon() {
    return readyToSettleUpon;
  }


  public void setReadyToSettleUpon(String readyToSettleUpon) {
    this.readyToSettleUpon = readyToSettleUpon;
  }


  public UpdateMerchantRequest rentSurchargesEnabled(Boolean rentSurchargesEnabled) {
    
    this.rentSurchargesEnabled = rentSurchargesEnabled;
    return this;
  }

   /**
   * Set to **true** if you want to enable a &#x60;Merchant&#x60; to accept rent charges.
   * @return rentSurchargesEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** if you want to enable a `Merchant` to accept rent charges.")

  public Boolean getRentSurchargesEnabled() {
    return rentSurchargesEnabled;
  }


  public void setRentSurchargesEnabled(Boolean rentSurchargesEnabled) {
    this.rentSurchargesEnabled = rentSurchargesEnabled;
  }


  public UpdateMerchantRequest settlementEnabled(Boolean settlementEnabled) {
    
    this.settlementEnabled = settlementEnabled;
    return this;
  }

   /**
   * Details if settlement processing is enabled for the &#x60;Merchant&#x60;.
   * @return settlementEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if settlement processing is enabled for the `Merchant`.")

  public Boolean getSettlementEnabled() {
    return settlementEnabled;
  }


  public void setSettlementEnabled(Boolean settlementEnabled) {
    this.settlementEnabled = settlementEnabled;
  }


  public UpdateMerchantRequest settlementFundingIdentifier(String settlementFundingIdentifier) {
    
    this.settlementFundingIdentifier = settlementFundingIdentifier;
    return this;
  }

   /**
   * Include addtional information (like the MID) when submitting funding &#x60;Tranfers&#x60; to processors.
   * @return settlementFundingIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include addtional information (like the MID) when submitting funding `Tranfers` to processors.")

  public String getSettlementFundingIdentifier() {
    return settlementFundingIdentifier;
  }


  public void setSettlementFundingIdentifier(String settlementFundingIdentifier) {
    this.settlementFundingIdentifier = settlementFundingIdentifier;
  }


  public UpdateMerchantRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateMerchantRequest putTagsItem(String key, String tagsItem) {
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
    UpdateMerchantRequest updateMerchantRequest = (UpdateMerchantRequest) o;
    return Objects.equals(this.cardCvvRequired, updateMerchantRequest.cardCvvRequired) &&
        Objects.equals(this.cardExpirationDateRequired, updateMerchantRequest.cardExpirationDateRequired) &&
        Objects.equals(this.convenienceChargesEnabled, updateMerchantRequest.convenienceChargesEnabled) &&
        Objects.equals(this.creatingTransferFromReportEnabled, updateMerchantRequest.creatingTransferFromReportEnabled) &&
        Objects.equals(this.feeReadyToSettleUpon, updateMerchantRequest.feeReadyToSettleUpon) &&
        Objects.equals(this.grossSettlementEnabled, updateMerchantRequest.grossSettlementEnabled) &&
        Objects.equals(this.levelTwoLevelThreeDataEnabled, updateMerchantRequest.levelTwoLevelThreeDataEnabled) &&
        Objects.equals(this.merchantName, updateMerchantRequest.merchantName) &&
        Objects.equals(this.processingEnabled, updateMerchantRequest.processingEnabled) &&
        Objects.equals(this.readyToSettleUpon, updateMerchantRequest.readyToSettleUpon) &&
        Objects.equals(this.rentSurchargesEnabled, updateMerchantRequest.rentSurchargesEnabled) &&
        Objects.equals(this.settlementEnabled, updateMerchantRequest.settlementEnabled) &&
        Objects.equals(this.settlementFundingIdentifier, updateMerchantRequest.settlementFundingIdentifier) &&
        Objects.equals(this.tags, updateMerchantRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCvvRequired, cardExpirationDateRequired, convenienceChargesEnabled, creatingTransferFromReportEnabled, feeReadyToSettleUpon, grossSettlementEnabled, levelTwoLevelThreeDataEnabled, merchantName, processingEnabled, readyToSettleUpon, rentSurchargesEnabled, settlementEnabled, settlementFundingIdentifier, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMerchantRequest {\n");
    sb.append("    cardCvvRequired: ").append(toIndentedString(cardCvvRequired)).append("\n");
    sb.append("    cardExpirationDateRequired: ").append(toIndentedString(cardExpirationDateRequired)).append("\n");
    sb.append("    convenienceChargesEnabled: ").append(toIndentedString(convenienceChargesEnabled)).append("\n");
    sb.append("    creatingTransferFromReportEnabled: ").append(toIndentedString(creatingTransferFromReportEnabled)).append("\n");
    sb.append("    feeReadyToSettleUpon: ").append(toIndentedString(feeReadyToSettleUpon)).append("\n");
    sb.append("    grossSettlementEnabled: ").append(toIndentedString(grossSettlementEnabled)).append("\n");
    sb.append("    levelTwoLevelThreeDataEnabled: ").append(toIndentedString(levelTwoLevelThreeDataEnabled)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    processingEnabled: ").append(toIndentedString(processingEnabled)).append("\n");
    sb.append("    readyToSettleUpon: ").append(toIndentedString(readyToSettleUpon)).append("\n");
    sb.append("    rentSurchargesEnabled: ").append(toIndentedString(rentSurchargesEnabled)).append("\n");
    sb.append("    settlementEnabled: ").append(toIndentedString(settlementEnabled)).append("\n");
    sb.append("    settlementFundingIdentifier: ").append(toIndentedString(settlementFundingIdentifier)).append("\n");
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
    openapiFields.add("card_cvv_required");
    openapiFields.add("card_expiration_date_required");
    openapiFields.add("convenience_charges_enabled");
    openapiFields.add("creating_transfer_from_report_enabled");
    openapiFields.add("fee_ready_to_settle_upon");
    openapiFields.add("gross_settlement_enabled");
    openapiFields.add("level_two_level_three_data_enabled");
    openapiFields.add("merchant_name");
    openapiFields.add("processing_enabled");
    openapiFields.add("ready_to_settle_upon");
    openapiFields.add("rent_surcharges_enabled");
    openapiFields.add("settlement_enabled");
    openapiFields.add("settlement_funding_identifier");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateMerchantRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateMerchantRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateMerchantRequest is not found in the empty JSON string", UpdateMerchantRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateMerchantRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateMerchantRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fee_ready_to_settle_upon") != null && !jsonObj.get("fee_ready_to_settle_upon").isJsonNull()  && !jsonObj.get("fee_ready_to_settle_upon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_ready_to_settle_upon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_ready_to_settle_upon").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonNull()  && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("ready_to_settle_upon") != null && !jsonObj.get("ready_to_settle_upon").isJsonNull()  && !jsonObj.get("ready_to_settle_upon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ready_to_settle_upon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ready_to_settle_upon").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("settlement_funding_identifier") != null && !jsonObj.get("settlement_funding_identifier").isJsonNull()  && !jsonObj.get("settlement_funding_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_funding_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_funding_identifier").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateMerchantRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateMerchantRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateMerchantRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateMerchantRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateMerchantRequest>() {
           @Override
           public void write(JsonWriter out, UpdateMerchantRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateMerchantRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateMerchantRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateMerchantRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateMerchantRequest
  */
  public static UpdateMerchantRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMerchantRequest.class);
  }

 /**
  * Convert an instance of UpdateMerchantRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

