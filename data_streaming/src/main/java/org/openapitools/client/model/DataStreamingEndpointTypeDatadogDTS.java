/*
 * Data Streaming - OpenAPI
 * The Data Streaming API allows you to manage your existing data streamings and templates. Data Streaming allows you to feed your stream processing, SIEM, and big data platforms with the event logs from your applications on Azion in real time. 
 *
 * The version of the OpenAPI document: 1.0.0
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
import java.net.URI;

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
 * DataStreamingEndpointTypeDatadogDTS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-22T12:30:18.138783Z[GMT]")
public class DataStreamingEndpointTypeDatadogDTS {
  public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "endpoint_type";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
  private String endpointType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public DataStreamingEndpointTypeDatadogDTS() {
  }

  public DataStreamingEndpointTypeDatadogDTS endpointType(String endpointType) {
    
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @javax.annotation.Nullable
  public String getEndpointType() {
    return endpointType;
  }


  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }


  public DataStreamingEndpointTypeDatadogDTS url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public DataStreamingEndpointTypeDatadogDTS apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStreamingEndpointTypeDatadogDTS dataStreamingEndpointTypeDatadogDTS = (DataStreamingEndpointTypeDatadogDTS) o;
    return Objects.equals(this.endpointType, dataStreamingEndpointTypeDatadogDTS.endpointType) &&
        Objects.equals(this.url, dataStreamingEndpointTypeDatadogDTS.url) &&
        Objects.equals(this.apiKey, dataStreamingEndpointTypeDatadogDTS.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, url, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStreamingEndpointTypeDatadogDTS {\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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
    openapiFields.add("endpoint_type");
    openapiFields.add("url");
    openapiFields.add("api_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataStreamingEndpointTypeDatadogDTS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DataStreamingEndpointTypeDatadogDTS.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataStreamingEndpointTypeDatadogDTS is not found in the empty JSON string", DataStreamingEndpointTypeDatadogDTS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataStreamingEndpointTypeDatadogDTS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataStreamingEndpointTypeDatadogDTS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("endpoint_type") != null && !jsonObj.get("endpoint_type").isJsonNull()) && !jsonObj.get("endpoint_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint_type").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("api_key") != null && !jsonObj.get("api_key").isJsonNull()) && !jsonObj.get("api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataStreamingEndpointTypeDatadogDTS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataStreamingEndpointTypeDatadogDTS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataStreamingEndpointTypeDatadogDTS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataStreamingEndpointTypeDatadogDTS.class));

       return (TypeAdapter<T>) new TypeAdapter<DataStreamingEndpointTypeDatadogDTS>() {
           @Override
           public void write(JsonWriter out, DataStreamingEndpointTypeDatadogDTS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataStreamingEndpointTypeDatadogDTS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataStreamingEndpointTypeDatadogDTS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataStreamingEndpointTypeDatadogDTS
  * @throws IOException if the JSON string is invalid with respect to DataStreamingEndpointTypeDatadogDTS
  */
  public static DataStreamingEndpointTypeDatadogDTS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataStreamingEndpointTypeDatadogDTS.class);
  }

 /**
  * Convert an instance of DataStreamingEndpointTypeDatadogDTS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
