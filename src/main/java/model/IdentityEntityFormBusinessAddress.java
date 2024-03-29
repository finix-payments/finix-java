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
 * Primary address for the legal entity.
 */
@ApiModel(description = "Primary address for the legal entity.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityEntityFormBusinessAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  /**
   * 3-Letter Country code.
   */
  @JsonAdapter(CountryEnum.Adapter.class)
  public enum CountryEnum {
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

    CountryEnum(String value) {
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

    public static CountryEnum fromValue(String value) {
        for (CountryEnum b : CountryEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        if (value.equals(null) && value.length() == 0) {
            return null;
        }
        CountryEnum unknownDefault = CountryEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<CountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryEnum country;

  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public IdentityEntityFormBusinessAddress() { 
  }

  public IdentityEntityFormBusinessAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City (max 20 characters).
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "City (max 20 characters).")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public IdentityEntityFormBusinessAddress country(CountryEnum country) {
    
    this.country = country;
    return this;
  }

   /**
   * 3-Letter Country code.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "3-Letter Country code.")

  public CountryEnum getCountry() {
    return country;
  }


  public void setCountry(CountryEnum country) {
    this.country = country;
  }


  public IdentityEntityFormBusinessAddress line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * First line of the address (max 35 characters).
   * @return line1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "First line of the address (max 35 characters).")

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public IdentityEntityFormBusinessAddress line2(String line2) {
    
    this.line2 = line2;
    return this;
  }

   /**
   * Second line of the address (max 35 characters).
   * @return line2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Second line of the address (max 35 characters).")

  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public IdentityEntityFormBusinessAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Zip or Postal code (max 7 characters).
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Zip or Postal code (max 7 characters).")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public IdentityEntityFormBusinessAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * 2-letter State code.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "2-letter State code.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityEntityFormBusinessAddress identityEntityFormBusinessAddress = (IdentityEntityFormBusinessAddress) o;
    return Objects.equals(this.city, identityEntityFormBusinessAddress.city) &&
        Objects.equals(this.country, identityEntityFormBusinessAddress.country) &&
        Objects.equals(this.line1, identityEntityFormBusinessAddress.line1) &&
        Objects.equals(this.line2, identityEntityFormBusinessAddress.line2) &&
        Objects.equals(this.postalCode, identityEntityFormBusinessAddress.postalCode) &&
        Objects.equals(this.region, identityEntityFormBusinessAddress.region);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, line1, line2, postalCode, region);
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
    sb.append("class IdentityEntityFormBusinessAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("line1");
    openapiFields.add("line2");
    openapiFields.add("postal_code");
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("line1");
    openapiRequiredFields.add("postal_code");
    openapiRequiredFields.add("region");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityEntityFormBusinessAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentityEntityFormBusinessAddress.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityEntityFormBusinessAddress is not found in the empty JSON string", IdentityEntityFormBusinessAddress.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityEntityFormBusinessAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityEntityFormBusinessAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : IdentityEntityFormBusinessAddress.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()  && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()  && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("line1") != null && !jsonObj.get("line1").isJsonNull()  && !jsonObj.get("line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line1").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("line2") != null && !jsonObj.get("line2").isJsonNull()  && !jsonObj.get("line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line2").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()  && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()  && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityEntityFormBusinessAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityEntityFormBusinessAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityEntityFormBusinessAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityEntityFormBusinessAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityEntityFormBusinessAddress>() {
           @Override
           public void write(JsonWriter out, IdentityEntityFormBusinessAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityEntityFormBusinessAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityEntityFormBusinessAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityEntityFormBusinessAddress
  * @throws IOException if the JSON string is invalid with respect to IdentityEntityFormBusinessAddress
  */
  public static IdentityEntityFormBusinessAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityEntityFormBusinessAddress.class);
  }

 /**
  * Convert an instance of IdentityEntityFormBusinessAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

