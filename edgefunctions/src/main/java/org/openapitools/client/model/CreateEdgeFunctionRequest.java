/*
 * Edge Function API
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
 * CreateEdgeFunctionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T21:01:41.321805Z[GMT]")
public class CreateEdgeFunctionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_JSON_ARGS = "json_args";
  @SerializedName(SERIALIZED_NAME_JSON_ARGS)
  private Object jsonArgs = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_IS_PROPRIETARY_CODE = "is_proprietary_code";
  @SerializedName(SERIALIZED_NAME_IS_PROPRIETARY_CODE)
  private Boolean isProprietaryCode;

  public CreateEdgeFunctionRequest() {
  }

  public CreateEdgeFunctionRequest name(String name) {
    
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


  public CreateEdgeFunctionRequest language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public CreateEdgeFunctionRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CreateEdgeFunctionRequest jsonArgs(Object jsonArgs) {
    
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


  public CreateEdgeFunctionRequest active(Boolean active) {
    
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


  public CreateEdgeFunctionRequest isProprietaryCode(Boolean isProprietaryCode) {
    
    this.isProprietaryCode = isProprietaryCode;
    return this;
  }

   /**
   * Get isProprietaryCode
   * @return isProprietaryCode
  **/
  @javax.annotation.Nullable
  public Boolean getIsProprietaryCode() {
    return isProprietaryCode;
  }


  public void setIsProprietaryCode(Boolean isProprietaryCode) {
    this.isProprietaryCode = isProprietaryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEdgeFunctionRequest createEdgeFunctionRequest = (CreateEdgeFunctionRequest) o;
    return Objects.equals(this.name, createEdgeFunctionRequest.name) &&
        Objects.equals(this.language, createEdgeFunctionRequest.language) &&
        Objects.equals(this.code, createEdgeFunctionRequest.code) &&
        Objects.equals(this.jsonArgs, createEdgeFunctionRequest.jsonArgs) &&
        Objects.equals(this.active, createEdgeFunctionRequest.active) &&
        Objects.equals(this.isProprietaryCode, createEdgeFunctionRequest.isProprietaryCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, language, code, jsonArgs, active, isProprietaryCode);
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
    sb.append("class CreateEdgeFunctionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    jsonArgs: ").append(toIndentedString(jsonArgs)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    isProprietaryCode: ").append(toIndentedString(isProprietaryCode)).append("\n");
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
    openapiFields.add("language");
    openapiFields.add("code");
    openapiFields.add("json_args");
    openapiFields.add("active");
    openapiFields.add("is_proprietary_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateEdgeFunctionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateEdgeFunctionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEdgeFunctionRequest is not found in the empty JSON string", CreateEdgeFunctionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateEdgeFunctionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEdgeFunctionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEdgeFunctionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEdgeFunctionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEdgeFunctionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEdgeFunctionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEdgeFunctionRequest>() {
           @Override
           public void write(JsonWriter out, CreateEdgeFunctionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEdgeFunctionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateEdgeFunctionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateEdgeFunctionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateEdgeFunctionRequest
  */
  public static CreateEdgeFunctionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEdgeFunctionRequest.class);
  }

 /**
  * Convert an instance of CreateEdgeFunctionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

