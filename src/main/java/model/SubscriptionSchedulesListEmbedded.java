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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import model.SubscriptionSchedule;

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
 * List of &#x60;subscription_schedule&#x60; objects.
 */
@ApiModel(description = "List of `subscription_schedule` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionSchedulesListEmbedded {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_SCHEDULES = "subscription_schedules";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SCHEDULES)
  private Set<SubscriptionSchedule> subscriptionSchedules = null;

  public SubscriptionSchedulesListEmbedded() { 
  }

  public SubscriptionSchedulesListEmbedded subscriptionSchedules(Set<SubscriptionSchedule> subscriptionSchedules) {
    
    this.subscriptionSchedules = subscriptionSchedules;
    return this;
  }

  public SubscriptionSchedulesListEmbedded addSubscriptionSchedulesItem(SubscriptionSchedule subscriptionSchedulesItem) {
    if (this.subscriptionSchedules == null) {
      this.subscriptionSchedules = new LinkedHashSet<>();
    }
    this.subscriptionSchedules.add(subscriptionSchedulesItem);
    return this;
  }

   /**
   * &#x60;subscription_schedule&#x60; objects.
   * @return subscriptionSchedules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`subscription_schedule` objects.")

  public Set<SubscriptionSchedule> getSubscriptionSchedules() {
    return subscriptionSchedules;
  }


  public void setSubscriptionSchedules(Set<SubscriptionSchedule> subscriptionSchedules) {
    this.subscriptionSchedules = subscriptionSchedules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSchedulesListEmbedded subscriptionSchedulesListEmbedded = (SubscriptionSchedulesListEmbedded) o;
    return Objects.equals(this.subscriptionSchedules, subscriptionSchedulesListEmbedded.subscriptionSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSchedulesListEmbedded {\n");
    sb.append("    subscriptionSchedules: ").append(toIndentedString(subscriptionSchedules)).append("\n");
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
    openapiFields.add("subscription_schedules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionSchedulesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionSchedulesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionSchedulesListEmbedded is not found in the empty JSON string", SubscriptionSchedulesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionSchedulesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionSchedulesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraysubscriptionSchedules = jsonObj.getAsJsonArray("subscription_schedules");
      if (jsonArraysubscriptionSchedules != null) {
        // ensure the json data is an array
        if (!jsonObj.get("subscription_schedules").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `subscription_schedules` to be an array in the JSON string but got `%s`", jsonObj.get("subscription_schedules").toString()));
        }

        // validate the optional field `subscription_schedules` (array)
        for (int i = 0; i < jsonArraysubscriptionSchedules.size(); i++) {
          SubscriptionSchedule.validateJsonObject(jsonArraysubscriptionSchedules.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionSchedulesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionSchedulesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionSchedulesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionSchedulesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionSchedulesListEmbedded>() {
           @Override
           public void write(JsonWriter out, SubscriptionSchedulesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionSchedulesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionSchedulesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionSchedulesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to SubscriptionSchedulesListEmbedded
  */
  public static SubscriptionSchedulesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionSchedulesListEmbedded.class);
  }

 /**
  * Convert an instance of SubscriptionSchedulesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

