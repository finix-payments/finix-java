/*
 * Finix API
 */


package model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of fee.
 */
@JsonAdapter(FeeType.Adapter.class)
public enum FeeType {
  
  APPLICATION_FEE("APPLICATION_FEE"),
  
  ACH_BASIS_POINTS("ACH_BASIS_POINTS"),
  
  ACH_FIXED("ACH_FIXED"),
  
  CARD_BASIS_POINTS("CARD_BASIS_POINTS"),
  
  CARD_FIXED("CARD_FIXED"),
  
  CARD_INTERCHANGE("CARD_INTERCHANGE"),
  
  VISA_BASIS_POINTS("VISA_BASIS_POINTS"),
  
  VISA_FIXED("VISA_FIXED"),
  
  VISA_INTERCHANGE("VISA_INTERCHANGE"),
  
  VISA_ASSESSMENT_BASIS_POINTS("VISA_ASSESSMENT_BASIS_POINTS"),
  
  VISA_ACQUIRER_PROCESSING_FIXED("VISA_ACQUIRER_PROCESSING_FIXED"),
  
  VISA_CREDIT_VOUCHER_FIXED("VISA_CREDIT_VOUCHER_FIXED"),
  
  VISA_BASE_II_SYSTEM_FILE_TRANSMISSION_FIXED("VISA_BASE_II_SYSTEM_FILE_TRANSMISSION_FIXED"),
  
  VISA_BASE_II_CREDIT_VOUCHER_FIXED("VISA_BASE_II_CREDIT_VOUCHER_FIXED"),
  
  VISA_KILOBYTE_ACCESS_FIXED("VISA_KILOBYTE_ACCESS_FIXED"),
  
  DISCOVER_BASIS_POINTS("DISCOVER_BASIS_POINTS"),
  
  DISCOVER_FIXED("DISCOVER_FIXED"),
  
  DISCOVER_INTERCHANGE("DISCOVER_INTERCHANGE"),
  
  DISCOVER_ASSESSMENT_BASIS_POINTS("DISCOVER_ASSESSMENT_BASIS_POINTS"),
  
  DISCOVER_DATA_USAGE_FIXED("DISCOVER_DATA_USAGE_FIXED"),
  
  DISCOVER_NETWORK_AUTHORIZATION_FIXED("DISCOVER_NETWORK_AUTHORIZATION_FIXED"),
  
  DINERS_CLUB_BASIS_POINTS("DINERS_CLUB_BASIS_POINTS"),
  
  DINERS_CLUB_FIXED("DINERS_CLUB_FIXED"),
  
  DINERS_CLUB_INTERCHANGE("DINERS_CLUB_INTERCHANGE"),
  
  MASTERCARD_BASIS_POINTS("MASTERCARD_BASIS_POINTS"),
  
  MASTERCARD_FIXED("MASTERCARD_FIXED"),
  
  MASTERCARD_INTERCHANGE("MASTERCARD_INTERCHANGE"),
  
  MASTERCARD_ASSESSMENT_UNDER_1K_BASIS_POINTS("MASTERCARD_ASSESSMENT_UNDER_1K_BASIS_POINTS"),
  
  MASTERCARD_ASSESSMENT_OVER_1K_BASIS_POINTS("MASTERCARD_ASSESSMENT_OVER_1K_BASIS_POINTS"),
  
  MASTERCARD_ACQUIRER_FEE_BASIS_POINTS("MASTERCARD_ACQUIRER_FEE_BASIS_POINTS"),
  
  JCB_BASIS_POINTS("JCB_BASIS_POINTS"),
  
  JCB_FIXED("JCB_FIXED"),
  
  JCB_INTERCHANGE("JCB_INTERCHANGE"),
  
  AMERICAN_EXPRESS_BASIS_POINTS("AMERICAN_EXPRESS_BASIS_POINTS"),
  
  AMERICAN_EXPRESS_FIXED("AMERICAN_EXPRESS_FIXED"),
  
  AMERICAN_EXPRESS_INTERCHANGE("AMERICAN_EXPRESS_INTERCHANGE"),
  
  AMERICAN_EXPRESS_ASSESSMENT_BASIS_POINTS("AMERICAN_EXPRESS_ASSESSMENT_BASIS_POINTS"),
  
  DISPUTE_INQUIRY_FIXED_FEE("DISPUTE_INQUIRY_FIXED_FEE"),
  
  DISPUTE_FIXED_FEE("DISPUTE_FIXED_FEE"),
  
  QUALIFIED_TIER_BASIS_POINTS_FEE("QUALIFIED_TIER_BASIS_POINTS_FEE"),
  
  QUALIFIED_TIER_FIXED_FEE("QUALIFIED_TIER_FIXED_FEE"),
  
  CUSTOM("CUSTOM"),
  
  ACH_DEBIT_RETURN_FIXED_FEE("ACH_DEBIT_RETURN_FIXED_FEE"),
  
  ACH_CREDIT_RETURN_FIXED_FEE("ACH_CREDIT_RETURN_FIXED_FEE"),
  
  ANCILLARY_FIXED_FEE_PRIMARY("ANCILLARY_FIXED_FEE_PRIMARY"),
  
  ANCILLARY_FIXED_FEE_SECONDARY("ANCILLARY_FIXED_FEE_SECONDARY"),
  
  SETTLEMENT_V2_TRANSFER("SETTLEMENT_V2_TRANSFER"),
  
  UNKNOWN_DEFAULT("unknown_default_open_api");

  private String value;

  FeeType(String value) {
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

    public static FeeType fromValue(String value) {
        for (FeeType b : FeeType.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }
        FeeType unknownDefault = FeeType.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
   }

  public static class Adapter extends TypeAdapter<FeeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FeeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FeeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FeeType.fromValue(value);
    }
  }
}

