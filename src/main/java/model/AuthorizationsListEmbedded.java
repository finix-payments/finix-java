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
import model.Authorization;

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
 * List of &#x60;Authroization&#x60; objects.
 */
@ApiModel(description = "List of `Authroization` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizationsListEmbedded {
  public static final String SERIALIZED_NAME_AUTHORIZATIONS = "authorizations";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATIONS)
  private Set<Authorization> authorizations = null;

  public AuthorizationsListEmbedded() { 
  }

  public AuthorizationsListEmbedded authorizations(Set<Authorization> authorizations) {
    
    this.authorizations = authorizations;
    return this;
  }

  public AuthorizationsListEmbedded addAuthorizationsItem(Authorization authorizationsItem) {
    if (this.authorizations == null) {
      this.authorizations = new LinkedHashSet<>();
    }
    this.authorizations.add(authorizationsItem);
    return this;
  }

   /**
   * &#x60;Authorization&#x60; objects.
   * @return authorizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Authorization` objects.")

  public Set<Authorization> getAuthorizations() {
    return authorizations;
  }


  public void setAuthorizations(Set<Authorization> authorizations) {
    this.authorizations = authorizations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationsListEmbedded authorizationsListEmbedded = (AuthorizationsListEmbedded) o;
    return Objects.equals(this.authorizations, authorizationsListEmbedded.authorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationsListEmbedded {\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
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
    openapiFields.add("authorizations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizationsListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorizationsListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationsListEmbedded is not found in the empty JSON string", AuthorizationsListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthorizationsListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizationsListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayauthorizations = jsonObj.getAsJsonArray("authorizations");
      if (jsonArrayauthorizations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("authorizations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `authorizations` to be an array in the JSON string but got `%s`", jsonObj.get("authorizations").toString()));
        }

        // validate the optional field `authorizations` (array)
        for (int i = 0; i < jsonArrayauthorizations.size(); i++) {
          Authorization.validateJsonObject(jsonArrayauthorizations.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationsListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationsListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationsListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationsListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationsListEmbedded>() {
           @Override
           public void write(JsonWriter out, AuthorizationsListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizationsListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizationsListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationsListEmbedded
  * @throws IOException if the JSON string is invalid with respect to AuthorizationsListEmbedded
  */
  public static AuthorizationsListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationsListEmbedded.class);
  }

 /**
  * Convert an instance of AuthorizationsListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

