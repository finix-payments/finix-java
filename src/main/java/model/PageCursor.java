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
 * Details the page that&#39;s returned.
 */
@ApiModel(description = "Details the page that's returned.")
@lombok.Builder@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageCursor {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public PageCursor() { 
  }

  public PageCursor limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The number of entries to return.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of entries to return.")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public PageCursor nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * The cursor to use for the next page of results.
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cursor to use for the next page of results.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageCursor pageCursor = (PageCursor) o;
    return Objects.equals(this.limit, pageCursor.limit) &&
        Objects.equals(this.nextCursor, pageCursor.nextCursor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextCursor);
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
    sb.append("class PageCursor {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("next_cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageCursor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PageCursor.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageCursor is not found in the empty JSON string", PageCursor.openapiRequiredFields.toString()));
        }
      }
     /* 

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PageCursor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageCursor` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      */
      /**
      * EDITED
      * ADDED isJsonNull statement to for inconsistent null behaviour
      */
      if (jsonObj.get("next_cursor") != null && !jsonObj.get("next_cursor").isJsonNull()  && !jsonObj.get("next_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_cursor").toString()));
      }
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageCursor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageCursor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageCursor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageCursor.class));

       return (TypeAdapter<T>) new TypeAdapter<PageCursor>() {
           @Override
           public void write(JsonWriter out, PageCursor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageCursor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageCursor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageCursor
  * @throws IOException if the JSON string is invalid with respect to PageCursor
  */
  public static PageCursor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageCursor.class);
  }

 /**
  * Convert an instance of PageCursor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

