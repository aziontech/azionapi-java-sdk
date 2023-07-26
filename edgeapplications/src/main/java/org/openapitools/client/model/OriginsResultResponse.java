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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OriginsResultResponseAddresses;

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
 * OriginsResultResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T14:06:45.298986Z[GMT]")
public class OriginsResultResponse {
  public static final String SERIALIZED_NAME_ORIGIN_ID = "origin_id";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ID)
  private Long originId;

  public static final String SERIALIZED_NAME_ORIGIN_KEY = "origin_key";
  @SerializedName(SERIALIZED_NAME_ORIGIN_KEY)
  private String originKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORIGIN_TYPE = "origin_type";
  @SerializedName(SERIALIZED_NAME_ORIGIN_TYPE)
  private String originType;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<OriginsResultResponseAddresses> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY = "origin_protocol_policy";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY)
  private String originProtocolPolicy;

  public static final String SERIALIZED_NAME_IS_ORIGIN_REDIRECTION_ENABLED = "is_origin_redirection_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ORIGIN_REDIRECTION_ENABLED)
  private Boolean isOriginRedirectionEnabled;

  public static final String SERIALIZED_NAME_HOST_HEADER = "host_header";
  @SerializedName(SERIALIZED_NAME_HOST_HEADER)
  private String hostHeader;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_ORIGIN_PATH = "origin_path";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PATH)
  private String originPath;

  public static final String SERIALIZED_NAME_CONNECTION_TIMEOUT = "connection_timeout";
  @SerializedName(SERIALIZED_NAME_CONNECTION_TIMEOUT)
  private Long connectionTimeout;

  public static final String SERIALIZED_NAME_TIMEOUT_BETWEEN_BYTES = "timeout_between_bytes";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_BETWEEN_BYTES)
  private Long timeoutBetweenBytes;

  public static final String SERIALIZED_NAME_HMAC_AUTHENTICATION = "hmac_authentication";
  @SerializedName(SERIALIZED_NAME_HMAC_AUTHENTICATION)
  private Boolean hmacAuthentication;

  public static final String SERIALIZED_NAME_HMAC_REGION_NAME = "hmac_region_name";
  @SerializedName(SERIALIZED_NAME_HMAC_REGION_NAME)
  private String hmacRegionName;

  public static final String SERIALIZED_NAME_HMAC_ACCESS_KEY = "hmac_access_key";
  @SerializedName(SERIALIZED_NAME_HMAC_ACCESS_KEY)
  private String hmacAccessKey;

  public static final String SERIALIZED_NAME_HMAC_SECRET_KEY = "hmac_secret_key";
  @SerializedName(SERIALIZED_NAME_HMAC_SECRET_KEY)
  private String hmacSecretKey;

  public OriginsResultResponse() {
  }

  public OriginsResultResponse originId(Long originId) {
    
    this.originId = originId;
    return this;
  }

   /**
   * Get originId
   * @return originId
  **/
  @javax.annotation.Nonnull
  public Long getOriginId() {
    return originId;
  }


  public void setOriginId(Long originId) {
    this.originId = originId;
  }


  public OriginsResultResponse originKey(String originKey) {
    
    this.originKey = originKey;
    return this;
  }

   /**
   * Get originKey
   * @return originKey
  **/
  @javax.annotation.Nonnull
  public String getOriginKey() {
    return originKey;
  }


  public void setOriginKey(String originKey) {
    this.originKey = originKey;
  }


  public OriginsResultResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OriginsResultResponse originType(String originType) {
    
    this.originType = originType;
    return this;
  }

   /**
   * Get originType
   * @return originType
  **/
  @javax.annotation.Nonnull
  public String getOriginType() {
    return originType;
  }


  public void setOriginType(String originType) {
    this.originType = originType;
  }


  public OriginsResultResponse addresses(List<OriginsResultResponseAddresses> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public OriginsResultResponse addAddressesItem(OriginsResultResponseAddresses addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  public List<OriginsResultResponseAddresses> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<OriginsResultResponseAddresses> addresses) {
    this.addresses = addresses;
  }


  public OriginsResultResponse originProtocolPolicy(String originProtocolPolicy) {
    
    this.originProtocolPolicy = originProtocolPolicy;
    return this;
  }

   /**
   * Get originProtocolPolicy
   * @return originProtocolPolicy
  **/
  @javax.annotation.Nonnull
  public String getOriginProtocolPolicy() {
    return originProtocolPolicy;
  }


  public void setOriginProtocolPolicy(String originProtocolPolicy) {
    this.originProtocolPolicy = originProtocolPolicy;
  }


  public OriginsResultResponse isOriginRedirectionEnabled(Boolean isOriginRedirectionEnabled) {
    
    this.isOriginRedirectionEnabled = isOriginRedirectionEnabled;
    return this;
  }

   /**
   * Get isOriginRedirectionEnabled
   * @return isOriginRedirectionEnabled
  **/
  @javax.annotation.Nonnull
  public Boolean getIsOriginRedirectionEnabled() {
    return isOriginRedirectionEnabled;
  }


  public void setIsOriginRedirectionEnabled(Boolean isOriginRedirectionEnabled) {
    this.isOriginRedirectionEnabled = isOriginRedirectionEnabled;
  }


  public OriginsResultResponse hostHeader(String hostHeader) {
    
    this.hostHeader = hostHeader;
    return this;
  }

   /**
   * Get hostHeader
   * @return hostHeader
  **/
  @javax.annotation.Nonnull
  public String getHostHeader() {
    return hostHeader;
  }


  public void setHostHeader(String hostHeader) {
    this.hostHeader = hostHeader;
  }


  public OriginsResultResponse method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public OriginsResultResponse originPath(String originPath) {
    
    this.originPath = originPath;
    return this;
  }

   /**
   * Get originPath
   * @return originPath
  **/
  @javax.annotation.Nonnull
  public String getOriginPath() {
    return originPath;
  }


  public void setOriginPath(String originPath) {
    this.originPath = originPath;
  }


  public OriginsResultResponse connectionTimeout(Long connectionTimeout) {
    
    this.connectionTimeout = connectionTimeout;
    return this;
  }

   /**
   * Get connectionTimeout
   * @return connectionTimeout
  **/
  @javax.annotation.Nonnull
  public Long getConnectionTimeout() {
    return connectionTimeout;
  }


  public void setConnectionTimeout(Long connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }


  public OriginsResultResponse timeoutBetweenBytes(Long timeoutBetweenBytes) {
    
    this.timeoutBetweenBytes = timeoutBetweenBytes;
    return this;
  }

   /**
   * Get timeoutBetweenBytes
   * @return timeoutBetweenBytes
  **/
  @javax.annotation.Nonnull
  public Long getTimeoutBetweenBytes() {
    return timeoutBetweenBytes;
  }


  public void setTimeoutBetweenBytes(Long timeoutBetweenBytes) {
    this.timeoutBetweenBytes = timeoutBetweenBytes;
  }


  public OriginsResultResponse hmacAuthentication(Boolean hmacAuthentication) {
    
    this.hmacAuthentication = hmacAuthentication;
    return this;
  }

   /**
   * Get hmacAuthentication
   * @return hmacAuthentication
  **/
  @javax.annotation.Nonnull
  public Boolean getHmacAuthentication() {
    return hmacAuthentication;
  }


  public void setHmacAuthentication(Boolean hmacAuthentication) {
    this.hmacAuthentication = hmacAuthentication;
  }


  public OriginsResultResponse hmacRegionName(String hmacRegionName) {
    
    this.hmacRegionName = hmacRegionName;
    return this;
  }

   /**
   * Get hmacRegionName
   * @return hmacRegionName
  **/
  @javax.annotation.Nonnull
  public String getHmacRegionName() {
    return hmacRegionName;
  }


  public void setHmacRegionName(String hmacRegionName) {
    this.hmacRegionName = hmacRegionName;
  }


  public OriginsResultResponse hmacAccessKey(String hmacAccessKey) {
    
    this.hmacAccessKey = hmacAccessKey;
    return this;
  }

   /**
   * Get hmacAccessKey
   * @return hmacAccessKey
  **/
  @javax.annotation.Nonnull
  public String getHmacAccessKey() {
    return hmacAccessKey;
  }


  public void setHmacAccessKey(String hmacAccessKey) {
    this.hmacAccessKey = hmacAccessKey;
  }


  public OriginsResultResponse hmacSecretKey(String hmacSecretKey) {
    
    this.hmacSecretKey = hmacSecretKey;
    return this;
  }

   /**
   * Get hmacSecretKey
   * @return hmacSecretKey
  **/
  @javax.annotation.Nonnull
  public String getHmacSecretKey() {
    return hmacSecretKey;
  }


  public void setHmacSecretKey(String hmacSecretKey) {
    this.hmacSecretKey = hmacSecretKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginsResultResponse originsResultResponse = (OriginsResultResponse) o;
    return Objects.equals(this.originId, originsResultResponse.originId) &&
        Objects.equals(this.originKey, originsResultResponse.originKey) &&
        Objects.equals(this.name, originsResultResponse.name) &&
        Objects.equals(this.originType, originsResultResponse.originType) &&
        Objects.equals(this.addresses, originsResultResponse.addresses) &&
        Objects.equals(this.originProtocolPolicy, originsResultResponse.originProtocolPolicy) &&
        Objects.equals(this.isOriginRedirectionEnabled, originsResultResponse.isOriginRedirectionEnabled) &&
        Objects.equals(this.hostHeader, originsResultResponse.hostHeader) &&
        Objects.equals(this.method, originsResultResponse.method) &&
        Objects.equals(this.originPath, originsResultResponse.originPath) &&
        Objects.equals(this.connectionTimeout, originsResultResponse.connectionTimeout) &&
        Objects.equals(this.timeoutBetweenBytes, originsResultResponse.timeoutBetweenBytes) &&
        Objects.equals(this.hmacAuthentication, originsResultResponse.hmacAuthentication) &&
        Objects.equals(this.hmacRegionName, originsResultResponse.hmacRegionName) &&
        Objects.equals(this.hmacAccessKey, originsResultResponse.hmacAccessKey) &&
        Objects.equals(this.hmacSecretKey, originsResultResponse.hmacSecretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originId, originKey, name, originType, addresses, originProtocolPolicy, isOriginRedirectionEnabled, hostHeader, method, originPath, connectionTimeout, timeoutBetweenBytes, hmacAuthentication, hmacRegionName, hmacAccessKey, hmacSecretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginsResultResponse {\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
    sb.append("    originKey: ").append(toIndentedString(originKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    originProtocolPolicy: ").append(toIndentedString(originProtocolPolicy)).append("\n");
    sb.append("    isOriginRedirectionEnabled: ").append(toIndentedString(isOriginRedirectionEnabled)).append("\n");
    sb.append("    hostHeader: ").append(toIndentedString(hostHeader)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    originPath: ").append(toIndentedString(originPath)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    timeoutBetweenBytes: ").append(toIndentedString(timeoutBetweenBytes)).append("\n");
    sb.append("    hmacAuthentication: ").append(toIndentedString(hmacAuthentication)).append("\n");
    sb.append("    hmacRegionName: ").append(toIndentedString(hmacRegionName)).append("\n");
    sb.append("    hmacAccessKey: ").append(toIndentedString(hmacAccessKey)).append("\n");
    sb.append("    hmacSecretKey: ").append(toIndentedString(hmacSecretKey)).append("\n");
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
    openapiFields.add("origin_id");
    openapiFields.add("origin_key");
    openapiFields.add("name");
    openapiFields.add("origin_type");
    openapiFields.add("addresses");
    openapiFields.add("origin_protocol_policy");
    openapiFields.add("is_origin_redirection_enabled");
    openapiFields.add("host_header");
    openapiFields.add("method");
    openapiFields.add("origin_path");
    openapiFields.add("connection_timeout");
    openapiFields.add("timeout_between_bytes");
    openapiFields.add("hmac_authentication");
    openapiFields.add("hmac_region_name");
    openapiFields.add("hmac_access_key");
    openapiFields.add("hmac_secret_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("origin_id");
    openapiRequiredFields.add("origin_key");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("origin_type");
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("origin_protocol_policy");
    openapiRequiredFields.add("is_origin_redirection_enabled");
    openapiRequiredFields.add("host_header");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("origin_path");
    openapiRequiredFields.add("connection_timeout");
    openapiRequiredFields.add("timeout_between_bytes");
    openapiRequiredFields.add("hmac_authentication");
    openapiRequiredFields.add("hmac_region_name");
    openapiRequiredFields.add("hmac_access_key");
    openapiRequiredFields.add("hmac_secret_key");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OriginsResultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OriginsResultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OriginsResultResponse is not found in the empty JSON string", OriginsResultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OriginsResultResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OriginsResultResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OriginsResultResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("origin_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_key").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("origin_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }

      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      // validate the required field `addresses` (array)
      for (int i = 0; i < jsonArrayaddresses.size(); i++) {
        OriginsResultResponseAddresses.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("origin_protocol_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_protocol_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_protocol_policy").toString()));
      }
      if (!jsonObj.get("host_header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_header").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (!jsonObj.get("origin_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_path").toString()));
      }
      if (!jsonObj.get("hmac_region_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_region_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_region_name").toString()));
      }
      if (!jsonObj.get("hmac_access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_access_key").toString()));
      }
      if (!jsonObj.get("hmac_secret_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_secret_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_secret_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OriginsResultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OriginsResultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OriginsResultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OriginsResultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OriginsResultResponse>() {
           @Override
           public void write(JsonWriter out, OriginsResultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OriginsResultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OriginsResultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OriginsResultResponse
  * @throws IOException if the JSON string is invalid with respect to OriginsResultResponse
  */
  public static OriginsResultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginsResultResponse.class);
  }

 /**
  * Convert an instance of OriginsResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

