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
import java.util.ArrayList;
import java.util.List;
import model.Country;
import model.Currency;
import model.ProcessorSystemConfigConfig;
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
 * Details that configure how the &#x60;Processor&#x60; handles transactions with the processor.
 */
@ApiModel(description = "Details that configure how the `Processor` handles transactions with the processor.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessorSystemConfig {
  /**
   * The 3 letter ISO 4217 country code for the country transactions are originating from.
   */
  @JsonAdapter(AcquirerCountryCodeEnum.Adapter.class)
  public enum AcquirerCountryCodeEnum {
    _004("004"),
    
    _008("008"),
    
    _010("010"),
    
    _012("012"),
    
    _016("016"),
    
    _020("020"),
    
    _024("024"),
    
    _028("028"),
    
    _031("031"),
    
    _032("032"),
    
    _036("036"),
    
    _040("040"),
    
    _044("044"),
    
    _048("048"),
    
    _050("050"),
    
    _051("051"),
    
    _052("052"),
    
    _056("056"),
    
    _060("060"),
    
    _064("064"),
    
    _068("068"),
    
    _070("070"),
    
    _072("072"),
    
    _074("074"),
    
    _076("076"),
    
    _084("084"),
    
    _086("086"),
    
    _090("090"),
    
    _092("092"),
    
    _096("096"),
    
    _100("100"),
    
    _104("104"),
    
    _108("108"),
    
    _112("112"),
    
    _116("116"),
    
    _120("120"),
    
    _124("124"),
    
    _132("132"),
    
    _136("136"),
    
    _140("140"),
    
    _144("144"),
    
    _148("148"),
    
    _152("152"),
    
    _156("156"),
    
    _158("158"),
    
    _162("162"),
    
    _166("166"),
    
    _170("170"),
    
    _174("174"),
    
    _175("175"),
    
    _178("178"),
    
    _180("180"),
    
    _184("184"),
    
    _188("188"),
    
    _191("191"),
    
    _192("192"),
    
    _196("196"),
    
    _203("203"),
    
    _204("204"),
    
    _208("208"),
    
    _212("212"),
    
    _214("214"),
    
    _218("218"),
    
    _222("222"),
    
    _226("226"),
    
    _231("231"),
    
    _232("232"),
    
    _233("233"),
    
    _234("234"),
    
    _238("238"),
    
    _239("239"),
    
    _242("242"),
    
    _246("246"),
    
    _248("248"),
    
    _250("250"),
    
    _254("254"),
    
    _258("258"),
    
    _260("260"),
    
    _262("262"),
    
    _266("266"),
    
    _268("268"),
    
    _270("270"),
    
    _275("275"),
    
    _276("276"),
    
    _288("288"),
    
    _292("292"),
    
    _296("296"),
    
    _300("300"),
    
    _304("304"),
    
    _308("308"),
    
    _312("312"),
    
    _316("316"),
    
    _320("320"),
    
    _324("324"),
    
    _328("328"),
    
    _332("332"),
    
    _334("334"),
    
    _336("336"),
    
    _340("340"),
    
    _344("344"),
    
    _348("348"),
    
    _352("352"),
    
    _356("356"),
    
    _360("360"),
    
    _364("364"),
    
    _368("368"),
    
    _372("372"),
    
    _376("376"),
    
    _380("380"),
    
    _384("384"),
    
    _388("388"),
    
    _392("392"),
    
    _398("398"),
    
    _400("400"),
    
    _404("404"),
    
    _408("408"),
    
    _410("410"),
    
    _414("414"),
    
    _417("417"),
    
    _418("418"),
    
    _422("422"),
    
    _426("426"),
    
    _428("428"),
    
    _430("430"),
    
    _434("434"),
    
    _438("438"),
    
    _440("440"),
    
    _442("442"),
    
    _446("446"),
    
    _450("450"),
    
    _454("454"),
    
    _458("458"),
    
    _462("462"),
    
    _466("466"),
    
    _470("470"),
    
    _474("474"),
    
    _478("478"),
    
    _480("480"),
    
    _484("484"),
    
    _492("492"),
    
    _496("496"),
    
    _498("498"),
    
    _499("499"),
    
    _500("500"),
    
    _504("504"),
    
    _508("508"),
    
    _512("512"),
    
    _516("516"),
    
    _520("520"),
    
    _524("524"),
    
    _528("528"),
    
    _531("531"),
    
    _533("533"),
    
    _534("534"),
    
    _535("535"),
    
    _540("540"),
    
    _548("548"),
    
    _554("554"),
    
    _558("558"),
    
    _562("562"),
    
    _566("566"),
    
    _570("570"),
    
    _574("574"),
    
    _578("578"),
    
    _580("580"),
    
    _581("581"),
    
    _583("583"),
    
    _584("584"),
    
    _585("585"),
    
    _586("586"),
    
    _591("591"),
    
    _598("598"),
    
    _600("600"),
    
    _604("604"),
    
    _608("608"),
    
    _612("612"),
    
    _616("616"),
    
    _620("620"),
    
    _624("624"),
    
    _626("626"),
    
    _630("630"),
    
    _634("634"),
    
    _638("638"),
    
    _642("642"),
    
    _643("643"),
    
    _646("646"),
    
    _652("652"),
    
    _654("654"),
    
    _659("659"),
    
    _660("660"),
    
    _662("662"),
    
    _663("663"),
    
    _666("666"),
    
    _670("670"),
    
    _674("674"),
    
    _678("678"),
    
    _682("682"),
    
    _686("686"),
    
    _688("688"),
    
    _690("690"),
    
    _694("694"),
    
    _702("702"),
    
    _703("703"),
    
    _704("704"),
    
    _705("705"),
    
    _706("706"),
    
    _710("710"),
    
    _716("716"),
    
    _724("724"),
    
    _728("728"),
    
    _729("729"),
    
    _732("732"),
    
    _740("740"),
    
    _744("744"),
    
    _748("748"),
    
    _752("752"),
    
    _756("756"),
    
    _760("760"),
    
    _762("762"),
    
    _764("764"),
    
    _768("768"),
    
    _772("772"),
    
    _776("776"),
    
    _780("780"),
    
    _784("784"),
    
    _788("788"),
    
    _792("792"),
    
    _795("795"),
    
    _796("796"),
    
    _798("798"),
    
    _800("800"),
    
    _804("804"),
    
    _807("807"),
    
    _818("818"),
    
    _826("826"),
    
    _831("831"),
    
    _832("832"),
    
    _833("833"),
    
    _834("834"),
    
    _840("840"),
    
    _850("850"),
    
    _854("854"),
    
    _858("858"),
    
    _860("860"),
    
    _862("862"),
    
    _876("876"),
    
    _882("882"),
    
    _887("887"),
    
    _894("894"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    AcquirerCountryCodeEnum(String value) {
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

    public static AcquirerCountryCodeEnum fromValue(String value) {
        for (AcquirerCountryCodeEnum b : AcquirerCountryCodeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        AcquirerCountryCodeEnum unknownDefault = AcquirerCountryCodeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<AcquirerCountryCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AcquirerCountryCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AcquirerCountryCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AcquirerCountryCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACQUIRER_COUNTRY_CODE = "acquirer_country_code";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_COUNTRY_CODE)
  private AcquirerCountryCodeEnum acquirerCountryCode;

  public static final String SERIALIZED_NAME_ACQUIRING_BIN = "acquiring_bin";
  @SerializedName(SERIALIZED_NAME_ACQUIRING_BIN)
  private String acquiringBin;

  public static final String SERIALIZED_NAME_ALLOW_CREDIT_FOR_PARTNER = "allow_credit_for_partner";
  @SerializedName(SERIALIZED_NAME_ALLOW_CREDIT_FOR_PARTNER)
  private Boolean allowCreditForPartner;

  public static final String SERIALIZED_NAME_AVAILABLE_COUNTRIES = "available_countries";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_COUNTRIES)
  private List<Country> availableCountries = null;

  public static final String SERIALIZED_NAME_BUSINESS_APPLICATION_ID = "business_application_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_APPLICATION_ID)
  private String businessApplicationId;

  /**
   * Field used by processor to communicate with Finix.
   */
  @JsonAdapter(ClassKeyIdentifierEnum.Adapter.class)
  public enum ClassKeyIdentifierEnum {
    IO_FINIX_VISA_DIRECT_CLIENT_VISASYSTEMCONFIG("io.finix.visa.direct.client.VisaSystemConfig"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    ClassKeyIdentifierEnum(String value) {
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

    public static ClassKeyIdentifierEnum fromValue(String value) {
        for (ClassKeyIdentifierEnum b : ClassKeyIdentifierEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        ClassKeyIdentifierEnum unknownDefault = ClassKeyIdentifierEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<ClassKeyIdentifierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassKeyIdentifierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClassKeyIdentifierEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClassKeyIdentifierEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLASS_KEY_IDENTIFIER = "class_key_identifier";
  @SerializedName(SERIALIZED_NAME_CLASS_KEY_IDENTIFIER)
  private ClassKeyIdentifierEnum classKeyIdentifier;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private ProcessorSystemConfigConfig config;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCIES = "default_currencies";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCIES)
  private List<Currency> defaultCurrencies = null;

  public static final String SERIALIZED_NAME_DISABLE_PPGS = "disable_ppgs";
  @SerializedName(SERIALIZED_NAME_DISABLE_PPGS)
  private Boolean disablePpgs;

  public static final String SERIALIZED_NAME_FEE_PROGRAM_INDICATOR = "fee_program_indicator";
  @SerializedName(SERIALIZED_NAME_FEE_PROGRAM_INDICATOR)
  private String feeProgramIndicator;

  public static final String SERIALIZED_NAME_GATEWAY_PROXY_CERTIFICATE = "gateway_proxy_certificate";
  @SerializedName(SERIALIZED_NAME_GATEWAY_PROXY_CERTIFICATE)
  private String gatewayProxyCertificate;

  public static final String SERIALIZED_NAME_GATEWAY_PROXY_HOST = "gateway_proxy_host";
  @SerializedName(SERIALIZED_NAME_GATEWAY_PROXY_HOST)
  private String gatewayProxyHost;

  public static final String SERIALIZED_NAME_GATEWAY_PROXY_PASSWORD = "gateway_proxy_password";
  @SerializedName(SERIALIZED_NAME_GATEWAY_PROXY_PASSWORD)
  private String gatewayProxyPassword;

  public static final String SERIALIZED_NAME_GATEWAY_PROXY_PORT = "gateway_proxy_port";
  @SerializedName(SERIALIZED_NAME_GATEWAY_PROXY_PORT)
  private String gatewayProxyPort;

  public static final String SERIALIZED_NAME_GATEWAY_PROXY_USERNAME = "gateway_proxy_username";
  @SerializedName(SERIALIZED_NAME_GATEWAY_PROXY_USERNAME)
  private String gatewayProxyUsername;

  public static final String SERIALIZED_NAME_KEY_STORE_PASSWORD = "key_store_password";
  @SerializedName(SERIALIZED_NAME_KEY_STORE_PASSWORD)
  private String keyStorePassword;

  public static final String SERIALIZED_NAME_KEY_STORE_PATH = "key_store_path";
  @SerializedName(SERIALIZED_NAME_KEY_STORE_PATH)
  private String keyStorePath;

  public static final String SERIALIZED_NAME_MERCHANT_PSEUDO_ABA_NUMBER = "merchant_pseudo_aba_number";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PSEUDO_ABA_NUMBER)
  private String merchantPseudoAbaNumber;

  public static final String SERIALIZED_NAME_ONLINE_CREDIT_PROCESSING = "online_credit_processing";
  @SerializedName(SERIALIZED_NAME_ONLINE_CREDIT_PROCESSING)
  private Boolean onlineCreditProcessing;

  public static final String SERIALIZED_NAME_ONLINE_DEBIT_PROCESSING = "online_debit_processing";
  @SerializedName(SERIALIZED_NAME_ONLINE_DEBIT_PROCESSING)
  private Boolean onlineDebitProcessing;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_PASSWORD = "private_key_password";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_PASSWORD)
  private String privateKeyPassword;

  public static final String SERIALIZED_NAME_PROCESSOR_SEQUENCE_LIMIT = "processor_sequence_limit";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_SEQUENCE_LIMIT)
  private Long processorSequenceLimit;

  public static final String SERIALIZED_NAME_PSEUDO_BATCH_PUSH = "pseudo_batch_push";
  @SerializedName(SERIALIZED_NAME_PSEUDO_BATCH_PUSH)
  private Boolean pseudoBatchPush;

  /**
   * Specific code that reflects the use case (e.g. funds disbursement, money transfer, etc.). For a full list of codes, see the following [list from Visa](https://developer.visa.com/request_response_codes#source_of_funds).
   */
  @JsonAdapter(SourceOfFundsEnum.Adapter.class)
  public enum SourceOfFundsEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    SourceOfFundsEnum(String value) {
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

    public static SourceOfFundsEnum fromValue(String value) {
        for (SourceOfFundsEnum b : SourceOfFundsEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        SourceOfFundsEnum unknownDefault = SourceOfFundsEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<SourceOfFundsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceOfFundsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceOfFundsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceOfFundsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_OF_FUNDS = "source_of_funds";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_FUNDS)
  private SourceOfFundsEnum sourceOfFunds;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_VISA_ACCEPTANCE_CLOUD_KEY_STORE_PATH = "visa_acceptance_cloud_key_store_path";
  @SerializedName(SERIALIZED_NAME_VISA_ACCEPTANCE_CLOUD_KEY_STORE_PATH)
  private String visaAcceptanceCloudKeyStorePath;

  public static final String SERIALIZED_NAME_VISA_ACCEPTANCE_CLOUD_PASSWORD = "visa_acceptance_cloud_password";
  @SerializedName(SERIALIZED_NAME_VISA_ACCEPTANCE_CLOUD_PASSWORD)
  private String visaAcceptanceCloudPassword;

  public static final String SERIALIZED_NAME_VISA_ACCEPTANCE_CLOUD_URL = "visa_acceptance_cloud_url";
  @SerializedName(SERIALIZED_NAME_VISA_ACCEPTANCE_CLOUD_URL)
  private String visaAcceptanceCloudUrl;

  public static final String SERIALIZED_NAME_VISA_ACCEPTANCE_CLOUD_USER_ID = "visa_acceptance_cloud_user_id";
  @SerializedName(SERIALIZED_NAME_VISA_ACCEPTANCE_CLOUD_USER_ID)
  private String visaAcceptanceCloudUserId;

  public static final String SERIALIZED_NAME_VISA_URL = "visa_url";
  @SerializedName(SERIALIZED_NAME_VISA_URL)
  private String visaUrl;

  public ProcessorSystemConfig() { 
  }

  public ProcessorSystemConfig acquirerCountryCode(AcquirerCountryCodeEnum acquirerCountryCode) {
    
    this.acquirerCountryCode = acquirerCountryCode;
    return this;
  }

   /**
   * The 3 letter ISO 4217 country code for the country transactions are originating from.
   * @return acquirerCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 3 letter ISO 4217 country code for the country transactions are originating from.")

  public AcquirerCountryCodeEnum getAcquirerCountryCode() {
    return acquirerCountryCode;
  }


  public void setAcquirerCountryCode(AcquirerCountryCodeEnum acquirerCountryCode) {
    this.acquirerCountryCode = acquirerCountryCode;
  }


  public ProcessorSystemConfig acquiringBin(String acquiringBin) {
    
    this.acquiringBin = acquiringBin;
    return this;
  }

   /**
   * The Bank Identification Number (BIN) the &#x60;Processor&#x60; is registered under with Visa Direct.
   * @return acquiringBin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Bank Identification Number (BIN) the `Processor` is registered under with Visa Direct.")

  public String getAcquiringBin() {
    return acquiringBin;
  }


  public void setAcquiringBin(String acquiringBin) {
    this.acquiringBin = acquiringBin;
  }


  public ProcessorSystemConfig allowCreditForPartner(Boolean allowCreditForPartner) {
    
    this.allowCreditForPartner = allowCreditForPartner;
    return this;
  }

   /**
   * Field used by Finix and processor to handle transactions.
   * @return allowCreditForPartner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field used by Finix and processor to handle transactions.")

  public Boolean getAllowCreditForPartner() {
    return allowCreditForPartner;
  }


  public void setAllowCreditForPartner(Boolean allowCreditForPartner) {
    this.allowCreditForPartner = allowCreditForPartner;
  }


  public ProcessorSystemConfig availableCountries(List<Country> availableCountries) {
    
    this.availableCountries = availableCountries;
    return this;
  }

  public ProcessorSystemConfig addAvailableCountriesItem(Country availableCountriesItem) {
    if (this.availableCountries == null) {
      this.availableCountries = new ArrayList<>();
    }
    this.availableCountries.add(availableCountriesItem);
    return this;
  }

   /**
   * Details the countries the &#x60;Processor&#x60; is avalible in.
   * @return availableCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details the countries the `Processor` is avalible in.")

  public List<Country> getAvailableCountries() {
    return availableCountries;
  }


  public void setAvailableCountries(List<Country> availableCountries) {
    this.availableCountries = availableCountries;
  }


  public ProcessorSystemConfig businessApplicationId(String businessApplicationId) {
    
    this.businessApplicationId = businessApplicationId;
    return this;
  }

   /**
   * The ID of the resource.
   * @return businessApplicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getBusinessApplicationId() {
    return businessApplicationId;
  }


  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }


  public ProcessorSystemConfig classKeyIdentifier(ClassKeyIdentifierEnum classKeyIdentifier) {
    
    this.classKeyIdentifier = classKeyIdentifier;
    return this;
  }

   /**
   * Field used by processor to communicate with Finix.
   * @return classKeyIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field used by processor to communicate with Finix.")

  public ClassKeyIdentifierEnum getClassKeyIdentifier() {
    return classKeyIdentifier;
  }


  public void setClassKeyIdentifier(ClassKeyIdentifierEnum classKeyIdentifier) {
    this.classKeyIdentifier = classKeyIdentifier;
  }


  public ProcessorSystemConfig config(ProcessorSystemConfigConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorSystemConfigConfig getConfig() {
    return config;
  }


  public void setConfig(ProcessorSystemConfigConfig config) {
    this.config = config;
  }


  public ProcessorSystemConfig defaultCurrencies(List<Currency> defaultCurrencies) {
    
    this.defaultCurrencies = defaultCurrencies;
    return this;
  }

  public ProcessorSystemConfig addDefaultCurrenciesItem(Currency defaultCurrenciesItem) {
    if (this.defaultCurrencies == null) {
      this.defaultCurrencies = new ArrayList<>();
    }
    this.defaultCurrencies.add(defaultCurrenciesItem);
    return this;
  }

   /**
   * ISO 4217 3 letter currency code.
   * @return defaultCurrencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 4217 3 letter currency code.")

  public List<Currency> getDefaultCurrencies() {
    return defaultCurrencies;
  }


  public void setDefaultCurrencies(List<Currency> defaultCurrencies) {
    this.defaultCurrencies = defaultCurrencies;
  }


  public ProcessorSystemConfig disablePpgs(Boolean disablePpgs) {
    
    this.disablePpgs = disablePpgs;
    return this;
  }

   /**
   * Set to **true** to enables the option to push payments to other U.S. debit networks using our Visa Direct integration.
   * @return disablePpgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** to enables the option to push payments to other U.S. debit networks using our Visa Direct integration.")

  public Boolean getDisablePpgs() {
    return disablePpgs;
  }


  public void setDisablePpgs(Boolean disablePpgs) {
    this.disablePpgs = disablePpgs;
  }


  public ProcessorSystemConfig feeProgramIndicator(String feeProgramIndicator) {
    
    this.feeProgramIndicator = feeProgramIndicator;
    return this;
  }

   /**
   * Details the price of a Visa Direct payout.
   * @return feeProgramIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details the price of a Visa Direct payout.")

  public String getFeeProgramIndicator() {
    return feeProgramIndicator;
  }


  public void setFeeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
  }


  public ProcessorSystemConfig gatewayProxyCertificate(String gatewayProxyCertificate) {
    
    this.gatewayProxyCertificate = gatewayProxyCertificate;
    return this;
  }

   /**
   * Used if the Gateway needs a proxy. Not applicable to Visa Direct.
   * @return gatewayProxyCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used if the Gateway needs a proxy. Not applicable to Visa Direct.")

  public String getGatewayProxyCertificate() {
    return gatewayProxyCertificate;
  }


  public void setGatewayProxyCertificate(String gatewayProxyCertificate) {
    this.gatewayProxyCertificate = gatewayProxyCertificate;
  }


  public ProcessorSystemConfig gatewayProxyHost(String gatewayProxyHost) {
    
    this.gatewayProxyHost = gatewayProxyHost;
    return this;
  }

   /**
   * Used if the Gateway needs a proxy. Not applicable to Visa Direct.
   * @return gatewayProxyHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used if the Gateway needs a proxy. Not applicable to Visa Direct.")

  public String getGatewayProxyHost() {
    return gatewayProxyHost;
  }


  public void setGatewayProxyHost(String gatewayProxyHost) {
    this.gatewayProxyHost = gatewayProxyHost;
  }


  public ProcessorSystemConfig gatewayProxyPassword(String gatewayProxyPassword) {
    
    this.gatewayProxyPassword = gatewayProxyPassword;
    return this;
  }

   /**
   * Used if the Gateway needs a proxy. Not applicable to Visa Direct.
   * @return gatewayProxyPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used if the Gateway needs a proxy. Not applicable to Visa Direct.")

  public String getGatewayProxyPassword() {
    return gatewayProxyPassword;
  }


  public void setGatewayProxyPassword(String gatewayProxyPassword) {
    this.gatewayProxyPassword = gatewayProxyPassword;
  }


  public ProcessorSystemConfig gatewayProxyPort(String gatewayProxyPort) {
    
    this.gatewayProxyPort = gatewayProxyPort;
    return this;
  }

   /**
   * Used if the Gateway needs a proxy. Not applicable to Visa Direct.
   * @return gatewayProxyPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used if the Gateway needs a proxy. Not applicable to Visa Direct.")

  public String getGatewayProxyPort() {
    return gatewayProxyPort;
  }


  public void setGatewayProxyPort(String gatewayProxyPort) {
    this.gatewayProxyPort = gatewayProxyPort;
  }


  public ProcessorSystemConfig gatewayProxyUsername(String gatewayProxyUsername) {
    
    this.gatewayProxyUsername = gatewayProxyUsername;
    return this;
  }

   /**
   * Used if the Gateway needs a proxy. Not applicable to Visa Direct.
   * @return gatewayProxyUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used if the Gateway needs a proxy. Not applicable to Visa Direct.")

  public String getGatewayProxyUsername() {
    return gatewayProxyUsername;
  }


  public void setGatewayProxyUsername(String gatewayProxyUsername) {
    this.gatewayProxyUsername = gatewayProxyUsername;
  }


  public ProcessorSystemConfig keyStorePassword(String keyStorePassword) {
    
    this.keyStorePassword = keyStorePassword;
    return this;
  }

   /**
   * The password for the Java Keystore that stores the private keys and cert.pem files needed to process transactions using Visa Direct.
   * @return keyStorePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password for the Java Keystore that stores the private keys and cert.pem files needed to process transactions using Visa Direct.")

  public String getKeyStorePassword() {
    return keyStorePassword;
  }


  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }


  public ProcessorSystemConfig keyStorePath(String keyStorePath) {
    
    this.keyStorePath = keyStorePath;
    return this;
  }

   /**
   * The path in AWS where the Java Keystore that stores the private keys and cert.pem files are and use to transact using Visa Direct.
   * @return keyStorePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path in AWS where the Java Keystore that stores the private keys and cert.pem files are and use to transact using Visa Direct.")

  public String getKeyStorePath() {
    return keyStorePath;
  }


  public void setKeyStorePath(String keyStorePath) {
    this.keyStorePath = keyStorePath;
  }


  public ProcessorSystemConfig merchantPseudoAbaNumber(String merchantPseudoAbaNumber) {
    
    this.merchantPseudoAbaNumber = merchantPseudoAbaNumber;
    return this;
  }

   /**
   * A unique ID that&#39;s provided when a &#x60;Processor&#x60; signs up for Push Payment Gateway transactions (PPGS). PPGS allows you to push payments to other U.S. debit networks using our Visa Direct integration.
   * @return merchantPseudoAbaNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID that's provided when a `Processor` signs up for Push Payment Gateway transactions (PPGS). PPGS allows you to push payments to other U.S. debit networks using our Visa Direct integration.")

  public String getMerchantPseudoAbaNumber() {
    return merchantPseudoAbaNumber;
  }


  public void setMerchantPseudoAbaNumber(String merchantPseudoAbaNumber) {
    this.merchantPseudoAbaNumber = merchantPseudoAbaNumber;
  }


  public ProcessorSystemConfig onlineCreditProcessing(Boolean onlineCreditProcessing) {
    
    this.onlineCreditProcessing = onlineCreditProcessing;
    return this;
  }

   /**
   * Details if the &#x60;Processor&#x60; can handle online credit transactions.
   * @return onlineCreditProcessing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Processor` can handle online credit transactions.")

  public Boolean getOnlineCreditProcessing() {
    return onlineCreditProcessing;
  }


  public void setOnlineCreditProcessing(Boolean onlineCreditProcessing) {
    this.onlineCreditProcessing = onlineCreditProcessing;
  }


  public ProcessorSystemConfig onlineDebitProcessing(Boolean onlineDebitProcessing) {
    
    this.onlineDebitProcessing = onlineDebitProcessing;
    return this;
  }

   /**
   * Details if the &#x60;Processor&#x60; can handle online debit transactions.
   * @return onlineDebitProcessing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the `Processor` can handle online debit transactions.")

  public Boolean getOnlineDebitProcessing() {
    return onlineDebitProcessing;
  }


  public void setOnlineDebitProcessing(Boolean onlineDebitProcessing) {
    this.onlineDebitProcessing = onlineDebitProcessing;
  }


  public ProcessorSystemConfig password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password found in the credentials section of the Visa Developer Portal (VDP) project. This is needed to connect to Visa Direct.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password found in the credentials section of the Visa Developer Portal (VDP) project. This is needed to connect to Visa Direct.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public ProcessorSystemConfig privateKeyPassword(String privateKeyPassword) {
    
    this.privateKeyPassword = privateKeyPassword;
    return this;
  }

   /**
   * The password that was used to encrypt the private key that is contained in the Java Keystore.
   * @return privateKeyPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password that was used to encrypt the private key that is contained in the Java Keystore.")

  public String getPrivateKeyPassword() {
    return privateKeyPassword;
  }


  public void setPrivateKeyPassword(String privateKeyPassword) {
    this.privateKeyPassword = privateKeyPassword;
  }


  public ProcessorSystemConfig processorSequenceLimit(Long processorSequenceLimit) {
    
    this.processorSequenceLimit = processorSequenceLimit;
    return this;
  }

   /**
   * Field used by Finix and processor to handle transactions.
   * @return processorSequenceLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field used by Finix and processor to handle transactions.")

  public Long getProcessorSequenceLimit() {
    return processorSequenceLimit;
  }


  public void setProcessorSequenceLimit(Long processorSequenceLimit) {
    this.processorSequenceLimit = processorSequenceLimit;
  }


  public ProcessorSystemConfig pseudoBatchPush(Boolean pseudoBatchPush) {
    
    this.pseudoBatchPush = pseudoBatchPush;
    return this;
  }

   /**
   * Field used by Finix and processor to handle transactions.
   * @return pseudoBatchPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field used by Finix and processor to handle transactions.")

  public Boolean getPseudoBatchPush() {
    return pseudoBatchPush;
  }


  public void setPseudoBatchPush(Boolean pseudoBatchPush) {
    this.pseudoBatchPush = pseudoBatchPush;
  }


  public ProcessorSystemConfig sourceOfFunds(SourceOfFundsEnum sourceOfFunds) {
    
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Specific code that reflects the use case (e.g. funds disbursement, money transfer, etc.). For a full list of codes, see the following [list from Visa](https://developer.visa.com/request_response_codes#source_of_funds).
   * @return sourceOfFunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specific code that reflects the use case (e.g. funds disbursement, money transfer, etc.). For a full list of codes, see the following [list from Visa](https://developer.visa.com/request_response_codes#source_of_funds).")

  public SourceOfFundsEnum getSourceOfFunds() {
    return sourceOfFunds;
  }


  public void setSourceOfFunds(SourceOfFundsEnum sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }


  public ProcessorSystemConfig userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The user ID found in the credentials section of the Visa Developer Portal (VDP) project. This is needed to connect to Visa Direct.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user ID found in the credentials section of the Visa Developer Portal (VDP) project. This is needed to connect to Visa Direct.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ProcessorSystemConfig visaAcceptanceCloudKeyStorePath(String visaAcceptanceCloudKeyStorePath) {
    
    this.visaAcceptanceCloudKeyStorePath = visaAcceptanceCloudKeyStorePath;
    return this;
  }

   /**
   * Field used by Finix and processor to handle transactions.
   * @return visaAcceptanceCloudKeyStorePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field used by Finix and processor to handle transactions.")

  public String getVisaAcceptanceCloudKeyStorePath() {
    return visaAcceptanceCloudKeyStorePath;
  }


  public void setVisaAcceptanceCloudKeyStorePath(String visaAcceptanceCloudKeyStorePath) {
    this.visaAcceptanceCloudKeyStorePath = visaAcceptanceCloudKeyStorePath;
  }


  public ProcessorSystemConfig visaAcceptanceCloudPassword(String visaAcceptanceCloudPassword) {
    
    this.visaAcceptanceCloudPassword = visaAcceptanceCloudPassword;
    return this;
  }

   /**
   * Field used by Finix and processor to handle transactions.
   * @return visaAcceptanceCloudPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field used by Finix and processor to handle transactions.")

  public String getVisaAcceptanceCloudPassword() {
    return visaAcceptanceCloudPassword;
  }


  public void setVisaAcceptanceCloudPassword(String visaAcceptanceCloudPassword) {
    this.visaAcceptanceCloudPassword = visaAcceptanceCloudPassword;
  }


  public ProcessorSystemConfig visaAcceptanceCloudUrl(String visaAcceptanceCloudUrl) {
    
    this.visaAcceptanceCloudUrl = visaAcceptanceCloudUrl;
    return this;
  }

   /**
   * Field used by Finix and processor to handle transactions.
   * @return visaAcceptanceCloudUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field used by Finix and processor to handle transactions.")

  public String getVisaAcceptanceCloudUrl() {
    return visaAcceptanceCloudUrl;
  }


  public void setVisaAcceptanceCloudUrl(String visaAcceptanceCloudUrl) {
    this.visaAcceptanceCloudUrl = visaAcceptanceCloudUrl;
  }


  public ProcessorSystemConfig visaAcceptanceCloudUserId(String visaAcceptanceCloudUserId) {
    
    this.visaAcceptanceCloudUserId = visaAcceptanceCloudUserId;
    return this;
  }

   /**
   * Field used by Finix and processor to handle transactions.
   * @return visaAcceptanceCloudUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field used by Finix and processor to handle transactions.")

  public String getVisaAcceptanceCloudUserId() {
    return visaAcceptanceCloudUserId;
  }


  public void setVisaAcceptanceCloudUserId(String visaAcceptanceCloudUserId) {
    this.visaAcceptanceCloudUserId = visaAcceptanceCloudUserId;
  }


  public ProcessorSystemConfig visaUrl(String visaUrl) {
    
    this.visaUrl = visaUrl;
    return this;
  }

   /**
   * The URL that is used to connect to Visa.
   * @return visaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL that is used to connect to Visa.")

  public String getVisaUrl() {
    return visaUrl;
  }


  public void setVisaUrl(String visaUrl) {
    this.visaUrl = visaUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorSystemConfig processorSystemConfig = (ProcessorSystemConfig) o;
    return Objects.equals(this.acquirerCountryCode, processorSystemConfig.acquirerCountryCode) &&
        Objects.equals(this.acquiringBin, processorSystemConfig.acquiringBin) &&
        Objects.equals(this.allowCreditForPartner, processorSystemConfig.allowCreditForPartner) &&
        Objects.equals(this.availableCountries, processorSystemConfig.availableCountries) &&
        Objects.equals(this.businessApplicationId, processorSystemConfig.businessApplicationId) &&
        Objects.equals(this.classKeyIdentifier, processorSystemConfig.classKeyIdentifier) &&
        Objects.equals(this.config, processorSystemConfig.config) &&
        Objects.equals(this.defaultCurrencies, processorSystemConfig.defaultCurrencies) &&
        Objects.equals(this.disablePpgs, processorSystemConfig.disablePpgs) &&
        Objects.equals(this.feeProgramIndicator, processorSystemConfig.feeProgramIndicator) &&
        Objects.equals(this.gatewayProxyCertificate, processorSystemConfig.gatewayProxyCertificate) &&
        Objects.equals(this.gatewayProxyHost, processorSystemConfig.gatewayProxyHost) &&
        Objects.equals(this.gatewayProxyPassword, processorSystemConfig.gatewayProxyPassword) &&
        Objects.equals(this.gatewayProxyPort, processorSystemConfig.gatewayProxyPort) &&
        Objects.equals(this.gatewayProxyUsername, processorSystemConfig.gatewayProxyUsername) &&
        Objects.equals(this.keyStorePassword, processorSystemConfig.keyStorePassword) &&
        Objects.equals(this.keyStorePath, processorSystemConfig.keyStorePath) &&
        Objects.equals(this.merchantPseudoAbaNumber, processorSystemConfig.merchantPseudoAbaNumber) &&
        Objects.equals(this.onlineCreditProcessing, processorSystemConfig.onlineCreditProcessing) &&
        Objects.equals(this.onlineDebitProcessing, processorSystemConfig.onlineDebitProcessing) &&
        Objects.equals(this.password, processorSystemConfig.password) &&
        Objects.equals(this.privateKeyPassword, processorSystemConfig.privateKeyPassword) &&
        Objects.equals(this.processorSequenceLimit, processorSystemConfig.processorSequenceLimit) &&
        Objects.equals(this.pseudoBatchPush, processorSystemConfig.pseudoBatchPush) &&
        Objects.equals(this.sourceOfFunds, processorSystemConfig.sourceOfFunds) &&
        Objects.equals(this.userId, processorSystemConfig.userId) &&
        Objects.equals(this.visaAcceptanceCloudKeyStorePath, processorSystemConfig.visaAcceptanceCloudKeyStorePath) &&
        Objects.equals(this.visaAcceptanceCloudPassword, processorSystemConfig.visaAcceptanceCloudPassword) &&
        Objects.equals(this.visaAcceptanceCloudUrl, processorSystemConfig.visaAcceptanceCloudUrl) &&
        Objects.equals(this.visaAcceptanceCloudUserId, processorSystemConfig.visaAcceptanceCloudUserId) &&
        Objects.equals(this.visaUrl, processorSystemConfig.visaUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerCountryCode, acquiringBin, allowCreditForPartner, availableCountries, businessApplicationId, classKeyIdentifier, config, defaultCurrencies, disablePpgs, feeProgramIndicator, gatewayProxyCertificate, gatewayProxyHost, gatewayProxyPassword, gatewayProxyPort, gatewayProxyUsername, keyStorePassword, keyStorePath, merchantPseudoAbaNumber, onlineCreditProcessing, onlineDebitProcessing, password, privateKeyPassword, processorSequenceLimit, pseudoBatchPush, sourceOfFunds, userId, visaAcceptanceCloudKeyStorePath, visaAcceptanceCloudPassword, visaAcceptanceCloudUrl, visaAcceptanceCloudUserId, visaUrl);
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
    sb.append("class ProcessorSystemConfig {\n");
    sb.append("    acquirerCountryCode: ").append(toIndentedString(acquirerCountryCode)).append("\n");
    sb.append("    acquiringBin: ").append(toIndentedString(acquiringBin)).append("\n");
    sb.append("    allowCreditForPartner: ").append(toIndentedString(allowCreditForPartner)).append("\n");
    sb.append("    availableCountries: ").append(toIndentedString(availableCountries)).append("\n");
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    classKeyIdentifier: ").append(toIndentedString(classKeyIdentifier)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    defaultCurrencies: ").append(toIndentedString(defaultCurrencies)).append("\n");
    sb.append("    disablePpgs: ").append(toIndentedString(disablePpgs)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    gatewayProxyCertificate: ").append(toIndentedString(gatewayProxyCertificate)).append("\n");
    sb.append("    gatewayProxyHost: ").append(toIndentedString(gatewayProxyHost)).append("\n");
    sb.append("    gatewayProxyPassword: ").append(toIndentedString(gatewayProxyPassword)).append("\n");
    sb.append("    gatewayProxyPort: ").append(toIndentedString(gatewayProxyPort)).append("\n");
    sb.append("    gatewayProxyUsername: ").append(toIndentedString(gatewayProxyUsername)).append("\n");
    sb.append("    keyStorePassword: ").append(toIndentedString(keyStorePassword)).append("\n");
    sb.append("    keyStorePath: ").append(toIndentedString(keyStorePath)).append("\n");
    sb.append("    merchantPseudoAbaNumber: ").append(toIndentedString(merchantPseudoAbaNumber)).append("\n");
    sb.append("    onlineCreditProcessing: ").append(toIndentedString(onlineCreditProcessing)).append("\n");
    sb.append("    onlineDebitProcessing: ").append(toIndentedString(onlineDebitProcessing)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privateKeyPassword: ").append(toIndentedString(privateKeyPassword)).append("\n");
    sb.append("    processorSequenceLimit: ").append(toIndentedString(processorSequenceLimit)).append("\n");
    sb.append("    pseudoBatchPush: ").append(toIndentedString(pseudoBatchPush)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    visaAcceptanceCloudKeyStorePath: ").append(toIndentedString(visaAcceptanceCloudKeyStorePath)).append("\n");
    sb.append("    visaAcceptanceCloudPassword: ").append(toIndentedString(visaAcceptanceCloudPassword)).append("\n");
    sb.append("    visaAcceptanceCloudUrl: ").append(toIndentedString(visaAcceptanceCloudUrl)).append("\n");
    sb.append("    visaAcceptanceCloudUserId: ").append(toIndentedString(visaAcceptanceCloudUserId)).append("\n");
    sb.append("    visaUrl: ").append(toIndentedString(visaUrl)).append("\n");
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
    openapiFields.add("acquirer_country_code");
    openapiFields.add("acquiring_bin");
    openapiFields.add("allow_credit_for_partner");
    openapiFields.add("available_countries");
    openapiFields.add("business_application_id");
    openapiFields.add("class_key_identifier");
    openapiFields.add("config");
    openapiFields.add("default_currencies");
    openapiFields.add("disable_ppgs");
    openapiFields.add("fee_program_indicator");
    openapiFields.add("gateway_proxy_certificate");
    openapiFields.add("gateway_proxy_host");
    openapiFields.add("gateway_proxy_password");
    openapiFields.add("gateway_proxy_port");
    openapiFields.add("gateway_proxy_username");
    openapiFields.add("key_store_password");
    openapiFields.add("key_store_path");
    openapiFields.add("merchant_pseudo_aba_number");
    openapiFields.add("online_credit_processing");
    openapiFields.add("online_debit_processing");
    openapiFields.add("password");
    openapiFields.add("private_key_password");
    openapiFields.add("processor_sequence_limit");
    openapiFields.add("pseudo_batch_push");
    openapiFields.add("source_of_funds");
    openapiFields.add("user_id");
    openapiFields.add("visa_acceptance_cloud_key_store_path");
    openapiFields.add("visa_acceptance_cloud_password");
    openapiFields.add("visa_acceptance_cloud_url");
    openapiFields.add("visa_acceptance_cloud_user_id");
    openapiFields.add("visa_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessorSystemConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProcessorSystemConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessorSystemConfig is not found in the empty JSON string", ProcessorSystemConfig.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProcessorSystemConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProcessorSystemConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("acquirer_country_code") != null && !jsonObj.get("acquirer_country_code").isJsonNull()  && !jsonObj.get("acquirer_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acquirer_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acquirer_country_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("acquiring_bin") != null && !jsonObj.get("acquiring_bin").isJsonNull()  && !jsonObj.get("acquiring_bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acquiring_bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acquiring_bin").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("available_countries") != null && !jsonObj.get("available_countries").isJsonNull() && !jsonObj.get("available_countries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_countries` to be an array in the JSON string but got `%s`", jsonObj.get("available_countries").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("business_application_id") != null && !jsonObj.get("business_application_id").isJsonNull()  && !jsonObj.get("business_application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_application_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("class_key_identifier") != null && !jsonObj.get("class_key_identifier").isJsonNull()  && !jsonObj.get("class_key_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_key_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_key_identifier").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `config`
     // if (jsonObj.getAsJsonObject("config") != null) {
       //ProcessorSystemConfigConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("default_currencies") != null && !jsonObj.get("default_currencies").isJsonNull() && !jsonObj.get("default_currencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_currencies` to be an array in the JSON string but got `%s`", jsonObj.get("default_currencies").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fee_program_indicator") != null && !jsonObj.get("fee_program_indicator").isJsonNull()  && !jsonObj.get("fee_program_indicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_program_indicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_program_indicator").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("gateway_proxy_certificate") != null && !jsonObj.get("gateway_proxy_certificate").isJsonNull()  && !jsonObj.get("gateway_proxy_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_proxy_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_proxy_certificate").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("gateway_proxy_host") != null && !jsonObj.get("gateway_proxy_host").isJsonNull()  && !jsonObj.get("gateway_proxy_host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_proxy_host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_proxy_host").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("gateway_proxy_password") != null && !jsonObj.get("gateway_proxy_password").isJsonNull()  && !jsonObj.get("gateway_proxy_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_proxy_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_proxy_password").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("gateway_proxy_port") != null && !jsonObj.get("gateway_proxy_port").isJsonNull()  && !jsonObj.get("gateway_proxy_port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_proxy_port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_proxy_port").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("gateway_proxy_username") != null && !jsonObj.get("gateway_proxy_username").isJsonNull()  && !jsonObj.get("gateway_proxy_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_proxy_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_proxy_username").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("key_store_password") != null && !jsonObj.get("key_store_password").isJsonNull()  && !jsonObj.get("key_store_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_store_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_store_password").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("key_store_path") != null && !jsonObj.get("key_store_path").isJsonNull()  && !jsonObj.get("key_store_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_store_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_store_path").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_pseudo_aba_number") != null && !jsonObj.get("merchant_pseudo_aba_number").isJsonNull()  && !jsonObj.get("merchant_pseudo_aba_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_pseudo_aba_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_pseudo_aba_number").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()  && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("private_key_password") != null && !jsonObj.get("private_key_password").isJsonNull()  && !jsonObj.get("private_key_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `private_key_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("private_key_password").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("source_of_funds") != null && !jsonObj.get("source_of_funds").isJsonNull()  && !jsonObj.get("source_of_funds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_of_funds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_of_funds").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()  && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("visa_acceptance_cloud_key_store_path") != null && !jsonObj.get("visa_acceptance_cloud_key_store_path").isJsonNull()  && !jsonObj.get("visa_acceptance_cloud_key_store_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visa_acceptance_cloud_key_store_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visa_acceptance_cloud_key_store_path").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("visa_acceptance_cloud_password") != null && !jsonObj.get("visa_acceptance_cloud_password").isJsonNull()  && !jsonObj.get("visa_acceptance_cloud_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visa_acceptance_cloud_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visa_acceptance_cloud_password").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("visa_acceptance_cloud_url") != null && !jsonObj.get("visa_acceptance_cloud_url").isJsonNull()  && !jsonObj.get("visa_acceptance_cloud_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visa_acceptance_cloud_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visa_acceptance_cloud_url").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("visa_acceptance_cloud_user_id") != null && !jsonObj.get("visa_acceptance_cloud_user_id").isJsonNull()  && !jsonObj.get("visa_acceptance_cloud_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visa_acceptance_cloud_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visa_acceptance_cloud_user_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("visa_url") != null && !jsonObj.get("visa_url").isJsonNull()  && !jsonObj.get("visa_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visa_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visa_url").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessorSystemConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessorSystemConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessorSystemConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessorSystemConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessorSystemConfig>() {
           @Override
           public void write(JsonWriter out, ProcessorSystemConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProcessorSystemConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProcessorSystemConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessorSystemConfig
  * @throws IOException if the JSON string is invalid with respect to ProcessorSystemConfig
  */
  public static ProcessorSystemConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessorSystemConfig.class);
  }

 /**
  * Convert an instance of ProcessorSystemConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

