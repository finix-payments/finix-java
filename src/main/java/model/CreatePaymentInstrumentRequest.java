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
import model.CreatePaymentInstrumentRequestAddress;
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
 * CreatePaymentInstrumentRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePaymentInstrumentRequest {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CreatePaymentInstrumentRequestAddress address;

  public static final String SERIALIZED_NAME_EXPIRATION_MONTH = "expiration_month";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_MONTH)
  private Long expirationMonth;

  public static final String SERIALIZED_NAME_EXPIRATION_YEAR = "expiration_year";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_YEAR)
  private Long expirationYear;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_SECURITY_CODE = "security_code";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE)
  private String securityCode;

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
    
    GOOGLE_PAY("GOOGLE_PAY"),
    
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

  public static final String SERIALIZED_NAME_THIRD_PARTY_TOKEN = "third_party_token";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_TOKEN)
  private String thirdPartyToken;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  /**
   * The type of bank account.
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

  public static final String SERIALIZED_NAME_ATTEMPT_BANK_ACCOUNT_VALIDATION_CHECK = "attempt_bank_account_validation_check";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_BANK_ACCOUNT_VALIDATION_CHECK)
  private Boolean attemptBankAccountValidationCheck = false;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private String merchantIdentity;

  public CreatePaymentInstrumentRequest() { 
  }

  public CreatePaymentInstrumentRequest address(CreatePaymentInstrumentRequestAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreatePaymentInstrumentRequestAddress getAddress() {
    return address;
  }


  public void setAddress(CreatePaymentInstrumentRequestAddress address) {
    this.address = address;
  }


  public CreatePaymentInstrumentRequest expirationMonth(Long expirationMonth) {
    
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * The expiration month of the card (e.g. 12 for December).
   * @return expirationMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expiration month of the card (e.g. 12 for December).")

  public Long getExpirationMonth() {
    return expirationMonth;
  }


  public void setExpirationMonth(Long expirationMonth) {
    this.expirationMonth = expirationMonth;
  }


  public CreatePaymentInstrumentRequest expirationYear(Long expirationYear) {
    
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * The 4-digit expiration year of the card.
   * @return expirationYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 4-digit expiration year of the card.")

  public Long getExpirationYear() {
    return expirationYear;
  }


  public void setExpirationYear(Long expirationYear) {
    this.expirationYear = expirationYear;
  }


  public CreatePaymentInstrumentRequest identity(String identity) {
    
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


  public CreatePaymentInstrumentRequest name(String name) {
    
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


  public CreatePaymentInstrumentRequest number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The card or bank account number (no dashes in between numbers).
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The card or bank account number (no dashes in between numbers).")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public CreatePaymentInstrumentRequest securityCode(String securityCode) {
    
    this.securityCode = securityCode;
    return this;
  }

   /**
   * The 3-4 digit security code of the card (i.e. CVV code).
   * @return securityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 3-4 digit security code of the card (i.e. CVV code).")

  public String getSecurityCode() {
    return securityCode;
  }


  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  public CreatePaymentInstrumentRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreatePaymentInstrumentRequest putTagsItem(String key, String tagsItem) {
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


  public CreatePaymentInstrumentRequest type(TypeEnum type) {
    
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


  public CreatePaymentInstrumentRequest thirdPartyToken(String thirdPartyToken) {
    
    this.thirdPartyToken = thirdPartyToken;
    return this;
  }

   /**
   * Stringified token provided by Google. Required to process Google Pay transactions.
   * @return thirdPartyToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stringified token provided by Google. Required to process Google Pay transactions.")

  public String getThirdPartyToken() {
    return thirdPartyToken;
  }


  public void setThirdPartyToken(String thirdPartyToken) {
    this.thirdPartyToken = thirdPartyToken;
  }


  public CreatePaymentInstrumentRequest accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The bank account number (no dashes in between numbers).
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bank account number (no dashes in between numbers).")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public CreatePaymentInstrumentRequest accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The type of bank account.
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of bank account.")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public CreatePaymentInstrumentRequest attemptBankAccountValidationCheck(Boolean attemptBankAccountValidationCheck) {
    
    this.attemptBankAccountValidationCheck = attemptBankAccountValidationCheck;
    return this;
  }

   /**
   * Set to **true** if you want to request a bank account validation. Default value is **false**.
   * @return attemptBankAccountValidationCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to **true** if you want to request a bank account validation. Default value is **false**.")

  public Boolean getAttemptBankAccountValidationCheck() {
    return attemptBankAccountValidationCheck;
  }


  public void setAttemptBankAccountValidationCheck(Boolean attemptBankAccountValidationCheck) {
    this.attemptBankAccountValidationCheck = attemptBankAccountValidationCheck;
  }


  public CreatePaymentInstrumentRequest bankCode(String bankCode) {
    
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


  public CreatePaymentInstrumentRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * 3 Letter country code (e.g. USA).
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "3 Letter country code (e.g. USA).")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CreatePaymentInstrumentRequest token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * ID of the &#x60;Token&#x60; that was returned from the tokenization client or hosted fields
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Token` that was returned from the tokenization client or hosted fields")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public CreatePaymentInstrumentRequest merchantIdentity(String merchantIdentity) {
    
    this.merchantIdentity = merchantIdentity;
    return this;
  }

   /**
   * The &#x60;id&#x60; of the identity used when registering the business with Google Pay through our registration API.
   * @return merchantIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `id` of the identity used when registering the business with Google Pay through our registration API.")

  public String getMerchantIdentity() {
    return merchantIdentity;
  }


  public void setMerchantIdentity(String merchantIdentity) {
    this.merchantIdentity = merchantIdentity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentInstrumentRequest createPaymentInstrumentRequest = (CreatePaymentInstrumentRequest) o;
    return Objects.equals(this.address, createPaymentInstrumentRequest.address) &&
        Objects.equals(this.expirationMonth, createPaymentInstrumentRequest.expirationMonth) &&
        Objects.equals(this.expirationYear, createPaymentInstrumentRequest.expirationYear) &&
        Objects.equals(this.identity, createPaymentInstrumentRequest.identity) &&
        Objects.equals(this.name, createPaymentInstrumentRequest.name) &&
        Objects.equals(this.number, createPaymentInstrumentRequest.number) &&
        Objects.equals(this.securityCode, createPaymentInstrumentRequest.securityCode) &&
        Objects.equals(this.tags, createPaymentInstrumentRequest.tags) &&
        Objects.equals(this.type, createPaymentInstrumentRequest.type) &&
        Objects.equals(this.thirdPartyToken, createPaymentInstrumentRequest.thirdPartyToken) &&
        Objects.equals(this.accountNumber, createPaymentInstrumentRequest.accountNumber) &&
        Objects.equals(this.accountType, createPaymentInstrumentRequest.accountType) &&
        Objects.equals(this.attemptBankAccountValidationCheck, createPaymentInstrumentRequest.attemptBankAccountValidationCheck) &&
        Objects.equals(this.bankCode, createPaymentInstrumentRequest.bankCode) &&
        Objects.equals(this.country, createPaymentInstrumentRequest.country) &&
        Objects.equals(this.token, createPaymentInstrumentRequest.token) &&
        Objects.equals(this.merchantIdentity, createPaymentInstrumentRequest.merchantIdentity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, expirationMonth, expirationYear, identity, name, number, securityCode, tags, type, thirdPartyToken, accountNumber, accountType, attemptBankAccountValidationCheck, bankCode, country, token, merchantIdentity);
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
    sb.append("class CreatePaymentInstrumentRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    thirdPartyToken: ").append(toIndentedString(thirdPartyToken)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    attemptBankAccountValidationCheck: ").append(toIndentedString(attemptBankAccountValidationCheck)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    merchantIdentity: ").append(toIndentedString(merchantIdentity)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("expiration_month");
    openapiFields.add("expiration_year");
    openapiFields.add("identity");
    openapiFields.add("name");
    openapiFields.add("number");
    openapiFields.add("security_code");
    openapiFields.add("tags");
    openapiFields.add("type");
    openapiFields.add("third_party_token");
    openapiFields.add("account_number");
    openapiFields.add("account_type");
    openapiFields.add("attempt_bank_account_validation_check");
    openapiFields.add("bank_code");
    openapiFields.add("country");
    openapiFields.add("token");
    openapiFields.add("merchant_identity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatePaymentInstrumentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreatePaymentInstrumentRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePaymentInstrumentRequest is not found in the empty JSON string", CreatePaymentInstrumentRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreatePaymentInstrumentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePaymentInstrumentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `address`
     // if (jsonObj.getAsJsonObject("address") != null) {
       //CreatePaymentInstrumentRequestAddress.validateJsonObject(jsonObj.getAsJsonObject("address"));
     // }

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
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()  && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()  && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("security_code") != null && !jsonObj.get("security_code").isJsonNull()  && !jsonObj.get("security_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `security_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("security_code").toString()));
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
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("third_party_token") != null && !jsonObj.get("third_party_token").isJsonNull()  && !jsonObj.get("third_party_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_token").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()  && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
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
      if (jsonObj.get("bank_code") != null && !jsonObj.get("bank_code").isJsonNull()  && !jsonObj.get("bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_code").toString()));
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
      if (jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()  && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_identity") != null && !jsonObj.get("merchant_identity").isJsonNull()  && !jsonObj.get("merchant_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_identity").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePaymentInstrumentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePaymentInstrumentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePaymentInstrumentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePaymentInstrumentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePaymentInstrumentRequest>() {
           @Override
           public void write(JsonWriter out, CreatePaymentInstrumentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePaymentInstrumentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePaymentInstrumentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePaymentInstrumentRequest
  * @throws IOException if the JSON string is invalid with respect to CreatePaymentInstrumentRequest
  */
  public static CreatePaymentInstrumentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePaymentInstrumentRequest.class);
  }

 /**
  * Convert an instance of CreatePaymentInstrumentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

