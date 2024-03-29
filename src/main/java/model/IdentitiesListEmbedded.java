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
import model.Identity;

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
 * List of &#x60;Identity&#x60; resources.
 */
@ApiModel(description = "List of `Identity` resources.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentitiesListEmbedded {
  public static final String SERIALIZED_NAME_IDENTITIES = "identities";
  @SerializedName(SERIALIZED_NAME_IDENTITIES)
  private Set<Identity> identities = null;

  public IdentitiesListEmbedded() { 
  }

  public IdentitiesListEmbedded identities(Set<Identity> identities) {
    
    this.identities = identities;
    return this;
  }

  public IdentitiesListEmbedded addIdentitiesItem(Identity identitiesItem) {
    if (this.identities == null) {
      this.identities = new LinkedHashSet<>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * An &#x60;Identity&#x60; resource represents either a person or business in Finix.
   * @return identities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An `Identity` resource represents either a person or business in Finix.")

  public Set<Identity> getIdentities() {
    return identities;
  }


  public void setIdentities(Set<Identity> identities) {
    this.identities = identities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentitiesListEmbedded identitiesListEmbedded = (IdentitiesListEmbedded) o;
    return Objects.equals(this.identities, identitiesListEmbedded.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentitiesListEmbedded {\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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
    openapiFields.add("identities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentitiesListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentitiesListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentitiesListEmbedded is not found in the empty JSON string", IdentitiesListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentitiesListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentitiesListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayidentities = jsonObj.getAsJsonArray("identities");
      if (jsonArrayidentities != null) {
        // ensure the json data is an array
        if (!jsonObj.get("identities").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `identities` to be an array in the JSON string but got `%s`", jsonObj.get("identities").toString()));
        }

        // validate the optional field `identities` (array)
        for (int i = 0; i < jsonArrayidentities.size(); i++) {
          Identity.validateJsonObject(jsonArrayidentities.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentitiesListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentitiesListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentitiesListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentitiesListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentitiesListEmbedded>() {
           @Override
           public void write(JsonWriter out, IdentitiesListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentitiesListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentitiesListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentitiesListEmbedded
  * @throws IOException if the JSON string is invalid with respect to IdentitiesListEmbedded
  */
  public static IdentitiesListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentitiesListEmbedded.class);
  }

 /**
  * Convert an instance of IdentitiesListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

