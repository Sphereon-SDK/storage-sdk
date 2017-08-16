# Storage.BackendResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backendType** | **String** | The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties. | [optional] 
**name** | **String** |  | [optional] 
**id** | **String** |  | [optional] 
**state** | **String** |  | [optional] 
**parentId** | **String** | The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends. | [optional] 


<a name="BackendTypeEnum"></a>
## Enum: BackendTypeEnum


* `SHARED_STORAGE` (value: `"SHARED_STORAGE"`)

* `AMAZON_S3` (value: `"AMAZON_S3"`)

* `MS_AZURE_BLOB_STORAGE` (value: `"MS_AZURE_BLOB_STORAGE"`)

* `GOOGLE_CLOUD_STORAGE` (value: `"GOOGLE_CLOUD_STORAGE"`)




<a name="StateEnum"></a>
## Enum: StateEnum


* `REQUEST` (value: `"REQUEST"`)

* `CREATED` (value: `"CREATED"`)

* `UPDATED` (value: `"UPDATED"`)

* `DELETED` (value: `"DELETED"`)




