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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * WAFEvents200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T21:02:11.489241Z[GMT]")
public class WAFEvents200 {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<Object> results;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Integer schemaVersion;

  public WAFEvents200() {
  }

  public WAFEvents200 results(List<Object> results) {
    
    this.results = results;
    return this;
  }

  public WAFEvents200 addResultsItem(Object resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  public List<Object> getResults() {
    return results;
  }


  public void setResults(List<Object> results) {
    this.results = results;
  }


  public WAFEvents200 schemaVersion(Integer schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * Get schemaVersion
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  public Integer getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(Integer schemaVersion) {
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
    WAFEvents200 waFEvents200 = (WAFEvents200) o;
    return Objects.equals(this.results, waFEvents200.results) &&
        Objects.equals(this.schemaVersion, waFEvents200.schemaVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, schemaVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WAFEvents200 {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("schema_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WAFEvents200
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WAFEvents200.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WAFEvents200 is not found in the empty JSON string", WAFEvents200.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WAFEvents200.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WAFEvents200` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WAFEvents200.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WAFEvents200' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WAFEvents200> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WAFEvents200.class));

       return (TypeAdapter<T>) new TypeAdapter<WAFEvents200>() {
           @Override
           public void write(JsonWriter out, WAFEvents200 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WAFEvents200 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WAFEvents200 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WAFEvents200
  * @throws IOException if the JSON string is invalid with respect to WAFEvents200
  */
  public static WAFEvents200 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WAFEvents200.class);
  }

 /**
  * Convert an instance of WAFEvents200 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
