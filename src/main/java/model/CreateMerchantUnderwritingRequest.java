/*
 * Finix API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-02-01
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
 * CreateMerchantUnderwritingRequest
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateMerchantUnderwritingRequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  /**
   * Name of the gateway that processes the &#x60;Merchant&#39;s&#x60; transaction.
   */
  @JsonAdapter(GatewayEnum.Adapter.class)
  public enum GatewayEnum {
    CLOUD_V1("TRIPOS_CLOUD_V1"),
    
    MOBILE_V1("TRIPOS_MOBILE_V1"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    GatewayEnum(String value) {
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

    public static GatewayEnum fromValue(String value) {
        for (GatewayEnum b : GatewayEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        GatewayEnum unknownDefault = GatewayEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<GatewayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GatewayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GatewayEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GatewayEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private GatewayEnum gateway;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor;

  public static final String SERIALIZED_NAME_PROCESSOR_SPECIFIC_PARAMETERS = "processor_specific_parameters";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_SPECIFIC_PARAMETERS)
  private Object processorSpecificParameters;

  public CreateMerchantUnderwritingRequest() { 
  }

  public CreateMerchantUnderwritingRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateMerchantUnderwritingRequest putTagsItem(String key, String tagsItem) {
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


  public CreateMerchantUnderwritingRequest gateway(GatewayEnum gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Name of the gateway that processes the &#x60;Merchant&#39;s&#x60; transaction.
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the gateway that processes the `Merchant's` transaction.")

  public GatewayEnum getGateway() {
    return gateway;
  }


  public void setGateway(GatewayEnum gateway) {
    this.gateway = gateway;
  }


  public CreateMerchantUnderwritingRequest processor(String processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * Name of acquiring processor that settles the &#x60;Merchant&#39;s&#x60; transactions.
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of acquiring processor that settles the `Merchant's` transactions.")

  public String getProcessor() {
    return processor;
  }


  public void setProcessor(String processor) {
    this.processor = processor;
  }


  public CreateMerchantUnderwritingRequest processorSpecificParameters(Object processorSpecificParameters) {
    
    this.processorSpecificParameters = processorSpecificParameters;
    return this;
  }

   /**
   * Additional information required by the processor being used.
   * @return processorSpecificParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information required by the processor being used.")

  public Object getProcessorSpecificParameters() {
    return processorSpecificParameters;
  }


  public void setProcessorSpecificParameters(Object processorSpecificParameters) {
    this.processorSpecificParameters = processorSpecificParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMerchantUnderwritingRequest createMerchantUnderwritingRequest = (CreateMerchantUnderwritingRequest) o;
    return Objects.equals(this.tags, createMerchantUnderwritingRequest.tags) &&
        Objects.equals(this.gateway, createMerchantUnderwritingRequest.gateway) &&
        Objects.equals(this.processor, createMerchantUnderwritingRequest.processor) &&
        Objects.equals(this.processorSpecificParameters, createMerchantUnderwritingRequest.processorSpecificParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, gateway, processor, processorSpecificParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMerchantUnderwritingRequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    processorSpecificParameters: ").append(toIndentedString(processorSpecificParameters)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("gateway");
    openapiFields.add("processor");
    openapiFields.add("processor_specific_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateMerchantUnderwritingRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateMerchantUnderwritingRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMerchantUnderwritingRequest is not found in the empty JSON string", CreateMerchantUnderwritingRequest.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateMerchantUnderwritingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateMerchantUnderwritingRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull()  && !jsonObj.get("gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("processor") != null && !jsonObj.get("processor").isJsonNull()  && !jsonObj.get("processor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processor").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMerchantUnderwritingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMerchantUnderwritingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMerchantUnderwritingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMerchantUnderwritingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMerchantUnderwritingRequest>() {
           @Override
           public void write(JsonWriter out, CreateMerchantUnderwritingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateMerchantUnderwritingRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateMerchantUnderwritingRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateMerchantUnderwritingRequest
  * @throws IOException if the JSON string is invalid with respect to CreateMerchantUnderwritingRequest
  */
  public static CreateMerchantUnderwritingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMerchantUnderwritingRequest.class);
  }

 /**
  * Convert an instance of CreateMerchantUnderwritingRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

