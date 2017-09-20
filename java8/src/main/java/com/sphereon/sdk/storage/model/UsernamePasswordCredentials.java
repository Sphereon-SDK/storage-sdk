/**
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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * UsernamePasswordCredentials
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-13T08:17:36.538+02:00")
public class UsernamePasswordCredentials   {
  /**
   * Gets or Sets authenticationProvider
   */
  public enum AuthenticationProviderEnum {
    @SerializedName("API_SUPPLIER")
    API_SUPPLIER("API_SUPPLIER"),
    
    @SerializedName("END_USER")
    END_USER("END_USER");

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

  @SerializedName("password")
  private String password = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("userName")
  private String userName = null;

  public UsernamePasswordCredentials authenticationProvider(AuthenticationProviderEnum authenticationProvider) {
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

  public UsernamePasswordCredentials password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UsernamePasswordCredentials domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public UsernamePasswordCredentials userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsernamePasswordCredentials usernamePasswordCredentials = (UsernamePasswordCredentials) o;
    return Objects.equals(this.authenticationProvider, usernamePasswordCredentials.authenticationProvider) &&
        Objects.equals(this.password, usernamePasswordCredentials.password) &&
        Objects.equals(this.domain, usernamePasswordCredentials.domain) &&
        Objects.equals(this.userName, usernamePasswordCredentials.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationProvider, password, domain, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsernamePasswordCredentials {\n");
    
    sb.append("    authenticationProvider: ").append(toIndentedString(authenticationProvider)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

