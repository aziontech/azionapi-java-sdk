/*
 * Digital Certificates API
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
 * CreateCSRRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-25T16:02:17.625800Z[GMT]")
public class CreateCSRRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMON_NAME = "common_name";
  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  private String commonName;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_ORGANIZATION_UNITY = "organization_unity";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_UNITY)
  private String organizationUnity;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_TYPE = "private_key_type";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_TYPE)
  private String privateKeyType;

  public static final String SERIALIZED_NAME_SANS = "sans";
  @SerializedName(SERIALIZED_NAME_SANS)
  private List<String> sans;

  public CreateCSRRequest() {
  }

  public CreateCSRRequest name(String name) {
    
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


  public CreateCSRRequest commonName(String commonName) {
    
    this.commonName = commonName;
    return this;
  }

   /**
   * Get commonName
   * @return commonName
  **/
  @javax.annotation.Nullable
  public String getCommonName() {
    return commonName;
  }


  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }


  public CreateCSRRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CreateCSRRequest state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public CreateCSRRequest locality(String locality) {
    
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @javax.annotation.Nullable
  public String getLocality() {
    return locality;
  }


  public void setLocality(String locality) {
    this.locality = locality;
  }


  public CreateCSRRequest organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public CreateCSRRequest organizationUnity(String organizationUnity) {
    
    this.organizationUnity = organizationUnity;
    return this;
  }

   /**
   * Get organizationUnity
   * @return organizationUnity
  **/
  @javax.annotation.Nullable
  public String getOrganizationUnity() {
    return organizationUnity;
  }


  public void setOrganizationUnity(String organizationUnity) {
    this.organizationUnity = organizationUnity;
  }


  public CreateCSRRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CreateCSRRequest privateKeyType(String privateKeyType) {
    
    this.privateKeyType = privateKeyType;
    return this;
  }

   /**
   * Get privateKeyType
   * @return privateKeyType
  **/
  @javax.annotation.Nullable
  public String getPrivateKeyType() {
    return privateKeyType;
  }


  public void setPrivateKeyType(String privateKeyType) {
    this.privateKeyType = privateKeyType;
  }


  public CreateCSRRequest sans(List<String> sans) {
    
    this.sans = sans;
    return this;
  }

  public CreateCSRRequest addSansItem(String sansItem) {
    if (this.sans == null) {
      this.sans = new ArrayList<>();
    }
    this.sans.add(sansItem);
    return this;
  }

   /**
   * Get sans
   * @return sans
  **/
  @javax.annotation.Nullable
  public List<String> getSans() {
    return sans;
  }


  public void setSans(List<String> sans) {
    this.sans = sans;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCSRRequest createCSRRequest = (CreateCSRRequest) o;
    return Objects.equals(this.name, createCSRRequest.name) &&
        Objects.equals(this.commonName, createCSRRequest.commonName) &&
        Objects.equals(this.country, createCSRRequest.country) &&
        Objects.equals(this.state, createCSRRequest.state) &&
        Objects.equals(this.locality, createCSRRequest.locality) &&
        Objects.equals(this.organization, createCSRRequest.organization) &&
        Objects.equals(this.organizationUnity, createCSRRequest.organizationUnity) &&
        Objects.equals(this.email, createCSRRequest.email) &&
        Objects.equals(this.privateKeyType, createCSRRequest.privateKeyType) &&
        Objects.equals(this.sans, createCSRRequest.sans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, commonName, country, state, locality, organization, organizationUnity, email, privateKeyType, sans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCSRRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationUnity: ").append(toIndentedString(organizationUnity)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    privateKeyType: ").append(toIndentedString(privateKeyType)).append("\n");
    sb.append("    sans: ").append(toIndentedString(sans)).append("\n");
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
    openapiFields.add("common_name");
    openapiFields.add("country");
    openapiFields.add("state");
    openapiFields.add("locality");
    openapiFields.add("organization");
    openapiFields.add("organization_unity");
    openapiFields.add("email");
    openapiFields.add("private_key_type");
    openapiFields.add("sans");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCSRRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCSRRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCSRRequest is not found in the empty JSON string", CreateCSRRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCSRRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCSRRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("common_name") != null && !jsonObj.get("common_name").isJsonNull()) && !jsonObj.get("common_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `common_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("common_name").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonNull()) && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if ((jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) && !jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      if ((jsonObj.get("organization_unity") != null && !jsonObj.get("organization_unity").isJsonNull()) && !jsonObj.get("organization_unity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_unity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_unity").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("private_key_type") != null && !jsonObj.get("private_key_type").isJsonNull()) && !jsonObj.get("private_key_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `private_key_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("private_key_type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sans") != null && !jsonObj.get("sans").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sans` to be an array in the JSON string but got `%s`", jsonObj.get("sans").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCSRRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCSRRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCSRRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCSRRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCSRRequest>() {
           @Override
           public void write(JsonWriter out, CreateCSRRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCSRRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCSRRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCSRRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCSRRequest
  */
  public static CreateCSRRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCSRRequest.class);
  }

 /**
  * Convert an instance of CreateCSRRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

