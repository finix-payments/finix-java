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
 * Date company was founded.
 */
@ApiModel(description = "Date company was founded.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityEntityFormIncorporationDate {
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Long year;

  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private Long day;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Long month;

  public IdentityEntityFormIncorporationDate() { 
  }

  public IdentityEntityFormIncorporationDate year(Long year) {
    
    this.year = year;
    return this;
  }

   /**
   * Year business was incorporated (4-digit).
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Year business was incorporated (4-digit).")

  public Long getYear() {
    return year;
  }


  public void setYear(Long year) {
    this.year = year;
  }


  public IdentityEntityFormIncorporationDate day(Long day) {
    
    this.day = day;
    return this;
  }

   /**
   * Day business was incorporated (between 1 and 31).
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Day business was incorporated (between 1 and 31).")

  public Long getDay() {
    return day;
  }


  public void setDay(Long day) {
    this.day = day;
  }


  public IdentityEntityFormIncorporationDate month(Long month) {
    
    this.month = month;
    return this;
  }

   /**
   * Month business was incorporated (between 1 and 12).
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Month business was incorporated (between 1 and 12).")

  public Long getMonth() {
    return month;
  }


  public void setMonth(Long month) {
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
    IdentityEntityFormIncorporationDate identityEntityFormIncorporationDate = (IdentityEntityFormIncorporationDate) o;
    return Objects.equals(this.year, identityEntityFormIncorporationDate.year) &&
        Objects.equals(this.day, identityEntityFormIncorporationDate.day) &&
        Objects.equals(this.month, identityEntityFormIncorporationDate.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, day, month);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityEntityFormIncorporationDate {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to IdentityEntityFormIncorporationDate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentityEntityFormIncorporationDate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityEntityFormIncorporationDate is not found in the empty JSON string", IdentityEntityFormIncorporationDate.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityEntityFormIncorporationDate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityEntityFormIncorporationDate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityEntityFormIncorporationDate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityEntityFormIncorporationDate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityEntityFormIncorporationDate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityEntityFormIncorporationDate.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityEntityFormIncorporationDate>() {
           @Override
           public void write(JsonWriter out, IdentityEntityFormIncorporationDate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityEntityFormIncorporationDate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityEntityFormIncorporationDate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityEntityFormIncorporationDate
  * @throws IOException if the JSON string is invalid with respect to IdentityEntityFormIncorporationDate
  */
  public static IdentityEntityFormIncorporationDate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityEntityFormIncorporationDate.class);
  }

 /**
  * Convert an instance of IdentityEntityFormIncorporationDate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

