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
 * ApplePaySessionRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplePaySessionRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private String merchantIdentity;

  public static final String SERIALIZED_NAME_VALIDATION_URL = "validation_url";
  @SerializedName(SERIALIZED_NAME_VALIDATION_URL)
  private String validationUrl;

  public ApplePaySessionRequest() { 
  }

  public ApplePaySessionRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * This will be the merchant name shown to users when making a purchase via Apple Pay.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This will be the merchant name shown to users when making a purchase via Apple Pay.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ApplePaySessionRequest domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The domain (or website) where the buyer is initiating the payment.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domain (or website) where the buyer is initiating the payment.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public ApplePaySessionRequest merchantIdentity(String merchantIdentity) {
    
    this.merchantIdentity = merchantIdentity;
    return this;
  }

   /**
   * The &#x60;merchant_identity_id&#x60; used when registering the business with Apple Pay through our registration API.
   * @return merchantIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `merchant_identity_id` used when registering the business with Apple Pay through our registration API.")

  public String getMerchantIdentity() {
    return merchantIdentity;
  }


  public void setMerchantIdentity(String merchantIdentity) {
    this.merchantIdentity = merchantIdentity;
  }


  public ApplePaySessionRequest validationUrl(String validationUrl) {
    
    this.validationUrl = validationUrl;
    return this;
  }

   /**
   * A unique validation URL that will be provided by the Apple SDK front-end for every payment.
   * @return validationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique validation URL that will be provided by the Apple SDK front-end for every payment.")

  public String getValidationUrl() {
    return validationUrl;
  }


  public void setValidationUrl(String validationUrl) {
    this.validationUrl = validationUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePaySessionRequest applePaySessionRequest = (ApplePaySessionRequest) o;
    return Objects.equals(this.displayName, applePaySessionRequest.displayName) &&
        Objects.equals(this.domain, applePaySessionRequest.domain) &&
        Objects.equals(this.merchantIdentity, applePaySessionRequest.merchantIdentity) &&
        Objects.equals(this.validationUrl, applePaySessionRequest.validationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, domain, merchantIdentity, validationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePaySessionRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    merchantIdentity: ").append(toIndentedString(merchantIdentity)).append("\n");
    sb.append("    validationUrl: ").append(toIndentedString(validationUrl)).append("\n");
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
    openapiFields.add("display_name");
    openapiFields.add("domain");
    openapiFields.add("merchant_identity");
    openapiFields.add("validation_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplePaySessionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplePaySessionRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplePaySessionRequest is not found in the empty JSON string", ApplePaySessionRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplePaySessionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplePaySessionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()  && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()  && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_identity") != null && !jsonObj.get("merchant_identity").isJsonNull()  && !jsonObj.get("merchant_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_identity").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("validation_url") != null && !jsonObj.get("validation_url").isJsonNull()  && !jsonObj.get("validation_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation_url").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplePaySessionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplePaySessionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplePaySessionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplePaySessionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplePaySessionRequest>() {
           @Override
           public void write(JsonWriter out, ApplePaySessionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplePaySessionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplePaySessionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplePaySessionRequest
  * @throws IOException if the JSON string is invalid with respect to ApplePaySessionRequest
  */
  public static ApplePaySessionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplePaySessionRequest.class);
  }

 /**
  * Convert an instance of ApplePaySessionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

