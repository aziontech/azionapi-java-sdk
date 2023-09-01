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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.DataStreamingEndpointTypeKafka;
import org.openapitools.client.model.DataStreamingResponseGetResultTypeCustom;
import org.openapitools.client.model.DataStreamingResponseGetResultTypeDatadogDTS;
import org.openapitools.client.model.DataStreamingResponseGetResultTypeKafka;
import org.openapitools.client.model.DataStreamingResponseGetResultTypeStandard;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-01T19:02:16.279151Z[GMT]")
public class DataStreamingResponseWithResultsResultsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DataStreamingResponseWithResultsResultsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DataStreamingResponseWithResultsResultsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DataStreamingResponseWithResultsResultsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DataStreamingResponseGetResultTypeDatadogDTS> adapterDataStreamingResponseGetResultTypeDatadogDTS = gson.getDelegateAdapter(this, TypeToken.get(DataStreamingResponseGetResultTypeDatadogDTS.class));
            final TypeAdapter<DataStreamingResponseGetResultTypeKafka> adapterDataStreamingResponseGetResultTypeKafka = gson.getDelegateAdapter(this, TypeToken.get(DataStreamingResponseGetResultTypeKafka.class));
            final TypeAdapter<DataStreamingResponseGetResultTypeStandard> adapterDataStreamingResponseGetResultTypeStandard = gson.getDelegateAdapter(this, TypeToken.get(DataStreamingResponseGetResultTypeStandard.class));
            final TypeAdapter<DataStreamingResponseGetResultTypeCustom> adapterDataStreamingResponseGetResultTypeCustom = gson.getDelegateAdapter(this, TypeToken.get(DataStreamingResponseGetResultTypeCustom.class));

            return (TypeAdapter<T>) new TypeAdapter<DataStreamingResponseWithResultsResultsInner>() {
                @Override
                public void write(JsonWriter out, DataStreamingResponseWithResultsResultsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `DataStreamingResponseGetResultTypeDatadogDTS`
                    if (value.getActualInstance() instanceof DataStreamingResponseGetResultTypeDatadogDTS) {
                      JsonElement element = adapterDataStreamingResponseGetResultTypeDatadogDTS.toJsonTree((DataStreamingResponseGetResultTypeDatadogDTS)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `DataStreamingResponseGetResultTypeKafka`
                    if (value.getActualInstance() instanceof DataStreamingResponseGetResultTypeKafka) {
                      JsonElement element = adapterDataStreamingResponseGetResultTypeKafka.toJsonTree((DataStreamingResponseGetResultTypeKafka)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `DataStreamingResponseGetResultTypeStandard`
                    if (value.getActualInstance() instanceof DataStreamingResponseGetResultTypeStandard) {
                      JsonElement element = adapterDataStreamingResponseGetResultTypeStandard.toJsonTree((DataStreamingResponseGetResultTypeStandard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `DataStreamingResponseGetResultTypeCustom`
                    if (value.getActualInstance() instanceof DataStreamingResponseGetResultTypeCustom) {
                      JsonElement element = adapterDataStreamingResponseGetResultTypeCustom.toJsonTree((DataStreamingResponseGetResultTypeCustom)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemae: DataStreamingResponseGetResultTypeCustom, DataStreamingResponseGetResultTypeDatadogDTS, DataStreamingResponseGetResultTypeKafka, DataStreamingResponseGetResultTypeStandard");
                }

                @Override
                public DataStreamingResponseWithResultsResultsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize DataStreamingResponseGetResultTypeDatadogDTS
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DataStreamingResponseGetResultTypeDatadogDTS.validateJsonElement(jsonElement);
                      actualAdapter = adapterDataStreamingResponseGetResultTypeDatadogDTS;
                      DataStreamingResponseWithResultsResultsInner ret = new DataStreamingResponseWithResultsResultsInner();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DataStreamingResponseGetResultTypeDatadogDTS failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DataStreamingResponseGetResultTypeDatadogDTS'", e);
                    }
                    // deserialize DataStreamingResponseGetResultTypeKafka
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DataStreamingResponseGetResultTypeKafka.validateJsonElement(jsonElement);
                      actualAdapter = adapterDataStreamingResponseGetResultTypeKafka;
                      DataStreamingResponseWithResultsResultsInner ret = new DataStreamingResponseWithResultsResultsInner();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DataStreamingResponseGetResultTypeKafka failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DataStreamingResponseGetResultTypeKafka'", e);
                    }
                    // deserialize DataStreamingResponseGetResultTypeStandard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DataStreamingResponseGetResultTypeStandard.validateJsonElement(jsonElement);
                      actualAdapter = adapterDataStreamingResponseGetResultTypeStandard;
                      DataStreamingResponseWithResultsResultsInner ret = new DataStreamingResponseWithResultsResultsInner();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DataStreamingResponseGetResultTypeStandard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DataStreamingResponseGetResultTypeStandard'", e);
                    }
                    // deserialize DataStreamingResponseGetResultTypeCustom
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DataStreamingResponseGetResultTypeCustom.validateJsonElement(jsonElement);
                      actualAdapter = adapterDataStreamingResponseGetResultTypeCustom;
                      DataStreamingResponseWithResultsResultsInner ret = new DataStreamingResponseWithResultsResultsInner();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DataStreamingResponseGetResultTypeCustom failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DataStreamingResponseGetResultTypeCustom'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for DataStreamingResponseWithResultsResultsInner: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public DataStreamingResponseWithResultsResultsInner() {
        super("anyOf", Boolean.FALSE);
    }

    public DataStreamingResponseWithResultsResultsInner(DataStreamingResponseGetResultTypeCustom o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DataStreamingResponseWithResultsResultsInner(DataStreamingResponseGetResultTypeDatadogDTS o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DataStreamingResponseWithResultsResultsInner(DataStreamingResponseGetResultTypeKafka o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DataStreamingResponseWithResultsResultsInner(DataStreamingResponseGetResultTypeStandard o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DataStreamingResponseGetResultTypeDatadogDTS", DataStreamingResponseGetResultTypeDatadogDTS.class);
        schemas.put("DataStreamingResponseGetResultTypeKafka", DataStreamingResponseGetResultTypeKafka.class);
        schemas.put("DataStreamingResponseGetResultTypeStandard", DataStreamingResponseGetResultTypeStandard.class);
        schemas.put("DataStreamingResponseGetResultTypeCustom", DataStreamingResponseGetResultTypeCustom.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return DataStreamingResponseWithResultsResultsInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * DataStreamingResponseGetResultTypeCustom, DataStreamingResponseGetResultTypeDatadogDTS, DataStreamingResponseGetResultTypeKafka, DataStreamingResponseGetResultTypeStandard
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof DataStreamingResponseGetResultTypeDatadogDTS) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DataStreamingResponseGetResultTypeKafka) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DataStreamingResponseGetResultTypeStandard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DataStreamingResponseGetResultTypeCustom) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DataStreamingResponseGetResultTypeCustom, DataStreamingResponseGetResultTypeDatadogDTS, DataStreamingResponseGetResultTypeKafka, DataStreamingResponseGetResultTypeStandard");
    }

    /**
     * Get the actual instance, which can be the following:
     * DataStreamingResponseGetResultTypeCustom, DataStreamingResponseGetResultTypeDatadogDTS, DataStreamingResponseGetResultTypeKafka, DataStreamingResponseGetResultTypeStandard
     *
     * @return The actual instance (DataStreamingResponseGetResultTypeCustom, DataStreamingResponseGetResultTypeDatadogDTS, DataStreamingResponseGetResultTypeKafka, DataStreamingResponseGetResultTypeStandard)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DataStreamingResponseGetResultTypeDatadogDTS`. If the actual instance is not `DataStreamingResponseGetResultTypeDatadogDTS`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DataStreamingResponseGetResultTypeDatadogDTS`
     * @throws ClassCastException if the instance is not `DataStreamingResponseGetResultTypeDatadogDTS`
     */
    public DataStreamingResponseGetResultTypeDatadogDTS getDataStreamingResponseGetResultTypeDatadogDTS() throws ClassCastException {
        return (DataStreamingResponseGetResultTypeDatadogDTS)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DataStreamingResponseGetResultTypeKafka`. If the actual instance is not `DataStreamingResponseGetResultTypeKafka`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DataStreamingResponseGetResultTypeKafka`
     * @throws ClassCastException if the instance is not `DataStreamingResponseGetResultTypeKafka`
     */
    public DataStreamingResponseGetResultTypeKafka getDataStreamingResponseGetResultTypeKafka() throws ClassCastException {
        return (DataStreamingResponseGetResultTypeKafka)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DataStreamingResponseGetResultTypeStandard`. If the actual instance is not `DataStreamingResponseGetResultTypeStandard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DataStreamingResponseGetResultTypeStandard`
     * @throws ClassCastException if the instance is not `DataStreamingResponseGetResultTypeStandard`
     */
    public DataStreamingResponseGetResultTypeStandard getDataStreamingResponseGetResultTypeStandard() throws ClassCastException {
        return (DataStreamingResponseGetResultTypeStandard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DataStreamingResponseGetResultTypeCustom`. If the actual instance is not `DataStreamingResponseGetResultTypeCustom`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DataStreamingResponseGetResultTypeCustom`
     * @throws ClassCastException if the instance is not `DataStreamingResponseGetResultTypeCustom`
     */
    public DataStreamingResponseGetResultTypeCustom getDataStreamingResponseGetResultTypeCustom() throws ClassCastException {
        return (DataStreamingResponseGetResultTypeCustom)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataStreamingResponseWithResultsResultsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate anyOf schemas one by one
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with DataStreamingResponseGetResultTypeDatadogDTS
    try {
      DataStreamingResponseGetResultTypeDatadogDTS.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DataStreamingResponseGetResultTypeDatadogDTS failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DataStreamingResponseGetResultTypeKafka
    try {
      DataStreamingResponseGetResultTypeKafka.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DataStreamingResponseGetResultTypeKafka failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DataStreamingResponseGetResultTypeStandard
    try {
      DataStreamingResponseGetResultTypeStandard.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DataStreamingResponseGetResultTypeStandard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DataStreamingResponseGetResultTypeCustom
    try {
      DataStreamingResponseGetResultTypeCustom.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DataStreamingResponseGetResultTypeCustom failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    throw new IOException(String.format("The JSON string is invalid for DataStreamingResponseWithResultsResultsInner with anyOf schemas: DataStreamingResponseGetResultTypeCustom, DataStreamingResponseGetResultTypeDatadogDTS, DataStreamingResponseGetResultTypeKafka, DataStreamingResponseGetResultTypeStandard. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    
  }

 /**
  * Create an instance of DataStreamingResponseWithResultsResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataStreamingResponseWithResultsResultsInner
  * @throws IOException if the JSON string is invalid with respect to DataStreamingResponseWithResultsResultsInner
  */
  public static DataStreamingResponseWithResultsResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataStreamingResponseWithResultsResultsInner.class);
  }

 /**
  * Convert an instance of DataStreamingResponseWithResultsResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

