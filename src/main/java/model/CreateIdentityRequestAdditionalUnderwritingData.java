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
import model.CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution;
import model.CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType;

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
 * Addition underwriting details required to verify &#x60;Identities&#x60;.
 */
@ApiModel(description = "Addition underwriting details required to verify `Identities`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateIdentityRequestAdditionalUnderwritingData {
  public static final String SERIALIZED_NAME_ANNUAL_ACH_VOLUME = "annual_ach_volume";
  @SerializedName(SERIALIZED_NAME_ANNUAL_ACH_VOLUME)
  private Long annualAchVolume;

  public static final String SERIALIZED_NAME_AVERAGE_ACH_TRANSFER_AMOUNT = "average_ach_transfer_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_ACH_TRANSFER_AMOUNT)
  private Long averageAchTransferAmount;

  public static final String SERIALIZED_NAME_AVERAGE_CARD_TRANSFER_AMOUNT = "average_card_transfer_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_CARD_TRANSFER_AMOUNT)
  private Long averageCardTransferAmount;

  public static final String SERIALIZED_NAME_BUSINESS_DESCRIPTION = "business_description";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DESCRIPTION)
  private String businessDescription;

  public static final String SERIALIZED_NAME_CREDIT_CHECK_ALLOWED = "credit_check_allowed";
  @SerializedName(SERIALIZED_NAME_CREDIT_CHECK_ALLOWED)
  private Boolean creditCheckAllowed;

  public static final String SERIALIZED_NAME_CREDIT_CHECK_IP_ADDRESS = "credit_check_ip_address";
  @SerializedName(SERIALIZED_NAME_CREDIT_CHECK_IP_ADDRESS)
  private String creditCheckIpAddress;

  public static final String SERIALIZED_NAME_CREDIT_CHECK_TIMESTAMP = "credit_check_timestamp";
  @SerializedName(SERIALIZED_NAME_CREDIT_CHECK_TIMESTAMP)
  private String creditCheckTimestamp;

  public static final String SERIALIZED_NAME_CREDIT_CHECK_USER_AGENT = "credit_check_user_agent";
  @SerializedName(SERIALIZED_NAME_CREDIT_CHECK_USER_AGENT)
  private String creditCheckUserAgent;

  public static final String SERIALIZED_NAME_CARD_VOLUME_DISTRIBUTION = "card_volume_distribution";
  @SerializedName(SERIALIZED_NAME_CARD_VOLUME_DISTRIBUTION)
  private CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution cardVolumeDistribution;

  public static final String SERIALIZED_NAME_MERCHANT_AGREEMENT_ACCEPTED = "merchant_agreement_accepted";
  @SerializedName(SERIALIZED_NAME_MERCHANT_AGREEMENT_ACCEPTED)
  private Boolean merchantAgreementAccepted;

  public static final String SERIALIZED_NAME_MERCHANT_AGREEMENT_IP_ADDRESS = "merchant_agreement_ip_address";
  @SerializedName(SERIALIZED_NAME_MERCHANT_AGREEMENT_IP_ADDRESS)
  private String merchantAgreementIpAddress;

  public static final String SERIALIZED_NAME_MERCHANT_AGREEMENT_TIMESTAMP = "merchant_agreement_timestamp";
  @SerializedName(SERIALIZED_NAME_MERCHANT_AGREEMENT_TIMESTAMP)
  private String merchantAgreementTimestamp;

  public static final String SERIALIZED_NAME_MERCHANT_AGREEMENT_USER_AGENT = "merchant_agreement_user_agent";
  @SerializedName(SERIALIZED_NAME_MERCHANT_AGREEMENT_USER_AGENT)
  private String merchantAgreementUserAgent;

  /**
   * The details of the browser that was used when this merchant consented to a credit check (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)).
   */
  @JsonAdapter(RefundPolicyEnum.Adapter.class)
  public enum RefundPolicyEnum {
    NO_REFUNDS("NO_REFUNDS"),
    
    MERCHANDISE_EXCHANGE_ONLY("MERCHANDISE_EXCHANGE_ONLY"),
    
    _30_DAYS("30_DAYS"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    RefundPolicyEnum(String value) {
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

    public static RefundPolicyEnum fromValue(String value) {
        for (RefundPolicyEnum b : RefundPolicyEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        RefundPolicyEnum unknownDefault = RefundPolicyEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<RefundPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefundPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefundPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefundPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFUND_POLICY = "refund_policy";
  @SerializedName(SERIALIZED_NAME_REFUND_POLICY)
  private RefundPolicyEnum refundPolicy;

  public static final String SERIALIZED_NAME_VOLUME_DISTRIBUTION_BY_BUSINESS_TYPE = "volume_distribution_by_business_type";
  @SerializedName(SERIALIZED_NAME_VOLUME_DISTRIBUTION_BY_BUSINESS_TYPE)
  private CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType volumeDistributionByBusinessType;

  public CreateIdentityRequestAdditionalUnderwritingData() { 
  }

  public CreateIdentityRequestAdditionalUnderwritingData annualAchVolume(Long annualAchVolume) {
    
    this.annualAchVolume = annualAchVolume;
    return this;
  }

   /**
   * The approximate annual ACH sales expected to be processed (in cents) by this merchant (max 10 characters).
   * @return annualAchVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The approximate annual ACH sales expected to be processed (in cents) by this merchant (max 10 characters).")

  public Long getAnnualAchVolume() {
    return annualAchVolume;
  }


  public void setAnnualAchVolume(Long annualAchVolume) {
    this.annualAchVolume = annualAchVolume;
  }


  public CreateIdentityRequestAdditionalUnderwritingData averageAchTransferAmount(Long averageAchTransferAmount) {
    
    this.averageAchTransferAmount = averageAchTransferAmount;
    return this;
  }

   /**
   * The approximate average ACH sale amount (in cents) for this merchant.
   * @return averageAchTransferAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The approximate average ACH sale amount (in cents) for this merchant.")

  public Long getAverageAchTransferAmount() {
    return averageAchTransferAmount;
  }


  public void setAverageAchTransferAmount(Long averageAchTransferAmount) {
    this.averageAchTransferAmount = averageAchTransferAmount;
  }


  public CreateIdentityRequestAdditionalUnderwritingData averageCardTransferAmount(Long averageCardTransferAmount) {
    
    this.averageCardTransferAmount = averageCardTransferAmount;
    return this;
  }

   /**
   * The average credit card sale amount (in cents) for this merchant.
   * @return averageCardTransferAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average credit card sale amount (in cents) for this merchant.")

  public Long getAverageCardTransferAmount() {
    return averageCardTransferAmount;
  }


  public void setAverageCardTransferAmount(Long averageCardTransferAmount) {
    this.averageCardTransferAmount = averageCardTransferAmount;
  }


  public CreateIdentityRequestAdditionalUnderwritingData businessDescription(String businessDescription) {
    
    this.businessDescription = businessDescription;
    return this;
  }

   /**
   * Description of this merchant&#39;s business (max 200 characters).
   * @return businessDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of this merchant's business (max 200 characters).")

  public String getBusinessDescription() {
    return businessDescription;
  }


  public void setBusinessDescription(String businessDescription) {
    this.businessDescription = businessDescription;
  }


  public CreateIdentityRequestAdditionalUnderwritingData creditCheckAllowed(Boolean creditCheckAllowed) {
    
    this.creditCheckAllowed = creditCheckAllowed;
    return this;
  }

   /**
   * Sets if this merchant has consented and accepted to a credit check.
   * @return creditCheckAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets if this merchant has consented and accepted to a credit check.")

  public Boolean getCreditCheckAllowed() {
    return creditCheckAllowed;
  }


  public void setCreditCheckAllowed(Boolean creditCheckAllowed) {
    this.creditCheckAllowed = creditCheckAllowed;
  }


  public CreateIdentityRequestAdditionalUnderwritingData creditCheckIpAddress(String creditCheckIpAddress) {
    
    this.creditCheckIpAddress = creditCheckIpAddress;
    return this;
  }

   /**
   * The IP address of the merchant when they consented to a credit check (e.g., 42.1.1.113 ).
   * @return creditCheckIpAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP address of the merchant when they consented to a credit check (e.g., 42.1.1.113 ).")

  public String getCreditCheckIpAddress() {
    return creditCheckIpAddress;
  }


  public void setCreditCheckIpAddress(String creditCheckIpAddress) {
    this.creditCheckIpAddress = creditCheckIpAddress;
  }


  public CreateIdentityRequestAdditionalUnderwritingData creditCheckTimestamp(String creditCheckTimestamp) {
    
    this.creditCheckTimestamp = creditCheckTimestamp;
    return this;
  }

   /**
   * A timestamp of when this merchant consented to a credit check (e.g., 2021-04-28T16:42:55Z).
   * @return creditCheckTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A timestamp of when this merchant consented to a credit check (e.g., 2021-04-28T16:42:55Z).")

  public String getCreditCheckTimestamp() {
    return creditCheckTimestamp;
  }


  public void setCreditCheckTimestamp(String creditCheckTimestamp) {
    this.creditCheckTimestamp = creditCheckTimestamp;
  }


  public CreateIdentityRequestAdditionalUnderwritingData creditCheckUserAgent(String creditCheckUserAgent) {
    
    this.creditCheckUserAgent = creditCheckUserAgent;
    return this;
  }

   /**
   * The details of the browser that was used when this merchant consented to a credit check (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)).
   * @return creditCheckUserAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the browser that was used when this merchant consented to a credit check (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)).")

  public String getCreditCheckUserAgent() {
    return creditCheckUserAgent;
  }


  public void setCreditCheckUserAgent(String creditCheckUserAgent) {
    this.creditCheckUserAgent = creditCheckUserAgent;
  }


  public CreateIdentityRequestAdditionalUnderwritingData cardVolumeDistribution(CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution cardVolumeDistribution) {
    
    this.cardVolumeDistribution = cardVolumeDistribution;
    return this;
  }

   /**
   * Get cardVolumeDistribution
   * @return cardVolumeDistribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution getCardVolumeDistribution() {
    return cardVolumeDistribution;
  }


  public void setCardVolumeDistribution(CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution cardVolumeDistribution) {
    this.cardVolumeDistribution = cardVolumeDistribution;
  }


  public CreateIdentityRequestAdditionalUnderwritingData merchantAgreementAccepted(Boolean merchantAgreementAccepted) {
    
    this.merchantAgreementAccepted = merchantAgreementAccepted;
    return this;
  }

   /**
   * Sets whether this merchant has accepted the terms and conditions of the merchant agreement.
   * @return merchantAgreementAccepted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets whether this merchant has accepted the terms and conditions of the merchant agreement.")

  public Boolean getMerchantAgreementAccepted() {
    return merchantAgreementAccepted;
  }


  public void setMerchantAgreementAccepted(Boolean merchantAgreementAccepted) {
    this.merchantAgreementAccepted = merchantAgreementAccepted;
  }


  public CreateIdentityRequestAdditionalUnderwritingData merchantAgreementIpAddress(String merchantAgreementIpAddress) {
    
    this.merchantAgreementIpAddress = merchantAgreementIpAddress;
    return this;
  }

   /**
   * IP address of the merchant when this merchant accepted the merchant agreement (e.g., 42.1.1.113).
   * @return merchantAgreementIpAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address of the merchant when this merchant accepted the merchant agreement (e.g., 42.1.1.113).")

  public String getMerchantAgreementIpAddress() {
    return merchantAgreementIpAddress;
  }


  public void setMerchantAgreementIpAddress(String merchantAgreementIpAddress) {
    this.merchantAgreementIpAddress = merchantAgreementIpAddress;
  }


  public CreateIdentityRequestAdditionalUnderwritingData merchantAgreementTimestamp(String merchantAgreementTimestamp) {
    
    this.merchantAgreementTimestamp = merchantAgreementTimestamp;
    return this;
  }

   /**
   * Sets if this merchant has consented and accepted to a credit check.
   * @return merchantAgreementTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets if this merchant has consented and accepted to a credit check.")

  public String getMerchantAgreementTimestamp() {
    return merchantAgreementTimestamp;
  }


  public void setMerchantAgreementTimestamp(String merchantAgreementTimestamp) {
    this.merchantAgreementTimestamp = merchantAgreementTimestamp;
  }


  public CreateIdentityRequestAdditionalUnderwritingData merchantAgreementUserAgent(String merchantAgreementUserAgent) {
    
    this.merchantAgreementUserAgent = merchantAgreementUserAgent;
    return this;
  }

   /**
   * The details of the browser that was used when this merchant accepted Finix&#39;s Terms of Service (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)).
   * @return merchantAgreementUserAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the browser that was used when this merchant accepted Finix's Terms of Service (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)).")

  public String getMerchantAgreementUserAgent() {
    return merchantAgreementUserAgent;
  }


  public void setMerchantAgreementUserAgent(String merchantAgreementUserAgent) {
    this.merchantAgreementUserAgent = merchantAgreementUserAgent;
  }


  public CreateIdentityRequestAdditionalUnderwritingData refundPolicy(RefundPolicyEnum refundPolicy) {
    
    this.refundPolicy = refundPolicy;
    return this;
  }

   /**
   * The details of the browser that was used when this merchant consented to a credit check (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)).
   * @return refundPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the browser that was used when this merchant consented to a credit check (e.g., Mozilla 5.0 (Macintosh; Intel Mac OS X 10 _14_6)).")

  public RefundPolicyEnum getRefundPolicy() {
    return refundPolicy;
  }


  public void setRefundPolicy(RefundPolicyEnum refundPolicy) {
    this.refundPolicy = refundPolicy;
  }


  public CreateIdentityRequestAdditionalUnderwritingData volumeDistributionByBusinessType(CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType volumeDistributionByBusinessType) {
    
    this.volumeDistributionByBusinessType = volumeDistributionByBusinessType;
    return this;
  }

   /**
   * Get volumeDistributionByBusinessType
   * @return volumeDistributionByBusinessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType getVolumeDistributionByBusinessType() {
    return volumeDistributionByBusinessType;
  }


  public void setVolumeDistributionByBusinessType(CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType volumeDistributionByBusinessType) {
    this.volumeDistributionByBusinessType = volumeDistributionByBusinessType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIdentityRequestAdditionalUnderwritingData createIdentityRequestAdditionalUnderwritingData = (CreateIdentityRequestAdditionalUnderwritingData) o;
    return Objects.equals(this.annualAchVolume, createIdentityRequestAdditionalUnderwritingData.annualAchVolume) &&
        Objects.equals(this.averageAchTransferAmount, createIdentityRequestAdditionalUnderwritingData.averageAchTransferAmount) &&
        Objects.equals(this.averageCardTransferAmount, createIdentityRequestAdditionalUnderwritingData.averageCardTransferAmount) &&
        Objects.equals(this.businessDescription, createIdentityRequestAdditionalUnderwritingData.businessDescription) &&
        Objects.equals(this.creditCheckAllowed, createIdentityRequestAdditionalUnderwritingData.creditCheckAllowed) &&
        Objects.equals(this.creditCheckIpAddress, createIdentityRequestAdditionalUnderwritingData.creditCheckIpAddress) &&
        Objects.equals(this.creditCheckTimestamp, createIdentityRequestAdditionalUnderwritingData.creditCheckTimestamp) &&
        Objects.equals(this.creditCheckUserAgent, createIdentityRequestAdditionalUnderwritingData.creditCheckUserAgent) &&
        Objects.equals(this.cardVolumeDistribution, createIdentityRequestAdditionalUnderwritingData.cardVolumeDistribution) &&
        Objects.equals(this.merchantAgreementAccepted, createIdentityRequestAdditionalUnderwritingData.merchantAgreementAccepted) &&
        Objects.equals(this.merchantAgreementIpAddress, createIdentityRequestAdditionalUnderwritingData.merchantAgreementIpAddress) &&
        Objects.equals(this.merchantAgreementTimestamp, createIdentityRequestAdditionalUnderwritingData.merchantAgreementTimestamp) &&
        Objects.equals(this.merchantAgreementUserAgent, createIdentityRequestAdditionalUnderwritingData.merchantAgreementUserAgent) &&
        Objects.equals(this.refundPolicy, createIdentityRequestAdditionalUnderwritingData.refundPolicy) &&
        Objects.equals(this.volumeDistributionByBusinessType, createIdentityRequestAdditionalUnderwritingData.volumeDistributionByBusinessType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualAchVolume, averageAchTransferAmount, averageCardTransferAmount, businessDescription, creditCheckAllowed, creditCheckIpAddress, creditCheckTimestamp, creditCheckUserAgent, cardVolumeDistribution, merchantAgreementAccepted, merchantAgreementIpAddress, merchantAgreementTimestamp, merchantAgreementUserAgent, refundPolicy, volumeDistributionByBusinessType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIdentityRequestAdditionalUnderwritingData {\n");
    sb.append("    annualAchVolume: ").append(toIndentedString(annualAchVolume)).append("\n");
    sb.append("    averageAchTransferAmount: ").append(toIndentedString(averageAchTransferAmount)).append("\n");
    sb.append("    averageCardTransferAmount: ").append(toIndentedString(averageCardTransferAmount)).append("\n");
    sb.append("    businessDescription: ").append(toIndentedString(businessDescription)).append("\n");
    sb.append("    creditCheckAllowed: ").append(toIndentedString(creditCheckAllowed)).append("\n");
    sb.append("    creditCheckIpAddress: ").append(toIndentedString(creditCheckIpAddress)).append("\n");
    sb.append("    creditCheckTimestamp: ").append(toIndentedString(creditCheckTimestamp)).append("\n");
    sb.append("    creditCheckUserAgent: ").append(toIndentedString(creditCheckUserAgent)).append("\n");
    sb.append("    cardVolumeDistribution: ").append(toIndentedString(cardVolumeDistribution)).append("\n");
    sb.append("    merchantAgreementAccepted: ").append(toIndentedString(merchantAgreementAccepted)).append("\n");
    sb.append("    merchantAgreementIpAddress: ").append(toIndentedString(merchantAgreementIpAddress)).append("\n");
    sb.append("    merchantAgreementTimestamp: ").append(toIndentedString(merchantAgreementTimestamp)).append("\n");
    sb.append("    merchantAgreementUserAgent: ").append(toIndentedString(merchantAgreementUserAgent)).append("\n");
    sb.append("    refundPolicy: ").append(toIndentedString(refundPolicy)).append("\n");
    sb.append("    volumeDistributionByBusinessType: ").append(toIndentedString(volumeDistributionByBusinessType)).append("\n");
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
    openapiFields.add("annual_ach_volume");
    openapiFields.add("average_ach_transfer_amount");
    openapiFields.add("average_card_transfer_amount");
    openapiFields.add("business_description");
    openapiFields.add("credit_check_allowed");
    openapiFields.add("credit_check_ip_address");
    openapiFields.add("credit_check_timestamp");
    openapiFields.add("credit_check_user_agent");
    openapiFields.add("card_volume_distribution");
    openapiFields.add("merchant_agreement_accepted");
    openapiFields.add("merchant_agreement_ip_address");
    openapiFields.add("merchant_agreement_timestamp");
    openapiFields.add("merchant_agreement_user_agent");
    openapiFields.add("refund_policy");
    openapiFields.add("volume_distribution_by_business_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateIdentityRequestAdditionalUnderwritingData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateIdentityRequestAdditionalUnderwritingData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateIdentityRequestAdditionalUnderwritingData is not found in the empty JSON string", CreateIdentityRequestAdditionalUnderwritingData.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateIdentityRequestAdditionalUnderwritingData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateIdentityRequestAdditionalUnderwritingData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("business_description") != null && !jsonObj.get("business_description").isJsonNull()  && !jsonObj.get("business_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_description").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("credit_check_ip_address") != null && !jsonObj.get("credit_check_ip_address").isJsonNull()  && !jsonObj.get("credit_check_ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_check_ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_check_ip_address").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("credit_check_timestamp") != null && !jsonObj.get("credit_check_timestamp").isJsonNull()  && !jsonObj.get("credit_check_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_check_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_check_timestamp").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("credit_check_user_agent") != null && !jsonObj.get("credit_check_user_agent").isJsonNull()  && !jsonObj.get("credit_check_user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_check_user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_check_user_agent").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `card_volume_distribution`
     // if (jsonObj.getAsJsonObject("card_volume_distribution") != null) {
       //CreateIdentityRequestAdditionalUnderwritingDataCardVolumeDistribution.validateJsonObject(jsonObj.getAsJsonObject("card_volume_distribution"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_agreement_ip_address") != null && !jsonObj.get("merchant_agreement_ip_address").isJsonNull()  && !jsonObj.get("merchant_agreement_ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_agreement_ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_agreement_ip_address").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_agreement_timestamp") != null && !jsonObj.get("merchant_agreement_timestamp").isJsonNull()  && !jsonObj.get("merchant_agreement_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_agreement_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_agreement_timestamp").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_agreement_user_agent") != null && !jsonObj.get("merchant_agreement_user_agent").isJsonNull()  && !jsonObj.get("merchant_agreement_user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_agreement_user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_agreement_user_agent").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("refund_policy") != null && !jsonObj.get("refund_policy").isJsonNull()  && !jsonObj.get("refund_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_policy").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `volume_distribution_by_business_type`
     // if (jsonObj.getAsJsonObject("volume_distribution_by_business_type") != null) {
       //CreateIdentityRequestAdditionalUnderwritingDataVolumeDistributionByBusinessType.validateJsonObject(jsonObj.getAsJsonObject("volume_distribution_by_business_type"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateIdentityRequestAdditionalUnderwritingData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateIdentityRequestAdditionalUnderwritingData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateIdentityRequestAdditionalUnderwritingData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateIdentityRequestAdditionalUnderwritingData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateIdentityRequestAdditionalUnderwritingData>() {
           @Override
           public void write(JsonWriter out, CreateIdentityRequestAdditionalUnderwritingData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateIdentityRequestAdditionalUnderwritingData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateIdentityRequestAdditionalUnderwritingData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateIdentityRequestAdditionalUnderwritingData
  * @throws IOException if the JSON string is invalid with respect to CreateIdentityRequestAdditionalUnderwritingData
  */
  public static CreateIdentityRequestAdditionalUnderwritingData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateIdentityRequestAdditionalUnderwritingData.class);
  }

 /**
  * Convert an instance of CreateIdentityRequestAdditionalUnderwritingData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

