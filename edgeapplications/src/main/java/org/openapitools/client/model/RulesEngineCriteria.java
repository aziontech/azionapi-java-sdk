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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RulesEngineCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T17:22:50.678011Z[GMT]")
public class RulesEngineCriteria {
  public static final String SERIALIZED_NAME_CONDITIONAL = "conditional";
  @SerializedName(SERIALIZED_NAME_CONDITIONAL)
  private String conditional;

  public static final String SERIALIZED_NAME_VARIABLE = "variable";
  @SerializedName(SERIALIZED_NAME_VARIABLE)
  private String variable;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_INPUT_VALUE = "input_value";
  @SerializedName(SERIALIZED_NAME_INPUT_VALUE)
  private String inputValue;

  public RulesEngineCriteria() {
  }

  public RulesEngineCriteria conditional(String conditional) {
    
    this.conditional = conditional;
    return this;
  }

   /**
   * Get conditional
   * @return conditional
  **/
  @javax.annotation.Nonnull
  public String getConditional() {
    return conditional;
  }


  public void setConditional(String conditional) {
    this.conditional = conditional;
  }


  public RulesEngineCriteria variable(String variable) {
    
    this.variable = variable;
    return this;
  }

   /**
   * Get variable
   * @return variable
  **/
  @javax.annotation.Nonnull
  public String getVariable() {
    return variable;
  }


  public void setVariable(String variable) {
    this.variable = variable;
  }


  public RulesEngineCriteria operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nonnull
  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public RulesEngineCriteria inputValue(String inputValue) {
    
    this.inputValue = inputValue;
    return this;
  }

   /**
   * Get inputValue
   * @return inputValue
  **/
  @javax.annotation.Nullable
  public String getInputValue() {
    return inputValue;
  }


  public void setInputValue(String inputValue) {
    this.inputValue = inputValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesEngineCriteria rulesEngineCriteria = (RulesEngineCriteria) o;
    return Objects.equals(this.conditional, rulesEngineCriteria.conditional) &&
        Objects.equals(this.variable, rulesEngineCriteria.variable) &&
        Objects.equals(this.operator, rulesEngineCriteria.operator) &&
        Objects.equals(this.inputValue, rulesEngineCriteria.inputValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditional, variable, operator, inputValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesEngineCriteria {\n");
    sb.append("    conditional: ").append(toIndentedString(conditional)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    inputValue: ").append(toIndentedString(inputValue)).append("\n");
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
    openapiFields.add("conditional");
    openapiFields.add("variable");
    openapiFields.add("operator");
    openapiFields.add("input_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("conditional");
    openapiRequiredFields.add("variable");
    openapiRequiredFields.add("operator");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RulesEngineCriteria
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RulesEngineCriteria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RulesEngineCriteria is not found in the empty JSON string", RulesEngineCriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RulesEngineCriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RulesEngineCriteria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RulesEngineCriteria.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("conditional").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conditional` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conditional").toString()));
      }
      if (!jsonObj.get("variable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable").toString()));
      }
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      if ((jsonObj.get("input_value") != null && !jsonObj.get("input_value").isJsonNull()) && !jsonObj.get("input_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RulesEngineCriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RulesEngineCriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RulesEngineCriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RulesEngineCriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<RulesEngineCriteria>() {
           @Override
           public void write(JsonWriter out, RulesEngineCriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RulesEngineCriteria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RulesEngineCriteria given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RulesEngineCriteria
  * @throws IOException if the JSON string is invalid with respect to RulesEngineCriteria
  */
  public static RulesEngineCriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RulesEngineCriteria.class);
  }

 /**
  * Convert an instance of RulesEngineCriteria to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

