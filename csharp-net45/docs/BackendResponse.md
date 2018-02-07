# Sphereon.SDK.Storage.Model.BackendResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BackendType** | **string** | The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties. | [optional] 
**Name** | **string** |  | [optional] 
**Id** | **string** |  | [optional] 
**State** | **string** |  | [optional] 
**Region** | **string** | The storage region where the container and files are stored. This option is available for Google and Amazon Storage. For Azure is only possible to set the region when creating the storage account. | [optional] 
**ParentId** | **string** | The backend that is used for when properties are not set. This allows credentials to be set at one backend and used by multiple backends. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

