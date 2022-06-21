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
 * ListMerchantTransfersQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-21T11:54:05.123637-05:00[America/Chicago]")
public class ListMerchantTransfersQueryParams {
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

  public static final String SERIALIZED_NAME_READY_TO_SETTLE = "ready_to_settle";
  @SerializedName(SERIALIZED_NAME_READY_TO_SETTLE)
  private Boolean readyToSettle;

  public ListMerchantTransfersQueryParams() { 
  }

  public ListMerchantTransfersQueryParams limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The number of entries to return.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of entries to return.")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public ListMerchantTransfersQueryParams offset(Long offset) {
    
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


  public ListMerchantTransfersQueryParams pageNumber(Long pageNumber) {
    
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


  public ListMerchantTransfersQueryParams pageSize(Long pageSize) {
    
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


  public ListMerchantTransfersQueryParams readyToSettle(Boolean readyToSettle) {
    
    this.readyToSettle = readyToSettle;
    return this;
  }

   /**
   * ready_to_settle
   * @return readyToSettle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ready_to_settle")

  public Boolean getReadyToSettle() {
    return readyToSettle;
  }


  public void setReadyToSettle(Boolean readyToSettle) {
    this.readyToSettle = readyToSettle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMerchantTransfersQueryParams listMerchantTransfersQueryParams = (ListMerchantTransfersQueryParams) o;
    return Objects.equals(this.limit, listMerchantTransfersQueryParams.limit) &&
        Objects.equals(this.offset, listMerchantTransfersQueryParams.offset) &&
        Objects.equals(this.pageNumber, listMerchantTransfersQueryParams.pageNumber) &&
        Objects.equals(this.pageSize, listMerchantTransfersQueryParams.pageSize) &&
        Objects.equals(this.readyToSettle, listMerchantTransfersQueryParams.readyToSettle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, pageNumber, pageSize, readyToSettle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMerchantTransfersQueryParams {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    readyToSettle: ").append(toIndentedString(readyToSettle)).append("\n");
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
    openapiFields.add("ready_to_settle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListMerchantTransfersQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListMerchantTransfersQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListMerchantTransfersQueryParams is not found in the empty JSON string", ListMerchantTransfersQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListMerchantTransfersQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListMerchantTransfersQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListMerchantTransfersQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListMerchantTransfersQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListMerchantTransfersQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListMerchantTransfersQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListMerchantTransfersQueryParams>() {
           @Override
           public void write(JsonWriter out, ListMerchantTransfersQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListMerchantTransfersQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListMerchantTransfersQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListMerchantTransfersQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListMerchantTransfersQueryParams
  */
  public static ListMerchantTransfersQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListMerchantTransfersQueryParams.class);
  }

 /**
  * Convert an instance of ListMerchantTransfersQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

