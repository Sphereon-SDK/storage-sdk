/*
 * Storage
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.8
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.storage.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OAuthCredentials
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-05T10:43:57.932+01:00")
public class OAuthCredentials {
  /**
   * Gets or Sets authenticationProvider
   */
  public enum AuthenticationProviderEnum {
    @SerializedName("API_SUPPLIER")
    SUPPLIER("API_SUPPLIER"),
    
    @SerializedName("API_IMPLEMENTER")
    IMPLEMENTER("API_IMPLEMENTER");

    private String value;

    AuthenticationProviderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("authenticationProvider")
  private AuthenticationProviderEnum authenticationProvider = null;

  @SerializedName("secretkey")
  private String secretkey = null;

  @SerializedName("accesskeyid")
  private String accesskeyid = null;

  public OAuthCredentials authenticationProvider(AuthenticationProviderEnum authenticationProvider) {
    this.authenticationProvider = authenticationProvider;
    return this;
  }

   /**
   * Get authenticationProvider
   * @return authenticationProvider
  **/
  @ApiModelProperty(example = "null", value = "")
  public AuthenticationProviderEnum getAuthenticationProvider() {
    return authenticationProvider;
  }

  public void setAuthenticationProvider(AuthenticationProviderEnum authenticationProvider) {
    this.authenticationProvider = authenticationProvider;
  }

  public OAuthCredentials secretkey(String secretkey) {
    this.secretkey = secretkey;
    return this;
  }

   /**
   * Get secretkey
   * @return secretkey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSecretkey() {
    return secretkey;
  }

  public void setSecretkey(String secretkey) {
    this.secretkey = secretkey;
  }

  public OAuthCredentials accesskeyid(String accesskeyid) {
    this.accesskeyid = accesskeyid;
    return this;
  }

   /**
   * Get accesskeyid
   * @return accesskeyid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccesskeyid() {
    return accesskeyid;
  }

  public void setAccesskeyid(String accesskeyid) {
    this.accesskeyid = accesskeyid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthCredentials oauthCredentials = (OAuthCredentials) o;
    return Objects.equals(this.authenticationProvider, oauthCredentials.authenticationProvider) &&
        Objects.equals(this.secretkey, oauthCredentials.secretkey) &&
        Objects.equals(this.accesskeyid, oauthCredentials.accesskeyid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationProvider, secretkey, accesskeyid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthCredentials {\n");
    
    sb.append("    authenticationProvider: ").append(toIndentedString(authenticationProvider)).append("\n");
    sb.append("    secretkey: ").append(toIndentedString(secretkey)).append("\n");
    sb.append("    accesskeyid: ").append(toIndentedString(accesskeyid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

