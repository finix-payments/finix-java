/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
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
import model.ApplicationLinksSelf;
import model.PaymentInstrumentTokenLinksVerifications;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-22T18:15:18.047423-05:00[America/Chicago]")
public class RootLinks {
  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private ApplicationLinksApplicationProfile applications;

  public static final String SERIALIZED_NAME_AUTHORIZATIONS = "authorizations";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATIONS)
  private ApplicationLinksApplicationProfile authorizations;

  public static final String SERIALIZED_NAME_IDENTITIES = "identities";
  @SerializedName(SERIALIZED_NAME_IDENTITIES)
  private ApplicationLinksApplicationProfile identities;

  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  private ApplicationLinksApplicationProfile merchants;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENTS = "payment_instruments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENTS)
  private ApplicationLinksApplicationProfile paymentInstruments;

  public static final String SERIALIZED_NAME_PROCESSOR_CALLBACKS = "processor_callbacks";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_CALLBACKS)
  private ApplicationLinksApplicationProfile processorCallbacks;

  public static final String SERIALIZED_NAME_PROCESSOR_CLIENTS = "processor_clients";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_CLIENTS)
  private ApplicationLinksApplicationProfile processorClients;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksSelf self;

  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private ApplicationLinksApplicationProfile transfers;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private ApplicationLinksApplicationProfile users;

  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private PaymentInstrumentTokenLinksVerifications verifications;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private ApplicationLinksApplicationProfile webhooks;

  public RootLinks() { 
  }

  public RootLinks applications(ApplicationLinksApplicationProfile applications) {
    
    this.applications = applications;
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getApplications() {
    return applications;
  }


  public void setApplications(ApplicationLinksApplicationProfile applications) {
    this.applications = applications;
  }


  public RootLinks authorizations(ApplicationLinksApplicationProfile authorizations) {
    
    this.authorizations = authorizations;
    return this;
  }

   /**
   * Get authorizations
   * @return authorizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getAuthorizations() {
    return authorizations;
  }


  public void setAuthorizations(ApplicationLinksApplicationProfile authorizations) {
    this.authorizations = authorizations;
  }


  public RootLinks identities(ApplicationLinksApplicationProfile identities) {
    
    this.identities = identities;
    return this;
  }

   /**
   * Get identities
   * @return identities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getIdentities() {
    return identities;
  }


  public void setIdentities(ApplicationLinksApplicationProfile identities) {
    this.identities = identities;
  }


  public RootLinks merchants(ApplicationLinksApplicationProfile merchants) {
    
    this.merchants = merchants;
    return this;
  }

   /**
   * Get merchants
   * @return merchants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getMerchants() {
    return merchants;
  }


  public void setMerchants(ApplicationLinksApplicationProfile merchants) {
    this.merchants = merchants;
  }


  public RootLinks paymentInstruments(ApplicationLinksApplicationProfile paymentInstruments) {
    
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


  public RootLinks processorCallbacks(ApplicationLinksApplicationProfile processorCallbacks) {
    
    this.processorCallbacks = processorCallbacks;
    return this;
  }

   /**
   * Get processorCallbacks
   * @return processorCallbacks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getProcessorCallbacks() {
    return processorCallbacks;
  }


  public void setProcessorCallbacks(ApplicationLinksApplicationProfile processorCallbacks) {
    this.processorCallbacks = processorCallbacks;
  }


  public RootLinks processorClients(ApplicationLinksApplicationProfile processorClients) {
    
    this.processorClients = processorClients;
    return this;
  }

   /**
   * Get processorClients
   * @return processorClients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getProcessorClients() {
    return processorClients;
  }


  public void setProcessorClients(ApplicationLinksApplicationProfile processorClients) {
    this.processorClients = processorClients;
  }


  public RootLinks self(ApplicationLinksSelf self) {
    
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


  public RootLinks transfers(ApplicationLinksApplicationProfile transfers) {
    
    this.transfers = transfers;
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getTransfers() {
    return transfers;
  }


  public void setTransfers(ApplicationLinksApplicationProfile transfers) {
    this.transfers = transfers;
  }


  public RootLinks users(ApplicationLinksApplicationProfile users) {
    
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getUsers() {
    return users;
  }


  public void setUsers(ApplicationLinksApplicationProfile users) {
    this.users = users;
  }


  public RootLinks verifications(PaymentInstrumentTokenLinksVerifications verifications) {
    
    this.verifications = verifications;
    return this;
  }

   /**
   * Get verifications
   * @return verifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInstrumentTokenLinksVerifications getVerifications() {
    return verifications;
  }


  public void setVerifications(PaymentInstrumentTokenLinksVerifications verifications) {
    this.verifications = verifications;
  }


  public RootLinks webhooks(ApplicationLinksApplicationProfile webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(ApplicationLinksApplicationProfile webhooks) {
    this.webhooks = webhooks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RootLinks rootLinks = (RootLinks) o;
    return Objects.equals(this.applications, rootLinks.applications) &&
        Objects.equals(this.authorizations, rootLinks.authorizations) &&
        Objects.equals(this.identities, rootLinks.identities) &&
        Objects.equals(this.merchants, rootLinks.merchants) &&
        Objects.equals(this.paymentInstruments, rootLinks.paymentInstruments) &&
        Objects.equals(this.processorCallbacks, rootLinks.processorCallbacks) &&
        Objects.equals(this.processorClients, rootLinks.processorClients) &&
        Objects.equals(this.self, rootLinks.self) &&
        Objects.equals(this.transfers, rootLinks.transfers) &&
        Objects.equals(this.users, rootLinks.users) &&
        Objects.equals(this.verifications, rootLinks.verifications) &&
        Objects.equals(this.webhooks, rootLinks.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, authorizations, identities, merchants, paymentInstruments, processorCallbacks, processorClients, self, transfers, users, verifications, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootLinks {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    processorCallbacks: ").append(toIndentedString(processorCallbacks)).append("\n");
    sb.append("    processorClients: ").append(toIndentedString(processorClients)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
    openapiFields.add("applications");
    openapiFields.add("authorizations");
    openapiFields.add("identities");
    openapiFields.add("merchants");
    openapiFields.add("payment_instruments");
    openapiFields.add("processor_callbacks");
    openapiFields.add("processor_clients");
    openapiFields.add("self");
    openapiFields.add("transfers");
    openapiFields.add("users");
    openapiFields.add("verifications");
    openapiFields.add("webhooks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RootLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RootLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RootLinks is not found in the empty JSON string", RootLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RootLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RootLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `applications`
     // if (jsonObj.getAsJsonObject("applications") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("applications"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `authorizations`
     // if (jsonObj.getAsJsonObject("authorizations") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("authorizations"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `identities`
     // if (jsonObj.getAsJsonObject("identities") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("identities"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `merchants`
     // if (jsonObj.getAsJsonObject("merchants") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("merchants"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `payment_instruments`
     // if (jsonObj.getAsJsonObject("payment_instruments") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("payment_instruments"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `processor_callbacks`
     // if (jsonObj.getAsJsonObject("processor_callbacks") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("processor_callbacks"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `processor_clients`
     // if (jsonObj.getAsJsonObject("processor_clients") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("processor_clients"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `self`
     // if (jsonObj.getAsJsonObject("self") != null) {
       //ApplicationLinksSelf.validateJsonObject(jsonObj.getAsJsonObject("self"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `transfers`
     // if (jsonObj.getAsJsonObject("transfers") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("transfers"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `users`
     // if (jsonObj.getAsJsonObject("users") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("users"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `verifications`
     // if (jsonObj.getAsJsonObject("verifications") != null) {
       //PaymentInstrumentTokenLinksVerifications.validateJsonObject(jsonObj.getAsJsonObject("verifications"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `webhooks`
     // if (jsonObj.getAsJsonObject("webhooks") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("webhooks"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RootLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RootLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RootLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RootLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<RootLinks>() {
           @Override
           public void write(JsonWriter out, RootLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RootLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RootLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RootLinks
  * @throws IOException if the JSON string is invalid with respect to RootLinks
  */
  public static RootLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RootLinks.class);
  }

 /**
  * Convert an instance of RootLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

