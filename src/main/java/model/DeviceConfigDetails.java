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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Information used to configure how the &#x60;Device&#x60; handles transactions.
 */
@ApiModel(description = "Information used to configure how the `Device` handles transactions.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeviceConfigDetails {
  public static final String SERIALIZED_NAME_ALLOW_DEBIT = "allow_debit";
  @SerializedName(SERIALIZED_NAME_ALLOW_DEBIT)
  private Boolean allowDebit;

  public static final String SERIALIZED_NAME_BYPASS_DEVICE_ON_CAPTURE = "bypass_device_on_capture";
  @SerializedName(SERIALIZED_NAME_BYPASS_DEVICE_ON_CAPTURE)
  private Boolean bypassDeviceOnCapture;

  public static final String SERIALIZED_NAME_CHECK_FOR_DUPLICATE_TRANSACTIONS = "check_for_duplicate_transactions";
  @SerializedName(SERIALIZED_NAME_CHECK_FOR_DUPLICATE_TRANSACTIONS)
  private Boolean checkForDuplicateTransactions;

  public static final String SERIALIZED_NAME_PROMPT_AMOUNT_CONFIRMATION = "prompt_amount_confirmation";
  @SerializedName(SERIALIZED_NAME_PROMPT_AMOUNT_CONFIRMATION)
  private Boolean promptAmountConfirmation;

  public static final String SERIALIZED_NAME_PROMPT_MANUAL_ENTRY = "prompt_manual_entry";
  @SerializedName(SERIALIZED_NAME_PROMPT_MANUAL_ENTRY)
  private Boolean promptManualEntry;

  public static final String SERIALIZED_NAME_PROMPT_SIGNATURE = "prompt_signature";
  @SerializedName(SERIALIZED_NAME_PROMPT_SIGNATURE)
  private String promptSignature;

  public static final String SERIALIZED_NAME_SIGNATURE_THRESHOLD_AMOUNT = "signature_threshold_amount";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_THRESHOLD_AMOUNT)
  private Long signatureThresholdAmount;

  public DeviceConfigDetails() { 
  }

  public DeviceConfigDetails allowDebit(Boolean allowDebit) {
    
    this.allowDebit = allowDebit;
    return this;
  }

   /**
   * Allow transaction to be processed on Debit rails. If **false**, Debit card transactions will be processed on Credit rails.
   * @return allowDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow transaction to be processed on Debit rails. If **false**, Debit card transactions will be processed on Credit rails.")

  public Boolean getAllowDebit() {
    return allowDebit;
  }


  public void setAllowDebit(Boolean allowDebit) {
    this.allowDebit = allowDebit;
  }


  public DeviceConfigDetails bypassDeviceOnCapture(Boolean bypassDeviceOnCapture) {
    
    this.bypassDeviceOnCapture = bypassDeviceOnCapture;
    return this;
  }

   /**
   * Sets whether or not the device will be used to capture transactions. This field must be set to **true** (defaults to **false**).
   * @return bypassDeviceOnCapture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets whether or not the device will be used to capture transactions. This field must be set to **true** (defaults to **false**).")

  public Boolean getBypassDeviceOnCapture() {
    return bypassDeviceOnCapture;
  }


  public void setBypassDeviceOnCapture(Boolean bypassDeviceOnCapture) {
    this.bypassDeviceOnCapture = bypassDeviceOnCapture;
  }


  public DeviceConfigDetails checkForDuplicateTransactions(Boolean checkForDuplicateTransactions) {
    
    this.checkForDuplicateTransactions = checkForDuplicateTransactions;
    return this;
  }

   /**
   * Sets whether the &#x60;Device&#x60; will check for duplicate transactions.
   * @return checkForDuplicateTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets whether the `Device` will check for duplicate transactions.")

  public Boolean getCheckForDuplicateTransactions() {
    return checkForDuplicateTransactions;
  }


  public void setCheckForDuplicateTransactions(Boolean checkForDuplicateTransactions) {
    this.checkForDuplicateTransactions = checkForDuplicateTransactions;
  }


  public DeviceConfigDetails promptAmountConfirmation(Boolean promptAmountConfirmation) {
    
    this.promptAmountConfirmation = promptAmountConfirmation;
    return this;
  }

   /**
   * Sets if the card holder needs to confirm the amount they will pay (defaults to **true**).
   * @return promptAmountConfirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets if the card holder needs to confirm the amount they will pay (defaults to **true**).")

  public Boolean getPromptAmountConfirmation() {
    return promptAmountConfirmation;
  }


  public void setPromptAmountConfirmation(Boolean promptAmountConfirmation) {
    this.promptAmountConfirmation = promptAmountConfirmation;
  }


  public DeviceConfigDetails promptManualEntry(Boolean promptManualEntry) {
    
    this.promptManualEntry = promptManualEntry;
    return this;
  }

   /**
   * Sets if the device defaults to manual entry as the default card input method. (defaults to **false**).
   * @return promptManualEntry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets if the device defaults to manual entry as the default card input method. (defaults to **false**).")

  public Boolean getPromptManualEntry() {
    return promptManualEntry;
  }


  public void setPromptManualEntry(Boolean promptManualEntry) {
    this.promptManualEntry = promptManualEntry;
  }


  public DeviceConfigDetails promptSignature(String promptSignature) {
    
    this.promptSignature = promptSignature;
    return this;
  }

   /**
   * Sets if the device will prompt the card holder for a signature by default. Available values include: &lt;ul&gt;&lt;li&gt;&lt;strong&gt;ALWAYS&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;NEVER&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;AMOUNT&lt;/strong&gt;: Used in conjunction with &#x60;signature_threshold_amount&#x60; so when the threshold is reached the signature form appears on the device.
   * @return promptSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets if the device will prompt the card holder for a signature by default. Available values include: <ul><li><strong>ALWAYS</strong><li><strong>NEVER</strong><li><strong>AMOUNT</strong>: Used in conjunction with `signature_threshold_amount` so when the threshold is reached the signature form appears on the device.")

  public String getPromptSignature() {
    return promptSignature;
  }


  public void setPromptSignature(String promptSignature) {
    this.promptSignature = promptSignature;
  }


  public DeviceConfigDetails signatureThresholdAmount(Long signatureThresholdAmount) {
    
    this.signatureThresholdAmount = signatureThresholdAmount;
    return this;
  }

   /**
   * The threshold to prompt a signature when &#x60;prompt_signature&#x60; is set to **AMOUNT** (defaults to 0).
   * @return signatureThresholdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The threshold to prompt a signature when `prompt_signature` is set to **AMOUNT** (defaults to 0).")

  public Long getSignatureThresholdAmount() {
    return signatureThresholdAmount;
  }


  public void setSignatureThresholdAmount(Long signatureThresholdAmount) {
    this.signatureThresholdAmount = signatureThresholdAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceConfigDetails deviceConfigDetails = (DeviceConfigDetails) o;
    return Objects.equals(this.allowDebit, deviceConfigDetails.allowDebit) &&
        Objects.equals(this.bypassDeviceOnCapture, deviceConfigDetails.bypassDeviceOnCapture) &&
        Objects.equals(this.checkForDuplicateTransactions, deviceConfigDetails.checkForDuplicateTransactions) &&
        Objects.equals(this.promptAmountConfirmation, deviceConfigDetails.promptAmountConfirmation) &&
        Objects.equals(this.promptManualEntry, deviceConfigDetails.promptManualEntry) &&
        Objects.equals(this.promptSignature, deviceConfigDetails.promptSignature) &&
        Objects.equals(this.signatureThresholdAmount, deviceConfigDetails.signatureThresholdAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDebit, bypassDeviceOnCapture, checkForDuplicateTransactions, promptAmountConfirmation, promptManualEntry, promptSignature, signatureThresholdAmount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceConfigDetails {\n");
    sb.append("    allowDebit: ").append(toIndentedString(allowDebit)).append("\n");
    sb.append("    bypassDeviceOnCapture: ").append(toIndentedString(bypassDeviceOnCapture)).append("\n");
    sb.append("    checkForDuplicateTransactions: ").append(toIndentedString(checkForDuplicateTransactions)).append("\n");
    sb.append("    promptAmountConfirmation: ").append(toIndentedString(promptAmountConfirmation)).append("\n");
    sb.append("    promptManualEntry: ").append(toIndentedString(promptManualEntry)).append("\n");
    sb.append("    promptSignature: ").append(toIndentedString(promptSignature)).append("\n");
    sb.append("    signatureThresholdAmount: ").append(toIndentedString(signatureThresholdAmount)).append("\n");
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
    openapiFields.add("allow_debit");
    openapiFields.add("bypass_device_on_capture");
    openapiFields.add("check_for_duplicate_transactions");
    openapiFields.add("prompt_amount_confirmation");
    openapiFields.add("prompt_manual_entry");
    openapiFields.add("prompt_signature");
    openapiFields.add("signature_threshold_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceConfigDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeviceConfigDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceConfigDetails is not found in the empty JSON string", DeviceConfigDetails.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeviceConfigDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeviceConfigDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("prompt_signature") != null && !jsonObj.get("prompt_signature").isJsonNull()  && !jsonObj.get("prompt_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt_signature").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceConfigDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceConfigDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceConfigDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceConfigDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceConfigDetails>() {
           @Override
           public void write(JsonWriter out, DeviceConfigDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeviceConfigDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeviceConfigDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceConfigDetails
  * @throws IOException if the JSON string is invalid with respect to DeviceConfigDetails
  */
  public static DeviceConfigDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceConfigDetails.class);
  }

 /**
  * Convert an instance of DeviceConfigDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

