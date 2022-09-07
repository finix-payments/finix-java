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
 * Details the operation that&#39;ll be performed in the transaction (Card present transactions only) .
 */
@JsonAdapter(OperationKey.Adapter.class)
public enum OperationKey {
  
  PUSH_TO_CARD("PUSH_TO_CARD"),
  
  PULL_FROM_CARD("PULL_FROM_CARD"),
  
  CARD_PRESENT_DEBIT("CARD_PRESENT_DEBIT"),
  
  CARD_PRESENT_UNREFERENCED_REFUND("CARD_PRESENT_UNREFERENCED_REFUND"),
  
  SALE("SALE"),
  
  UNREFERENCED_REFUND("UNREFERENCED_REFUND"),
  
  MERCHANT_CREDIT_ADJUSTMENT("MERCHANT_CREDIT_ADJUSTMENT"),
  
  MERCHANT_DEBIT_ADJUSTMENT("MERCHANT_DEBIT_ADJUSTMENT"),
  
  CARD_PRESENT_AUTHORIZATION("CARD_PRESENT_AUTHORIZATION"),
  
  UNKNOWN_DEFAULT("unknown_default_open_api");

  private String value;

  OperationKey(String value) {
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

    public static OperationKey fromValue(String value) {
        for (OperationKey b : OperationKey.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }
        if (value.equals(null) && value.length() == 0) {
            return null;
        }
        OperationKey unknownDefault = OperationKey.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
   }

  public static class Adapter extends TypeAdapter<OperationKey> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperationKey enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OperationKey read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OperationKey.fromValue(value);
    }
  }
}

