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
 * OnboardingFormLink
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OnboardingFormLink {
  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt;

  public static final String SERIALIZED_NAME_LINK_URL = "link_url";
  @SerializedName(SERIALIZED_NAME_LINK_URL)
  private String linkUrl;

  public OnboardingFormLink() { 
  }

  public OnboardingFormLink expiresAt(String expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * A UTC timestamp detailing when the onboarding form expires and will no longer be available via &#x60;link_url&#x60;. To generate a new link to the same form, see [Get an Onboarding Form URL](/guides/onboarding/onboarding-form/#get-an-onboarding-form-url).
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A UTC timestamp detailing when the onboarding form expires and will no longer be available via `link_url`. To generate a new link to the same form, see [Get an Onboarding Form URL](/guides/onboarding/onboarding-form/#get-an-onboarding-form-url).")

  public String getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public OnboardingFormLink linkUrl(String linkUrl) {
    
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * The URL of the user&#39;s Finix Onboarding Form. Users can use the &#x60;link_url&#x60; to return to the form at any time.
   * @return linkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the user's Finix Onboarding Form. Users can use the `link_url` to return to the form at any time.")

  public String getLinkUrl() {
    return linkUrl;
  }


  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingFormLink onboardingFormLink = (OnboardingFormLink) o;
    return Objects.equals(this.expiresAt, onboardingFormLink.expiresAt) &&
        Objects.equals(this.linkUrl, onboardingFormLink.linkUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, linkUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingFormLink {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
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
    openapiFields.add("expires_at");
    openapiFields.add("link_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnboardingFormLink
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OnboardingFormLink.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingFormLink is not found in the empty JSON string", OnboardingFormLink.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OnboardingFormLink.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingFormLink` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()  && !jsonObj.get("expires_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_at").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("link_url") != null && !jsonObj.get("link_url").isJsonNull()  && !jsonObj.get("link_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_url").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingFormLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingFormLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingFormLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingFormLink.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingFormLink>() {
           @Override
           public void write(JsonWriter out, OnboardingFormLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingFormLink read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnboardingFormLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnboardingFormLink
  * @throws IOException if the JSON string is invalid with respect to OnboardingFormLink
  */
  public static OnboardingFormLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingFormLink.class);
  }

 /**
  * Convert an instance of OnboardingFormLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

