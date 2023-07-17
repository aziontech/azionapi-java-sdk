/*
 * Edge Application API
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
import org.openapitools.client.model.ApplicationInstancesResults;

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
 * ApplicationInstanceResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T13:49:11.625986Z[GMT]")
public class ApplicationInstanceResults {
  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Long schemaVersion;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private ApplicationInstancesResults results;

  public ApplicationInstanceResults() {
  }

  public ApplicationInstanceResults schemaVersion(Long schemaVersion) {
    
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


  public ApplicationInstanceResults results(ApplicationInstancesResults results) {
    
    this.results = results;
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  public ApplicationInstancesResults getResults() {
    return results;
  }


  public void setResults(ApplicationInstancesResults results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationInstanceResults applicationInstanceResults = (ApplicationInstanceResults) o;
    return Objects.equals(this.schemaVersion, applicationInstanceResults.schemaVersion) &&
        Objects.equals(this.results, applicationInstanceResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaVersion, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationInstanceResults {\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("schema_version");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationInstanceResults
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationInstanceResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationInstanceResults is not found in the empty JSON string", ApplicationInstanceResults.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationInstanceResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationInstanceResults` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `results`
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        ApplicationInstancesResults.validateJsonObject(jsonObj.getAsJsonObject("results"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationInstanceResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationInstanceResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationInstanceResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationInstanceResults.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationInstanceResults>() {
           @Override
           public void write(JsonWriter out, ApplicationInstanceResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationInstanceResults read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationInstanceResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationInstanceResults
  * @throws IOException if the JSON string is invalid with respect to ApplicationInstanceResults
  */
  public static ApplicationInstanceResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationInstanceResults.class);
  }

 /**
  * Convert an instance of ApplicationInstanceResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

