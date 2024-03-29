/*
 * Web Application Firewall API
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.WAFEvents200ResultsInnerTop10CountriesInner;

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
 * WAFEvents200ResultsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-13T18:56:32.630440Z[GMT]")
public class WAFEvents200ResultsInner {
  public static final String SERIALIZED_NAME_COUNTRY_COUNT = "country_count";
  @SerializedName(SERIALIZED_NAME_COUNTRY_COUNT)
  private Long countryCount;

  public static final String SERIALIZED_NAME_TOP10_COUNTRIES = "top_10_countries";
  @SerializedName(SERIALIZED_NAME_TOP10_COUNTRIES)
  private List<WAFEvents200ResultsInnerTop10CountriesInner> top10Countries;

  public static final String SERIALIZED_NAME_TOP10_IPS = "top_10_ips";
  @SerializedName(SERIALIZED_NAME_TOP10_IPS)
  private List<WAFEvents200ResultsInnerTop10CountriesInner> top10Ips;

  public static final String SERIALIZED_NAME_HIT_COUNT = "hit_count";
  @SerializedName(SERIALIZED_NAME_HIT_COUNT)
  private Long hitCount;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private Long ruleId;

  public static final String SERIALIZED_NAME_IP_COUNT = "ip_count";
  @SerializedName(SERIALIZED_NAME_IP_COUNT)
  private Long ipCount;

  /**
   * Gets or Sets matchZone
   */
  @JsonAdapter(MatchZoneEnum.Adapter.class)
  public enum MatchZoneEnum {
    PATH("path"),
    
    QUERY_STRING("query_string"),
    
    REQUEST_HEADER("request_header"),
    
    REQUEST_BODY("request_body"),
    
    RAW_BODY("raw_body"),
    
    FILE_NAME("file_name"),
    
    COOKIE("cookie");

    private String value;

    MatchZoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchZoneEnum fromValue(String value) {
      for (MatchZoneEnum b : MatchZoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MatchZoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchZoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchZoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchZoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MATCH_ZONE = "match_zone";
  @SerializedName(SERIALIZED_NAME_MATCH_ZONE)
  private MatchZoneEnum matchZone;

  public static final String SERIALIZED_NAME_PATH_COUNT = "path_count";
  @SerializedName(SERIALIZED_NAME_PATH_COUNT)
  private Long pathCount;

  /**
   * Gets or Sets matchesOn
   */
  @JsonAdapter(MatchesOnEnum.Adapter.class)
  public enum MatchesOnEnum {
    NAME("name"),
    
    VALUE("value");

    private String value;

    MatchesOnEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchesOnEnum fromValue(String value) {
      for (MatchesOnEnum b : MatchesOnEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MatchesOnEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchesOnEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchesOnEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchesOnEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MATCHES_ON = "matches_on";
  @SerializedName(SERIALIZED_NAME_MATCHES_ON)
  private MatchesOnEnum matchesOn;

  public static final String SERIALIZED_NAME_RULE_DESCRIPTION = "rule_description";
  @SerializedName(SERIALIZED_NAME_RULE_DESCRIPTION)
  private String ruleDescription;

  public WAFEvents200ResultsInner() {
  }

  public WAFEvents200ResultsInner countryCount(Long countryCount) {
    
    this.countryCount = countryCount;
    return this;
  }

   /**
   * Get countryCount
   * @return countryCount
  **/
  @javax.annotation.Nullable
  public Long getCountryCount() {
    return countryCount;
  }


  public void setCountryCount(Long countryCount) {
    this.countryCount = countryCount;
  }


  public WAFEvents200ResultsInner top10Countries(List<WAFEvents200ResultsInnerTop10CountriesInner> top10Countries) {
    
    this.top10Countries = top10Countries;
    return this;
  }

  public WAFEvents200ResultsInner addTop10CountriesItem(WAFEvents200ResultsInnerTop10CountriesInner top10CountriesItem) {
    if (this.top10Countries == null) {
      this.top10Countries = new ArrayList<>();
    }
    this.top10Countries.add(top10CountriesItem);
    return this;
  }

   /**
   * Get top10Countries
   * @return top10Countries
  **/
  @javax.annotation.Nullable
  public List<WAFEvents200ResultsInnerTop10CountriesInner> getTop10Countries() {
    return top10Countries;
  }


  public void setTop10Countries(List<WAFEvents200ResultsInnerTop10CountriesInner> top10Countries) {
    this.top10Countries = top10Countries;
  }


  public WAFEvents200ResultsInner top10Ips(List<WAFEvents200ResultsInnerTop10CountriesInner> top10Ips) {
    
    this.top10Ips = top10Ips;
    return this;
  }

  public WAFEvents200ResultsInner addTop10IpsItem(WAFEvents200ResultsInnerTop10CountriesInner top10IpsItem) {
    if (this.top10Ips == null) {
      this.top10Ips = new ArrayList<>();
    }
    this.top10Ips.add(top10IpsItem);
    return this;
  }

   /**
   * Get top10Ips
   * @return top10Ips
  **/
  @javax.annotation.Nullable
  public List<WAFEvents200ResultsInnerTop10CountriesInner> getTop10Ips() {
    return top10Ips;
  }


  public void setTop10Ips(List<WAFEvents200ResultsInnerTop10CountriesInner> top10Ips) {
    this.top10Ips = top10Ips;
  }


  public WAFEvents200ResultsInner hitCount(Long hitCount) {
    
    this.hitCount = hitCount;
    return this;
  }

   /**
   * Get hitCount
   * @return hitCount
  **/
  @javax.annotation.Nullable
  public Long getHitCount() {
    return hitCount;
  }


  public void setHitCount(Long hitCount) {
    this.hitCount = hitCount;
  }


  public WAFEvents200ResultsInner ruleId(Long ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public Long getRuleId() {
    return ruleId;
  }


  public void setRuleId(Long ruleId) {
    this.ruleId = ruleId;
  }


  public WAFEvents200ResultsInner ipCount(Long ipCount) {
    
    this.ipCount = ipCount;
    return this;
  }

   /**
   * Get ipCount
   * @return ipCount
  **/
  @javax.annotation.Nullable
  public Long getIpCount() {
    return ipCount;
  }


  public void setIpCount(Long ipCount) {
    this.ipCount = ipCount;
  }


  public WAFEvents200ResultsInner matchZone(MatchZoneEnum matchZone) {
    
    this.matchZone = matchZone;
    return this;
  }

   /**
   * Get matchZone
   * @return matchZone
  **/
  @javax.annotation.Nullable
  public MatchZoneEnum getMatchZone() {
    return matchZone;
  }


  public void setMatchZone(MatchZoneEnum matchZone) {
    this.matchZone = matchZone;
  }


  public WAFEvents200ResultsInner pathCount(Long pathCount) {
    
    this.pathCount = pathCount;
    return this;
  }

   /**
   * Get pathCount
   * @return pathCount
  **/
  @javax.annotation.Nullable
  public Long getPathCount() {
    return pathCount;
  }


  public void setPathCount(Long pathCount) {
    this.pathCount = pathCount;
  }


  public WAFEvents200ResultsInner matchesOn(MatchesOnEnum matchesOn) {
    
    this.matchesOn = matchesOn;
    return this;
  }

   /**
   * Get matchesOn
   * @return matchesOn
  **/
  @javax.annotation.Nullable
  public MatchesOnEnum getMatchesOn() {
    return matchesOn;
  }


  public void setMatchesOn(MatchesOnEnum matchesOn) {
    this.matchesOn = matchesOn;
  }


  public WAFEvents200ResultsInner ruleDescription(String ruleDescription) {
    
    this.ruleDescription = ruleDescription;
    return this;
  }

   /**
   * Get ruleDescription
   * @return ruleDescription
  **/
  @javax.annotation.Nullable
  public String getRuleDescription() {
    return ruleDescription;
  }


  public void setRuleDescription(String ruleDescription) {
    this.ruleDescription = ruleDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WAFEvents200ResultsInner waFEvents200ResultsInner = (WAFEvents200ResultsInner) o;
    return Objects.equals(this.countryCount, waFEvents200ResultsInner.countryCount) &&
        Objects.equals(this.top10Countries, waFEvents200ResultsInner.top10Countries) &&
        Objects.equals(this.top10Ips, waFEvents200ResultsInner.top10Ips) &&
        Objects.equals(this.hitCount, waFEvents200ResultsInner.hitCount) &&
        Objects.equals(this.ruleId, waFEvents200ResultsInner.ruleId) &&
        Objects.equals(this.ipCount, waFEvents200ResultsInner.ipCount) &&
        Objects.equals(this.matchZone, waFEvents200ResultsInner.matchZone) &&
        Objects.equals(this.pathCount, waFEvents200ResultsInner.pathCount) &&
        Objects.equals(this.matchesOn, waFEvents200ResultsInner.matchesOn) &&
        Objects.equals(this.ruleDescription, waFEvents200ResultsInner.ruleDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCount, top10Countries, top10Ips, hitCount, ruleId, ipCount, matchZone, pathCount, matchesOn, ruleDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WAFEvents200ResultsInner {\n");
    sb.append("    countryCount: ").append(toIndentedString(countryCount)).append("\n");
    sb.append("    top10Countries: ").append(toIndentedString(top10Countries)).append("\n");
    sb.append("    top10Ips: ").append(toIndentedString(top10Ips)).append("\n");
    sb.append("    hitCount: ").append(toIndentedString(hitCount)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ipCount: ").append(toIndentedString(ipCount)).append("\n");
    sb.append("    matchZone: ").append(toIndentedString(matchZone)).append("\n");
    sb.append("    pathCount: ").append(toIndentedString(pathCount)).append("\n");
    sb.append("    matchesOn: ").append(toIndentedString(matchesOn)).append("\n");
    sb.append("    ruleDescription: ").append(toIndentedString(ruleDescription)).append("\n");
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
    openapiFields.add("country_count");
    openapiFields.add("top_10_countries");
    openapiFields.add("top_10_ips");
    openapiFields.add("hit_count");
    openapiFields.add("rule_id");
    openapiFields.add("ip_count");
    openapiFields.add("match_zone");
    openapiFields.add("path_count");
    openapiFields.add("matches_on");
    openapiFields.add("rule_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WAFEvents200ResultsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WAFEvents200ResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WAFEvents200ResultsInner is not found in the empty JSON string", WAFEvents200ResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WAFEvents200ResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WAFEvents200ResultsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("top_10_countries") != null && !jsonObj.get("top_10_countries").isJsonNull()) {
        JsonArray jsonArraytop10Countries = jsonObj.getAsJsonArray("top_10_countries");
        if (jsonArraytop10Countries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("top_10_countries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `top_10_countries` to be an array in the JSON string but got `%s`", jsonObj.get("top_10_countries").toString()));
          }

          // validate the optional field `top_10_countries` (array)
          for (int i = 0; i < jsonArraytop10Countries.size(); i++) {
            WAFEvents200ResultsInnerTop10CountriesInner.validateJsonElement(jsonArraytop10Countries.get(i));
          };
        }
      }
      if (jsonObj.get("top_10_ips") != null && !jsonObj.get("top_10_ips").isJsonNull()) {
        JsonArray jsonArraytop10Ips = jsonObj.getAsJsonArray("top_10_ips");
        if (jsonArraytop10Ips != null) {
          // ensure the json data is an array
          if (!jsonObj.get("top_10_ips").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `top_10_ips` to be an array in the JSON string but got `%s`", jsonObj.get("top_10_ips").toString()));
          }

          // validate the optional field `top_10_ips` (array)
          for (int i = 0; i < jsonArraytop10Ips.size(); i++) {
            WAFEvents200ResultsInnerTop10CountriesInner.validateJsonElement(jsonArraytop10Ips.get(i));
          };
        }
      }
      if ((jsonObj.get("match_zone") != null && !jsonObj.get("match_zone").isJsonNull()) && !jsonObj.get("match_zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `match_zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("match_zone").toString()));
      }
      if ((jsonObj.get("matches_on") != null && !jsonObj.get("matches_on").isJsonNull()) && !jsonObj.get("matches_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matches_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matches_on").toString()));
      }
      if ((jsonObj.get("rule_description") != null && !jsonObj.get("rule_description").isJsonNull()) && !jsonObj.get("rule_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WAFEvents200ResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WAFEvents200ResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WAFEvents200ResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WAFEvents200ResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WAFEvents200ResultsInner>() {
           @Override
           public void write(JsonWriter out, WAFEvents200ResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WAFEvents200ResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WAFEvents200ResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WAFEvents200ResultsInner
  * @throws IOException if the JSON string is invalid with respect to WAFEvents200ResultsInner
  */
  public static WAFEvents200ResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WAFEvents200ResultsInner.class);
  }

 /**
  * Convert an instance of WAFEvents200ResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

