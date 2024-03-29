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
import model.Currency;

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
 * The amount and currency of this &#x60;Subsciption Amount&#x60;.
 */
@ApiModel(description = "The amount and currency of this `Subsciption Amount`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSubscriptionAmountRequestFeeAmountData {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public CreateSubscriptionAmountRequestFeeAmountData() { 
  }

  public CreateSubscriptionAmountRequestFeeAmountData amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * A positive integer in cents representing how much to charge on a recurring basis.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A positive integer in cents representing how much to charge on a recurring basis.")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public CreateSubscriptionAmountRequestFeeAmountData currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public CreateSubscriptionAmountRequestFeeAmountData label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The display name of the &#x60;Subscirption Amount&#x60; that can be used for filtering purposes.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the `Subscirption Amount` that can be used for filtering purposes.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionAmountRequestFeeAmountData createSubscriptionAmountRequestFeeAmountData = (CreateSubscriptionAmountRequestFeeAmountData) o;
    return Objects.equals(this.amount, createSubscriptionAmountRequestFeeAmountData.amount) &&
        Objects.equals(this.currency, createSubscriptionAmountRequestFeeAmountData.currency) &&
        Objects.equals(this.label, createSubscriptionAmountRequestFeeAmountData.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionAmountRequestFeeAmountData {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSubscriptionAmountRequestFeeAmountData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateSubscriptionAmountRequestFeeAmountData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubscriptionAmountRequestFeeAmountData is not found in the empty JSON string", CreateSubscriptionAmountRequestFeeAmountData.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSubscriptionAmountRequestFeeAmountData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSubscriptionAmountRequestFeeAmountData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateSubscriptionAmountRequestFeeAmountData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()  && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionAmountRequestFeeAmountData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionAmountRequestFeeAmountData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionAmountRequestFeeAmountData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionAmountRequestFeeAmountData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionAmountRequestFeeAmountData>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionAmountRequestFeeAmountData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionAmountRequestFeeAmountData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionAmountRequestFeeAmountData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionAmountRequestFeeAmountData
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionAmountRequestFeeAmountData
  */
  public static CreateSubscriptionAmountRequestFeeAmountData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionAmountRequestFeeAmountData.class);
  }

 /**
  * Convert an instance of CreateSubscriptionAmountRequestFeeAmountData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

