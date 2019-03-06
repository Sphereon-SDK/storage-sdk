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


package com.sphereon.sdk.storage.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OAuth2ClientCredentials
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-06T13:57:30.609+01:00")
public class OAuth2ClientCredentials {
  /**
   * Gets or Sets credentialType
   */
  @JsonAdapter(CredentialTypeEnum.Adapter.class)
  public enum CredentialTypeEnum {
    NOCREDENTIALS("NoCredentials"),
    
    OAUTHCREDENTIALS("OAuthCredentials"),
    
    BEARERTOKENCREDENTIALS("BearerTokenCredentials"),
    
    USERNAMEPASSWORDCREDENTIALS("UsernamePasswordCredentials"),
    
    OAUTH2CLIENTCREDENTIALS("OAuth2ClientCredentials");

    private String value;

    CredentialTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CredentialTypeEnum fromValue(String text) {
      for (CredentialTypeEnum b : CredentialTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CredentialTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CredentialTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CredentialTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CredentialTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("credentialType")
  private CredentialTypeEnum credentialType = null;

  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("client_id")
  private String clientId = null;

  public OAuth2ClientCredentials credentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * Get credentialType
   * @return credentialType
  **/
  @ApiModelProperty(value = "")
  public CredentialTypeEnum getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
  }

  public OAuth2ClientCredentials clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The clientSecret.
   * @return clientSecret
  **/
  @ApiModelProperty(value = "The clientSecret.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OAuth2ClientCredentials clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "The clientId")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ClientCredentials oauth2ClientCredentials = (OAuth2ClientCredentials) o;
    return Objects.equals(this.credentialType, oauth2ClientCredentials.credentialType) &&
        Objects.equals(this.clientSecret, oauth2ClientCredentials.clientSecret) &&
        Objects.equals(this.clientId, oauth2ClientCredentials.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialType, clientSecret, clientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ClientCredentials {\n");
    
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
