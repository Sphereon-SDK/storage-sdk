# Sphereon.SDK.Storage.Api.StorageApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateBackend**](StorageApi.md#createbackend) | **POST** /bucket-storage/0.7/backends | Create a new backend
[**CreateContainer**](StorageApi.md#createcontainer) | **POST** /bucket-storage/0.7/containers | Create a new container
[**CreateObject**](StorageApi.md#createobject) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Create a new object within a container
[**CreateObjectInFolder**](StorageApi.md#createobjectinfolder) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/** | Create a new object within a container
[**CreateObjectInFolder1**](StorageApi.md#createobjectinfolder1) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath}/** | Create a new object within a container
[**DeleteBackend**](StorageApi.md#deletebackend) | **DELETE** /bucket-storage/0.7/backends/{backendId} | Delete a backend
[**DeleteContainer**](StorageApi.md#deletecontainer) | **DELETE** /bucket-storage/0.7/containers/{containerId} | Delete an existing container
[**DeleteObject**](StorageApi.md#deleteobject) | **DELETE** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
[**GetBackendInfo**](StorageApi.md#getbackendinfo) | **GET** /bucket-storage/0.7/backends/{backendId} | Get backend information
[**GetContainerInfo**](StorageApi.md#getcontainerinfo) | **GET** /bucket-storage/0.7/containers/{containerId} | Get container information
[**GetObject**](StorageApi.md#getobject) | **GET** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Get an existing object from a container
[**ListContainers**](StorageApi.md#listcontainers) | **GET** /bucket-storage/0.7/backends/{backendId}/containers | List containers
[**ListObjects**](StorageApi.md#listobjects) | **GET** /bucket-storage/0.7/containers/{containerId}/list/{objectPath} | List objects in path
[**ListObjectsInFolder**](StorageApi.md#listobjectsinfolder) | **GET** /bucket-storage/0.7/containers/{containerId}/list | List objects in path
[**ListObjectsInFolder1**](StorageApi.md#listobjectsinfolder1) | **GET** /bucket-storage/0.7/containers/{containerId}/list/** | List objects in path
[**ListObjectsInFolder2**](StorageApi.md#listobjectsinfolder2) | **GET** /bucket-storage/0.7/containers/{containerId}/list/{objectPath}/** | List objects in path
[**UpdateBackend**](StorageApi.md#updatebackend) | **POST** /bucket-storage/0.7/backends/{backendId} | Update a backend
[**UpdateContainer**](StorageApi.md#updatecontainer) | **POST** /bucket-storage/0.7/containers/{containerId} | Update a container


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
> ObjectResponse CreateObject (string containerId, string objectPath, System.IO.Stream stream, string overwriteMode = null)

Create a new object within a container

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
            var overwriteMode = overwriteMode_example;  // string | overwriteMode (optional) 

            try
            {
                // Create a new object within a container
                ObjectResponse result = apiInstance.CreateObject(containerId, objectPath, stream, overwriteMode);
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
 **overwriteMode** | **string**| overwriteMode | [optional] 

### Return type

[**ObjectResponse**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createobjectinfolder"></a>
# **CreateObjectInFolder**
> ObjectResponse CreateObjectInFolder (string containerId, System.IO.Stream stream, string overwriteMode = null)

Create a new object within a container

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class CreateObjectInFolderExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var stream = new System.IO.Stream(); // System.IO.Stream | stream
            var overwriteMode = overwriteMode_example;  // string | overwriteMode (optional) 

            try
            {
                // Create a new object within a container
                ObjectResponse result = apiInstance.CreateObjectInFolder(containerId, stream, overwriteMode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.CreateObjectInFolder: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **stream** | **System.IO.Stream**| stream | 
 **overwriteMode** | **string**| overwriteMode | [optional] 

### Return type

[**ObjectResponse**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createobjectinfolder1"></a>
# **CreateObjectInFolder1**
> ObjectResponse CreateObjectInFolder1 (string containerId, System.IO.Stream stream, string overwriteMode = null)

Create a new object within a container

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class CreateObjectInFolder1Example
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId
            var stream = new System.IO.Stream(); // System.IO.Stream | stream
            var overwriteMode = overwriteMode_example;  // string | overwriteMode (optional) 

            try
            {
                // Create a new object within a container
                ObjectResponse result = apiInstance.CreateObjectInFolder1(containerId, stream, overwriteMode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.CreateObjectInFolder1: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **string**| containerId | 
 **stream** | **System.IO.Stream**| stream | 
 **overwriteMode** | **string**| overwriteMode | [optional] 

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
> List<ObjectInfoResponse> ListObjects (string containerId, string objectPath)

List objects in path

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
                List&lt;ObjectInfoResponse&gt; result = apiInstance.ListObjects(containerId, objectPath);
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

[**List<ObjectInfoResponse>**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listobjectsinfolder"></a>
# **ListObjectsInFolder**
> List<ObjectInfoResponse> ListObjectsInFolder (string containerId)

List objects in path

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class ListObjectsInFolderExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId

            try
            {
                // List objects in path
                List&lt;ObjectInfoResponse&gt; result = apiInstance.ListObjectsInFolder(containerId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.ListObjectsInFolder: " + e.Message );
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

[**List<ObjectInfoResponse>**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listobjectsinfolder1"></a>
# **ListObjectsInFolder1**
> List<ObjectInfoResponse> ListObjectsInFolder1 (string containerId)

List objects in path

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class ListObjectsInFolder1Example
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId

            try
            {
                // List objects in path
                List&lt;ObjectInfoResponse&gt; result = apiInstance.ListObjectsInFolder1(containerId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.ListObjectsInFolder1: " + e.Message );
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

[**List<ObjectInfoResponse>**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listobjectsinfolder2"></a>
# **ListObjectsInFolder2**
> List<ObjectInfoResponse> ListObjectsInFolder2 (string containerId)

List objects in path

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Model;

namespace Example
{
    public class ListObjectsInFolder2Example
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new StorageApi();
            var containerId = containerId_example;  // string | containerId

            try
            {
                // List objects in path
                List&lt;ObjectInfoResponse&gt; result = apiInstance.ListObjectsInFolder2(containerId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageApi.ListObjectsInFolder2: " + e.Message );
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

[**List<ObjectInfoResponse>**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
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

