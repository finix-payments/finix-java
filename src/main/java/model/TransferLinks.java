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
import model.ApplicationLinksSelf;
import model.ApplicationProfileLinksApplication;
import model.AuthorizationLinksDevice;
import model.AuthorizationLinksMerchantIdentity;
import model.TransferLinksDestination;
import model.TransferLinksDisputedTransfer;
import model.TransferLinksDisputes;
import model.TransferLinksFeeProfile;
import model.TransferLinksFees;
import model.TransferLinksParent;
import model.TransferLinksPaymentInstruments;
import model.TransferLinksReversals;
import model.TransferLinksSource;

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
public class TransferLinks {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private ApplicationProfileLinksApplication application;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private TransferLinksDestination destination;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private AuthorizationLinksDevice device;

  public static final String SERIALIZED_NAME_DISPUTES = "disputes";
  @SerializedName(SERIALIZED_NAME_DISPUTES)
  private TransferLinksDisputes disputes;

  public static final String SERIALIZED_NAME_FEE_PROFILE = "fee_profile";
  @SerializedName(SERIALIZED_NAME_FEE_PROFILE)
  private TransferLinksFeeProfile feeProfile;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private TransferLinksFees fees;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private AuthorizationLinksMerchantIdentity merchantIdentity;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENTS = "payment_instruments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENTS)
  private TransferLinksPaymentInstruments paymentInstruments;

  public static final String SERIALIZED_NAME_DISPUTED_TRANSFER = "disputed_transfer";
  @SerializedName(SERIALIZED_NAME_DISPUTED_TRANSFER)
  private TransferLinksDisputedTransfer disputedTransfer;

  public static final String SERIALIZED_NAME_REVERSALS = "reversals";
  @SerializedName(SERIALIZED_NAME_REVERSALS)
  private TransferLinksReversals reversals;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksSelf self;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private TransferLinksParent parent;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private TransferLinksSource source;

  public TransferLinks() { 
  }

