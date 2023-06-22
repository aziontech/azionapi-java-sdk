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
 * EdgeFirewall
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T21:01:37.943873Z[GMT]")
public class EdgeFirewall {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_LAST_EDITOR = "last_editor";
  @SerializedName(SERIALIZED_NAME_LAST_EDITOR)
  private String lastEditor;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_EDGE_FUNCTIONS_ENABLED = "edge_functions_enabled";
  @SerializedName(SERIALIZED_NAME_EDGE_FUNCTIONS_ENABLED)
  private Boolean edgeFunctionsEnabled;

  public static final String SERIALIZED_NAME_NETWORK_PROTECTION_ENABLED = "network_protection_enabled";
  @SerializedName(SERIALIZED_NAME_NETWORK_PROTECTION_ENABLED)
  private Boolean networkProtectionEnabled;

  public static final String SERIALIZED_NAME_WAF_ENABLED = "waf_enabled";
  @SerializedName(SERIALIZED_NAME_WAF_ENABLED)
  private Boolean wafEnabled;

  public static final String SERIALIZED_NAME_DEBUG_RULES = "debug_rules";
  @SerializedName(SERIALIZED_NAME_DEBUG_RULES)
  private Boolean debugRules;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<Integer> domains;

  public EdgeFirewall() {
  }

  public EdgeFirewall id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public EdgeFirewall name(String name) {
    
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


  public EdgeFirewall isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public EdgeFirewall lastEditor(String lastEditor) {
    
    this.lastEditor = lastEditor;
    return this;
  }

   /**
   * Get lastEditor
   * @return lastEditor
  **/
  @javax.annotation.Nullable
  public String getLastEditor() {
    return lastEditor;
  }


  public void setLastEditor(String lastEditor) {
    this.lastEditor = lastEditor;
  }


  public EdgeFirewall lastModified(String lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @javax.annotation.Nullable
  public String getLastModified() {
    return lastModified;
  }


  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  public EdgeFirewall edgeFunctionsEnabled(Boolean edgeFunctionsEnabled) {
    
    this.edgeFunctionsEnabled = edgeFunctionsEnabled;
    return this;
  }

   /**
   * Get edgeFunctionsEnabled
   * @return edgeFunctionsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getEdgeFunctionsEnabled() {
    return edgeFunctionsEnabled;
  }


  public void setEdgeFunctionsEnabled(Boolean edgeFunctionsEnabled) {
    this.edgeFunctionsEnabled = edgeFunctionsEnabled;
  }


  public EdgeFirewall networkProtectionEnabled(Boolean networkProtectionEnabled) {
    
    this.networkProtectionEnabled = networkProtectionEnabled;
    return this;
  }

   /**
   * Get networkProtectionEnabled
   * @return networkProtectionEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getNetworkProtectionEnabled() {
    return networkProtectionEnabled;
  }


  public void setNetworkProtectionEnabled(Boolean networkProtectionEnabled) {
    this.networkProtectionEnabled = networkProtectionEnabled;
  }


  public EdgeFirewall wafEnabled(Boolean wafEnabled) {
    
    this.wafEnabled = wafEnabled;
    return this;
  }

   /**
   * Get wafEnabled
   * @return wafEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getWafEnabled() {
    return wafEnabled;
  }


  public void setWafEnabled(Boolean wafEnabled) {
    this.wafEnabled = wafEnabled;
  }


  public EdgeFirewall debugRules(Boolean debugRules) {
    
    this.debugRules = debugRules;
    return this;
  }

   /**
   * Get debugRules
   * @return debugRules
  **/
  @javax.annotation.Nullable
  public Boolean getDebugRules() {
    return debugRules;
  }


  public void setDebugRules(Boolean debugRules) {
    this.debugRules = debugRules;
  }


  public EdgeFirewall domains(List<Integer> domains) {
    
    this.domains = domains;
    return this;
  }

  public EdgeFirewall addDomainsItem(Integer domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @javax.annotation.Nullable
  public List<Integer> getDomains() {
    return domains;
  }


  public void setDomains(List<Integer> domains) {
    this.domains = domains;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeFirewall edgeFirewall = (EdgeFirewall) o;
    return Objects.equals(this.id, edgeFirewall.id) &&
        Objects.equals(this.name, edgeFirewall.name) &&
        Objects.equals(this.isActive, edgeFirewall.isActive) &&
        Objects.equals(this.lastEditor, edgeFirewall.lastEditor) &&
        Objects.equals(this.lastModified, edgeFirewall.lastModified) &&
        Objects.equals(this.edgeFunctionsEnabled, edgeFirewall.edgeFunctionsEnabled) &&
        Objects.equals(this.networkProtectionEnabled, edgeFirewall.networkProtectionEnabled) &&
        Objects.equals(this.wafEnabled, edgeFirewall.wafEnabled) &&
        Objects.equals(this.debugRules, edgeFirewall.debugRules) &&
        Objects.equals(this.domains, edgeFirewall.domains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isActive, lastEditor, lastModified, edgeFunctionsEnabled, networkProtectionEnabled, wafEnabled, debugRules, domains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeFirewall {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    lastEditor: ").append(toIndentedString(lastEditor)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    edgeFunctionsEnabled: ").append(toIndentedString(edgeFunctionsEnabled)).append("\n");
    sb.append("    networkProtectionEnabled: ").append(toIndentedString(networkProtectionEnabled)).append("\n");
    sb.append("    wafEnabled: ").append(toIndentedString(wafEnabled)).append("\n");
    sb.append("    debugRules: ").append(toIndentedString(debugRules)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
    openapiFields.add("is_active");
    openapiFields.add("last_editor");
    openapiFields.add("last_modified");
    openapiFields.add("edge_functions_enabled");
    openapiFields.add("network_protection_enabled");
    openapiFields.add("waf_enabled");
    openapiFields.add("debug_rules");
    openapiFields.add("domains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EdgeFirewall
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EdgeFirewall.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EdgeFirewall is not found in the empty JSON string", EdgeFirewall.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EdgeFirewall.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EdgeFirewall` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("last_editor") != null && !jsonObj.get("last_editor").isJsonNull()) && !jsonObj.get("last_editor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_editor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_editor").toString()));
      }
      if ((jsonObj.get("last_modified") != null && !jsonObj.get("last_modified").isJsonNull()) && !jsonObj.get("last_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("domains") != null && !jsonObj.get("domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domains` to be an array in the JSON string but got `%s`", jsonObj.get("domains").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EdgeFirewall.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EdgeFirewall' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EdgeFirewall> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EdgeFirewall.class));

       return (TypeAdapter<T>) new TypeAdapter<EdgeFirewall>() {
           @Override
           public void write(JsonWriter out, EdgeFirewall value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EdgeFirewall read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EdgeFirewall given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EdgeFirewall
  * @throws IOException if the JSON string is invalid with respect to EdgeFirewall
  */
  public static EdgeFirewall fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EdgeFirewall.class);
  }

 /**
  * Convert an instance of EdgeFirewall to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
