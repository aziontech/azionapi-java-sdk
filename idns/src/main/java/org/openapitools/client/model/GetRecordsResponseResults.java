/*
 * Intelligent DNS API
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RecordGet;

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
 * GetRecordsResponseResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-05T20:13:24.050792Z[GMT]")
public class GetRecordsResponseResults {
  public static final String SERIALIZED_NAME_ZONE_ID = "zone_id";
  @SerializedName(SERIALIZED_NAME_ZONE_ID)
  private Integer zoneId;

  public static final String SERIALIZED_NAME_ZONE_DOMAIN = "zone_domain";
  @SerializedName(SERIALIZED_NAME_ZONE_DOMAIN)
  private String zoneDomain;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<RecordGet> records;

  public GetRecordsResponseResults() {
  }

  public GetRecordsResponseResults zoneId(Integer zoneId) {
    
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @javax.annotation.Nullable
  public Integer getZoneId() {
    return zoneId;
  }


  public void setZoneId(Integer zoneId) {
    this.zoneId = zoneId;
  }


  public GetRecordsResponseResults zoneDomain(String zoneDomain) {
    
    this.zoneDomain = zoneDomain;
    return this;
  }

   /**
   * Get zoneDomain
   * @return zoneDomain
  **/
  @javax.annotation.Nullable
  public String getZoneDomain() {
    return zoneDomain;
  }


  public void setZoneDomain(String zoneDomain) {
    this.zoneDomain = zoneDomain;
  }


  public GetRecordsResponseResults records(List<RecordGet> records) {
    
    this.records = records;
    return this;
  }

  public GetRecordsResponseResults addRecordsItem(RecordGet recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Zone records collection
   * @return records
  **/
  @javax.annotation.Nullable
  public List<RecordGet> getRecords() {
    return records;
  }


  public void setRecords(List<RecordGet> records) {
    this.records = records;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecordsResponseResults getRecordsResponseResults = (GetRecordsResponseResults) o;
    return Objects.equals(this.zoneId, getRecordsResponseResults.zoneId) &&
        Objects.equals(this.zoneDomain, getRecordsResponseResults.zoneDomain) &&
        Objects.equals(this.records, getRecordsResponseResults.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneId, zoneDomain, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecordsResponseResults {\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneDomain: ").append(toIndentedString(zoneDomain)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
    openapiFields.add("zone_id");
    openapiFields.add("zone_domain");
    openapiFields.add("records");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetRecordsResponseResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRecordsResponseResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecordsResponseResults is not found in the empty JSON string", GetRecordsResponseResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRecordsResponseResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecordsResponseResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("zone_domain") != null && !jsonObj.get("zone_domain").isJsonNull()) && !jsonObj.get("zone_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone_domain").toString()));
      }
      if (jsonObj.get("records") != null && !jsonObj.get("records").isJsonNull()) {
        JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("records");
        if (jsonArrayrecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("records").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `records` to be an array in the JSON string but got `%s`", jsonObj.get("records").toString()));
          }

          // validate the optional field `records` (array)
          for (int i = 0; i < jsonArrayrecords.size(); i++) {
            RecordGet.validateJsonElement(jsonArrayrecords.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecordsResponseResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecordsResponseResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecordsResponseResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecordsResponseResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecordsResponseResults>() {
           @Override
           public void write(JsonWriter out, GetRecordsResponseResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecordsResponseResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRecordsResponseResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecordsResponseResults
  * @throws IOException if the JSON string is invalid with respect to GetRecordsResponseResults
  */
  public static GetRecordsResponseResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecordsResponseResults.class);
  }

 /**
  * Convert an instance of GetRecordsResponseResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

