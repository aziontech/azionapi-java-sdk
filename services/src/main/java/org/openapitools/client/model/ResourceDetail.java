/*
 * Services API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
 * ResourceDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T21:02:01.775831Z[GMT]")
public class ResourceDetail {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TRIGGER = "trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER)
  private String trigger;

  public ResourceDetail() {
  }

  public ResourceDetail content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ResourceDetail contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nonnull
  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public ResourceDetail id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ResourceDetail name(String name) {
    
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


  public ResourceDetail trigger(String trigger) {
    
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @javax.annotation.Nonnull
  public String getTrigger() {
    return trigger;
  }


  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetail resourceDetail = (ResourceDetail) o;
    return Objects.equals(this.content, resourceDetail.content) &&
        Objects.equals(this.contentType, resourceDetail.contentType) &&
        Objects.equals(this.id, resourceDetail.id) &&
        Objects.equals(this.name, resourceDetail.name) &&
        Objects.equals(this.trigger, resourceDetail.trigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contentType, id, name, trigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetail {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("content_type");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("trigger");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("content_type");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("trigger");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResourceDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResourceDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetail is not found in the empty JSON string", ResourceDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResourceDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (!jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("trigger").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trigger` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trigger").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetail>() {
           @Override
           public void write(JsonWriter out, ResourceDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResourceDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceDetail
  * @throws IOException if the JSON string is invalid with respect to ResourceDetail
  */
  public static ResourceDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetail.class);
  }

 /**
  * Convert an instance of ResourceDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

