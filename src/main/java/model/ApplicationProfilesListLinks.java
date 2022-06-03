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
 * ApplicationProfilesListLinks
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-03T16:00:09.531596-05:00[America/Chicago]")
public class ApplicationProfilesListLinks {
  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private ApplicationLinksApplicationProfile first;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private ApplicationLinksApplicationProfile last;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private ApplicationLinksApplicationProfile next;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private ApplicationLinksApplicationProfile prev;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksApplicationProfile self;

  public ApplicationProfilesListLinks() { 
  }

  public ApplicationProfilesListLinks first(ApplicationLinksApplicationProfile first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getFirst() {
    return first;
  }


  public void setFirst(ApplicationLinksApplicationProfile first) {
    this.first = first;
  }


  public ApplicationProfilesListLinks last(ApplicationLinksApplicationProfile last) {
    
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getLast() {
    return last;
  }


  public void setLast(ApplicationLinksApplicationProfile last) {
    this.last = last;
  }


  public ApplicationProfilesListLinks next(ApplicationLinksApplicationProfile next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getNext() {
    return next;
  }


  public void setNext(ApplicationLinksApplicationProfile next) {
    this.next = next;
  }


  public ApplicationProfilesListLinks prev(ApplicationLinksApplicationProfile prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getPrev() {
    return prev;
  }


  public void setPrev(ApplicationLinksApplicationProfile prev) {
    this.prev = prev;
  }


  public ApplicationProfilesListLinks self(ApplicationLinksApplicationProfile self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getSelf() {
    return self;
  }


  public void setSelf(ApplicationLinksApplicationProfile self) {
    this.self = self;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationProfilesListLinks applicationProfilesListLinks = (ApplicationProfilesListLinks) o;
    return Objects.equals(this.first, applicationProfilesListLinks.first) &&
        Objects.equals(this.last, applicationProfilesListLinks.last) &&
        Objects.equals(this.next, applicationProfilesListLinks.next) &&
        Objects.equals(this.prev, applicationProfilesListLinks.prev) &&
        Objects.equals(this.self, applicationProfilesListLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, next, prev, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationProfilesListLinks {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
    openapiFields.add("first");
    openapiFields.add("last");
    openapiFields.add("next");
    openapiFields.add("prev");
    openapiFields.add("self");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationProfilesListLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplicationProfilesListLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationProfilesListLinks is not found in the empty JSON string", ApplicationProfilesListLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationProfilesListLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationProfilesListLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      // validate the optional field `first`
      if (jsonObj.getAsJsonObject("first") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("first"));
      }
      // validate the optional field `last`
      if (jsonObj.getAsJsonObject("last") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("last"));
      }
      // validate the optional field `next`
      if (jsonObj.getAsJsonObject("next") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("next"));
      }
      // validate the optional field `prev`
      if (jsonObj.getAsJsonObject("prev") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("prev"));
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationProfilesListLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationProfilesListLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationProfilesListLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationProfilesListLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationProfilesListLinks>() {
           @Override
           public void write(JsonWriter out, ApplicationProfilesListLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationProfilesListLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationProfilesListLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationProfilesListLinks
  * @throws IOException if the JSON string is invalid with respect to ApplicationProfilesListLinks
  */
  public static ApplicationProfilesListLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationProfilesListLinks.class);
  }

 /**
  * Convert an instance of ApplicationProfilesListLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

