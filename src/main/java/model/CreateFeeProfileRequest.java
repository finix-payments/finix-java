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
 * CreateFeeProfileRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateFeeProfileRequest {
  public static final String SERIALIZED_NAME_ACH_BASIS_POINTS = "ach_basis_points";
  @SerializedName(SERIALIZED_NAME_ACH_BASIS_POINTS)
  private Long achBasisPoints;

  public static final String SERIALIZED_NAME_ACH_CREDIT_RETURN_FIXED_FEE = "ach_credit_return_fixed_fee";
  @SerializedName(SERIALIZED_NAME_ACH_CREDIT_RETURN_FIXED_FEE)
  private Long achCreditReturnFixedFee;

  public static final String SERIALIZED_NAME_ACH_DEBIT_RETURN_FIXED_FEE = "ach_debit_return_fixed_fee";
  @SerializedName(SERIALIZED_NAME_ACH_DEBIT_RETURN_FIXED_FEE)
  private Long achDebitReturnFixedFee;

  public static final String SERIALIZED_NAME_ACH_FIXED_FEE = "ach_fixed_fee";
  @SerializedName(SERIALIZED_NAME_ACH_FIXED_FEE)
  private Long achFixedFee;

  public static final String SERIALIZED_NAME_AMERICAN_EXPRESS_ASSESSMENT_BASIS_POINTS = "american_express_assessment_basis_points";
  @SerializedName(SERIALIZED_NAME_AMERICAN_EXPRESS_ASSESSMENT_BASIS_POINTS)
  private Long americanExpressAssessmentBasisPoints;

  public static final String SERIALIZED_NAME_AMERICAN_EXPRESS_BASIS_POINTS = "american_express_basis_points";
  @SerializedName(SERIALIZED_NAME_AMERICAN_EXPRESS_BASIS_POINTS)
  private Long americanExpressBasisPoints;

  public static final String SERIALIZED_NAME_AMERICAN_EXPRESS_CHARGE_INTERCHANGE = "american_express_charge_interchange";
  @SerializedName(SERIALIZED_NAME_AMERICAN_EXPRESS_CHARGE_INTERCHANGE)
  private Boolean americanExpressChargeInterchange;

  public static final String SERIALIZED_NAME_AMERICAN_EXPRESS_FIXED_FEE = "american_express_fixed_fee";
  @SerializedName(SERIALIZED_NAME_AMERICAN_EXPRESS_FIXED_FEE)
  private Long americanExpressFixedFee;

  public static final String SERIALIZED_NAME_AMERICAN_EXPRESS_EXTERNALLY_FUNDED_BASIS_POINTS = "american_express_externally_funded_basis_points";
  @SerializedName(SERIALIZED_NAME_AMERICAN_EXPRESS_EXTERNALLY_FUNDED_BASIS_POINTS)
  private Long americanExpressExternallyFundedBasisPoints;

  public static final String SERIALIZED_NAME_AMERICAN_EXPRESS_EXTERNALLY_FUNDED_FIXED_FEE = "american_express_externally_funded_fixed_fee";
  @SerializedName(SERIALIZED_NAME_AMERICAN_EXPRESS_EXTERNALLY_FUNDED_FIXED_FEE)
  private Long americanExpressExternallyFundedFixedFee;

  public static final String SERIALIZED_NAME_ANCILLARY_FIXED_FEE_PRIMARY = "ancillary_fixed_fee_primary";
  @SerializedName(SERIALIZED_NAME_ANCILLARY_FIXED_FEE_PRIMARY)
  private Long ancillaryFixedFeePrimary;

  public static final String SERIALIZED_NAME_ANCILLARY_FIXED_FEE_SECONDARY = "ancillary_fixed_fee_secondary";
  @SerializedName(SERIALIZED_NAME_ANCILLARY_FIXED_FEE_SECONDARY)
  private Long ancillaryFixedFeeSecondary;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_BASIS_POINTS = "basis_points";
  @SerializedName(SERIALIZED_NAME_BASIS_POINTS)
  private Long basisPoints;

  public static final String SERIALIZED_NAME_CHARGE_INTERCHANGE = "charge_interchange";
  @SerializedName(SERIALIZED_NAME_CHARGE_INTERCHANGE)
  private Boolean chargeInterchange;

  public static final String SERIALIZED_NAME_DINERS_CLUB_BASIS_POINTS = "diners_club_basis_points";
  @SerializedName(SERIALIZED_NAME_DINERS_CLUB_BASIS_POINTS)
  private Long dinersClubBasisPoints;

  public static final String SERIALIZED_NAME_DINERS_CLUB_CHARGE_INTERCHANGE = "diners_club_charge_interchange";
  @SerializedName(SERIALIZED_NAME_DINERS_CLUB_CHARGE_INTERCHANGE)
  private Boolean dinersClubChargeInterchange;

  public static final String SERIALIZED_NAME_DINERS_CLUB_FIXED_FEE = "diners_club_fixed_fee";
  @SerializedName(SERIALIZED_NAME_DINERS_CLUB_FIXED_FEE)
  private Long dinersClubFixedFee;

  public static final String SERIALIZED_NAME_DISCOVER_ASSESSMENTS_BASIS_POINTS = "discover_assessments_basis_points";
  @SerializedName(SERIALIZED_NAME_DISCOVER_ASSESSMENTS_BASIS_POINTS)
  private Long discoverAssessmentsBasisPoints;

  public static final String SERIALIZED_NAME_DISCOVER_BASIS_POINTS = "discover_basis_points";
  @SerializedName(SERIALIZED_NAME_DISCOVER_BASIS_POINTS)
  private Long discoverBasisPoints;

  public static final String SERIALIZED_NAME_DISCOVER_CHARGE_INTERCHANGE = "discover_charge_interchange";
  @SerializedName(SERIALIZED_NAME_DISCOVER_CHARGE_INTERCHANGE)
  private Boolean discoverChargeInterchange;

  public static final String SERIALIZED_NAME_DISCOVER_DATA_USAGE_FIXED_FEE = "discover_data_usage_fixed_fee";
  @SerializedName(SERIALIZED_NAME_DISCOVER_DATA_USAGE_FIXED_FEE)
  private Long discoverDataUsageFixedFee;

  public static final String SERIALIZED_NAME_DISCOVER_FIXED_FEE = "discover_fixed_fee";
  @SerializedName(SERIALIZED_NAME_DISCOVER_FIXED_FEE)
  private Long discoverFixedFee;

  public static final String SERIALIZED_NAME_DISCOVER_EXTERNALLY_FUNDED_BASIS_POINTS = "discover_externally_funded_basis_points";
  @SerializedName(SERIALIZED_NAME_DISCOVER_EXTERNALLY_FUNDED_BASIS_POINTS)
  private Long discoverExternallyFundedBasisPoints;

  public static final String SERIALIZED_NAME_DISCOVER_EXTERNALLY_FUNDED_FIXED_FEE = "discover_externally_funded_fixed_fee";
  @SerializedName(SERIALIZED_NAME_DISCOVER_EXTERNALLY_FUNDED_FIXED_FEE)
  private Long discoverExternallyFundedFixedFee;

  public static final String SERIALIZED_NAME_DISCOVER_NETWORK_AUTHORIZATION_FIXED_FEE = "discover_network_authorization_fixed_fee";
  @SerializedName(SERIALIZED_NAME_DISCOVER_NETWORK_AUTHORIZATION_FIXED_FEE)
  private Long discoverNetworkAuthorizationFixedFee;

  public static final String SERIALIZED_NAME_DISPUTE_FIXED_FEE = "dispute_fixed_fee";
  @SerializedName(SERIALIZED_NAME_DISPUTE_FIXED_FEE)
  private Long disputeFixedFee;

  public static final String SERIALIZED_NAME_DISPUTE_INQUIRY_FIXED_FEE = "dispute_inquiry_fixed_fee";
  @SerializedName(SERIALIZED_NAME_DISPUTE_INQUIRY_FIXED_FEE)
  private Long disputeInquiryFixedFee;

  public static final String SERIALIZED_NAME_EXTERNALLY_FUNDED_BASIS_POINTS = "externally_funded_basis_points";
  @SerializedName(SERIALIZED_NAME_EXTERNALLY_FUNDED_BASIS_POINTS)
  private Long externallyFundedBasisPoints;

  public static final String SERIALIZED_NAME_EXTERNALLY_FUNDED_FIXED_FEE = "externally_funded_fixed_fee";
  @SerializedName(SERIALIZED_NAME_EXTERNALLY_FUNDED_FIXED_FEE)
  private Long externallyFundedFixedFee;

  public static final String SERIALIZED_NAME_FIXED_FEE = "fixed_fee";
  @SerializedName(SERIALIZED_NAME_FIXED_FEE)
  private Long fixedFee;

  public static final String SERIALIZED_NAME_JCB_BASIS_POINTS = "jcb_basis_points";
  @SerializedName(SERIALIZED_NAME_JCB_BASIS_POINTS)
  private Long jcbBasisPoints;

  public static final String SERIALIZED_NAME_JCB_CHARGE_INTERCHANGE = "jcb_charge_interchange";
  @SerializedName(SERIALIZED_NAME_JCB_CHARGE_INTERCHANGE)
  private Boolean jcbChargeInterchange;

  public static final String SERIALIZED_NAME_JCB_FIXED_FEE = "jcb_fixed_fee";
  @SerializedName(SERIALIZED_NAME_JCB_FIXED_FEE)
  private Long jcbFixedFee;

  public static final String SERIALIZED_NAME_MASTERCARD_ACQUIRER_FEES_BASIS_POINTS = "mastercard_acquirer_fees_basis_points";
  @SerializedName(SERIALIZED_NAME_MASTERCARD_ACQUIRER_FEES_BASIS_POINTS)
  private Long mastercardAcquirerFeesBasisPoints;

  public static final String SERIALIZED_NAME_MASTERCARD_ASSESSMENTS_OVER1K_BASIS_POINTS = "mastercard_assessments_over1k_basis_points";
  @SerializedName(SERIALIZED_NAME_MASTERCARD_ASSESSMENTS_OVER1K_BASIS_POINTS)
  private Long mastercardAssessmentsOver1kBasisPoints;

  public static final String SERIALIZED_NAME_MASTERCARD_ASSESSMENTS_UNDER1K_BASIS_POINTS = "mastercard_assessments_under1k_basis_points";
  @SerializedName(SERIALIZED_NAME_MASTERCARD_ASSESSMENTS_UNDER1K_BASIS_POINTS)
  private Long mastercardAssessmentsUnder1kBasisPoints;

  public static final String SERIALIZED_NAME_MASTERCARD_BASIS_POINTS = "mastercard_basis_points";
  @SerializedName(SERIALIZED_NAME_MASTERCARD_BASIS_POINTS)
  private Long mastercardBasisPoints;

  public static final String SERIALIZED_NAME_MASTERCARD_CHARGE_INTERCHANGE = "mastercard_charge_interchange";
  @SerializedName(SERIALIZED_NAME_MASTERCARD_CHARGE_INTERCHANGE)
  private Boolean mastercardChargeInterchange;

  public static final String SERIALIZED_NAME_MASTERCARD_FIXED_FEE = "mastercard_fixed_fee";
  @SerializedName(SERIALIZED_NAME_MASTERCARD_FIXED_FEE)
  private Long mastercardFixedFee;

  public static final String SERIALIZED_NAME_QUALIFIED_TIERS = "qualified_tiers";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_TIERS)
  private Object qualifiedTiers;

  /**
   * &lt;ul&gt;&lt;li&gt;Include &lt;strong&gt;AGGREGATE&lt;/strong&gt; if you want to round after the settlement calculation.&lt;li&gt;By default, rounding happens before the sum of the settlement calculation (i.e. round each fee transfer)&lt;/ul&gt;
   */
  @JsonAdapter(RoundingModeEnum.Adapter.class)
  public enum RoundingModeEnum {
    TRANSACTION("TRANSACTION"),
    
    AGGREGATE("AGGREGATE"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    RoundingModeEnum(String value) {
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

    public static RoundingModeEnum fromValue(String value) {
        for (RoundingModeEnum b : RoundingModeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        RoundingModeEnum unknownDefault = RoundingModeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<RoundingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoundingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoundingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoundingModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROUNDING_MODE = "rounding_mode";
  @SerializedName(SERIALIZED_NAME_ROUNDING_MODE)
  private RoundingModeEnum roundingMode;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_VISA_ACQUIRER_PROCESSING_FIXED_FEE = "visa_acquirer_processing_fixed_fee";
  @SerializedName(SERIALIZED_NAME_VISA_ACQUIRER_PROCESSING_FIXED_FEE)
  private Long visaAcquirerProcessingFixedFee;

  public static final String SERIALIZED_NAME_VISA_ASSESSMENTS_BASIS_POINTS = "visa_assessments_basis_points";
  @SerializedName(SERIALIZED_NAME_VISA_ASSESSMENTS_BASIS_POINTS)
  private Long visaAssessmentsBasisPoints;

  public static final String SERIALIZED_NAME_VISA_BASE_I_I_CREDIT_VOUCHER_FIXED_FEE = "visa_base_II_credit_voucher_fixed_fee";
  @SerializedName(SERIALIZED_NAME_VISA_BASE_I_I_CREDIT_VOUCHER_FIXED_FEE)
  private Long visaBaseIICreditVoucherFixedFee;

  public static final String SERIALIZED_NAME_VISA_BASE_I_I_SYSTEM_FILE_TRANSMISSION_FIXED_FEE = "visa_base_II_system_file_transmission_fixed_fee";
  @SerializedName(SERIALIZED_NAME_VISA_BASE_I_I_SYSTEM_FILE_TRANSMISSION_FIXED_FEE)
  private Long visaBaseIISystemFileTransmissionFixedFee;

  public static final String SERIALIZED_NAME_VISA_BASIS_POINTS = "visa_basis_points";
  @SerializedName(SERIALIZED_NAME_VISA_BASIS_POINTS)
  private Long visaBasisPoints;

  public static final String SERIALIZED_NAME_VISA_CHARGE_INTERCHANGE = "visa_charge_interchange";
  @SerializedName(SERIALIZED_NAME_VISA_CHARGE_INTERCHANGE)
  private Boolean visaChargeInterchange;

  public static final String SERIALIZED_NAME_VISA_CREDIT_VOUCHER_FIXED_FEE = "visa_credit_voucher_fixed_fee";
  @SerializedName(SERIALIZED_NAME_VISA_CREDIT_VOUCHER_FIXED_FEE)
  private Long visaCreditVoucherFixedFee;

  public static final String SERIALIZED_NAME_VISA_FIXED_FEE = "visa_fixed_fee";
  @SerializedName(SERIALIZED_NAME_VISA_FIXED_FEE)
  private Long visaFixedFee;

  public static final String SERIALIZED_NAME_VISA_KILOBYTE_ACCESS_FIXED_FEE = "visa_kilobyte_access_fixed_fee";
  @SerializedName(SERIALIZED_NAME_VISA_KILOBYTE_ACCESS_FIXED_FEE)
  private Long visaKilobyteAccessFixedFee;

  public CreateFeeProfileRequest() { 
  }

  public CreateFeeProfileRequest achBasisPoints(Long achBasisPoints) {
    
    this.achBasisPoints = achBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of an eCheck (also called ACH payments). Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return achBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of an eCheck (also called ACH payments). Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getAchBasisPoints() {
    return achBasisPoints;
  }


  public void setAchBasisPoints(Long achBasisPoints) {
    this.achBasisPoints = achBasisPoints;
  }


  public CreateFeeProfileRequest achCreditReturnFixedFee(Long achCreditReturnFixedFee) {
    
    this.achCreditReturnFixedFee = achCreditReturnFixedFee;
    return this;
  }

   /**
   * A fixed amount in cents that will be charged to the merchant for processing an echeck (also called ACH payments) credit return.
   * @return achCreditReturnFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A fixed amount in cents that will be charged to the merchant for processing an echeck (also called ACH payments) credit return.")

  public Long getAchCreditReturnFixedFee() {
    return achCreditReturnFixedFee;
  }


  public void setAchCreditReturnFixedFee(Long achCreditReturnFixedFee) {
    this.achCreditReturnFixedFee = achCreditReturnFixedFee;
  }


  public CreateFeeProfileRequest achDebitReturnFixedFee(Long achDebitReturnFixedFee) {
    
    this.achDebitReturnFixedFee = achDebitReturnFixedFee;
    return this;
  }

   /**
   * A fixed amount in cents that will be charged to the merchant for processing an echeck (also called ACH payment) debit return.
   * @return achDebitReturnFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A fixed amount in cents that will be charged to the merchant for processing an echeck (also called ACH payment) debit return.")

  public Long getAchDebitReturnFixedFee() {
    return achDebitReturnFixedFee;
  }


  public void setAchDebitReturnFixedFee(Long achDebitReturnFixedFee) {
    this.achDebitReturnFixedFee = achDebitReturnFixedFee;
  }


  public CreateFeeProfileRequest achFixedFee(Long achFixedFee) {
    
    this.achFixedFee = achFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual &#x60;Transfer&#x60;.
   * @return achFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual `Transfer`.")

  public Long getAchFixedFee() {
    return achFixedFee;
  }


  public void setAchFixedFee(Long achFixedFee) {
    this.achFixedFee = achFixedFee;
  }


  public CreateFeeProfileRequest americanExpressAssessmentBasisPoints(Long americanExpressAssessmentBasisPoints) {
    
    this.americanExpressAssessmentBasisPoints = americanExpressAssessmentBasisPoints;
    return this;
  }

   /**
   * Applies to gross American Express card volume.
   * @return americanExpressAssessmentBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to gross American Express card volume.")

  public Long getAmericanExpressAssessmentBasisPoints() {
    return americanExpressAssessmentBasisPoints;
  }


  public void setAmericanExpressAssessmentBasisPoints(Long americanExpressAssessmentBasisPoints) {
    this.americanExpressAssessmentBasisPoints = americanExpressAssessmentBasisPoints;
  }


  public CreateFeeProfileRequest americanExpressBasisPoints(Long americanExpressBasisPoints) {
    
    this.americanExpressBasisPoints = americanExpressBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each American Express &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return americanExpressBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each American Express `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getAmericanExpressBasisPoints() {
    return americanExpressBasisPoints;
  }


  public void setAmericanExpressBasisPoints(Long americanExpressBasisPoints) {
    this.americanExpressBasisPoints = americanExpressBasisPoints;
  }


  public CreateFeeProfileRequest americanExpressChargeInterchange(Boolean americanExpressChargeInterchange) {
    
    this.americanExpressChargeInterchange = americanExpressChargeInterchange;
    return this;
  }

   /**
   * Set to **True** to incur interchange fees for American Express &#x60;Transfers&#x60;.
   * @return americanExpressChargeInterchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **True** to incur interchange fees for American Express `Transfers`.")

  public Boolean getAmericanExpressChargeInterchange() {
    return americanExpressChargeInterchange;
  }


  public void setAmericanExpressChargeInterchange(Boolean americanExpressChargeInterchange) {
    this.americanExpressChargeInterchange = americanExpressChargeInterchange;
  }


  public CreateFeeProfileRequest americanExpressFixedFee(Long americanExpressFixedFee) {
    
    this.americanExpressFixedFee = americanExpressFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual American Express &#x60;Transfer&#x60;.
   * @return americanExpressFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual American Express `Transfer`.")

  public Long getAmericanExpressFixedFee() {
    return americanExpressFixedFee;
  }


  public void setAmericanExpressFixedFee(Long americanExpressFixedFee) {
    this.americanExpressFixedFee = americanExpressFixedFee;
  }


  public CreateFeeProfileRequest americanExpressExternallyFundedBasisPoints(Long americanExpressExternallyFundedBasisPoints) {
    
    this.americanExpressExternallyFundedBasisPoints = americanExpressExternallyFundedBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each American Express externally funded &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return americanExpressExternallyFundedBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each American Express externally funded `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getAmericanExpressExternallyFundedBasisPoints() {
    return americanExpressExternallyFundedBasisPoints;
  }


  public void setAmericanExpressExternallyFundedBasisPoints(Long americanExpressExternallyFundedBasisPoints) {
    this.americanExpressExternallyFundedBasisPoints = americanExpressExternallyFundedBasisPoints;
  }


  public CreateFeeProfileRequest americanExpressExternallyFundedFixedFee(Long americanExpressExternallyFundedFixedFee) {
    
    this.americanExpressExternallyFundedFixedFee = americanExpressExternallyFundedFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual American Express externally funded &#x60;Transfer&#x60;.
   * @return americanExpressExternallyFundedFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual American Express externally funded `Transfer`.")

  public Long getAmericanExpressExternallyFundedFixedFee() {
    return americanExpressExternallyFundedFixedFee;
  }


  public void setAmericanExpressExternallyFundedFixedFee(Long americanExpressExternallyFundedFixedFee) {
    this.americanExpressExternallyFundedFixedFee = americanExpressExternallyFundedFixedFee;
  }


  public CreateFeeProfileRequest ancillaryFixedFeePrimary(Long ancillaryFixedFeePrimary) {
    
    this.ancillaryFixedFeePrimary = ancillaryFixedFeePrimary;
    return this;
  }

   /**
   * An additional fixed fee that can be charged per &#x60;Transfer&#x60;.
   * @return ancillaryFixedFeePrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An additional fixed fee that can be charged per `Transfer`.")

  public Long getAncillaryFixedFeePrimary() {
    return ancillaryFixedFeePrimary;
  }


  public void setAncillaryFixedFeePrimary(Long ancillaryFixedFeePrimary) {
    this.ancillaryFixedFeePrimary = ancillaryFixedFeePrimary;
  }


  public CreateFeeProfileRequest ancillaryFixedFeeSecondary(Long ancillaryFixedFeeSecondary) {
    
    this.ancillaryFixedFeeSecondary = ancillaryFixedFeeSecondary;
    return this;
  }

   /**
   * An additional fixed fee that can be charged per &#x60;Transfer&#x60; if &#x60;ancillary_fixed_fee_primary&#x60; is included.
   * @return ancillaryFixedFeeSecondary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An additional fixed fee that can be charged per `Transfer` if `ancillary_fixed_fee_primary` is included.")

  public Long getAncillaryFixedFeeSecondary() {
    return ancillaryFixedFeeSecondary;
  }


  public void setAncillaryFixedFeeSecondary(Long ancillaryFixedFeeSecondary) {
    this.ancillaryFixedFeeSecondary = ancillaryFixedFeeSecondary;
  }


  public CreateFeeProfileRequest application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the resource.
   * @return application
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the resource.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public CreateFeeProfileRequest basisPoints(Long basisPoints) {
    
    this.basisPoints = basisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each card-based &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return basisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each card-based `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getBasisPoints() {
    return basisPoints;
  }


  public void setBasisPoints(Long basisPoints) {
    this.basisPoints = basisPoints;
  }


  public CreateFeeProfileRequest chargeInterchange(Boolean chargeInterchange) {
    
    this.chargeInterchange = chargeInterchange;
    return this;
  }

   /**
   * Set to **True** to incur interchange fees for card-based &#x60;Transfers&#x60;.
   * @return chargeInterchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **True** to incur interchange fees for card-based `Transfers`.")

  public Boolean getChargeInterchange() {
    return chargeInterchange;
  }


  public void setChargeInterchange(Boolean chargeInterchange) {
    this.chargeInterchange = chargeInterchange;
  }


  public CreateFeeProfileRequest dinersClubBasisPoints(Long dinersClubBasisPoints) {
    
    this.dinersClubBasisPoints = dinersClubBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each Diners &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return dinersClubBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each Diners `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getDinersClubBasisPoints() {
    return dinersClubBasisPoints;
  }


  public void setDinersClubBasisPoints(Long dinersClubBasisPoints) {
    this.dinersClubBasisPoints = dinersClubBasisPoints;
  }


  public CreateFeeProfileRequest dinersClubChargeInterchange(Boolean dinersClubChargeInterchange) {
    
    this.dinersClubChargeInterchange = dinersClubChargeInterchange;
    return this;
  }

   /**
   * Set to **True** to incur interchange fees for Diners &#x60;Transfers&#x60;.
   * @return dinersClubChargeInterchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **True** to incur interchange fees for Diners `Transfers`.")

  public Boolean getDinersClubChargeInterchange() {
    return dinersClubChargeInterchange;
  }


  public void setDinersClubChargeInterchange(Boolean dinersClubChargeInterchange) {
    this.dinersClubChargeInterchange = dinersClubChargeInterchange;
  }


  public CreateFeeProfileRequest dinersClubFixedFee(Long dinersClubFixedFee) {
    
    this.dinersClubFixedFee = dinersClubFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual Diners &#x60;Transfer&#x60;.
   * @return dinersClubFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual Diners `Transfer`.")

  public Long getDinersClubFixedFee() {
    return dinersClubFixedFee;
  }


  public void setDinersClubFixedFee(Long dinersClubFixedFee) {
    this.dinersClubFixedFee = dinersClubFixedFee;
  }


  public CreateFeeProfileRequest discoverAssessmentsBasisPoints(Long discoverAssessmentsBasisPoints) {
    
    this.discoverAssessmentsBasisPoints = discoverAssessmentsBasisPoints;
    return this;
  }

   /**
   * Assessment applies to gross Discover card transaction volume.
   * @return discoverAssessmentsBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Assessment applies to gross Discover card transaction volume.")

  public Long getDiscoverAssessmentsBasisPoints() {
    return discoverAssessmentsBasisPoints;
  }


  public void setDiscoverAssessmentsBasisPoints(Long discoverAssessmentsBasisPoints) {
    this.discoverAssessmentsBasisPoints = discoverAssessmentsBasisPoints;
  }


  public CreateFeeProfileRequest discoverBasisPoints(Long discoverBasisPoints) {
    
    this.discoverBasisPoints = discoverBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each Discover &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return discoverBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each Discover `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getDiscoverBasisPoints() {
    return discoverBasisPoints;
  }


  public void setDiscoverBasisPoints(Long discoverBasisPoints) {
    this.discoverBasisPoints = discoverBasisPoints;
  }


  public CreateFeeProfileRequest discoverChargeInterchange(Boolean discoverChargeInterchange) {
    
    this.discoverChargeInterchange = discoverChargeInterchange;
    return this;
  }

   /**
   * Set to **True** to incur interchange fees for Discover &#x60;Transfers&#x60;.
   * @return discoverChargeInterchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **True** to incur interchange fees for Discover `Transfers`.")

  public Boolean getDiscoverChargeInterchange() {
    return discoverChargeInterchange;
  }


  public void setDiscoverChargeInterchange(Boolean discoverChargeInterchange) {
    this.discoverChargeInterchange = discoverChargeInterchange;
  }


  public CreateFeeProfileRequest discoverDataUsageFixedFee(Long discoverDataUsageFixedFee) {
    
    this.discoverDataUsageFixedFee = discoverDataUsageFixedFee;
    return this;
  }

   /**
   * Applies to all U.S.-based &#x60;Authorization&#x60; transactions.
   * @return discoverDataUsageFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to all U.S.-based `Authorization` transactions.")

  public Long getDiscoverDataUsageFixedFee() {
    return discoverDataUsageFixedFee;
  }


  public void setDiscoverDataUsageFixedFee(Long discoverDataUsageFixedFee) {
    this.discoverDataUsageFixedFee = discoverDataUsageFixedFee;
  }


  public CreateFeeProfileRequest discoverFixedFee(Long discoverFixedFee) {
    
    this.discoverFixedFee = discoverFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual Discover &#x60;Transfer&#x60;.
   * @return discoverFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual Discover `Transfer`.")

  public Long getDiscoverFixedFee() {
    return discoverFixedFee;
  }


  public void setDiscoverFixedFee(Long discoverFixedFee) {
    this.discoverFixedFee = discoverFixedFee;
  }


  public CreateFeeProfileRequest discoverExternallyFundedBasisPoints(Long discoverExternallyFundedBasisPoints) {
    
    this.discoverExternallyFundedBasisPoints = discoverExternallyFundedBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each Discover externally funded &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return discoverExternallyFundedBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each Discover externally funded `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getDiscoverExternallyFundedBasisPoints() {
    return discoverExternallyFundedBasisPoints;
  }


  public void setDiscoverExternallyFundedBasisPoints(Long discoverExternallyFundedBasisPoints) {
    this.discoverExternallyFundedBasisPoints = discoverExternallyFundedBasisPoints;
  }


  public CreateFeeProfileRequest discoverExternallyFundedFixedFee(Long discoverExternallyFundedFixedFee) {
    
    this.discoverExternallyFundedFixedFee = discoverExternallyFundedFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual Discover externally funded &#x60;Transfer&#x60;.
   * @return discoverExternallyFundedFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual Discover externally funded `Transfer`.")

  public Long getDiscoverExternallyFundedFixedFee() {
    return discoverExternallyFundedFixedFee;
  }


  public void setDiscoverExternallyFundedFixedFee(Long discoverExternallyFundedFixedFee) {
    this.discoverExternallyFundedFixedFee = discoverExternallyFundedFixedFee;
  }


  public CreateFeeProfileRequest discoverNetworkAuthorizationFixedFee(Long discoverNetworkAuthorizationFixedFee) {
    
    this.discoverNetworkAuthorizationFixedFee = discoverNetworkAuthorizationFixedFee;
    return this;
  }

   /**
   * This fee applies to all Discover network &#x60;authorizations&#x60; and replaces the previously assessed Data Transmission.
   * @return discoverNetworkAuthorizationFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This fee applies to all Discover network `authorizations` and replaces the previously assessed Data Transmission.")

  public Long getDiscoverNetworkAuthorizationFixedFee() {
    return discoverNetworkAuthorizationFixedFee;
  }


  public void setDiscoverNetworkAuthorizationFixedFee(Long discoverNetworkAuthorizationFixedFee) {
    this.discoverNetworkAuthorizationFixedFee = discoverNetworkAuthorizationFixedFee;
  }


  public CreateFeeProfileRequest disputeFixedFee(Long disputeFixedFee) {
    
    this.disputeFixedFee = disputeFixedFee;
    return this;
  }

   /**
   * Applied when a &#x60;dispute&#x60; is created or updated to a **PENDING** state.
   * @return disputeFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applied when a `dispute` is created or updated to a **PENDING** state.")

  public Long getDisputeFixedFee() {
    return disputeFixedFee;
  }


  public void setDisputeFixedFee(Long disputeFixedFee) {
    this.disputeFixedFee = disputeFixedFee;
  }


  public CreateFeeProfileRequest disputeInquiryFixedFee(Long disputeInquiryFixedFee) {
    
    this.disputeInquiryFixedFee = disputeInquiryFixedFee;
    return this;
  }

   /**
   * Applied when a &#x60;dispute&#x60; is created or updated to a **INQUIRY** state.
   * @return disputeInquiryFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applied when a `dispute` is created or updated to a **INQUIRY** state.")

  public Long getDisputeInquiryFixedFee() {
    return disputeInquiryFixedFee;
  }


  public void setDisputeInquiryFixedFee(Long disputeInquiryFixedFee) {
    this.disputeInquiryFixedFee = disputeInquiryFixedFee;
  }


  public CreateFeeProfileRequest externallyFundedBasisPoints(Long externallyFundedBasisPoints) {
    
    this.externallyFundedBasisPoints = externallyFundedBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each &#x60;Transfer&#x60; that&#39;s card-based and externally funded. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return externallyFundedBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each `Transfer` that's card-based and externally funded. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getExternallyFundedBasisPoints() {
    return externallyFundedBasisPoints;
  }


  public void setExternallyFundedBasisPoints(Long externallyFundedBasisPoints) {
    this.externallyFundedBasisPoints = externallyFundedBasisPoints;
  }


  public CreateFeeProfileRequest externallyFundedFixedFee(Long externallyFundedFixedFee) {
    
    this.externallyFundedFixedFee = externallyFundedFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual &#x60;Transfer&#x60; that&#39;s card-based and externally funded.
   * @return externallyFundedFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual `Transfer` that's card-based and externally funded.")

  public Long getExternallyFundedFixedFee() {
    return externallyFundedFixedFee;
  }


  public void setExternallyFundedFixedFee(Long externallyFundedFixedFee) {
    this.externallyFundedFixedFee = externallyFundedFixedFee;
  }


  public CreateFeeProfileRequest fixedFee(Long fixedFee) {
    
    this.fixedFee = fixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual card-based &#x60;Transfer&#x60;.
   * @return fixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual card-based `Transfer`.")

  public Long getFixedFee() {
    return fixedFee;
  }


  public void setFixedFee(Long fixedFee) {
    this.fixedFee = fixedFee;
  }


  public CreateFeeProfileRequest jcbBasisPoints(Long jcbBasisPoints) {
    
    this.jcbBasisPoints = jcbBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each JCB &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return jcbBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each JCB `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getJcbBasisPoints() {
    return jcbBasisPoints;
  }


  public void setJcbBasisPoints(Long jcbBasisPoints) {
    this.jcbBasisPoints = jcbBasisPoints;
  }


  public CreateFeeProfileRequest jcbChargeInterchange(Boolean jcbChargeInterchange) {
    
    this.jcbChargeInterchange = jcbChargeInterchange;
    return this;
  }

   /**
   * Set to **True** to incur interchange fees for JCB Transfers.
   * @return jcbChargeInterchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **True** to incur interchange fees for JCB Transfers.")

  public Boolean getJcbChargeInterchange() {
    return jcbChargeInterchange;
  }


  public void setJcbChargeInterchange(Boolean jcbChargeInterchange) {
    this.jcbChargeInterchange = jcbChargeInterchange;
  }


  public CreateFeeProfileRequest jcbFixedFee(Long jcbFixedFee) {
    
    this.jcbFixedFee = jcbFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual JCB &#x60;Transfer&#x60;.
   * @return jcbFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual JCB `Transfer`.")

  public Long getJcbFixedFee() {
    return jcbFixedFee;
  }


  public void setJcbFixedFee(Long jcbFixedFee) {
    this.jcbFixedFee = jcbFixedFee;
  }


  public CreateFeeProfileRequest mastercardAcquirerFeesBasisPoints(Long mastercardAcquirerFeesBasisPoints) {
    
    this.mastercardAcquirerFeesBasisPoints = mastercardAcquirerFeesBasisPoints;
    return this;
  }

   /**
   * The fee is assessed on a business’s gross MasterCard processing volume. This fee varies per acquirer based on MasterCard’s assessed charge as it’s distributed across the acquirer’s portfolio of merchants. Generally, this fee is a fraction of a basis point. For example, 0.0045%, 0.0075%, etc. are examples of a likely fee.
   * @return mastercardAcquirerFeesBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fee is assessed on a business’s gross MasterCard processing volume. This fee varies per acquirer based on MasterCard’s assessed charge as it’s distributed across the acquirer’s portfolio of merchants. Generally, this fee is a fraction of a basis point. For example, 0.0045%, 0.0075%, etc. are examples of a likely fee.")

  public Long getMastercardAcquirerFeesBasisPoints() {
    return mastercardAcquirerFeesBasisPoints;
  }


  public void setMastercardAcquirerFeesBasisPoints(Long mastercardAcquirerFeesBasisPoints) {
    this.mastercardAcquirerFeesBasisPoints = mastercardAcquirerFeesBasisPoints;
  }


  public CreateFeeProfileRequest mastercardAssessmentsOver1kBasisPoints(Long mastercardAssessmentsOver1kBasisPoints) {
    
    this.mastercardAssessmentsOver1kBasisPoints = mastercardAssessmentsOver1kBasisPoints;
    return this;
  }

   /**
   * Fee applied to Mastercard credit sale transactions greater than $1,000.
   * @return mastercardAssessmentsOver1kBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee applied to Mastercard credit sale transactions greater than $1,000.")

  public Long getMastercardAssessmentsOver1kBasisPoints() {
    return mastercardAssessmentsOver1kBasisPoints;
  }


  public void setMastercardAssessmentsOver1kBasisPoints(Long mastercardAssessmentsOver1kBasisPoints) {
    this.mastercardAssessmentsOver1kBasisPoints = mastercardAssessmentsOver1kBasisPoints;
  }


  public CreateFeeProfileRequest mastercardAssessmentsUnder1kBasisPoints(Long mastercardAssessmentsUnder1kBasisPoints) {
    
    this.mastercardAssessmentsUnder1kBasisPoints = mastercardAssessmentsUnder1kBasisPoints;
    return this;
  }

   /**
   * Fee applied to Mastercard transactions less than or equal to $1,000.
   * @return mastercardAssessmentsUnder1kBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee applied to Mastercard transactions less than or equal to $1,000.")

  public Long getMastercardAssessmentsUnder1kBasisPoints() {
    return mastercardAssessmentsUnder1kBasisPoints;
  }


  public void setMastercardAssessmentsUnder1kBasisPoints(Long mastercardAssessmentsUnder1kBasisPoints) {
    this.mastercardAssessmentsUnder1kBasisPoints = mastercardAssessmentsUnder1kBasisPoints;
  }


  public CreateFeeProfileRequest mastercardBasisPoints(Long mastercardBasisPoints) {
    
    this.mastercardBasisPoints = mastercardBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each MasterCard &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return mastercardBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each MasterCard `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getMastercardBasisPoints() {
    return mastercardBasisPoints;
  }


  public void setMastercardBasisPoints(Long mastercardBasisPoints) {
    this.mastercardBasisPoints = mastercardBasisPoints;
  }


  public CreateFeeProfileRequest mastercardChargeInterchange(Boolean mastercardChargeInterchange) {
    
    this.mastercardChargeInterchange = mastercardChargeInterchange;
    return this;
  }

   /**
   * Set to **True** to incur interchange fees for MasterCard &#x60;Transfers&#x60;.
   * @return mastercardChargeInterchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **True** to incur interchange fees for MasterCard `Transfers`.")

  public Boolean getMastercardChargeInterchange() {
    return mastercardChargeInterchange;
  }


  public void setMastercardChargeInterchange(Boolean mastercardChargeInterchange) {
    this.mastercardChargeInterchange = mastercardChargeInterchange;
  }


  public CreateFeeProfileRequest mastercardFixedFee(Long mastercardFixedFee) {
    
    this.mastercardFixedFee = mastercardFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual MasterCard &#x60;Transfer&#x60;.
   * @return mastercardFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual MasterCard `Transfer`.")

  public Long getMastercardFixedFee() {
    return mastercardFixedFee;
  }


  public void setMastercardFixedFee(Long mastercardFixedFee) {
    this.mastercardFixedFee = mastercardFixedFee;
  }


  public CreateFeeProfileRequest qualifiedTiers(Object qualifiedTiers) {
    
    this.qualifiedTiers = qualifiedTiers;
    return this;
  }

   /**
   * The top of the qualified tier tree.
   * @return qualifiedTiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The top of the qualified tier tree.")

  public Object getQualifiedTiers() {
    return qualifiedTiers;
  }


  public void setQualifiedTiers(Object qualifiedTiers) {
    this.qualifiedTiers = qualifiedTiers;
  }


  public CreateFeeProfileRequest roundingMode(RoundingModeEnum roundingMode) {
    
    this.roundingMode = roundingMode;
    return this;
  }

   /**
   * &lt;ul&gt;&lt;li&gt;Include &lt;strong&gt;AGGREGATE&lt;/strong&gt; if you want to round after the settlement calculation.&lt;li&gt;By default, rounding happens before the sum of the settlement calculation (i.e. round each fee transfer)&lt;/ul&gt;
   * @return roundingMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<ul><li>Include <strong>AGGREGATE</strong> if you want to round after the settlement calculation.<li>By default, rounding happens before the sum of the settlement calculation (i.e. round each fee transfer)</ul>")

  public RoundingModeEnum getRoundingMode() {
    return roundingMode;
  }


  public void setRoundingMode(RoundingModeEnum roundingMode) {
    this.roundingMode = roundingMode;
  }


  public CreateFeeProfileRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateFeeProfileRequest putTagsItem(String key, String tagsItem) {
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


  public CreateFeeProfileRequest visaAcquirerProcessingFixedFee(Long visaAcquirerProcessingFixedFee) {
    
    this.visaAcquirerProcessingFixedFee = visaAcquirerProcessingFixedFee;
    return this;
  }

   /**
   * Applied to all U.S.-based credit card authorizations acquired in the U.S. regardless of where the issuer/cardholder is located. If your business is based in the U.S., the acquirer processing fee will apply to all Visa credit card authorizations.
   * @return visaAcquirerProcessingFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applied to all U.S.-based credit card authorizations acquired in the U.S. regardless of where the issuer/cardholder is located. If your business is based in the U.S., the acquirer processing fee will apply to all Visa credit card authorizations.")

  public Long getVisaAcquirerProcessingFixedFee() {
    return visaAcquirerProcessingFixedFee;
  }


  public void setVisaAcquirerProcessingFixedFee(Long visaAcquirerProcessingFixedFee) {
    this.visaAcquirerProcessingFixedFee = visaAcquirerProcessingFixedFee;
  }


  public CreateFeeProfileRequest visaAssessmentsBasisPoints(Long visaAssessmentsBasisPoints) {
    
    this.visaAssessmentsBasisPoints = visaAssessmentsBasisPoints;
    return this;
  }

   /**
   * Applies to all Visa credit transactions.
   * @return visaAssessmentsBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to all Visa credit transactions.")

  public Long getVisaAssessmentsBasisPoints() {
    return visaAssessmentsBasisPoints;
  }


  public void setVisaAssessmentsBasisPoints(Long visaAssessmentsBasisPoints) {
    this.visaAssessmentsBasisPoints = visaAssessmentsBasisPoints;
  }


  public CreateFeeProfileRequest visaBaseIICreditVoucherFixedFee(Long visaBaseIICreditVoucherFixedFee) {
    
    this.visaBaseIICreditVoucherFixedFee = visaBaseIICreditVoucherFixedFee;
    return this;
  }

   /**
   * Applies to all U.S.-based refunds.
   * @return visaBaseIICreditVoucherFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to all U.S.-based refunds.")

  public Long getVisaBaseIICreditVoucherFixedFee() {
    return visaBaseIICreditVoucherFixedFee;
  }


  public void setVisaBaseIICreditVoucherFixedFee(Long visaBaseIICreditVoucherFixedFee) {
    this.visaBaseIICreditVoucherFixedFee = visaBaseIICreditVoucherFixedFee;
  }


  public CreateFeeProfileRequest visaBaseIISystemFileTransmissionFixedFee(Long visaBaseIISystemFileTransmissionFixedFee) {
    
    this.visaBaseIISystemFileTransmissionFixedFee = visaBaseIISystemFileTransmissionFixedFee;
    return this;
  }

   /**
   * Applies to all Visa transactions and is charged in addition to other transaction-based assessments.
   * @return visaBaseIISystemFileTransmissionFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to all Visa transactions and is charged in addition to other transaction-based assessments.")

  public Long getVisaBaseIISystemFileTransmissionFixedFee() {
    return visaBaseIISystemFileTransmissionFixedFee;
  }


  public void setVisaBaseIISystemFileTransmissionFixedFee(Long visaBaseIISystemFileTransmissionFixedFee) {
    this.visaBaseIISystemFileTransmissionFixedFee = visaBaseIISystemFileTransmissionFixedFee;
  }


  public CreateFeeProfileRequest visaBasisPoints(Long visaBasisPoints) {
    
    this.visaBasisPoints = visaBasisPoints;
    return this;
  }

   /**
   * Percentage-based fee incurred against the full amount of each Visa &#x60;Transfer&#x60;. Calculated as one hundredth of one percent (1 basis point &#x3D; .0001 or .01%).
   * @return visaBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage-based fee incurred against the full amount of each Visa `Transfer`. Calculated as one hundredth of one percent (1 basis point = .0001 or .01%).")

  public Long getVisaBasisPoints() {
    return visaBasisPoints;
  }


  public void setVisaBasisPoints(Long visaBasisPoints) {
    this.visaBasisPoints = visaBasisPoints;
  }


  public CreateFeeProfileRequest visaChargeInterchange(Boolean visaChargeInterchange) {
    
    this.visaChargeInterchange = visaChargeInterchange;
    return this;
  }

   /**
   * Set to **True** to incur interchange fees for Visa &#x60;Transfers&#x60;.
   * @return visaChargeInterchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **True** to incur interchange fees for Visa `Transfers`.")

  public Boolean getVisaChargeInterchange() {
    return visaChargeInterchange;
  }


  public void setVisaChargeInterchange(Boolean visaChargeInterchange) {
    this.visaChargeInterchange = visaChargeInterchange;
  }


  public CreateFeeProfileRequest visaCreditVoucherFixedFee(Long visaCreditVoucherFixedFee) {
    
    this.visaCreditVoucherFixedFee = visaCreditVoucherFixedFee;
    return this;
  }

   /**
   * Applies to Visa refunds.
   * @return visaCreditVoucherFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to Visa refunds.")

  public Long getVisaCreditVoucherFixedFee() {
    return visaCreditVoucherFixedFee;
  }


  public void setVisaCreditVoucherFixedFee(Long visaCreditVoucherFixedFee) {
    this.visaCreditVoucherFixedFee = visaCreditVoucherFixedFee;
  }


  public CreateFeeProfileRequest visaFixedFee(Long visaFixedFee) {
    
    this.visaFixedFee = visaFixedFee;
    return this;
  }

   /**
   * Fee in cents incurred for each individual Visa &#x60;Transfer&#x60;.
   * @return visaFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee in cents incurred for each individual Visa `Transfer`.")

  public Long getVisaFixedFee() {
    return visaFixedFee;
  }


  public void setVisaFixedFee(Long visaFixedFee) {
    this.visaFixedFee = visaFixedFee;
  }


  public CreateFeeProfileRequest visaKilobyteAccessFixedFee(Long visaKilobyteAccessFixedFee) {
    
    this.visaKilobyteAccessFixedFee = visaKilobyteAccessFixedFee;
    return this;
  }

   /**
   * Charged on each authorization transaction submitted to Visa’s network for settlement.
   * @return visaKilobyteAccessFixedFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Charged on each authorization transaction submitted to Visa’s network for settlement.")

  public Long getVisaKilobyteAccessFixedFee() {
    return visaKilobyteAccessFixedFee;
  }


  public void setVisaKilobyteAccessFixedFee(Long visaKilobyteAccessFixedFee) {
    this.visaKilobyteAccessFixedFee = visaKilobyteAccessFixedFee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeeProfileRequest createFeeProfileRequest = (CreateFeeProfileRequest) o;
    return Objects.equals(this.achBasisPoints, createFeeProfileRequest.achBasisPoints) &&
        Objects.equals(this.achCreditReturnFixedFee, createFeeProfileRequest.achCreditReturnFixedFee) &&
        Objects.equals(this.achDebitReturnFixedFee, createFeeProfileRequest.achDebitReturnFixedFee) &&
        Objects.equals(this.achFixedFee, createFeeProfileRequest.achFixedFee) &&
        Objects.equals(this.americanExpressAssessmentBasisPoints, createFeeProfileRequest.americanExpressAssessmentBasisPoints) &&
        Objects.equals(this.americanExpressBasisPoints, createFeeProfileRequest.americanExpressBasisPoints) &&
        Objects.equals(this.americanExpressChargeInterchange, createFeeProfileRequest.americanExpressChargeInterchange) &&
        Objects.equals(this.americanExpressFixedFee, createFeeProfileRequest.americanExpressFixedFee) &&
        Objects.equals(this.americanExpressExternallyFundedBasisPoints, createFeeProfileRequest.americanExpressExternallyFundedBasisPoints) &&
        Objects.equals(this.americanExpressExternallyFundedFixedFee, createFeeProfileRequest.americanExpressExternallyFundedFixedFee) &&
        Objects.equals(this.ancillaryFixedFeePrimary, createFeeProfileRequest.ancillaryFixedFeePrimary) &&
        Objects.equals(this.ancillaryFixedFeeSecondary, createFeeProfileRequest.ancillaryFixedFeeSecondary) &&
        Objects.equals(this.application, createFeeProfileRequest.application) &&
        Objects.equals(this.basisPoints, createFeeProfileRequest.basisPoints) &&
        Objects.equals(this.chargeInterchange, createFeeProfileRequest.chargeInterchange) &&
        Objects.equals(this.dinersClubBasisPoints, createFeeProfileRequest.dinersClubBasisPoints) &&
        Objects.equals(this.dinersClubChargeInterchange, createFeeProfileRequest.dinersClubChargeInterchange) &&
        Objects.equals(this.dinersClubFixedFee, createFeeProfileRequest.dinersClubFixedFee) &&
        Objects.equals(this.discoverAssessmentsBasisPoints, createFeeProfileRequest.discoverAssessmentsBasisPoints) &&
        Objects.equals(this.discoverBasisPoints, createFeeProfileRequest.discoverBasisPoints) &&
        Objects.equals(this.discoverChargeInterchange, createFeeProfileRequest.discoverChargeInterchange) &&
        Objects.equals(this.discoverDataUsageFixedFee, createFeeProfileRequest.discoverDataUsageFixedFee) &&
        Objects.equals(this.discoverFixedFee, createFeeProfileRequest.discoverFixedFee) &&
        Objects.equals(this.discoverExternallyFundedBasisPoints, createFeeProfileRequest.discoverExternallyFundedBasisPoints) &&
        Objects.equals(this.discoverExternallyFundedFixedFee, createFeeProfileRequest.discoverExternallyFundedFixedFee) &&
        Objects.equals(this.discoverNetworkAuthorizationFixedFee, createFeeProfileRequest.discoverNetworkAuthorizationFixedFee) &&
        Objects.equals(this.disputeFixedFee, createFeeProfileRequest.disputeFixedFee) &&
        Objects.equals(this.disputeInquiryFixedFee, createFeeProfileRequest.disputeInquiryFixedFee) &&
        Objects.equals(this.externallyFundedBasisPoints, createFeeProfileRequest.externallyFundedBasisPoints) &&
        Objects.equals(this.externallyFundedFixedFee, createFeeProfileRequest.externallyFundedFixedFee) &&
        Objects.equals(this.fixedFee, createFeeProfileRequest.fixedFee) &&
        Objects.equals(this.jcbBasisPoints, createFeeProfileRequest.jcbBasisPoints) &&
        Objects.equals(this.jcbChargeInterchange, createFeeProfileRequest.jcbChargeInterchange) &&
        Objects.equals(this.jcbFixedFee, createFeeProfileRequest.jcbFixedFee) &&
        Objects.equals(this.mastercardAcquirerFeesBasisPoints, createFeeProfileRequest.mastercardAcquirerFeesBasisPoints) &&
        Objects.equals(this.mastercardAssessmentsOver1kBasisPoints, createFeeProfileRequest.mastercardAssessmentsOver1kBasisPoints) &&
        Objects.equals(this.mastercardAssessmentsUnder1kBasisPoints, createFeeProfileRequest.mastercardAssessmentsUnder1kBasisPoints) &&
        Objects.equals(this.mastercardBasisPoints, createFeeProfileRequest.mastercardBasisPoints) &&
        Objects.equals(this.mastercardChargeInterchange, createFeeProfileRequest.mastercardChargeInterchange) &&
        Objects.equals(this.mastercardFixedFee, createFeeProfileRequest.mastercardFixedFee) &&
        Objects.equals(this.qualifiedTiers, createFeeProfileRequest.qualifiedTiers) &&
        Objects.equals(this.roundingMode, createFeeProfileRequest.roundingMode) &&
        Objects.equals(this.tags, createFeeProfileRequest.tags) &&
        Objects.equals(this.visaAcquirerProcessingFixedFee, createFeeProfileRequest.visaAcquirerProcessingFixedFee) &&
        Objects.equals(this.visaAssessmentsBasisPoints, createFeeProfileRequest.visaAssessmentsBasisPoints) &&
        Objects.equals(this.visaBaseIICreditVoucherFixedFee, createFeeProfileRequest.visaBaseIICreditVoucherFixedFee) &&
        Objects.equals(this.visaBaseIISystemFileTransmissionFixedFee, createFeeProfileRequest.visaBaseIISystemFileTransmissionFixedFee) &&
        Objects.equals(this.visaBasisPoints, createFeeProfileRequest.visaBasisPoints) &&
        Objects.equals(this.visaChargeInterchange, createFeeProfileRequest.visaChargeInterchange) &&
        Objects.equals(this.visaCreditVoucherFixedFee, createFeeProfileRequest.visaCreditVoucherFixedFee) &&
        Objects.equals(this.visaFixedFee, createFeeProfileRequest.visaFixedFee) &&
        Objects.equals(this.visaKilobyteAccessFixedFee, createFeeProfileRequest.visaKilobyteAccessFixedFee);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(achBasisPoints, achCreditReturnFixedFee, achDebitReturnFixedFee, achFixedFee, americanExpressAssessmentBasisPoints, americanExpressBasisPoints, americanExpressChargeInterchange, americanExpressFixedFee, americanExpressExternallyFundedBasisPoints, americanExpressExternallyFundedFixedFee, ancillaryFixedFeePrimary, ancillaryFixedFeeSecondary, application, basisPoints, chargeInterchange, dinersClubBasisPoints, dinersClubChargeInterchange, dinersClubFixedFee, discoverAssessmentsBasisPoints, discoverBasisPoints, discoverChargeInterchange, discoverDataUsageFixedFee, discoverFixedFee, discoverExternallyFundedBasisPoints, discoverExternallyFundedFixedFee, discoverNetworkAuthorizationFixedFee, disputeFixedFee, disputeInquiryFixedFee, externallyFundedBasisPoints, externallyFundedFixedFee, fixedFee, jcbBasisPoints, jcbChargeInterchange, jcbFixedFee, mastercardAcquirerFeesBasisPoints, mastercardAssessmentsOver1kBasisPoints, mastercardAssessmentsUnder1kBasisPoints, mastercardBasisPoints, mastercardChargeInterchange, mastercardFixedFee, qualifiedTiers, roundingMode, tags, visaAcquirerProcessingFixedFee, visaAssessmentsBasisPoints, visaBaseIICreditVoucherFixedFee, visaBaseIISystemFileTransmissionFixedFee, visaBasisPoints, visaChargeInterchange, visaCreditVoucherFixedFee, visaFixedFee, visaKilobyteAccessFixedFee);
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
    sb.append("class CreateFeeProfileRequest {\n");
    sb.append("    achBasisPoints: ").append(toIndentedString(achBasisPoints)).append("\n");
    sb.append("    achCreditReturnFixedFee: ").append(toIndentedString(achCreditReturnFixedFee)).append("\n");
    sb.append("    achDebitReturnFixedFee: ").append(toIndentedString(achDebitReturnFixedFee)).append("\n");
    sb.append("    achFixedFee: ").append(toIndentedString(achFixedFee)).append("\n");
    sb.append("    americanExpressAssessmentBasisPoints: ").append(toIndentedString(americanExpressAssessmentBasisPoints)).append("\n");
    sb.append("    americanExpressBasisPoints: ").append(toIndentedString(americanExpressBasisPoints)).append("\n");
    sb.append("    americanExpressChargeInterchange: ").append(toIndentedString(americanExpressChargeInterchange)).append("\n");
    sb.append("    americanExpressFixedFee: ").append(toIndentedString(americanExpressFixedFee)).append("\n");
    sb.append("    americanExpressExternallyFundedBasisPoints: ").append(toIndentedString(americanExpressExternallyFundedBasisPoints)).append("\n");
    sb.append("    americanExpressExternallyFundedFixedFee: ").append(toIndentedString(americanExpressExternallyFundedFixedFee)).append("\n");
    sb.append("    ancillaryFixedFeePrimary: ").append(toIndentedString(ancillaryFixedFeePrimary)).append("\n");
    sb.append("    ancillaryFixedFeeSecondary: ").append(toIndentedString(ancillaryFixedFeeSecondary)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    basisPoints: ").append(toIndentedString(basisPoints)).append("\n");
    sb.append("    chargeInterchange: ").append(toIndentedString(chargeInterchange)).append("\n");
    sb.append("    dinersClubBasisPoints: ").append(toIndentedString(dinersClubBasisPoints)).append("\n");
    sb.append("    dinersClubChargeInterchange: ").append(toIndentedString(dinersClubChargeInterchange)).append("\n");
    sb.append("    dinersClubFixedFee: ").append(toIndentedString(dinersClubFixedFee)).append("\n");
    sb.append("    discoverAssessmentsBasisPoints: ").append(toIndentedString(discoverAssessmentsBasisPoints)).append("\n");
    sb.append("    discoverBasisPoints: ").append(toIndentedString(discoverBasisPoints)).append("\n");
    sb.append("    discoverChargeInterchange: ").append(toIndentedString(discoverChargeInterchange)).append("\n");
    sb.append("    discoverDataUsageFixedFee: ").append(toIndentedString(discoverDataUsageFixedFee)).append("\n");
    sb.append("    discoverFixedFee: ").append(toIndentedString(discoverFixedFee)).append("\n");
    sb.append("    discoverExternallyFundedBasisPoints: ").append(toIndentedString(discoverExternallyFundedBasisPoints)).append("\n");
    sb.append("    discoverExternallyFundedFixedFee: ").append(toIndentedString(discoverExternallyFundedFixedFee)).append("\n");
    sb.append("    discoverNetworkAuthorizationFixedFee: ").append(toIndentedString(discoverNetworkAuthorizationFixedFee)).append("\n");
    sb.append("    disputeFixedFee: ").append(toIndentedString(disputeFixedFee)).append("\n");
    sb.append("    disputeInquiryFixedFee: ").append(toIndentedString(disputeInquiryFixedFee)).append("\n");
    sb.append("    externallyFundedBasisPoints: ").append(toIndentedString(externallyFundedBasisPoints)).append("\n");
    sb.append("    externallyFundedFixedFee: ").append(toIndentedString(externallyFundedFixedFee)).append("\n");
    sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
    sb.append("    jcbBasisPoints: ").append(toIndentedString(jcbBasisPoints)).append("\n");
    sb.append("    jcbChargeInterchange: ").append(toIndentedString(jcbChargeInterchange)).append("\n");
    sb.append("    jcbFixedFee: ").append(toIndentedString(jcbFixedFee)).append("\n");
    sb.append("    mastercardAcquirerFeesBasisPoints: ").append(toIndentedString(mastercardAcquirerFeesBasisPoints)).append("\n");
    sb.append("    mastercardAssessmentsOver1kBasisPoints: ").append(toIndentedString(mastercardAssessmentsOver1kBasisPoints)).append("\n");
    sb.append("    mastercardAssessmentsUnder1kBasisPoints: ").append(toIndentedString(mastercardAssessmentsUnder1kBasisPoints)).append("\n");
    sb.append("    mastercardBasisPoints: ").append(toIndentedString(mastercardBasisPoints)).append("\n");
    sb.append("    mastercardChargeInterchange: ").append(toIndentedString(mastercardChargeInterchange)).append("\n");
    sb.append("    mastercardFixedFee: ").append(toIndentedString(mastercardFixedFee)).append("\n");
    sb.append("    qualifiedTiers: ").append(toIndentedString(qualifiedTiers)).append("\n");
    sb.append("    roundingMode: ").append(toIndentedString(roundingMode)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    visaAcquirerProcessingFixedFee: ").append(toIndentedString(visaAcquirerProcessingFixedFee)).append("\n");
    sb.append("    visaAssessmentsBasisPoints: ").append(toIndentedString(visaAssessmentsBasisPoints)).append("\n");
    sb.append("    visaBaseIICreditVoucherFixedFee: ").append(toIndentedString(visaBaseIICreditVoucherFixedFee)).append("\n");
    sb.append("    visaBaseIISystemFileTransmissionFixedFee: ").append(toIndentedString(visaBaseIISystemFileTransmissionFixedFee)).append("\n");
    sb.append("    visaBasisPoints: ").append(toIndentedString(visaBasisPoints)).append("\n");
    sb.append("    visaChargeInterchange: ").append(toIndentedString(visaChargeInterchange)).append("\n");
    sb.append("    visaCreditVoucherFixedFee: ").append(toIndentedString(visaCreditVoucherFixedFee)).append("\n");
    sb.append("    visaFixedFee: ").append(toIndentedString(visaFixedFee)).append("\n");
    sb.append("    visaKilobyteAccessFixedFee: ").append(toIndentedString(visaKilobyteAccessFixedFee)).append("\n");
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
    openapiFields.add("ach_basis_points");
    openapiFields.add("ach_credit_return_fixed_fee");
    openapiFields.add("ach_debit_return_fixed_fee");
    openapiFields.add("ach_fixed_fee");
    openapiFields.add("american_express_assessment_basis_points");
    openapiFields.add("american_express_basis_points");
    openapiFields.add("american_express_charge_interchange");
    openapiFields.add("american_express_fixed_fee");
    openapiFields.add("american_express_externally_funded_basis_points");
    openapiFields.add("american_express_externally_funded_fixed_fee");
    openapiFields.add("ancillary_fixed_fee_primary");
    openapiFields.add("ancillary_fixed_fee_secondary");
    openapiFields.add("application");
    openapiFields.add("basis_points");
    openapiFields.add("charge_interchange");
    openapiFields.add("diners_club_basis_points");
    openapiFields.add("diners_club_charge_interchange");
    openapiFields.add("diners_club_fixed_fee");
    openapiFields.add("discover_assessments_basis_points");
    openapiFields.add("discover_basis_points");
    openapiFields.add("discover_charge_interchange");
    openapiFields.add("discover_data_usage_fixed_fee");
    openapiFields.add("discover_fixed_fee");
    openapiFields.add("discover_externally_funded_basis_points");
    openapiFields.add("discover_externally_funded_fixed_fee");
    openapiFields.add("discover_network_authorization_fixed_fee");
    openapiFields.add("dispute_fixed_fee");
    openapiFields.add("dispute_inquiry_fixed_fee");
    openapiFields.add("externally_funded_basis_points");
    openapiFields.add("externally_funded_fixed_fee");
    openapiFields.add("fixed_fee");
    openapiFields.add("jcb_basis_points");
    openapiFields.add("jcb_charge_interchange");
    openapiFields.add("jcb_fixed_fee");
    openapiFields.add("mastercard_acquirer_fees_basis_points");
    openapiFields.add("mastercard_assessments_over1k_basis_points");
    openapiFields.add("mastercard_assessments_under1k_basis_points");
    openapiFields.add("mastercard_basis_points");
    openapiFields.add("mastercard_charge_interchange");
    openapiFields.add("mastercard_fixed_fee");
    openapiFields.add("qualified_tiers");
    openapiFields.add("rounding_mode");
    openapiFields.add("tags");
    openapiFields.add("visa_acquirer_processing_fixed_fee");
    openapiFields.add("visa_assessments_basis_points");
    openapiFields.add("visa_base_II_credit_voucher_fixed_fee");
    openapiFields.add("visa_base_II_system_file_transmission_fixed_fee");
    openapiFields.add("visa_basis_points");
    openapiFields.add("visa_charge_interchange");
    openapiFields.add("visa_credit_voucher_fixed_fee");
    openapiFields.add("visa_fixed_fee");
    openapiFields.add("visa_kilobyte_access_fixed_fee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("application");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateFeeProfileRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateFeeProfileRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFeeProfileRequest is not found in the empty JSON string", CreateFeeProfileRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateFeeProfileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFeeProfileRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateFeeProfileRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
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
      if (jsonObj.get("rounding_mode") != null && !jsonObj.get("rounding_mode").isJsonNull()  && !jsonObj.get("rounding_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rounding_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rounding_mode").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFeeProfileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFeeProfileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFeeProfileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFeeProfileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFeeProfileRequest>() {
           @Override
           public void write(JsonWriter out, CreateFeeProfileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFeeProfileRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateFeeProfileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFeeProfileRequest
  * @throws IOException if the JSON string is invalid with respect to CreateFeeProfileRequest
  */
  public static CreateFeeProfileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFeeProfileRequest.class);
  }

 /**
  * Convert an instance of CreateFeeProfileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

