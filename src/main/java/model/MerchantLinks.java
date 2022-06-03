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
 * MerchantLinks
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-03T16:00:09.531596-05:00[America/Chicago]")
public class MerchantLinks {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private ApplicationLinksApplicationProfile application;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private ApplicationLinksApplicationProfile identity;

  public static final String SERIALIZED_NAME_MERCHANT_PROFILE = "merchant_profile";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROFILE)
  private ApplicationLinksApplicationProfile merchantProfile;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksApplicationProfile self;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private ApplicationLinksApplicationProfile verification;

  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private ApplicationLinksApplicationProfile verifications;

  public MerchantLinks() { 
  }

  public MerchantLinks application(ApplicationLinksApplicationProfile application) {
    
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


  public MerchantLinks identity(ApplicationLinksApplicationProfile identity) {
    
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


  public MerchantLinks merchantProfile(ApplicationLinksApplicationProfile merchantProfile) {
    
    this.merchantProfile = merchantProfile;
    return this;
  }

   /**
   * Get merchantProfile
   * @return merchantProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getMerchantProfile() {
    return merchantProfile;
  }


  public void setMerchantProfile(ApplicationLinksApplicationProfile merchantProfile) {
    this.merchantProfile = merchantProfile;
  }


  public MerchantLinks self(ApplicationLinksApplicationProfile self) {
    
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


  public MerchantLinks verification(ApplicationLinksApplicationProfile verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getVerification() {
    return verification;
  }


  public void setVerification(ApplicationLinksApplicationProfile verification) {
    this.verification = verification;
  }


  public MerchantLinks verifications(ApplicationLinksApplicationProfile verifications) {
    
    this.verifications = verifications;
    return this;
  }

   /**
   * Get verifications
   * @return verifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationLinksApplicationProfile getVerifications() {
    return verifications;
  }


  public void setVerifications(ApplicationLinksApplicationProfile verifications) {
    this.verifications = verifications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLinks merchantLinks = (MerchantLinks) o;
    return Objects.equals(this.application, merchantLinks.application) &&
        Objects.equals(this.identity, merchantLinks.identity) &&
        Objects.equals(this.merchantProfile, merchantLinks.merchantProfile) &&
        Objects.equals(this.self, merchantLinks.self) &&
        Objects.equals(this.verification, merchantLinks.verification) &&
        Objects.equals(this.verifications, merchantLinks.verifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, identity, merchantProfile, self, verification, verifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLinks {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    merchantProfile: ").append(toIndentedString(merchantProfile)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
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
    openapiFields.add("merchant_profile");
    openapiFields.add("self");
    openapiFields.add("verification");
    openapiFields.add("verifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantLinks is not found in the empty JSON string", MerchantLinks.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      // validate the optional field `application`
      if (jsonObj.getAsJsonObject("application") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("application"));
      }
      // validate the optional field `identity`
      if (jsonObj.getAsJsonObject("identity") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("identity"));
      }
      // validate the optional field `merchant_profile`
      if (jsonObj.getAsJsonObject("merchant_profile") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("merchant_profile"));
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
      // validate the optional field `verification`
      if (jsonObj.getAsJsonObject("verification") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("verification"));
      }
      // validate the optional field `verifications`
      if (jsonObj.getAsJsonObject("verifications") != null) {
       ApplicationLinksApplicationProfile.validateJsonObject(jsonObj.getAsJsonObject("verifications"));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantLinks>() {
           @Override
           public void write(JsonWriter out, MerchantLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantLinks
  * @throws IOException if the JSON string is invalid with respect to MerchantLinks
  */
  public static MerchantLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantLinks.class);
  }

 /**
  * Convert an instance of MerchantLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

