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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * ApplicationPutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-14T13:33:25.626884Z[GMT]", comments = "Generator version: 7.6.0")
public class ApplicationPutRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DELIVERY_PROTOCOL = "delivery_protocol";
  @SerializedName(SERIALIZED_NAME_DELIVERY_PROTOCOL)
  private String deliveryProtocol;

  public static final String SERIALIZED_NAME_HTTP_PORT = "http_port";
  @SerializedName(SERIALIZED_NAME_HTTP_PORT)
  private Object httpPort = null;

  public static final String SERIALIZED_NAME_HTTPS_PORT = "https_port";
  @SerializedName(SERIALIZED_NAME_HTTPS_PORT)
  private Object httpsPort = null;

  public static final String SERIALIZED_NAME_MINIMUM_TLS_VERSION = "minimum_tls_version";
  @SerializedName(SERIALIZED_NAME_MINIMUM_TLS_VERSION)
  private String minimumTlsVersion;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_APPLICATION_ACCELERATION = "application_acceleration";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ACCELERATION)
  private Boolean applicationAcceleration;

  public static final String SERIALIZED_NAME_DEVICE_DETECTION = "device_detection";
  @SerializedName(SERIALIZED_NAME_DEVICE_DETECTION)
  private Boolean deviceDetection;

  public static final String SERIALIZED_NAME_EDGE_FIREWALL = "edge_firewall";
  @SerializedName(SERIALIZED_NAME_EDGE_FIREWALL)
  private Boolean edgeFirewall;

  public static final String SERIALIZED_NAME_EDGE_FUNCTIONS = "edge_functions";
  @SerializedName(SERIALIZED_NAME_EDGE_FUNCTIONS)
  private Boolean edgeFunctions;

  public static final String SERIALIZED_NAME_IMAGE_OPTIMIZATION = "image_optimization";
  @SerializedName(SERIALIZED_NAME_IMAGE_OPTIMIZATION)
  private Boolean imageOptimization;

  public static final String SERIALIZED_NAME_L2_CACHING = "l2_caching";
  @SerializedName(SERIALIZED_NAME_L2_CACHING)
  private Boolean l2Caching;

  public static final String SERIALIZED_NAME_LOAD_BALANCER = "load_balancer";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER)
  private Boolean loadBalancer;

  public static final String SERIALIZED_NAME_RAW_LOGS = "raw_logs";
  @SerializedName(SERIALIZED_NAME_RAW_LOGS)
  private Boolean rawLogs;

  public static final String SERIALIZED_NAME_WEB_APPLICATION_FIREWALL = "web_application_firewall";
  @SerializedName(SERIALIZED_NAME_WEB_APPLICATION_FIREWALL)
  private Boolean webApplicationFirewall;

  public static final String SERIALIZED_NAME_DEBUG_RULES = "debug_rules";
  @SerializedName(SERIALIZED_NAME_DEBUG_RULES)
  private Boolean debugRules;

  public static final String SERIALIZED_NAME_HTTP3 = "http3";
  @SerializedName(SERIALIZED_NAME_HTTP3)
  private Boolean http3;

  public static final String SERIALIZED_NAME_WEBSOCKET = "websocket";
  @SerializedName(SERIALIZED_NAME_WEBSOCKET)
  private Boolean websocket;

  public static final String SERIALIZED_NAME_SUPPORTED_CIPHERS = "supported_ciphers";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_CIPHERS)
  private String supportedCiphers;

  public ApplicationPutRequest() {
  }

  public ApplicationPutRequest name(String name) {
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


  public ApplicationPutRequest deliveryProtocol(String deliveryProtocol) {
    this.deliveryProtocol = deliveryProtocol;
    return this;
  }

   /**
   * Get deliveryProtocol
   * @return deliveryProtocol
  **/
  @javax.annotation.Nullable
  public String getDeliveryProtocol() {
    return deliveryProtocol;
  }

  public void setDeliveryProtocol(String deliveryProtocol) {
    this.deliveryProtocol = deliveryProtocol;
  }


  public ApplicationPutRequest httpPort(Object httpPort) {
    this.httpPort = httpPort;
    return this;
  }

   /**
   * Get httpPort
   * @return httpPort
  **/
  @javax.annotation.Nullable
  public Object getHttpPort() {
    return httpPort;
  }

  public void setHttpPort(Object httpPort) {
    this.httpPort = httpPort;
  }


  public ApplicationPutRequest httpsPort(Object httpsPort) {
    this.httpsPort = httpsPort;
    return this;
  }

   /**
   * Get httpsPort
   * @return httpsPort
  **/
  @javax.annotation.Nullable
  public Object getHttpsPort() {
    return httpsPort;
  }

  public void setHttpsPort(Object httpsPort) {
    this.httpsPort = httpsPort;
  }


  public ApplicationPutRequest minimumTlsVersion(String minimumTlsVersion) {
    this.minimumTlsVersion = minimumTlsVersion;
    return this;
  }

   /**
   * Get minimumTlsVersion
   * @return minimumTlsVersion
  **/
  @javax.annotation.Nullable
  public String getMinimumTlsVersion() {
    return minimumTlsVersion;
  }

  public void setMinimumTlsVersion(String minimumTlsVersion) {
    this.minimumTlsVersion = minimumTlsVersion;
  }


  public ApplicationPutRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  public ApplicationPutRequest applicationAcceleration(Boolean applicationAcceleration) {
    this.applicationAcceleration = applicationAcceleration;
    return this;
  }

   /**
   * Get applicationAcceleration
   * @return applicationAcceleration
  **/
  @javax.annotation.Nullable
  public Boolean getApplicationAcceleration() {
    return applicationAcceleration;
  }

  public void setApplicationAcceleration(Boolean applicationAcceleration) {
    this.applicationAcceleration = applicationAcceleration;
  }


  public ApplicationPutRequest deviceDetection(Boolean deviceDetection) {
    this.deviceDetection = deviceDetection;
    return this;
  }

   /**
   * Get deviceDetection
   * @return deviceDetection
  **/
  @javax.annotation.Nullable
  public Boolean getDeviceDetection() {
    return deviceDetection;
  }

  public void setDeviceDetection(Boolean deviceDetection) {
    this.deviceDetection = deviceDetection;
  }


  public ApplicationPutRequest edgeFirewall(Boolean edgeFirewall) {
    this.edgeFirewall = edgeFirewall;
    return this;
  }

   /**
   * Get edgeFirewall
   * @return edgeFirewall
  **/
  @javax.annotation.Nullable
  public Boolean getEdgeFirewall() {
    return edgeFirewall;
  }

  public void setEdgeFirewall(Boolean edgeFirewall) {
    this.edgeFirewall = edgeFirewall;
  }


  public ApplicationPutRequest edgeFunctions(Boolean edgeFunctions) {
    this.edgeFunctions = edgeFunctions;
    return this;
  }

   /**
   * Get edgeFunctions
   * @return edgeFunctions
  **/
  @javax.annotation.Nullable
  public Boolean getEdgeFunctions() {
    return edgeFunctions;
  }

  public void setEdgeFunctions(Boolean edgeFunctions) {
    this.edgeFunctions = edgeFunctions;
  }


  public ApplicationPutRequest imageOptimization(Boolean imageOptimization) {
    this.imageOptimization = imageOptimization;
    return this;
  }

   /**
   * Get imageOptimization
   * @return imageOptimization
  **/
  @javax.annotation.Nullable
  public Boolean getImageOptimization() {
    return imageOptimization;
  }

  public void setImageOptimization(Boolean imageOptimization) {
    this.imageOptimization = imageOptimization;
  }


  public ApplicationPutRequest l2Caching(Boolean l2Caching) {
    this.l2Caching = l2Caching;
    return this;
  }

   /**
   * Get l2Caching
   * @return l2Caching
  **/
  @javax.annotation.Nullable
  public Boolean getL2Caching() {
    return l2Caching;
  }

  public void setL2Caching(Boolean l2Caching) {
    this.l2Caching = l2Caching;
  }


  public ApplicationPutRequest loadBalancer(Boolean loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }

   /**
   * Get loadBalancer
   * @return loadBalancer
  **/
  @javax.annotation.Nullable
  public Boolean getLoadBalancer() {
    return loadBalancer;
  }

  public void setLoadBalancer(Boolean loadBalancer) {
    this.loadBalancer = loadBalancer;
  }


  public ApplicationPutRequest rawLogs(Boolean rawLogs) {
    this.rawLogs = rawLogs;
    return this;
  }

   /**
   * Get rawLogs
   * @return rawLogs
  **/
  @javax.annotation.Nullable
  public Boolean getRawLogs() {
    return rawLogs;
  }

  public void setRawLogs(Boolean rawLogs) {
    this.rawLogs = rawLogs;
  }


  public ApplicationPutRequest webApplicationFirewall(Boolean webApplicationFirewall) {
    this.webApplicationFirewall = webApplicationFirewall;
    return this;
  }

   /**
   * Get webApplicationFirewall
   * @return webApplicationFirewall
  **/
  @javax.annotation.Nullable
  public Boolean getWebApplicationFirewall() {
    return webApplicationFirewall;
  }

  public void setWebApplicationFirewall(Boolean webApplicationFirewall) {
    this.webApplicationFirewall = webApplicationFirewall;
  }


  public ApplicationPutRequest debugRules(Boolean debugRules) {
    this.debugRules = debugRules;
    return this;
  }

   /**
   * Get debugRules
   * @return debugRules
  **/
  @javax.annotation.Nullable
  public Boolean getDebugRules() {
    return debugRules;
  }

  public void setDebugRules(Boolean debugRules) {
    this.debugRules = debugRules;
  }


  public ApplicationPutRequest http3(Boolean http3) {
    this.http3 = http3;
    return this;
  }

   /**
   * Get http3
   * @return http3
  **/
  @javax.annotation.Nullable
  public Boolean getHttp3() {
    return http3;
  }

  public void setHttp3(Boolean http3) {
    this.http3 = http3;
  }


  public ApplicationPutRequest websocket(Boolean websocket) {
    this.websocket = websocket;
    return this;
  }

   /**
   * Get websocket
   * @return websocket
  **/
  @javax.annotation.Nullable
  public Boolean getWebsocket() {
    return websocket;
  }

  public void setWebsocket(Boolean websocket) {
    this.websocket = websocket;
  }


  public ApplicationPutRequest supportedCiphers(String supportedCiphers) {
    this.supportedCiphers = supportedCiphers;
    return this;
  }

   /**
   * Get supportedCiphers
   * @return supportedCiphers
  **/
  @javax.annotation.Nullable
  public String getSupportedCiphers() {
    return supportedCiphers;
  }

  public void setSupportedCiphers(String supportedCiphers) {
    this.supportedCiphers = supportedCiphers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationPutRequest applicationPutRequest = (ApplicationPutRequest) o;
    return Objects.equals(this.name, applicationPutRequest.name) &&
        Objects.equals(this.deliveryProtocol, applicationPutRequest.deliveryProtocol) &&
        Objects.equals(this.httpPort, applicationPutRequest.httpPort) &&
        Objects.equals(this.httpsPort, applicationPutRequest.httpsPort) &&
        Objects.equals(this.minimumTlsVersion, applicationPutRequest.minimumTlsVersion) &&
        Objects.equals(this.active, applicationPutRequest.active) &&
        Objects.equals(this.applicationAcceleration, applicationPutRequest.applicationAcceleration) &&
        Objects.equals(this.deviceDetection, applicationPutRequest.deviceDetection) &&
        Objects.equals(this.edgeFirewall, applicationPutRequest.edgeFirewall) &&
        Objects.equals(this.edgeFunctions, applicationPutRequest.edgeFunctions) &&
        Objects.equals(this.imageOptimization, applicationPutRequest.imageOptimization) &&
        Objects.equals(this.l2Caching, applicationPutRequest.l2Caching) &&
        Objects.equals(this.loadBalancer, applicationPutRequest.loadBalancer) &&
        Objects.equals(this.rawLogs, applicationPutRequest.rawLogs) &&
        Objects.equals(this.webApplicationFirewall, applicationPutRequest.webApplicationFirewall) &&
        Objects.equals(this.debugRules, applicationPutRequest.debugRules) &&
        Objects.equals(this.http3, applicationPutRequest.http3) &&
        Objects.equals(this.websocket, applicationPutRequest.websocket) &&
        Objects.equals(this.supportedCiphers, applicationPutRequest.supportedCiphers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, deliveryProtocol, httpPort, httpsPort, minimumTlsVersion, active, applicationAcceleration, deviceDetection, edgeFirewall, edgeFunctions, imageOptimization, l2Caching, loadBalancer, rawLogs, webApplicationFirewall, debugRules, http3, websocket, supportedCiphers);
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
    sb.append("class ApplicationPutRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deliveryProtocol: ").append(toIndentedString(deliveryProtocol)).append("\n");
    sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
    sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
    sb.append("    minimumTlsVersion: ").append(toIndentedString(minimumTlsVersion)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    applicationAcceleration: ").append(toIndentedString(applicationAcceleration)).append("\n");
    sb.append("    deviceDetection: ").append(toIndentedString(deviceDetection)).append("\n");
    sb.append("    edgeFirewall: ").append(toIndentedString(edgeFirewall)).append("\n");
    sb.append("    edgeFunctions: ").append(toIndentedString(edgeFunctions)).append("\n");
    sb.append("    imageOptimization: ").append(toIndentedString(imageOptimization)).append("\n");
    sb.append("    l2Caching: ").append(toIndentedString(l2Caching)).append("\n");
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
    sb.append("    rawLogs: ").append(toIndentedString(rawLogs)).append("\n");
    sb.append("    webApplicationFirewall: ").append(toIndentedString(webApplicationFirewall)).append("\n");
    sb.append("    debugRules: ").append(toIndentedString(debugRules)).append("\n");
    sb.append("    http3: ").append(toIndentedString(http3)).append("\n");
    sb.append("    websocket: ").append(toIndentedString(websocket)).append("\n");
    sb.append("    supportedCiphers: ").append(toIndentedString(supportedCiphers)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("delivery_protocol");
    openapiFields.add("http_port");
    openapiFields.add("https_port");
    openapiFields.add("minimum_tls_version");
    openapiFields.add("active");
    openapiFields.add("application_acceleration");
    openapiFields.add("device_detection");
    openapiFields.add("edge_firewall");
    openapiFields.add("edge_functions");
    openapiFields.add("image_optimization");
    openapiFields.add("l2_caching");
    openapiFields.add("load_balancer");
    openapiFields.add("raw_logs");
    openapiFields.add("web_application_firewall");
    openapiFields.add("debug_rules");
    openapiFields.add("http3");
    openapiFields.add("websocket");
    openapiFields.add("supported_ciphers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApplicationPutRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApplicationPutRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationPutRequest is not found in the empty JSON string", ApplicationPutRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApplicationPutRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationPutRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationPutRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("delivery_protocol") != null && !jsonObj.get("delivery_protocol").isJsonNull()) && !jsonObj.get("delivery_protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_protocol").toString()));
      }
      if ((jsonObj.get("minimum_tls_version") != null && !jsonObj.get("minimum_tls_version").isJsonNull()) && !jsonObj.get("minimum_tls_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimum_tls_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimum_tls_version").toString()));
      }
      if ((jsonObj.get("supported_ciphers") != null && !jsonObj.get("supported_ciphers").isJsonNull()) && !jsonObj.get("supported_ciphers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_ciphers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supported_ciphers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationPutRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationPutRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationPutRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationPutRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationPutRequest>() {
           @Override
           public void write(JsonWriter out, ApplicationPutRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationPutRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationPutRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationPutRequest
  * @throws IOException if the JSON string is invalid with respect to ApplicationPutRequest
  */
  public static ApplicationPutRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationPutRequest.class);
  }

 /**
  * Convert an instance of ApplicationPutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

