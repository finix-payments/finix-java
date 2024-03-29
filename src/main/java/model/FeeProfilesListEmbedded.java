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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import model.FeeProfile;

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
 * List of &#x60;fee_profile&#x60; objects.
 */
@ApiModel(description = "List of `fee_profile` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeeProfilesListEmbedded {
  public static final String SERIALIZED_NAME_FEE_PROFILES = "fee_profiles";
  @SerializedName(SERIALIZED_NAME_FEE_PROFILES)
  private Set<FeeProfile> feeProfiles = null;

  public FeeProfilesListEmbedded() { 
  }

  public FeeProfilesListEmbedded feeProfiles(Set<FeeProfile> feeProfiles) {
    
    this.feeProfiles = feeProfiles;
    return this;
  }

  public FeeProfilesListEmbedded addFeeProfilesItem(FeeProfile feeProfilesItem) {
    if (this.feeProfiles == null) {
      this.feeProfiles = new LinkedHashSet<>();
    }
    this.feeProfiles.add(feeProfilesItem);
    return this;
  }

   /**
   * &#x60;fee_profile&#x60; objects.
   * @return feeProfiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`fee_profile` objects.")

  public Set<FeeProfile> getFeeProfiles() {
    return feeProfiles;
  }


  public void setFeeProfiles(Set<FeeProfile> feeProfiles) {
    this.feeProfiles = feeProfiles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeProfilesListEmbedded feeProfilesListEmbedded = (FeeProfilesListEmbedded) o;
    return Objects.equals(this.feeProfiles, feeProfilesListEmbedded.feeProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeProfilesListEmbedded {\n");
    sb.append("    feeProfiles: ").append(toIndentedString(feeProfiles)).append("\n");
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
    openapiFields.add("fee_profiles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeeProfilesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FeeProfilesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeeProfilesListEmbedded is not found in the empty JSON string", FeeProfilesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FeeProfilesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeeProfilesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayfeeProfiles = jsonObj.getAsJsonArray("fee_profiles");
      if (jsonArrayfeeProfiles != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fee_profiles").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fee_profiles` to be an array in the JSON string but got `%s`", jsonObj.get("fee_profiles").toString()));
        }

        // validate the optional field `fee_profiles` (array)
        for (int i = 0; i < jsonArrayfeeProfiles.size(); i++) {
          FeeProfile.validateJsonObject(jsonArrayfeeProfiles.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeeProfilesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeeProfilesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeeProfilesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeeProfilesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<FeeProfilesListEmbedded>() {
           @Override
           public void write(JsonWriter out, FeeProfilesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeeProfilesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeeProfilesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeeProfilesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to FeeProfilesListEmbedded
  */
  public static FeeProfilesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeeProfilesListEmbedded.class);
  }

 /**
  * Convert an instance of FeeProfilesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

