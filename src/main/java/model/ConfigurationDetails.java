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
import model.ConfigurationDetailsCashbackOptions;
import model.ConfigurationDetailsTipOptions;

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
 * Configure the details of the activated device.
 */
@ApiModel(description = "Configure the details of the activated device.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationDetails {
  public static final String SERIALIZED_NAME_ALLOW_DEBIT = "allow_debit";
  @SerializedName(SERIALIZED_NAME_ALLOW_DEBIT)
  private Boolean allowDebit;

  public static final String SERIALIZED_NAME_ALLOW_PARTIAL_APPROVALS = "allow_partial_approvals";
  @SerializedName(SERIALIZED_NAME_ALLOW_PARTIAL_APPROVALS)
  private Boolean allowPartialApprovals;

  public static final String SERIALIZED_NAME_BYPASS_DEVICE_ON_CAPTURE = "bypass_device_on_capture";
  @SerializedName(SERIALIZED_NAME_BYPASS_DEVICE_ON_CAPTURE)
  private Boolean bypassDeviceOnCapture;

  public static final String SERIALIZED_NAME_CASHBACK_OPTIONS = "cashback_options";
  @SerializedName(SERIALIZED_NAME_CASHBACK_OPTIONS)
  private ConfigurationDetailsCashbackOptions cashbackOptions;

  public static final String SERIALIZED_NAME_CHECK_FOR_DUPLICATE_TRANSACTIONS = "check_for_duplicate_transactions";
  @SerializedName(SERIALIZED_NAME_CHECK_FOR_DUPLICATE_TRANSACTIONS)
  private Boolean checkForDuplicateTransactions;

  public static final String SERIALIZED_NAME_IS_CASH_BACK_ALLOWED = "is_cash_back_allowed";
  @SerializedName(SERIALIZED_NAME_IS_CASH_BACK_ALLOWED)
  private Boolean isCashBackAllowed;

  public static final String SERIALIZED_NAME_IS_GIFT_SUPPORTED = "is_gift_supported";
  @SerializedName(SERIALIZED_NAME_IS_GIFT_SUPPORTED)
  private String isGiftSupported;

  public static final String SERIALIZED_NAME_IS_MANUAL_ENTRY_ALLOWED = "is_manual_entry_allowed";
  @SerializedName(SERIALIZED_NAME_IS_MANUAL_ENTRY_ALLOWED)
  private Boolean isManualEntryAllowed;

  public static final String SERIALIZED_NAME_MARKET_CODE = "market_code";
  @SerializedName(SERIALIZED_NAME_MARKET_CODE)
  private String marketCode;

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

  public static final String SERIALIZED_NAME_TIP_OPTIONS = "tip_options";
  @SerializedName(SERIALIZED_NAME_TIP_OPTIONS)
  private ConfigurationDetailsTipOptions tipOptions;

  public ConfigurationDetails() { 
  }

  public ConfigurationDetails allowDebit(Boolean allowDebit) {
    
    this.allowDebit = allowDebit;
    return this;
  }

   /**
   * Allow transaction to be processed on Debit rails. If &#x60;false&#x60;, Debit card transactions will be processed on Credit rails.
   * @return allowDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow transaction to be processed on Debit rails. If `false`, Debit card transactions will be processed on Credit rails.")

  public Boolean getAllowDebit() {
    return allowDebit;
  }


  public void setAllowDebit(Boolean allowDebit) {
    this.allowDebit = allowDebit;
  }


  public ConfigurationDetails allowPartialApprovals(Boolean allowPartialApprovals) {
    
    this.allowPartialApprovals = allowPartialApprovals;
    return this;
  }

   /**
   * Determines if a transaction can be partially approved (Usually **null**).
   * @return allowPartialApprovals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if a transaction can be partially approved (Usually **null**).")

  public Boolean getAllowPartialApprovals() {
    return allowPartialApprovals;
  }


  public void setAllowPartialApprovals(Boolean allowPartialApprovals) {
    this.allowPartialApprovals = allowPartialApprovals;
  }


  public ConfigurationDetails bypassDeviceOnCapture(Boolean bypassDeviceOnCapture) {
    
    this.bypassDeviceOnCapture = bypassDeviceOnCapture;
    return this;
  }

   /**
   * Sets whether the device will be used to capture &#x60;Authorizations&#x60;. The device is required to be connected if &#x60;bypass_device_on_capture&#x60; is set to false. (defaults to true).
   * @return bypassDeviceOnCapture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets whether the device will be used to capture `Authorizations`. The device is required to be connected if `bypass_device_on_capture` is set to false. (defaults to true).")

  public Boolean getBypassDeviceOnCapture() {
    return bypassDeviceOnCapture;
  }


  public void setBypassDeviceOnCapture(Boolean bypassDeviceOnCapture) {
    this.bypassDeviceOnCapture = bypassDeviceOnCapture;
  }


  public ConfigurationDetails cashbackOptions(ConfigurationDetailsCashbackOptions cashbackOptions) {
    
    this.cashbackOptions = cashbackOptions;
    return this;
  }

   /**
   * Get cashbackOptions
   * @return cashbackOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigurationDetailsCashbackOptions getCashbackOptions() {
    return cashbackOptions;
  }


  public void setCashbackOptions(ConfigurationDetailsCashbackOptions cashbackOptions) {
    this.cashbackOptions = cashbackOptions;
  }


  public ConfigurationDetails checkForDuplicateTransactions(Boolean checkForDuplicateTransactions) {
    
    this.checkForDuplicateTransactions = checkForDuplicateTransactions;
    return this;
  }

   /**
   * Sets whether the device will check for duplicate transactions.
   * @return checkForDuplicateTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets whether the device will check for duplicate transactions.")

  public Boolean getCheckForDuplicateTransactions() {
    return checkForDuplicateTransactions;
  }


  public void setCheckForDuplicateTransactions(Boolean checkForDuplicateTransactions) {
    this.checkForDuplicateTransactions = checkForDuplicateTransactions;
  }


  public ConfigurationDetails isCashBackAllowed(Boolean isCashBackAllowed) {
    
    this.isCashBackAllowed = isCashBackAllowed;
    return this;
  }

   /**
   * Sets whether the device will allow cash back.
   * @return isCashBackAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets whether the device will allow cash back.")

  public Boolean getIsCashBackAllowed() {
    return isCashBackAllowed;
  }


  public void setIsCashBackAllowed(Boolean isCashBackAllowed) {
    this.isCashBackAllowed = isCashBackAllowed;
  }


  public ConfigurationDetails isGiftSupported(String isGiftSupported) {
    
    this.isGiftSupported = isGiftSupported;
    return this;
  }

   /**
   * Sets whether the device will allow gifting funds.
   * @return isGiftSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets whether the device will allow gifting funds.")

  public String getIsGiftSupported() {
    return isGiftSupported;
  }


  public void setIsGiftSupported(String isGiftSupported) {
    this.isGiftSupported = isGiftSupported;
  }


  public ConfigurationDetails isManualEntryAllowed(Boolean isManualEntryAllowed) {
    
    this.isManualEntryAllowed = isManualEntryAllowed;
    return this;
  }

   /**
   * Sets whether the device will process payment details entered manually.
   * @return isManualEntryAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets whether the device will process payment details entered manually.")

  public Boolean getIsManualEntryAllowed() {
    return isManualEntryAllowed;
  }


  public void setIsManualEntryAllowed(Boolean isManualEntryAllowed) {
    this.isManualEntryAllowed = isManualEntryAllowed;
  }


  public ConfigurationDetails marketCode(String marketCode) {
    
    this.marketCode = marketCode;
    return this;
  }

   /**
   * Used by the processor to handle the &#x60;transfer&#x60;. Usually **null**.
   * @return marketCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used by the processor to handle the `transfer`. Usually **null**.")

  public String getMarketCode() {
    return marketCode;
  }


  public void setMarketCode(String marketCode) {
    this.marketCode = marketCode;
  }


  public ConfigurationDetails promptAmountConfirmation(Boolean promptAmountConfirmation) {
    
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


  public ConfigurationDetails promptManualEntry(Boolean promptManualEntry) {
    
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


  public ConfigurationDetails promptSignature(String promptSignature) {
    
    this.promptSignature = promptSignature;
    return this;
  }

   /**
   * Sets if the device will prompt the card holder for a signature by default. Available values include:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;ALWAYS&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;NEVER&lt;/strong&gt;&lt;li&gt;&lt;strong&gt;AMOUNT&lt;/strong&gt;: Used in conjunction with &#x60;signature_threshold_amount&#x60; so when the threshold is reached the signature form appears on the device.
   * @return promptSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets if the device will prompt the card holder for a signature by default. Available values include:<ul><li><strong>ALWAYS</strong><li><strong>NEVER</strong><li><strong>AMOUNT</strong>: Used in conjunction with `signature_threshold_amount` so when the threshold is reached the signature form appears on the device.")

  public String getPromptSignature() {
    return promptSignature;
  }


  public void setPromptSignature(String promptSignature) {
    this.promptSignature = promptSignature;
  }


  public ConfigurationDetails signatureThresholdAmount(Long signatureThresholdAmount) {
    
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


  public ConfigurationDetails tipOptions(ConfigurationDetailsTipOptions tipOptions) {
    
    this.tipOptions = tipOptions;
    return this;
  }

   /**
   * Get tipOptions
   * @return tipOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigurationDetailsTipOptions getTipOptions() {
    return tipOptions;
  }


  public void setTipOptions(ConfigurationDetailsTipOptions tipOptions) {
    this.tipOptions = tipOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationDetails configurationDetails = (ConfigurationDetails) o;
    return Objects.equals(this.allowDebit, configurationDetails.allowDebit) &&
        Objects.equals(this.allowPartialApprovals, configurationDetails.allowPartialApprovals) &&
        Objects.equals(this.bypassDeviceOnCapture, configurationDetails.bypassDeviceOnCapture) &&
        Objects.equals(this.cashbackOptions, configurationDetails.cashbackOptions) &&
        Objects.equals(this.checkForDuplicateTransactions, configurationDetails.checkForDuplicateTransactions) &&
        Objects.equals(this.isCashBackAllowed, configurationDetails.isCashBackAllowed) &&
        Objects.equals(this.isGiftSupported, configurationDetails.isGiftSupported) &&
        Objects.equals(this.isManualEntryAllowed, configurationDetails.isManualEntryAllowed) &&
        Objects.equals(this.marketCode, configurationDetails.marketCode) &&
        Objects.equals(this.promptAmountConfirmation, configurationDetails.promptAmountConfirmation) &&
        Objects.equals(this.promptManualEntry, configurationDetails.promptManualEntry) &&
        Objects.equals(this.promptSignature, configurationDetails.promptSignature) &&
        Objects.equals(this.signatureThresholdAmount, configurationDetails.signatureThresholdAmount) &&
        Objects.equals(this.tipOptions, configurationDetails.tipOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDebit, allowPartialApprovals, bypassDeviceOnCapture, cashbackOptions, checkForDuplicateTransactions, isCashBackAllowed, isGiftSupported, isManualEntryAllowed, marketCode, promptAmountConfirmation, promptManualEntry, promptSignature, signatureThresholdAmount, tipOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationDetails {\n");
    sb.append("    allowDebit: ").append(toIndentedString(allowDebit)).append("\n");
    sb.append("    allowPartialApprovals: ").append(toIndentedString(allowPartialApprovals)).append("\n");
    sb.append("    bypassDeviceOnCapture: ").append(toIndentedString(bypassDeviceOnCapture)).append("\n");
    sb.append("    cashbackOptions: ").append(toIndentedString(cashbackOptions)).append("\n");
    sb.append("    checkForDuplicateTransactions: ").append(toIndentedString(checkForDuplicateTransactions)).append("\n");
    sb.append("    isCashBackAllowed: ").append(toIndentedString(isCashBackAllowed)).append("\n");
    sb.append("    isGiftSupported: ").append(toIndentedString(isGiftSupported)).append("\n");
    sb.append("    isManualEntryAllowed: ").append(toIndentedString(isManualEntryAllowed)).append("\n");
    sb.append("    marketCode: ").append(toIndentedString(marketCode)).append("\n");
    sb.append("    promptAmountConfirmation: ").append(toIndentedString(promptAmountConfirmation)).append("\n");
    sb.append("    promptManualEntry: ").append(toIndentedString(promptManualEntry)).append("\n");
    sb.append("    promptSignature: ").append(toIndentedString(promptSignature)).append("\n");
    sb.append("    signatureThresholdAmount: ").append(toIndentedString(signatureThresholdAmount)).append("\n");
    sb.append("    tipOptions: ").append(toIndentedString(tipOptions)).append("\n");
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
    openapiFields.add("allow_partial_approvals");
    openapiFields.add("bypass_device_on_capture");
    openapiFields.add("cashback_options");
    openapiFields.add("check_for_duplicate_transactions");
    openapiFields.add("is_cash_back_allowed");
    openapiFields.add("is_gift_supported");
    openapiFields.add("is_manual_entry_allowed");
    openapiFields.add("market_code");
    openapiFields.add("prompt_amount_confirmation");
    openapiFields.add("prompt_manual_entry");
    openapiFields.add("prompt_signature");
    openapiFields.add("signature_threshold_amount");
    openapiFields.add("tip_options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigurationDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigurationDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurationDetails is not found in the empty JSON string", ConfigurationDetails.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigurationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigurationDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `cashback_options`
     // if (jsonObj.getAsJsonObject("cashback_options") != null) {
       //ConfigurationDetailsCashbackOptions.validateJsonObject(jsonObj.getAsJsonObject("cashback_options"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("is_gift_supported") != null && !jsonObj.get("is_gift_supported").isJsonNull()  && !jsonObj.get("is_gift_supported").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_gift_supported` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_gift_supported").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("market_code") != null && !jsonObj.get("market_code").isJsonNull()  && !jsonObj.get("market_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `market_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("market_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("prompt_signature") != null && !jsonObj.get("prompt_signature").isJsonNull()  && !jsonObj.get("prompt_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt_signature").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `tip_options`
     // if (jsonObj.getAsJsonObject("tip_options") != null) {
       //ConfigurationDetailsTipOptions.validateJsonObject(jsonObj.getAsJsonObject("tip_options"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigurationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurationDetails>() {
           @Override
           public void write(JsonWriter out, ConfigurationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurationDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigurationDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigurationDetails
  * @throws IOException if the JSON string is invalid with respect to ConfigurationDetails
  */
  public static ConfigurationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurationDetails.class);
  }

 /**
  * Convert an instance of ConfigurationDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

