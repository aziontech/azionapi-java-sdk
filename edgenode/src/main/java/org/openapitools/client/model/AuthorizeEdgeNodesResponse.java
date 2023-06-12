/*
 * Edgenode API
 * Azion Orchestration
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
import org.openapitools.client.model.UnauthorizedEdgeNodeInfo;

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
 * AuthorizeEdgeNodesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-09T21:49:11.660398Z[GMT]")
public class AuthorizeEdgeNodesResponse {
  public static final String SERIALIZED_NAME_AUTHORIZED = "authorized";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED)
  private List<Long> authorized = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<UnauthorizedEdgeNodeInfo> errors = new ArrayList<>();

  public AuthorizeEdgeNodesResponse() {
  }

  public AuthorizeEdgeNodesResponse authorized(List<Long> authorized) {
    
    this.authorized = authorized;
    return this;
  }

  public AuthorizeEdgeNodesResponse addAuthorizedItem(Long authorizedItem) {
    if (this.authorized == null) {
      this.authorized = new ArrayList<>();
    }
    this.authorized.add(authorizedItem);
    return this;
  }

   /**
   * Get authorized
   * @return authorized
  **/
  @javax.annotation.Nonnull
  public List<Long> getAuthorized() {
    return authorized;
  }


  public void setAuthorized(List<Long> authorized) {
    this.authorized = authorized;
  }


  public AuthorizeEdgeNodesResponse errors(List<UnauthorizedEdgeNodeInfo> errors) {
    
    this.errors = errors;
    return this;
  }

  public AuthorizeEdgeNodesResponse addErrorsItem(UnauthorizedEdgeNodeInfo errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  public List<UnauthorizedEdgeNodeInfo> getErrors() {
    return errors;
  }


  public void setErrors(List<UnauthorizedEdgeNodeInfo> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizeEdgeNodesResponse authorizeEdgeNodesResponse = (AuthorizeEdgeNodesResponse) o;
    return Objects.equals(this.authorized, authorizeEdgeNodesResponse.authorized) &&
        Objects.equals(this.errors, authorizeEdgeNodesResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorized, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizeEdgeNodesResponse {\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("authorized");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authorized");
    openapiRequiredFields.add("errors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizeEdgeNodesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthorizeEdgeNodesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizeEdgeNodesResponse is not found in the empty JSON string", AuthorizeEdgeNodesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthorizeEdgeNodesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizeEdgeNodesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthorizeEdgeNodesResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("authorized") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("authorized").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorized` to be an array in the JSON string but got `%s`", jsonObj.get("authorized").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }

      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      // validate the required field `errors` (array)
      for (int i = 0; i < jsonArrayerrors.size(); i++) {
        UnauthorizedEdgeNodeInfo.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizeEdgeNodesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizeEdgeNodesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizeEdgeNodesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizeEdgeNodesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizeEdgeNodesResponse>() {
           @Override
           public void write(JsonWriter out, AuthorizeEdgeNodesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizeEdgeNodesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizeEdgeNodesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizeEdgeNodesResponse
  * @throws IOException if the JSON string is invalid with respect to AuthorizeEdgeNodesResponse
  */
  public static AuthorizeEdgeNodesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizeEdgeNodesResponse.class);
  }

 /**
  * Convert an instance of AuthorizeEdgeNodesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
