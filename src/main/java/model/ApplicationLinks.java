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
import model.ApplicationLinksApplicationProfile;
import model.ApplicationLinksSelf;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplicationLinks {
  public static final String SERIALIZED_NAME_APPLICATION_PROFILE = "application_profile";
  @SerializedName(SERIALIZED_NAME_APPLICATION_PROFILE)
  private ApplicationLinksApplicationProfile applicationProfile;

  public static final String SERIALIZED_NAME_AUTHORIZATIONS = "authorizations";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATIONS)
  private ApplicationLinksApplicationProfile authorizations;

  public static final String SERIALIZED_NAME_DISPUTES = "disputes";
  @SerializedName(SERIALIZED_NAME_DISPUTES)
  private ApplicationLinksApplicationProfile disputes;

  public static final String SERIALIZED_NAME_IDENTITIES = "identities";
  @SerializedName(SERIALIZED_NAME_IDENTITIES)
  private ApplicationLinksApplicationProfile identities;

  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  private ApplicationLinksApplicationProfile merchants;

  public static final String SERIALIZED_NAME_OWNER_IDENTITY = "owner_identity";
  @SerializedName(SERIALIZED_NAME_OWNER_IDENTITY)
  private ApplicationLinksApplicationProfile ownerIdentity;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENTS = "payment_instruments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENTS)
  private ApplicationLinksApplicationProfile paymentInstruments;

  public static final String SERIALIZED_NAME_PROCESSORS = "processors";
  @SerializedName(SERIALIZED_NAME_PROCESSORS)
  private ApplicationLinksApplicationProfile processors;

  public static final String SERIALIZED_NAME_REVERSALS = "reversals";
  @SerializedName(SERIALIZED_NAME_REVERSALS)
  private ApplicationLinksApplicationProfile reversals;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksSelf self;

  public static final String SERIALIZED_NAME_SETTLEMENTS = "settlements";
  @SerializedName(SERIALIZED_NAME_SETTLEMENTS)
  private ApplicationLinksApplicationProfile settlements;

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private ApplicationLinksApplicationProfile tokens;

  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private ApplicationLinksApplicationProfile transfers;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private ApplicationLinksApplicationProfile users;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private ApplicationLinksApplicationProfile webhooks;

  public ApplicationLinks() { 
  }

  public ApplicationLinks applicationProfile(ApplicationLinksApplicationProfile applicationProfile) {
    
    this.applicationProfile = applicationProfile;
    return this;
  }

   /**
   * Get applicationProfile
   * @return applicationProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getApplicationProfile() {
    return applicationProfile;
  }


  public void setApplicationProfile(ApplicationLinksApplicationProfile applicationProfile) {
    this.applicationProfile = applicationProfile;
  }


  public ApplicationLinks authorizations(ApplicationLinksApplicationProfile authorizations) {
    
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


  public ApplicationLinks disputes(ApplicationLinksApplicationProfile disputes) {
    
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


  public ApplicationLinks identities(ApplicationLinksApplicationProfile identities) {
    
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


  public ApplicationLinks merchants(ApplicationLinksApplicationProfile merchants) {
    
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


  public ApplicationLinks ownerIdentity(ApplicationLinksApplicationProfile ownerIdentity) {
    
    this.ownerIdentity = ownerIdentity;
    return this;
  }

   /**
   * Get ownerIdentity
   * @return ownerIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getOwnerIdentity() {
    return ownerIdentity;
  }


  public void setOwnerIdentity(ApplicationLinksApplicationProfile ownerIdentity) {
    this.ownerIdentity = ownerIdentity;
  }


  public ApplicationLinks paymentInstruments(ApplicationLinksApplicationProfile paymentInstruments) {
    
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


  public ApplicationLinks processors(ApplicationLinksApplicationProfile processors) {
    
    this.processors = processors;
    return this;
  }

   /**
   * Get processors
   * @return processors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getProcessors() {
    return processors;
  }


  public void setProcessors(ApplicationLinksApplicationProfile processors) {
    this.processors = processors;
  }


  public ApplicationLinks reversals(ApplicationLinksApplicationProfile reversals) {
    
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


  public ApplicationLinks self(ApplicationLinksSelf self) {
    
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


  public ApplicationLinks settlements(ApplicationLinksApplicationProfile settlements) {
    
    this.settlements = settlements;
    return this;
  }

   /**
   * Get settlements
   * @return settlements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getSettlements() {
    return settlements;
  }


  public void setSettlements(ApplicationLinksApplicationProfile settlements) {
    this.settlements = settlements;
  }


  public ApplicationLinks tokens(ApplicationLinksApplicationProfile tokens) {
    
    this.tokens = tokens;
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getTokens() {
    return tokens;
  }


  public void setTokens(ApplicationLinksApplicationProfile tokens) {
    this.tokens = tokens;
  }


  public ApplicationLinks transfers(ApplicationLinksApplicationProfile transfers) {
    
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


  public ApplicationLinks users(ApplicationLinksApplicationProfile users) {
    
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


  public ApplicationLinks webhooks(ApplicationLinksApplicationProfile webhooks) {
    
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
    ApplicationLinks applicationLinks = (ApplicationLinks) o;
    return Objects.equals(this.applicationProfile, applicationLinks.applicationProfile) &&
        Objects.equals(this.authorizations, applicationLinks.authorizations) &&
        Objects.equals(this.disputes, applicationLinks.disputes) &&
        Objects.equals(this.identities, applicationLinks.identities) &&
        Objects.equals(this.merchants, applicationLinks.merchants) &&
        Objects.equals(this.ownerIdentity, applicationLinks.ownerIdentity) &&
        Objects.equals(this.paymentInstruments, applicationLinks.paymentInstruments) &&
        Objects.equals(this.processors, applicationLinks.processors) &&
        Objects.equals(this.reversals, applicationLinks.reversals) &&
        Objects.equals(this.self, applicationLinks.self) &&
        Objects.equals(this.settlements, applicationLinks.settlements) &&
        Objects.equals(this.tokens, applicationLinks.tokens) &&
        Objects.equals(this.transfers, applicationLinks.transfers) &&
        Objects.equals(this.users, applicationLinks.users) &&
        Objects.equals(this.webhooks, applicationLinks.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationProfile, authorizations, disputes, identities, merchants, ownerIdentity, paymentInstruments, processors, reversals, self, settlements, tokens, transfers, users, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationLinks {\n");
    sb.append("    applicationProfile: ").append(toIndentedString(applicationProfile)).append("\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    disputes: ").append(toIndentedString(disputes)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    ownerIdentity: ").append(toIndentedString(ownerIdentity)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    reversals: ").append(toIndentedString(reversals)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    settlements: ").append(toIndentedString(settlements)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("application_profile");
    openapiFields.add("authorizations");
    openapiFields.add("disputes");
    openapiFields.add("identities");
    openapiFields.add("merchants");
    openapiFields.add("owner_identity");
    openapiFields.add("payment_instruments");
    openapiFields.add("processors");
    openapiFields.add("reversals");
    openapiFields.add("self");
    openapiFields.add("settlements");
    openapiFields.add("tokens");
    openapiFields.add("transfers");
    openapiFields.add("users");
    openapiFields.add("webhooks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplicationLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationLinks is not found in the empty JSON string", ApplicationLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `application_profile`
     // if (jsonObj.getAsJsonObject("application_profile") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("application_profile"));
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
      // validate the optional field `disputes`
     // if (jsonObj.getAsJsonObject("disputes") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("disputes"));
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
      // validate the optional field `owner_identity`
     // if (jsonObj.getAsJsonObject("owner_identity") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("owner_identity"));
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
      // validate the optional field `processors`
     // if (jsonObj.getAsJsonObject("processors") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("processors"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `reversals`
     // if (jsonObj.getAsJsonObject("reversals") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("reversals"));
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
      // validate the optional field `settlements`
     // if (jsonObj.getAsJsonObject("settlements") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("settlements"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `tokens`
     // if (jsonObj.getAsJsonObject("tokens") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("tokens"));
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
      // validate the optional field `webhooks`
     // if (jsonObj.getAsJsonObject("webhooks") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("webhooks"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationLinks>() {
           @Override
           public void write(JsonWriter out, ApplicationLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationLinks
  * @throws IOException if the JSON string is invalid with respect to ApplicationLinks
  */
  public static ApplicationLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationLinks.class);
  }

 /**
  * Convert an instance of ApplicationLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

