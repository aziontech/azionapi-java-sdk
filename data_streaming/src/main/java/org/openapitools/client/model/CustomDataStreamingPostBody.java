/*
 * Data Streaming - OpenAPI
 * The Data Streaming API allows you to manage your existing data streamings and templates. Data Streaming allows you to feed your stream processing, SIEM, and big data platforms with the event logs from your applications on Azion in real time. 
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CustomDataStreamingPostBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-22T12:30:18.138783Z[GMT]")
public class CustomDataStreamingPostBody {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Options:  * &#x60;http&#x60; - Edge Applications (default)  * &#x60;waf&#x60; - WAF Events  * &#x60;cells_console&#x60; - Edge Functions  * &#x60;rtm_activity&#x60; - Activity History   
   */
  @JsonAdapter(DataSourceEnum.Adapter.class)
  public enum DataSourceEnum {
    HTTP("http"),
    
    WAF("waf"),
    
    CELLS_CONSOLE("cells_console"),
    
    RTM_ACTIVITY("rtm_activity");

    private String value;

    DataSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataSourceEnum fromValue(String value) {
      for (DataSourceEnum b : DataSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DataSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_SOURCE = "data_source";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private DataSourceEnum dataSource;

  public static final String SERIALIZED_NAME_TEMPLATE_MODEL = "template_model";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_MODEL)
  private String templateModel;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public CustomDataStreamingPostBody() {
  }

  public CustomDataStreamingPostBody name(String name) {
    
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


  public CustomDataStreamingPostBody dataSource(DataSourceEnum dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Options:  * &#x60;http&#x60; - Edge Applications (default)  * &#x60;waf&#x60; - WAF Events  * &#x60;cells_console&#x60; - Edge Functions  * &#x60;rtm_activity&#x60; - Activity History   
   * @return dataSource
  **/
  @javax.annotation.Nullable
  public DataSourceEnum getDataSource() {
    return dataSource;
  }


  public void setDataSource(DataSourceEnum dataSource) {
    this.dataSource = dataSource;
  }


  public CustomDataStreamingPostBody templateModel(String templateModel) {
    
    this.templateModel = templateModel;
    return this;
  }

   /**
   * Note:  * Add all variables and values that will be used to stream according to the data source you choose to use.    * All data streaming [variables can be found on the reference documentation](https://www.azion.com/en/documentation/products/data-streaming/#selecting-data-sources).   
   * @return templateModel
  **/
  @javax.annotation.Nullable
  public String getTemplateModel() {
    return templateModel;
  }


  public void setTemplateModel(String templateModel) {
    this.templateModel = templateModel;
  }


  public CustomDataStreamingPostBody active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDataStreamingPostBody customDataStreamingPostBody = (CustomDataStreamingPostBody) o;
    return Objects.equals(this.name, customDataStreamingPostBody.name) &&
        Objects.equals(this.dataSource, customDataStreamingPostBody.dataSource) &&
        Objects.equals(this.templateModel, customDataStreamingPostBody.templateModel) &&
        Objects.equals(this.active, customDataStreamingPostBody.active);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dataSource, templateModel, active);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDataStreamingPostBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    templateModel: ").append(toIndentedString(templateModel)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
    openapiFields.add("data_source");
    openapiFields.add("template_model");
    openapiFields.add("active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomDataStreamingPostBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomDataStreamingPostBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomDataStreamingPostBody is not found in the empty JSON string", CustomDataStreamingPostBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomDataStreamingPostBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomDataStreamingPostBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("data_source") != null && !jsonObj.get("data_source").isJsonNull()) && !jsonObj.get("data_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_source").toString()));
      }
      if ((jsonObj.get("template_model") != null && !jsonObj.get("template_model").isJsonNull()) && !jsonObj.get("template_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_model").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomDataStreamingPostBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomDataStreamingPostBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomDataStreamingPostBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomDataStreamingPostBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomDataStreamingPostBody>() {
           @Override
           public void write(JsonWriter out, CustomDataStreamingPostBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomDataStreamingPostBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomDataStreamingPostBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomDataStreamingPostBody
  * @throws IOException if the JSON string is invalid with respect to CustomDataStreamingPostBody
  */
  public static CustomDataStreamingPostBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomDataStreamingPostBody.class);
  }

 /**
  * Convert an instance of CustomDataStreamingPostBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

