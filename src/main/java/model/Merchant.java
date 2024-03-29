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
import model.MerchantLinks;
import model.MerchantProcessorDetails;
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
 * Merchant
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Merchant {
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

  public static final String SERIALIZED_NAME_CARD_CVV_REQUIRED = "card_cvv_required";
  @SerializedName(SERIALIZED_NAME_CARD_CVV_REQUIRED)
  private Boolean cardCvvRequired;

  public static final String SERIALIZED_NAME_CARD_EXPIRATION_DATE_REQUIRED = "card_expiration_date_required";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRATION_DATE_REQUIRED)
  private Boolean cardExpirationDateRequired;

  public static final String SERIALIZED_NAME_CREATING_TRANSFER_FROM_REPORT_ENABLED = "creating_transfer_from_report_enabled";
  @SerializedName(SERIALIZED_NAME_CREATING_TRANSFER_FROM_REPORT_ENABLED)
  private Boolean creatingTransferFromReportEnabled;

  public static final String SERIALIZED_NAME_CONVENIENCE_CHARGES_ENABLED = "convenience_charges_enabled";
  @SerializedName(SERIALIZED_NAME_CONVENIENCE_CHARGES_ENABLED)
  private Boolean convenienceChargesEnabled;

  public static final String SERIALIZED_NAME_FEE_READY_TO_SETTLE_UPON = "fee_ready_to_settle_upon";
  @SerializedName(SERIALIZED_NAME_FEE_READY_TO_SETTLE_UPON)
  private String feeReadyToSettleUpon;

  public static final String SERIALIZED_NAME_GROSS_SETTLEMENT_ENABLED = "gross_settlement_enabled";
  @SerializedName(SERIALIZED_NAME_GROSS_SETTLEMENT_ENABLED)
  private Boolean grossSettlementEnabled;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_LEVEL_TWO_LEVEL_THREE_DATA_ENABLED = "level_two_level_three_data_enabled";
  @SerializedName(SERIALIZED_NAME_LEVEL_TWO_LEVEL_THREE_DATA_ENABLED)
  private Boolean levelTwoLevelThreeDataEnabled;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MERCHANT_PROFILE = "merchant_profile";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROFILE)
  private String merchantProfile;

  public static final String SERIALIZED_NAME_MID = "mid";
  @SerializedName(SERIALIZED_NAME_MID)
  private String mid;

  /**
   * Details the state of the &#x60;Merchant&#39;s&#x60; onboarding.
   */
  @JsonAdapter(OnboardingStateEnum.Adapter.class)
  public enum OnboardingStateEnum {
    PROVISIONING("PROVISIONING"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    OnboardingStateEnum(String value) {
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

    public static OnboardingStateEnum fromValue(String value) {
        for (OnboardingStateEnum b : OnboardingStateEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        OnboardingStateEnum unknownDefault = OnboardingStateEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<OnboardingStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OnboardingStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OnboardingStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OnboardingStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ONBOARDING_STATE = "onboarding_state";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_STATE)
  private OnboardingStateEnum onboardingState;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor;

  public static final String SERIALIZED_NAME_PROCESSOR_DETAILS = "processor_details";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_DETAILS)
  private MerchantProcessorDetails processorDetails;

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

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private String verification;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private MerchantLinks links;

  public Merchant() { 
  }

  public Merchant id(String id) {
    
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


  public Merchant createdAt(OffsetDateTime createdAt) {
    
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


  public Merchant updatedAt(OffsetDateTime updatedAt) {
    
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


  public Merchant application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * ID of the &#x60;Application&#x60; the &#x60;Merchant&#x60; was created under.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Application` the `Merchant` was created under.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public Merchant cardCvvRequired(Boolean cardCvvRequired) {
    
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


  public Merchant cardExpirationDateRequired(Boolean cardExpirationDateRequired) {
    
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


  public Merchant creatingTransferFromReportEnabled(Boolean creatingTransferFromReportEnabled) {
    
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


  public Merchant convenienceChargesEnabled(Boolean convenienceChargesEnabled) {
    
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


  public Merchant feeReadyToSettleUpon(String feeReadyToSettleUpon) {
    
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


  public Merchant grossSettlementEnabled(Boolean grossSettlementEnabled) {
    
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


  public Merchant identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * The ID of the &#x60;Identity&#x60; resource associated with the &#x60;Merchant&#x60;.
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Identity` resource associated with the `Merchant`.")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public Merchant levelTwoLevelThreeDataEnabled(Boolean levelTwoLevelThreeDataEnabled) {
    
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


  public Merchant mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card_x/mcc.pdf)) that this merchant will be classified under.
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Merchant Category Code ([MCC](http://www.dm.usda.gov/procurement/card/card_x/mcc.pdf)) that this merchant will be classified under.")

  public String getMcc() {
    return mcc;
  }


  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public Merchant merchantName(String merchantName) {
    
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


  public Merchant merchantProfile(String merchantProfile) {
    
    this.merchantProfile = merchantProfile;
    return this;
  }

   /**
   * Details if a merchant&#39;s info was submitted to third-party processors for provisioning.
   * @return merchantProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if a merchant's info was submitted to third-party processors for provisioning.")

  public String getMerchantProfile() {
    return merchantProfile;
  }


  public void setMerchantProfile(String merchantProfile) {
    this.merchantProfile = merchantProfile;
  }


  public Merchant mid(String mid) {
    
    this.mid = mid;
    return this;
  }

   /**
   * MID of the &#x60;Merchant&#x60;.
   * @return mid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MID of the `Merchant`.")

  public String getMid() {
    return mid;
  }


  public void setMid(String mid) {
    this.mid = mid;
  }


  public Merchant onboardingState(OnboardingStateEnum onboardingState) {
    
    this.onboardingState = onboardingState;
    return this;
  }

   /**
   * Details the state of the &#x60;Merchant&#39;s&#x60; onboarding.
   * @return onboardingState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details the state of the `Merchant's` onboarding.")

  public OnboardingStateEnum getOnboardingState() {
    return onboardingState;
  }


  public void setOnboardingState(OnboardingStateEnum onboardingState) {
    this.onboardingState = onboardingState;
  }


  public Merchant processor(String processor) {
    
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


  public Merchant processorDetails(MerchantProcessorDetails processorDetails) {
    
    this.processorDetails = processorDetails;
    return this;
  }

   /**
   * Get processorDetails
   * @return processorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantProcessorDetails getProcessorDetails() {
    return processorDetails;
  }


  public void setProcessorDetails(MerchantProcessorDetails processorDetails) {
    this.processorDetails = processorDetails;
  }


  public Merchant processingEnabled(Boolean processingEnabled) {
    
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


  public Merchant readyToSettleUpon(String readyToSettleUpon) {
    
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


  public Merchant rentSurchargesEnabled(Boolean rentSurchargesEnabled) {
    
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


  public Merchant settlementEnabled(Boolean settlementEnabled) {
    
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


  public Merchant settlementFundingIdentifier(String settlementFundingIdentifier) {
    
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


  public Merchant tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Merchant putTagsItem(String key, String tagsItem) {
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


  public Merchant verification(String verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * ID of the &#x60;Verification&#x60; that was submitted to verify the &#x60;Merchant&#x60;.
   * @return verification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Verification` that was submitted to verify the `Merchant`.")

  public String getVerification() {
    return verification;
  }


  public void setVerification(String verification) {
    this.verification = verification;
  }


  public Merchant links(MerchantLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinks getLinks() {
    return links;
  }


  public void setLinks(MerchantLinks links) {
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
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.id, merchant.id) &&
        Objects.equals(this.createdAt, merchant.createdAt) &&
        Objects.equals(this.updatedAt, merchant.updatedAt) &&
        Objects.equals(this.application, merchant.application) &&
        Objects.equals(this.cardCvvRequired, merchant.cardCvvRequired) &&
        Objects.equals(this.cardExpirationDateRequired, merchant.cardExpirationDateRequired) &&
        Objects.equals(this.creatingTransferFromReportEnabled, merchant.creatingTransferFromReportEnabled) &&
        Objects.equals(this.convenienceChargesEnabled, merchant.convenienceChargesEnabled) &&
        Objects.equals(this.feeReadyToSettleUpon, merchant.feeReadyToSettleUpon) &&
        Objects.equals(this.grossSettlementEnabled, merchant.grossSettlementEnabled) &&
        Objects.equals(this.identity, merchant.identity) &&
        Objects.equals(this.levelTwoLevelThreeDataEnabled, merchant.levelTwoLevelThreeDataEnabled) &&
        Objects.equals(this.mcc, merchant.mcc) &&
        Objects.equals(this.merchantName, merchant.merchantName) &&
        Objects.equals(this.merchantProfile, merchant.merchantProfile) &&
        Objects.equals(this.mid, merchant.mid) &&
        Objects.equals(this.onboardingState, merchant.onboardingState) &&
        Objects.equals(this.processor, merchant.processor) &&
        Objects.equals(this.processorDetails, merchant.processorDetails) &&
        Objects.equals(this.processingEnabled, merchant.processingEnabled) &&
        Objects.equals(this.readyToSettleUpon, merchant.readyToSettleUpon) &&
        Objects.equals(this.rentSurchargesEnabled, merchant.rentSurchargesEnabled) &&
        Objects.equals(this.settlementEnabled, merchant.settlementEnabled) &&
        Objects.equals(this.settlementFundingIdentifier, merchant.settlementFundingIdentifier) &&
        Objects.equals(this.tags, merchant.tags) &&
        Objects.equals(this.verification, merchant.verification) &&
        Objects.equals(this.links, merchant.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, application, cardCvvRequired, cardExpirationDateRequired, creatingTransferFromReportEnabled, convenienceChargesEnabled, feeReadyToSettleUpon, grossSettlementEnabled, identity, levelTwoLevelThreeDataEnabled, mcc, merchantName, merchantProfile, mid, onboardingState, processor, processorDetails, processingEnabled, readyToSettleUpon, rentSurchargesEnabled, settlementEnabled, settlementFundingIdentifier, tags, verification, links);
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
    sb.append("class Merchant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    cardCvvRequired: ").append(toIndentedString(cardCvvRequired)).append("\n");
    sb.append("    cardExpirationDateRequired: ").append(toIndentedString(cardExpirationDateRequired)).append("\n");
    sb.append("    creatingTransferFromReportEnabled: ").append(toIndentedString(creatingTransferFromReportEnabled)).append("\n");
    sb.append("    convenienceChargesEnabled: ").append(toIndentedString(convenienceChargesEnabled)).append("\n");
    sb.append("    feeReadyToSettleUpon: ").append(toIndentedString(feeReadyToSettleUpon)).append("\n");
    sb.append("    grossSettlementEnabled: ").append(toIndentedString(grossSettlementEnabled)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    levelTwoLevelThreeDataEnabled: ").append(toIndentedString(levelTwoLevelThreeDataEnabled)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantProfile: ").append(toIndentedString(merchantProfile)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    onboardingState: ").append(toIndentedString(onboardingState)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    processorDetails: ").append(toIndentedString(processorDetails)).append("\n");
    sb.append("    processingEnabled: ").append(toIndentedString(processingEnabled)).append("\n");
    sb.append("    readyToSettleUpon: ").append(toIndentedString(readyToSettleUpon)).append("\n");
    sb.append("    rentSurchargesEnabled: ").append(toIndentedString(rentSurchargesEnabled)).append("\n");
    sb.append("    settlementEnabled: ").append(toIndentedString(settlementEnabled)).append("\n");
    sb.append("    settlementFundingIdentifier: ").append(toIndentedString(settlementFundingIdentifier)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
    openapiFields.add("card_cvv_required");
    openapiFields.add("card_expiration_date_required");
    openapiFields.add("creating_transfer_from_report_enabled");
    openapiFields.add("convenience_charges_enabled");
    openapiFields.add("fee_ready_to_settle_upon");
    openapiFields.add("gross_settlement_enabled");
    openapiFields.add("identity");
    openapiFields.add("level_two_level_three_data_enabled");
    openapiFields.add("mcc");
    openapiFields.add("merchant_name");
    openapiFields.add("merchant_profile");
    openapiFields.add("mid");
    openapiFields.add("onboarding_state");
    openapiFields.add("processor");
    openapiFields.add("processor_details");
    openapiFields.add("processing_enabled");
    openapiFields.add("ready_to_settle_upon");
    openapiFields.add("rent_surcharges_enabled");
    openapiFields.add("settlement_enabled");
    openapiFields.add("settlement_funding_identifier");
    openapiFields.add("tags");
    openapiFields.add("verification");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Merchant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Merchant.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Merchant is not found in the empty JSON string", Merchant.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Merchant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Merchant` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("fee_ready_to_settle_upon") != null && !jsonObj.get("fee_ready_to_settle_upon").isJsonNull()  && !jsonObj.get("fee_ready_to_settle_upon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_ready_to_settle_upon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_ready_to_settle_upon").toString()));
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
      if (jsonObj.get("mcc") != null && !jsonObj.get("mcc").isJsonNull()  && !jsonObj.get("mcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc").toString()));
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
      if (jsonObj.get("merchant_profile") != null && !jsonObj.get("merchant_profile").isJsonNull()  && !jsonObj.get("merchant_profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_profile").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("mid") != null && !jsonObj.get("mid").isJsonNull()  && !jsonObj.get("mid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mid").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("onboarding_state") != null && !jsonObj.get("onboarding_state").isJsonNull()  && !jsonObj.get("onboarding_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onboarding_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onboarding_state").toString()));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `processor_details`
     // if (jsonObj.getAsJsonObject("processor_details") != null) {
       //MerchantProcessorDetails.validateJsonObject(jsonObj.getAsJsonObject("processor_details"));
     // }

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
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("verification") != null && !jsonObj.get("verification").isJsonNull()  && !jsonObj.get("verification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //MerchantLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Merchant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Merchant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Merchant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Merchant.class));

       return (TypeAdapter<T>) new TypeAdapter<Merchant>() {
           @Override
           public void write(JsonWriter out, Merchant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Merchant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Merchant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Merchant
  * @throws IOException if the JSON string is invalid with respect to Merchant
  */
  public static Merchant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Merchant.class);
  }

 /**
  * Convert an instance of Merchant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

