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
import model.AuthorizationsListEmbedded;
import model.ListLinks;
import model.PageCursor;

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
 * AuthorizationsList
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizationsList {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private PageCursor page;

  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private AuthorizationsListEmbedded embedded;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ListLinks links;

  public AuthorizationsList() { 
  }

  public AuthorizationsList page(PageCursor page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageCursor getPage() {
    return page;
  }


  public void setPage(PageCursor page) {
    this.page = page;
  }


  public AuthorizationsList embedded(AuthorizationsListEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizationsListEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(AuthorizationsListEmbedded embedded) {
    this.embedded = embedded;
  }


  public AuthorizationsList links(ListLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListLinks getLinks() {
    return links;
  }


  public void setLinks(ListLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationsList authorizationsList = (AuthorizationsList) o;
    return Objects.equals(this.page, authorizationsList.page) &&
        Objects.equals(this.embedded, authorizationsList.embedded) &&
        Objects.equals(this.links, authorizationsList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationsList {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("_embedded");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizationsList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorizationsList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationsList is not found in the empty JSON string", AuthorizationsList.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthorizationsList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizationsList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `page`
     // if (jsonObj.getAsJsonObject("page") != null) {
       //PageCursor.validateJsonObject(jsonObj.getAsJsonObject("page"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `_embedded`
     // if (jsonObj.getAsJsonObject("_embedded") != null) {
       //AuthorizationsListEmbedded.validateJsonObject(jsonObj.getAsJsonObject("_embedded"));
     // }

  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationsList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationsList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationsList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationsList.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationsList>() {
           @Override
           public void write(JsonWriter out, AuthorizationsList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizationsList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizationsList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationsList
  * @throws IOException if the JSON string is invalid with respect to AuthorizationsList
  */
  public static AuthorizationsList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationsList.class);
  }

 /**
  * Convert an instance of AuthorizationsList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

