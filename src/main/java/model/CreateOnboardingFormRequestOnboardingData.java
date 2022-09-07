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
import java.util.ArrayList;
import java.util.List;

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
 * The prefilled information of the user that&#39;s being onboarded. For more information, see [Prefilling Fields](/guides/onboarding/onboarding-form/#prefilling-fields).
 */
@ApiModel(description = "The prefilled information of the user that's being onboarded. For more information, see [Prefilling Fields](/guides/onboarding/onboarding-form/#prefilling-fields).")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateOnboardingFormRequestOnboardingData {
  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private Object entity;

  public static final String SERIALIZED_NAME_ASSOCIATED_ENTITIES = "associated_entities";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_ENTITIES)
  private List<Object> associatedEntities = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_UNDERWRITING_DATA = "additional_underwriting_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_UNDERWRITING_DATA)
  private Object additionalUnderwritingData;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENTS = "payment_instruments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENTS)
  private Object paymentInstruments;

  public static final String SERIALIZED_NAME_MAX_TRANSACTION_AMOUNT = "max_transaction_amount";
  @SerializedName(SERIALIZED_NAME_MAX_TRANSACTION_AMOUNT)
  private Long maxTransactionAmount;

  public CreateOnboardingFormRequestOnboardingData() { 
  }

  public CreateOnboardingFormRequestOnboardingData entity(Object entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * The &#x60;entity&#x60; information saved in the &#x60;Identity&#x60; of the user.
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `entity` information saved in the `Identity` of the user.")

  public Object getEntity() {
    return entity;
  }


  public void setEntity(Object entity) {
    this.entity = entity;
  }


  public CreateOnboardingFormRequestOnboardingData associatedEntities(List<Object> associatedEntities) {
    
    this.associatedEntities = associatedEntities;
    return this;
  }

  public CreateOnboardingFormRequestOnboardingData addAssociatedEntitiesItem(Object associatedEntitiesItem) {
    if (this.associatedEntities == null) {
      this.associatedEntities = new ArrayList<>();
    }
    this.associatedEntities.add(associatedEntitiesItem);
    return this;
  }

   /**
   * The &#x60;entities&#x60; saved in the &#x60;associated_identities&#x60; of the user. For more information, see [Create an Associated Identity](/guides/onboarding/onboarding-form/#prefilling-fields).
   * @return associatedEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `entities` saved in the `associated_identities` of the user. For more information, see [Create an Associated Identity](/guides/onboarding/onboarding-form/#prefilling-fields).")

  public List<Object> getAssociatedEntities() {
    return associatedEntities;
  }


  public void setAssociatedEntities(List<Object> associatedEntities) {
    this.associatedEntities = associatedEntities;
  }


  public CreateOnboardingFormRequestOnboardingData additionalUnderwritingData(Object additionalUnderwritingData) {
    
    this.additionalUnderwritingData = additionalUnderwritingData;
    return this;
  }

   /**
   * Additional underwriting data about the user.
   * @return additionalUnderwritingData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional underwriting data about the user.")

  public Object getAdditionalUnderwritingData() {
    return additionalUnderwritingData;
  }


  public void setAdditionalUnderwritingData(Object additionalUnderwritingData) {
    this.additionalUnderwritingData = additionalUnderwritingData;
  }


  public CreateOnboardingFormRequestOnboardingData paymentInstruments(Object paymentInstruments) {
    
    this.paymentInstruments = paymentInstruments;
    return this;
  }

   /**
   * The &#x60;Payment Instrument&#x60; that&#39;ll be used to payout the user. For more information, see [Payouts](/guides/payouts/).
   * @return paymentInstruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `Payment Instrument` that'll be used to payout the user. For more information, see [Payouts](/guides/payouts/).")

  public Object getPaymentInstruments() {
    return paymentInstruments;
  }


  public void setPaymentInstruments(Object paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  public CreateOnboardingFormRequestOnboardingData maxTransactionAmount(Long maxTransactionAmount) {
    
    this.maxTransactionAmount = maxTransactionAmount;
    return this;
  }

   /**
   * Maximum amount that can be transacted for a single transaction in cents (max 12 characters). Must be equal to or less than your &#x60;max_transaction_amount&#x60;.
   * @return maxTransactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum amount that can be transacted for a single transaction in cents (max 12 characters). Must be equal to or less than your `max_transaction_amount`.")

  public Long getMaxTransactionAmount() {
    return maxTransactionAmount;
  }


  public void setMaxTransactionAmount(Long maxTransactionAmount) {
    this.maxTransactionAmount = maxTransactionAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnboardingFormRequestOnboardingData createOnboardingFormRequestOnboardingData = (CreateOnboardingFormRequestOnboardingData) o;
    return Objects.equals(this.entity, createOnboardingFormRequestOnboardingData.entity) &&
        Objects.equals(this.associatedEntities, createOnboardingFormRequestOnboardingData.associatedEntities) &&
        Objects.equals(this.additionalUnderwritingData, createOnboardingFormRequestOnboardingData.additionalUnderwritingData) &&
        Objects.equals(this.paymentInstruments, createOnboardingFormRequestOnboardingData.paymentInstruments) &&
        Objects.equals(this.maxTransactionAmount, createOnboardingFormRequestOnboardingData.maxTransactionAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, associatedEntities, additionalUnderwritingData, paymentInstruments, maxTransactionAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnboardingFormRequestOnboardingData {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    associatedEntities: ").append(toIndentedString(associatedEntities)).append("\n");
    sb.append("    additionalUnderwritingData: ").append(toIndentedString(additionalUnderwritingData)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    maxTransactionAmount: ").append(toIndentedString(maxTransactionAmount)).append("\n");
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
    openapiFields.add("entity");
    openapiFields.add("associated_entities");
    openapiFields.add("additional_underwriting_data");
    openapiFields.add("payment_instruments");
    openapiFields.add("max_transaction_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateOnboardingFormRequestOnboardingData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateOnboardingFormRequestOnboardingData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOnboardingFormRequestOnboardingData is not found in the empty JSON string", CreateOnboardingFormRequestOnboardingData.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateOnboardingFormRequestOnboardingData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOnboardingFormRequestOnboardingData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("associated_entities") != null && !jsonObj.get("associated_entities").isJsonNull() && !jsonObj.get("associated_entities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associated_entities` to be an array in the JSON string but got `%s`", jsonObj.get("associated_entities").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOnboardingFormRequestOnboardingData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOnboardingFormRequestOnboardingData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOnboardingFormRequestOnboardingData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOnboardingFormRequestOnboardingData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOnboardingFormRequestOnboardingData>() {
           @Override
           public void write(JsonWriter out, CreateOnboardingFormRequestOnboardingData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOnboardingFormRequestOnboardingData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOnboardingFormRequestOnboardingData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOnboardingFormRequestOnboardingData
  * @throws IOException if the JSON string is invalid with respect to CreateOnboardingFormRequestOnboardingData
  */
  public static CreateOnboardingFormRequestOnboardingData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOnboardingFormRequestOnboardingData.class);
  }

 /**
  * Convert an instance of CreateOnboardingFormRequestOnboardingData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

