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
import model.ApplicationProfileLinksApplication;

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
public class SettlementLinks {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private ApplicationProfileLinksApplication application;

  public static final String SERIALIZED_NAME_CREDITS = "credits";
  @SerializedName(SERIALIZED_NAME_CREDITS)
  private ApplicationLinksApplicationProfile credits;

  public static final String SERIALIZED_NAME_DEBITS = "debits";
  @SerializedName(SERIALIZED_NAME_DEBITS)
  private ApplicationLinksApplicationProfile debits;

  public static final String SERIALIZED_NAME_DISPUTES = "disputes";
  @SerializedName(SERIALIZED_NAME_DISPUTES)
  private ApplicationLinksApplicationProfile disputes;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private ApplicationLinksApplicationProfile fees;

  public static final String SERIALIZED_NAME_FUNDING_TRANSFERS = "funding_transfers";
  @SerializedName(SERIALIZED_NAME_FUNDING_TRANSFERS)
  private ApplicationLinksApplicationProfile fundingTransfers;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private ApplicationLinksApplicationProfile identity;

  public static final String SERIALIZED_NAME_REVERSALS = "reversals";
  @SerializedName(SERIALIZED_NAME_REVERSALS)
  private ApplicationLinksApplicationProfile reversals;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksSelf self;

  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private ApplicationLinksApplicationProfile transfers;

  public SettlementLinks() { 
  }

  public SettlementLinks application(ApplicationProfileLinksApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationProfileLinksApplication getApplication() {
    return application;
  }


  public void setApplication(ApplicationProfileLinksApplication application) {
    this.application = application;
  }


  public SettlementLinks credits(ApplicationLinksApplicationProfile credits) {
    
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getCredits() {
    return credits;
  }


  public void setCredits(ApplicationLinksApplicationProfile credits) {
    this.credits = credits;
  }


  public SettlementLinks debits(ApplicationLinksApplicationProfile debits) {
    
    this.debits = debits;
    return this;
  }

   /**
   * Get debits
   * @return debits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getDebits() {
    return debits;
  }


  public void setDebits(ApplicationLinksApplicationProfile debits) {
    this.debits = debits;
  }


  public SettlementLinks disputes(ApplicationLinksApplicationProfile disputes) {
    
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


  public SettlementLinks fees(ApplicationLinksApplicationProfile fees) {
    
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


  public SettlementLinks fundingTransfers(ApplicationLinksApplicationProfile fundingTransfers) {
    
    this.fundingTransfers = fundingTransfers;
    return this;
  }

   /**
   * Get fundingTransfers
   * @return fundingTransfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getFundingTransfers() {
    return fundingTransfers;
  }


  public void setFundingTransfers(ApplicationLinksApplicationProfile fundingTransfers) {
    this.fundingTransfers = fundingTransfers;
  }


  public SettlementLinks identity(ApplicationLinksApplicationProfile identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getIdentity() {
    return identity;
  }


  public void setIdentity(ApplicationLinksApplicationProfile identity) {
    this.identity = identity;
  }


  public SettlementLinks reversals(ApplicationLinksApplicationProfile reversals) {
    
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


  public SettlementLinks self(ApplicationLinksSelf self) {
    
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


  public SettlementLinks transfers(ApplicationLinksApplicationProfile transfers) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementLinks settlementLinks = (SettlementLinks) o;
    return Objects.equals(this.application, settlementLinks.application) &&
        Objects.equals(this.credits, settlementLinks.credits) &&
        Objects.equals(this.debits, settlementLinks.debits) &&
        Objects.equals(this.disputes, settlementLinks.disputes) &&
        Objects.equals(this.fees, settlementLinks.fees) &&
        Objects.equals(this.fundingTransfers, settlementLinks.fundingTransfers) &&
        Objects.equals(this.identity, settlementLinks.identity) &&
        Objects.equals(this.reversals, settlementLinks.reversals) &&
        Objects.equals(this.self, settlementLinks.self) &&
        Objects.equals(this.transfers, settlementLinks.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, credits, debits, disputes, fees, fundingTransfers, identity, reversals, self, transfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementLinks {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    debits: ").append(toIndentedString(debits)).append("\n");
    sb.append("    disputes: ").append(toIndentedString(disputes)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    fundingTransfers: ").append(toIndentedString(fundingTransfers)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    reversals: ").append(toIndentedString(reversals)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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
    openapiFields.add("credits");
    openapiFields.add("debits");
    openapiFields.add("disputes");
    openapiFields.add("fees");
    openapiFields.add("funding_transfers");
    openapiFields.add("identity");
    openapiFields.add("reversals");
    openapiFields.add("self");
    openapiFields.add("transfers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SettlementLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SettlementLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettlementLinks is not found in the empty JSON string", SettlementLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SettlementLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettlementLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `application`
     // if (jsonObj.getAsJsonObject("application") != null) {
       //ApplicationProfileLinksApplication.validateJsonObject(jsonObj.getAsJsonObject("application"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `credits`
     // if (jsonObj.getAsJsonObject("credits") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("credits"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `debits`
     // if (jsonObj.getAsJsonObject("debits") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("debits"));
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
      // validate the optional field `fees`
     // if (jsonObj.getAsJsonObject("fees") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("fees"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `funding_transfers`
     // if (jsonObj.getAsJsonObject("funding_transfers") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("funding_transfers"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `identity`
     // if (jsonObj.getAsJsonObject("identity") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("identity"));
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
      // validate the optional field `transfers`
     // if (jsonObj.getAsJsonObject("transfers") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("transfers"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementLinks>() {
           @Override
           public void write(JsonWriter out, SettlementLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementLinks
  * @throws IOException if the JSON string is invalid with respect to SettlementLinks
  */
  public static SettlementLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementLinks.class);
  }

 /**
  * Convert an instance of SettlementLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

