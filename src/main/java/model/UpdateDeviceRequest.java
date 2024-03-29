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
 * UpdateDeviceRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDeviceRequest {
  /**
   * The action you want to perform on the device. Use **DEACTIVATE** to deactivate the device.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    DEACTIVATE("DEACTIVATE"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    ActionEnum(String value) {
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

    public static ActionEnum fromValue(String value) {
        for (ActionEnum b : ActionEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        ActionEnum unknownDefault = ActionEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_ACTIVATION_CODE = "activation_code";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_CODE)
  private String activationCode;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_IDLE_MESSAGE = "idle_message";
  @SerializedName(SERIALIZED_NAME_IDLE_MESSAGE)
  private String idleMessage;

  public UpdateDeviceRequest() { 
  }

  public UpdateDeviceRequest action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * The action you want to perform on the device. Use **DEACTIVATE** to deactivate the device.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The action you want to perform on the device. Use **DEACTIVATE** to deactivate the device.")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public UpdateDeviceRequest activationCode(String activationCode) {
    
    this.activationCode = activationCode;
    return this;
  }

   /**
   * Used when &#x60;action&#x60; is **ACTIVATE**. Provide the input code that shows up on the device screen.
   * @return activationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used when `action` is **ACTIVATE**. Provide the input code that shows up on the device screen.")

  public String getActivationCode() {
    return activationCode;
  }


  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }


  public UpdateDeviceRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateDeviceRequest putTagsItem(String key, String tagsItem) {
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


  public UpdateDeviceRequest idleMessage(String idleMessage) {
    
    this.idleMessage = idleMessage;
    return this;
  }

   /**
   * Message to display on the idle screen.
   * @return idleMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message to display on the idle screen.")

  public String getIdleMessage() {
    return idleMessage;
  }


  public void setIdleMessage(String idleMessage) {
    this.idleMessage = idleMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeviceRequest updateDeviceRequest = (UpdateDeviceRequest) o;
    return Objects.equals(this.action, updateDeviceRequest.action) &&
        Objects.equals(this.activationCode, updateDeviceRequest.activationCode) &&
        Objects.equals(this.tags, updateDeviceRequest.tags) &&
        Objects.equals(this.idleMessage, updateDeviceRequest.idleMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activationCode, tags, idleMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeviceRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idleMessage: ").append(toIndentedString(idleMessage)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("activation_code");
    openapiFields.add("tags");
    openapiFields.add("idle_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateDeviceRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateDeviceRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDeviceRequest is not found in the empty JSON string", UpdateDeviceRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateDeviceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDeviceRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()  && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("activation_code") != null && !jsonObj.get("activation_code").isJsonNull()  && !jsonObj.get("activation_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activation_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activation_code").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("idle_message") != null && !jsonObj.get("idle_message").isJsonNull()  && !jsonObj.get("idle_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idle_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idle_message").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDeviceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDeviceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDeviceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDeviceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDeviceRequest>() {
           @Override
           public void write(JsonWriter out, UpdateDeviceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDeviceRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateDeviceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateDeviceRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateDeviceRequest
  */
  public static UpdateDeviceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDeviceRequest.class);
  }

 /**
  * Convert an instance of UpdateDeviceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

