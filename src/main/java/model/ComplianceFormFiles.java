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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Details about the &#x60;File&#x60; resoruce where the &#x60;compliance_form&#x60; was uploaded.
 */
@ApiModel(description = "Details about the `File` resoruce where the `compliance_form` was uploaded.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplianceFormFiles {
  public static final String SERIALIZED_NAME_UNSIGNED_FILE = "unsigned_file";
  @SerializedName(SERIALIZED_NAME_UNSIGNED_FILE)
  private String unsignedFile;

  public static final String SERIALIZED_NAME_SIGNED_FILE = "signed_file";
  @SerializedName(SERIALIZED_NAME_SIGNED_FILE)
  private String signedFile;

  public ComplianceFormFiles() { 
  }

  public ComplianceFormFiles unsignedFile(String unsignedFile) {
    
    this.unsignedFile = unsignedFile;
    return this;
  }

   /**
   * ID of the &#x60;File&#x60; resource that has the &#x60;compliance_form&#x60;.
   * @return unsignedFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the `File` resource that has the `compliance_form`.")

  public String getUnsignedFile() {
    return unsignedFile;
  }


  public void setUnsignedFile(String unsignedFile) {
    this.unsignedFile = unsignedFile;
  }


  public ComplianceFormFiles signedFile(String signedFile) {
    
    this.signedFile = signedFile;
    return this;
  }

   /**
   * &lt;ul&gt;&lt;li&gt;Autofills to &lt;strong&gt;null&lt;/strong&gt;.&lt;/li&gt; &lt;li&gt;When a &lt;kbd&gt;compliance_form&lt;/kbd&gt; is attested, &lt;kbd&gt;signed_file&lt;/kbd&gt; will contain a &lt;kbd&gt;File&lt;/kbd&gt; corresponding to the signed version of the form.&lt;/li&gt;&lt;/ul&gt;
   * @return signedFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<ul><li>Autofills to <strong>null</strong>.</li> <li>When a <kbd>compliance_form</kbd> is attested, <kbd>signed_file</kbd> will contain a <kbd>File</kbd> corresponding to the signed version of the form.</li></ul>")

  public String getSignedFile() {
    return signedFile;
  }


  public void setSignedFile(String signedFile) {
    this.signedFile = signedFile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceFormFiles complianceFormFiles = (ComplianceFormFiles) o;
    return Objects.equals(this.unsignedFile, complianceFormFiles.unsignedFile) &&
        Objects.equals(this.signedFile, complianceFormFiles.signedFile);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(unsignedFile, signedFile);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplianceFormFiles {\n");
    sb.append("    unsignedFile: ").append(toIndentedString(unsignedFile)).append("\n");
    sb.append("    signedFile: ").append(toIndentedString(signedFile)).append("\n");
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
    openapiFields.add("unsigned_file");
    openapiFields.add("signed_file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ComplianceFormFiles
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ComplianceFormFiles.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComplianceFormFiles is not found in the empty JSON string", ComplianceFormFiles.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ComplianceFormFiles.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComplianceFormFiles` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("unsigned_file") != null && !jsonObj.get("unsigned_file").isJsonNull()  && !jsonObj.get("unsigned_file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unsigned_file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unsigned_file").toString()));
      }
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("signed_file") != null && !jsonObj.get("signed_file").isJsonNull()  && !jsonObj.get("signed_file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signed_file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signed_file").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComplianceFormFiles.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComplianceFormFiles' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComplianceFormFiles> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComplianceFormFiles.class));

       return (TypeAdapter<T>) new TypeAdapter<ComplianceFormFiles>() {
           @Override
           public void write(JsonWriter out, ComplianceFormFiles value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComplianceFormFiles read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ComplianceFormFiles given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ComplianceFormFiles
  * @throws IOException if the JSON string is invalid with respect to ComplianceFormFiles
  */
  public static ComplianceFormFiles fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComplianceFormFiles.class);
  }

 /**
  * Convert an instance of ComplianceFormFiles to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

