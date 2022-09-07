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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Currency;
import model.ListLinks;

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
 * A &#x60;balance_transfer&#x60; object.
 */
@ApiModel(description = "A `balance_transfer` object.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BalanceTransfer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_EXTERNAL_REFERENCE_ID = "external_reference_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_REFERENCE_ID)
  private String externalReferenceId;

  public static final String SERIALIZED_NAME_PROCESSOR_TYPE = "processor_type";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TYPE)
  private String processorType;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  /**
   * The &#x60;state&#x60; of the &#x60;balance_transfer&#x60;.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    CREATED("CREATED"),
    
    SUBMITTING("SUBMITTING"),
    
    SUBMITTED("SUBMITTED"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED"),
    
    RETURNED("RETURNED"),
    
    UNKNOWM("UNKNOWM"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static StateEnum fromValue(String value) {
        for (StateEnum b : StateEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        StateEnum unknownDefault = StateEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ListLinks links;

  public BalanceTransfer() { 
  }

  public BalanceTransfer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the &#x60;balance_transfer&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `balance_transfer` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BalanceTransfer createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public BalanceTransfer updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the object was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public BalanceTransfer amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount that will be debited in cents (e.g. 100 cents to debit $1.00).")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public BalanceTransfer currency(Currency currency) {
    
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


  public BalanceTransfer description(String description) {
    
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


  public BalanceTransfer destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * The account where funds get credited. For balance transfers, this is an aliased ID and will have the value of &#x60;FOR_BENEFIT_OF_ACCOUNT&#x60; or &#x60;OPERATING_ACCOUNT&#x60;.
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account where funds get credited. For balance transfers, this is an aliased ID and will have the value of `FOR_BENEFIT_OF_ACCOUNT` or `OPERATING_ACCOUNT`.")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public BalanceTransfer externalReferenceId(String externalReferenceId) {
    
    this.externalReferenceId = externalReferenceId;
    return this;
  }

   /**
   * ID generated by partner and returned to Finix.
   * @return externalReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID generated by partner and returned to Finix.")

  public String getExternalReferenceId() {
    return externalReferenceId;
  }


  public void setExternalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
  }


  public BalanceTransfer processorType(String processorType) {
    
    this.processorType = processorType;
    return this;
  }

   /**
   * Pass **LITLE_V1**; &#x60;balance_transfers&#x60; are only avalible for platforms with **LITLE_V1** credentials.
   * @return processorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pass **LITLE_V1**; `balance_transfers` are only avalible for platforms with **LITLE_V1** credentials.")

  public String getProcessorType() {
    return processorType;
  }


  public void setProcessorType(String processorType) {
    this.processorType = processorType;
  }


  public BalanceTransfer referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * ID generated by Finix and sent to the partner.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID generated by Finix and sent to the partner.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public BalanceTransfer source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The account where funds get debited. For balance transfers, this is an aliased ID and will have the value of &#x60;FOR_BENEFIT_OF_ACCOUNT&#x60; or &#x60;OPERATING_ACCOUNT&#x60;.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account where funds get debited. For balance transfers, this is an aliased ID and will have the value of `FOR_BENEFIT_OF_ACCOUNT` or `OPERATING_ACCOUNT`.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public BalanceTransfer state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The &#x60;state&#x60; of the &#x60;balance_transfer&#x60;.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `state` of the `balance_transfer`.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public BalanceTransfer tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public BalanceTransfer putTagsItem(String key, String tagsItem) {
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


  public BalanceTransfer links(ListLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListLinks getLinks() {
    return links;
  }


  public void setLinks(ListLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceTransfer balanceTransfer = (BalanceTransfer) o;
    return Objects.equals(this.id, balanceTransfer.id) &&
        Objects.equals(this.createdAt, balanceTransfer.createdAt) &&
        Objects.equals(this.updatedAt, balanceTransfer.updatedAt) &&
        Objects.equals(this.amount, balanceTransfer.amount) &&
        Objects.equals(this.currency, balanceTransfer.currency) &&
        Objects.equals(this.description, balanceTransfer.description) &&
        Objects.equals(this.destination, balanceTransfer.destination) &&
        Objects.equals(this.externalReferenceId, balanceTransfer.externalReferenceId) &&
        Objects.equals(this.processorType, balanceTransfer.processorType) &&
        Objects.equals(this.referenceId, balanceTransfer.referenceId) &&
        Objects.equals(this.source, balanceTransfer.source) &&
        Objects.equals(this.state, balanceTransfer.state) &&
        Objects.equals(this.tags, balanceTransfer.tags) &&
        Objects.equals(this.links, balanceTransfer.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, amount, currency, description, destination, externalReferenceId, processorType, referenceId, source, state, tags, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceTransfer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    externalReferenceId: ").append(toIndentedString(externalReferenceId)).append("\n");
    sb.append("    processorType: ").append(toIndentedString(processorType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("description");
    openapiFields.add("destination");
    openapiFields.add("external_reference_id");
    openapiFields.add("processor_type");
    openapiFields.add("reference_id");
    openapiFields.add("source");
    openapiFields.add("state");
    openapiFields.add("tags");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BalanceTransfer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BalanceTransfer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceTransfer is not found in the empty JSON string", BalanceTransfer.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BalanceTransfer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BalanceTransfer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()  && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
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
      if (jsonObj.get("external_reference_id") != null && !jsonObj.get("external_reference_id").isJsonNull()  && !jsonObj.get("external_reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_reference_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor_type") != null && !jsonObj.get("processor_type").isJsonNull()  && !jsonObj.get("processor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("reference_id") != null && !jsonObj.get("reference_id").isJsonNull()  && !jsonObj.get("reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_id").toString()));
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
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()  && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceTransfer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceTransfer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceTransfer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceTransfer.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceTransfer>() {
           @Override
           public void write(JsonWriter out, BalanceTransfer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceTransfer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BalanceTransfer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalanceTransfer
  * @throws IOException if the JSON string is invalid with respect to BalanceTransfer
  */
  public static BalanceTransfer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceTransfer.class);
  }

 /**
  * Convert an instance of BalanceTransfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

