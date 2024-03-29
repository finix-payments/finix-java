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
 * CreateOnboardingFormLinkRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateOnboardingFormLinkRequest {
  public static final String SERIALIZED_NAME_TERMS_OF_SERVICE_URL = "terms_of_service_url";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_SERVICE_URL)
  private String termsOfServiceUrl;

  public static final String SERIALIZED_NAME_RETURN_URL = "return_url";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public static final String SERIALIZED_NAME_FEE_DETAILS_URL = "fee_details_url";
  @SerializedName(SERIALIZED_NAME_FEE_DETAILS_URL)
  private String feeDetailsUrl;

  public static final String SERIALIZED_NAME_EXPIRED_SESSION_URL = "expired_session_url";
  @SerializedName(SERIALIZED_NAME_EXPIRED_SESSION_URL)
  private String expiredSessionUrl;

  public static final String SERIALIZED_NAME_EXPIRATION_IN_MINUTES = "expiration_in_minutes";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_IN_MINUTES)
  private Long expirationInMinutes;

  public CreateOnboardingFormLinkRequest() { 
  }

  public CreateOnboardingFormLinkRequest termsOfServiceUrl(String termsOfServiceUrl) {
    
    this.termsOfServiceUrl = termsOfServiceUrl;
    return this;
  }

   /**
   * Your Terms of Service URL. The URL is provided to users for consent along with Finix&#39;s Terms of Service.
   * @return termsOfServiceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Terms of Service URL. The URL is provided to users for consent along with Finix's Terms of Service.")

  public String getTermsOfServiceUrl() {
    return termsOfServiceUrl;
  }


  public void setTermsOfServiceUrl(String termsOfServiceUrl) {
    this.termsOfServiceUrl = termsOfServiceUrl;
  }


  public CreateOnboardingFormLinkRequest returnUrl(String returnUrl) {
    
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


  public CreateOnboardingFormLinkRequest feeDetailsUrl(String feeDetailsUrl) {
    
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


  public CreateOnboardingFormLinkRequest expiredSessionUrl(String expiredSessionUrl) {
    
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


  public CreateOnboardingFormLinkRequest expirationInMinutes(Long expirationInMinutes) {
    
    this.expirationInMinutes = expirationInMinutes;
    return this;
  }

   /**
   * How long (in minutes) the link is valid for.
   * @return expirationInMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How long (in minutes) the link is valid for.")

  public Long getExpirationInMinutes() {
    return expirationInMinutes;
  }


  public void setExpirationInMinutes(Long expirationInMinutes) {
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
    CreateOnboardingFormLinkRequest createOnboardingFormLinkRequest = (CreateOnboardingFormLinkRequest) o;
    return Objects.equals(this.termsOfServiceUrl, createOnboardingFormLinkRequest.termsOfServiceUrl) &&
        Objects.equals(this.returnUrl, createOnboardingFormLinkRequest.returnUrl) &&
        Objects.equals(this.feeDetailsUrl, createOnboardingFormLinkRequest.feeDetailsUrl) &&
        Objects.equals(this.expiredSessionUrl, createOnboardingFormLinkRequest.expiredSessionUrl) &&
        Objects.equals(this.expirationInMinutes, createOnboardingFormLinkRequest.expirationInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termsOfServiceUrl, returnUrl, feeDetailsUrl, expiredSessionUrl, expirationInMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnboardingFormLinkRequest {\n");
    sb.append("    termsOfServiceUrl: ").append(toIndentedString(termsOfServiceUrl)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    feeDetailsUrl: ").append(toIndentedString(feeDetailsUrl)).append("\n");
    sb.append("    expiredSessionUrl: ").append(toIndentedString(expiredSessionUrl)).append("\n");
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
    openapiFields.add("terms_of_service_url");
    openapiFields.add("return_url");
    openapiFields.add("fee_details_url");
    openapiFields.add("expired_session_url");
    openapiFields.add("expiration_in_minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateOnboardingFormLinkRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateOnboardingFormLinkRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOnboardingFormLinkRequest is not found in the empty JSON string", CreateOnboardingFormLinkRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateOnboardingFormLinkRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOnboardingFormLinkRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
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
      if (jsonObj.get("return_url") != null && !jsonObj.get("return_url").isJsonNull()  && !jsonObj.get("return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_url").toString()));
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
      if (jsonObj.get("expired_session_url") != null && !jsonObj.get("expired_session_url").isJsonNull()  && !jsonObj.get("expired_session_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expired_session_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expired_session_url").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOnboardingFormLinkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOnboardingFormLinkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOnboardingFormLinkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOnboardingFormLinkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOnboardingFormLinkRequest>() {
           @Override
           public void write(JsonWriter out, CreateOnboardingFormLinkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOnboardingFormLinkRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOnboardingFormLinkRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOnboardingFormLinkRequest
  * @throws IOException if the JSON string is invalid with respect to CreateOnboardingFormLinkRequest
  */
  public static CreateOnboardingFormLinkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOnboardingFormLinkRequest.class);
  }

 /**
  * Convert an instance of CreateOnboardingFormLinkRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

