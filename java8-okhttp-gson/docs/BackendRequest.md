
# BackendRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backendType** | [**BackendTypeEnum**](#BackendTypeEnum) | The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties. |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**parentId** | **String** | The backend that is used for when properties are not set. This allows usernamePasswordCredentials to be set at one backend and used by multiple backends. |  [optional]
**requestCredentials** | [**RequestCredentials**](RequestCredentials.md) | The credentials details |  [optional]


<a name="BackendTypeEnum"></a>
## Enum: BackendTypeEnum
Name | Value
---- | -----
FILESYSTEM | &quot;FILESYSTEM&quot;
AMAZON_S3 | &quot;AMAZON_S3&quot;
MS_AZURE_BLOB_STORAGE | &quot;MS_AZURE_BLOB_STORAGE&quot;
GOOGLE_CLOUD_STORAGE | &quot;GOOGLE_CLOUD_STORAGE&quot;



