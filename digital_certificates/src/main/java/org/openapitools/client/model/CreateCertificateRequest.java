/*
 * Digital Certificates API
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
 * CreateCertificateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:50:12.318053Z[GMT]")
public class CreateCertificateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "private_key";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  /**
   * Gets or Sets certificateType
   */
  @JsonAdapter(CertificateTypeEnum.Adapter.class)
  public enum CertificateTypeEnum {
    EDGE_CERTIFICATE("edge_certificate"),
    
    TRUSTED_CA_CERTIFICATE("trusted_ca_certificate");

    private String value;

    CertificateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CertificateTypeEnum fromValue(String value) {
      for (CertificateTypeEnum b : CertificateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CertificateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CertificateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CertificateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CertificateTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CERTIFICATE_TYPE = "certificate_type";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_TYPE)
  private CertificateTypeEnum certificateType;

  public static final String SERIALIZED_NAME_MANAGED = "managed";
  @SerializedName(SERIALIZED_NAME_MANAGED)
  private Boolean managed;

  public CreateCertificateRequest() {
  }

  public CreateCertificateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCertificateRequest certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @javax.annotation.Nonnull
  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public CreateCertificateRequest privateKey(String privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @javax.annotation.Nonnull
  public String getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  public CreateCertificateRequest certificateType(CertificateTypeEnum certificateType) {
    
    this.certificateType = certificateType;
    return this;
  }

   /**
   * Get certificateType
   * @return certificateType
  **/
  @javax.annotation.Nullable
  public CertificateTypeEnum getCertificateType() {
    return certificateType;
  }


  public void setCertificateType(CertificateTypeEnum certificateType) {
    this.certificateType = certificateType;
  }


  public CreateCertificateRequest managed(Boolean managed) {
    
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @javax.annotation.Nullable
  public Boolean getManaged() {
    return managed;
  }


  public void setManaged(Boolean managed) {
    this.managed = managed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCertificateRequest createCertificateRequest = (CreateCertificateRequest) o;
    return Objects.equals(this.name, createCertificateRequest.name) &&
        Objects.equals(this.certificate, createCertificateRequest.certificate) &&
        Objects.equals(this.privateKey, createCertificateRequest.privateKey) &&
        Objects.equals(this.certificateType, createCertificateRequest.certificateType) &&
        Objects.equals(this.managed, createCertificateRequest.managed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, certificate, privateKey, certificateType, managed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCertificateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
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
    openapiFields.add("certificate");
    openapiFields.add("private_key");
    openapiFields.add("certificate_type");
    openapiFields.add("managed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("certificate");
    openapiRequiredFields.add("private_key");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCertificateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCertificateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCertificateRequest is not found in the empty JSON string", CreateCertificateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCertificateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCertificateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCertificateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate").toString()));
      }
      if (!jsonObj.get("private_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `private_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("private_key").toString()));
      }
      if ((jsonObj.get("certificate_type") != null && !jsonObj.get("certificate_type").isJsonNull()) && !jsonObj.get("certificate_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCertificateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCertificateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCertificateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCertificateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCertificateRequest>() {
           @Override
           public void write(JsonWriter out, CreateCertificateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCertificateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCertificateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCertificateRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCertificateRequest
  */
  public static CreateCertificateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCertificateRequest.class);
  }

 /**
  * Convert an instance of CreateCertificateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

