/*
 * Intelligent DNS
 * Azion Intelligent DNS API
 *
 * The version of the OpenAPI document: 3.0.0
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
 * RecordGet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T17:29:01.723870Z[GMT]")
public class RecordGet {
  public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private Integer recordId;

  public static final String SERIALIZED_NAME_ENTRY = "entry";
  @SerializedName(SERIALIZED_NAME_ENTRY)
  private String entry;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ANSWERS_LIST = "answers_list";
  @SerializedName(SERIALIZED_NAME_ANSWERS_LIST)
  private List<String> answersList;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public static final String SERIALIZED_NAME_RECORD_TYPE = "record_type";
  @SerializedName(SERIALIZED_NAME_RECORD_TYPE)
  private String recordType;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl;

  public RecordGet() {
  }

  public RecordGet recordId(Integer recordId) {
    
    this.recordId = recordId;
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @javax.annotation.Nullable
  public Integer getRecordId() {
    return recordId;
  }


  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }


  public RecordGet entry(String entry) {
    
    this.entry = entry;
    return this;
  }

   /**
   * Get entry
   * @return entry
  **/
  @javax.annotation.Nullable
  public String getEntry() {
    return entry;
  }


  public void setEntry(String entry) {
    this.entry = entry;
  }


  public RecordGet description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RecordGet answersList(List<String> answersList) {
    
    this.answersList = answersList;
    return this;
  }

  public RecordGet addAnswersListItem(String answersListItem) {
    if (this.answersList == null) {
      this.answersList = new ArrayList<>();
    }
    this.answersList.add(answersListItem);
    return this;
  }

   /**
   * Get answersList
   * @return answersList
  **/
  @javax.annotation.Nullable
  public List<String> getAnswersList() {
    return answersList;
  }


  public void setAnswersList(List<String> answersList) {
    this.answersList = answersList;
  }


  public RecordGet policy(String policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @javax.annotation.Nullable
  public String getPolicy() {
    return policy;
  }


  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public RecordGet weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  public RecordGet recordType(String recordType) {
    
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  public String getRecordType() {
    return recordType;
  }


  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public RecordGet ttl(Integer ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  public Integer getTtl() {
    return ttl;
  }


  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordGet recordGet = (RecordGet) o;
    return Objects.equals(this.recordId, recordGet.recordId) &&
        Objects.equals(this.entry, recordGet.entry) &&
        Objects.equals(this.description, recordGet.description) &&
        Objects.equals(this.answersList, recordGet.answersList) &&
        Objects.equals(this.policy, recordGet.policy) &&
        Objects.equals(this.weight, recordGet.weight) &&
        Objects.equals(this.recordType, recordGet.recordType) &&
        Objects.equals(this.ttl, recordGet.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordId, entry, description, answersList, policy, weight, recordType, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordGet {\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    answersList: ").append(toIndentedString(answersList)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("record_id");
    openapiFields.add("entry");
    openapiFields.add("description");
    openapiFields.add("answers_list");
    openapiFields.add("policy");
    openapiFields.add("weight");
    openapiFields.add("record_type");
    openapiFields.add("ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecordGet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecordGet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordGet is not found in the empty JSON string", RecordGet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecordGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordGet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("entry") != null && !jsonObj.get("entry").isJsonNull()) && !jsonObj.get("entry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entry").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("answers_list") != null && !jsonObj.get("answers_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `answers_list` to be an array in the JSON string but got `%s`", jsonObj.get("answers_list").toString()));
      }
      if ((jsonObj.get("policy") != null && !jsonObj.get("policy").isJsonNull()) && !jsonObj.get("policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy").toString()));
      }
      if ((jsonObj.get("record_type") != null && !jsonObj.get("record_type").isJsonNull()) && !jsonObj.get("record_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordGet.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordGet>() {
           @Override
           public void write(JsonWriter out, RecordGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordGet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecordGet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecordGet
  * @throws IOException if the JSON string is invalid with respect to RecordGet
  */
  public static RecordGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordGet.class);
  }

 /**
  * Convert an instance of RecordGet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

