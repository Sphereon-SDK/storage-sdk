
# RequestCredentials

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentialType** | [**CredentialTypeEnum**](#CredentialTypeEnum) | The credentials class type to be used. |  [optional]
**oauth2Credentials** | [**OAuth2Credentials**](OAuth2Credentials.md) | The oauth2Credentials for this backend. |  [optional]
**oauthCredentials** | [**OAuthCredentials**](OAuthCredentials.md) | The usernamePasswordCredentials for this backend. |  [optional]
**usernamePasswordCredentials** | [**UsernamePasswordCredentials**](UsernamePasswordCredentials.md) | The usernamePasswordCredentials for this backend. |  [optional]


<a name="CredentialTypeEnum"></a>
## Enum: CredentialTypeEnum
Name | Value
---- | -----
NOCREDENTIALS | &quot;com.sphereon.libs.storage.client.api.model.credentials.NoCredentials&quot;
OAUTHCREDENTIALS | &quot;com.sphereon.libs.storage.client.api.model.credentials.OAuthCredentials&quot;
OAUTH2CREDENTIALS | &quot;com.sphereon.libs.storage.client.api.model.credentials.OAuth2Credentials&quot;
USERNAMEPASSWORDCREDENTIALS | &quot;com.sphereon.libs.storage.client.api.model.credentials.UsernamePasswordCredentials&quot;



