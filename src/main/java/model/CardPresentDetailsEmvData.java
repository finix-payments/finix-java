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
 * Encrypted card data used to process the transaction.
 */
@ApiModel(description = "Encrypted card data used to process the transaction.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CardPresentDetailsEmvData {
  public static final String SERIALIZED_NAME_APPLICATION_IDENTIFIER = "application_identifier";
  @SerializedName(SERIALIZED_NAME_APPLICATION_IDENTIFIER)
  private String applicationIdentifier;

  public static final String SERIALIZED_NAME_APPLICATION_LABEL = "application_label";
  @SerializedName(SERIALIZED_NAME_APPLICATION_LABEL)
  private String applicationLabel;

  public static final String SERIALIZED_NAME_APPLICATION_PREFERRED_NAME = "application_preferred_name";
  @SerializedName(SERIALIZED_NAME_APPLICATION_PREFERRED_NAME)
  private String applicationPreferredName;

  public static final String SERIALIZED_NAME_APPLICATION_TRANSACTION_COUNTER = "application_transaction_counter";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TRANSACTION_COUNTER)
  private String applicationTransactionCounter;

  public static final String SERIALIZED_NAME_CRYPTOGRAM = "cryptogram";
  @SerializedName(SERIALIZED_NAME_CRYPTOGRAM)
  private String cryptogram;

  public static final String SERIALIZED_NAME_ISSUER_CODE_TABLE_INDEX = "issuer_code_table_index";
  @SerializedName(SERIALIZED_NAME_ISSUER_CODE_TABLE_INDEX)
  private String issuerCodeTableIndex;

  public static final String SERIALIZED_NAME_PIN_VERIFIED = "pin_verified";
  @SerializedName(SERIALIZED_NAME_PIN_VERIFIED)
  private Boolean pinVerified;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public CardPresentDetailsEmvData() { 
  }

  public CardPresentDetailsEmvData applicationIdentifier(String applicationIdentifier) {
    
    this.applicationIdentifier = applicationIdentifier;
    return this;
  }

   /**
   * ID of the EMV application processing the transaction.
   * @return applicationIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the EMV application processing the transaction.")

  public String getApplicationIdentifier() {
    return applicationIdentifier;
  }


  public void setApplicationIdentifier(String applicationIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
  }


  public CardPresentDetailsEmvData applicationLabel(String applicationLabel) {
    
    this.applicationLabel = applicationLabel;
    return this;
  }

   /**
   * EMV card label.
   * @return applicationLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EMV card label.")

  public String getApplicationLabel() {
    return applicationLabel;
  }


  public void setApplicationLabel(String applicationLabel) {
    this.applicationLabel = applicationLabel;
  }


  public CardPresentDetailsEmvData applicationPreferredName(String applicationPreferredName) {
    
    this.applicationPreferredName = applicationPreferredName;
    return this;
  }

   /**
   * Alternate EMV application name (if provided).
   * @return applicationPreferredName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alternate EMV application name (if provided).")

  public String getApplicationPreferredName() {
    return applicationPreferredName;
  }


  public void setApplicationPreferredName(String applicationPreferredName) {
    this.applicationPreferredName = applicationPreferredName;
  }


  public CardPresentDetailsEmvData applicationTransactionCounter(String applicationTransactionCounter) {
    
    this.applicationTransactionCounter = applicationTransactionCounter;
    return this;
  }

   /**
   * Transaction number for the EMV application.
   * @return applicationTransactionCounter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction number for the EMV application.")

  public String getApplicationTransactionCounter() {
    return applicationTransactionCounter;
  }


  public void setApplicationTransactionCounter(String applicationTransactionCounter) {
    this.applicationTransactionCounter = applicationTransactionCounter;
  }


  public CardPresentDetailsEmvData cryptogram(String cryptogram) {
    
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * Encrypted card infromation used to process the transaction.
   * @return cryptogram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encrypted card infromation used to process the transaction.")

  public String getCryptogram() {
    return cryptogram;
  }


  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }


  public CardPresentDetailsEmvData issuerCodeTableIndex(String issuerCodeTableIndex) {
    
    this.issuerCodeTableIndex = issuerCodeTableIndex;
    return this;
  }

   /**
   * The alphabet code table (according to ISO 8859) used by the EMV application (if provided).
   * @return issuerCodeTableIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The alphabet code table (according to ISO 8859) used by the EMV application (if provided).")

  public String getIssuerCodeTableIndex() {
    return issuerCodeTableIndex;
  }


  public void setIssuerCodeTableIndex(String issuerCodeTableIndex) {
    this.issuerCodeTableIndex = issuerCodeTableIndex;
  }


  public CardPresentDetailsEmvData pinVerified(Boolean pinVerified) {
    
    this.pinVerified = pinVerified;
    return this;
  }

   /**
   * Details if the cardholder&#39;s PIN number was verified.
   * @return pinVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details if the cardholder's PIN number was verified.")

  public Boolean getPinVerified() {
    return pinVerified;
  }


  public void setPinVerified(Boolean pinVerified) {
    this.pinVerified = pinVerified;
  }


  public CardPresentDetailsEmvData tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CardPresentDetailsEmvData putTagsItem(String key, String tagsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardPresentDetailsEmvData cardPresentDetailsEmvData = (CardPresentDetailsEmvData) o;
    return Objects.equals(this.applicationIdentifier, cardPresentDetailsEmvData.applicationIdentifier) &&
        Objects.equals(this.applicationLabel, cardPresentDetailsEmvData.applicationLabel) &&
        Objects.equals(this.applicationPreferredName, cardPresentDetailsEmvData.applicationPreferredName) &&
        Objects.equals(this.applicationTransactionCounter, cardPresentDetailsEmvData.applicationTransactionCounter) &&
        Objects.equals(this.cryptogram, cardPresentDetailsEmvData.cryptogram) &&
        Objects.equals(this.issuerCodeTableIndex, cardPresentDetailsEmvData.issuerCodeTableIndex) &&
        Objects.equals(this.pinVerified, cardPresentDetailsEmvData.pinVerified) &&
        Objects.equals(this.tags, cardPresentDetailsEmvData.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationIdentifier, applicationLabel, applicationPreferredName, applicationTransactionCounter, cryptogram, issuerCodeTableIndex, pinVerified, tags);
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
    sb.append("class CardPresentDetailsEmvData {\n");
    sb.append("    applicationIdentifier: ").append(toIndentedString(applicationIdentifier)).append("\n");
    sb.append("    applicationLabel: ").append(toIndentedString(applicationLabel)).append("\n");
    sb.append("    applicationPreferredName: ").append(toIndentedString(applicationPreferredName)).append("\n");
    sb.append("    applicationTransactionCounter: ").append(toIndentedString(applicationTransactionCounter)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    issuerCodeTableIndex: ").append(toIndentedString(issuerCodeTableIndex)).append("\n");
    sb.append("    pinVerified: ").append(toIndentedString(pinVerified)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("application_identifier");
    openapiFields.add("application_label");
    openapiFields.add("application_preferred_name");
    openapiFields.add("application_transaction_counter");
    openapiFields.add("cryptogram");
    openapiFields.add("issuer_code_table_index");
    openapiFields.add("pin_verified");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardPresentDetailsEmvData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardPresentDetailsEmvData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardPresentDetailsEmvData is not found in the empty JSON string", CardPresentDetailsEmvData.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardPresentDetailsEmvData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardPresentDetailsEmvData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("application_identifier") != null && !jsonObj.get("application_identifier").isJsonNull()  && !jsonObj.get("application_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_identifier").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("application_label") != null && !jsonObj.get("application_label").isJsonNull()  && !jsonObj.get("application_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_label").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("application_preferred_name") != null && !jsonObj.get("application_preferred_name").isJsonNull()  && !jsonObj.get("application_preferred_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_preferred_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_preferred_name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("application_transaction_counter") != null && !jsonObj.get("application_transaction_counter").isJsonNull()  && !jsonObj.get("application_transaction_counter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_transaction_counter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_transaction_counter").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("cryptogram") != null && !jsonObj.get("cryptogram").isJsonNull()  && !jsonObj.get("cryptogram").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cryptogram` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cryptogram").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("issuer_code_table_index") != null && !jsonObj.get("issuer_code_table_index").isJsonNull()  && !jsonObj.get("issuer_code_table_index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer_code_table_index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer_code_table_index").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardPresentDetailsEmvData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardPresentDetailsEmvData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardPresentDetailsEmvData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardPresentDetailsEmvData.class));

       return (TypeAdapter<T>) new TypeAdapter<CardPresentDetailsEmvData>() {
           @Override
           public void write(JsonWriter out, CardPresentDetailsEmvData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardPresentDetailsEmvData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardPresentDetailsEmvData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardPresentDetailsEmvData
  * @throws IOException if the JSON string is invalid with respect to CardPresentDetailsEmvData
  */
  public static CardPresentDetailsEmvData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardPresentDetailsEmvData.class);
  }

 /**
  * Convert an instance of CardPresentDetailsEmvData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

