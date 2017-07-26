
# BackendRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationProvider** | [**AuthenticationProviderEnum**](#AuthenticationProviderEnum) | The provider of the credentials |  [optional]
**backendType** | [**BackendTypeEnum**](#BackendTypeEnum) | The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties. |  [optional]
**backendSecret** | **String** | The API secret for 3rd party backends. |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**backendKey** | **String** | The API key for 3rd party backends. |  [optional]
**parentId** | **String** | The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends. |  [optional]


<a name="AuthenticationProviderEnum"></a>
## Enum: AuthenticationProviderEnum
Name | Value
---- | -----
API_SUPPLIER | &quot;API_SUPPLIER&quot;
END_USER | &quot;END_USER&quot;


<a name="BackendTypeEnum"></a>
## Enum: BackendTypeEnum
Name | Value
---- | -----
FILESYSTEM | &quot;FILESYSTEM&quot;
AMAZON_S3 | &quot;AMAZON_S3&quot;
MS_AZURE_BLOB_STORAGE | &quot;MS_AZURE_BLOB_STORAGE&quot;
GOOGLE_CLOUD_STORAGE | &quot;GOOGLE_CLOUD_STORAGE&quot;



