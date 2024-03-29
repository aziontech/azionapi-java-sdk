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
import java.util.ArrayList;
import java.util.List;
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
 * ResultsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:50:12.318053Z[GMT]")
public class ResultsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBJECT_NAME = "subject_name";
  @SerializedName(SERIALIZED_NAME_SUBJECT_NAME)
  private List<String> subjectName;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private String validity;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

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

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_AZION_INFORMATION = "azion_information";
  @SerializedName(SERIALIZED_NAME_AZION_INFORMATION)
  private String azionInformation;

  public ResultsInner() {
  }

  public ResultsInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ResultsInner name(String name) {
    
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


  public ResultsInner subjectName(List<String> subjectName) {
    
    this.subjectName = subjectName;
    return this;
  }

  public ResultsInner addSubjectNameItem(String subjectNameItem) {
    if (this.subjectName == null) {
      this.subjectName = new ArrayList<>();
    }
    this.subjectName.add(subjectNameItem);
    return this;
  }

   /**
   * Get subjectName
   * @return subjectName
  **/
  @javax.annotation.Nullable
  public List<String> getSubjectName() {
    return subjectName;
  }


  public void setSubjectName(List<String> subjectName) {
    this.subjectName = subjectName;
  }


  public ResultsInner validity(String validity) {
    
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @javax.annotation.Nullable
  public String getValidity() {
    return validity;
  }


  public void setValidity(String validity) {
    this.validity = validity;
  }


  public ResultsInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ResultsInner certificateType(CertificateTypeEnum certificateType) {
    
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


  public ResultsInner managed(Boolean managed) {
    
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


  public ResultsInner issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public ResultsInner azionInformation(String azionInformation) {
    
    this.azionInformation = azionInformation;
    return this;
  }

   /**
   * Get azionInformation
   * @return azionInformation
  **/
  @javax.annotation.Nullable
  public String getAzionInformation() {
    return azionInformation;
  }


  public void setAzionInformation(String azionInformation) {
    this.azionInformation = azionInformation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsInner resultsInner = (ResultsInner) o;
    return Objects.equals(this.id, resultsInner.id) &&
        Objects.equals(this.name, resultsInner.name) &&
        Objects.equals(this.subjectName, resultsInner.subjectName) &&
        Objects.equals(this.validity, resultsInner.validity) &&
        Objects.equals(this.status, resultsInner.status) &&
        Objects.equals(this.certificateType, resultsInner.certificateType) &&
        Objects.equals(this.managed, resultsInner.managed) &&
        Objects.equals(this.issuer, resultsInner.issuer) &&
        Objects.equals(this.azionInformation, resultsInner.azionInformation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, subjectName, validity, status, certificateType, managed, issuer, azionInformation);
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
    sb.append("class ResultsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    azionInformation: ").append(toIndentedString(azionInformation)).append("\n");
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
    openapiFields.add("subject_name");
    openapiFields.add("validity");
    openapiFields.add("status");
    openapiFields.add("certificate_type");
    openapiFields.add("managed");
    openapiFields.add("issuer");
    openapiFields.add("azion_information");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResultsInner is not found in the empty JSON string", ResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("subject_name") != null && !jsonObj.get("subject_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_name` to be an array in the JSON string but got `%s`", jsonObj.get("subject_name").toString()));
      }
      if ((jsonObj.get("validity") != null && !jsonObj.get("validity").isJsonNull()) && !jsonObj.get("validity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validity").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("certificate_type") != null && !jsonObj.get("certificate_type").isJsonNull()) && !jsonObj.get("certificate_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_type").toString()));
      }
      if ((jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if ((jsonObj.get("azion_information") != null && !jsonObj.get("azion_information").isJsonNull()) && !jsonObj.get("azion_information").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `azion_information` to be a primitive type in the JSON string but got `%s`", jsonObj.get("azion_information").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ResultsInner>() {
           @Override
           public void write(JsonWriter out, ResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResultsInner
  * @throws IOException if the JSON string is invalid with respect to ResultsInner
  */
  public static ResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResultsInner.class);
  }

 /**
  * Convert an instance of ResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

