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
import model.SubscriptionAmount;

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
 * List of &#x60;subscription_amount&#x60; objects.
 */
@ApiModel(description = "List of `subscription_amount` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionAmountListEmbedded {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_AMOUNTS = "subscription_amounts";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_AMOUNTS)
  private Set<SubscriptionAmount> subscriptionAmounts = null;

  public SubscriptionAmountListEmbedded() { 
  }

  public SubscriptionAmountListEmbedded subscriptionAmounts(Set<SubscriptionAmount> subscriptionAmounts) {
    
    this.subscriptionAmounts = subscriptionAmounts;
    return this;
  }

  public SubscriptionAmountListEmbedded addSubscriptionAmountsItem(SubscriptionAmount subscriptionAmountsItem) {
    if (this.subscriptionAmounts == null) {
      this.subscriptionAmounts = new LinkedHashSet<>();
    }
    this.subscriptionAmounts.add(subscriptionAmountsItem);
    return this;
  }

   /**
   * &#x60;subscription_amount&#x60; objects.
   * @return subscriptionAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`subscription_amount` objects.")

  public Set<SubscriptionAmount> getSubscriptionAmounts() {
    return subscriptionAmounts;
  }


  public void setSubscriptionAmounts(Set<SubscriptionAmount> subscriptionAmounts) {
    this.subscriptionAmounts = subscriptionAmounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAmountListEmbedded subscriptionAmountListEmbedded = (SubscriptionAmountListEmbedded) o;
    return Objects.equals(this.subscriptionAmounts, subscriptionAmountListEmbedded.subscriptionAmounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionAmounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAmountListEmbedded {\n");
    sb.append("    subscriptionAmounts: ").append(toIndentedString(subscriptionAmounts)).append("\n");
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
    openapiFields.add("subscription_amounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionAmountListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionAmountListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionAmountListEmbedded is not found in the empty JSON string", SubscriptionAmountListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionAmountListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionAmountListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraysubscriptionAmounts = jsonObj.getAsJsonArray("subscription_amounts");
      if (jsonArraysubscriptionAmounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("subscription_amounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `subscription_amounts` to be an array in the JSON string but got `%s`", jsonObj.get("subscription_amounts").toString()));
        }

        // validate the optional field `subscription_amounts` (array)
        for (int i = 0; i < jsonArraysubscriptionAmounts.size(); i++) {
          SubscriptionAmount.validateJsonObject(jsonArraysubscriptionAmounts.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionAmountListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionAmountListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionAmountListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionAmountListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionAmountListEmbedded>() {
           @Override
           public void write(JsonWriter out, SubscriptionAmountListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionAmountListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionAmountListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionAmountListEmbedded
  * @throws IOException if the JSON string is invalid with respect to SubscriptionAmountListEmbedded
  */
  public static SubscriptionAmountListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionAmountListEmbedded.class);
  }

 /**
  * Convert an instance of SubscriptionAmountListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

