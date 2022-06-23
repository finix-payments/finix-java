/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
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
import model.RiskProfileRulesListEmbeddedRiskProfileRulesInner;

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
 * RiskProfileRulesListEmbedded
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T13:37:23.846763-07:00[America/Los_Angeles]")
public class RiskProfileRulesListEmbedded {
  public static final String SERIALIZED_NAME_RISK_PROFILE_RULES = "risk_profile_rules";
  @SerializedName(SERIALIZED_NAME_RISK_PROFILE_RULES)
  private Set<RiskProfileRulesListEmbeddedRiskProfileRulesInner> riskProfileRules = null;

  public RiskProfileRulesListEmbedded() { 
  }

  public RiskProfileRulesListEmbedded riskProfileRules(Set<RiskProfileRulesListEmbeddedRiskProfileRulesInner> riskProfileRules) {
    
    this.riskProfileRules = riskProfileRules;
    return this;
  }

  public RiskProfileRulesListEmbedded addRiskProfileRulesItem(RiskProfileRulesListEmbeddedRiskProfileRulesInner riskProfileRulesItem) {
    if (this.riskProfileRules == null) {
      this.riskProfileRules = new LinkedHashSet<>();
    }
    this.riskProfileRules.add(riskProfileRulesItem);
    return this;
  }

   /**
   * Get riskProfileRules
   * @return riskProfileRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<RiskProfileRulesListEmbeddedRiskProfileRulesInner> getRiskProfileRules() {
    return riskProfileRules;
  }


  public void setRiskProfileRules(Set<RiskProfileRulesListEmbeddedRiskProfileRulesInner> riskProfileRules) {
    this.riskProfileRules = riskProfileRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProfileRulesListEmbedded riskProfileRulesListEmbedded = (RiskProfileRulesListEmbedded) o;
    return Objects.equals(this.riskProfileRules, riskProfileRulesListEmbedded.riskProfileRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskProfileRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProfileRulesListEmbedded {\n");
    sb.append("    riskProfileRules: ").append(toIndentedString(riskProfileRules)).append("\n");
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
    openapiFields.add("risk_profile_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RiskProfileRulesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RiskProfileRulesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RiskProfileRulesListEmbedded is not found in the empty JSON string", RiskProfileRulesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RiskProfileRulesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RiskProfileRulesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayriskProfileRules = jsonObj.getAsJsonArray("risk_profile_rules");
      if (jsonArrayriskProfileRules != null) {
        // ensure the json data is an array
        if (!jsonObj.get("risk_profile_rules").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `risk_profile_rules` to be an array in the JSON string but got `%s`", jsonObj.get("risk_profile_rules").toString()));
        }

        // validate the optional field `risk_profile_rules` (array)
        for (int i = 0; i < jsonArrayriskProfileRules.size(); i++) {
          RiskProfileRulesListEmbeddedRiskProfileRulesInner.validateJsonObject(jsonArrayriskProfileRules.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RiskProfileRulesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RiskProfileRulesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RiskProfileRulesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RiskProfileRulesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<RiskProfileRulesListEmbedded>() {
           @Override
           public void write(JsonWriter out, RiskProfileRulesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RiskProfileRulesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RiskProfileRulesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RiskProfileRulesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to RiskProfileRulesListEmbedded
  */
  public static RiskProfileRulesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RiskProfileRulesListEmbedded.class);
  }

 /**
  * Convert an instance of RiskProfileRulesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

