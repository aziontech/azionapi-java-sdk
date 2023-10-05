/*
 * Edge Firewall API
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
import org.openapitools.client.model.Conditionals;
import org.openapitools.client.model.SSLVerificationStatusArguments;
import org.openapitools.client.model.SSLVerificationStatusOperators;
import org.openapitools.client.model.Variables;

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
 * SSLVerificationStatusCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-04T16:39:14.708396Z[GMT]")
public class SSLVerificationStatusCriteria {
  public static final String SERIALIZED_NAME_VARIABLE = "variable";
  @SerializedName(SERIALIZED_NAME_VARIABLE)
  private Variables variable;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private SSLVerificationStatusOperators operator;

  public static final String SERIALIZED_NAME_CONDITIONAL = "conditional";
  @SerializedName(SERIALIZED_NAME_CONDITIONAL)
  private Conditionals conditional;

  public static final String SERIALIZED_NAME_INPUT_VALUE = "input_value";
  @SerializedName(SERIALIZED_NAME_INPUT_VALUE)
  private SSLVerificationStatusArguments inputValue;

  public SSLVerificationStatusCriteria() {
  }

  public SSLVerificationStatusCriteria variable(Variables variable) {
    
    this.variable = variable;
    return this;
  }

   /**
   * Get variable
   * @return variable
  **/
  @javax.annotation.Nullable
  public Variables getVariable() {
    return variable;
  }


  public void setVariable(Variables variable) {
    this.variable = variable;
  }


  public SSLVerificationStatusCriteria operator(SSLVerificationStatusOperators operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nullable
  public SSLVerificationStatusOperators getOperator() {
    return operator;
  }


  public void setOperator(SSLVerificationStatusOperators operator) {
    this.operator = operator;
  }


  public SSLVerificationStatusCriteria conditional(Conditionals conditional) {
    
    this.conditional = conditional;
    return this;
  }

   /**
   * Get conditional
   * @return conditional
  **/
  @javax.annotation.Nullable
  public Conditionals getConditional() {
    return conditional;
  }


  public void setConditional(Conditionals conditional) {
    this.conditional = conditional;
  }


  public SSLVerificationStatusCriteria inputValue(SSLVerificationStatusArguments inputValue) {
    
    this.inputValue = inputValue;
    return this;
  }

   /**
   * Get inputValue
   * @return inputValue
  **/
  @javax.annotation.Nullable
  public SSLVerificationStatusArguments getInputValue() {
    return inputValue;
  }


  public void setInputValue(SSLVerificationStatusArguments inputValue) {
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
    SSLVerificationStatusCriteria ssLVerificationStatusCriteria = (SSLVerificationStatusCriteria) o;
    return Objects.equals(this.variable, ssLVerificationStatusCriteria.variable) &&
        Objects.equals(this.operator, ssLVerificationStatusCriteria.operator) &&
        Objects.equals(this.conditional, ssLVerificationStatusCriteria.conditional) &&
        Objects.equals(this.inputValue, ssLVerificationStatusCriteria.inputValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variable, operator, conditional, inputValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLVerificationStatusCriteria {\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    conditional: ").append(toIndentedString(conditional)).append("\n");
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
    openapiFields.add("variable");
    openapiFields.add("operator");
    openapiFields.add("conditional");
    openapiFields.add("input_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SSLVerificationStatusCriteria
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SSLVerificationStatusCriteria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SSLVerificationStatusCriteria is not found in the empty JSON string", SSLVerificationStatusCriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SSLVerificationStatusCriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SSLVerificationStatusCriteria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SSLVerificationStatusCriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SSLVerificationStatusCriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SSLVerificationStatusCriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SSLVerificationStatusCriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<SSLVerificationStatusCriteria>() {
           @Override
           public void write(JsonWriter out, SSLVerificationStatusCriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SSLVerificationStatusCriteria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SSLVerificationStatusCriteria given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SSLVerificationStatusCriteria
  * @throws IOException if the JSON string is invalid with respect to SSLVerificationStatusCriteria
  */
  public static SSLVerificationStatusCriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SSLVerificationStatusCriteria.class);
  }

 /**
  * Convert an instance of SSLVerificationStatusCriteria to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
