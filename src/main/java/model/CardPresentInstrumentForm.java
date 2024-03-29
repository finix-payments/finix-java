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
import model.Name;

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
 * Details the &#x60;Payment Instrument&#x60; that the &#x60;Transfer&#x60; debits or credits. 
 */
@ApiModel(description = "Details the `Payment Instrument` that the `Transfer` debits or credits. ")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CardPresentInstrumentForm {
  /**
   * The type of &#x60;Payment Instrument&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANK_ACCOUNT("BANK_ACCOUNT"),
    
    VIRTUAL("VIRTUAL"),
    
    TOKEN("TOKEN"),
    
    SWIPED_PAYMENT_CARD("SWIPED_PAYMENT_CARD"),
    
    PAYMENT_CARD_PRESENT("PAYMENT_CARD_PRESENT"),
    
    PAYMENT_CARD("PAYMENT_CARD"),
    
    VANTIV_OMNI_TOKEN("VANTIV_OMNI_TOKEN"),
    
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

  /**
   * Gets or Sets availableAccountType
   */
  @JsonAdapter(AvailableAccountTypeEnum.Adapter.class)
  public enum AvailableAccountTypeEnum {
    BALANCE("BALANCE"),
    
    LEDGERED("LEDGERED"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    AvailableAccountTypeEnum(String value) {
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

    public static AvailableAccountTypeEnum fromValue(String value) {
        for (AvailableAccountTypeEnum b : AvailableAccountTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        AvailableAccountTypeEnum unknownDefault = AvailableAccountTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<AvailableAccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailableAccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailableAccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailableAccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABLE_ACCOUNT_TYPE = "available_account_type";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ACCOUNT_TYPE)
  private AvailableAccountTypeEnum availableAccountType;

  public static final String SERIALIZED_NAME_EMV_DATA = "emv_data";
  @SerializedName(SERIALIZED_NAME_EMV_DATA)
  private String emvData;

  public static final String SERIALIZED_NAME_EMV_DATA_KEY_SERIAL_NUMBER = "emv_data_key_serial_number";
  @SerializedName(SERIALIZED_NAME_EMV_DATA_KEY_SERIAL_NUMBER)
  private String emvDataKeySerialNumber;

  public static final String SERIALIZED_NAME_ENCRYPTED_EMV_DATA = "encrypted_emv_data";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_EMV_DATA)
  private String encryptedEmvData;

  public static final String SERIALIZED_NAME_ENCRYPTED_EMV_FORMAT = "encrypted_emv_format";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_EMV_FORMAT)
  private Long encryptedEmvFormat;

  public static final String SERIALIZED_NAME_EXPIRATION_MONTH = "expiration_month";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_MONTH)
  private Long expirationMonth;

  public static final String SERIALIZED_NAME_EXPIRATION_YEAR = "expiration_year";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_YEAR)
  private Long expirationYear;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public CardPresentInstrumentForm() { 
  }

  public CardPresentInstrumentForm type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of &#x60;Payment Instrument&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of `Payment Instrument`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CardPresentInstrumentForm availableAccountType(AvailableAccountTypeEnum availableAccountType) {
    
    this.availableAccountType = availableAccountType;
    return this;
  }

   /**
   * Get availableAccountType
   * @return availableAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AvailableAccountTypeEnum getAvailableAccountType() {
    return availableAccountType;
  }


  public void setAvailableAccountType(AvailableAccountTypeEnum availableAccountType) {
    this.availableAccountType = availableAccountType;
  }


  public CardPresentInstrumentForm emvData(String emvData) {
    
    this.emvData = emvData;
    return this;
  }

   /**
   * Encrypted card data used to process the transaction.
   * @return emvData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encrypted card data used to process the transaction.")

  public String getEmvData() {
    return emvData;
  }


  public void setEmvData(String emvData) {
    this.emvData = emvData;
  }


  public CardPresentInstrumentForm emvDataKeySerialNumber(String emvDataKeySerialNumber) {
    
    this.emvDataKeySerialNumber = emvDataKeySerialNumber;
    return this;
  }

   /**
   * Encrypted EMV card data about the key serial number used to process the transaction.
   * @return emvDataKeySerialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encrypted EMV card data about the key serial number used to process the transaction.")

  public String getEmvDataKeySerialNumber() {
    return emvDataKeySerialNumber;
  }


  public void setEmvDataKeySerialNumber(String emvDataKeySerialNumber) {
    this.emvDataKeySerialNumber = emvDataKeySerialNumber;
  }


  public CardPresentInstrumentForm encryptedEmvData(String encryptedEmvData) {
    
    this.encryptedEmvData = encryptedEmvData;
    return this;
  }

   /**
   * Encrypted EMV card data. Required if using an encrypted device.
   * @return encryptedEmvData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encrypted EMV card data. Required if using an encrypted device.")

  public String getEncryptedEmvData() {
    return encryptedEmvData;
  }


  public void setEncryptedEmvData(String encryptedEmvData) {
    this.encryptedEmvData = encryptedEmvData;
  }


  public CardPresentInstrumentForm encryptedEmvFormat(Long encryptedEmvFormat) {
    
    this.encryptedEmvFormat = encryptedEmvFormat;
    return this;
  }

   /**
   * EMV encryption format provided from integrated encryption devices (defaults to **0**).
   * @return encryptedEmvFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EMV encryption format provided from integrated encryption devices (defaults to **0**).")

  public Long getEncryptedEmvFormat() {
    return encryptedEmvFormat;
  }


  public void setEncryptedEmvFormat(Long encryptedEmvFormat) {
    this.encryptedEmvFormat = encryptedEmvFormat;
  }


  public CardPresentInstrumentForm expirationMonth(Long expirationMonth) {
    
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Expiration month of the &#x60;Payment Instrument&#x60; (e.g. 12 for December).
   * @return expirationMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration month of the `Payment Instrument` (e.g. 12 for December).")

  public Long getExpirationMonth() {
    return expirationMonth;
  }


  public void setExpirationMonth(Long expirationMonth) {
    this.expirationMonth = expirationMonth;
  }


  public CardPresentInstrumentForm expirationYear(Long expirationYear) {
    
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * 4-digit expiration year of the &#x60;Payment Instrument&#x60;.
   * @return expirationYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "4-digit expiration year of the `Payment Instrument`.")

  public Long getExpirationYear() {
    return expirationYear;
  }


  public void setExpirationYear(Long expirationYear) {
    this.expirationYear = expirationYear;
  }


  public CardPresentInstrumentForm firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the &#x60;Payment Instrument&#x60; owner.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the `Payment Instrument` owner.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CardPresentInstrumentForm lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the &#x60;Payment Instrument&#x60; owner.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the `Payment Instrument` owner.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CardPresentInstrumentForm name(Name name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name getName() {
    return name;
  }


  public void setName(Name name) {
    this.name = name;
  }


  public CardPresentInstrumentForm number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Primary card account number (no dashes in between numbers).
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Primary card account number (no dashes in between numbers).")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardPresentInstrumentForm cardPresentInstrumentForm = (CardPresentInstrumentForm) o;
    return Objects.equals(this.type, cardPresentInstrumentForm.type) &&
        Objects.equals(this.availableAccountType, cardPresentInstrumentForm.availableAccountType) &&
        Objects.equals(this.emvData, cardPresentInstrumentForm.emvData) &&
        Objects.equals(this.emvDataKeySerialNumber, cardPresentInstrumentForm.emvDataKeySerialNumber) &&
        Objects.equals(this.encryptedEmvData, cardPresentInstrumentForm.encryptedEmvData) &&
        Objects.equals(this.encryptedEmvFormat, cardPresentInstrumentForm.encryptedEmvFormat) &&
        Objects.equals(this.expirationMonth, cardPresentInstrumentForm.expirationMonth) &&
        Objects.equals(this.expirationYear, cardPresentInstrumentForm.expirationYear) &&
        Objects.equals(this.firstName, cardPresentInstrumentForm.firstName) &&
        Objects.equals(this.lastName, cardPresentInstrumentForm.lastName) &&
        Objects.equals(this.name, cardPresentInstrumentForm.name) &&
        Objects.equals(this.number, cardPresentInstrumentForm.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, availableAccountType, emvData, emvDataKeySerialNumber, encryptedEmvData, encryptedEmvFormat, expirationMonth, expirationYear, firstName, lastName, name, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardPresentInstrumentForm {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    availableAccountType: ").append(toIndentedString(availableAccountType)).append("\n");
    sb.append("    emvData: ").append(toIndentedString(emvData)).append("\n");
    sb.append("    emvDataKeySerialNumber: ").append(toIndentedString(emvDataKeySerialNumber)).append("\n");
    sb.append("    encryptedEmvData: ").append(toIndentedString(encryptedEmvData)).append("\n");
    sb.append("    encryptedEmvFormat: ").append(toIndentedString(encryptedEmvFormat)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("available_account_type");
    openapiFields.add("emv_data");
    openapiFields.add("emv_data_key_serial_number");
    openapiFields.add("encrypted_emv_data");
    openapiFields.add("encrypted_emv_format");
    openapiFields.add("expiration_month");
    openapiFields.add("expiration_year");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("name");
    openapiFields.add("number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardPresentInstrumentForm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardPresentInstrumentForm.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardPresentInstrumentForm is not found in the empty JSON string", CardPresentInstrumentForm.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardPresentInstrumentForm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardPresentInstrumentForm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
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
      if (jsonObj.get("available_account_type") != null && !jsonObj.get("available_account_type").isJsonNull()  && !jsonObj.get("available_account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_account_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("emv_data") != null && !jsonObj.get("emv_data").isJsonNull()  && !jsonObj.get("emv_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emv_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emv_data").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("emv_data_key_serial_number") != null && !jsonObj.get("emv_data_key_serial_number").isJsonNull()  && !jsonObj.get("emv_data_key_serial_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emv_data_key_serial_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emv_data_key_serial_number").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("encrypted_emv_data") != null && !jsonObj.get("encrypted_emv_data").isJsonNull()  && !jsonObj.get("encrypted_emv_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encrypted_emv_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encrypted_emv_data").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()  && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()  && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `name`
     // if (jsonObj.getAsJsonObject("name") != null) {
       //Name.validateJsonObject(jsonObj.getAsJsonObject("name"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()  && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardPresentInstrumentForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardPresentInstrumentForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardPresentInstrumentForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardPresentInstrumentForm.class));

       return (TypeAdapter<T>) new TypeAdapter<CardPresentInstrumentForm>() {
           @Override
           public void write(JsonWriter out, CardPresentInstrumentForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardPresentInstrumentForm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardPresentInstrumentForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardPresentInstrumentForm
  * @throws IOException if the JSON string is invalid with respect to CardPresentInstrumentForm
  */
  public static CardPresentInstrumentForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardPresentInstrumentForm.class);
  }

 /**
  * Convert an instance of CardPresentInstrumentForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

