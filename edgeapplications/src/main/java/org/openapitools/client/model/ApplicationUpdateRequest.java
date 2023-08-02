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
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ApplicationUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T20:17:46.412201Z[GMT]")
public class ApplicationUpdateRequest {
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

  public static final String SERIALIZED_NAME_DEBUG_RULES = "debug_rules";
  @SerializedName(SERIALIZED_NAME_DEBUG_RULES)
  private Boolean debugRules;

  public static final String SERIALIZED_NAME_APPLICATION_ACCELERATION = "application_acceleration";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ACCELERATION)
  private Boolean applicationAcceleration;

  public static final String SERIALIZED_NAME_CACHING = "caching";
  @SerializedName(SERIALIZED_NAME_CACHING)
  private Boolean caching;

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

  public ApplicationUpdateRequest() {
  }

  public ApplicationUpdateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationUpdateRequest deliveryProtocol(String deliveryProtocol) {
    
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


  public ApplicationUpdateRequest httpPort(Object httpPort) {
    
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


  public ApplicationUpdateRequest httpsPort(Object httpsPort) {
    
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


  public ApplicationUpdateRequest minimumTlsVersion(String minimumTlsVersion) {
    
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


  public ApplicationUpdateRequest active(Boolean active) {
    
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


  public ApplicationUpdateRequest debugRules(Boolean debugRules) {
    
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


  public ApplicationUpdateRequest applicationAcceleration(Boolean applicationAcceleration) {
    
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


  public ApplicationUpdateRequest caching(Boolean caching) {
    
    this.caching = caching;
    return this;
  }

   /**
   * Get caching
   * @return caching
  **/
  @javax.annotation.Nullable
  public Boolean getCaching() {
    return caching;
  }


  public void setCaching(Boolean caching) {
    this.caching = caching;
  }


  public ApplicationUpdateRequest deviceDetection(Boolean deviceDetection) {
    
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


  public ApplicationUpdateRequest edgeFirewall(Boolean edgeFirewall) {
    
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


  public ApplicationUpdateRequest edgeFunctions(Boolean edgeFunctions) {
    
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


  public ApplicationUpdateRequest imageOptimization(Boolean imageOptimization) {
    
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


  public ApplicationUpdateRequest l2Caching(Boolean l2Caching) {
    
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


  public ApplicationUpdateRequest loadBalancer(Boolean loadBalancer) {
    
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


  public ApplicationUpdateRequest rawLogs(Boolean rawLogs) {
    
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


  public ApplicationUpdateRequest webApplicationFirewall(Boolean webApplicationFirewall) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationUpdateRequest applicationUpdateRequest = (ApplicationUpdateRequest) o;
    return Objects.equals(this.name, applicationUpdateRequest.name) &&
        Objects.equals(this.deliveryProtocol, applicationUpdateRequest.deliveryProtocol) &&
        Objects.equals(this.httpPort, applicationUpdateRequest.httpPort) &&
        Objects.equals(this.httpsPort, applicationUpdateRequest.httpsPort) &&
        Objects.equals(this.minimumTlsVersion, applicationUpdateRequest.minimumTlsVersion) &&
        Objects.equals(this.active, applicationUpdateRequest.active) &&
        Objects.equals(this.debugRules, applicationUpdateRequest.debugRules) &&
        Objects.equals(this.applicationAcceleration, applicationUpdateRequest.applicationAcceleration) &&
        Objects.equals(this.caching, applicationUpdateRequest.caching) &&
        Objects.equals(this.deviceDetection, applicationUpdateRequest.deviceDetection) &&
        Objects.equals(this.edgeFirewall, applicationUpdateRequest.edgeFirewall) &&
        Objects.equals(this.edgeFunctions, applicationUpdateRequest.edgeFunctions) &&
        Objects.equals(this.imageOptimization, applicationUpdateRequest.imageOptimization) &&
        Objects.equals(this.l2Caching, applicationUpdateRequest.l2Caching) &&
        Objects.equals(this.loadBalancer, applicationUpdateRequest.loadBalancer) &&
        Objects.equals(this.rawLogs, applicationUpdateRequest.rawLogs) &&
        Objects.equals(this.webApplicationFirewall, applicationUpdateRequest.webApplicationFirewall);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, deliveryProtocol, httpPort, httpsPort, minimumTlsVersion, active, debugRules, applicationAcceleration, caching, deviceDetection, edgeFirewall, edgeFunctions, imageOptimization, l2Caching, loadBalancer, rawLogs, webApplicationFirewall);
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
    sb.append("class ApplicationUpdateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deliveryProtocol: ").append(toIndentedString(deliveryProtocol)).append("\n");
    sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
    sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
    sb.append("    minimumTlsVersion: ").append(toIndentedString(minimumTlsVersion)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    debugRules: ").append(toIndentedString(debugRules)).append("\n");
    sb.append("    applicationAcceleration: ").append(toIndentedString(applicationAcceleration)).append("\n");
    sb.append("    caching: ").append(toIndentedString(caching)).append("\n");
    sb.append("    deviceDetection: ").append(toIndentedString(deviceDetection)).append("\n");
    sb.append("    edgeFirewall: ").append(toIndentedString(edgeFirewall)).append("\n");
    sb.append("    edgeFunctions: ").append(toIndentedString(edgeFunctions)).append("\n");
    sb.append("    imageOptimization: ").append(toIndentedString(imageOptimization)).append("\n");
    sb.append("    l2Caching: ").append(toIndentedString(l2Caching)).append("\n");
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
    sb.append("    rawLogs: ").append(toIndentedString(rawLogs)).append("\n");
    sb.append("    webApplicationFirewall: ").append(toIndentedString(webApplicationFirewall)).append("\n");
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
    openapiFields.add("debug_rules");
    openapiFields.add("application_acceleration");
    openapiFields.add("caching");
    openapiFields.add("device_detection");
    openapiFields.add("edge_firewall");
    openapiFields.add("edge_functions");
    openapiFields.add("image_optimization");
    openapiFields.add("l2_caching");
    openapiFields.add("load_balancer");
    openapiFields.add("raw_logs");
    openapiFields.add("web_application_firewall");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationUpdateRequest is not found in the empty JSON string", ApplicationUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("delivery_protocol") != null && !jsonObj.get("delivery_protocol").isJsonNull()) && !jsonObj.get("delivery_protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_protocol").toString()));
      }
      if ((jsonObj.get("minimum_tls_version") != null && !jsonObj.get("minimum_tls_version").isJsonNull()) && !jsonObj.get("minimum_tls_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimum_tls_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimum_tls_version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationUpdateRequest>() {
           @Override
           public void write(JsonWriter out, ApplicationUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to ApplicationUpdateRequest
  */
  public static ApplicationUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationUpdateRequest.class);
  }

 /**
  * Convert an instance of ApplicationUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

