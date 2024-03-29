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
 * ISO 4217 3 letter currency code.
 */
@JsonAdapter(Currency.Adapter.class)
public enum Currency {
  
  AED("AED"),
  
  AFN("AFN"),
  
  ALL("ALL"),
  
  AMD("AMD"),
  
  ANG("ANG"),
  
  AOA("AOA"),
  
  ARS("ARS"),
  
  AUD("AUD"),
  
  AWG("AWG"),
  
  AZN("AZN"),
  
  BAM("BAM"),
  
  BBD("BBD"),
  
  BDT("BDT"),
  
  BGN("BGN"),
  
  BHD("BHD"),
  
  BIF("BIF"),
  
  BMD("BMD"),
  
  BND("BND"),
  
  BOB("BOB"),
  
  BOV("BOV"),
  
  BRL("BRL"),
  
  BSD("BSD"),
  
  BTN("BTN"),
  
  BWP("BWP"),
  
  BYR("BYR"),
  
  BZD("BZD"),
  
  CAD("CAD"),
  
  CDF("CDF"),
  
  CHE("CHE"),
  
  CHF("CHF"),
  
  CHW("CHW"),
  
  CLF("CLF"),
  
  CLP("CLP"),
  
  CNY("CNY"),
  
  COP("COP"),
  
  COU("COU"),
  
  CRC("CRC"),
  
  CUC("CUC"),
  
  CUP("CUP"),
  
  CVE("CVE"),
  
  CZK("CZK"),
  
  DJF("DJF"),
  
  DKK("DKK"),
  
  DOP("DOP"),
  
  DZD("DZD"),
  
  EGP("EGP"),
  
  ERN("ERN"),
  
  ETB("ETB"),
  
  EUR("EUR"),
  
  FJD("FJD"),
  
  FKP("FKP"),
  
  GBP("GBP"),
  
  GEL("GEL"),
  
  GHS("GHS"),
  
  GIP("GIP"),
  
  GMD("GMD"),
  
  GNF("GNF"),
  
  GTQ("GTQ"),
  
  GYD("GYD"),
  
  HKD("HKD"),
  
  HNL("HNL"),
  
  HRK("HRK"),
  
  HTG("HTG"),
  
  HUF("HUF"),
  
  IDR("IDR"),
  
  ILS("ILS"),
  
  INR("INR"),
  
  IQD("IQD"),
  
  IRR("IRR"),
  
  ISK("ISK"),
  
  JMD("JMD"),
  
  JOD("JOD"),
  
  JPY("JPY"),
  
  KES("KES"),
  
  KGS("KGS"),
  
  KHR("KHR"),
  
  KMF("KMF"),
  
  KPW("KPW"),
  
  KRW("KRW"),
  
  KWD("KWD"),
  
  KYD("KYD"),
  
  KZT("KZT"),
  
  LAK("LAK"),
  
  LBP("LBP"),
  
  LKR("LKR"),
  
  LRD("LRD"),
  
  LSL("LSL"),
  
  LTL("LTL"),
  
  LYD("LYD"),
  
  MAD("MAD"),
  
  MDL("MDL"),
  
  MGA("MGA"),
  
  MKD("MKD"),
  
  MMK("MMK"),
  
  MNT("MNT"),
  
  MOP("MOP"),
  
  MRO("MRO"),
  
  MUR("MUR"),
  
  MVR("MVR"),
  
  MWK("MWK"),
  
  MXN("MXN"),
  
  MXV("MXV"),
  
  MYR("MYR"),
  
  MZN("MZN"),
  
  NAD("NAD"),
  
  NGN("NGN"),
  
  NIO("NIO"),
  
  NOK("NOK"),
  
  NPR("NPR"),
  
  NZD("NZD"),
  
  OMR("OMR"),
  
  PAB("PAB"),
  
  PEN("PEN"),
  
  PGK("PGK"),
  
  PHP("PHP"),
  
  PKR("PKR"),
  
  PLN("PLN"),
  
  PYG("PYG"),
  
  QAR("QAR"),
  
  RON("RON"),
  
  RSD("RSD"),
  
  RUB("RUB"),
  
  RWF("RWF"),
  
  SAR("SAR"),
  
  SBD("SBD"),
  
  SCR("SCR"),
  
  SDG("SDG"),
  
  SEK("SEK"),
  
  SGD("SGD"),
  
  SHP("SHP"),
  
  SLL("SLL"),
  
  SOS("SOS"),
  
  SRD("SRD"),
  
  SSP("SSP"),
  
  STD("STD"),
  
  SVC("SVC"),
  
  SYP("SYP"),
  
  SZL("SZL"),
  
  THB("THB"),
  
  TJS("TJS"),
  
  TMT("TMT"),
  
  TND("TND"),
  
  TOP("TOP"),
  
  TRY("TRY"),
  
  TTD("TTD"),
  
  TWD("TWD"),
  
  TZS("TZS"),
  
  UAH("UAH"),
  
  UGX("UGX"),
  
  USD("USD"),
  
  USN("USN"),
  
  UYI("UYI"),
  
  UYU("UYU"),
  
  UZS("UZS"),
  
  VEF("VEF"),
  
  VND("VND"),
  
  VUV("VUV"),
  
  WST("WST"),
  
  XAF("XAF"),
  
  XAG("XAG"),
  
  XAU("XAU"),
  
  XBA("XBA"),
  
  XBB("XBB"),
  
  XBC("XBC"),
  
  XBD("XBD"),
  
  XCD("XCD"),
  
  XDR("XDR"),
  
  XOF("XOF"),
  
  XPD("XPD"),
  
  XPF("XPF"),
  
  XPT("XPT"),
  
  XSU("XSU"),
  
  XTS("XTS"),
  
  XUA("XUA"),
  
  XXX("XXX"),
  
  YER("YER"),
  
  ZAR("ZAR"),
  
  ZMW("ZMW"),
  
  ZWL("ZWL"),
  
  UNKNOWN_DEFAULT("unknown_default_open_api");

  private String value;

  Currency(String value) {
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

    public static Currency fromValue(String value) {
        for (Currency b : Currency.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }
        Currency unknownDefault = Currency.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
   }

  public static class Adapter extends TypeAdapter<Currency> {
    @Override
    public void write(final JsonWriter jsonWriter, final Currency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Currency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Currency.fromValue(value);
    }
  }
}

