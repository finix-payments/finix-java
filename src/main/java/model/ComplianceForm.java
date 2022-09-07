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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ComplianceFormFiles;
import model.ComplianceFormPciSaqA;

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
 * ComplianceForm
 */
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplianceForm {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Type of &#x60;compliance_form&#x60;. There is one available value: **PCI_SAQ_A**.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PCI_SAQ_A("PCI_SAQ_A"),
    
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

  /**
   * The state of the &#x60;compliance_form&#x60;.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PENDING("PENDING"),
    
    COMPLETED("COMPLETED"),
    
    INVALID("INVALID"),
    
    INCOMPLETE("INCOMPLETE"),
    
    UNKNOWN_DEFAULT("unknown_default_open_api");

    private String value;

    StateEnum(String value) {
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

    public static StateEnum fromValue(String value) {
        for (StateEnum b : StateEnum.values()) {
          if (b.value.equals(value)) {
            return b;
          }
        }

        StateEnum unknownDefault = StateEnum.UNKNOWN_DEFAULT;
        unknownDefault.setRawValue(value);

        return unknownDefault;
        
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DUE_AT = "due_at";
  @SerializedName(SERIALIZED_NAME_DUE_AT)
  private OffsetDateTime dueAt;

  public static final String SERIALIZED_NAME_LINKED_TO = "linked_to";
  @SerializedName(SERIALIZED_NAME_LINKED_TO)
  private String linkedTo;

  public static final String SERIALIZED_NAME_LINKED_TYPE = "linked_type";
  @SerializedName(SERIALIZED_NAME_LINKED_TYPE)
  private String linkedType;

  public static final String SERIALIZED_NAME_PCI_SAQ_A = "pci_saq_a";
  @SerializedName(SERIALIZED_NAME_PCI_SAQ_A)
  private ComplianceFormPciSaqA pciSaqA;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private ComplianceFormFiles files;

  public static final String SERIALIZED_NAME_VALID_FROM = "valid_from";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private OffsetDateTime validFrom;

  public static final String SERIALIZED_NAME_VALID_UNTIL = "valid_until";
  @SerializedName(SERIALIZED_NAME_VALID_UNTIL)
  private String validUntil;

  public static final String SERIALIZED_NAME_COMPLIANCE_FORM_TEMPLATE = "compliance_form_template";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_FORM_TEMPLATE)
  private String complianceFormTemplate;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public ComplianceForm() { 
  }

  public ComplianceForm id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the &#x60;compliance_form&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `compliance_form`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ComplianceForm type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of &#x60;compliance_form&#x60;. There is one available value: **PCI_SAQ_A**.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of `compliance_form`. There is one available value: **PCI_SAQ_A**.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ComplianceForm state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the &#x60;compliance_form&#x60;.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the `compliance_form`.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public ComplianceForm createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ComplianceForm updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the object was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the object was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ComplianceForm dueAt(OffsetDateTime dueAt) {
    
    this.dueAt = dueAt;
    return this;
  }

   /**
   * Timestamp of when the &#x60;compliance_form&#x60; must be completed by.
   * @return dueAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the `compliance_form` must be completed by.")

  public OffsetDateTime getDueAt() {
    return dueAt;
  }


  public void setDueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
  }


  public ComplianceForm linkedTo(String linkedTo) {
    
    this.linkedTo = linkedTo;
    return this;
  }

   /**
   * The ID of the &#x60;merchant&#x60; linked to the &#x60;compliance_form&#x60;.
   * @return linkedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the `merchant` linked to the `compliance_form`.")

  public String getLinkedTo() {
    return linkedTo;
  }


  public void setLinkedTo(String linkedTo) {
    this.linkedTo = linkedTo;
  }


  public ComplianceForm linkedType(String linkedType) {
    
    this.linkedType = linkedType;
    return this;
  }

   /**
   * The type of resource this &#x60;compliance_form&#x60; is linked to.
   * @return linkedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of resource this `compliance_form` is linked to.")

  public String getLinkedType() {
    return linkedType;
  }


  public void setLinkedType(String linkedType) {
    this.linkedType = linkedType;
  }


  public ComplianceForm pciSaqA(ComplianceFormPciSaqA pciSaqA) {
    
    this.pciSaqA = pciSaqA;
    return this;
  }

   /**
   * Get pciSaqA
   * @return pciSaqA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComplianceFormPciSaqA getPciSaqA() {
    return pciSaqA;
  }


  public void setPciSaqA(ComplianceFormPciSaqA pciSaqA) {
    this.pciSaqA = pciSaqA;
  }


  public ComplianceForm files(ComplianceFormFiles files) {
    
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComplianceFormFiles getFiles() {
    return files;
  }


  public void setFiles(ComplianceFormFiles files) {
    this.files = files;
  }


  public ComplianceForm validFrom(OffsetDateTime validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Timestamp of when the &#x60;compliance_form&#x60; becomes active and valid.
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the `compliance_form` becomes active and valid.")

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }


  public ComplianceForm validUntil(String validUntil) {
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Timestamp of when the &#x60;compliance_form&#x60; is no longer active and valid.
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the `compliance_form` is no longer active and valid.")

  public String getValidUntil() {
    return validUntil;
  }


  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
  }


  public ComplianceForm complianceFormTemplate(String complianceFormTemplate) {
    
    this.complianceFormTemplate = complianceFormTemplate;
    return this;
  }

   /**
   * Template linked to this &#x60;compliance_form&#x60;.
   * @return complianceFormTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template linked to this `compliance_form`.")

  public String getComplianceFormTemplate() {
    return complianceFormTemplate;
  }


  public void setComplianceFormTemplate(String complianceFormTemplate) {
    this.complianceFormTemplate = complianceFormTemplate;
  }


  public ComplianceForm tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ComplianceForm putTagsItem(String key, String tagsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceForm complianceForm = (ComplianceForm) o;
    return Objects.equals(this.id, complianceForm.id) &&
        Objects.equals(this.type, complianceForm.type) &&
        Objects.equals(this.state, complianceForm.state) &&
        Objects.equals(this.createdAt, complianceForm.createdAt) &&
        Objects.equals(this.updatedAt, complianceForm.updatedAt) &&
        Objects.equals(this.dueAt, complianceForm.dueAt) &&
        Objects.equals(this.linkedTo, complianceForm.linkedTo) &&
        Objects.equals(this.linkedType, complianceForm.linkedType) &&
        Objects.equals(this.pciSaqA, complianceForm.pciSaqA) &&
        Objects.equals(this.files, complianceForm.files) &&
        Objects.equals(this.validFrom, complianceForm.validFrom) &&
        Objects.equals(this.validUntil, complianceForm.validUntil) &&
        Objects.equals(this.complianceFormTemplate, complianceForm.complianceFormTemplate) &&
        Objects.equals(this.tags, complianceForm.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, state, createdAt, updatedAt, dueAt, linkedTo, linkedType, pciSaqA, files, validFrom, validUntil, complianceFormTemplate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplianceForm {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    linkedTo: ").append(toIndentedString(linkedTo)).append("\n");
    sb.append("    linkedType: ").append(toIndentedString(linkedType)).append("\n");
    sb.append("    pciSaqA: ").append(toIndentedString(pciSaqA)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    complianceFormTemplate: ").append(toIndentedString(complianceFormTemplate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("state");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("due_at");
    openapiFields.add("linked_to");
    openapiFields.add("linked_type");
    openapiFields.add("pci_saq_a");
    openapiFields.add("files");
    openapiFields.add("valid_from");
    openapiFields.add("valid_until");
    openapiFields.add("compliance_form_template");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ComplianceForm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ComplianceForm.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComplianceForm is not found in the empty JSON string", ComplianceForm.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ComplianceForm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComplianceForm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()  && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()  && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()  && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("linked_to") != null && !jsonObj.get("linked_to").isJsonNull()  && !jsonObj.get("linked_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_to").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("linked_type") != null && !jsonObj.get("linked_type").isJsonNull()  && !jsonObj.get("linked_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_type").toString()));
      }
      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `pci_saq_a`
     // if (jsonObj.getAsJsonObject("pci_saq_a") != null) {
       //ComplianceFormPciSaqA.validateJsonObject(jsonObj.getAsJsonObject("pci_saq_a"));
     // }

      /**
      * EDITED
      * ADDED  statement to for inconsistent null behaviour
      */
      // validate the optional field `files`
     // if (jsonObj.getAsJsonObject("files") != null) {
       //ComplianceFormFiles.validateJsonObject(jsonObj.getAsJsonObject("files"));
     // }

      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("valid_until") != null && !jsonObj.get("valid_until").isJsonNull()  && !jsonObj.get("valid_until").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_until` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_until").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("compliance_form_template") != null && !jsonObj.get("compliance_form_template").isJsonNull()  && !jsonObj.get("compliance_form_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compliance_form_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compliance_form_template").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComplianceForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComplianceForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComplianceForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComplianceForm.class));

       return (TypeAdapter<T>) new TypeAdapter<ComplianceForm>() {
           @Override
           public void write(JsonWriter out, ComplianceForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComplianceForm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ComplianceForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ComplianceForm
  * @throws IOException if the JSON string is invalid with respect to ComplianceForm
  */
  public static ComplianceForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComplianceForm.class);
  }

 /**
  * Convert an instance of ComplianceForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

