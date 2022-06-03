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
import java.math.BigDecimal;

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
 * The date the company was founded and registered with the US.
 */
@ApiModel(description = "The date the company was founded and registered with the US.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-03T16:00:09.531596-05:00[America/Chicago]")
public class CreateIdentityRequestEntityIncorporationDate {
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private BigDecimal year;

  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private BigDecimal day;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private BigDecimal month;

  public CreateIdentityRequestEntityIncorporationDate() { 
  }

  public CreateIdentityRequestEntityIncorporationDate year(BigDecimal year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getYear() {
    return year;
  }


  public void setYear(BigDecimal year) {
    this.year = year;
  }


  public CreateIdentityRequestEntityIncorporationDate day(BigDecimal day) {
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDay() {
    return day;
  }


  public void setDay(BigDecimal day) {
    this.day = day;
  }


  public CreateIdentityRequestEntityIncorporationDate month(BigDecimal month) {
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMonth() {
    return month;
  }


  public void setMonth(BigDecimal month) {
    this.month = month;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIdentityRequestEntityIncorporationDate createIdentityRequestEntityIncorporationDate = (CreateIdentityRequestEntityIncorporationDate) o;
    return Objects.equals(this.year, createIdentityRequestEntityIncorporationDate.year) &&
        Objects.equals(this.day, createIdentityRequestEntityIncorporationDate.day) &&
        Objects.equals(this.month, createIdentityRequestEntityIncorporationDate.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, day, month);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIdentityRequestEntityIncorporationDate {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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
    openapiFields.add("year");
    openapiFields.add("day");
    openapiFields.add("month");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateIdentityRequestEntityIncorporationDate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateIdentityRequestEntityIncorporationDate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateIdentityRequestEntityIncorporationDate is not found in the empty JSON string", CreateIdentityRequestEntityIncorporationDate.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateIdentityRequestEntityIncorporationDate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateIdentityRequestEntityIncorporationDate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateIdentityRequestEntityIncorporationDate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateIdentityRequestEntityIncorporationDate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateIdentityRequestEntityIncorporationDate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateIdentityRequestEntityIncorporationDate.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateIdentityRequestEntityIncorporationDate>() {
           @Override
           public void write(JsonWriter out, CreateIdentityRequestEntityIncorporationDate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateIdentityRequestEntityIncorporationDate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateIdentityRequestEntityIncorporationDate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateIdentityRequestEntityIncorporationDate
  * @throws IOException if the JSON string is invalid with respect to CreateIdentityRequestEntityIncorporationDate
  */
  public static CreateIdentityRequestEntityIncorporationDate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateIdentityRequestEntityIncorporationDate.class);
  }

 /**
  * Convert an instance of CreateIdentityRequestEntityIncorporationDate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
