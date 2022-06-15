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
import java.util.ArrayList;
import java.util.List;
import model.ExternalLink;

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
 * &#x60;external_links&#x60; resources.
 */
@ApiModel(description = "`external_links` resources.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T15:40:46.516755-05:00[America/Chicago]")
public class ExternalLinksListPageEmbedded {
  public static final String SERIALIZED_NAME_EXTERNAL_LINKS = "external_links";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_LINKS)
  private List<ExternalLink> externalLinks = null;

  public ExternalLinksListPageEmbedded() { 
  }

  public ExternalLinksListPageEmbedded externalLinks(List<ExternalLink> externalLinks) {
    
    this.externalLinks = externalLinks;
    return this;
  }

  public ExternalLinksListPageEmbedded addExternalLinksItem(ExternalLink externalLinksItem) {
    if (this.externalLinks == null) {
      this.externalLinks = new ArrayList<>();
    }
    this.externalLinks.add(externalLinksItem);
    return this;
  }

   /**
   * Get externalLinks
   * @return externalLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExternalLink> getExternalLinks() {
    return externalLinks;
  }


  public void setExternalLinks(List<ExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalLinksListPageEmbedded externalLinksListPageEmbedded = (ExternalLinksListPageEmbedded) o;
    return Objects.equals(this.externalLinks, externalLinksListPageEmbedded.externalLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalLinksListPageEmbedded {\n");
    sb.append("    externalLinks: ").append(toIndentedString(externalLinks)).append("\n");
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
    openapiFields.add("external_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalLinksListPageEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExternalLinksListPageEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalLinksListPageEmbedded is not found in the empty JSON string", ExternalLinksListPageEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalLinksListPageEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalLinksListPageEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArrayexternalLinks = jsonObj.getAsJsonArray("external_links");
      if (jsonArrayexternalLinks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("external_links").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `external_links` to be an array in the JSON string but got `%s`", jsonObj.get("external_links").toString()));
        }

        // validate the optional field `external_links` (array)
        for (int i = 0; i < jsonArrayexternalLinks.size(); i++) {
          ExternalLink.validateJsonObject(jsonArrayexternalLinks.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalLinksListPageEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalLinksListPageEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalLinksListPageEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalLinksListPageEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalLinksListPageEmbedded>() {
           @Override
           public void write(JsonWriter out, ExternalLinksListPageEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalLinksListPageEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalLinksListPageEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalLinksListPageEmbedded
  * @throws IOException if the JSON string is invalid with respect to ExternalLinksListPageEmbedded
  */
  public static ExternalLinksListPageEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalLinksListPageEmbedded.class);
  }

 /**
  * Convert an instance of ExternalLinksListPageEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

