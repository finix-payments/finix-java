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
 * The 3D secure information for an authorization.
 */
@ApiModel(description = "The 3D secure information for an authorization.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTransferRequest3dSecureAuthentication {
  public static final String SERIALIZED_NAME_CARDHOLDER_AUTHENTICATION = "cardholder_authentication";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_AUTHENTICATION)
  private String cardholderAuthentication;

  public static final String SERIALIZED_NAME_CARDHOLDER_IP_ADDRESS = "cardholder_ip_address";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_IP_ADDRESS)
  private String cardholderIpAddress;

  public static final String SERIALIZED_NAME_ELECTRONIC_COMMERCE_INDICATOR = "electronic_commerce_indicator";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_COMMERCE_INDICATOR)
  private String electronicCommerceIndicator;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public CreateTransferRequest3dSecureAuthentication() { 
  }

  public CreateTransferRequest3dSecureAuthentication cardholderAuthentication(String cardholderAuthentication) {
    
    this.cardholderAuthentication = cardholderAuthentication;
    return this;
  }

   /**
   * Provides evidence that the cardholder authentication occurred or that the merchant attempted authentication. This is unique for each authentication transaction.
   * @return cardholderAuthentication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provides evidence that the cardholder authentication occurred or that the merchant attempted authentication. This is unique for each authentication transaction.")

  public String getCardholderAuthentication() {
    return cardholderAuthentication;
  }


  public void setCardholderAuthentication(String cardholderAuthentication) {
    this.cardholderAuthentication = cardholderAuthentication;
  }


  public CreateTransferRequest3dSecureAuthentication cardholderIpAddress(String cardholderIpAddress) {
    
    this.cardholderIpAddress = cardholderIpAddress;
    return this;
  }

   /**
   * Only required for American Express cards. Format is nnn.nnn.nnn.nnn
   * @return cardholderIpAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only required for American Express cards. Format is nnn.nnn.nnn.nnn")

  public String getCardholderIpAddress() {
    return cardholderIpAddress;
  }


  public void setCardholderIpAddress(String cardholderIpAddress) {
    this.cardholderIpAddress = cardholderIpAddress;
  }


  public CreateTransferRequest3dSecureAuthentication electronicCommerceIndicator(String electronicCommerceIndicator) {
    
    this.electronicCommerceIndicator = electronicCommerceIndicator;
    return this;
  }

   /**
   * AUTHENTICATED: Approved by 3D Secure Vendor; ATTEMPTED: Issuer or cardholder does not support 3D Secure
   * @return electronicCommerceIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AUTHENTICATED: Approved by 3D Secure Vendor; ATTEMPTED: Issuer or cardholder does not support 3D Secure")

  public String getElectronicCommerceIndicator() {
    return electronicCommerceIndicator;
  }


  public void setElectronicCommerceIndicator(String electronicCommerceIndicator) {
    this.electronicCommerceIndicator = electronicCommerceIndicator;
  }


  public CreateTransferRequest3dSecureAuthentication transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Only valid for Visa transactions
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only valid for Visa transactions")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransferRequest3dSecureAuthentication createTransferRequest3dSecureAuthentication = (CreateTransferRequest3dSecureAuthentication) o;
    return Objects.equals(this.cardholderAuthentication, createTransferRequest3dSecureAuthentication.cardholderAuthentication) &&
        Objects.equals(this.cardholderIpAddress, createTransferRequest3dSecureAuthentication.cardholderIpAddress) &&
        Objects.equals(this.electronicCommerceIndicator, createTransferRequest3dSecureAuthentication.electronicCommerceIndicator) &&
        Objects.equals(this.transactionId, createTransferRequest3dSecureAuthentication.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardholderAuthentication, cardholderIpAddress, electronicCommerceIndicator, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransferRequest3dSecureAuthentication {\n");
    sb.append("    cardholderAuthentication: ").append(toIndentedString(cardholderAuthentication)).append("\n");
    sb.append("    cardholderIpAddress: ").append(toIndentedString(cardholderIpAddress)).append("\n");
    sb.append("    electronicCommerceIndicator: ").append(toIndentedString(electronicCommerceIndicator)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
    openapiFields.add("cardholder_authentication");
    openapiFields.add("cardholder_ip_address");
    openapiFields.add("electronic_commerce_indicator");
    openapiFields.add("transaction_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateTransferRequest3dSecureAuthentication
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateTransferRequest3dSecureAuthentication.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTransferRequest3dSecureAuthentication is not found in the empty JSON string", CreateTransferRequest3dSecureAuthentication.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateTransferRequest3dSecureAuthentication.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTransferRequest3dSecureAuthentication` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("cardholder_authentication") != null && !jsonObj.get("cardholder_authentication").isJsonNull()  && !jsonObj.get("cardholder_authentication").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardholder_authentication` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardholder_authentication").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("cardholder_ip_address") != null && !jsonObj.get("cardholder_ip_address").isJsonNull()  && !jsonObj.get("cardholder_ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardholder_ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardholder_ip_address").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("electronic_commerce_indicator") != null && !jsonObj.get("electronic_commerce_indicator").isJsonNull()  && !jsonObj.get("electronic_commerce_indicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `electronic_commerce_indicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("electronic_commerce_indicator").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("transaction_id") != null && !jsonObj.get("transaction_id").isJsonNull()  && !jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTransferRequest3dSecureAuthentication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTransferRequest3dSecureAuthentication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTransferRequest3dSecureAuthentication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTransferRequest3dSecureAuthentication.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTransferRequest3dSecureAuthentication>() {
           @Override
           public void write(JsonWriter out, CreateTransferRequest3dSecureAuthentication value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTransferRequest3dSecureAuthentication read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTransferRequest3dSecureAuthentication given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTransferRequest3dSecureAuthentication
  * @throws IOException if the JSON string is invalid with respect to CreateTransferRequest3dSecureAuthentication
  */
  public static CreateTransferRequest3dSecureAuthentication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTransferRequest3dSecureAuthentication.class);
  }

 /**
  * Convert an instance of CreateTransferRequest3dSecureAuthentication to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

