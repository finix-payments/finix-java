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
 * ListPaymentInstrumentUpdatesQueryParams
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListPaymentInstrumentUpdatesQueryParams {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public ListPaymentInstrumentUpdatesQueryParams() { 
  }

  public ListPaymentInstrumentUpdatesQueryParams limit(Long limit) {
    
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


  public ListPaymentInstrumentUpdatesQueryParams offset(Long offset) {
    
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


  public ListPaymentInstrumentUpdatesQueryParams pageSize(Long pageSize) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPaymentInstrumentUpdatesQueryParams listPaymentInstrumentUpdatesQueryParams = (ListPaymentInstrumentUpdatesQueryParams) o;
    return Objects.equals(this.limit, listPaymentInstrumentUpdatesQueryParams.limit) &&
        Objects.equals(this.offset, listPaymentInstrumentUpdatesQueryParams.offset) &&
        Objects.equals(this.pageSize, listPaymentInstrumentUpdatesQueryParams.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaymentInstrumentUpdatesQueryParams {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("pageSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListPaymentInstrumentUpdatesQueryParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListPaymentInstrumentUpdatesQueryParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPaymentInstrumentUpdatesQueryParams is not found in the empty JSON string", ListPaymentInstrumentUpdatesQueryParams.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListPaymentInstrumentUpdatesQueryParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPaymentInstrumentUpdatesQueryParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPaymentInstrumentUpdatesQueryParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPaymentInstrumentUpdatesQueryParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPaymentInstrumentUpdatesQueryParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPaymentInstrumentUpdatesQueryParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPaymentInstrumentUpdatesQueryParams>() {
           @Override
           public void write(JsonWriter out, ListPaymentInstrumentUpdatesQueryParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPaymentInstrumentUpdatesQueryParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPaymentInstrumentUpdatesQueryParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPaymentInstrumentUpdatesQueryParams
  * @throws IOException if the JSON string is invalid with respect to ListPaymentInstrumentUpdatesQueryParams
  */
  public static ListPaymentInstrumentUpdatesQueryParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPaymentInstrumentUpdatesQueryParams.class);
  }

 /**
  * Convert an instance of ListPaymentInstrumentUpdatesQueryParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

