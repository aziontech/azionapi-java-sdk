/*
 * Network Lists API
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
 * NetworkListUuidResponseEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-14T14:52:39.395602Z[GMT]")
public class NetworkListUuidResponseEntry {
  public static final String SERIALIZED_NAME_LAST_EDITOR = "last_editor";
  @SerializedName(SERIALIZED_NAME_LAST_EDITOR)
  private String lastEditor;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_LIST_TYPE = "list_type";
  @SerializedName(SERIALIZED_NAME_LIST_TYPE)
  private String listType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ITEMS_VALUES = "items_values";
  @SerializedName(SERIALIZED_NAME_ITEMS_VALUES)
  private List<String> itemsValues;

  public NetworkListUuidResponseEntry() {
  }

  public NetworkListUuidResponseEntry lastEditor(String lastEditor) {
    
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


  public NetworkListUuidResponseEntry lastModified(String lastModified) {
    
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


  public NetworkListUuidResponseEntry listType(String listType) {
    
    this.listType = listType;
    return this;
  }

   /**
   * Get listType
   * @return listType
  **/
  @javax.annotation.Nullable
  public String getListType() {
    return listType;
  }


  public void setListType(String listType) {
    this.listType = listType;
  }


  public NetworkListUuidResponseEntry name(String name) {
    
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


  public NetworkListUuidResponseEntry itemsValues(List<String> itemsValues) {
    
    this.itemsValues = itemsValues;
    return this;
  }

  public NetworkListUuidResponseEntry addItemsValuesItem(String itemsValuesItem) {
    if (this.itemsValues == null) {
      this.itemsValues = new ArrayList<>();
    }
    this.itemsValues.add(itemsValuesItem);
    return this;
  }

   /**
   * Get itemsValues
   * @return itemsValues
  **/
  @javax.annotation.Nullable
  public List<String> getItemsValues() {
    return itemsValues;
  }


  public void setItemsValues(List<String> itemsValues) {
    this.itemsValues = itemsValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkListUuidResponseEntry networkListUuidResponseEntry = (NetworkListUuidResponseEntry) o;
    return Objects.equals(this.lastEditor, networkListUuidResponseEntry.lastEditor) &&
        Objects.equals(this.lastModified, networkListUuidResponseEntry.lastModified) &&
        Objects.equals(this.listType, networkListUuidResponseEntry.listType) &&
        Objects.equals(this.name, networkListUuidResponseEntry.name) &&
        Objects.equals(this.itemsValues, networkListUuidResponseEntry.itemsValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastEditor, lastModified, listType, name, itemsValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkListUuidResponseEntry {\n");
    sb.append("    lastEditor: ").append(toIndentedString(lastEditor)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    itemsValues: ").append(toIndentedString(itemsValues)).append("\n");
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
    openapiFields.add("last_editor");
    openapiFields.add("last_modified");
    openapiFields.add("list_type");
    openapiFields.add("name");
    openapiFields.add("items_values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NetworkListUuidResponseEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NetworkListUuidResponseEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkListUuidResponseEntry is not found in the empty JSON string", NetworkListUuidResponseEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NetworkListUuidResponseEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkListUuidResponseEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("last_editor") != null && !jsonObj.get("last_editor").isJsonNull()) && !jsonObj.get("last_editor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_editor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_editor").toString()));
      }
      if ((jsonObj.get("last_modified") != null && !jsonObj.get("last_modified").isJsonNull()) && !jsonObj.get("last_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified").toString()));
      }
      if ((jsonObj.get("list_type") != null && !jsonObj.get("list_type").isJsonNull()) && !jsonObj.get("list_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("items_values") != null && !jsonObj.get("items_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items_values` to be an array in the JSON string but got `%s`", jsonObj.get("items_values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkListUuidResponseEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkListUuidResponseEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkListUuidResponseEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkListUuidResponseEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkListUuidResponseEntry>() {
           @Override
           public void write(JsonWriter out, NetworkListUuidResponseEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkListUuidResponseEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NetworkListUuidResponseEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetworkListUuidResponseEntry
  * @throws IOException if the JSON string is invalid with respect to NetworkListUuidResponseEntry
  */
  public static NetworkListUuidResponseEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkListUuidResponseEntry.class);
  }

 /**
  * Convert an instance of NetworkListUuidResponseEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

