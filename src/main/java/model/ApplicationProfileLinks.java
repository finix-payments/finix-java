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
import model.ApplicationLinksApplicationProfile;
import model.ApplicationLinksSelf;
import model.ApplicationProfileLinksApplication;

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
public class ApplicationProfileLinks {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private ApplicationProfileLinksApplication application;

  public static final String SERIALIZED_NAME_FEE_PROFILE = "fee_profile";
  @SerializedName(SERIALIZED_NAME_FEE_PROFILE)
  private ApplicationLinksApplicationProfile feeProfile;

  public static final String SERIALIZED_NAME_RISK_PROFILE = "risk_profile";
  @SerializedName(SERIALIZED_NAME_RISK_PROFILE)
  private ApplicationLinksApplicationProfile riskProfile;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksSelf self;

  public ApplicationProfileLinks() { 
  }

  public ApplicationProfileLinks application(ApplicationProfileLinksApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationProfileLinksApplication getApplication() {
    return application;
  }


  public void setApplication(ApplicationProfileLinksApplication application) {
    this.application = application;
  }


  public ApplicationProfileLinks feeProfile(ApplicationLinksApplicationProfile feeProfile) {
    
    this.feeProfile = feeProfile;
    return this;
  }

   /**
   * Get feeProfile
   * @return feeProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getFeeProfile() {
    return feeProfile;
  }


  public void setFeeProfile(ApplicationLinksApplicationProfile feeProfile) {
    this.feeProfile = feeProfile;
  }


  public ApplicationProfileLinks riskProfile(ApplicationLinksApplicationProfile riskProfile) {
    
    this.riskProfile = riskProfile;
    return this;
  }

   /**
   * Get riskProfile
   * @return riskProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getRiskProfile() {
    return riskProfile;
  }


  public void setRiskProfile(ApplicationLinksApplicationProfile riskProfile) {
    this.riskProfile = riskProfile;
  }


  public ApplicationProfileLinks self(ApplicationLinksSelf self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksSelf getSelf() {
    return self;
  }


  public void setSelf(ApplicationLinksSelf self) {
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
    ApplicationProfileLinks applicationProfileLinks = (ApplicationProfileLinks) o;
    return Objects.equals(this.application, applicationProfileLinks.application) &&
        Objects.equals(this.feeProfile, applicationProfileLinks.feeProfile) &&
        Objects.equals(this.riskProfile, applicationProfileLinks.riskProfile) &&
        Objects.equals(this.self, applicationProfileLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, feeProfile, riskProfile, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationProfileLinks {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    feeProfile: ").append(toIndentedString(feeProfile)).append("\n");
    sb.append("    riskProfile: ").append(toIndentedString(riskProfile)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("fee_profile");
    openapiFields.add("risk_profile");
    openapiFields.add("self");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationProfileLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplicationProfileLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationProfileLinks is not found in the empty JSON string", ApplicationProfileLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationProfileLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationProfileLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `application`
     // if (jsonObj.getAsJsonObject("application") != null) {
       //ApplicationProfileLinksApplication.validateJsonObject(jsonObj.getAsJsonObject("application"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `fee_profile`
     // if (jsonObj.getAsJsonObject("fee_profile") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("fee_profile"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `risk_profile`
     // if (jsonObj.getAsJsonObject("risk_profile") != null) {
       //ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("risk_profile"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `self`
     // if (jsonObj.getAsJsonObject("self") != null) {
       //ApplicationLinksSelf.validateJsonObject(jsonObj.getAsJsonObject("self"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationProfileLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationProfileLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationProfileLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationProfileLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationProfileLinks>() {
           @Override
           public void write(JsonWriter out, ApplicationProfileLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationProfileLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationProfileLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationProfileLinks
  * @throws IOException if the JSON string is invalid with respect to ApplicationProfileLinks
  */
  public static ApplicationProfileLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationProfileLinks.class);
  }

 /**
  * Convert an instance of ApplicationProfileLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

