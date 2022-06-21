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
 * Create a &#x60;balance_transfer&#x60; resource.
 */
@ApiModel(description = "Create a `balance_transfer` resource.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-21T11:54:05.123637-05:00[America/Chicago]")
public class CreateBalanceTransferRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  /**
   * Choose the value that best applies to the account where funds will get credited.
   */
  @JsonAdapter(DestinationEnum.Adapter.class)
  public enum DestinationEnum {
    FOR_BENEFIT_OF_ACCOUNT("FOR_BENEFIT_OF_ACCOUNT"),
    
    OPERATING_ACCOUNT("OPERATING_ACCOUNT");

    private String value;

    DestinationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationEnum fromValue(String value) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DestinationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private DestinationEnum destination;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  /**
   * Choose the value that best applies to the account where funds will get debited.
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    FOR_BENEFIT_OF_ACCOUNT("FOR_BENEFIT_OF_ACCOUNT"),
    
    OPERATING_ACCOUNT("OPERATING_ACCOUNT");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private SourceEnum source;

  public static final String SERIALIZED_NAME_PROCESSOR_TYPE = "processor_type";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TYPE)
  private String processorType;

  public CreateBalanceTransferRequest() { 
  }

  public CreateBalanceTransferRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Additional information about the &#x60;balance_transfer&#x60; (e.g. **Transferring funds for Holidays**).
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information about the `balance_transfer` (e.g. **Transferring funds for Holidays**).")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateBalanceTransferRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateBalanceTransferRequest putTagsItem(String key, String tagsItem) {
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


  public CreateBalanceTransferRequest destination(DestinationEnum destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Choose the value that best applies to the account where funds will get credited.
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Choose the value that best applies to the account where funds will get credited.")

  public DestinationEnum getDestination() {
    return destination;
  }


  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }


  public CreateBalanceTransferRequest currency(Currency currency) {
    
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


  public CreateBalanceTransferRequest amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public CreateBalanceTransferRequest source(SourceEnum source) {
    
    this.source = source;
    return this;
  }

   /**
   * Choose the value that best applies to the account where funds will get debited.
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Choose the value that best applies to the account where funds will get debited.")

  public SourceEnum getSource() {
    return source;
  }


  public void setSource(SourceEnum source) {
    this.source = source;
  }


  public CreateBalanceTransferRequest processorType(String processorType) {
    
    this.processorType = processorType;
    return this;
  }

   /**
   * Pass **LITLE_V1**; &#x60;balance_transfers&#x60; are only avalible for platforms with **LITLE_V1** credentials.
   * @return processorType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "LITLE_V1", required = true, value = "Pass **LITLE_V1**; `balance_transfers` are only avalible for platforms with **LITLE_V1** credentials.")

  public String getProcessorType() {
    return processorType;
  }


  public void setProcessorType(String processorType) {
    this.processorType = processorType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBalanceTransferRequest createBalanceTransferRequest = (CreateBalanceTransferRequest) o;
    return Objects.equals(this.description, createBalanceTransferRequest.description) &&
        Objects.equals(this.tags, createBalanceTransferRequest.tags) &&
        Objects.equals(this.destination, createBalanceTransferRequest.destination) &&
        Objects.equals(this.currency, createBalanceTransferRequest.currency) &&
        Objects.equals(this.amount, createBalanceTransferRequest.amount) &&
        Objects.equals(this.source, createBalanceTransferRequest.source) &&
        Objects.equals(this.processorType, createBalanceTransferRequest.processorType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, tags, destination, currency, amount, source, processorType);
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
    sb.append("class CreateBalanceTransferRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    processorType: ").append(toIndentedString(processorType)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("tags");
    openapiFields.add("destination");
    openapiFields.add("currency");
    openapiFields.add("amount");
    openapiFields.add("source");
    openapiFields.add("processor_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("processor_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateBalanceTransferRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateBalanceTransferRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBalanceTransferRequest is not found in the empty JSON string", CreateBalanceTransferRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateBalanceTransferRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBalanceTransferRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      /**
      * EDITED
      * Commented to ByPass required properties/fields are present in the JSON string
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : CreateBalanceTransferRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()  && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()  && !jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()  && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor_type") != null && !jsonObj.get("processor_type").isJsonNull()  && !jsonObj.get("processor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor_type").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBalanceTransferRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBalanceTransferRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBalanceTransferRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBalanceTransferRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBalanceTransferRequest>() {
           @Override
           public void write(JsonWriter out, CreateBalanceTransferRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBalanceTransferRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBalanceTransferRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBalanceTransferRequest
  * @throws IOException if the JSON string is invalid with respect to CreateBalanceTransferRequest
  */
  public static CreateBalanceTransferRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBalanceTransferRequest.class);
  }

 /**
  * Convert an instance of CreateBalanceTransferRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

