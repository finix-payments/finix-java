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
 * PaymentInstrumentUpdatesListEmbeddedLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-27T11:05:36.428255-05:00[America/Chicago]")
public class PaymentInstrumentUpdatesListEmbeddedLinks {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private ApplicationLinksApplicationProfile application;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT = "payment_instrument";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT)
  private ApplicationLinksApplicationProfile paymentInstrument;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksApplicationProfile self;

  public PaymentInstrumentUpdatesListEmbeddedLinks() { 
  }

  public PaymentInstrumentUpdatesListEmbeddedLinks application(ApplicationLinksApplicationProfile application) {
    
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


  public PaymentInstrumentUpdatesListEmbeddedLinks paymentInstrument(ApplicationLinksApplicationProfile paymentInstrument) {
    
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApplicationLinksApplicationProfile getPaymentInstrument() {
    return paymentInstrument;
  }


  public void setPaymentInstrument(ApplicationLinksApplicationProfile paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }


  public PaymentInstrumentUpdatesListEmbeddedLinks self(ApplicationLinksApplicationProfile self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApplicationLinksApplicationProfile getSelf() {
    return self;
  }


  public void setSelf(ApplicationLinksApplicationProfile self) {
    this.self = self;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentUpdatesListEmbeddedLinks paymentInstrumentUpdatesListEmbeddedLinks = (PaymentInstrumentUpdatesListEmbeddedLinks) o;
    return Objects.equals(this.application, paymentInstrumentUpdatesListEmbeddedLinks.application) &&
        Objects.equals(this.paymentInstrument, paymentInstrumentUpdatesListEmbeddedLinks.paymentInstrument) &&
        Objects.equals(this.self, paymentInstrumentUpdatesListEmbeddedLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, paymentInstrument, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentUpdatesListEmbeddedLinks {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
    openapiFields.add("payment_instrument");
    openapiFields.add("self");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_instrument");
    openapiRequiredFields.add("self");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrumentUpdatesListEmbeddedLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrumentUpdatesListEmbeddedLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrumentUpdatesListEmbeddedLinks is not found in the empty JSON string", PaymentInstrumentUpdatesListEmbeddedLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrumentUpdatesListEmbeddedLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrumentUpdatesListEmbeddedLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : PaymentInstrumentUpdatesListEmbeddedLinks.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      // validate the optional field `application`
      if (jsonObj.getAsJsonObject("application") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("application"));
      }
      // validate the optional field `payment_instrument`
      if (jsonObj.getAsJsonObject("payment_instrument") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("payment_instrument"));
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrumentUpdatesListEmbeddedLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrumentUpdatesListEmbeddedLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrumentUpdatesListEmbeddedLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentUpdatesListEmbeddedLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrumentUpdatesListEmbeddedLinks>() {
           @Override
           public void write(JsonWriter out, PaymentInstrumentUpdatesListEmbeddedLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrumentUpdatesListEmbeddedLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrumentUpdatesListEmbeddedLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrumentUpdatesListEmbeddedLinks
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentUpdatesListEmbeddedLinks
  */
  public static PaymentInstrumentUpdatesListEmbeddedLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrumentUpdatesListEmbeddedLinks.class);
  }

 /**
  * Convert an instance of PaymentInstrumentUpdatesListEmbeddedLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

