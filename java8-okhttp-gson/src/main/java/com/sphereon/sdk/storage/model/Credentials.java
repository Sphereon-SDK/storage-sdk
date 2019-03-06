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
 * Credentials
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-06T13:57:30.609+01:00")
public class Credentials {
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

  /**
   * Gets or Sets authenticationProvider
   */
  @JsonAdapter(AuthenticationProviderEnum.Adapter.class)
  public enum AuthenticationProviderEnum {
    SUPPLIER("API_SUPPLIER"),
    
    IMPLEMENTER("API_IMPLEMENTER");

    private String value;

    AuthenticationProviderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationProviderEnum fromValue(String text) {
      for (AuthenticationProviderEnum b : AuthenticationProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthenticationProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationProviderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticationProviderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("authenticationProvider")
  private AuthenticationProviderEnum authenticationProvider = null;

  public Credentials credentialType(CredentialTypeEnum credentialType) {
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

  public Credentials authenticationProvider(AuthenticationProviderEnum authenticationProvider) {
    this.authenticationProvider = authenticationProvider;
    return this;
  }

   /**
   * Get authenticationProvider
   * @return authenticationProvider
  **/
  @ApiModelProperty(value = "")
  public AuthenticationProviderEnum getAuthenticationProvider() {
    return authenticationProvider;
  }

  public void setAuthenticationProvider(AuthenticationProviderEnum authenticationProvider) {
    this.authenticationProvider = authenticationProvider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credentials credentials = (Credentials) o;
    return Objects.equals(this.credentialType, credentials.credentialType) &&
        Objects.equals(this.authenticationProvider, credentials.authenticationProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialType, authenticationProvider);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credentials {\n");
    
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    authenticationProvider: ").append(toIndentedString(authenticationProvider)).append("\n");
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

