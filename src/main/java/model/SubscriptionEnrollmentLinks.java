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
import model.SubscriptionEnrollmentLinksAmounts;
import model.SubscriptionEnrollmentLinksMerchant;
import model.SubscriptionEnrollmentLinksSchedule;

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
public class SubscriptionEnrollmentLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private IdentityLinksSelf self;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private SubscriptionEnrollmentLinksMerchant merchant;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private SubscriptionEnrollmentLinksSchedule schedule;

  public static final String SERIALIZED_NAME_AMOUNTS = "amounts";
  @SerializedName(SERIALIZED_NAME_AMOUNTS)
  private SubscriptionEnrollmentLinksAmounts amounts;

  public SubscriptionEnrollmentLinks() { 
  }

  public SubscriptionEnrollmentLinks self(IdentityLinksSelf self) {
    
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


  public SubscriptionEnrollmentLinks merchant(SubscriptionEnrollmentLinksMerchant merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionEnrollmentLinksMerchant getMerchant() {
    return merchant;
  }


  public void setMerchant(SubscriptionEnrollmentLinksMerchant merchant) {
    this.merchant = merchant;
  }


  public SubscriptionEnrollmentLinks schedule(SubscriptionEnrollmentLinksSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionEnrollmentLinksSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(SubscriptionEnrollmentLinksSchedule schedule) {
    this.schedule = schedule;
  }


  public SubscriptionEnrollmentLinks amounts(SubscriptionEnrollmentLinksAmounts amounts) {
    
    this.amounts = amounts;
    return this;
  }

   /**
   * Get amounts
   * @return amounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionEnrollmentLinksAmounts getAmounts() {
    return amounts;
  }


  public void setAmounts(SubscriptionEnrollmentLinksAmounts amounts) {
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
    SubscriptionEnrollmentLinks subscriptionEnrollmentLinks = (SubscriptionEnrollmentLinks) o;
    return Objects.equals(this.self, subscriptionEnrollmentLinks.self) &&
        Objects.equals(this.merchant, subscriptionEnrollmentLinks.merchant) &&
        Objects.equals(this.schedule, subscriptionEnrollmentLinks.schedule) &&
        Objects.equals(this.amounts, subscriptionEnrollmentLinks.amounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, merchant, schedule, amounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionEnrollmentLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
    openapiFields.add("merchant");
    openapiFields.add("schedule");
    openapiFields.add("amounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionEnrollmentLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionEnrollmentLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionEnrollmentLinks is not found in the empty JSON string", SubscriptionEnrollmentLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionEnrollmentLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionEnrollmentLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      // validate the optional field `merchant`
     // if (jsonObj.getAsJsonObject("merchant") != null) {
       //SubscriptionEnrollmentLinksMerchant.validateJsonObject(jsonObj.getAsJsonObject("merchant"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `schedule`
     // if (jsonObj.getAsJsonObject("schedule") != null) {
       //SubscriptionEnrollmentLinksSchedule.validateJsonObject(jsonObj.getAsJsonObject("schedule"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `amounts`
     // if (jsonObj.getAsJsonObject("amounts") != null) {
       //SubscriptionEnrollmentLinksAmounts.validateJsonObject(jsonObj.getAsJsonObject("amounts"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionEnrollmentLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionEnrollmentLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionEnrollmentLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionEnrollmentLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionEnrollmentLinks>() {
           @Override
           public void write(JsonWriter out, SubscriptionEnrollmentLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionEnrollmentLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionEnrollmentLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionEnrollmentLinks
  * @throws IOException if the JSON string is invalid with respect to SubscriptionEnrollmentLinks
  */
  public static SubscriptionEnrollmentLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionEnrollmentLinks.class);
  }

 /**
  * Convert an instance of SubscriptionEnrollmentLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

