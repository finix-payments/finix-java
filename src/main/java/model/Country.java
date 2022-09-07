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
 * The sender’s country.
 */
@JsonAdapter(Country.Adapter.class)
public enum Country {
  
  ABW("ABW"),
  
  AFG("AFG"),
  
  AGO("AGO"),
  
  AIA("AIA"),
  
  ALA("ALA"),
  
  ALB("ALB"),
  
  AND("AND"),
  
  ARE("ARE"),
  
  ARG("ARG"),
  
  ARM("ARM"),
  
  ASM("ASM"),
  
  ATA("ATA"),
  
  ATF("ATF"),
  
  ATG("ATG"),
  
  AUS("AUS"),
  
  AUT("AUT"),
  
  AZE("AZE"),
  
  BDI("BDI"),
  
  BEL("BEL"),
  
  BEN("BEN"),
  
  BES("BES"),
  
  BFA("BFA"),
  
  BGD("BGD"),
  
  BGR("BGR"),
  
  BHR("BHR"),
  
  BHS("BHS"),
  
  BIH("BIH"),
  
  BLM("BLM"),
  
  BLR("BLR"),
  
  BLZ("BLZ"),
  
  BMU("BMU"),
  
  BOL("BOL"),
  
  BRA("BRA"),
  
  BRB("BRB"),
  
  BRN("BRN"),
  
  BTN("BTN"),
  
  BVT("BVT"),
  
  BWA("BWA"),
  
  CAF("CAF"),
  
  CAN("CAN"),
  
  CCK("CCK"),
  
  CHE("CHE"),
  
  CHL("CHL"),
  
  CHN("CHN"),
  
  CIV("CIV"),
  
  CMR("CMR"),
  
  COD("COD"),
  
  COG("COG"),
  
  COK("COK"),
  
  COL("COL"),
  
  COM("COM"),
  
  CPV("CPV"),
  
  CRI("CRI"),
  
  CUB("CUB"),
  
  CUW("CUW"),
  
  CXR("CXR"),
  
  CYM("CYM"),
  
  CYP("CYP"),
  
  CZE("CZE"),
  
  DEU("DEU"),
  
  DJI("DJI"),
  
  DMA("DMA"),
  
  DNK("DNK"),
  
  DOM("DOM"),
  
  DZA("DZA"),
  
  ECU("ECU"),
  
  EGY("EGY"),
  
  ERI("ERI"),
  
  ESH("ESH"),
  
  ESP("ESP"),
  
  EST("EST"),
  
  ETH("ETH"),
  
  FIN("FIN"),
  
  FJI("FJI"),
  
  FLK("FLK"),
  
  FRA("FRA"),
  
  FRO("FRO"),
  
  FSM("FSM"),
  
  GAB("GAB"),
  
  GBR("GBR"),
  
  GEO("GEO"),
  
  GGY("GGY"),
  
  GHA("GHA"),
  
  GIB("GIB"),
  
  GIN("GIN"),
  
  GLP("GLP"),
  
  GMB("GMB"),
  
  GNB("GNB"),
  
  GNQ("GNQ"),
  
  GRC("GRC"),
  
  GRD("GRD"),
  
  GRL("GRL"),
  
  GTM("GTM"),
  
  GUF("GUF"),
  
  GUM("GUM"),
  
  GUY("GUY"),
  
  HKG("HKG"),
  
  HMD("HMD"),
  
  HND("HND"),
  
  HRV("HRV"),
  
  HTI("HTI"),
  
  HUN("HUN"),
  
  IDN("IDN"),
  
  IMN("IMN"),
  
  IND("IND"),
  
  IOT("IOT"),
  
  IRL("IRL"),
  
  IRN("IRN"),
  
  IRQ("IRQ"),
  
  ISL("ISL"),
  
  ISR("ISR"),
  
  ITA("ITA"),
  
  JAM("JAM"),
  
  JEY("JEY"),
  
  JOR("JOR"),
  
  JPN("JPN"),
  
  KAZ("KAZ"),
  
  KEN("KEN"),
  
  KGZ("KGZ"),
  
  KHM("KHM"),
  
  KIR("KIR"),
  
  KNA("KNA"),
  
  KOR("KOR"),
  
  KWT("KWT"),
  
  LAO("LAO"),
  
  LBN("LBN"),
  
  LBR("LBR"),
  
  LBY("LBY"),
  
  LCA("LCA"),
  
