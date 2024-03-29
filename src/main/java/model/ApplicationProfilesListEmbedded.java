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
import model.ApplicationProfile;

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
 * List of &#x60;application_profile&#x60; resources.
 */
@ApiModel(description = "List of `application_profile` resources.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplicationProfilesListEmbedded {
  public static final String SERIALIZED_NAME_APPLICATION_PROFILES = "application_profiles";
  @SerializedName(SERIALIZED_NAME_APPLICATION_PROFILES)
  private Set<ApplicationProfile> applicationProfiles = null;

  public ApplicationProfilesListEmbedded() { 
  }

  public ApplicationProfilesListEmbedded applicationProfiles(Set<ApplicationProfile> applicationProfiles) {
    
    this.applicationProfiles = applicationProfiles;
    return this;
  }

  public ApplicationProfilesListEmbedded addApplicationProfilesItem(ApplicationProfile applicationProfilesItem) {
    if (this.applicationProfiles == null) {
      this.applicationProfiles = new LinkedHashSet<>();
    }
    this.applicationProfiles.add(applicationProfilesItem);
    return this;
  }

   /**
   * &#x60;application_profile&#x60; resources.
   * @return applicationProfiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`application_profile` resources.")

  public Set<ApplicationProfile> getApplicationProfiles() {
    return applicationProfiles;
  }


  public void setApplicationProfiles(Set<ApplicationProfile> applicationProfiles) {
    this.applicationProfiles = applicationProfiles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationProfilesListEmbedded applicationProfilesListEmbedded = (ApplicationProfilesListEmbedded) o;
    return Objects.equals(this.applicationProfiles, applicationProfilesListEmbedded.applicationProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationProfilesListEmbedded {\n");
    sb.append("    applicationProfiles: ").append(toIndentedString(applicationProfiles)).append("\n");
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
    openapiFields.add("application_profiles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationProfilesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplicationProfilesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationProfilesListEmbedded is not found in the empty JSON string", ApplicationProfilesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationProfilesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationProfilesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayapplicationProfiles = jsonObj.getAsJsonArray("application_profiles");
      if (jsonArrayapplicationProfiles != null) {
        // ensure the json data is an array
        if (!jsonObj.get("application_profiles").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `application_profiles` to be an array in the JSON string but got `%s`", jsonObj.get("application_profiles").toString()));
        }

        // validate the optional field `application_profiles` (array)
        for (int i = 0; i < jsonArrayapplicationProfiles.size(); i++) {
          ApplicationProfile.validateJsonObject(jsonArrayapplicationProfiles.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationProfilesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationProfilesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationProfilesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationProfilesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationProfilesListEmbedded>() {
           @Override
           public void write(JsonWriter out, ApplicationProfilesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationProfilesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationProfilesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationProfilesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to ApplicationProfilesListEmbedded
  */
  public static ApplicationProfilesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationProfilesListEmbedded.class);
  }

 /**
  * Convert an instance of ApplicationProfilesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

