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
 * SetWAFRuleSetAndWafModeBehaviorArgument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-31T14:32:19.765188Z[GMT]")
public class SetWAFRuleSetAndWafModeBehaviorArgument {
  public static final String SERIALIZED_NAME_SET_WAF_RULESET_AND_WAF_MODE = "set_waf_ruleset_and_waf_mode";
  @SerializedName(SERIALIZED_NAME_SET_WAF_RULESET_AND_WAF_MODE)
  private Integer setWafRulesetAndWafMode;

  /**
   * Gets or Sets wafMode
   */
  @JsonAdapter(WafModeEnum.Adapter.class)
  public enum WafModeEnum {
    LEARNING("learning"),
    
    BLOCKING("blocking");

    private String value;

    WafModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WafModeEnum fromValue(String value) {
      for (WafModeEnum b : WafModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WafModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WafModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WafModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WafModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WAF_MODE = "waf_mode";
  @SerializedName(SERIALIZED_NAME_WAF_MODE)
  private WafModeEnum wafMode;

  public SetWAFRuleSetAndWafModeBehaviorArgument() {
  }

  public SetWAFRuleSetAndWafModeBehaviorArgument setWafRulesetAndWafMode(Integer setWafRulesetAndWafMode) {
    
    this.setWafRulesetAndWafMode = setWafRulesetAndWafMode;
    return this;
  }

   /**
   * Get setWafRulesetAndWafMode
   * minimum: 1
   * @return setWafRulesetAndWafMode
  **/
  @javax.annotation.Nonnull
  public Integer getSetWafRulesetAndWafMode() {
    return setWafRulesetAndWafMode;
  }


  public void setSetWafRulesetAndWafMode(Integer setWafRulesetAndWafMode) {
    this.setWafRulesetAndWafMode = setWafRulesetAndWafMode;
  }


  public SetWAFRuleSetAndWafModeBehaviorArgument wafMode(WafModeEnum wafMode) {
    
    this.wafMode = wafMode;
    return this;
  }

   /**
   * Get wafMode
   * @return wafMode
  **/
  @javax.annotation.Nonnull
  public WafModeEnum getWafMode() {
    return wafMode;
  }


  public void setWafMode(WafModeEnum wafMode) {
    this.wafMode = wafMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetWAFRuleSetAndWafModeBehaviorArgument setWAFRuleSetAndWafModeBehaviorArgument = (SetWAFRuleSetAndWafModeBehaviorArgument) o;
    return Objects.equals(this.setWafRulesetAndWafMode, setWAFRuleSetAndWafModeBehaviorArgument.setWafRulesetAndWafMode) &&
        Objects.equals(this.wafMode, setWAFRuleSetAndWafModeBehaviorArgument.wafMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setWafRulesetAndWafMode, wafMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetWAFRuleSetAndWafModeBehaviorArgument {\n");
    sb.append("    setWafRulesetAndWafMode: ").append(toIndentedString(setWafRulesetAndWafMode)).append("\n");
    sb.append("    wafMode: ").append(toIndentedString(wafMode)).append("\n");
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
    openapiFields.add("set_waf_ruleset_and_waf_mode");
    openapiFields.add("waf_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("set_waf_ruleset_and_waf_mode");
    openapiRequiredFields.add("waf_mode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SetWAFRuleSetAndWafModeBehaviorArgument
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetWAFRuleSetAndWafModeBehaviorArgument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetWAFRuleSetAndWafModeBehaviorArgument is not found in the empty JSON string", SetWAFRuleSetAndWafModeBehaviorArgument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetWAFRuleSetAndWafModeBehaviorArgument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetWAFRuleSetAndWafModeBehaviorArgument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetWAFRuleSetAndWafModeBehaviorArgument.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("waf_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waf_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waf_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetWAFRuleSetAndWafModeBehaviorArgument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetWAFRuleSetAndWafModeBehaviorArgument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetWAFRuleSetAndWafModeBehaviorArgument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetWAFRuleSetAndWafModeBehaviorArgument.class));

       return (TypeAdapter<T>) new TypeAdapter<SetWAFRuleSetAndWafModeBehaviorArgument>() {
           @Override
           public void write(JsonWriter out, SetWAFRuleSetAndWafModeBehaviorArgument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetWAFRuleSetAndWafModeBehaviorArgument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetWAFRuleSetAndWafModeBehaviorArgument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetWAFRuleSetAndWafModeBehaviorArgument
  * @throws IOException if the JSON string is invalid with respect to SetWAFRuleSetAndWafModeBehaviorArgument
  */
  public static SetWAFRuleSetAndWafModeBehaviorArgument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetWAFRuleSetAndWafModeBehaviorArgument.class);
  }

 /**
  * Convert an instance of SetWAFRuleSetAndWafModeBehaviorArgument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

