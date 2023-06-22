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
 * ApplicationPutInstanceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T21:01:33.435510Z[GMT]")
public class ApplicationPutInstanceRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EDGE_FUNCTION_ID = "edge_function_id";
  @SerializedName(SERIALIZED_NAME_EDGE_FUNCTION_ID)
  private Long edgeFunctionId;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Object args = null;

  public ApplicationPutInstanceRequest() {
  }

  public ApplicationPutInstanceRequest name(String name) {
    
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


  public ApplicationPutInstanceRequest edgeFunctionId(Long edgeFunctionId) {
    
    this.edgeFunctionId = edgeFunctionId;
    return this;
  }

   /**
   * Get edgeFunctionId
   * @return edgeFunctionId
  **/
  @javax.annotation.Nonnull
  public Long getEdgeFunctionId() {
    return edgeFunctionId;
  }


  public void setEdgeFunctionId(Long edgeFunctionId) {
    this.edgeFunctionId = edgeFunctionId;
  }


  public ApplicationPutInstanceRequest args(Object args) {
    
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  public Object getArgs() {
    return args;
  }


  public void setArgs(Object args) {
    this.args = args;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationPutInstanceRequest applicationPutInstanceRequest = (ApplicationPutInstanceRequest) o;
    return Objects.equals(this.name, applicationPutInstanceRequest.name) &&
        Objects.equals(this.edgeFunctionId, applicationPutInstanceRequest.edgeFunctionId) &&
        Objects.equals(this.args, applicationPutInstanceRequest.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, edgeFunctionId, args);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationPutInstanceRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    edgeFunctionId: ").append(toIndentedString(edgeFunctionId)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
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
    openapiFields.add("edge_function_id");
    openapiFields.add("args");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("edge_function_id");
    openapiRequiredFields.add("args");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationPutInstanceRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationPutInstanceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationPutInstanceRequest is not found in the empty JSON string", ApplicationPutInstanceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationPutInstanceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationPutInstanceRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationPutInstanceRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationPutInstanceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationPutInstanceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationPutInstanceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationPutInstanceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationPutInstanceRequest>() {
           @Override
           public void write(JsonWriter out, ApplicationPutInstanceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationPutInstanceRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationPutInstanceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationPutInstanceRequest
  * @throws IOException if the JSON string is invalid with respect to ApplicationPutInstanceRequest
  */
  public static ApplicationPutInstanceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationPutInstanceRequest.class);
  }

 /**
  * Convert an instance of ApplicationPutInstanceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

