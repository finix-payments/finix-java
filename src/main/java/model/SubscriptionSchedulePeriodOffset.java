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
 * Specifies when the &#x60;Fee&#x60; is charged. This field is **null** for **FIXED_TIME_INTERVAL** &#x60;Subscription Schedules&#x60;.
 */
@ApiModel(description = "Specifies when the `Fee` is charged. This field is **null** for **FIXED_TIME_INTERVAL** `Subscription Schedules`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionSchedulePeriodOffset {
  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private Long day;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Long month;

  public SubscriptionSchedulePeriodOffset() { 
  }

  public SubscriptionSchedulePeriodOffset day(Long day) {
    
    this.day = day;
    return this;
  }

   /**
   * Specifies the day when the &#x60;Subscription Schedule&#x60; starts.
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the day when the `Subscription Schedule` starts.")

  public Long getDay() {
    return day;
  }


  public void setDay(Long day) {
    this.day = day;
  }


  public SubscriptionSchedulePeriodOffset month(Long month) {
    
    this.month = month;
    return this;
  }

   /**
   * Specifies the month when the &#x60;Subscription Schedule&#x60; starts. If the &#x60;Subscription Schedule&#x60; is **PERIODIC_MONTHLY**, the month field can be left **null**.
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the month when the `Subscription Schedule` starts. If the `Subscription Schedule` is **PERIODIC_MONTHLY**, the month field can be left **null**.")

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
    SubscriptionSchedulePeriodOffset subscriptionSchedulePeriodOffset = (SubscriptionSchedulePeriodOffset) o;
    return Objects.equals(this.day, subscriptionSchedulePeriodOffset.day) &&
        Objects.equals(this.month, subscriptionSchedulePeriodOffset.month);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, month);
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
    sb.append("class SubscriptionSchedulePeriodOffset {\n");
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
    openapiFields.add("day");
    openapiFields.add("month");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionSchedulePeriodOffset
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionSchedulePeriodOffset.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionSchedulePeriodOffset is not found in the empty JSON string", SubscriptionSchedulePeriodOffset.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionSchedulePeriodOffset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionSchedulePeriodOffset` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionSchedulePeriodOffset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionSchedulePeriodOffset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionSchedulePeriodOffset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionSchedulePeriodOffset.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionSchedulePeriodOffset>() {
           @Override
           public void write(JsonWriter out, SubscriptionSchedulePeriodOffset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionSchedulePeriodOffset read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionSchedulePeriodOffset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionSchedulePeriodOffset
  * @throws IOException if the JSON string is invalid with respect to SubscriptionSchedulePeriodOffset
  */
  public static SubscriptionSchedulePeriodOffset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionSchedulePeriodOffset.class);
  }

 /**
  * Convert an instance of SubscriptionSchedulePeriodOffset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