  public TransferLinks application(ApplicationProfileLinksApplication application) {
    
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


  public TransferLinks destination(TransferLinksDestination destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksDestination getDestination() {
    return destination;
  }


  public void setDestination(TransferLinksDestination destination) {
    this.destination = destination;
  }


  public TransferLinks device(AuthorizationLinksDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizationLinksDevice getDevice() {
    return device;
  }


  public void setDevice(AuthorizationLinksDevice device) {
    this.device = device;
  }


  public TransferLinks disputes(TransferLinksDisputes disputes) {
    
    this.disputes = disputes;
    return this;
  }

   /**
   * Get disputes
   * @return disputes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksDisputes getDisputes() {
    return disputes;
  }


  public void setDisputes(TransferLinksDisputes disputes) {
    this.disputes = disputes;
  }


  public TransferLinks feeProfile(TransferLinksFeeProfile feeProfile) {
    
    this.feeProfile = feeProfile;
    return this;
  }

   /**
   * Get feeProfile
   * @return feeProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksFeeProfile getFeeProfile() {
    return feeProfile;
  }


  public void setFeeProfile(TransferLinksFeeProfile feeProfile) {
    this.feeProfile = feeProfile;
  }


  public TransferLinks fees(TransferLinksFees fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksFees getFees() {
    return fees;
  }


  public void setFees(TransferLinksFees fees) {
    this.fees = fees;
  }


  public TransferLinks merchantIdentity(AuthorizationLinksMerchantIdentity merchantIdentity) {
    
    this.merchantIdentity = merchantIdentity;
    return this;
  }

   /**
   * Get merchantIdentity
   * @return merchantIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizationLinksMerchantIdentity getMerchantIdentity() {
    return merchantIdentity;
  }


  public void setMerchantIdentity(AuthorizationLinksMerchantIdentity merchantIdentity) {
    this.merchantIdentity = merchantIdentity;
  }


  public TransferLinks paymentInstruments(TransferLinksPaymentInstruments paymentInstruments) {
    
    this.paymentInstruments = paymentInstruments;
    return this;
  }

   /**
   * Get paymentInstruments
   * @return paymentInstruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksPaymentInstruments getPaymentInstruments() {
    return paymentInstruments;
  }


  public void setPaymentInstruments(TransferLinksPaymentInstruments paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  public TransferLinks disputedTransfer(TransferLinksDisputedTransfer disputedTransfer) {
    
    this.disputedTransfer = disputedTransfer;
    return this;
  }

   /**
   * Get disputedTransfer
   * @return disputedTransfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksDisputedTransfer getDisputedTransfer() {
    return disputedTransfer;
  }


  public void setDisputedTransfer(TransferLinksDisputedTransfer disputedTransfer) {
    this.disputedTransfer = disputedTransfer;
  }


  public TransferLinks reversals(TransferLinksReversals reversals) {
    
    this.reversals = reversals;
    return this;
  }

   /**
   * Get reversals
   * @return reversals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksReversals getReversals() {
    return reversals;
  }


  public void setReversals(TransferLinksReversals reversals) {
    this.reversals = reversals;
  }


  public TransferLinks self(ApplicationLinksSelf self) {
    
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


  public TransferLinks parent(TransferLinksParent parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksParent getParent() {
    return parent;
  }


  public void setParent(TransferLinksParent parent) {
    this.parent = parent;
  }


  public TransferLinks source(TransferLinksSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferLinksSource getSource() {
    return source;
  }


  public void setSource(TransferLinksSource source) {
    this.source = source;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public TransferLinks putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
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
        Objects.equals(this.disputedTransfer, transferLinks.disputedTransfer) &&
        Objects.equals(this.reversals, transferLinks.reversals) &&
        Objects.equals(this.self, transferLinks.self) &&
        Objects.equals(this.parent, transferLinks.parent) &&
        Objects.equals(this.source, transferLinks.source)&&
        Objects.equals(this.additionalProperties, transferLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, destination, device, disputes, feeProfile, fees, merchantIdentity, paymentInstruments, disputedTransfer, reversals, self, parent, source, additionalProperties);
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
    sb.append("    disputedTransfer: ").append(toIndentedString(disputedTransfer)).append("\n");
    sb.append("    reversals: ").append(toIndentedString(reversals)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("disputed_transfer");
    openapiFields.add("reversals");
    openapiFields.add("self");
    openapiFields.add("parent");
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
     /*       */
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
      // validate the optional field `destination`
     // if (jsonObj.getAsJsonObject("destination") != null) {
       //TransferLinksDestination.validateJsonObject(jsonObj.getAsJsonObject("destination"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `device`
     // if (jsonObj.getAsJsonObject("device") != null) {
       //AuthorizationLinksDevice.validateJsonObject(jsonObj.getAsJsonObject("device"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `disputes`
     // if (jsonObj.getAsJsonObject("disputes") != null) {
       //TransferLinksDisputes.validateJsonObject(jsonObj.getAsJsonObject("disputes"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `fee_profile`
     // if (jsonObj.getAsJsonObject("fee_profile") != null) {
       //TransferLinksFeeProfile.validateJsonObject(jsonObj.getAsJsonObject("fee_profile"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `fees`
     // if (jsonObj.getAsJsonObject("fees") != null) {
       //TransferLinksFees.validateJsonObject(jsonObj.getAsJsonObject("fees"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `merchant_identity`
     // if (jsonObj.getAsJsonObject("merchant_identity") != null) {
       //AuthorizationLinksMerchantIdentity.validateJsonObject(jsonObj.getAsJsonObject("merchant_identity"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `payment_instruments`
     // if (jsonObj.getAsJsonObject("payment_instruments") != null) {
       //TransferLinksPaymentInstruments.validateJsonObject(jsonObj.getAsJsonObject("payment_instruments"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `disputed_transfer`
     // if (jsonObj.getAsJsonObject("disputed_transfer") != null) {
       //TransferLinksDisputedTransfer.validateJsonObject(jsonObj.getAsJsonObject("disputed_transfer"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `reversals`
     // if (jsonObj.getAsJsonObject("reversals") != null) {
       //TransferLinksReversals.validateJsonObject(jsonObj.getAsJsonObject("reversals"));
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
      // validate the optional field `parent`
     // if (jsonObj.getAsJsonObject("parent") != null) {
       //TransferLinksParent.validateJsonObject(jsonObj.getAsJsonObject("parent"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `source`
     // if (jsonObj.getAsJsonObject("source") != null) {
       //TransferLinksSource.validateJsonObject(jsonObj.getAsJsonObject("source"));
     // }

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
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransferLinks instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
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

