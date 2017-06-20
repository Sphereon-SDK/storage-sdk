
# BackendRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationProvider** | [**AuthenticationProviderEnum**](#AuthenticationProviderEnum) |  |  [optional]
**secretKey** | **String** |  |  [optional]
**backendType** | [**BackendTypeEnum**](#BackendTypeEnum) |  |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**parentId** | **String** |  |  [optional]
**accesskeyId** | **String** |  |  [optional]


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



