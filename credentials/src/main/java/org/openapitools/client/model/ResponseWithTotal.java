/*
 * Credentials API
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
import org.openapitools.client.model.Response;

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
 * ResponseWithTotal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T21:01:26.428233Z[GMT]")
public class ResponseWithTotal {
  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private List<Response> credentials = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public ResponseWithTotal() {
  }

  public ResponseWithTotal credentials(List<Response> credentials) {
    
    this.credentials = credentials;
    return this;
  }

  public ResponseWithTotal addCredentialsItem(Response credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nonnull
  public List<Response> getCredentials() {
    return credentials;
  }


  public void setCredentials(List<Response> credentials) {
    this.credentials = credentials;
  }


  public ResponseWithTotal total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nonnull
  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWithTotal responseWithTotal = (ResponseWithTotal) o;
    return Objects.equals(this.credentials, responseWithTotal.credentials) &&
        Objects.equals(this.total, responseWithTotal.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWithTotal {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("credentials");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("credentials");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseWithTotal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResponseWithTotal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseWithTotal is not found in the empty JSON string", ResponseWithTotal.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseWithTotal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseWithTotal` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseWithTotal.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("credentials").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `credentials` to be an array in the JSON string but got `%s`", jsonObj.get("credentials").toString()));
      }

      JsonArray jsonArraycredentials = jsonObj.getAsJsonArray("credentials");
      // validate the required field `credentials` (array)
      for (int i = 0; i < jsonArraycredentials.size(); i++) {
        Response.validateJsonObject(jsonArraycredentials.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseWithTotal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseWithTotal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseWithTotal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseWithTotal.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseWithTotal>() {
           @Override
           public void write(JsonWriter out, ResponseWithTotal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseWithTotal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseWithTotal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseWithTotal
  * @throws IOException if the JSON string is invalid with respect to ResponseWithTotal
  */
  public static ResponseWithTotal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseWithTotal.class);
  }

 /**
  * Convert an instance of ResponseWithTotal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

