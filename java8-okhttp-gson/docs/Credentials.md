
# Credentials

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentialType** | [**CredentialTypeEnum**](#CredentialTypeEnum) |  |  [optional]
**authenticationProvider** | [**AuthenticationProviderEnum**](#AuthenticationProviderEnum) |  |  [optional]


<a name="CredentialTypeEnum"></a>
## Enum: CredentialTypeEnum
Name | Value
---- | -----
NOCREDENTIALS | &quot;com.sphereon.libs.storage.client.api.model.credentials.NoCredentials&quot;
OAUTHCREDENTIALS | &quot;com.sphereon.libs.storage.client.api.model.credentials.OAuthCredentials&quot;
OAUTH2CREDENTIALS | &quot;com.sphereon.libs.storage.client.api.model.credentials.OAuth2Credentials&quot;
USERNAMEPASSWORDCREDENTIALS | &quot;com.sphereon.libs.storage.client.api.model.credentials.UsernamePasswordCredentials&quot;
CLAIMPARAMETERS | &quot;com.sphereon.libs.storage.client.api.model.credentials.ClaimParameters&quot;


<a name="AuthenticationProviderEnum"></a>
## Enum: AuthenticationProviderEnum
Name | Value
---- | -----
SUPPLIER | &quot;API_SUPPLIER&quot;
IMPLEMENTER | &quot;API_IMPLEMENTER&quot;



