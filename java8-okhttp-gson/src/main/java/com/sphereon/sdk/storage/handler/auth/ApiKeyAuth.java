/*
 * Storage
 * Sphereon Storage API provides an abstraction layer for storage of (virtual) folders and streams (files/contents) fully agnostic with respect to supported storage backends. This allows for easy uniform access to and manipulation of contents regardless of the content backend being used. Currently the following backends are supported: Sphereon Cloud Storage, Amazon S3, Azure Blob Storage, Google Cloud Storage or one of the Xillio supported content repositories like Documentum, Dropbox etc. For more information about this API please visit https://docs.sphereon.com/api/storage/0.8/
 *
 * OpenAPI spec version: 0.8
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.storage.handler.auth;

import com.sphereon.sdk.storage.handler.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-06T13:57:30.609+01:00")
public class ApiKeyAuth implements Authentication {
  private final String location;
  private final String paramName;

  private String apiKey;
  private String apiKeyPrefix;

  public ApiKeyAuth(String location, String paramName) {
    this.location = location;
    this.paramName = paramName;
  }

  public String getLocation() {
    return location;
  }

  public String getParamName() {
    return paramName;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getApiKeyPrefix() {
    return apiKeyPrefix;
  }

  public void setApiKeyPrefix(String apiKeyPrefix) {
    this.apiKeyPrefix = apiKeyPrefix;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (apiKey == null) {
      return;
    }
    String value;
    if (apiKeyPrefix != null) {
      value = apiKeyPrefix + " " + apiKey;
    } else {
      value = apiKey;
    }
    if ("query".equals(location)) {
      queryParams.add(new Pair(paramName, value));
    } else if ("header".equals(location)) {
      headerParams.put(paramName, value);
    }
  }
}