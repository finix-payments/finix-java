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
import model.Webhook;

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
 * List of &#x60;Webhook&#x60; objects.
 */
@ApiModel(description = "List of `Webhook` objects.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhooksListEmbedded {
  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private Set<Webhook> webhooks = null;

  public WebhooksListEmbedded() { 
  }

  public WebhooksListEmbedded webhooks(Set<Webhook> webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

  public WebhooksListEmbedded addWebhooksItem(Webhook webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new LinkedHashSet<>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * &#x60;Webhook&#x60; objects.
   * @return webhooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`Webhook` objects.")

  public Set<Webhook> getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(Set<Webhook> webhooks) {
    this.webhooks = webhooks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksListEmbedded webhooksListEmbedded = (WebhooksListEmbedded) o;
    return Objects.equals(this.webhooks, webhooksListEmbedded.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksListEmbedded {\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
    openapiFields.add("webhooks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhooksListEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WebhooksListEmbedded.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksListEmbedded is not found in the empty JSON string", WebhooksListEmbedded.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhooksListEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhooksListEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      JsonArray jsonArraywebhooks = jsonObj.getAsJsonArray("webhooks");
      if (jsonArraywebhooks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("webhooks").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `webhooks` to be an array in the JSON string but got `%s`", jsonObj.get("webhooks").toString()));
        }

        // validate the optional field `webhooks` (array)
        for (int i = 0; i < jsonArraywebhooks.size(); i++) {
          Webhook.validateJsonObject(jsonArraywebhooks.get(i).getAsJsonObject());
        }
          ;
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksListEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksListEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksListEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksListEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksListEmbedded>() {
           @Override
           public void write(JsonWriter out, WebhooksListEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhooksListEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhooksListEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhooksListEmbedded
  * @throws IOException if the JSON string is invalid with respect to WebhooksListEmbedded
  */
  public static WebhooksListEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksListEmbedded.class);
  }

 /**
  * Convert an instance of WebhooksListEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

