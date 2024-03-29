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
import org.openapitools.client.model.NullArgumentBehavior;
import org.openapitools.client.model.SetCustomResponse;
import org.openapitools.client.model.SetCustomResponseArgument;
import org.openapitools.client.model.SetRateLimitBehavior;
import org.openapitools.client.model.SetWAFRuleSetAndWafModeBehavior;
import org.openapitools.client.model.SetWAFRuleSetBehavior;
import org.openapitools.client.model.SimpleArgumentBehavior;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-31T14:32:19.765188Z[GMT]")
public class Behaviors extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Behaviors.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Behaviors.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Behaviors' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NullArgumentBehavior> adapterNullArgumentBehavior = gson.getDelegateAdapter(this, TypeToken.get(NullArgumentBehavior.class));
            final TypeAdapter<SimpleArgumentBehavior> adapterSimpleArgumentBehavior = gson.getDelegateAdapter(this, TypeToken.get(SimpleArgumentBehavior.class));
            final TypeAdapter<SetRateLimitBehavior> adapterSetRateLimitBehavior = gson.getDelegateAdapter(this, TypeToken.get(SetRateLimitBehavior.class));
            final TypeAdapter<SetWAFRuleSetBehavior> adapterSetWAFRuleSetBehavior = gson.getDelegateAdapter(this, TypeToken.get(SetWAFRuleSetBehavior.class));
            final TypeAdapter<SetWAFRuleSetAndWafModeBehavior> adapterSetWAFRuleSetAndWafModeBehavior = gson.getDelegateAdapter(this, TypeToken.get(SetWAFRuleSetAndWafModeBehavior.class));
            final TypeAdapter<SetCustomResponse> adapterSetCustomResponse = gson.getDelegateAdapter(this, TypeToken.get(SetCustomResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<Behaviors>() {
                @Override
                public void write(JsonWriter out, Behaviors value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `NullArgumentBehavior`
                    if (value.getActualInstance() instanceof NullArgumentBehavior) {
                      JsonElement element = adapterNullArgumentBehavior.toJsonTree((NullArgumentBehavior)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `SimpleArgumentBehavior`
                    if (value.getActualInstance() instanceof SimpleArgumentBehavior) {
                      JsonElement element = adapterSimpleArgumentBehavior.toJsonTree((SimpleArgumentBehavior)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `SetRateLimitBehavior`
                    if (value.getActualInstance() instanceof SetRateLimitBehavior) {
                      JsonElement element = adapterSetRateLimitBehavior.toJsonTree((SetRateLimitBehavior)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `SetWAFRuleSetBehavior`
                    if (value.getActualInstance() instanceof SetWAFRuleSetBehavior) {
                      JsonElement element = adapterSetWAFRuleSetBehavior.toJsonTree((SetWAFRuleSetBehavior)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `SetWAFRuleSetAndWafModeBehavior`
                    if (value.getActualInstance() instanceof SetWAFRuleSetAndWafModeBehavior) {
                      JsonElement element = adapterSetWAFRuleSetAndWafModeBehavior.toJsonTree((SetWAFRuleSetAndWafModeBehavior)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `SetCustomResponse`
                    if (value.getActualInstance() instanceof SetCustomResponse) {
                      JsonElement element = adapterSetCustomResponse.toJsonTree((SetCustomResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: NullArgumentBehavior, SetCustomResponse, SetRateLimitBehavior, SetWAFRuleSetAndWafModeBehavior, SetWAFRuleSetBehavior, SimpleArgumentBehavior");
                }

                @Override
                public Behaviors read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize NullArgumentBehavior
                    try {
                      // validate the JSON object to see if any exception is thrown
                      NullArgumentBehavior.validateJsonElement(jsonElement);
                      actualAdapter = adapterNullArgumentBehavior;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'NullArgumentBehavior'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for NullArgumentBehavior failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'NullArgumentBehavior'", e);
                    }
                    // deserialize SimpleArgumentBehavior
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SimpleArgumentBehavior.validateJsonElement(jsonElement);
                      actualAdapter = adapterSimpleArgumentBehavior;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SimpleArgumentBehavior'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SimpleArgumentBehavior failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SimpleArgumentBehavior'", e);
                    }
                    // deserialize SetRateLimitBehavior
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SetRateLimitBehavior.validateJsonElement(jsonElement);
                      actualAdapter = adapterSetRateLimitBehavior;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SetRateLimitBehavior'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SetRateLimitBehavior failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SetRateLimitBehavior'", e);
                    }
                    // deserialize SetWAFRuleSetBehavior
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SetWAFRuleSetBehavior.validateJsonElement(jsonElement);
                      actualAdapter = adapterSetWAFRuleSetBehavior;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SetWAFRuleSetBehavior'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SetWAFRuleSetBehavior failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SetWAFRuleSetBehavior'", e);
                    }
                    // deserialize SetWAFRuleSetAndWafModeBehavior
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SetWAFRuleSetAndWafModeBehavior.validateJsonElement(jsonElement);
                      actualAdapter = adapterSetWAFRuleSetAndWafModeBehavior;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SetWAFRuleSetAndWafModeBehavior'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SetWAFRuleSetAndWafModeBehavior failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SetWAFRuleSetAndWafModeBehavior'", e);
                    }
                    // deserialize SetCustomResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SetCustomResponse.validateJsonElement(jsonElement);
                      actualAdapter = adapterSetCustomResponse;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SetCustomResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SetCustomResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SetCustomResponse'", e);
                    }

                    if (match == 1) {
                        Behaviors ret = new Behaviors();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Behaviors: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Behaviors() {
        super("oneOf", Boolean.FALSE);
    }

    public Behaviors(NullArgumentBehavior o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Behaviors(SetCustomResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Behaviors(SetRateLimitBehavior o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Behaviors(SetWAFRuleSetAndWafModeBehavior o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Behaviors(SetWAFRuleSetBehavior o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Behaviors(SimpleArgumentBehavior o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("NullArgumentBehavior", NullArgumentBehavior.class);
        schemas.put("SimpleArgumentBehavior", SimpleArgumentBehavior.class);
        schemas.put("SetRateLimitBehavior", SetRateLimitBehavior.class);
        schemas.put("SetWAFRuleSetBehavior", SetWAFRuleSetBehavior.class);
        schemas.put("SetWAFRuleSetAndWafModeBehavior", SetWAFRuleSetAndWafModeBehavior.class);
        schemas.put("SetCustomResponse", SetCustomResponse.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Behaviors.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * NullArgumentBehavior, SetCustomResponse, SetRateLimitBehavior, SetWAFRuleSetAndWafModeBehavior, SetWAFRuleSetBehavior, SimpleArgumentBehavior
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof NullArgumentBehavior) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SimpleArgumentBehavior) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SetRateLimitBehavior) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SetWAFRuleSetBehavior) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SetWAFRuleSetAndWafModeBehavior) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SetCustomResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be NullArgumentBehavior, SetCustomResponse, SetRateLimitBehavior, SetWAFRuleSetAndWafModeBehavior, SetWAFRuleSetBehavior, SimpleArgumentBehavior");
    }

    /**
     * Get the actual instance, which can be the following:
     * NullArgumentBehavior, SetCustomResponse, SetRateLimitBehavior, SetWAFRuleSetAndWafModeBehavior, SetWAFRuleSetBehavior, SimpleArgumentBehavior
     *
     * @return The actual instance (NullArgumentBehavior, SetCustomResponse, SetRateLimitBehavior, SetWAFRuleSetAndWafModeBehavior, SetWAFRuleSetBehavior, SimpleArgumentBehavior)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `NullArgumentBehavior`. If the actual instance is not `NullArgumentBehavior`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NullArgumentBehavior`
     * @throws ClassCastException if the instance is not `NullArgumentBehavior`
     */
    public NullArgumentBehavior getNullArgumentBehavior() throws ClassCastException {
        return (NullArgumentBehavior)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SimpleArgumentBehavior`. If the actual instance is not `SimpleArgumentBehavior`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SimpleArgumentBehavior`
     * @throws ClassCastException if the instance is not `SimpleArgumentBehavior`
     */
    public SimpleArgumentBehavior getSimpleArgumentBehavior() throws ClassCastException {
        return (SimpleArgumentBehavior)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SetRateLimitBehavior`. If the actual instance is not `SetRateLimitBehavior`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SetRateLimitBehavior`
     * @throws ClassCastException if the instance is not `SetRateLimitBehavior`
     */
    public SetRateLimitBehavior getSetRateLimitBehavior() throws ClassCastException {
        return (SetRateLimitBehavior)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SetWAFRuleSetBehavior`. If the actual instance is not `SetWAFRuleSetBehavior`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SetWAFRuleSetBehavior`
     * @throws ClassCastException if the instance is not `SetWAFRuleSetBehavior`
     */
    public SetWAFRuleSetBehavior getSetWAFRuleSetBehavior() throws ClassCastException {
        return (SetWAFRuleSetBehavior)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SetWAFRuleSetAndWafModeBehavior`. If the actual instance is not `SetWAFRuleSetAndWafModeBehavior`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SetWAFRuleSetAndWafModeBehavior`
     * @throws ClassCastException if the instance is not `SetWAFRuleSetAndWafModeBehavior`
     */
    public SetWAFRuleSetAndWafModeBehavior getSetWAFRuleSetAndWafModeBehavior() throws ClassCastException {
        return (SetWAFRuleSetAndWafModeBehavior)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SetCustomResponse`. If the actual instance is not `SetCustomResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SetCustomResponse`
     * @throws ClassCastException if the instance is not `SetCustomResponse`
     */
    public SetCustomResponse getSetCustomResponse() throws ClassCastException {
        return (SetCustomResponse)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Behaviors
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with NullArgumentBehavior
    try {
      NullArgumentBehavior.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for NullArgumentBehavior failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SimpleArgumentBehavior
    try {
      SimpleArgumentBehavior.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SimpleArgumentBehavior failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SetRateLimitBehavior
    try {
      SetRateLimitBehavior.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SetRateLimitBehavior failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SetWAFRuleSetBehavior
    try {
      SetWAFRuleSetBehavior.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SetWAFRuleSetBehavior failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SetWAFRuleSetAndWafModeBehavior
    try {
      SetWAFRuleSetAndWafModeBehavior.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SetWAFRuleSetAndWafModeBehavior failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SetCustomResponse
    try {
      SetCustomResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SetCustomResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for Behaviors with oneOf schemas: NullArgumentBehavior, SetCustomResponse, SetRateLimitBehavior, SetWAFRuleSetAndWafModeBehavior, SetWAFRuleSetBehavior, SimpleArgumentBehavior. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of Behaviors given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Behaviors
  * @throws IOException if the JSON string is invalid with respect to Behaviors
  */
  public static Behaviors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Behaviors.class);
  }

 /**
  * Convert an instance of Behaviors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

