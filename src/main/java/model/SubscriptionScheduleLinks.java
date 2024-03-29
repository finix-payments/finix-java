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
import model.IdentityLinksSelf;
import model.SubscriptionScheduleLinksAmounts;

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
 * For your convenience, every response includes several URLs which link to resources relevant to the request. You can use these &#x60;_links&#x60; to make your follow-up requests and quickly access relevant IDs.
 */
@ApiModel(description = "For your convenience, every response includes several URLs which link to resources relevant to the request. You can use these `_links` to make your follow-up requests and quickly access relevant IDs.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionScheduleLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private IdentityLinksSelf self;

  public static final String SERIALIZED_NAME_AMOUNTS = "amounts";
  @SerializedName(SERIALIZED_NAME_AMOUNTS)
  private SubscriptionScheduleLinksAmounts amounts;

  public SubscriptionScheduleLinks() { 
  }

  public SubscriptionScheduleLinks self(IdentityLinksSelf self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityLinksSelf getSelf() {
    return self;
  }


  public void setSelf(IdentityLinksSelf self) {
    this.self = self;
  }


  public SubscriptionScheduleLinks amounts(SubscriptionScheduleLinksAmounts amounts) {
    
    this.amounts = amounts;
    return this;
  }

   /**
   * Get amounts
   * @return amounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionScheduleLinksAmounts getAmounts() {
    return amounts;
  }


  public void setAmounts(SubscriptionScheduleLinksAmounts amounts) {
    this.amounts = amounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionScheduleLinks subscriptionScheduleLinks = (SubscriptionScheduleLinks) o;
    return Objects.equals(this.self, subscriptionScheduleLinks.self) &&
        Objects.equals(this.amounts, subscriptionScheduleLinks.amounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, amounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionScheduleLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    amounts: ").append(toIndentedString(amounts)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("amounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionScheduleLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionScheduleLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionScheduleLinks is not found in the empty JSON string", SubscriptionScheduleLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionScheduleLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionScheduleLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `self`
     // if (jsonObj.getAsJsonObject("self") != null) {
       //IdentityLinksSelf.validateJsonObject(jsonObj.getAsJsonObject("self"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `amounts`
     // if (jsonObj.getAsJsonObject("amounts") != null) {
       //SubscriptionScheduleLinksAmounts.validateJsonObject(jsonObj.getAsJsonObject("amounts"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionScheduleLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionScheduleLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionScheduleLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionScheduleLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionScheduleLinks>() {
           @Override
           public void write(JsonWriter out, SubscriptionScheduleLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionScheduleLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionScheduleLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionScheduleLinks
  * @throws IOException if the JSON string is invalid with respect to SubscriptionScheduleLinks
  */
  public static SubscriptionScheduleLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionScheduleLinks.class);
  }

 /**
  * Convert an instance of SubscriptionScheduleLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

