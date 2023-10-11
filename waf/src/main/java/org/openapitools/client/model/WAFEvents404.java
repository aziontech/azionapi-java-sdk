/*
 * Web Application Firewall API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * WAFEvents404
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-11T12:39:47.281276Z[GMT]")
public class WAFEvents404 {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Object> errors;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Long schemaVersion;

  public WAFEvents404() {
  }

  public WAFEvents404 errors(List<Object> errors) {
    
    this.errors = errors;
    return this;
  }

  public WAFEvents404 addErrorsItem(Object errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<Object> getErrors() {
    return errors;
  }


  public void setErrors(List<Object> errors) {
    this.errors = errors;
  }


  public WAFEvents404 schemaVersion(Long schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * Get schemaVersion
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  public Long getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(Long schemaVersion) {
    this.schemaVersion = schemaVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WAFEvents404 waFEvents404 = (WAFEvents404) o;
    return Objects.equals(this.errors, waFEvents404.errors) &&
        Objects.equals(this.schemaVersion, waFEvents404.schemaVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, schemaVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WAFEvents404 {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("schema_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WAFEvents404
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WAFEvents404.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WAFEvents404 is not found in the empty JSON string", WAFEvents404.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WAFEvents404.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WAFEvents404` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull() && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WAFEvents404.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WAFEvents404' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WAFEvents404> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WAFEvents404.class));

       return (TypeAdapter<T>) new TypeAdapter<WAFEvents404>() {
           @Override
           public void write(JsonWriter out, WAFEvents404 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WAFEvents404 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WAFEvents404 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WAFEvents404
  * @throws IOException if the JSON string is invalid with respect to WAFEvents404
  */
  public static WAFEvents404 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WAFEvents404.class);
  }

 /**
  * Convert an instance of WAFEvents404 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

