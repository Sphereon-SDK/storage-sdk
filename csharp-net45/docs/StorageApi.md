# Sphereon.SDK.Storage.Api.StorageApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateBackend**](StorageApi.md#createbackend) | **POST** /bucket-storage/0.6.0/backends | Create a new backend
[**CreateContainer**](StorageApi.md#createcontainer) | **POST** /bucket-storage/0.6.0/containers | Create a new container
[**CreateObject**](StorageApi.md#createobject) | **POST** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Create a new object within a container
[**DeleteBackend**](StorageApi.md#deletebackend) | **DELETE** /bucket-storage/0.6.0/backends/{backendId} | Delete a backend
[**DeleteContainer**](StorageApi.md#deletecontainer) | **DELETE** /bucket-storage/0.6.0/containers/{containerId} | Delete an existing container
[**DeleteObject**](StorageApi.md#deleteobject) | **DELETE** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
[**GetObject**](StorageApi.md#getobject) | **GET** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Get an existing object from a container
[**UpdateBackend**](StorageApi.md#updatebackend) | **POST** /bucket-storage/0.6.0/backends/{backendId} | Update a backend
[**UpdateContainer**](StorageApi.md#updatecontainer) | **POST** /bucket-storage/0.6.0/containers/{containerId} | Update a container


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
> void CreateObject (string containerId, string objectPath, System.IO.Stream stream)

Create a new object within a container

Create a new object within a container. If the container did not exist yet, it will be created on the fly with a default policy, hence no 404 http status will be returned

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

            try
            {
                // Create a new object within a container
                apiInstance.CreateObject(containerId, objectPath, stream);
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

### Return type

void (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: *_/_*

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

