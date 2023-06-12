/*
 * Edge Application
 * ## Welcome to the Azion API!  With the following APIs you can check, remove or update existing settings, besides creating new ones.  * * *  ## Overview  The Azion API is a RESTful API, based on HTTPS requests, that allows you to integrate your systems with our platform, simply, quickly, and securely.  Here you will find instructions on how our API works and what functionality is available.  This documentation is being constantly updated. Make sure you verify if there are any updates or changes before you perform any development in your application, even if you are familiar with our API.  * * *  Both HTTPS requests and responses must be in JavaScript Object Notation (JSON) format. All HTTPS requests and responses must follow these conventions.  **Base URL**  The base URL of the API, which must be used, is:  [**https://api.azionapi.net/_**](https://api.azionapi.net/)  **HTTP Methods**  Each HTTP method defines the type of operation that will be run.  | HTTP Method | CRUD | Whole Collection (e.g. /items) | Specific Item (e.g. /items/:item_id) | | --- | --- | --- | --- | | GET | Read | It retrieves the list of items in a Collection. | It retrieves a specific item in a Collection. | | POST | Create | It creates a new item in the Collection. | \\- | | PUT | Update/Replace | It replaces a whole Collection with a new one. | It replaces an item in a Collection with a new one. | | PATCH | Update/Modify | It partially updates a Collection. | It partially updates an item in a Collection | | DELETE | Delete | It deletes a whole Collection. | It deletes an item in a Collection. |  * * *  **Status Codes**  The HTTP return code defines the status – successful or not – after the requested operation is run.  | Status Code | Meaning | | --- | --- | | 200 OK | General Status for a successful operation. | | 201 CREATED | Successfully created a collection or item, by means of POST or PUT. | | 204 NO CONTENT | Successful operation, but without any content to be return to the Body. Generally used for DELETE or PUT operations. | | 207 MULTI-STATUS | A batch of operations were triggered by a single request, which resulted in different return codes when it was run, for some of the operations. The codes are displayed in the “status” field, in the body of the response, for each sub-batch of operations for whichever are applicable. | | 400 BAD REQUEST | Request error, such as invalid parameters, missing mandatory parameters or others. | | 401 UNAUTHORIZED | Error caused by a missing HTTP Authentication header. | | 403 FORBIDDEN | User does not have the permissions to run the requested operation. | | 404 NOT FOUND | The requested resource does not exist. | | 405 METHOD NOT ALLOWED | The requested method is not applicable with the URL. | | 406 NOT ACCEPTABLE | Accept header missing from the HTTP request or the header contains formatting or the version is not supported by the API. | | 409 CONFLICT | Conflict generated in running the request, such as a request to create an already existing record. | | 429 TOO MANY REQUESTS | The request was temporarily rejected, due to exceeding the limit on operations. Wait for the time defined in the X-Ratelimit-Reset header and try again. | | 500 INTERNAL SERVER ERROR | Unintentional error, due to an unidentified failure in the request process. | | \\--- |  | | **HTTP Headers** |  |  All requests must be generated with the HTTP header specifying the desired code format for responses and the API version used. The current version of the API is 3 and the format is application/json.  ``` Accept: application/json; version=3  ```  * * *  **Rate Limit**  The limit of operations that can be run via the API is defined by 3 HTTP response headers:  *   **X-ratelimit-limit:** number of operations allowed in one time-frame; *   **X-ratelimit-remaining:** number of operations still available in one time-frame; *   **X-ratelimit-reset:** is the date and time, in IOS 8601 format, which represents the point in the future when the time-frame will be closed and when the limits will, therefore, be reset.       Example of HTTP response headers and a request:  ``` Date: Thu, 02 Nov 2017 12:30:28 GMT X-ratelimit-remaining: 199 X-ratelimit-limit: 200 X-ratelimit-reset: 2017-11-02T12:31:28.675446  ```  In the example provided, 200 operations are allowed within a 1-minute time frame. Of those, there are 199 still available, because one has already been run. The total limit will be reset after 1 minute.  When the X-ratelimit-limit is reached, or in other words, when the X-ratelimit-remaining reaches zero, the API will give the error, HTTP 429 TOO MANY REQUESTS. If your application receives this error, you will need to wait until the time defined in X-ratelimit-reset has passed, to make another request.  *   **X-ratelimit-limit by product**       The *X-ratelimit limit* variations by product are the following:  *   **Real-Time Metrics:** 20 requests per minute. *   **Real-Time Purge:** 200 requests per minute; except for the Wildcard, which is 2000 a day.       > The rate-limit values are based on the client_id.  * * *  **Optional Parameters**  In this version, it is possible to include some optional parameters as part of the GET method, which can help and modify the form in which your data will be returned.  You can combine these parameters to get the result you want.  They are:  | Parameter | Description | Accepted values: | | --- | --- | --- | | order_by | Identifies which field the return should be sorted by. The default ordering is ascending. | Depends on the fields available from the endpoint structure | | sort | Defines which ordering to be used: ascending or descending. | asc  <br>  <br>desc | | page | Identifies which page should be returned, if the return is paginated. The default value is 1. | Page number. | | page_size | Identifies how many items should be returned per page. The default value is 10. | Desired number of items. |  * * *  **Request Exemple**  You can use one parameter, or a combination. See the example below, which uses all of them in the same request.  ``` GET /domains?order_by=name&page_size=20&sort=desc&page=3 Accept: application/json; version=3 Authorization: token 2909f3932069047f4736dc87e72baaddd19c9f75  ```  * * *  # Authentication  Authentication and authorization of operations via Azion API is done through Tokens.  The first step is to create the Token through authenticating a user registered in [Real-Time Manager](https://sso.azion.com/login).  * * *  ## Encoding Username and Password in Base64  Only token creation and cancelling operations are performed through Basic Authentication, that is, with a username and password. You can create and cancel the token through the API itself, but for that you need to encode your username and password in base64.  Base64 encoding can be done from the command line on a Unix terminal:  ``` $ echo 'user@domain:password'|base64 dXNlckBkb21haW46cGFzc3dvcmQK  ```  If you do not have a Unix terminal available, you can use the free online service at [https://www.base64encode.org/](https://www.base64encode.org/)
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
import org.openapitools.client.model.ModelInterface;

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
 * ApplicationPutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-09T21:49:05.053927Z[GMT]")
public class ApplicationPutRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DELIVERY_PROTOCOL = "delivery_protocol";
  @SerializedName(SERIALIZED_NAME_DELIVERY_PROTOCOL)
  private String deliveryProtocol;

  public static final String SERIALIZED_NAME_HTTP_PORT = "http_port";
  @SerializedName(SERIALIZED_NAME_HTTP_PORT)
  private ModelInterface httpPort = null;

  public static final String SERIALIZED_NAME_HTTPS_PORT = "https_port";
  @SerializedName(SERIALIZED_NAME_HTTPS_PORT)
  private ModelInterface httpsPort = null;

  public static final String SERIALIZED_NAME_MINIMUM_TLS_VERSION = "minimum_tls_version";
  @SerializedName(SERIALIZED_NAME_MINIMUM_TLS_VERSION)
  private String minimumTlsVersion;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

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


  public ApplicationPutRequest httpPort(ModelInterface httpPort) {
    
    this.httpPort = httpPort;
    return this;
  }

   /**
   * Get httpPort
   * @return httpPort
  **/
  @javax.annotation.Nullable
  public ModelInterface getHttpPort() {
    return httpPort;
  }


  public void setHttpPort(ModelInterface httpPort) {
    this.httpPort = httpPort;
  }


  public ApplicationPutRequest httpsPort(ModelInterface httpsPort) {
    
    this.httpsPort = httpsPort;
    return this;
  }

   /**
   * Get httpsPort
   * @return httpsPort
  **/
  @javax.annotation.Nullable
  public ModelInterface getHttpsPort() {
    return httpsPort;
  }


  public void setHttpsPort(ModelInterface httpsPort) {
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


  public ApplicationPutRequest caching(Boolean caching) {
    
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
        Objects.equals(this.caching, applicationPutRequest.caching) &&
        Objects.equals(this.deviceDetection, applicationPutRequest.deviceDetection) &&
        Objects.equals(this.edgeFirewall, applicationPutRequest.edgeFirewall) &&
        Objects.equals(this.edgeFunctions, applicationPutRequest.edgeFunctions) &&
        Objects.equals(this.imageOptimization, applicationPutRequest.imageOptimization) &&
        Objects.equals(this.l2Caching, applicationPutRequest.l2Caching) &&
        Objects.equals(this.loadBalancer, applicationPutRequest.loadBalancer) &&
        Objects.equals(this.rawLogs, applicationPutRequest.rawLogs) &&
        Objects.equals(this.webApplicationFirewall, applicationPutRequest.webApplicationFirewall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, deliveryProtocol, httpPort, httpsPort, minimumTlsVersion, active, applicationAcceleration, caching, deviceDetection, edgeFirewall, edgeFunctions, imageOptimization, l2Caching, loadBalancer, rawLogs, webApplicationFirewall);
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
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationPutRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationPutRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationPutRequest is not found in the empty JSON string", ApplicationPutRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationPutRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationPutRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationPutRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
