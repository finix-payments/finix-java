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
import model.Address;
import model.Country;
import model.Currency;
import model.PaymentInstrumentLinks;
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
 * 
 */
@ApiModel(description = "")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentInstrument {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  /**
   * Additional address information that’s required to verify the identity of the merchant.
   */
  @JsonAdapter(AddressVerificationEnum.Adapter.class)
  public enum AddressVerificationEnum {
    POSTAL_CODE_AND_STREET_MATCH("POSTAL_CODE_AND_STREET_MATCH"),
    
    STREET_MATCH("STREET_MATCH"),
    
    POSTAL_CODE_MATCH("POSTAL_CODE_MATCH"),
    
    NO_ADDRESS("NO_ADDRESS"),
    
    NO_MATCH("NO_MATCH"),
    
    NOT_SUPPORTED("NOT_SUPPORTED"),
    
    UNKNOWN("UNKNOWN"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    AddressVerificationEnum(String value) {
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

    public static AddressVerificationEnum fromValue(String value) {
        for (AddressVerificationEnum b : AddressVerificationEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        AddressVerificationEnum unknownDefault = AddressVerificationEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<AddressVerificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressVerificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressVerificationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AddressVerificationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "address_verification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private AddressVerificationEnum addressVerification;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CARD_NAME = "card_name";
  @SerializedName(SERIALIZED_NAME_CARD_NAME)
  private String cardName;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_EXPIRATION_MONTH = "expiration_month";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_MONTH)
  private Long expirationMonth;

  public static final String SERIALIZED_NAME_EXPIRATION_YEAR = "expiration_year";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_YEAR)
  private Long expirationYear;

  public static final String SERIALIZED_NAME_FAST_FUNDS_INDICATOR = "fast_funds_indicator";
  @SerializedName(SERIALIZED_NAME_FAST_FUNDS_INDICATOR)
  private String fastFundsIndicator;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  /**
   * The type of &#x60;Payment Instrument&#x60;.
   */
  @JsonAdapter(InstrumentTypeEnum.Adapter.class)
  public enum InstrumentTypeEnum {
    BANK_ACCOUNT("BANK_ACCOUNT"),
    
    TOKEN("TOKEN"),
    
    APPLE_PAY("APPLE_PAY"),
    
    VIRTUAL("VIRTUAL"),
    
    PAYMENT_CARD_PRESENT("PAYMENT_CARD_PRESENT"),
    
    GOOGLE_PAY("GOOGLE_PAY"),
    
    VANTIV_OMNI_TOKEN("VANTIV_OMNI_TOKEN"),
    
    SWIPED_PAYMENT_CARD("SWIPED_PAYMENT_CARD"),
    
    PAYMENT_CARD("PAYMENT_CARD"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    InstrumentTypeEnum(String value) {
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

    public static InstrumentTypeEnum fromValue(String value) {
        for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        InstrumentTypeEnum unknownDefault = InstrumentTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<InstrumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstrumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstrumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstrumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrument_type";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private InstrumentTypeEnum instrumentType;

  public static final String SERIALIZED_NAME_LAST_FOUR = "last_four";
  @SerializedName(SERIALIZED_NAME_LAST_FOUR)
  private String lastFour;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ONLINE_GAMBING_BLOCK_INDICATOR = "online_gambing_block_indicator";
  @SerializedName(SERIALIZED_NAME_ONLINE_GAMBING_BLOCK_INDICATOR)
  private String onlineGambingBlockIndicator;

  /**
   * Gets or Sets payloadType
   */
  @JsonAdapter(PayloadTypeEnum.Adapter.class)
  public enum PayloadTypeEnum {
    SOURCE("SOURCE"),
    
    DESTINATION("DESTINATION"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    PayloadTypeEnum(String value) {
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

    public static PayloadTypeEnum fromValue(String value) {
        for (PayloadTypeEnum b : PayloadTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        PayloadTypeEnum unknownDefault = PayloadTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<PayloadTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayloadTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayloadTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayloadTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYLOAD_TYPE = "payload_type";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_TYPE)
  private PayloadTypeEnum payloadType;

  public static final String SERIALIZED_NAME_PUSH_FUNDS_BLOCK_INDICATOR = "push_funds_block_indicator";
  @SerializedName(SERIALIZED_NAME_PUSH_FUNDS_BLOCK_INDICATOR)
  private String pushFundsBlockIndicator;

  /**
   * Details the results of the Card Verification Code check.
   */
  @JsonAdapter(SecurityCodeVerificationEnum.Adapter.class)
  public enum SecurityCodeVerificationEnum {
    MATCHED("MATCHED"),
    
    UNKNOWN("UNKNOWN"),
    
    UNMATCHED("UNMATCHED"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    SecurityCodeVerificationEnum(String value) {
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

    public static SecurityCodeVerificationEnum fromValue(String value) {
        for (SecurityCodeVerificationEnum b : SecurityCodeVerificationEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        SecurityCodeVerificationEnum unknownDefault = SecurityCodeVerificationEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<SecurityCodeVerificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecurityCodeVerificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecurityCodeVerificationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SecurityCodeVerificationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SECURITY_CODE_VERIFICATION = "security_code_verification";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE_VERIFICATION)
  private SecurityCodeVerificationEnum securityCodeVerification;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  /**
   * Type of &#x60;Payment Instrument&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANK_ACCOUNT("BANK_ACCOUNT"),
    
    TOKEN("TOKEN"),
    
    APPLE_PAY("APPLE_PAY"),
    
    VIRTUAL("VIRTUAL"),
    
    PAYMENT_CARD_PRESENT("PAYMENT_CARD_PRESENT"),
    
    GOOGLE_PAY("GOOGLE_PAY"),
    
    VANTIV_OMNI_TOKEN("VANTIV_OMNI_TOKEN"),
    
    SWIPED_PAYMENT_CARD("SWIPED_PAYMENT_CARD"),
    
    PAYMENT_CARD("PAYMENT_CARD"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
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

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        TypeEnum unknownDefault = TypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaymentInstrumentLinks links;

  /**
   * Details what kind of **BANK_ACCOUNT** is being used.
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    CHECKING("CHECKING"),
    
    SAVINGS("SAVINGS"),
    
    CORPORATE("CORPORATE"),
    
    CORP_SAVINGS("CORP_SAVINGS"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    AccountTypeEnum(String value) {
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

    public static AccountTypeEnum fromValue(String value) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        AccountTypeEnum unknownDefault = AccountTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  /**
   * Details the results of the bank account validation check if &#x60;attempt_bank_account_validation_check&#x60; is set to **true**.
   */
  @JsonAdapter(BankAccountValidationCheckEnum.Adapter.class)
  public enum BankAccountValidationCheckEnum {
    NOT_ATTEMPTED("NOT_ATTEMPTED"),
    
    INCONCLUSIVE("INCONCLUSIVE"),
    
    INVALID("INVALID"),
    
    VALID("VALID"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    BankAccountValidationCheckEnum(String value) {
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

    public static BankAccountValidationCheckEnum fromValue(String value) {
        for (BankAccountValidationCheckEnum b : BankAccountValidationCheckEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        BankAccountValidationCheckEnum unknownDefault = BankAccountValidationCheckEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<BankAccountValidationCheckEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BankAccountValidationCheckEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BankAccountValidationCheckEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BankAccountValidationCheckEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_VALIDATION_CHECK = "bank_account_validation_check";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_VALIDATION_CHECK)
  private BankAccountValidationCheckEnum bankAccountValidationCheck = BankAccountValidationCheckEnum.NOT_ATTEMPTED;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country;

  public static final String SERIALIZED_NAME_MASKED_ACCOUNT_NUMBER = "masked_account_number";
  @SerializedName(SERIALIZED_NAME_MASKED_ACCOUNT_NUMBER)
  private String maskedAccountNumber;

  public PaymentInstrument() { 
  }

  public PaymentInstrument id(String id) {
    
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


  public PaymentInstrument createdAt(OffsetDateTime createdAt) {
    
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


  public PaymentInstrument updatedAt(OffsetDateTime updatedAt) {
    
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


  public PaymentInstrument address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public PaymentInstrument addressVerification(AddressVerificationEnum addressVerification) {
    
    this.addressVerification = addressVerification;
    return this;
  }

   /**
   * Additional address information that’s required to verify the identity of the merchant.
   * @return addressVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional address information that’s required to verify the identity of the merchant.")

  public AddressVerificationEnum getAddressVerification() {
    return addressVerification;
  }


  public void setAddressVerification(AddressVerificationEnum addressVerification) {
    this.addressVerification = addressVerification;
  }


  public PaymentInstrument application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the resource.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public PaymentInstrument bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * Bank Identification number for the &#x60;Payment Instrument&#x60;.
   * @return bin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bank Identification number for the `Payment Instrument`.")

  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {
    this.bin = bin;
  }


  public PaymentInstrument brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * The &#x60;brand&#x60; of the card saved in the &#x60;Payment Instrument&#x60;.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `brand` of the card saved in the `Payment Instrument`.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public PaymentInstrument cardName(String cardName) {
    
    this.cardName = cardName;
    return this;
  }

   /**
   * A custom name you can include to identify the card being used (e.g. **Business Card**).
   * @return cardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A custom name you can include to identify the card being used (e.g. **Business Card**).")

  public String getCardName() {
    return cardName;
  }


  public void setCardName(String cardName) {
    this.cardName = cardName;
  }


  public PaymentInstrument cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * The type of payment card saved in the &#x60;Payment Instrument&#x60;.
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of payment card saved in the `Payment Instrument`.")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public PaymentInstrument currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public PaymentInstrument expirationMonth(Long expirationMonth) {
    
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Expiration month (e.g. 12 for December).
   * minimum: 1
   * maximum: 12
   * @return expirationMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration month (e.g. 12 for December).")

  public Long getExpirationMonth() {
    return expirationMonth;
  }


  public void setExpirationMonth(Long expirationMonth) {
    this.expirationMonth = expirationMonth;
  }


  public PaymentInstrument expirationYear(Long expirationYear) {
    
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * 4-digit expiration year.
   * minimum: 1
   * @return expirationYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "4-digit expiration year.")

  public Long getExpirationYear() {
    return expirationYear;
  }


  public void setExpirationYear(Long expirationYear) {
    this.expirationYear = expirationYear;
  }


  public PaymentInstrument fastFundsIndicator(String fastFundsIndicator) {
    
    this.fastFundsIndicator = fastFundsIndicator;
    return this;
  }

   /**
   * Details if Fast Funds is enabled for the card.
   * @return fastFundsIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if Fast Funds is enabled for the card.")

  public String getFastFundsIndicator() {
    return fastFundsIndicator;
  }


  public void setFastFundsIndicator(String fastFundsIndicator) {
    this.fastFundsIndicator = fastFundsIndicator;
  }


  public PaymentInstrument fingerprint(String fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Unique ID that represents the tokenized card data.
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FPRxxxxxxxxxxxxxxxxx", value = "Unique ID that represents the tokenized card data.")

  public String getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public PaymentInstrument identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * The ID of the resource.
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public PaymentInstrument instrumentType(InstrumentTypeEnum instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * The type of &#x60;Payment Instrument&#x60;.
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of `Payment Instrument`.")

  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }


  public PaymentInstrument lastFour(String lastFour) {
    
    this.lastFour = lastFour;
    return this;
  }

   /**
   * Last four digits of the card or bank account number.
   * @return lastFour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last four digits of the card or bank account number.")

  public String getLastFour() {
    return lastFour;
  }


  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }


  public PaymentInstrument name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the bank account or card owner.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the bank account or card owner.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PaymentInstrument onlineGambingBlockIndicator(String onlineGambingBlockIndicator) {
    
    this.onlineGambingBlockIndicator = onlineGambingBlockIndicator;
    return this;
  }

   /**
   * Detailes if the card is enabled to receive push-payments for online gambling payouts.
   * @return onlineGambingBlockIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detailes if the card is enabled to receive push-payments for online gambling payouts.")

  public String getOnlineGambingBlockIndicator() {
    return onlineGambingBlockIndicator;
  }


  public void setOnlineGambingBlockIndicator(String onlineGambingBlockIndicator) {
    this.onlineGambingBlockIndicator = onlineGambingBlockIndicator;
  }


  public PaymentInstrument payloadType(PayloadTypeEnum payloadType) {
    
    this.payloadType = payloadType;
    return this;
  }

   /**
   * Get payloadType
   * @return payloadType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayloadTypeEnum getPayloadType() {
    return payloadType;
  }


  public void setPayloadType(PayloadTypeEnum payloadType) {
    this.payloadType = payloadType;
  }


  public PaymentInstrument pushFundsBlockIndicator(String pushFundsBlockIndicator) {
    
    this.pushFundsBlockIndicator = pushFundsBlockIndicator;
    return this;
  }

   /**
   * Details if the card is enabled to receive push-to-card disbursements.
   * @return pushFundsBlockIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the card is enabled to receive push-to-card disbursements.")

  public String getPushFundsBlockIndicator() {
    return pushFundsBlockIndicator;
  }


  public void setPushFundsBlockIndicator(String pushFundsBlockIndicator) {
    this.pushFundsBlockIndicator = pushFundsBlockIndicator;
  }


  public PaymentInstrument securityCodeVerification(SecurityCodeVerificationEnum securityCodeVerification) {
    
    this.securityCodeVerification = securityCodeVerification;
    return this;
  }

   /**
   * Details the results of the Card Verification Code check.
   * @return securityCodeVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details the results of the Card Verification Code check.")

  public SecurityCodeVerificationEnum getSecurityCodeVerification() {
    return securityCodeVerification;
  }


  public void setSecurityCodeVerification(SecurityCodeVerificationEnum securityCodeVerification) {
    this.securityCodeVerification = securityCodeVerification;
  }


  public PaymentInstrument tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public PaymentInstrument putTagsItem(String key, String tagsItem) {
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


  public PaymentInstrument type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of &#x60;Payment Instrument&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of `Payment Instrument`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentInstrument links(PaymentInstrumentLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInstrumentLinks getLinks() {
    return links;
  }


  public void setLinks(PaymentInstrumentLinks links) {
    this.links = links;
  }


  public PaymentInstrument accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Details what kind of **BANK_ACCOUNT** is being used.
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details what kind of **BANK_ACCOUNT** is being used.")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public PaymentInstrument bankAccountValidationCheck(BankAccountValidationCheckEnum bankAccountValidationCheck) {
    
    this.bankAccountValidationCheck = bankAccountValidationCheck;
    return this;
  }

   /**
   * Details the results of the bank account validation check if &#x60;attempt_bank_account_validation_check&#x60; is set to **true**.
   * @return bankAccountValidationCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details the results of the bank account validation check if `attempt_bank_account_validation_check` is set to **true**.")

  public BankAccountValidationCheckEnum getBankAccountValidationCheck() {
    return bankAccountValidationCheck;
  }


  public void setBankAccountValidationCheck(BankAccountValidationCheckEnum bankAccountValidationCheck) {
    this.bankAccountValidationCheck = bankAccountValidationCheck;
  }


  public PaymentInstrument bankCode(String bankCode) {
    
    this.bankCode = bankCode;
    return this;
  }

   /**
   * The routing number of the bank account.
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The routing number of the bank account.")

  public String getBankCode() {
    return bankCode;
  }


  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public PaymentInstrument country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Country getCountry() {
    return country;
  }


  public void setCountry(Country country) {
    this.country = country;
  }


  public PaymentInstrument maskedAccountNumber(String maskedAccountNumber) {
    
    this.maskedAccountNumber = maskedAccountNumber;
    return this;
  }

   /**
   * The last 4 digits of the account number used to create the &#x60;Payment Instrument&#x60;.
   * @return maskedAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last 4 digits of the account number used to create the `Payment Instrument`.")

  public String getMaskedAccountNumber() {
    return maskedAccountNumber;
  }


  public void setMaskedAccountNumber(String maskedAccountNumber) {
    this.maskedAccountNumber = maskedAccountNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrument paymentInstrument = (PaymentInstrument) o;
    return Objects.equals(this.id, paymentInstrument.id) &&
        Objects.equals(this.createdAt, paymentInstrument.createdAt) &&
        Objects.equals(this.updatedAt, paymentInstrument.updatedAt) &&
        Objects.equals(this.address, paymentInstrument.address) &&
        Objects.equals(this.addressVerification, paymentInstrument.addressVerification) &&
        Objects.equals(this.application, paymentInstrument.application) &&
        Objects.equals(this.bin, paymentInstrument.bin) &&
        Objects.equals(this.brand, paymentInstrument.brand) &&
        Objects.equals(this.cardName, paymentInstrument.cardName) &&
        Objects.equals(this.cardType, paymentInstrument.cardType) &&
        Objects.equals(this.currency, paymentInstrument.currency) &&
        Objects.equals(this.expirationMonth, paymentInstrument.expirationMonth) &&
        Objects.equals(this.expirationYear, paymentInstrument.expirationYear) &&
        Objects.equals(this.fastFundsIndicator, paymentInstrument.fastFundsIndicator) &&
        Objects.equals(this.fingerprint, paymentInstrument.fingerprint) &&
        Objects.equals(this.identity, paymentInstrument.identity) &&
        Objects.equals(this.instrumentType, paymentInstrument.instrumentType) &&
        Objects.equals(this.lastFour, paymentInstrument.lastFour) &&
        Objects.equals(this.name, paymentInstrument.name) &&
        Objects.equals(this.onlineGambingBlockIndicator, paymentInstrument.onlineGambingBlockIndicator) &&
        Objects.equals(this.payloadType, paymentInstrument.payloadType) &&
        Objects.equals(this.pushFundsBlockIndicator, paymentInstrument.pushFundsBlockIndicator) &&
        Objects.equals(this.securityCodeVerification, paymentInstrument.securityCodeVerification) &&
        Objects.equals(this.tags, paymentInstrument.tags) &&
        Objects.equals(this.type, paymentInstrument.type) &&
        Objects.equals(this.links, paymentInstrument.links) &&
        Objects.equals(this.accountType, paymentInstrument.accountType) &&
        Objects.equals(this.bankAccountValidationCheck, paymentInstrument.bankAccountValidationCheck) &&
        Objects.equals(this.bankCode, paymentInstrument.bankCode) &&
        Objects.equals(this.country, paymentInstrument.country) &&
        Objects.equals(this.maskedAccountNumber, paymentInstrument.maskedAccountNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, address, addressVerification, application, bin, brand, cardName, cardType, currency, expirationMonth, expirationYear, fastFundsIndicator, fingerprint, identity, instrumentType, lastFour, name, onlineGambingBlockIndicator, payloadType, pushFundsBlockIndicator, securityCodeVerification, tags, type, links, accountType, bankAccountValidationCheck, bankCode, country, maskedAccountNumber);
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
    sb.append("class PaymentInstrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    cardName: ").append(toIndentedString(cardName)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    fastFundsIndicator: ").append(toIndentedString(fastFundsIndicator)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onlineGambingBlockIndicator: ").append(toIndentedString(onlineGambingBlockIndicator)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
    sb.append("    pushFundsBlockIndicator: ").append(toIndentedString(pushFundsBlockIndicator)).append("\n");
    sb.append("    securityCodeVerification: ").append(toIndentedString(securityCodeVerification)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankAccountValidationCheck: ").append(toIndentedString(bankAccountValidationCheck)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    maskedAccountNumber: ").append(toIndentedString(maskedAccountNumber)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("address_verification");
    openapiFields.add("application");
    openapiFields.add("bin");
    openapiFields.add("brand");
    openapiFields.add("card_name");
    openapiFields.add("card_type");
    openapiFields.add("currency");
    openapiFields.add("expiration_month");
    openapiFields.add("expiration_year");
    openapiFields.add("fast_funds_indicator");
    openapiFields.add("fingerprint");
    openapiFields.add("identity");
    openapiFields.add("instrument_type");
    openapiFields.add("last_four");
    openapiFields.add("name");
    openapiFields.add("online_gambing_block_indicator");
    openapiFields.add("payload_type");
    openapiFields.add("push_funds_block_indicator");
    openapiFields.add("security_code_verification");
    openapiFields.add("tags");
    openapiFields.add("type");
    openapiFields.add("_links");
    openapiFields.add("account_type");
    openapiFields.add("bank_account_validation_check");
    openapiFields.add("bank_code");
    openapiFields.add("country");
    openapiFields.add("masked_account_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrument.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrument is not found in the empty JSON string", PaymentInstrument.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `address`
     // if (jsonObj.getAsJsonObject("address") != null) {
       //Address.validateJsonObject(jsonObj.getAsJsonObject("address"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("address_verification") != null && !jsonObj.get("address_verification").isJsonNull()  && !jsonObj.get("address_verification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_verification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_verification").toString()));
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
      if (jsonObj.get("bin") != null && !jsonObj.get("bin").isJsonNull()  && !jsonObj.get("bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()  && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("card_name") != null && !jsonObj.get("card_name").isJsonNull()  && !jsonObj.get("card_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()  && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fast_funds_indicator") != null && !jsonObj.get("fast_funds_indicator").isJsonNull()  && !jsonObj.get("fast_funds_indicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fast_funds_indicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fast_funds_indicator").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fingerprint") != null && !jsonObj.get("fingerprint").isJsonNull()  && !jsonObj.get("fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint").toString()));
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
      if (jsonObj.get("instrument_type") != null && !jsonObj.get("instrument_type").isJsonNull()  && !jsonObj.get("instrument_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("last_four") != null && !jsonObj.get("last_four").isJsonNull()  && !jsonObj.get("last_four").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_four` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_four").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()  && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("online_gambing_block_indicator") != null && !jsonObj.get("online_gambing_block_indicator").isJsonNull()  && !jsonObj.get("online_gambing_block_indicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `online_gambing_block_indicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("online_gambing_block_indicator").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("payload_type") != null && !jsonObj.get("payload_type").isJsonNull()  && !jsonObj.get("payload_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("push_funds_block_indicator") != null && !jsonObj.get("push_funds_block_indicator").isJsonNull()  && !jsonObj.get("push_funds_block_indicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_funds_block_indicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_funds_block_indicator").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("security_code_verification") != null && !jsonObj.get("security_code_verification").isJsonNull()  && !jsonObj.get("security_code_verification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `security_code_verification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("security_code_verification").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //PaymentInstrumentLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()  && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("bank_account_validation_check") != null && !jsonObj.get("bank_account_validation_check").isJsonNull()  && !jsonObj.get("bank_account_validation_check").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account_validation_check` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account_validation_check").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("bank_code") != null && !jsonObj.get("bank_code").isJsonNull()  && !jsonObj.get("bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("masked_account_number") != null && !jsonObj.get("masked_account_number").isJsonNull()  && !jsonObj.get("masked_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masked_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masked_account_number").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrument.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrument>() {
           @Override
           public void write(JsonWriter out, PaymentInstrument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrument
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrument
  */
  public static PaymentInstrument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrument.class);
  }

 /**
  * Convert an instance of PaymentInstrument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

