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
import java.util.Arrays;

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
 * DataStreamingEndpointTypeKafka
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-01T19:02:16.279151Z[GMT]")
public class DataStreamingEndpointTypeKafka {
  public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "endpoint_type";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
  private String endpointType;

  public static final String SERIALIZED_NAME_USE_TLS = "use_tls";
  @SerializedName(SERIALIZED_NAME_USE_TLS)
  private Boolean useTls;

  public static final String SERIALIZED_NAME_KAFKA_TOPIC = "kafka_topic";
  @SerializedName(SERIALIZED_NAME_KAFKA_TOPIC)
  private String kafkaTopic;

  public static final String SERIALIZED_NAME_BOOTSTRAP_SERVERS = "bootstrap_servers";
  @SerializedName(SERIALIZED_NAME_BOOTSTRAP_SERVERS)
  private String bootstrapServers;

  public DataStreamingEndpointTypeKafka() {
  }

  public DataStreamingEndpointTypeKafka endpointType(String endpointType) {
    
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


  public DataStreamingEndpointTypeKafka useTls(Boolean useTls) {
    
    this.useTls = useTls;
    return this;
  }

   /**
   * Get useTls
   * @return useTls
  **/
  @javax.annotation.Nullable
  public Boolean getUseTls() {
    return useTls;
  }


  public void setUseTls(Boolean useTls) {
    this.useTls = useTls;
  }


  public DataStreamingEndpointTypeKafka kafkaTopic(String kafkaTopic) {
    
    this.kafkaTopic = kafkaTopic;
    return this;
  }

   /**
   * Get kafkaTopic
   * @return kafkaTopic
  **/
  @javax.annotation.Nullable
  public String getKafkaTopic() {
    return kafkaTopic;
  }


  public void setKafkaTopic(String kafkaTopic) {
    this.kafkaTopic = kafkaTopic;
  }


  public DataStreamingEndpointTypeKafka bootstrapServers(String bootstrapServers) {
    
    this.bootstrapServers = bootstrapServers;
    return this;
  }

   /**
   * Get bootstrapServers
   * @return bootstrapServers
  **/
  @javax.annotation.Nullable
  public String getBootstrapServers() {
    return bootstrapServers;
  }


  public void setBootstrapServers(String bootstrapServers) {
    this.bootstrapServers = bootstrapServers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStreamingEndpointTypeKafka dataStreamingEndpointTypeKafka = (DataStreamingEndpointTypeKafka) o;
    return Objects.equals(this.endpointType, dataStreamingEndpointTypeKafka.endpointType) &&
        Objects.equals(this.useTls, dataStreamingEndpointTypeKafka.useTls) &&
        Objects.equals(this.kafkaTopic, dataStreamingEndpointTypeKafka.kafkaTopic) &&
        Objects.equals(this.bootstrapServers, dataStreamingEndpointTypeKafka.bootstrapServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, useTls, kafkaTopic, bootstrapServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStreamingEndpointTypeKafka {\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    useTls: ").append(toIndentedString(useTls)).append("\n");
    sb.append("    kafkaTopic: ").append(toIndentedString(kafkaTopic)).append("\n");
    sb.append("    bootstrapServers: ").append(toIndentedString(bootstrapServers)).append("\n");
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
    openapiFields.add("use_tls");
    openapiFields.add("kafka_topic");
    openapiFields.add("bootstrap_servers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataStreamingEndpointTypeKafka
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataStreamingEndpointTypeKafka.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataStreamingEndpointTypeKafka is not found in the empty JSON string", DataStreamingEndpointTypeKafka.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataStreamingEndpointTypeKafka.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataStreamingEndpointTypeKafka` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("endpoint_type") != null && !jsonObj.get("endpoint_type").isJsonNull()) && !jsonObj.get("endpoint_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint_type").toString()));
      }
      if ((jsonObj.get("kafka_topic") != null && !jsonObj.get("kafka_topic").isJsonNull()) && !jsonObj.get("kafka_topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kafka_topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kafka_topic").toString()));
      }
      if ((jsonObj.get("bootstrap_servers") != null && !jsonObj.get("bootstrap_servers").isJsonNull()) && !jsonObj.get("bootstrap_servers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bootstrap_servers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bootstrap_servers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataStreamingEndpointTypeKafka.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataStreamingEndpointTypeKafka' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataStreamingEndpointTypeKafka> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataStreamingEndpointTypeKafka.class));

       return (TypeAdapter<T>) new TypeAdapter<DataStreamingEndpointTypeKafka>() {
           @Override
           public void write(JsonWriter out, DataStreamingEndpointTypeKafka value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataStreamingEndpointTypeKafka read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataStreamingEndpointTypeKafka given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataStreamingEndpointTypeKafka
  * @throws IOException if the JSON string is invalid with respect to DataStreamingEndpointTypeKafka
  */
  public static DataStreamingEndpointTypeKafka fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataStreamingEndpointTypeKafka.class);
  }

 /**
  * Convert an instance of DataStreamingEndpointTypeKafka to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

