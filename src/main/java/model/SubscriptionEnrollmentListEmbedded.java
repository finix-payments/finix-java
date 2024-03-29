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
import model.SubscriptionEnrollment;

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
 * List of &#x60;Subscription Enrollment&#x60; resources.
 */
@ApiModel(description = "List of `Subscription Enrollment` resources.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionEnrollmentListEmbedded {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ENROLLMENTS = "subscription_enrollments";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ENROLLMENTS)
  private Set<SubscriptionEnrollment> subscriptionEnrollments = null;

  public SubscriptionEnrollmentListEmbedded() { 
  }

  public SubscriptionEnrollmentListEmbedded subscriptionEnrollments(Set<SubscriptionEnrollment> subscriptionEnrollments) {
    
    this.subscriptionEnrollments = subscriptionEnrollments;
    return this;
  }

  public SubscriptionEnrollmentListEmbedded addSubscriptionEnrollmentsItem(SubscriptionEnrollment subscriptionEnrollmentsItem) {
    if (this.subscriptionEnrollments == null) {
      this.subscriptionEnrollments = new LinkedHashSet<>();
    }
    this.subscriptionEnrollments.add(subscriptionEnrollmentsItem);
    return this;
  }

   /**
   * &#x60;Subscription Enrollment&#x60; resources.
   * @return subscriptionEnrollments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Subscription Enrollment` resources.")

  public Set<SubscriptionEnrollment> getSubscriptionEnrollments() {
    return subscriptionEnrollments;
  }


  public void setSubscriptionEnrollments(Set<SubscriptionEnrollment> subscriptionEnrollments) {
    this.subscriptionEnrollments = subscriptionEnrollments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionEnrollmentListEmbedded subscriptionEnrollmentListEmbedded = (SubscriptionEnrollmentListEmbedded) o;
    return Objects.equals(this.subscriptionEnrollments, subscriptionEnrollmentListEmbedded.subscriptionEnrollments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionEnrollments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionEnrollmentListEmbedded {\n");
    sb.append("    subscriptionEnrollments: ").append(toIndentedString(subscriptionEnrollments)).append("\n");
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
    openapiFields.add("subscription_enrollments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionEnrollmentListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionEnrollmentListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionEnrollmentListEmbedded is not found in the empty JSON string", SubscriptionEnrollmentListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionEnrollmentListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionEnrollmentListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraysubscriptionEnrollments = jsonObj.getAsJsonArray("subscription_enrollments");
      if (jsonArraysubscriptionEnrollments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("subscription_enrollments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `subscription_enrollments` to be an array in the JSON string but got `%s`", jsonObj.get("subscription_enrollments").toString()));
        }

        // validate the optional field `subscription_enrollments` (array)
        for (int i = 0; i < jsonArraysubscriptionEnrollments.size(); i++) {
          SubscriptionEnrollment.validateJsonObject(jsonArraysubscriptionEnrollments.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionEnrollmentListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionEnrollmentListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionEnrollmentListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionEnrollmentListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionEnrollmentListEmbedded>() {
           @Override
           public void write(JsonWriter out, SubscriptionEnrollmentListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionEnrollmentListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionEnrollmentListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionEnrollmentListEmbedded
  * @throws IOException if the JSON string is invalid with respect to SubscriptionEnrollmentListEmbedded
  */
  public static SubscriptionEnrollmentListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionEnrollmentListEmbedded.class);
  }

 /**
  * Convert an instance of SubscriptionEnrollmentListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

