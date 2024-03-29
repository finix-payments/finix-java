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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Currency;
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
 * CreateReversalRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateReversalRequest {
  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private Long refundAmount;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_OPERATION_KEY = "operation_key";
  @SerializedName(SERIALIZED_NAME_OPERATION_KEY)
  private String operationKey;

  public CreateReversalRequest() { 
  }

  public CreateReversalRequest refundAmount(Long refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * The amount of the refund in cents. It must be equal to or less than the amount of the original &#x60;Transfer&#x60;.
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the refund in cents. It must be equal to or less than the amount of the original `Transfer`.")

  public Long getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }


  public CreateReversalRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateReversalRequest putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Key value pair for annotating custom meta data (e.g. order numbers).
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key value pair for annotating custom meta data (e.g. order numbers).")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public CreateReversalRequest device(String device) {
    
    this.device = device;
    return this;
  }

   /**
   * The ID of the &#x60;Device&#x60; used to process the transaction.
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Device` used to process the transaction.")

  public String getDevice() {
    return device;
  }


  public void setDevice(String device) {
    this.device = device;
  }


  public CreateReversalRequest amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the sale.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the sale.")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public CreateReversalRequest currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public CreateReversalRequest operationKey(String operationKey) {
    
    this.operationKey = operationKey;
    return this;
  }

   /**
   * Describes the operation to be performed in the transaction. Use **CARD_PRESENT_UNREFERENCED_REFUND** for refunds where the card isn&#39;t avalible.
   * @return operationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CARD_PRESENT_UNREFERENCED_REFUND", value = "Describes the operation to be performed in the transaction. Use **CARD_PRESENT_UNREFERENCED_REFUND** for refunds where the card isn't avalible.")

  public String getOperationKey() {
    return operationKey;
  }


  public void setOperationKey(String operationKey) {
    this.operationKey = operationKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReversalRequest createReversalRequest = (CreateReversalRequest) o;
    return Objects.equals(this.refundAmount, createReversalRequest.refundAmount) &&
        Objects.equals(this.tags, createReversalRequest.tags) &&
        Objects.equals(this.device, createReversalRequest.device) &&
        Objects.equals(this.amount, createReversalRequest.amount) &&
        Objects.equals(this.currency, createReversalRequest.currency) &&
        Objects.equals(this.operationKey, createReversalRequest.operationKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundAmount, tags, device, amount, currency, operationKey);
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
    sb.append("class CreateReversalRequest {\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    operationKey: ").append(toIndentedString(operationKey)).append("\n");
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
    openapiFields.add("refund_amount");
    openapiFields.add("tags");
    openapiFields.add("device");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("operation_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateReversalRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateReversalRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateReversalRequest is not found in the empty JSON string", CreateReversalRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateReversalRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateReversalRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()  && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("operation_key") != null && !jsonObj.get("operation_key").isJsonNull()  && !jsonObj.get("operation_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_key").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateReversalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateReversalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateReversalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateReversalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateReversalRequest>() {
           @Override
           public void write(JsonWriter out, CreateReversalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateReversalRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateReversalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateReversalRequest
  * @throws IOException if the JSON string is invalid with respect to CreateReversalRequest
  */
  public static CreateReversalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateReversalRequest.class);
  }

 /**
  * Convert an instance of CreateReversalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

