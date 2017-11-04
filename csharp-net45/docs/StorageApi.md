# Sphereon.SDK.Storage.Api.StorageApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/bucket-storage/0.7*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateBackend**](StorageApi.md#createbackend) | **POST** /backends | Create a new backend
[**CreateContainer**](StorageApi.md#createcontainer) | **POST** /containers | Create a new container
[**CreateObject**](StorageApi.md#createobject) | **POST** /containers/{containerId}/objects/{objectPath} | Create a new object within a container
[**DeleteBackend**](StorageApi.md#deletebackend) | **DELETE** /backends/{backendId} | Delete a backend
[**DeleteContainer**](StorageApi.md#deletecontainer) | **DELETE** /containers/{containerId} | Delete an existing container
[**DeleteObject**](StorageApi.md#deleteobject) | **DELETE** /containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
[**DeleteObject1**](StorageApi.md#deleteobject1) | **DELETE** /containers/{containerId}/objects | Delete an existing object from a container by stream location.
[**GetBackendInfo**](StorageApi.md#getbackendinfo) | **GET** /backends/{backendId} | Get backend information
[**GetContainerInfo**](StorageApi.md#getcontainerinfo) | **GET** /containers/{containerId} | Get container information
[**GetObject**](StorageApi.md#getobject) | **GET** /containers/{containerId}/objects/{objectPath} | Get an existing object from a container
[**GetObject1**](StorageApi.md#getobject1) | **POST** /containers/{containerId}/objects | Get an existing object from a container by stream location
[**ListContainers**](StorageApi.md#listcontainers) | **GET** /backends/{backendId}/containers | List containers
[**ListObjects**](StorageApi.md#listobjects) | **GET** /containers/{containerId}/info | List objects in path
[**ListObjects1**](StorageApi.md#listobjects1) | **GET** /containers/{containerId}/info/{objectPath} | List objects in path
[**ListObjects2**](StorageApi.md#listobjects2) | **POST** /containers/{containerId}/info | List objects in path by stream location
[**UpdateBackend**](StorageApi.md#updatebackend) | **POST** /backends/{backendId} | Update a backend
[**UpdateContainer**](StorageApi.md#updatecontainer) | **POST** /containers/{containerId} | Update a container


<a name="createbackend"></a>
# **CreateBackend**
> BackendResponse CreateBackend (BackendRequest backendRequest)

Create a new backend

Create a new backend

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class CreateBackendExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var backendRequest = new BackendRequest(); // BackendRequest | backendRequest

            try
            {
                // Create a new backend
                BackendResponse result = apiInstance.CreateBackend(backendRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.CreateBackend: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendRequest** | [**BackendRequest**](BackendRequest.md)| backendRequest | 

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createcontainer"></a>
# **CreateContainer**
> ContainerResponse CreateContainer (ContainerRequest containerRequest)

Create a new container

Create a new container

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class CreateContainerExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerRequest = new ContainerRequest(); // ContainerRequest | containerRequest

            try
            {
                // Create a new container
                ContainerResponse result = apiInstance.CreateContainer(containerRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.CreateContainer: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerRequest** | [**ContainerRequest**](ContainerRequest.md)| containerRequest | 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createobject"></a>
# **CreateObject**
> ObjectResponse CreateObject (string containerId, string objectPath, System.IO.Stream stream, string creationMode = null)

Create a new object within a container

Create a new object within a container. Query parameter creationMode accepts values NEW_ONLY to create a new object, REQUIRE_EXISTING to update an object and ALLOW_EXISTING to create a new object or overwrite an existing object.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class CreateObjectExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var objectPath = objectPath_example;  // string | objectPath
            var stream = new System.IO.Stream(); // System.IO.Stream | stream
            var creationMode = creationMode_example;  // string | creationMode (optional) 

            try
            {
                // Create a new object within a container
                ObjectResponse result = apiInstance.CreateObject(containerId, objectPath, stream, creationMode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.CreateObject: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **objectPath** | **string**| objectPath | 
 **stream** | **System.IO.Stream**| stream | 
 **creationMode** | **string**| creationMode | [optional] 

### Return type

[**ObjectResponse**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletebackend"></a>
# **DeleteBackend**
> BackendResponse DeleteBackend (string backendId)

Delete a backend

Delete a backend

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class DeleteBackendExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var backendId = backendId_example;  // string | backendId

            try
            {
                // Delete a backend
                BackendResponse result = apiInstance.DeleteBackend(backendId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.DeleteBackend: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **string**| backendId | 

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletecontainer"></a>
# **DeleteContainer**
> ContainerResponse DeleteContainer (string containerId, string delete = null)

Delete an existing container

Delete an existing container including the stored objects if indicated.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class DeleteContainerExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var delete = delete_example;  // string | delete (optional) 

            try
            {
                // Delete an existing container
                ContainerResponse result = apiInstance.DeleteContainer(containerId, delete);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.DeleteContainer: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **delete** | **string**| delete | [optional] 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteobject"></a>
# **DeleteObject**
> void DeleteObject (string containerId, string objectPath)

Delete an existing object from a container.

Delete an existing object from a container. There is no request nor response body for a delete request.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class DeleteObjectExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var objectPath = objectPath_example;  // string | objectPath

            try
            {
                // Delete an existing object from a container.
                apiInstance.DeleteObject(containerId, objectPath);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.DeleteObject: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **objectPath** | **string**| objectPath | 

### Return type

void (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteobject1"></a>
# **DeleteObject1**
> void DeleteObject1 (string containerId, StreamLocation streamLocation)

Delete an existing object from a container by stream location.

Delete an existing object from a container by stream location. There is no request nor response body for a delete request.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class DeleteObject1Example
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var streamLocation = new StreamLocation(); // StreamLocation | streamLocation

            try
            {
                // Delete an existing object from a container by stream location.
                apiInstance.DeleteObject1(containerId, streamLocation);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.DeleteObject1: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation | 

### Return type

void (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbackendinfo"></a>
# **GetBackendInfo**
> BackendResponse GetBackendInfo (string backendId)

Get backend information

Get information on a backend

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class GetBackendInfoExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var backendId = backendId_example;  // string | backendId

            try
            {
                // Get backend information
                BackendResponse result = apiInstance.GetBackendInfo(backendId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.GetBackendInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **string**| backendId | 

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcontainerinfo"></a>
# **GetContainerInfo**
> ContainerResponse GetContainerInfo (string containerId)

Get container information

Get information on a container

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class GetContainerInfoExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId

            try
            {
                // Get container information
                ContainerResponse result = apiInstance.GetContainerInfo(containerId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.GetContainerInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getobject"></a>
# **GetObject**
> byte[] GetObject (string containerId, string objectPath)

Get an existing object from a container

Get an existing object from a container

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class GetObjectExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var objectPath = objectPath_example;  // string | objectPath

            try
            {
                // Get an existing object from a container
                byte[] result = apiInstance.GetObject(containerId, objectPath);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.GetObject: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **objectPath** | **string**| objectPath | 

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getobject1"></a>
# **GetObject1**
> byte[] GetObject1 (string containerId, StreamLocation streamLocation)

Get an existing object from a container by stream location

Get an existing object from a container by stream location

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class GetObject1Example
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var streamLocation = new StreamLocation(); // StreamLocation | streamLocation

            try
            {
                // Get an existing object from a container by stream location
                byte[] result = apiInstance.GetObject1(containerId, streamLocation);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.GetObject1: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation | 

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream, application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listcontainers"></a>
# **ListContainers**
> List<ContainerResponse> ListContainers (string backendId)

List containers

List containers for the given backend name or id.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class ListContainersExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var backendId = backendId_example;  // string | backendId

            try
            {
                // List containers
                List&lt;ContainerResponse&gt; result = apiInstance.ListContainers(backendId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.ListContainers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **string**| backendId | 

### Return type

[**List<ContainerResponse>**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listobjects"></a>
# **ListObjects**
> ObjectInfoResponse ListObjects (string containerId, string objectPath)

List objects in path

Returns object information on the given path. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class ListObjectsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var objectPath = objectPath_example;  // string | objectPath

            try
            {
                // List objects in path
                ObjectInfoResponse result = apiInstance.ListObjects(containerId, objectPath);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.ListObjects: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **objectPath** | **string**| objectPath | 

### Return type

[**ObjectInfoResponse**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listobjects1"></a>
# **ListObjects1**
> ObjectInfoResponse ListObjects1 (string containerId, string objectPath)

List objects in path

Returns object information on the given path. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class ListObjects1Example
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var objectPath = objectPath_example;  // string | objectPath

            try
            {
                // List objects in path
                ObjectInfoResponse result = apiInstance.ListObjects1(containerId, objectPath);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.ListObjects1: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **objectPath** | **string**| objectPath | 

### Return type

[**ObjectInfoResponse**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listobjects2"></a>
# **ListObjects2**
> ObjectInfoResponse ListObjects2 (string containerId, StreamLocation streamLocation)

List objects in path by stream location

Returns object information on the given stream location. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class ListObjects2Example
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var streamLocation = new StreamLocation(); // StreamLocation | streamLocation

            try
            {
                // List objects in path by stream location
                ObjectInfoResponse result = apiInstance.ListObjects2(containerId, streamLocation);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.ListObjects2: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation | 

### Return type

[**ObjectInfoResponse**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatebackend"></a>
# **UpdateBackend**
> BackendResponse UpdateBackend (string backendId, BackendRequest backendRequest)

Update a backend

Update a backend

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class UpdateBackendExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var backendId = backendId_example;  // string | backendId
            var backendRequest = new BackendRequest(); // BackendRequest | backendRequest

            try
            {
                // Update a backend
                BackendResponse result = apiInstance.UpdateBackend(backendId, backendRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.UpdateBackend: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **string**| backendId | 
 **backendRequest** | [**BackendRequest**](BackendRequest.md)| backendRequest | 

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatecontainer"></a>
# **UpdateContainer**
> ContainerResponse UpdateContainer (string containerId, ContainerRequest containerRequest)

Update a container

Update an existing container with new container settings

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class UpdateContainerExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var containerRequest = new ContainerRequest(); // ContainerRequest | containerRequest

            try
            {
                // Update a container
                ContainerResponse result = apiInstance.UpdateContainer(containerId, containerRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.UpdateContainer: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **containerRequest** | [**ContainerRequest**](ContainerRequest.md)| containerRequest | 

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

