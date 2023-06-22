/*
 * Edge Functions Instances API
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
 * EdgeFunctionsInstance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T21:01:44.719144Z[GMT]")
public class EdgeFunctionsInstance {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_JSON_ARGS = "json_args";
  @SerializedName(SERIALIZED_NAME_JSON_ARGS)
  private Object jsonArgs;

  public static final String SERIALIZED_NAME_EDGE_FUNCTION = "edge_function";
  @SerializedName(SERIALIZED_NAME_EDGE_FUNCTION)
  private Integer edgeFunction;

  public EdgeFunctionsInstance() {
  }

  public EdgeFunctionsInstance id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public EdgeFunctionsInstance name(String name) {
    
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


  public EdgeFunctionsInstance jsonArgs(Object jsonArgs) {
    
    this.jsonArgs = jsonArgs;
    return this;
  }

   /**
   * Get jsonArgs
   * @return jsonArgs
  **/
  @javax.annotation.Nullable
  public Object getJsonArgs() {
    return jsonArgs;
  }


  public void setJsonArgs(Object jsonArgs) {
    this.jsonArgs = jsonArgs;
  }


  public EdgeFunctionsInstance edgeFunction(Integer edgeFunction) {
    
    this.edgeFunction = edgeFunction;
    return this;
  }

   /**
   * Get edgeFunction
   * @return edgeFunction
  **/
  @javax.annotation.Nullable
  public Integer getEdgeFunction() {
    return edgeFunction;
  }


  public void setEdgeFunction(Integer edgeFunction) {
    this.edgeFunction = edgeFunction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeFunctionsInstance edgeFunctionsInstance = (EdgeFunctionsInstance) o;
    return Objects.equals(this.id, edgeFunctionsInstance.id) &&
        Objects.equals(this.name, edgeFunctionsInstance.name) &&
        Objects.equals(this.jsonArgs, edgeFunctionsInstance.jsonArgs) &&
        Objects.equals(this.edgeFunction, edgeFunctionsInstance.edgeFunction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, jsonArgs, edgeFunction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeFunctionsInstance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jsonArgs: ").append(toIndentedString(jsonArgs)).append("\n");
    sb.append("    edgeFunction: ").append(toIndentedString(edgeFunction)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("json_args");
    openapiFields.add("edge_function");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EdgeFunctionsInstance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EdgeFunctionsInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EdgeFunctionsInstance is not found in the empty JSON string", EdgeFunctionsInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EdgeFunctionsInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EdgeFunctionsInstance` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EdgeFunctionsInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EdgeFunctionsInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EdgeFunctionsInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EdgeFunctionsInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<EdgeFunctionsInstance>() {
           @Override
           public void write(JsonWriter out, EdgeFunctionsInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EdgeFunctionsInstance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EdgeFunctionsInstance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EdgeFunctionsInstance
  * @throws IOException if the JSON string is invalid with respect to EdgeFunctionsInstance
  */
  public static EdgeFunctionsInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EdgeFunctionsInstance.class);
  }

 /**
  * Convert an instance of EdgeFunctionsInstance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

