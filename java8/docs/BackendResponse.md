
# BackendResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backendType** | [**BackendTypeEnum**](#BackendTypeEnum) | The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties. |  [optional]
**name** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**parentId** | **String** | The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends. |  [optional]


<a name="BackendTypeEnum"></a>
## Enum: BackendTypeEnum
Name | Value
---- | -----
SHARED_STORAGE | &quot;SHARED_STORAGE&quot;
AMAZON_S3 | &quot;AMAZON_S3&quot;
MS_AZURE_BLOB_STORAGE | &quot;MS_AZURE_BLOB_STORAGE&quot;
GOOGLE_CLOUD_STORAGE | &quot;GOOGLE_CLOUD_STORAGE&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
REQUEST | &quot;REQUEST&quot;
CREATED | &quot;CREATED&quot;
UPDATED | &quot;UPDATED&quot;
DELETED | &quot;DELETED&quot;



