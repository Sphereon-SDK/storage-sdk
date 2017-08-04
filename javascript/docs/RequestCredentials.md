# Storage.RequestCredentials

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentialType** | **String** | The credentials class type to be used. | [optional] 
**oauth2Credentials** | [**OAuth2Credentials**](OAuth2Credentials.md) | The oauth2Credentials for this backend. | [optional] 
**oauthCredentials** | [**OAuthCredentials**](OAuthCredentials.md) | The usernamePasswordCredentials for this backend. | [optional] 
**usernamePasswordCredentials** | [**UsernamePasswordCredentials**](UsernamePasswordCredentials.md) | The usernamePasswordCredentials for this backend. | [optional] 


<a name="CredentialTypeEnum"></a>
## Enum: CredentialTypeEnum


* `NoCredentials` (value: `"com.sphereon.libs.storage.client.api.model.credentials.NoCredentials"`)

* `OAuthCredentials` (value: `"com.sphereon.libs.storage.client.api.model.credentials.OAuthCredentials"`)

* `OAuth2Credentials` (value: `"com.sphereon.libs.storage.client.api.model.credentials.OAuth2Credentials"`)

* `UsernamePasswordCredentials` (value: `"com.sphereon.libs.storage.client.api.model.credentials.UsernamePasswordCredentials"`)




