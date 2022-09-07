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
import model.ApplicationLinksSelf;
import model.MerchantLinksApplication;
import model.MerchantLinksIdentity;
import model.MerchantLinksMerchantProfile;
import model.MerchantLinksVerification;
import model.MerchantLinksVerifications;

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
public class MerchantLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private ApplicationLinksSelf self;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private MerchantLinksIdentity identity;

  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private MerchantLinksVerifications verifications;

  public static final String SERIALIZED_NAME_MERCHANT_PROFILE = "merchant_profile";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROFILE)
  private MerchantLinksMerchantProfile merchantProfile;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private MerchantLinksApplication application;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private MerchantLinksVerification verification;

  public MerchantLinks() { 
  }

  public MerchantLinks self(ApplicationLinksSelf self) {
    
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


  public MerchantLinks identity(MerchantLinksIdentity identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinksIdentity getIdentity() {
    return identity;
  }


  public void setIdentity(MerchantLinksIdentity identity) {
    this.identity = identity;
  }


  public MerchantLinks verifications(MerchantLinksVerifications verifications) {
    
    this.verifications = verifications;
    return this;
  }

   /**
   * Get verifications
   * @return verifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinksVerifications getVerifications() {
    return verifications;
  }


  public void setVerifications(MerchantLinksVerifications verifications) {
    this.verifications = verifications;
  }


  public MerchantLinks merchantProfile(MerchantLinksMerchantProfile merchantProfile) {
    
    this.merchantProfile = merchantProfile;
    return this;
  }

   /**
   * Get merchantProfile
   * @return merchantProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinksMerchantProfile getMerchantProfile() {
    return merchantProfile;
  }


  public void setMerchantProfile(MerchantLinksMerchantProfile merchantProfile) {
    this.merchantProfile = merchantProfile;
  }


  public MerchantLinks application(MerchantLinksApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinksApplication getApplication() {
    return application;
  }


  public void setApplication(MerchantLinksApplication application) {
    this.application = application;
  }


  public MerchantLinks verification(MerchantLinksVerification verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantLinksVerification getVerification() {
    return verification;
  }


  public void setVerification(MerchantLinksVerification verification) {
    this.verification = verification;
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
    return Objects.equals(this.self, merchantLinks.self) &&
        Objects.equals(this.identity, merchantLinks.identity) &&
        Objects.equals(this.verifications, merchantLinks.verifications) &&
        Objects.equals(this.merchantProfile, merchantLinks.merchantProfile) &&
        Objects.equals(this.application, merchantLinks.application) &&
        Objects.equals(this.verification, merchantLinks.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, identity, verifications, merchantProfile, application, verification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
    sb.append("    merchantProfile: ").append(toIndentedString(merchantProfile)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
    openapiFields.add("identity");
    openapiFields.add("verifications");
    openapiFields.add("merchant_profile");
    openapiFields.add("application");
    openapiFields.add("verification");

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
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `self`
     // if (jsonObj.getAsJsonObject("self") != null) {
       //ApplicationLinksSelf.validateJsonObject(jsonObj.getAsJsonObject("self"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `identity`
     // if (jsonObj.getAsJsonObject("identity") != null) {
       //MerchantLinksIdentity.validateJsonObject(jsonObj.getAsJsonObject("identity"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `verifications`
     // if (jsonObj.getAsJsonObject("verifications") != null) {
       //MerchantLinksVerifications.validateJsonObject(jsonObj.getAsJsonObject("verifications"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `merchant_profile`
     // if (jsonObj.getAsJsonObject("merchant_profile") != null) {
       //MerchantLinksMerchantProfile.validateJsonObject(jsonObj.getAsJsonObject("merchant_profile"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `application`
     // if (jsonObj.getAsJsonObject("application") != null) {
       //MerchantLinksApplication.validateJsonObject(jsonObj.getAsJsonObject("application"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `verification`
     // if (jsonObj.getAsJsonObject("verification") != null) {
       //MerchantLinksVerification.validateJsonObject(jsonObj.getAsJsonObject("verification"));
     // }

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

