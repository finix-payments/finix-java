/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2018-01-01
 * Contact: support@finixpayments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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
import model.ApplicationLinksApplicationProfile;

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
 * TransferLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-27T11:05:36.428255-05:00[America/Chicago]")
public class TransferLinks {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private ApplicationLinksApplicationProfile application;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private ApplicationLinksApplicationProfile destination;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private ApplicationLinksApplicationProfile device;

  public static final String SERIALIZED_NAME_DISPUTES = "disputes";
  @SerializedName(SERIALIZED_NAME_DISPUTES)
  private ApplicationLinksApplicationProfile disputes;

  public static final String SERIALIZED_NAME_FEE_PROFILE = "fee_profile";
  @SerializedName(SERIALIZED_NAME_FEE_PROFILE)
  private ApplicationLinksApplicationProfile feeProfile;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private ApplicationLinksApplicationProfile fees;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private ApplicationLinksApplicationProfile merchantIdentity;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENTS = "payment_instruments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENTS)
  private ApplicationLinksApplicationProfile paymentInstruments;

  public static final String SERIALIZED_NAME_REVERSALS = "reversals";
  @SerializedName(SERIALIZED_NAME_REVERSALS)
  private ApplicationLinksApplicationProfile reversals;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksApplicationProfile self;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private ApplicationLinksApplicationProfile source;

  public TransferLinks() { 
  }

  public TransferLinks application(ApplicationLinksApplicationProfile application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getApplication() {
    return application;
  }


  public void setApplication(ApplicationLinksApplicationProfile application) {
    this.application = application;
  }


  public TransferLinks destination(ApplicationLinksApplicationProfile destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getDestination() {
    return destination;
  }


  public void setDestination(ApplicationLinksApplicationProfile destination) {
    this.destination = destination;
  }


  public TransferLinks device(ApplicationLinksApplicationProfile device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getDevice() {
    return device;
  }


  public void setDevice(ApplicationLinksApplicationProfile device) {
    this.device = device;
  }


  public TransferLinks disputes(ApplicationLinksApplicationProfile disputes) {
    
    this.disputes = disputes;
    return this;
  }

   /**
   * Get disputes
   * @return disputes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getDisputes() {
    return disputes;
  }


  public void setDisputes(ApplicationLinksApplicationProfile disputes) {
    this.disputes = disputes;
  }


  public TransferLinks feeProfile(ApplicationLinksApplicationProfile feeProfile) {
    
    this.feeProfile = feeProfile;
    return this;
  }

   /**
   * Get feeProfile
   * @return feeProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getFeeProfile() {
    return feeProfile;
  }


  public void setFeeProfile(ApplicationLinksApplicationProfile feeProfile) {
    this.feeProfile = feeProfile;
  }


  public TransferLinks fees(ApplicationLinksApplicationProfile fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getFees() {
    return fees;
  }


  public void setFees(ApplicationLinksApplicationProfile fees) {
    this.fees = fees;
  }


  public TransferLinks merchantIdentity(ApplicationLinksApplicationProfile merchantIdentity) {
    
    this.merchantIdentity = merchantIdentity;
    return this;
  }

   /**
   * Get merchantIdentity
   * @return merchantIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getMerchantIdentity() {
    return merchantIdentity;
  }


  public void setMerchantIdentity(ApplicationLinksApplicationProfile merchantIdentity) {
    this.merchantIdentity = merchantIdentity;
  }


  public TransferLinks paymentInstruments(ApplicationLinksApplicationProfile paymentInstruments) {
    
    this.paymentInstruments = paymentInstruments;
    return this;
  }

   /**
   * Get paymentInstruments
   * @return paymentInstruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getPaymentInstruments() {
    return paymentInstruments;
  }


  public void setPaymentInstruments(ApplicationLinksApplicationProfile paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  public TransferLinks reversals(ApplicationLinksApplicationProfile reversals) {
    
    this.reversals = reversals;
    return this;
  }

   /**
   * Get reversals
   * @return reversals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getReversals() {
    return reversals;
  }


  public void setReversals(ApplicationLinksApplicationProfile reversals) {
    this.reversals = reversals;
  }


  public TransferLinks self(ApplicationLinksApplicationProfile self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getSelf() {
    return self;
  }


  public void setSelf(ApplicationLinksApplicationProfile self) {
    this.self = self;
  }


  public TransferLinks source(ApplicationLinksApplicationProfile source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getSource() {
    return source;
  }


  public void setSource(ApplicationLinksApplicationProfile source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferLinks transferLinks = (TransferLinks) o;
    return Objects.equals(this.application, transferLinks.application) &&
        Objects.equals(this.destination, transferLinks.destination) &&
        Objects.equals(this.device, transferLinks.device) &&
        Objects.equals(this.disputes, transferLinks.disputes) &&
        Objects.equals(this.feeProfile, transferLinks.feeProfile) &&
        Objects.equals(this.fees, transferLinks.fees) &&
        Objects.equals(this.merchantIdentity, transferLinks.merchantIdentity) &&
        Objects.equals(this.paymentInstruments, transferLinks.paymentInstruments) &&
        Objects.equals(this.reversals, transferLinks.reversals) &&
        Objects.equals(this.self, transferLinks.self) &&
        Objects.equals(this.source, transferLinks.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, destination, device, disputes, feeProfile, fees, merchantIdentity, paymentInstruments, reversals, self, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferLinks {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    disputes: ").append(toIndentedString(disputes)).append("\n");
    sb.append("    feeProfile: ").append(toIndentedString(feeProfile)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    merchantIdentity: ").append(toIndentedString(merchantIdentity)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    reversals: ").append(toIndentedString(reversals)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("destination");
    openapiFields.add("device");
    openapiFields.add("disputes");
    openapiFields.add("fee_profile");
    openapiFields.add("fees");
    openapiFields.add("merchant_identity");
    openapiFields.add("payment_instruments");
    openapiFields.add("reversals");
    openapiFields.add("self");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferLinks is not found in the empty JSON string", TransferLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      // validate the optional field `application`
      if (jsonObj.getAsJsonObject("application") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("application"));
      }
      // validate the optional field `destination`
      if (jsonObj.getAsJsonObject("destination") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("destination"));
      }
      // validate the optional field `device`
      if (jsonObj.getAsJsonObject("device") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("device"));
      }
      // validate the optional field `disputes`
      if (jsonObj.getAsJsonObject("disputes") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("disputes"));
      }
      // validate the optional field `fee_profile`
      if (jsonObj.getAsJsonObject("fee_profile") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("fee_profile"));
      }
      // validate the optional field `fees`
      if (jsonObj.getAsJsonObject("fees") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("fees"));
      }
      // validate the optional field `merchant_identity`
      if (jsonObj.getAsJsonObject("merchant_identity") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("merchant_identity"));
      }
      // validate the optional field `payment_instruments`
      if (jsonObj.getAsJsonObject("payment_instruments") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("payment_instruments"));
      }
      // validate the optional field `reversals`
      if (jsonObj.getAsJsonObject("reversals") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("reversals"));
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
      // validate the optional field `source`
      if (jsonObj.getAsJsonObject("source") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("source"));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferLinks>() {
           @Override
           public void write(JsonWriter out, TransferLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferLinks
  * @throws IOException if the JSON string is invalid with respect to TransferLinks
  */
  public static TransferLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferLinks.class);
  }

 /**
  * Convert an instance of TransferLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

