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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.RulesEngineBehavior;
import org.openapitools.client.model.RulesEngineCriteria;

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
 * CreateRulesEngineRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-29T19:24:41.875462Z[GMT]")
public class CreateRulesEngineRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CRITERIA = "criteria";
  @SerializedName(SERIALIZED_NAME_CRITERIA)
  private List<List<RulesEngineCriteria>> criteria = new ArrayList<>();

  public static final String SERIALIZED_NAME_BEHAVIORS = "behaviors";
  @SerializedName(SERIALIZED_NAME_BEHAVIORS)
  private List<RulesEngineBehavior> behaviors = new ArrayList<>();

  public CreateRulesEngineRequest() {
  }

  public CreateRulesEngineRequest name(String name) {
    
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


  public CreateRulesEngineRequest criteria(List<List<RulesEngineCriteria>> criteria) {
    
    this.criteria = criteria;
    return this;
  }

  public CreateRulesEngineRequest addCriteriaItem(List<RulesEngineCriteria> criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @javax.annotation.Nonnull
  public List<List<RulesEngineCriteria>> getCriteria() {
    return criteria;
  }


  public void setCriteria(List<List<RulesEngineCriteria>> criteria) {
    this.criteria = criteria;
  }


  public CreateRulesEngineRequest behaviors(List<RulesEngineBehavior> behaviors) {
    
    this.behaviors = behaviors;
    return this;
  }

  public CreateRulesEngineRequest addBehaviorsItem(RulesEngineBehavior behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * Get behaviors
   * @return behaviors
  **/
  @javax.annotation.Nonnull
  public List<RulesEngineBehavior> getBehaviors() {
    return behaviors;
  }


  public void setBehaviors(List<RulesEngineBehavior> behaviors) {
    this.behaviors = behaviors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRulesEngineRequest createRulesEngineRequest = (CreateRulesEngineRequest) o;
    return Objects.equals(this.name, createRulesEngineRequest.name) &&
        Objects.equals(this.criteria, createRulesEngineRequest.criteria) &&
        Objects.equals(this.behaviors, createRulesEngineRequest.behaviors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, criteria, behaviors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRulesEngineRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
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
    openapiFields.add("criteria");
    openapiFields.add("behaviors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("criteria");
    openapiRequiredFields.add("behaviors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateRulesEngineRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateRulesEngineRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateRulesEngineRequest is not found in the empty JSON string", CreateRulesEngineRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateRulesEngineRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateRulesEngineRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateRulesEngineRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("criteria") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("criteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `criteria` to be an array in the JSON string but got `%s`", jsonObj.get("criteria").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("behaviors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `behaviors` to be an array in the JSON string but got `%s`", jsonObj.get("behaviors").toString()));
      }

      JsonArray jsonArraybehaviors = jsonObj.getAsJsonArray("behaviors");
      // validate the required field `behaviors` (array)
      for (int i = 0; i < jsonArraybehaviors.size(); i++) {
        RulesEngineBehavior.validateJsonObject(jsonArraybehaviors.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRulesEngineRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRulesEngineRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRulesEngineRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRulesEngineRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRulesEngineRequest>() {
           @Override
           public void write(JsonWriter out, CreateRulesEngineRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateRulesEngineRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateRulesEngineRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateRulesEngineRequest
  * @throws IOException if the JSON string is invalid with respect to CreateRulesEngineRequest
  */
  public static CreateRulesEngineRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRulesEngineRequest.class);
  }

 /**
  * Convert an instance of CreateRulesEngineRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

