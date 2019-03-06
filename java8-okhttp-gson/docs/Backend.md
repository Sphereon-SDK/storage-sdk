
# Backend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint** | **String** | The endpoint for the backend. Please note that only a Xillio backend needs the endpoint configured for now. Other backends are resolved automatically |  [optional]
**credentials** | [**List&lt;Credentials&gt;**](Credentials.md) | The credentials that are used to connect with the backend storage location. |  [optional]
**backendType** | [**BackendTypeEnum**](#BackendTypeEnum) | The type of backend that is created. This field allows users to create a local backend or with supported 3rd parties. | 
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**region** | [**RegionEnum**](#RegionEnum) | The storage region where the container and files are stored. This option is available for Google and Amazon Storage. For Azure is only possible to set the region when creating the storage account. |  [optional]
**parentId** | **String** | The backend that is used for when properties are not set. This allows usernamePasswordCredentials to be set at one backend and re-used by multiple backends. |  [optional]


<a name="BackendTypeEnum"></a>
## Enum: BackendTypeEnum
Name | Value
---- | -----
SPHEREON_CLOUD_STORAGE | &quot;SPHEREON_CLOUD_STORAGE&quot;
AMAZON_S3 | &quot;AMAZON_S3&quot;
MS_AZURE_BLOB_STORAGE | &quot;MS_AZURE_BLOB_STORAGE&quot;
GOOGLE_CLOUD_STORAGE | &quot;GOOGLE_CLOUD_STORAGE&quot;
XILLIO_ENGINE | &quot;XILLIO_ENGINE&quot;


<a name="RegionEnum"></a>
## Enum: RegionEnum
Name | Value
---- | -----
AMAZON_S3_AP_NORTHEAST_1 | &quot;AMAZON_S3_AP_NORTHEAST_1&quot;
AMAZON_S3_AP_NORTHEAST_2 | &quot;AMAZON_S3_AP_NORTHEAST_2&quot;
AMAZON_S3_AP_SOUTH_1 | &quot;AMAZON_S3_AP_SOUTH_1&quot;
AMAZON_S3_AP_SOUTHEAST_1 | &quot;AMAZON_S3_AP_SOUTHEAST_1&quot;
AMAZON_S3_AP_SOUTHEAST_2 | &quot;AMAZON_S3_AP_SOUTHEAST_2&quot;
AMAZON_S3_CA_CENTRAL_1 | &quot;AMAZON_S3_CA_CENTRAL_1&quot;
AMAZON_S3_CN_NORTH_1 | &quot;AMAZON_S3_CN_NORTH_1&quot;
AMAZON_S3_EU_CENTRAL_1 | &quot;AMAZON_S3_EU_CENTRAL_1&quot;
AMAZON_S3_EU_WEST_1 | &quot;AMAZON_S3_EU_WEST_1&quot;
AMAZON_S3_EU_WEST_2 | &quot;AMAZON_S3_EU_WEST_2&quot;
AMAZON_S3_SA_EAST_1 | &quot;AMAZON_S3_SA_EAST_1&quot;
AMAZON_S3_US_EAST_1 | &quot;AMAZON_S3_US_EAST_1&quot;
AMAZON_S3_US_EAST_2 | &quot;AMAZON_S3_US_EAST_2&quot;
AMAZON_S3_US_STANDARD | &quot;AMAZON_S3_US_STANDARD&quot;
AMAZON_S3_US_WEST_1 | &quot;AMAZON_S3_US_WEST_1&quot;
AMAZON_S3_US_WEST_2 | &quot;AMAZON_S3_US_WEST_2&quot;
GOOGLE_STORAGE_ASIA | &quot;GOOGLE_STORAGE_ASIA&quot;
GOOGLE_STORAGE_ASIA_EAST1 | &quot;GOOGLE_STORAGE_ASIA_EAST1&quot;
GOOGLE_STORAGE_EU | &quot;GOOGLE_STORAGE_EU&quot;
GOOGLE_STORAGE_US | &quot;GOOGLE_STORAGE_US&quot;
GOOGLE_STORAGE_US_CENTRAL1 | &quot;GOOGLE_STORAGE_US_CENTRAL1&quot;
GOOGLE_STORAGE_US_CENTRAL2 | &quot;GOOGLE_STORAGE_US_CENTRAL2&quot;
GOOGLE_STORAGE_US_EAST1 | &quot;GOOGLE_STORAGE_US_EAST1&quot;
GOOGLE_STORAGE_US_EAST2 | &quot;GOOGLE_STORAGE_US_EAST2&quot;
GOOGLE_STORAGE_US_EAST3 | &quot;GOOGLE_STORAGE_US_EAST3&quot;
GOOGLE_STORAGE_US_WEST1 | &quot;GOOGLE_STORAGE_US_WEST1&quot;



