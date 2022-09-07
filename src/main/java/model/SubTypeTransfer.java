/*
 * Finix API
 */


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets SubTypeTransfer
 */
@JsonAdapter(SubTypeTransfer.Adapter.class)
public enum SubTypeTransfer {
  
  API("API"),
  
  APPLICATION_FEE("APPLICATION_FEE"),
  
  DISPUTE("DISPUTE"),
  
  MERCHANT_CREDIT("MERCHANT_CREDIT"),
  
  MERCHANT_CREDIT_ADJUSTMENT("MERCHANT_CREDIT_ADJUSTMENT"),
  
  MERCHANT_DEBIT("MERCHANT_DEBIT"),
  
  MERCHANT_DEBIT_ADJUSTMENT("MERCHANT_DEBIT_ADJUSTMENT"),
  
  PLATFORM_CREDIT("PLATFORM_CREDIT"),
  
  PLATFORM_CREDIT_ADJUSTMENT("PLATFORM_CREDIT_ADJUSTMENT"),
  
  PLATFORM_DEBIT("PLATFORM_DEBIT"),
  
  PLATFORM_DEBIT_ADJUSTMENT("PLATFORM_DEBIT_ADJUSTMENT"),
  
  PLATFORM_FEE("PLATFORM_FEE"),
  
  SETTLEMENT_MERCHANT("SETTLEMENT_MERCHANT"),
  
  SETTLEMENT_NOOP("SETTLEMENT_NOOP"),
  
  SETTLEMENT_PARTNER("SETTLEMENT_PARTNER"),
  
  SETTLEMENT_PLATFORM("SETTLEMENT_PLATFORM"),
  
  SPLIT_PAYOUT("SPLIT_PAYOUT"),
  
  SPLIT_PAYOUT_ADJUSTMENT("SPLIT_PAYOUT_ADJUSTMENT"),
  
  UNKNOWN_DEFAULT("unknown_default_open_api");

  private String value;

  SubTypeTransfer(String value) {
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

    public static SubTypeTransfer fromValue(String value) {
        for (SubTypeTransfer b : SubTypeTransfer.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }
        SubTypeTransfer unknownDefault = SubTypeTransfer.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
   }

  public static class Adapter extends TypeAdapter<SubTypeTransfer> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubTypeTransfer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubTypeTransfer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SubTypeTransfer.fromValue(value);
    }
  }
}

