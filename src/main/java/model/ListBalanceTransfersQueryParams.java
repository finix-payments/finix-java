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
 * ListBalanceTransfersQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListBalanceTransfersQueryParams {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Long pageNumber;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "created_at.gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "created_at.lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_UPDATED_AT_GTE = "updated_at.gte";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_GTE)
  private String updatedAtGte;

  public static final String SERIALIZED_NAME_UPDATED_AT_LTE = "updated_at.lte";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_LTE)
  private String updatedAtLte;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_ID = "idempotency_id";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_ID)
  private String idempotencyId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_EXTERNAL_REFERENCE_ID = "external_reference_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_REFERENCE_ID)
  private String externalReferenceId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public ListBalanceTransfersQueryParams() { 
  }

  public ListBalanceTransfersQueryParams limit(Long limit) {
    
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


  public ListBalanceTransfersQueryParams offset(Long offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of items to skip before starting to collect the result set.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items to skip before starting to collect the result set.")

  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    this.offset = offset;
  }


  public ListBalanceTransfersQueryParams pageNumber(Long pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * The page number to list.
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The page number to list.")

  public Long getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }


  public ListBalanceTransfersQueryParams pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The size of the page.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the page.")

  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public ListBalanceTransfersQueryParams createdAtGte(String createdAtGte) {
    
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


  public ListBalanceTransfersQueryParams createdAtLte(String createdAtLte) {
    
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


  public ListBalanceTransfersQueryParams updatedAtGte(String updatedAtGte) {
    
    this.updatedAtGte = updatedAtGte;
    return this;
  }

   /**
   * Filter where &#x60;updated_at&#x60; is after the given date.
   * @return updatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `updated_at` is after the given date.")

  public String getUpdatedAtGte() {
    return updatedAtGte;
  }


  public void setUpdatedAtGte(String updatedAtGte) {
    this.updatedAtGte = updatedAtGte;
  }


  public ListBalanceTransfersQueryParams updatedAtLte(String updatedAtLte) {
    
    this.updatedAtLte = updatedAtLte;
    return this;
  }

   /**
   * Filter where &#x60;updated_at&#x60; is before the given date.
   * @return updatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter where `updated_at` is before the given date.")

  public String getUpdatedAtLte() {
    return updatedAtLte;
  }


  public void setUpdatedAtLte(String updatedAtLte) {
    this.updatedAtLte = updatedAtLte;
  }


  public ListBalanceTransfersQueryParams idempotencyId(String idempotencyId) {
    
    this.idempotencyId = idempotencyId;
    return this;
  }

   /**
   * Filter by &#x60;idempotency_id&#x60;.
   * @return idempotencyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by `idempotency_id`.")

  public String getIdempotencyId() {
    return idempotencyId;
  }


  public void setIdempotencyId(String idempotencyId) {
    this.idempotencyId = idempotencyId;
  }


  public ListBalanceTransfersQueryParams amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Filter by an amount equal to the given value.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by an amount equal to the given value.")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public ListBalanceTransfersQueryParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Filter by the &#x60;Description&#x60; value .
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the `Description` value .")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ListBalanceTransfersQueryParams destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Filter by the &#x60;Payment Instrument&#x60; saved in &#x60;Destination&#x60;.
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the `Payment Instrument` saved in `Destination`.")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public ListBalanceTransfersQueryParams externalReferenceId(String externalReferenceId) {
    
    this.externalReferenceId = externalReferenceId;
    return this;
  }

   /**
   * Filter by the value saved in &#x60;external_reference_id&#x60;.
   * @return externalReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the value saved in `external_reference_id`.")

  public String getExternalReferenceId() {
    return externalReferenceId;
  }


  public void setExternalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
  }


  public ListBalanceTransfersQueryParams referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Filter by the value saved in &#x60;reference_id&#x60;.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the value saved in `reference_id`.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public ListBalanceTransfersQueryParams source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Filter by the &#x60;Payment Instrument&#x60; saved in &#x60;source&#x60;.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the `Payment Instrument` saved in `source`.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBalanceTransfersQueryParams listBalanceTransfersQueryParams = (ListBalanceTransfersQueryParams) o;
    return Objects.equals(this.limit, listBalanceTransfersQueryParams.limit) &&
        Objects.equals(this.offset, listBalanceTransfersQueryParams.offset) &&
        Objects.equals(this.pageNumber, listBalanceTransfersQueryParams.pageNumber) &&
        Objects.equals(this.pageSize, listBalanceTransfersQueryParams.pageSize) &&
        Objects.equals(this.createdAtGte, listBalanceTransfersQueryParams.createdAtGte) &&
        Objects.equals(this.createdAtLte, listBalanceTransfersQueryParams.createdAtLte) &&
        Objects.equals(this.updatedAtGte, listBalanceTransfersQueryParams.updatedAtGte) &&
        Objects.equals(this.updatedAtLte, listBalanceTransfersQueryParams.updatedAtLte) &&
        Objects.equals(this.idempotencyId, listBalanceTransfersQueryParams.idempotencyId) &&
        Objects.equals(this.amount, listBalanceTransfersQueryParams.amount) &&
        Objects.equals(this.description, listBalanceTransfersQueryParams.description) &&
        Objects.equals(this.destination, listBalanceTransfersQueryParams.destination) &&
        Objects.equals(this.externalReferenceId, listBalanceTransfersQueryParams.externalReferenceId) &&
        Objects.equals(this.referenceId, listBalanceTransfersQueryParams.referenceId) &&
        Objects.equals(this.source, listBalanceTransfersQueryParams.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, pageNumber, pageSize, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte, idempotencyId, amount, description, destination, externalReferenceId, referenceId, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBalanceTransfersQueryParams {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
    sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
    sb.append("    idempotencyId: ").append(toIndentedString(idempotencyId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    externalReferenceId: ").append(toIndentedString(externalReferenceId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("pageNumber");
    openapiFields.add("pageSize");
    openapiFields.add("created_at.gte");
    openapiFields.add("created_at.lte");
    openapiFields.add("updated_at.gte");
    openapiFields.add("updated_at.lte");
    openapiFields.add("idempotency_id");
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("destination");
    openapiFields.add("external_reference_id");
    openapiFields.add("reference_id");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListBalanceTransfersQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListBalanceTransfersQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBalanceTransfersQueryParams is not found in the empty JSON string", ListBalanceTransfersQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListBalanceTransfersQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBalanceTransfersQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
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
      if (jsonObj.get("updated_at.gte") != null && !jsonObj.get("updated_at.gte").isJsonNull()  && !jsonObj.get("updated_at.gte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at.gte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at.gte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("updated_at.lte") != null && !jsonObj.get("updated_at.lte").isJsonNull()  && !jsonObj.get("updated_at.lte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at.lte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at.lte").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("idempotency_id") != null && !jsonObj.get("idempotency_id").isJsonNull()  && !jsonObj.get("idempotency_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotency_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotency_id").toString()));
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBalanceTransfersQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBalanceTransfersQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBalanceTransfersQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBalanceTransfersQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBalanceTransfersQueryParams>() {
           @Override
           public void write(JsonWriter out, ListBalanceTransfersQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBalanceTransfersQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListBalanceTransfersQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListBalanceTransfersQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListBalanceTransfersQueryParams
  */
  public static ListBalanceTransfersQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBalanceTransfersQueryParams.class);
  }

 /**
  * Convert an instance of ListBalanceTransfersQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

