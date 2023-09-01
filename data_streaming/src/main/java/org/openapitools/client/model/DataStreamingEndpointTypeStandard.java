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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import org.openapitools.client.model.DataStreamingEndpointTypeStandardHeadersExample;

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
 * DataStreamingEndpointTypeStandard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-01T19:02:16.279151Z[GMT]")
public class DataStreamingEndpointTypeStandard {
  public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "endpoint_type";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
  private String endpointType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_LOG_LINE_SEPARATOR = "log_line_separator";
  @SerializedName(SERIALIZED_NAME_LOG_LINE_SEPARATOR)
  private String logLineSeparator;

  public static final String SERIALIZED_NAME_PAYLOAD_FORMAT = "payload_format";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_FORMAT)
  private String payloadFormat;

  public static final String SERIALIZED_NAME_MAX_SIZE = "max_size";
  @SerializedName(SERIALIZED_NAME_MAX_SIZE)
  private Integer maxSize;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private DataStreamingEndpointTypeStandardHeadersExample headers;

  public DataStreamingEndpointTypeStandard() {
  }

  public DataStreamingEndpointTypeStandard endpointType(String endpointType) {
    
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


  public DataStreamingEndpointTypeStandard url(URI url) {
    
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


  public DataStreamingEndpointTypeStandard logLineSeparator(String logLineSeparator) {
    
    this.logLineSeparator = logLineSeparator;
    return this;
  }

   /**
   * Get logLineSeparator
   * @return logLineSeparator
  **/
  @javax.annotation.Nullable
  public String getLogLineSeparator() {
    return logLineSeparator;
  }


  public void setLogLineSeparator(String logLineSeparator) {
    this.logLineSeparator = logLineSeparator;
  }


  public DataStreamingEndpointTypeStandard payloadFormat(String payloadFormat) {
    
    this.payloadFormat = payloadFormat;
    return this;
  }

   /**
   * Get payloadFormat
   * @return payloadFormat
  **/
  @javax.annotation.Nullable
  public String getPayloadFormat() {
    return payloadFormat;
  }


  public void setPayloadFormat(String payloadFormat) {
    this.payloadFormat = payloadFormat;
  }


  public DataStreamingEndpointTypeStandard maxSize(Integer maxSize) {
    
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Get maxSize
   * @return maxSize
  **/
  @javax.annotation.Nullable
  public Integer getMaxSize() {
    return maxSize;
  }


  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  public DataStreamingEndpointTypeStandard headers(DataStreamingEndpointTypeStandardHeadersExample headers) {
    
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  public DataStreamingEndpointTypeStandardHeadersExample getHeaders() {
    return headers;
  }


  public void setHeaders(DataStreamingEndpointTypeStandardHeadersExample headers) {
    this.headers = headers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStreamingEndpointTypeStandard dataStreamingEndpointTypeStandard = (DataStreamingEndpointTypeStandard) o;
    return Objects.equals(this.endpointType, dataStreamingEndpointTypeStandard.endpointType) &&
        Objects.equals(this.url, dataStreamingEndpointTypeStandard.url) &&
        Objects.equals(this.logLineSeparator, dataStreamingEndpointTypeStandard.logLineSeparator) &&
        Objects.equals(this.payloadFormat, dataStreamingEndpointTypeStandard.payloadFormat) &&
        Objects.equals(this.maxSize, dataStreamingEndpointTypeStandard.maxSize) &&
        Objects.equals(this.headers, dataStreamingEndpointTypeStandard.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, url, logLineSeparator, payloadFormat, maxSize, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStreamingEndpointTypeStandard {\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    logLineSeparator: ").append(toIndentedString(logLineSeparator)).append("\n");
    sb.append("    payloadFormat: ").append(toIndentedString(payloadFormat)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
    openapiFields.add("log_line_separator");
    openapiFields.add("payload_format");
    openapiFields.add("max_size");
    openapiFields.add("headers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataStreamingEndpointTypeStandard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataStreamingEndpointTypeStandard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataStreamingEndpointTypeStandard is not found in the empty JSON string", DataStreamingEndpointTypeStandard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataStreamingEndpointTypeStandard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataStreamingEndpointTypeStandard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("endpoint_type") != null && !jsonObj.get("endpoint_type").isJsonNull()) && !jsonObj.get("endpoint_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint_type").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("log_line_separator") != null && !jsonObj.get("log_line_separator").isJsonNull()) && !jsonObj.get("log_line_separator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_line_separator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_line_separator").toString()));
      }
      if ((jsonObj.get("payload_format") != null && !jsonObj.get("payload_format").isJsonNull()) && !jsonObj.get("payload_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload_format").toString()));
      }
      // validate the optional field `headers`
      if (jsonObj.get("headers") != null && !jsonObj.get("headers").isJsonNull()) {
        DataStreamingEndpointTypeStandardHeadersExample.validateJsonElement(jsonObj.get("headers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataStreamingEndpointTypeStandard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataStreamingEndpointTypeStandard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataStreamingEndpointTypeStandard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataStreamingEndpointTypeStandard.class));

       return (TypeAdapter<T>) new TypeAdapter<DataStreamingEndpointTypeStandard>() {
           @Override
           public void write(JsonWriter out, DataStreamingEndpointTypeStandard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataStreamingEndpointTypeStandard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataStreamingEndpointTypeStandard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataStreamingEndpointTypeStandard
  * @throws IOException if the JSON string is invalid with respect to DataStreamingEndpointTypeStandard
  */
  public static DataStreamingEndpointTypeStandard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataStreamingEndpointTypeStandard.class);
  }

 /**
  * Convert an instance of DataStreamingEndpointTypeStandard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

