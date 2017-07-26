# Storage.BackendRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationProvider** | **String** | The provider of the credentials | [optional] 
**backendType** | **String** | The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties. | [optional] 
**backendSecret** | **String** | The API secret for 3rd party backends. | [optional] 
**name** | **String** |  | [optional] 
**description** | **String** |  | [optional] 
**backendKey** | **String** | The API key for 3rd party backends. | [optional] 
**parentId** | **String** | The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends. | [optional] 


<a name="AuthenticationProviderEnum"></a>
## Enum: AuthenticationProviderEnum


* `API_SUPPLIER` (value: `"API_SUPPLIER"`)

* `END_USER` (value: `"END_USER"`)




<a name="BackendTypeEnum"></a>
## Enum: BackendTypeEnum


* `FILESYSTEM` (value: `"FILESYSTEM"`)

* `AMAZON_S3` (value: `"AMAZON_S3"`)

* `MS_AZURE_BLOB_STORAGE` (value: `"MS_AZURE_BLOB_STORAGE"`)

* `GOOGLE_CLOUD_STORAGE` (value: `"GOOGLE_CLOUD_STORAGE"`)




