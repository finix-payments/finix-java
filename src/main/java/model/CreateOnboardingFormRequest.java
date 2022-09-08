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
import model.CreateOnboardingFormRequestMerchantProcessorsInner;
import model.CreateOnboardingFormRequestOnboardingData;
import model.CreateOnboardingFormRequestOnboardingLinkDetails;

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
 * CreateOnboardingFormRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateOnboardingFormRequest {
  public static final String SERIALIZED_NAME_ONBOARDING_DATA = "onboarding_data";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_DATA)
  private CreateOnboardingFormRequestOnboardingData onboardingData;

  public static final String SERIALIZED_NAME_MERCHANT_PROCESSORS = "merchant_processors";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROCESSORS)
  private List<CreateOnboardingFormRequestMerchantProcessorsInner> merchantProcessors = null;

  public static final String SERIALIZED_NAME_ONBOARDING_LINK_DETAILS = "onboarding_link_details";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_LINK_DETAILS)
  private CreateOnboardingFormRequestOnboardingLinkDetails onboardingLinkDetails;

  public CreateOnboardingFormRequest() { 
  }

  public CreateOnboardingFormRequest onboardingData(CreateOnboardingFormRequestOnboardingData onboardingData) {
    
    this.onboardingData = onboardingData;
    return this;
  }

   /**
   * Get onboardingData
   * @return onboardingData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateOnboardingFormRequestOnboardingData getOnboardingData() {
    return onboardingData;
  }


  public void setOnboardingData(CreateOnboardingFormRequestOnboardingData onboardingData) {
    this.onboardingData = onboardingData;
  }


  public CreateOnboardingFormRequest merchantProcessors(List<CreateOnboardingFormRequestMerchantProcessorsInner> merchantProcessors) {
    
    this.merchantProcessors = merchantProcessors;
    return this;
  }

  public CreateOnboardingFormRequest addMerchantProcessorsItem(CreateOnboardingFormRequestMerchantProcessorsInner merchantProcessorsItem) {
    if (this.merchantProcessors == null) {
      this.merchantProcessors = new ArrayList<>();
    }
    this.merchantProcessors.add(merchantProcessorsItem);
    return this;
  }

   /**
   * An array of objects with the processors and gateways users will be onboarded to.
   * @return merchantProcessors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects with the processors and gateways users will be onboarded to.")

  public List<CreateOnboardingFormRequestMerchantProcessorsInner> getMerchantProcessors() {
    return merchantProcessors;
  }


  public void setMerchantProcessors(List<CreateOnboardingFormRequestMerchantProcessorsInner> merchantProcessors) {
    this.merchantProcessors = merchantProcessors;
  }


  public CreateOnboardingFormRequest onboardingLinkDetails(CreateOnboardingFormRequestOnboardingLinkDetails onboardingLinkDetails) {
    
    this.onboardingLinkDetails = onboardingLinkDetails;
    return this;
  }

   /**
   * Get onboardingLinkDetails
   * @return onboardingLinkDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateOnboardingFormRequestOnboardingLinkDetails getOnboardingLinkDetails() {
    return onboardingLinkDetails;
  }


  public void setOnboardingLinkDetails(CreateOnboardingFormRequestOnboardingLinkDetails onboardingLinkDetails) {
    this.onboardingLinkDetails = onboardingLinkDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnboardingFormRequest createOnboardingFormRequest = (CreateOnboardingFormRequest) o;
    return Objects.equals(this.onboardingData, createOnboardingFormRequest.onboardingData) &&
        Objects.equals(this.merchantProcessors, createOnboardingFormRequest.merchantProcessors) &&
        Objects.equals(this.onboardingLinkDetails, createOnboardingFormRequest.onboardingLinkDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onboardingData, merchantProcessors, onboardingLinkDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnboardingFormRequest {\n");
    sb.append("    onboardingData: ").append(toIndentedString(onboardingData)).append("\n");
    sb.append("    merchantProcessors: ").append(toIndentedString(merchantProcessors)).append("\n");
    sb.append("    onboardingLinkDetails: ").append(toIndentedString(onboardingLinkDetails)).append("\n");
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
    openapiFields.add("onboarding_data");
    openapiFields.add("merchant_processors");
    openapiFields.add("onboarding_link_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateOnboardingFormRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateOnboardingFormRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOnboardingFormRequest is not found in the empty JSON string", CreateOnboardingFormRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateOnboardingFormRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOnboardingFormRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `onboarding_data`
     // if (jsonObj.getAsJsonObject("onboarding_data") != null) {
       //CreateOnboardingFormRequestOnboardingData.validateJsonObject(jsonObj.getAsJsonObject("onboarding_data"));
     // }

      JsonArray jsonArraymerchantProcessors = jsonObj.getAsJsonArray("merchant_processors");
      if (jsonArraymerchantProcessors != null) {
        // ensure the json data is an array
        if (!jsonObj.get("merchant_processors").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `merchant_processors` to be an array in the JSON string but got `%s`", jsonObj.get("merchant_processors").toString()));
        }

        // validate the optional field `merchant_processors` (array)
        for (int i = 0; i < jsonArraymerchantProcessors.size(); i++) {
          CreateOnboardingFormRequestMerchantProcessorsInner.validateJsonObject(jsonArraymerchantProcessors.get(i).getAsJsonObject());
        }
          ;
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `onboarding_link_details`
     // if (jsonObj.getAsJsonObject("onboarding_link_details") != null) {
       //CreateOnboardingFormRequestOnboardingLinkDetails.validateJsonObject(jsonObj.getAsJsonObject("onboarding_link_details"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOnboardingFormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOnboardingFormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOnboardingFormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOnboardingFormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOnboardingFormRequest>() {
           @Override
           public void write(JsonWriter out, CreateOnboardingFormRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOnboardingFormRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOnboardingFormRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOnboardingFormRequest
  * @throws IOException if the JSON string is invalid with respect to CreateOnboardingFormRequest
  */
  public static CreateOnboardingFormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOnboardingFormRequest.class);
  }

 /**
  * Convert an instance of CreateOnboardingFormRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

