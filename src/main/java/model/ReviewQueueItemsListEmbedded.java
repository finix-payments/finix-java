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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import model.ReviewQueueItemsListEmbeddedReviewQueueItemsInner;

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
 * ReviewQueueItemsListEmbedded
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T13:37:23.846763-07:00[America/Los_Angeles]")
public class ReviewQueueItemsListEmbedded {
  public static final String SERIALIZED_NAME_REVIEW_QUEUE_ITEMS = "review_queue_items";
  @SerializedName(SERIALIZED_NAME_REVIEW_QUEUE_ITEMS)
  private Set<ReviewQueueItemsListEmbeddedReviewQueueItemsInner> reviewQueueItems = null;

  public ReviewQueueItemsListEmbedded() { 
  }

  public ReviewQueueItemsListEmbedded reviewQueueItems(Set<ReviewQueueItemsListEmbeddedReviewQueueItemsInner> reviewQueueItems) {
    
    this.reviewQueueItems = reviewQueueItems;
    return this;
  }

  public ReviewQueueItemsListEmbedded addReviewQueueItemsItem(ReviewQueueItemsListEmbeddedReviewQueueItemsInner reviewQueueItemsItem) {
    if (this.reviewQueueItems == null) {
      this.reviewQueueItems = new LinkedHashSet<>();
    }
    this.reviewQueueItems.add(reviewQueueItemsItem);
    return this;
  }

   /**
   * Get reviewQueueItems
   * @return reviewQueueItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<ReviewQueueItemsListEmbeddedReviewQueueItemsInner> getReviewQueueItems() {
    return reviewQueueItems;
  }


  public void setReviewQueueItems(Set<ReviewQueueItemsListEmbeddedReviewQueueItemsInner> reviewQueueItems) {
    this.reviewQueueItems = reviewQueueItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewQueueItemsListEmbedded reviewQueueItemsListEmbedded = (ReviewQueueItemsListEmbedded) o;
    return Objects.equals(this.reviewQueueItems, reviewQueueItemsListEmbedded.reviewQueueItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewQueueItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewQueueItemsListEmbedded {\n");
    sb.append("    reviewQueueItems: ").append(toIndentedString(reviewQueueItems)).append("\n");
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
    openapiFields.add("review_queue_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReviewQueueItemsListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReviewQueueItemsListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReviewQueueItemsListEmbedded is not found in the empty JSON string", ReviewQueueItemsListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReviewQueueItemsListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReviewQueueItemsListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayreviewQueueItems = jsonObj.getAsJsonArray("review_queue_items");
      if (jsonArrayreviewQueueItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("review_queue_items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `review_queue_items` to be an array in the JSON string but got `%s`", jsonObj.get("review_queue_items").toString()));
        }

        // validate the optional field `review_queue_items` (array)
        for (int i = 0; i < jsonArrayreviewQueueItems.size(); i++) {
          ReviewQueueItemsListEmbeddedReviewQueueItemsInner.validateJsonObject(jsonArrayreviewQueueItems.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReviewQueueItemsListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReviewQueueItemsListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReviewQueueItemsListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReviewQueueItemsListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<ReviewQueueItemsListEmbedded>() {
           @Override
           public void write(JsonWriter out, ReviewQueueItemsListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReviewQueueItemsListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReviewQueueItemsListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReviewQueueItemsListEmbedded
  * @throws IOException if the JSON string is invalid with respect to ReviewQueueItemsListEmbedded
  */
  public static ReviewQueueItemsListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReviewQueueItemsListEmbedded.class);
  }

 /**
  * Convert an instance of ReviewQueueItemsListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

