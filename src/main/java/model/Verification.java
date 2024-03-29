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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.VerificationLinks;
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
 * Verification
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Verification {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTITY = "merchant_identity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTITY)
  private String merchantIdentity;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<Object> messages = null;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT = "payment_instrument";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT)
  private String paymentInstrument;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private Object raw;

  /**
   * The status of the &#x60;Verification&#x60; request.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PENDING("PENDING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED"),
    
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

  public static final String SERIALIZED_NAME_TRACE_ID = "trace_id";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private VerificationLinks links;

  public Verification() { 
  }

  public Verification id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the &#x60;Verification&#x60; attempt (begins with &#x60;VIXXX&#x60;).
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `Verification` attempt (begins with `VIXXX`).")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Verification createdAt(OffsetDateTime createdAt) {
    
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


  public Verification updatedAt(OffsetDateTime updatedAt) {
    
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


  public Verification application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * ID of the &#x60;Application&#x60; the &#x60;Merchant&#x60; was created under.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Application` the `Merchant` was created under.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public Verification identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * ID of the &#x60;Identity&#x60; that created the &#x60;Merchant&#x60;.
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Identity` that created the `Merchant`.")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public Verification merchant(String merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * ID of the &#x60;Merchant&#x60; resource.
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Merchant` resource.")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }


  public Verification merchantIdentity(String merchantIdentity) {
    
    this.merchantIdentity = merchantIdentity;
    return this;
  }

   /**
   * ID of the &#x60;Identity&#x60; associated with the &#x60;Merchant&#x60;.
   * @return merchantIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `Identity` associated with the `Merchant`.")

  public String getMerchantIdentity() {
    return merchantIdentity;
  }


  public void setMerchantIdentity(String merchantIdentity) {
    this.merchantIdentity = merchantIdentity;
  }


  public Verification messages(List<Object> messages) {
    
    this.messages = messages;
    return this;
  }

  public Verification addMessagesItem(Object messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Provides additional details about the verification (e.g why it failed). This field is usually **null**.
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provides additional details about the verification (e.g why it failed). This field is usually **null**.")

  public List<Object> getMessages() {
    return messages;
  }


  public void setMessages(List<Object> messages) {
    this.messages = messages;
  }


  public Verification paymentInstrument(String paymentInstrument) {
    
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * The &#x60;Payment Instrument&#x60; that&#39;ll be used to settle the &#x60;Merchant&#39;s&#x60; processed funds.
   * @return paymentInstrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `Payment Instrument` that'll be used to settle the `Merchant's` processed funds.")

  public String getPaymentInstrument() {
    return paymentInstrument;
  }


  public void setPaymentInstrument(String paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }


  public Verification processor(String processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * Name of the verification processor.
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the verification processor.")

  public String getProcessor() {
    return processor;
  }


  public void setProcessor(String processor) {
    this.processor = processor;
  }


  public Verification raw(Object raw) {
    
    this.raw = raw;
    return this;
  }

   /**
   * Raw response from the processor.
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw response from the processor.")

  public Object getRaw() {
    return raw;
  }


  public void setRaw(Object raw) {
    this.raw = raw;
  }


  public Verification state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The status of the &#x60;Verification&#x60; request.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the `Verification` request.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public Verification tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Verification putTagsItem(String key, String tagsItem) {
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


  public Verification traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * Trace ID of the &#x60;Verification&#x60;. The processor sends back the &#x60;trace_id&#x60; so you can track the verification end-to-end.
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trace ID of the `Verification`. The processor sends back the `trace_id` so you can track the verification end-to-end.")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public Verification links(VerificationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerificationLinks getLinks() {
    return links;
  }


  public void setLinks(VerificationLinks links) {
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
    Verification verification = (Verification) o;
    return Objects.equals(this.id, verification.id) &&
        Objects.equals(this.createdAt, verification.createdAt) &&
        Objects.equals(this.updatedAt, verification.updatedAt) &&
        Objects.equals(this.application, verification.application) &&
        Objects.equals(this.identity, verification.identity) &&
        Objects.equals(this.merchant, verification.merchant) &&
        Objects.equals(this.merchantIdentity, verification.merchantIdentity) &&
        Objects.equals(this.messages, verification.messages) &&
        Objects.equals(this.paymentInstrument, verification.paymentInstrument) &&
        Objects.equals(this.processor, verification.processor) &&
        Objects.equals(this.raw, verification.raw) &&
        Objects.equals(this.state, verification.state) &&
        Objects.equals(this.tags, verification.tags) &&
        Objects.equals(this.traceId, verification.traceId) &&
        Objects.equals(this.links, verification.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, application, identity, merchant, merchantIdentity, messages, paymentInstrument, processor, raw, state, tags, traceId, links);
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
    sb.append("class Verification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantIdentity: ").append(toIndentedString(merchantIdentity)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("identity");
    openapiFields.add("merchant");
    openapiFields.add("merchant_identity");
    openapiFields.add("messages");
    openapiFields.add("payment_instrument");
    openapiFields.add("processor");
    openapiFields.add("raw");
    openapiFields.add("state");
    openapiFields.add("tags");
    openapiFields.add("trace_id");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Verification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Verification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Verification is not found in the empty JSON string", Verification.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Verification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Verification` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("merchant") != null && !jsonObj.get("merchant").isJsonNull()  && !jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("merchant_identity") != null && !jsonObj.get("merchant_identity").isJsonNull()  && !jsonObj.get("merchant_identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_identity").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      // ensure the json data is an array
      if (jsonObj.get("messages") != null && !jsonObj.get("messages").isJsonNull() && !jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("payment_instrument") != null && !jsonObj.get("payment_instrument").isJsonNull()  && !jsonObj.get("payment_instrument").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_instrument` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_instrument").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor") != null && !jsonObj.get("processor").isJsonNull()  && !jsonObj.get("processor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor").toString()));
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
      if (jsonObj.get("trace_id") != null && !jsonObj.get("trace_id").isJsonNull()  && !jsonObj.get("trace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trace_id").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Verification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Verification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Verification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Verification.class));

       return (TypeAdapter<T>) new TypeAdapter<Verification>() {
           @Override
           public void write(JsonWriter out, Verification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Verification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Verification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Verification
  * @throws IOException if the JSON string is invalid with respect to Verification
  */
  public static Verification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Verification.class);
  }

 /**
  * Convert an instance of Verification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

