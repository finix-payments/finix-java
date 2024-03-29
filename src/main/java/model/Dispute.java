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
import model.DisputeLinks;
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
 * A &#x60;Dispute&#x60; objected created for a chargeback or customer disputes.
 */
@ApiModel(description = "A `Dispute` objected created for a chargeback or customer disputes.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dispute {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DISPUTE_DETAILS = "dispute_details";
  @SerializedName(SERIALIZED_NAME_DISPUTE_DETAILS)
  private Map<String, Object> disputeDetails = null;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OCCURRED_AT = "occurred_at";
  @SerializedName(SERIALIZED_NAME_OCCURRED_AT)
  private OffsetDateTime occurredAt;

  /**
   * The system-defined reason for the &#x60;Dispute&#x60;. Available values include:&lt;ul&gt;&lt;li&gt;**INQUIRY**&lt;li&gt;**QUALITY**&lt;li&gt;**FRAUD**
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    CLERICAL("CLERICAL"),
    
    FRAUD("FRAUD"),
    
    INQUIRY("INQUIRY"),
    
    QUALITY("QUALITY"),
    
    TECHNICAL("TECHNICAL"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    ReasonEnum(String value) {
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

    public static ReasonEnum fromValue(String value) {
        for (ReasonEnum b : ReasonEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        ReasonEnum unknownDefault = ReasonEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public static final String SERIALIZED_NAME_RESPOND_BY = "respond_by";
  @SerializedName(SERIALIZED_NAME_RESPOND_BY)
  private OffsetDateTime respondBy;

  /**
   * The current state of the &#x60;Dispute&#x60;.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INQUIRY("INQUIRY"),
    
    PENDING("PENDING"),
    
    WON("WON"),
    
    LOST("LOST"),
    
    ARBITRATION("ARBITRATION"),
    
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

  public static final String SERIALIZED_NAME_TRANSFER = "transfer";
  @SerializedName(SERIALIZED_NAME_TRANSFER)
  private String transfer;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private DisputeLinks links;

  public Dispute() { 
  }

  public Dispute id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;Dispute&#x60; resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DIxxxxxxxxxxxxxxxxxx", value = "The ID of the `Dispute` resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Dispute createdAt(OffsetDateTime createdAt) {
    
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


  public Dispute updatedAt(OffsetDateTime updatedAt) {
    
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


  public Dispute action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * The next &#x60;action&#x60; required to move forward with the &#x60;Dispute&#x60;.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The next `action` required to move forward with the `Dispute`.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public Dispute amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of the &#x60;Dispute&#x60; (in cents).
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount of the `Dispute` (in cents).")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public Dispute application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the &#x60;Application&#x60; resource the &#x60;Dispute&#x60; was created under.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Application` resource the `Dispute` was created under.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public Dispute currency(Currency currency) {
    
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


  public Dispute disputeDetails(Map<String, Object> disputeDetails) {
    
    this.disputeDetails = disputeDetails;
    return this;
  }

  public Dispute putDisputeDetailsItem(String key, Object disputeDetailsItem) {
    if (this.disputeDetails == null) {
      this.disputeDetails = new HashMap<>();
    }
    this.disputeDetails.put(key, disputeDetailsItem);
    return this;
  }

   /**
   * Details about the &#x60;Dispute&#x60; recieved by the &#x60;Processor&#x60;. May be any type of data.
   * @return disputeDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details about the `Dispute` recieved by the `Processor`. May be any type of data.")

  public Map<String, Object> getDisputeDetails() {
    return disputeDetails;
  }


  public void setDisputeDetails(Map<String, Object> disputeDetails) {
    this.disputeDetails = disputeDetails;
  }


  public Dispute identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * The ID of the resource.
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public Dispute message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message field that provides additional details. This field is typically **null**.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message field that provides additional details. This field is typically **null**.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Dispute occurredAt(OffsetDateTime occurredAt) {
    
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * Point in time when dispute occurred.
   * @return occurredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point in time when dispute occurred.")

  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }


  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  public Dispute reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The system-defined reason for the &#x60;Dispute&#x60;. Available values include:&lt;ul&gt;&lt;li&gt;**INQUIRY**&lt;li&gt;**QUALITY**&lt;li&gt;**FRAUD**
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The system-defined reason for the `Dispute`. Available values include:<ul><li>**INQUIRY**<li>**QUALITY**<li>**FRAUD**")

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public Dispute respondBy(OffsetDateTime respondBy) {
    
    this.respondBy = respondBy;
    return this;
  }

   /**
   * Point in time when dispute has to be resolved and the &#x60;Merchant&#x60; needs to respond by.
   * @return respondBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point in time when dispute has to be resolved and the `Merchant` needs to respond by.")

  public OffsetDateTime getRespondBy() {
    return respondBy;
  }


  public void setRespondBy(OffsetDateTime respondBy) {
    this.respondBy = respondBy;
  }


  public Dispute state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The current state of the &#x60;Dispute&#x60;.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current state of the `Dispute`.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public Dispute tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Dispute putTagsItem(String key, String tagsItem) {
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


  public Dispute transfer(String transfer) {
    
    this.transfer = transfer;
    return this;
  }

   /**
   * ID of the &#x60;Transfer&#x60; resource.
   * @return transfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRxxxxxxxxxxxxxxxxxx", value = "ID of the `Transfer` resource.")

  public String getTransfer() {
    return transfer;
  }


  public void setTransfer(String transfer) {
    this.transfer = transfer;
  }


  public Dispute links(DisputeLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisputeLinks getLinks() {
    return links;
  }


  public void setLinks(DisputeLinks links) {
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
    Dispute dispute = (Dispute) o;
    return Objects.equals(this.id, dispute.id) &&
        Objects.equals(this.createdAt, dispute.createdAt) &&
        Objects.equals(this.updatedAt, dispute.updatedAt) &&
        Objects.equals(this.action, dispute.action) &&
        Objects.equals(this.amount, dispute.amount) &&
        Objects.equals(this.application, dispute.application) &&
        Objects.equals(this.currency, dispute.currency) &&
        Objects.equals(this.disputeDetails, dispute.disputeDetails) &&
        Objects.equals(this.identity, dispute.identity) &&
        Objects.equals(this.message, dispute.message) &&
        Objects.equals(this.occurredAt, dispute.occurredAt) &&
        Objects.equals(this.reason, dispute.reason) &&
        Objects.equals(this.respondBy, dispute.respondBy) &&
        Objects.equals(this.state, dispute.state) &&
        Objects.equals(this.tags, dispute.tags) &&
        Objects.equals(this.transfer, dispute.transfer) &&
        Objects.equals(this.links, dispute.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, action, amount, application, currency, disputeDetails, identity, message, occurredAt, reason, respondBy, state, tags, transfer, links);
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
    sb.append("class Dispute {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    disputeDetails: ").append(toIndentedString(disputeDetails)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    respondBy: ").append(toIndentedString(respondBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("amount");
    openapiFields.add("application");
    openapiFields.add("currency");
    openapiFields.add("dispute_details");
    openapiFields.add("identity");
    openapiFields.add("message");
    openapiFields.add("occurred_at");
    openapiFields.add("reason");
    openapiFields.add("respond_by");
    openapiFields.add("state");
    openapiFields.add("tags");
    openapiFields.add("transfer");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Dispute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Dispute.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dispute is not found in the empty JSON string", Dispute.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Dispute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dispute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()  && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()  && !jsonObj.get("application").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()  && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()  && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()  && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()  && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("transfer") != null && !jsonObj.get("transfer").isJsonNull()  && !jsonObj.get("transfer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //DisputeLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dispute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dispute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dispute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dispute.class));

       return (TypeAdapter<T>) new TypeAdapter<Dispute>() {
           @Override
           public void write(JsonWriter out, Dispute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dispute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dispute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dispute
  * @throws IOException if the JSON string is invalid with respect to Dispute
  */
  public static Dispute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dispute.class);
  }

 /**
  * Convert an instance of Dispute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

