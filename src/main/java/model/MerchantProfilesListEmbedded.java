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
import java.util.ArrayList;
import java.util.List;
import model.MerchantProfile;

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
 * List of &#x60;merchant_profile&#x60; objects.
 */
@ApiModel(description = "List of `merchant_profile` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantProfilesListEmbedded {
  public static final String SERIALIZED_NAME_MERCHANT_PROFILES = "merchant_profiles";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROFILES)
  private List<MerchantProfile> merchantProfiles = null;

  public MerchantProfilesListEmbedded() { 
  }

  public MerchantProfilesListEmbedded merchantProfiles(List<MerchantProfile> merchantProfiles) {
    
    this.merchantProfiles = merchantProfiles;
    return this;
  }

  public MerchantProfilesListEmbedded addMerchantProfilesItem(MerchantProfile merchantProfilesItem) {
    if (this.merchantProfiles == null) {
      this.merchantProfiles = new ArrayList<>();
    }
    this.merchantProfiles.add(merchantProfilesItem);
    return this;
  }

   /**
   * &#x60;merchant_profile&#x60; objects.
   * @return merchantProfiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`merchant_profile` objects.")

  public List<MerchantProfile> getMerchantProfiles() {
    return merchantProfiles;
  }


  public void setMerchantProfiles(List<MerchantProfile> merchantProfiles) {
    this.merchantProfiles = merchantProfiles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProfilesListEmbedded merchantProfilesListEmbedded = (MerchantProfilesListEmbedded) o;
    return Objects.equals(this.merchantProfiles, merchantProfilesListEmbedded.merchantProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProfilesListEmbedded {\n");
    sb.append("    merchantProfiles: ").append(toIndentedString(merchantProfiles)).append("\n");
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
    openapiFields.add("merchant_profiles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantProfilesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantProfilesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantProfilesListEmbedded is not found in the empty JSON string", MerchantProfilesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantProfilesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantProfilesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraymerchantProfiles = jsonObj.getAsJsonArray("merchant_profiles");
      if (jsonArraymerchantProfiles != null) {
        // ensure the json data is an array
        if (!jsonObj.get("merchant_profiles").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `merchant_profiles` to be an array in the JSON string but got `%s`", jsonObj.get("merchant_profiles").toString()));
        }

        // validate the optional field `merchant_profiles` (array)
        for (int i = 0; i < jsonArraymerchantProfiles.size(); i++) {
          MerchantProfile.validateJsonObject(jsonArraymerchantProfiles.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantProfilesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantProfilesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantProfilesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantProfilesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantProfilesListEmbedded>() {
           @Override
           public void write(JsonWriter out, MerchantProfilesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantProfilesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantProfilesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantProfilesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to MerchantProfilesListEmbedded
  */
  public static MerchantProfilesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantProfilesListEmbedded.class);
  }

 /**
  * Convert an instance of MerchantProfilesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

