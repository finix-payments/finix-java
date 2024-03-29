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
 * ListPaymentInstrumentsQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListPaymentInstrumentsQueryParams {
  public static final String SERIALIZED_NAME_ACCOUNT_LAST4 = "account_last4";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LAST4)
  private String accountLast4;

  public static final String SERIALIZED_NAME_ACCOUNT_ROUTING_NUMBER = "account_routing_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ROUTING_NUMBER)
  private String accountRoutingNumber;

  public static final String SERIALIZED_NAME_AFTER_CURSOR = "after_cursor";
  @SerializedName(SERIALIZED_NAME_AFTER_CURSOR)
  private String afterCursor;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_BEFORE_CURSOR = "before_cursor";
  @SerializedName(SERIALIZED_NAME_BEFORE_CURSOR)
  private String beforeCursor;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "created_at.gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "created_at.lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_EXPIRATION_MONTH = "expiration_month";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_MONTH)
  private String expirationMonth;

  public static final String SERIALIZED_NAME_EXPIRATION_YEAR = "expiration_year";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_YEAR)
  private String expirationYear;

  public static final String SERIALIZED_NAME_LAST_FOUR = "last_four";
  @SerializedName(SERIALIZED_NAME_LAST_FOUR)
  private String lastFour;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER_IDENTITY_ID = "owner_identity_id";
  @SerializedName(SERIALIZED_NAME_OWNER_IDENTITY_ID)
  private String ownerIdentityId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ListPaymentInstrumentsQueryParams() { 
  }

  public ListPaymentInstrumentsQueryParams accountLast4(String accountLast4) {
    
    this.accountLast4 = accountLast4;
    return this;
  }

   /**
   * Filter by the last 4 digits of the account if available.
   * @return accountLast4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the last 4 digits of the account if available.")

  public String getAccountLast4() {
    return accountLast4;
  }


  public void setAccountLast4(String accountLast4) {
    this.accountLast4 = accountLast4;
  }


  public ListPaymentInstrumentsQueryParams accountRoutingNumber(String accountRoutingNumber) {
    
    this.accountRoutingNumber = accountRoutingNumber;
    return this;
  }

   /**
   * Filter by the account routing number if available.
   * @return accountRoutingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the account routing number if available.")

  public String getAccountRoutingNumber() {
    return accountRoutingNumber;
  }


  public void setAccountRoutingNumber(String accountRoutingNumber) {
    this.accountRoutingNumber = accountRoutingNumber;
  }


  public ListPaymentInstrumentsQueryParams afterCursor(String afterCursor) {
    
    this.afterCursor = afterCursor;
    return this;
  }

   /**
   * Return every resource created after the cursor value.
   * @return afterCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return every resource created after the cursor value.")

  public String getAfterCursor() {
    return afterCursor;
  }


  public void setAfterCursor(String afterCursor) {
    this.afterCursor = afterCursor;
  }


  public ListPaymentInstrumentsQueryParams application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * Filter by &#x60;Application&#x60; ID.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `Application` ID.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public ListPaymentInstrumentsQueryParams beforeCursor(String beforeCursor) {
    
    this.beforeCursor = beforeCursor;
    return this;
  }

   /**
   * Return every resource created before the cursor value.
   * @return beforeCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return every resource created before the cursor value.")

  public String getBeforeCursor() {
    return beforeCursor;
  }


  public void setBeforeCursor(String beforeCursor) {
    this.beforeCursor = beforeCursor;
  }


  public ListPaymentInstrumentsQueryParams bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * Filter by Bank Identification Number (BIN). The BIN is the first 6 digits of the masked number.
   * @return bin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by Bank Identification Number (BIN). The BIN is the first 6 digits of the masked number.")

  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {
    this.bin = bin;
  }


  public ListPaymentInstrumentsQueryParams createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Filter where &#x60;created_at&#x60; is after the given date.
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `created_at` is after the given date.")

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public ListPaymentInstrumentsQueryParams createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Filter where &#x60;created_at&#x60; is before the given date.
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `created_at` is before the given date.")

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public ListPaymentInstrumentsQueryParams expirationMonth(String expirationMonth) {
    
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Filter by the expiration month associated with the &#x60;Payment Instrument&#x60; if applicable. This filter only applies to payment cards.
   * @return expirationMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the expiration month associated with the `Payment Instrument` if applicable. This filter only applies to payment cards.")

  public String getExpirationMonth() {
    return expirationMonth;
  }


  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }


  public ListPaymentInstrumentsQueryParams expirationYear(String expirationYear) {
    
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Filter by the 4 digit expiration year associated with the Payment Instrument if applicable. This filter only applies to payment cards.
   * @return expirationYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the 4 digit expiration year associated with the Payment Instrument if applicable. This filter only applies to payment cards.")

  public String getExpirationYear() {
    return expirationYear;
  }


  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }


  public ListPaymentInstrumentsQueryParams lastFour(String lastFour) {
    
    this.lastFour = lastFour;
    return this;
  }

   /**
   * Filter by the last 4 digits of the &#x60;Payment Instrument&#x60; card. This filter only applies to payment cards.
   * @return lastFour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the last 4 digits of the `Payment Instrument` card. This filter only applies to payment cards.")

  public String getLastFour() {
    return lastFour;
  }


  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }


  public ListPaymentInstrumentsQueryParams limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The numbers of items to return.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numbers of items to return.")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public ListPaymentInstrumentsQueryParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Filter by the name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ListPaymentInstrumentsQueryParams ownerIdentityId(String ownerIdentityId) {
    
    this.ownerIdentityId = ownerIdentityId;
    return this;
  }

   /**
   * Filter by the owner id of the associated &#x60;Identity&#x60;.
   * @return ownerIdentityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the owner id of the associated `Identity`.")

  public String getOwnerIdentityId() {
    return ownerIdentityId;
  }


  public void setOwnerIdentityId(String ownerIdentityId) {
    this.ownerIdentityId = ownerIdentityId;
  }


  public ListPaymentInstrumentsQueryParams type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Filter by the &#x60;Payment Instrument&#x60; type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the `Payment Instrument` type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPaymentInstrumentsQueryParams listPaymentInstrumentsQueryParams = (ListPaymentInstrumentsQueryParams) o;
    return Objects.equals(this.accountLast4, listPaymentInstrumentsQueryParams.accountLast4) &&
        Objects.equals(this.accountRoutingNumber, listPaymentInstrumentsQueryParams.accountRoutingNumber) &&
        Objects.equals(this.afterCursor, listPaymentInstrumentsQueryParams.afterCursor) &&
        Objects.equals(this.application, listPaymentInstrumentsQueryParams.application) &&
        Objects.equals(this.beforeCursor, listPaymentInstrumentsQueryParams.beforeCursor) &&
        Objects.equals(this.bin, listPaymentInstrumentsQueryParams.bin) &&
        Objects.equals(this.createdAtGte, listPaymentInstrumentsQueryParams.createdAtGte) &&
        Objects.equals(this.createdAtLte, listPaymentInstrumentsQueryParams.createdAtLte) &&
        Objects.equals(this.expirationMonth, listPaymentInstrumentsQueryParams.expirationMonth) &&
        Objects.equals(this.expirationYear, listPaymentInstrumentsQueryParams.expirationYear) &&
        Objects.equals(this.lastFour, listPaymentInstrumentsQueryParams.lastFour) &&
        Objects.equals(this.limit, listPaymentInstrumentsQueryParams.limit) &&
        Objects.equals(this.name, listPaymentInstrumentsQueryParams.name) &&
        Objects.equals(this.ownerIdentityId, listPaymentInstrumentsQueryParams.ownerIdentityId) &&
        Objects.equals(this.type, listPaymentInstrumentsQueryParams.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLast4, accountRoutingNumber, afterCursor, application, beforeCursor, bin, createdAtGte, createdAtLte, expirationMonth, expirationYear, lastFour, limit, name, ownerIdentityId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaymentInstrumentsQueryParams {\n");
    sb.append("    accountLast4: ").append(toIndentedString(accountLast4)).append("\n");
    sb.append("    accountRoutingNumber: ").append(toIndentedString(accountRoutingNumber)).append("\n");
    sb.append("    afterCursor: ").append(toIndentedString(afterCursor)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    beforeCursor: ").append(toIndentedString(beforeCursor)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerIdentityId: ").append(toIndentedString(ownerIdentityId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("account_last4");
    openapiFields.add("account_routing_number");
    openapiFields.add("after_cursor");
    openapiFields.add("application");
    openapiFields.add("before_cursor");
    openapiFields.add("bin");
    openapiFields.add("created_at.gte");
    openapiFields.add("created_at.lte");
    openapiFields.add("expiration_month");
    openapiFields.add("expiration_year");
    openapiFields.add("last_four");
    openapiFields.add("limit");
    openapiFields.add("name");
    openapiFields.add("owner_identity_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListPaymentInstrumentsQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListPaymentInstrumentsQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPaymentInstrumentsQueryParams is not found in the empty JSON string", ListPaymentInstrumentsQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListPaymentInstrumentsQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPaymentInstrumentsQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("account_last4") != null && !jsonObj.get("account_last4").isJsonNull()  && !jsonObj.get("account_last4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_last4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_last4").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("account_routing_number") != null && !jsonObj.get("account_routing_number").isJsonNull()  && !jsonObj.get("account_routing_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_routing_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_routing_number").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("after_cursor") != null && !jsonObj.get("after_cursor").isJsonNull()  && !jsonObj.get("after_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after_cursor").toString()));
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
      if (jsonObj.get("before_cursor") != null && !jsonObj.get("before_cursor").isJsonNull()  && !jsonObj.get("before_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `before_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("before_cursor").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("bin") != null && !jsonObj.get("bin").isJsonNull()  && !jsonObj.get("bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("created_at.gte") != null && !jsonObj.get("created_at.gte").isJsonNull()  && !jsonObj.get("created_at.gte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at.gte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at.gte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("created_at.lte") != null && !jsonObj.get("created_at.lte").isJsonNull()  && !jsonObj.get("created_at.lte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at.lte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at.lte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("expiration_month") != null && !jsonObj.get("expiration_month").isJsonNull()  && !jsonObj.get("expiration_month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_month").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("expiration_year") != null && !jsonObj.get("expiration_year").isJsonNull()  && !jsonObj.get("expiration_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_year").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("last_four") != null && !jsonObj.get("last_four").isJsonNull()  && !jsonObj.get("last_four").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_four` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_four").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()  && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("owner_identity_id") != null && !jsonObj.get("owner_identity_id").isJsonNull()  && !jsonObj.get("owner_identity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_identity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_identity_id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPaymentInstrumentsQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPaymentInstrumentsQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPaymentInstrumentsQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPaymentInstrumentsQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPaymentInstrumentsQueryParams>() {
           @Override
           public void write(JsonWriter out, ListPaymentInstrumentsQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPaymentInstrumentsQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPaymentInstrumentsQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPaymentInstrumentsQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListPaymentInstrumentsQueryParams
  */
  public static ListPaymentInstrumentsQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPaymentInstrumentsQueryParams.class);
  }

 /**
  * Convert an instance of ListPaymentInstrumentsQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

