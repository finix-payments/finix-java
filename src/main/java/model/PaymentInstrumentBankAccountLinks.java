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
import model.ApplicationLinksSelf;
import model.MerchantLinksApplication;
import model.MerchantLinksIdentity;
import model.MerchantLinksVerifications;
import model.PaymentInstrumentBankAccountLinksAuthorizations;
import model.PaymentInstrumentBankAccountLinksTransfers;

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
 * For your convenience, every response includes several URLs which link to resources relevant to the request. You can use these &#x60;_links&#x60; to make your follow-up requests and quickly access relevant IDs.
 */
@ApiModel(description = "For your convenience, every response includes several URLs which link to resources relevant to the request. You can use these `_links` to make your follow-up requests and quickly access relevant IDs.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-14T11:20:42.244239-05:00[America/Chicago]")
public class PaymentInstrumentBankAccountLinks {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private MerchantLinksApplication application;

  public static final String SERIALIZED_NAME_AUTHORIZATIONS = "authorizations";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATIONS)
  private PaymentInstrumentBankAccountLinksAuthorizations authorizations;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private MerchantLinksIdentity identity;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksSelf self;

  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private PaymentInstrumentBankAccountLinksTransfers transfers;

  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private MerchantLinksVerifications verifications;

  public PaymentInstrumentBankAccountLinks() { 
  }

  public PaymentInstrumentBankAccountLinks application(MerchantLinksApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinksApplication getApplication() {
    return application;
  }


  public void setApplication(MerchantLinksApplication application) {
    this.application = application;
  }


  public PaymentInstrumentBankAccountLinks authorizations(PaymentInstrumentBankAccountLinksAuthorizations authorizations) {
    
    this.authorizations = authorizations;
    return this;
  }

   /**
   * Get authorizations
   * @return authorizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInstrumentBankAccountLinksAuthorizations getAuthorizations() {
    return authorizations;
  }


  public void setAuthorizations(PaymentInstrumentBankAccountLinksAuthorizations authorizations) {
    this.authorizations = authorizations;
  }


  public PaymentInstrumentBankAccountLinks identity(MerchantLinksIdentity identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinksIdentity getIdentity() {
    return identity;
  }


  public void setIdentity(MerchantLinksIdentity identity) {
    this.identity = identity;
  }


  public PaymentInstrumentBankAccountLinks self(ApplicationLinksSelf self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksSelf getSelf() {
    return self;
  }


  public void setSelf(ApplicationLinksSelf self) {
    this.self = self;
  }


  public PaymentInstrumentBankAccountLinks transfers(PaymentInstrumentBankAccountLinksTransfers transfers) {
    
    this.transfers = transfers;
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInstrumentBankAccountLinksTransfers getTransfers() {
    return transfers;
  }


  public void setTransfers(PaymentInstrumentBankAccountLinksTransfers transfers) {
    this.transfers = transfers;
  }


  public PaymentInstrumentBankAccountLinks verifications(MerchantLinksVerifications verifications) {
    
    this.verifications = verifications;
    return this;
  }

   /**
   * Get verifications
   * @return verifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinksVerifications getVerifications() {
    return verifications;
  }


  public void setVerifications(MerchantLinksVerifications verifications) {
    this.verifications = verifications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentBankAccountLinks paymentInstrumentBankAccountLinks = (PaymentInstrumentBankAccountLinks) o;
    return Objects.equals(this.application, paymentInstrumentBankAccountLinks.application) &&
        Objects.equals(this.authorizations, paymentInstrumentBankAccountLinks.authorizations) &&
        Objects.equals(this.identity, paymentInstrumentBankAccountLinks.identity) &&
        Objects.equals(this.self, paymentInstrumentBankAccountLinks.self) &&
        Objects.equals(this.transfers, paymentInstrumentBankAccountLinks.transfers) &&
        Objects.equals(this.verifications, paymentInstrumentBankAccountLinks.verifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, authorizations, identity, self, transfers, verifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentBankAccountLinks {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
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
    openapiFields.add("authorizations");
    openapiFields.add("identity");
    openapiFields.add("self");
    openapiFields.add("transfers");
    openapiFields.add("verifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrumentBankAccountLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrumentBankAccountLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrumentBankAccountLinks is not found in the empty JSON string", PaymentInstrumentBankAccountLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrumentBankAccountLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrumentBankAccountLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      // validate the optional field `application`
     // if (jsonObj.getAsJsonObject("application") != null) {
       //MerchantLinksApplication.validateJsonObject(jsonObj.getAsJsonObject("application"));
     // }
      // validate the optional field `authorizations`
     // if (jsonObj.getAsJsonObject("authorizations") != null) {
       //PaymentInstrumentBankAccountLinksAuthorizations.validateJsonObject(jsonObj.getAsJsonObject("authorizations"));
     // }
      // validate the optional field `identity`
     // if (jsonObj.getAsJsonObject("identity") != null) {
       //MerchantLinksIdentity.validateJsonObject(jsonObj.getAsJsonObject("identity"));
     // }
      // validate the optional field `self`
     // if (jsonObj.getAsJsonObject("self") != null) {
       //ApplicationLinksSelf.validateJsonObject(jsonObj.getAsJsonObject("self"));
     // }
      // validate the optional field `transfers`
     // if (jsonObj.getAsJsonObject("transfers") != null) {
       //PaymentInstrumentBankAccountLinksTransfers.validateJsonObject(jsonObj.getAsJsonObject("transfers"));
     // }
      // validate the optional field `verifications`
     // if (jsonObj.getAsJsonObject("verifications") != null) {
       //MerchantLinksVerifications.validateJsonObject(jsonObj.getAsJsonObject("verifications"));
     // }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrumentBankAccountLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrumentBankAccountLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrumentBankAccountLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentBankAccountLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrumentBankAccountLinks>() {
           @Override
           public void write(JsonWriter out, PaymentInstrumentBankAccountLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrumentBankAccountLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrumentBankAccountLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrumentBankAccountLinks
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentBankAccountLinks
  */
  public static PaymentInstrumentBankAccountLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrumentBankAccountLinks.class);
  }

 /**
  * Convert an instance of PaymentInstrumentBankAccountLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
