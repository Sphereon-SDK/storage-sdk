/*
 * Storage
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.7
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sphereon.sdk.storage.model.OAuth2Credentials;
import com.sphereon.sdk.storage.model.OAuthCredentials;
import com.sphereon.sdk.storage.model.UsernamePasswordCredentials;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RequestCredentials
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-04T10:04:00.973+02:00")
public class RequestCredentials {
  /**
   * The credentials class type to be used.
   */
  public enum CredentialTypeEnum {
    NOCREDENTIALS("com.sphereon.libs.storage.client.api.model.credentials.NoCredentials"),
    
    OAUTHCREDENTIALS("com.sphereon.libs.storage.client.api.model.credentials.OAuthCredentials"),
    
    OAUTH2CREDENTIALS("com.sphereon.libs.storage.client.api.model.credentials.OAuth2Credentials"),
    
    USERNAMEPASSWORDCREDENTIALS("com.sphereon.libs.storage.client.api.model.credentials.UsernamePasswordCredentials");

    private String value;

    CredentialTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CredentialTypeEnum fromValue(String text) {
      for (CredentialTypeEnum b : CredentialTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("credentialType")
  private CredentialTypeEnum credentialType = null;

  @JsonProperty("oauth2Credentials")
  private OAuth2Credentials oauth2Credentials = null;

  @JsonProperty("oauthCredentials")
  private OAuthCredentials oauthCredentials = null;

  @JsonProperty("usernamePasswordCredentials")
  private UsernamePasswordCredentials usernamePasswordCredentials = null;

  public RequestCredentials credentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * The credentials class type to be used.
   * @return credentialType
  **/
  @ApiModelProperty(example = "null", value = "The credentials class type to be used.")
  public CredentialTypeEnum getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
  }

  public RequestCredentials oauth2Credentials(OAuth2Credentials oauth2Credentials) {
    this.oauth2Credentials = oauth2Credentials;
    return this;
  }

   /**
   * The oauth2Credentials for this backend.
   * @return oauth2Credentials
  **/
  @ApiModelProperty(example = "null", value = "The oauth2Credentials for this backend.")
  public OAuth2Credentials getOauth2Credentials() {
    return oauth2Credentials;
  }

  public void setOauth2Credentials(OAuth2Credentials oauth2Credentials) {
    this.oauth2Credentials = oauth2Credentials;
  }

  public RequestCredentials oauthCredentials(OAuthCredentials oauthCredentials) {
    this.oauthCredentials = oauthCredentials;
    return this;
  }

   /**
   * The usernamePasswordCredentials for this backend.
   * @return oauthCredentials
  **/
  @ApiModelProperty(example = "null", value = "The usernamePasswordCredentials for this backend.")
  public OAuthCredentials getOauthCredentials() {
    return oauthCredentials;
  }

  public void setOauthCredentials(OAuthCredentials oauthCredentials) {
    this.oauthCredentials = oauthCredentials;
  }

  public RequestCredentials usernamePasswordCredentials(UsernamePasswordCredentials usernamePasswordCredentials) {
    this.usernamePasswordCredentials = usernamePasswordCredentials;
    return this;
  }

   /**
   * The usernamePasswordCredentials for this backend.
   * @return usernamePasswordCredentials
  **/
  @ApiModelProperty(example = "null", value = "The usernamePasswordCredentials for this backend.")
  public UsernamePasswordCredentials getUsernamePasswordCredentials() {
    return usernamePasswordCredentials;
  }

  public void setUsernamePasswordCredentials(UsernamePasswordCredentials usernamePasswordCredentials) {
    this.usernamePasswordCredentials = usernamePasswordCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCredentials requestCredentials = (RequestCredentials) o;
    return Objects.equals(this.credentialType, requestCredentials.credentialType) &&
        Objects.equals(this.oauth2Credentials, requestCredentials.oauth2Credentials) &&
        Objects.equals(this.oauthCredentials, requestCredentials.oauthCredentials) &&
        Objects.equals(this.usernamePasswordCredentials, requestCredentials.usernamePasswordCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialType, oauth2Credentials, oauthCredentials, usernamePasswordCredentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCredentials {\n");
    
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    oauth2Credentials: ").append(toIndentedString(oauth2Credentials)).append("\n");
    sb.append("    oauthCredentials: ").append(toIndentedString(oauthCredentials)).append("\n");
    sb.append("    usernamePasswordCredentials: ").append(toIndentedString(usernamePasswordCredentials)).append("\n");
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

