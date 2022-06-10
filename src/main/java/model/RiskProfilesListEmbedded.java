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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import model.RiskProfile;

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
 * RiskProfilesListEmbedded
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-09T19:07:27.149649-05:00[America/Chicago]")
public class RiskProfilesListEmbedded {
  public static final String SERIALIZED_NAME_RISK_PROFILES = "risk_profiles";
  @SerializedName(SERIALIZED_NAME_RISK_PROFILES)
  private Set<RiskProfile> riskProfiles = null;

  public RiskProfilesListEmbedded() { 
  }

  public RiskProfilesListEmbedded riskProfiles(Set<RiskProfile> riskProfiles) {
    
    this.riskProfiles = riskProfiles;
    return this;
  }

  public RiskProfilesListEmbedded addRiskProfilesItem(RiskProfile riskProfilesItem) {
    if (this.riskProfiles == null) {
      this.riskProfiles = new LinkedHashSet<>();
    }
    this.riskProfiles.add(riskProfilesItem);
    return this;
  }

   /**
   * Get riskProfiles
   * @return riskProfiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<RiskProfile> getRiskProfiles() {
    return riskProfiles;
  }


  public void setRiskProfiles(Set<RiskProfile> riskProfiles) {
    this.riskProfiles = riskProfiles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProfilesListEmbedded riskProfilesListEmbedded = (RiskProfilesListEmbedded) o;
    return Objects.equals(this.riskProfiles, riskProfilesListEmbedded.riskProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProfilesListEmbedded {\n");
    sb.append("    riskProfiles: ").append(toIndentedString(riskProfiles)).append("\n");
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
    openapiFields.add("risk_profiles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RiskProfilesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RiskProfilesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RiskProfilesListEmbedded is not found in the empty JSON string", RiskProfilesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RiskProfilesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RiskProfilesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayriskProfiles = jsonObj.getAsJsonArray("risk_profiles");
      if (jsonArrayriskProfiles != null) {
        // ensure the json data is an array
        if (!jsonObj.get("risk_profiles").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `risk_profiles` to be an array in the JSON string but got `%s`", jsonObj.get("risk_profiles").toString()));
        }

        // validate the optional field `risk_profiles` (array)
        for (int i = 0; i < jsonArrayriskProfiles.size(); i++) {
          RiskProfile.validateJsonObject(jsonArrayriskProfiles.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RiskProfilesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RiskProfilesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RiskProfilesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RiskProfilesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<RiskProfilesListEmbedded>() {
           @Override
           public void write(JsonWriter out, RiskProfilesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RiskProfilesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RiskProfilesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RiskProfilesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to RiskProfilesListEmbedded
  */
  public static RiskProfilesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RiskProfilesListEmbedded.class);
  }

 /**
  * Convert an instance of RiskProfilesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

