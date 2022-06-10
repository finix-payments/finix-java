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
import model.ApplicationLinksApplicationProfile;

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
 * ReviewQueueItemsListEmbeddedLinks
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-09T19:07:27.149649-05:00[America/Chicago]")
public class ReviewQueueItemsListEmbeddedLinks {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private ApplicationLinksApplicationProfile application;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private ApplicationLinksApplicationProfile identity;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private ApplicationLinksApplicationProfile merchant;

  public static final String SERIALIZED_NAME_REVIEW_BY = "review_by";
  @SerializedName(SERIALIZED_NAME_REVIEW_BY)
  private ApplicationLinksApplicationProfile reviewBy;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksApplicationProfile self;

  public static final String SERIALIZED_NAME_SETTLEMENT = "settlement";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT)
  private ApplicationLinksApplicationProfile settlement;

  public ReviewQueueItemsListEmbeddedLinks() { 
  }

  public ReviewQueueItemsListEmbeddedLinks application(ApplicationLinksApplicationProfile application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getApplication() {
    return application;
  }


  public void setApplication(ApplicationLinksApplicationProfile application) {
    this.application = application;
  }


  public ReviewQueueItemsListEmbeddedLinks identity(ApplicationLinksApplicationProfile identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getIdentity() {
    return identity;
  }


  public void setIdentity(ApplicationLinksApplicationProfile identity) {
    this.identity = identity;
  }


  public ReviewQueueItemsListEmbeddedLinks merchant(ApplicationLinksApplicationProfile merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getMerchant() {
    return merchant;
  }


  public void setMerchant(ApplicationLinksApplicationProfile merchant) {
    this.merchant = merchant;
  }


  public ReviewQueueItemsListEmbeddedLinks reviewBy(ApplicationLinksApplicationProfile reviewBy) {
    
    this.reviewBy = reviewBy;
    return this;
  }

   /**
   * Get reviewBy
   * @return reviewBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getReviewBy() {
    return reviewBy;
  }


  public void setReviewBy(ApplicationLinksApplicationProfile reviewBy) {
    this.reviewBy = reviewBy;
  }


  public ReviewQueueItemsListEmbeddedLinks self(ApplicationLinksApplicationProfile self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApplicationLinksApplicationProfile getSelf() {
    return self;
  }


  public void setSelf(ApplicationLinksApplicationProfile self) {
    this.self = self;
  }


  public ReviewQueueItemsListEmbeddedLinks settlement(ApplicationLinksApplicationProfile settlement) {
    
    this.settlement = settlement;
    return this;
  }

   /**
   * Get settlement
   * @return settlement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getSettlement() {
    return settlement;
  }


  public void setSettlement(ApplicationLinksApplicationProfile settlement) {
    this.settlement = settlement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewQueueItemsListEmbeddedLinks reviewQueueItemsListEmbeddedLinks = (ReviewQueueItemsListEmbeddedLinks) o;
    return Objects.equals(this.application, reviewQueueItemsListEmbeddedLinks.application) &&
        Objects.equals(this.identity, reviewQueueItemsListEmbeddedLinks.identity) &&
        Objects.equals(this.merchant, reviewQueueItemsListEmbeddedLinks.merchant) &&
        Objects.equals(this.reviewBy, reviewQueueItemsListEmbeddedLinks.reviewBy) &&
        Objects.equals(this.self, reviewQueueItemsListEmbeddedLinks.self) &&
        Objects.equals(this.settlement, reviewQueueItemsListEmbeddedLinks.settlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, identity, merchant, reviewBy, self, settlement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewQueueItemsListEmbeddedLinks {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    reviewBy: ").append(toIndentedString(reviewBy)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("identity");
    openapiFields.add("merchant");
    openapiFields.add("review_by");
    openapiFields.add("self");
    openapiFields.add("settlement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("self");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReviewQueueItemsListEmbeddedLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReviewQueueItemsListEmbeddedLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReviewQueueItemsListEmbeddedLinks is not found in the empty JSON string", ReviewQueueItemsListEmbeddedLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReviewQueueItemsListEmbeddedLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReviewQueueItemsListEmbeddedLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */

      // check to make sure all required properties/fields are present in the JSON string
      /*for (String requiredField : ReviewQueueItemsListEmbeddedLinks.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }*/
      // validate the optional field `application`
      if (jsonObj.getAsJsonObject("application") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("application"));
      }
      // validate the optional field `identity`
      if (jsonObj.getAsJsonObject("identity") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("identity"));
      }
      // validate the optional field `merchant`
      if (jsonObj.getAsJsonObject("merchant") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("merchant"));
      }
      // validate the optional field `review_by`
      if (jsonObj.getAsJsonObject("review_by") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("review_by"));
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
      // validate the optional field `settlement`
      if (jsonObj.getAsJsonObject("settlement") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("settlement"));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReviewQueueItemsListEmbeddedLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReviewQueueItemsListEmbeddedLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReviewQueueItemsListEmbeddedLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReviewQueueItemsListEmbeddedLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<ReviewQueueItemsListEmbeddedLinks>() {
           @Override
           public void write(JsonWriter out, ReviewQueueItemsListEmbeddedLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReviewQueueItemsListEmbeddedLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReviewQueueItemsListEmbeddedLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReviewQueueItemsListEmbeddedLinks
  * @throws IOException if the JSON string is invalid with respect to ReviewQueueItemsListEmbeddedLinks
  */
  public static ReviewQueueItemsListEmbeddedLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReviewQueueItemsListEmbeddedLinks.class);
  }

 /**
  * Convert an instance of ReviewQueueItemsListEmbeddedLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

