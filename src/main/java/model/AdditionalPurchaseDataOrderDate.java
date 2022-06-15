/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2018-01-01
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
 * AdditionalPurchaseDataOrderDate
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T16:04:59.372163-05:00[America/Chicago]")
public class AdditionalPurchaseDataOrderDate {
  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private Integer day;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public AdditionalPurchaseDataOrderDate() { 
  }

  public AdditionalPurchaseDataOrderDate day(Integer day) {
    
    this.day = day;
    return this;
  }

   /**
   * Day of purchase (between 1 and 31)
   * @return day
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Day of purchase (between 1 and 31)")

  public Integer getDay() {
    return day;
  }


  public void setDay(Integer day) {
    this.day = day;
  }


  public AdditionalPurchaseDataOrderDate month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * Month of purchase (between 1 and 12)
   * @return month
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Month of purchase (between 1 and 12)")

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public AdditionalPurchaseDataOrderDate year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * Year of purchase (4-digit)
   * @return year
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Year of purchase (4-digit)")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPurchaseDataOrderDate additionalPurchaseDataOrderDate = (AdditionalPurchaseDataOrderDate) o;
    return Objects.equals(this.day, additionalPurchaseDataOrderDate.day) &&
        Objects.equals(this.month, additionalPurchaseDataOrderDate.month) &&
        Objects.equals(this.year, additionalPurchaseDataOrderDate.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPurchaseDataOrderDate {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("day");
    openapiFields.add("month");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("day");
    openapiRequiredFields.add("month");
    openapiRequiredFields.add("year");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalPurchaseDataOrderDate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalPurchaseDataOrderDate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalPurchaseDataOrderDate is not found in the empty JSON string", AdditionalPurchaseDataOrderDate.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalPurchaseDataOrderDate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalPurchaseDataOrderDate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : AdditionalPurchaseDataOrderDate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalPurchaseDataOrderDate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalPurchaseDataOrderDate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalPurchaseDataOrderDate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalPurchaseDataOrderDate.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalPurchaseDataOrderDate>() {
           @Override
           public void write(JsonWriter out, AdditionalPurchaseDataOrderDate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalPurchaseDataOrderDate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalPurchaseDataOrderDate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalPurchaseDataOrderDate
  * @throws IOException if the JSON string is invalid with respect to AdditionalPurchaseDataOrderDate
  */
  public static AdditionalPurchaseDataOrderDate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalPurchaseDataOrderDate.class);
  }

 /**
  * Convert an instance of AdditionalPurchaseDataOrderDate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