  LIE("LIE"),
  
  LKA("LKA"),
  
  LSO("LSO"),
  
  LTU("LTU"),
  
  LUX("LUX"),
  
  LVA("LVA"),
  
  MAC("MAC"),
  
  MAF("MAF"),
  
  MAR("MAR"),
  
  MCO("MCO"),
  
  MDA("MDA"),
  
  MDG("MDG"),
  
  MDV("MDV"),
  
  MEX("MEX"),
  
  MHL("MHL"),
  
  MKD("MKD"),
  
  MLI("MLI"),
  
  MLT("MLT"),
  
  MMR("MMR"),
  
  MNE("MNE"),
  
  MNG("MNG"),
  
  MNP("MNP"),
  
  MRT("MRT"),
  
  MSR("MSR"),
  
  MTQ("MTQ"),
  
  MUS("MUS"),
  
  MWI("MWI"),
  
  MYS("MYS"),
  
  MYT("MYT"),
  
  NAM("NAM"),
  
  NCL("NCL"),
  
  NER("NER"),
  
  NFK("NFK"),
  
  NGA("NGA"),
  
  NIC("NIC"),
  
  NIU("NIU"),
  
  NLD("NLD"),
  
  NOR("NOR"),
  
  NPL("NPL"),
  
  NRU("NRU"),
  
  NZL("NZL"),
  
  OMN("OMN"),
  
  PAK("PAK"),
  
  PAN("PAN"),
  
  PCN("PCN"),
  
  PER("PER"),
  
  PHL("PHL"),
  
  PLW("PLW"),
  
  PNG("PNG"),
  
  POL("POL"),
  
  PRI("PRI"),
  
  PRK("PRK"),
  
  PRT("PRT"),
  
  PRY("PRY"),
  
  PSE("PSE"),
  
  PYF("PYF"),
  
  QAT("QAT"),
  
  REU("REU"),
  
  ROU("ROU"),
  
  RUS("RUS"),
  
  RWA("RWA"),
  
  SAU("SAU"),
  
  SDN("SDN"),
  
  SEN("SEN"),
  
  SGP("SGP"),
  
  SGS("SGS"),
  
  SHN("SHN"),
  
  SJM("SJM"),
  
  SLB("SLB"),
  
  SLE("SLE"),
  
  SLV("SLV"),
  
  SMR("SMR"),
  
  SOM("SOM"),
  
  SPM("SPM"),
  
  SRB("SRB"),
  
  SSD("SSD"),
  
  STP("STP"),
  
  SUR("SUR"),
  
  SVK("SVK"),
  
  SVN("SVN"),
  
  SWE("SWE"),
  
  SWZ("SWZ"),
  
  SXM("SXM"),
  
  SYC("SYC"),
  
  SYR("SYR"),
  
  TCA("TCA"),
  
  TCD("TCD"),
  
  TGO("TGO"),
  
  THA("THA"),
  
  TJK("TJK"),
  
  TKL("TKL"),
  
  TKM("TKM"),
  
  TLS("TLS"),
  
  TON("TON"),
  
  TTO("TTO"),
  
  TUN("TUN"),
  
  TUR("TUR"),
  
  TUV("TUV"),
  
  TWN("TWN"),
  
  TZA("TZA"),
  
  UGA("UGA"),
  
  UKR("UKR"),
  
  UMI("UMI"),
  
  URY("URY"),
  
  USA("USA"),
  
  UZB("UZB"),
  
  VAT("VAT"),
  
  VCT("VCT"),
  
  VEN("VEN"),
  
  VGB("VGB"),
  
  VIR("VIR"),
  
  VNM("VNM"),
  
  VUT("VUT"),
  
  WLF("WLF"),
  
  WSM("WSM"),
  
  XKX("XKX"),
  
  YEM("YEM"),
  
  ZAF("ZAF"),
  
  ZMB("ZMB"),
  
  ZWE("ZWE"),
  
  UNKNOWN_DEFAULT("unknown_default_open_api");

  private String value;

  Country(String value) {
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

    public static Country fromValue(String value) {
        for (Country b : Country.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }
        if (value.equals(null) && value.length() == 0) {
            return null;
        }
        Country unknownDefault = Country.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
   }

  public static class Adapter extends TypeAdapter<Country> {
    @Override
    public void write(final JsonWriter jsonWriter, final Country enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Country read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Country.fromValue(value);
    }
  }
}

