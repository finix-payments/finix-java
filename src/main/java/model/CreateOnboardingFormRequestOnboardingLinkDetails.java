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
 * The information of the initial onboarding link. This is only provided when creating an &#x60;onboarding_form&#x60;.
 */
@ApiModel(description = "The information of the initial onboarding link. This is only provided when creating an `onboarding_form`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateOnboardingFormRequestOnboardingLinkDetails {
  public static final String SERIALIZED_NAME_RETURN_URL = "return_url";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public static final String SERIALIZED_NAME_EXPIRED_SESSION_URL = "expired_session_url";
  @SerializedName(SERIALIZED_NAME_EXPIRED_SESSION_URL)
  private String expiredSessionUrl;

  public static final String SERIALIZED_NAME_TERMS_OF_SERVICE_URL = "terms_of_service_url";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_SERVICE_URL)
  private String termsOfServiceUrl;

  public static final String SERIALIZED_NAME_FEE_DETAILS_URL = "fee_details_url";
  @SerializedName(SERIALIZED_NAME_FEE_DETAILS_URL)
  private String feeDetailsUrl;

  public static final String SERIALIZED_NAME_EXPIRATION_IN_MINUTES = "expiration_in_minutes";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_IN_MINUTES)
  private String expirationInMinutes;

  public CreateOnboardingFormRequestOnboardingLinkDetails() { 
  }

  public CreateOnboardingFormRequestOnboardingLinkDetails returnUrl(String returnUrl) {
    
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The URL users get sent to after completing the onboarding flow.
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL users get sent to after completing the onboarding flow.")

  public String getReturnUrl() {
    return returnUrl;
  }


  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  public CreateOnboardingFormRequestOnboardingLinkDetails expiredSessionUrl(String expiredSessionUrl) {
    
    this.expiredSessionUrl = expiredSessionUrl;
    return this;
  }

   /**
   * The URL users get sent to if the bearer token expires.
   * @return expiredSessionUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL users get sent to if the bearer token expires.")

  public String getExpiredSessionUrl() {
    return expiredSessionUrl;
  }


  public void setExpiredSessionUrl(String expiredSessionUrl) {
    this.expiredSessionUrl = expiredSessionUrl;
  }


  public CreateOnboardingFormRequestOnboardingLinkDetails termsOfServiceUrl(String termsOfServiceUrl) {
    
    this.termsOfServiceUrl = termsOfServiceUrl;
    return this;
  }

   /**
   * Your Terms of Service URL. The URL is provided to users for consent along with [Finix&#39;s Terms of Service](https://finix-hosted-content.s3.amazonaws.com/flex/v2/finix-terms-of-service.html).
   * @return termsOfServiceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Terms of Service URL. The URL is provided to users for consent along with [Finix's Terms of Service](https://finix-hosted-content.s3.amazonaws.com/flex/v2/finix-terms-of-service.html).")

  public String getTermsOfServiceUrl() {
    return termsOfServiceUrl;
  }


  public void setTermsOfServiceUrl(String termsOfServiceUrl) {
    this.termsOfServiceUrl = termsOfServiceUrl;
  }


  public CreateOnboardingFormRequestOnboardingLinkDetails feeDetailsUrl(String feeDetailsUrl) {
    
    this.feeDetailsUrl = feeDetailsUrl;
    return this;
  }

   /**
   * The URL of the page where you display the fees related to processing payments (for more info, see [Displaying Processing Fees](/guides/onboarding/onboarding-form/#displaying-processing-fees)).
   * @return feeDetailsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the page where you display the fees related to processing payments (for more info, see [Displaying Processing Fees](/guides/onboarding/onboarding-form/#displaying-processing-fees)).")

  public String getFeeDetailsUrl() {
    return feeDetailsUrl;
  }


  public void setFeeDetailsUrl(String feeDetailsUrl) {
    this.feeDetailsUrl = feeDetailsUrl;
  }


  public CreateOnboardingFormRequestOnboardingLinkDetails expirationInMinutes(String expirationInMinutes) {
    
    this.expirationInMinutes = expirationInMinutes;
    return this;
  }

   /**
   * How long (in minutes) the link should be valid for. Defaults to 60 minutes.
   * @return expirationInMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How long (in minutes) the link should be valid for. Defaults to 60 minutes.")

  public String getExpirationInMinutes() {
    return expirationInMinutes;
  }


  public void setExpirationInMinutes(String expirationInMinutes) {
    this.expirationInMinutes = expirationInMinutes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnboardingFormRequestOnboardingLinkDetails createOnboardingFormRequestOnboardingLinkDetails = (CreateOnboardingFormRequestOnboardingLinkDetails) o;
    return Objects.equals(this.returnUrl, createOnboardingFormRequestOnboardingLinkDetails.returnUrl) &&
        Objects.equals(this.expiredSessionUrl, createOnboardingFormRequestOnboardingLinkDetails.expiredSessionUrl) &&
        Objects.equals(this.termsOfServiceUrl, createOnboardingFormRequestOnboardingLinkDetails.termsOfServiceUrl) &&
        Objects.equals(this.feeDetailsUrl, createOnboardingFormRequestOnboardingLinkDetails.feeDetailsUrl) &&
        Objects.equals(this.expirationInMinutes, createOnboardingFormRequestOnboardingLinkDetails.expirationInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl, expiredSessionUrl, termsOfServiceUrl, feeDetailsUrl, expirationInMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnboardingFormRequestOnboardingLinkDetails {\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    expiredSessionUrl: ").append(toIndentedString(expiredSessionUrl)).append("\n");
    sb.append("    termsOfServiceUrl: ").append(toIndentedString(termsOfServiceUrl)).append("\n");
    sb.append("    feeDetailsUrl: ").append(toIndentedString(feeDetailsUrl)).append("\n");
    sb.append("    expirationInMinutes: ").append(toIndentedString(expirationInMinutes)).append("\n");
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
    openapiFields.add("return_url");
    openapiFields.add("expired_session_url");
    openapiFields.add("terms_of_service_url");
    openapiFields.add("fee_details_url");
    openapiFields.add("expiration_in_minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateOnboardingFormRequestOnboardingLinkDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateOnboardingFormRequestOnboardingLinkDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOnboardingFormRequestOnboardingLinkDetails is not found in the empty JSON string", CreateOnboardingFormRequestOnboardingLinkDetails.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateOnboardingFormRequestOnboardingLinkDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOnboardingFormRequestOnboardingLinkDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("return_url") != null && !jsonObj.get("return_url").isJsonNull()  && !jsonObj.get("return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_url").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("expired_session_url") != null && !jsonObj.get("expired_session_url").isJsonNull()  && !jsonObj.get("expired_session_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expired_session_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expired_session_url").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("terms_of_service_url") != null && !jsonObj.get("terms_of_service_url").isJsonNull()  && !jsonObj.get("terms_of_service_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terms_of_service_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terms_of_service_url").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("fee_details_url") != null && !jsonObj.get("fee_details_url").isJsonNull()  && !jsonObj.get("fee_details_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_details_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_details_url").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("expiration_in_minutes") != null && !jsonObj.get("expiration_in_minutes").isJsonNull()  && !jsonObj.get("expiration_in_minutes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_in_minutes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_in_minutes").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOnboardingFormRequestOnboardingLinkDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOnboardingFormRequestOnboardingLinkDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOnboardingFormRequestOnboardingLinkDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOnboardingFormRequestOnboardingLinkDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOnboardingFormRequestOnboardingLinkDetails>() {
           @Override
           public void write(JsonWriter out, CreateOnboardingFormRequestOnboardingLinkDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOnboardingFormRequestOnboardingLinkDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOnboardingFormRequestOnboardingLinkDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOnboardingFormRequestOnboardingLinkDetails
  * @throws IOException if the JSON string is invalid with respect to CreateOnboardingFormRequestOnboardingLinkDetails
  */
  public static CreateOnboardingFormRequestOnboardingLinkDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOnboardingFormRequestOnboardingLinkDetails.class);
  }

 /**
  * Convert an instance of CreateOnboardingFormRequestOnboardingLinkDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

