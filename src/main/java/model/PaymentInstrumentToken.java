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
import model.PaymentInstrumentTokenLinks;
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
 * PaymentInstrumentToken
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentInstrumentToken {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TOKEN("TOKEN"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
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

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        TypeEnum unknownDefault = TypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

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

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  /**
   * Gets or Sets instrumentType
   */
  @JsonAdapter(InstrumentTypeEnum.Adapter.class)
  public enum InstrumentTypeEnum {
    TOKEN("TOKEN"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    InstrumentTypeEnum(String value) {
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

    public static InstrumentTypeEnum fromValue(String value) {
        for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        InstrumentTypeEnum unknownDefault = InstrumentTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<InstrumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstrumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstrumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstrumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrument_type";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private InstrumentTypeEnum instrumentType;

  /**
   * Gets or Sets payloadType
   */
  @JsonAdapter(PayloadTypeEnum.Adapter.class)
  public enum PayloadTypeEnum {
    SOURCE("SOURCE"),
    
    DESTINATION("DESTINATION"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    PayloadTypeEnum(String value) {
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

    public static PayloadTypeEnum fromValue(String value) {
        for (PayloadTypeEnum b : PayloadTypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        PayloadTypeEnum unknownDefault = PayloadTypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<PayloadTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayloadTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayloadTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayloadTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYLOAD_TYPE = "payload_type";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_TYPE)
  private PayloadTypeEnum payloadType;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaymentInstrumentTokenLinks links;

  public PaymentInstrumentToken() { 
  }

  public PaymentInstrumentToken tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public PaymentInstrumentToken putTagsItem(String key, String tagsItem) {
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


  public PaymentInstrumentToken type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentInstrumentToken id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PaymentInstrumentToken createdAt(OffsetDateTime createdAt) {
    
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


  public PaymentInstrumentToken updatedAt(OffsetDateTime updatedAt) {
    
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


  public PaymentInstrumentToken application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * The ID of the resource.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resource.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public PaymentInstrumentToken currency(Currency currency) {
    
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


  public PaymentInstrumentToken fingerprint(String fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FPRxxxxxxxxxxxxxxxxx", value = "")

  public String getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public PaymentInstrumentToken identity(String identity) {
    
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


  public PaymentInstrumentToken instrumentType(InstrumentTypeEnum instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * Get instrumentType
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }


  public PaymentInstrumentToken payloadType(PayloadTypeEnum payloadType) {
    
    this.payloadType = payloadType;
    return this;
  }

   /**
   * Get payloadType
   * @return payloadType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayloadTypeEnum getPayloadType() {
    return payloadType;
  }


  public void setPayloadType(PayloadTypeEnum payloadType) {
    this.payloadType = payloadType;
  }


  public PaymentInstrumentToken links(PaymentInstrumentTokenLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInstrumentTokenLinks getLinks() {
    return links;
  }


  public void setLinks(PaymentInstrumentTokenLinks links) {
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
    PaymentInstrumentToken paymentInstrumentToken = (PaymentInstrumentToken) o;
    return Objects.equals(this.tags, paymentInstrumentToken.tags) &&
        Objects.equals(this.type, paymentInstrumentToken.type) &&
        Objects.equals(this.id, paymentInstrumentToken.id) &&
        Objects.equals(this.createdAt, paymentInstrumentToken.createdAt) &&
        Objects.equals(this.updatedAt, paymentInstrumentToken.updatedAt) &&
        Objects.equals(this.application, paymentInstrumentToken.application) &&
        Objects.equals(this.currency, paymentInstrumentToken.currency) &&
        Objects.equals(this.fingerprint, paymentInstrumentToken.fingerprint) &&
        Objects.equals(this.identity, paymentInstrumentToken.identity) &&
        Objects.equals(this.instrumentType, paymentInstrumentToken.instrumentType) &&
        Objects.equals(this.payloadType, paymentInstrumentToken.payloadType) &&
        Objects.equals(this.links, paymentInstrumentToken.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, type, id, createdAt, updatedAt, application, currency, fingerprint, identity, instrumentType, payloadType, links);
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
    sb.append("class PaymentInstrumentToken {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("application");
    openapiFields.add("currency");
    openapiFields.add("fingerprint");
    openapiFields.add("identity");
    openapiFields.add("instrument_type");
    openapiFields.add("payload_type");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrumentToken
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrumentToken.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrumentToken is not found in the empty JSON string", PaymentInstrumentToken.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrumentToken.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrumentToken` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
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
      if (jsonObj.get("fingerprint") != null && !jsonObj.get("fingerprint").isJsonNull()  && !jsonObj.get("fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint").toString()));
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
      if (jsonObj.get("instrument_type") != null && !jsonObj.get("instrument_type").isJsonNull()  && !jsonObj.get("instrument_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("payload_type") != null && !jsonObj.get("payload_type").isJsonNull()  && !jsonObj.get("payload_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload_type").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_links`
     // if (jsonObj.getAsJsonObject("_links") != null) {
       //PaymentInstrumentTokenLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrumentToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrumentToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrumentToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentToken.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrumentToken>() {
           @Override
           public void write(JsonWriter out, PaymentInstrumentToken value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrumentToken read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrumentToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrumentToken
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentToken
  */
  public static PaymentInstrumentToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrumentToken.class);
  }

 /**
  * Convert an instance of PaymentInstrumentToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

