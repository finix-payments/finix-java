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
import model.Verification;

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
 * List of &#x60;Verifications&#x60;.
 */
@ApiModel(description = "List of `Verifications`.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerificationsListEmbedded {
  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private Set<Verification> verifications = null;

  public VerificationsListEmbedded() { 
  }

  public VerificationsListEmbedded verifications(Set<Verification> verifications) {
    
    this.verifications = verifications;
    return this;
  }

  public VerificationsListEmbedded addVerificationsItem(Verification verificationsItem) {
    if (this.verifications == null) {
      this.verifications = new LinkedHashSet<>();
    }
    this.verifications.add(verificationsItem);
    return this;
  }

   /**
   * &#x60;Verification&#x60; resources.
   * @return verifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Verification` resources.")

  public Set<Verification> getVerifications() {
    return verifications;
  }


  public void setVerifications(Set<Verification> verifications) {
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
    VerificationsListEmbedded verificationsListEmbedded = (VerificationsListEmbedded) o;
    return Objects.equals(this.verifications, verificationsListEmbedded.verifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationsListEmbedded {\n");
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
    openapiFields.add("verifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerificationsListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VerificationsListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationsListEmbedded is not found in the empty JSON string", VerificationsListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VerificationsListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerificationsListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayverifications = jsonObj.getAsJsonArray("verifications");
      if (jsonArrayverifications != null) {
        // ensure the json data is an array
        if (!jsonObj.get("verifications").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `verifications` to be an array in the JSON string but got `%s`", jsonObj.get("verifications").toString()));
        }

        // validate the optional field `verifications` (array)
        for (int i = 0; i < jsonArrayverifications.size(); i++) {
          Verification.validateJsonObject(jsonArrayverifications.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationsListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationsListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationsListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationsListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationsListEmbedded>() {
           @Override
           public void write(JsonWriter out, VerificationsListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerificationsListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerificationsListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerificationsListEmbedded
  * @throws IOException if the JSON string is invalid with respect to VerificationsListEmbedded
  */
  public static VerificationsListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationsListEmbedded.class);
  }

 /**
  * Convert an instance of VerificationsListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

