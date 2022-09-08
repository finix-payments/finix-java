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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * CreateExternalLinkRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateExternalLinkRequest {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  /**
   * &lt;ul&gt;&lt;li&gt;Set to &lt;strong&gt;UPLOAD&lt;/strong&gt; to create a link that can be used to upload files to Finix.&lt;li&gt;Set to &lt;strong&gt;DOWNLOAD&lt;/strong&gt; to create a link where the uploaded file can be downloaded from.&lt;li&gt;Set to &lt;strong&gt;VIEW&lt;/strong&gt; to create a link that displays the file in browser.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UPLOAD("UPLOAD"),
    
    DOWNLOAD("DOWNLOAD"),
    
    VIEW("VIEW"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /*
    * EDITED
    * Add ability get the raw underlying value of a enum the library is not aware about.
    */
    private String rawValue;

    public void setRawValue(String s){
    this.rawValue = s;
    }

    public String getRawValue() {
    return rawValue;
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        TypeEnum unknownDefault = TypeEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public CreateExternalLinkRequest() { 
  }

  public CreateExternalLinkRequest duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Set how long (in minutes) the external link should be active for. The link can be active for up to 7 days in the future.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set how long (in minutes) the external link should be active for. The link can be active for up to 7 days in the future.")

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public CreateExternalLinkRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateExternalLinkRequest putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Key value pair for annotating custom meta data (e.g. order numbers).
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key value pair for annotating custom meta data (e.g. order numbers).")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public CreateExternalLinkRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &lt;ul&gt;&lt;li&gt;Set to &lt;strong&gt;UPLOAD&lt;/strong&gt; to create a link that can be used to upload files to Finix.&lt;li&gt;Set to &lt;strong&gt;DOWNLOAD&lt;/strong&gt; to create a link where the uploaded file can be downloaded from.&lt;li&gt;Set to &lt;strong&gt;VIEW&lt;/strong&gt; to create a link that displays the file in browser.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<ul><li>Set to <strong>UPLOAD</strong> to create a link that can be used to upload files to Finix.<li>Set to <strong>DOWNLOAD</strong> to create a link where the uploaded file can be downloaded from.<li>Set to <strong>VIEW</strong> to create a link that displays the file in browser.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExternalLinkRequest createExternalLinkRequest = (CreateExternalLinkRequest) o;
    return Objects.equals(this.duration, createExternalLinkRequest.duration) &&
        Objects.equals(this.tags, createExternalLinkRequest.tags) &&
        Objects.equals(this.type, createExternalLinkRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExternalLinkRequest {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("tags");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateExternalLinkRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateExternalLinkRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateExternalLinkRequest is not found in the empty JSON string", CreateExternalLinkRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateExternalLinkRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateExternalLinkRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateExternalLinkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateExternalLinkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateExternalLinkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateExternalLinkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateExternalLinkRequest>() {
           @Override
           public void write(JsonWriter out, CreateExternalLinkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateExternalLinkRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateExternalLinkRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateExternalLinkRequest
  * @throws IOException if the JSON string is invalid with respect to CreateExternalLinkRequest
  */
  public static CreateExternalLinkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateExternalLinkRequest.class);
  }

 /**
  * Convert an instance of CreateExternalLinkRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

