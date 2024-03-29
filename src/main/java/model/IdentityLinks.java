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
import model.IdentityLinksApplication;
import model.IdentityLinksAssociatedIdentities;
import model.IdentityLinksAuthorizations;
import model.IdentityLinksDisputes;
import model.IdentityLinksMerchants;
import model.IdentityLinksPaymentInstruments;
import model.IdentityLinksSelf;
import model.IdentityLinksSettlements;
import model.IdentityLinksTransfers;
import model.IdentityLinksVerifications;

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
public class IdentityLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private IdentityLinksSelf self;

  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private IdentityLinksVerifications verifications;

  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  private IdentityLinksMerchants merchants;

  public static final String SERIALIZED_NAME_SETTLEMENTS = "settlements";
  @SerializedName(SERIALIZED_NAME_SETTLEMENTS)
  private IdentityLinksSettlements settlements;

  public static final String SERIALIZED_NAME_AUTHORIZATIONS = "authorizations";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATIONS)
  private IdentityLinksAuthorizations authorizations;

  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private IdentityLinksTransfers transfers;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENTS = "payment_instruments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENTS)
  private IdentityLinksPaymentInstruments paymentInstruments;

  public static final String SERIALIZED_NAME_ASSOCIATED_IDENTITIES = "associated_identities";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_IDENTITIES)
  private IdentityLinksAssociatedIdentities associatedIdentities;

  public static final String SERIALIZED_NAME_DISPUTES = "disputes";
  @SerializedName(SERIALIZED_NAME_DISPUTES)
  private IdentityLinksDisputes disputes;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private IdentityLinksApplication application;

  public IdentityLinks() { 
  }

  public IdentityLinks self(IdentityLinksSelf self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksSelf getSelf() {
    return self;
  }


  public void setSelf(IdentityLinksSelf self) {
    this.self = self;
  }


  public IdentityLinks verifications(IdentityLinksVerifications verifications) {
    
    this.verifications = verifications;
    return this;
  }

   /**
   * Get verifications
   * @return verifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksVerifications getVerifications() {
    return verifications;
  }


  public void setVerifications(IdentityLinksVerifications verifications) {
    this.verifications = verifications;
  }


  public IdentityLinks merchants(IdentityLinksMerchants merchants) {
    
    this.merchants = merchants;
    return this;
  }

   /**
   * Get merchants
   * @return merchants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksMerchants getMerchants() {
    return merchants;
  }


  public void setMerchants(IdentityLinksMerchants merchants) {
    this.merchants = merchants;
  }


  public IdentityLinks settlements(IdentityLinksSettlements settlements) {
    
    this.settlements = settlements;
    return this;
  }

   /**
   * Get settlements
   * @return settlements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksSettlements getSettlements() {
    return settlements;
  }


  public void setSettlements(IdentityLinksSettlements settlements) {
    this.settlements = settlements;
  }


  public IdentityLinks authorizations(IdentityLinksAuthorizations authorizations) {
    
    this.authorizations = authorizations;
    return this;
  }

   /**
   * Get authorizations
   * @return authorizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksAuthorizations getAuthorizations() {
    return authorizations;
  }


  public void setAuthorizations(IdentityLinksAuthorizations authorizations) {
    this.authorizations = authorizations;
  }


  public IdentityLinks transfers(IdentityLinksTransfers transfers) {
    
    this.transfers = transfers;
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksTransfers getTransfers() {
    return transfers;
  }


  public void setTransfers(IdentityLinksTransfers transfers) {
    this.transfers = transfers;
  }


  public IdentityLinks paymentInstruments(IdentityLinksPaymentInstruments paymentInstruments) {
    
    this.paymentInstruments = paymentInstruments;
    return this;
  }

   /**
   * Get paymentInstruments
   * @return paymentInstruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksPaymentInstruments getPaymentInstruments() {
    return paymentInstruments;
  }


  public void setPaymentInstruments(IdentityLinksPaymentInstruments paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  public IdentityLinks associatedIdentities(IdentityLinksAssociatedIdentities associatedIdentities) {
    
    this.associatedIdentities = associatedIdentities;
    return this;
  }

   /**
   * Get associatedIdentities
   * @return associatedIdentities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksAssociatedIdentities getAssociatedIdentities() {
    return associatedIdentities;
  }


  public void setAssociatedIdentities(IdentityLinksAssociatedIdentities associatedIdentities) {
    this.associatedIdentities = associatedIdentities;
  }


  public IdentityLinks disputes(IdentityLinksDisputes disputes) {
    
    this.disputes = disputes;
    return this;
  }

   /**
   * Get disputes
   * @return disputes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksDisputes getDisputes() {
    return disputes;
  }


  public void setDisputes(IdentityLinksDisputes disputes) {
    this.disputes = disputes;
  }


  public IdentityLinks application(IdentityLinksApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksApplication getApplication() {
    return application;
  }


  public void setApplication(IdentityLinksApplication application) {
    this.application = application;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityLinks identityLinks = (IdentityLinks) o;
    return Objects.equals(this.self, identityLinks.self) &&
        Objects.equals(this.verifications, identityLinks.verifications) &&
        Objects.equals(this.merchants, identityLinks.merchants) &&
        Objects.equals(this.settlements, identityLinks.settlements) &&
        Objects.equals(this.authorizations, identityLinks.authorizations) &&
        Objects.equals(this.transfers, identityLinks.transfers) &&
        Objects.equals(this.paymentInstruments, identityLinks.paymentInstruments) &&
        Objects.equals(this.associatedIdentities, identityLinks.associatedIdentities) &&
        Objects.equals(this.disputes, identityLinks.disputes) &&
        Objects.equals(this.application, identityLinks.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, verifications, merchants, settlements, authorizations, transfers, paymentInstruments, associatedIdentities, disputes, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    settlements: ").append(toIndentedString(settlements)).append("\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    associatedIdentities: ").append(toIndentedString(associatedIdentities)).append("\n");
    sb.append("    disputes: ").append(toIndentedString(disputes)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("verifications");
    openapiFields.add("merchants");
    openapiFields.add("settlements");
    openapiFields.add("authorizations");
    openapiFields.add("transfers");
    openapiFields.add("payment_instruments");
    openapiFields.add("associated_identities");
    openapiFields.add("disputes");
    openapiFields.add("application");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentityLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityLinks is not found in the empty JSON string", IdentityLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `self`
     // if (jsonObj.getAsJsonObject("self") != null) {
       //IdentityLinksSelf.validateJsonObject(jsonObj.getAsJsonObject("self"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `verifications`
     // if (jsonObj.getAsJsonObject("verifications") != null) {
       //IdentityLinksVerifications.validateJsonObject(jsonObj.getAsJsonObject("verifications"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `merchants`
     // if (jsonObj.getAsJsonObject("merchants") != null) {
       //IdentityLinksMerchants.validateJsonObject(jsonObj.getAsJsonObject("merchants"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `settlements`
     // if (jsonObj.getAsJsonObject("settlements") != null) {
       //IdentityLinksSettlements.validateJsonObject(jsonObj.getAsJsonObject("settlements"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `authorizations`
     // if (jsonObj.getAsJsonObject("authorizations") != null) {
       //IdentityLinksAuthorizations.validateJsonObject(jsonObj.getAsJsonObject("authorizations"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `transfers`
     // if (jsonObj.getAsJsonObject("transfers") != null) {
       //IdentityLinksTransfers.validateJsonObject(jsonObj.getAsJsonObject("transfers"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `payment_instruments`
     // if (jsonObj.getAsJsonObject("payment_instruments") != null) {
       //IdentityLinksPaymentInstruments.validateJsonObject(jsonObj.getAsJsonObject("payment_instruments"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `associated_identities`
     // if (jsonObj.getAsJsonObject("associated_identities") != null) {
       //IdentityLinksAssociatedIdentities.validateJsonObject(jsonObj.getAsJsonObject("associated_identities"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `disputes`
     // if (jsonObj.getAsJsonObject("disputes") != null) {
       //IdentityLinksDisputes.validateJsonObject(jsonObj.getAsJsonObject("disputes"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `application`
     // if (jsonObj.getAsJsonObject("application") != null) {
       //IdentityLinksApplication.validateJsonObject(jsonObj.getAsJsonObject("application"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityLinks>() {
           @Override
           public void write(JsonWriter out, IdentityLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityLinks
  * @throws IOException if the JSON string is invalid with respect to IdentityLinks
  */
  public static IdentityLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityLinks.class);
  }

 /**
  * Convert an instance of IdentityLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

