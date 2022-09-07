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
import model.CardPresentDetailsEmvData;
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
 * Details needed to process card present transactions.
 */
@ApiModel(description = "Details needed to process card present transactions.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CardPresentDetails {
  public static final String SERIALIZED_NAME_APPROVAL_CODE = "approval_code";
  @SerializedName(SERIALIZED_NAME_APPROVAL_CODE)
  private String approvalCode;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_EMV_DATA = "emv_data";
  @SerializedName(SERIALIZED_NAME_EMV_DATA)
  private CardPresentDetailsEmvData emvData;

  public static final String SERIALIZED_NAME_ENTRY_MODE = "entry_mode";
  @SerializedName(SERIALIZED_NAME_ENTRY_MODE)
  private String entryMode;

  public static final String SERIALIZED_NAME_MASKED_ACCOUNT_NUMBER = "masked_account_number";
  @SerializedName(SERIALIZED_NAME_MASKED_ACCOUNT_NUMBER)
  private String maskedAccountNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public CardPresentDetails() { 
  }

  public CardPresentDetails approvalCode(String approvalCode) {
    
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Unique ID used to identify the approval of the &#x60;Transfer&#x60;.
   * @return approvalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID used to identify the approval of the `Transfer`.")

  public String getApprovalCode() {
    return approvalCode;
  }


  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }


  public CardPresentDetails brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the card saved in the &#x60;Payment Instrument&#x60;.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The brand of the card saved in the `Payment Instrument`.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public CardPresentDetails emvData(CardPresentDetailsEmvData emvData) {
    
    this.emvData = emvData;
    return this;
  }

   /**
   * Get emvData
   * @return emvData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardPresentDetailsEmvData getEmvData() {
    return emvData;
  }


  public void setEmvData(CardPresentDetailsEmvData emvData) {
    this.emvData = emvData;
  }


  public CardPresentDetails entryMode(String entryMode) {
    
    this.entryMode = entryMode;
    return this;
  }

   /**
   * Details how the card was entered to process the transaction.
   * @return entryMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details how the card was entered to process the transaction.")

  public String getEntryMode() {
    return entryMode;
  }


  public void setEntryMode(String entryMode) {
    this.entryMode = entryMode;
  }


  public CardPresentDetails maskedAccountNumber(String maskedAccountNumber) {
    
    this.maskedAccountNumber = maskedAccountNumber;
    return this;
  }

   /**
   * Last four digits of the bank account number.
   * @return maskedAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last four digits of the bank account number.")

  public String getMaskedAccountNumber() {
    return maskedAccountNumber;
  }


  public void setMaskedAccountNumber(String maskedAccountNumber) {
    this.maskedAccountNumber = maskedAccountNumber;
  }


  public CardPresentDetails name(String name) {
    
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


  public CardPresentDetails paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The type of &#x60;Payment Instrument&#x60; used in the transaction (or the original payment).
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of `Payment Instrument` used in the transaction (or the original payment).")

  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardPresentDetails cardPresentDetails = (CardPresentDetails) o;
    return Objects.equals(this.approvalCode, cardPresentDetails.approvalCode) &&
        Objects.equals(this.brand, cardPresentDetails.brand) &&
        Objects.equals(this.emvData, cardPresentDetails.emvData) &&
        Objects.equals(this.entryMode, cardPresentDetails.entryMode) &&
        Objects.equals(this.maskedAccountNumber, cardPresentDetails.maskedAccountNumber) &&
        Objects.equals(this.name, cardPresentDetails.name) &&
        Objects.equals(this.paymentType, cardPresentDetails.paymentType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, brand, emvData, entryMode, maskedAccountNumber, name, paymentType);
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
    sb.append("class CardPresentDetails {\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    emvData: ").append(toIndentedString(emvData)).append("\n");
    sb.append("    entryMode: ").append(toIndentedString(entryMode)).append("\n");
    sb.append("    maskedAccountNumber: ").append(toIndentedString(maskedAccountNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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
    openapiFields.add("approval_code");
    openapiFields.add("brand");
    openapiFields.add("emv_data");
    openapiFields.add("entry_mode");
    openapiFields.add("masked_account_number");
    openapiFields.add("name");
    openapiFields.add("payment_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardPresentDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardPresentDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardPresentDetails is not found in the empty JSON string", CardPresentDetails.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardPresentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardPresentDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("approval_code") != null && !jsonObj.get("approval_code").isJsonNull()  && !jsonObj.get("approval_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approval_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approval_code").toString()));
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
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `emv_data`
     // if (jsonObj.getAsJsonObject("emv_data") != null) {
       //CardPresentDetailsEmvData.validateJsonObject(jsonObj.getAsJsonObject("emv_data"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("entry_mode") != null && !jsonObj.get("entry_mode").isJsonNull()  && !jsonObj.get("entry_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entry_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entry_mode").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("masked_account_number") != null && !jsonObj.get("masked_account_number").isJsonNull()  && !jsonObj.get("masked_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masked_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masked_account_number").toString()));
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
      if (jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonNull()  && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardPresentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardPresentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardPresentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardPresentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CardPresentDetails>() {
           @Override
           public void write(JsonWriter out, CardPresentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardPresentDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardPresentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardPresentDetails
  * @throws IOException if the JSON string is invalid with respect to CardPresentDetails
  */
  public static CardPresentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardPresentDetails.class);
  }

 /**
  * Convert an instance of CardPresentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

