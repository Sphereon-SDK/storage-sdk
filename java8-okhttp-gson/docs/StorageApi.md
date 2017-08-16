# StorageApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](StorageApi.md#createBackend) | **POST** /bucket-storage/0.7/backends | Create a new backend
[**createContainer**](StorageApi.md#createContainer) | **POST** /bucket-storage/0.7/containers | Create a new container
[**createObject**](StorageApi.md#createObject) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Create a new object within a container
[**createObjectInFolder**](StorageApi.md#createObjectInFolder) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/** | Create a new object within a container
[**createObjectInFolder1**](StorageApi.md#createObjectInFolder1) | **POST** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath}/** | Create a new object within a container
[**deleteBackend**](StorageApi.md#deleteBackend) | **DELETE** /bucket-storage/0.7/backends/{backendId} | Delete a backend
[**deleteContainer**](StorageApi.md#deleteContainer) | **DELETE** /bucket-storage/0.7/containers/{containerId} | Delete an existing container
[**deleteObject**](StorageApi.md#deleteObject) | **DELETE** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
[**getBackendInfo**](StorageApi.md#getBackendInfo) | **GET** /bucket-storage/0.7/backends/{backendId} | Get backend information
[**getContainerInfo**](StorageApi.md#getContainerInfo) | **GET** /bucket-storage/0.7/containers/{containerId} | Get container information
[**getObject**](StorageApi.md#getObject) | **GET** /bucket-storage/0.7/containers/{containerId}/objects/{objectPath} | Get an existing object from a container
[**listContainers**](StorageApi.md#listContainers) | **GET** /bucket-storage/0.7/backends/{backendId}/containers | List containers
[**listObjects**](StorageApi.md#listObjects) | **GET** /bucket-storage/0.7/containers/{containerId}/list/{objectPath} | List objects in path
[**listObjectsInFolder**](StorageApi.md#listObjectsInFolder) | **GET** /bucket-storage/0.7/containers/{containerId}/list | List objects in path
[**listObjectsInFolder1**](StorageApi.md#listObjectsInFolder1) | **GET** /bucket-storage/0.7/containers/{containerId}/list/** | List objects in path
[**listObjectsInFolder2**](StorageApi.md#listObjectsInFolder2) | **GET** /bucket-storage/0.7/containers/{containerId}/list/{objectPath}/** | List objects in path
[**updateBackend**](StorageApi.md#updateBackend) | **POST** /bucket-storage/0.7/backends/{backendId} | Update a backend
[**updateContainer**](StorageApi.md#updateContainer) | **POST** /bucket-storage/0.7/containers/{containerId} | Update a container


<a name="createBackend"></a>
# **createBackend**
> BackendResponse createBackend(backendRequest)

Create a new backend

Create a new backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
BackendRequest backendRequest = new BackendRequest(); // BackendRequest | backendRequest
try {
    BackendResponse result = apiInstance.createBackend(backendRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createBackend");
    e.printStackTrace();
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

<a name="createContainer"></a>
# **createContainer**
> ContainerResponse createContainer(containerRequest)

Create a new container

Create a new container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
ContainerRequest containerRequest = new ContainerRequest(); // ContainerRequest | containerRequest
try {
    ContainerResponse result = apiInstance.createContainer(containerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createContainer");
    e.printStackTrace();
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

<a name="createObject"></a>
# **createObject**
> ObjectResponse createObject(containerId, objectPath, stream, overwrite)

Create a new object within a container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String objectPath = "objectPath_example"; // String | objectPath
File stream = new File("/path/to/file.txt"); // File | stream
Boolean overwrite = true; // Boolean | overwrite
try {
    ObjectResponse result = apiInstance.createObject(containerId, objectPath, stream, overwrite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **objectPath** | **String**| objectPath |
 **stream** | **File**| stream |
 **overwrite** | **Boolean**| overwrite | [optional]

### Return type

[**ObjectResponse**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createObjectInFolder"></a>
# **createObjectInFolder**
> ObjectResponse createObjectInFolder(containerId, stream, overwrite)

Create a new object within a container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
File stream = new File("/path/to/file.txt"); // File | stream
Boolean overwrite = true; // Boolean | overwrite
try {
    ObjectResponse result = apiInstance.createObjectInFolder(containerId, stream, overwrite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createObjectInFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **stream** | **File**| stream |
 **overwrite** | **Boolean**| overwrite | [optional]

### Return type

[**ObjectResponse**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createObjectInFolder1"></a>
# **createObjectInFolder1**
> ObjectResponse createObjectInFolder1(containerId, stream, overwrite)

Create a new object within a container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
File stream = new File("/path/to/file.txt"); // File | stream
Boolean overwrite = true; // Boolean | overwrite
try {
    ObjectResponse result = apiInstance.createObjectInFolder1(containerId, stream, overwrite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createObjectInFolder1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **stream** | **File**| stream |
 **overwrite** | **Boolean**| overwrite | [optional]

### Return type

[**ObjectResponse**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteBackend"></a>
# **deleteBackend**
> BackendResponse deleteBackend(backendId)

Delete a backend

Delete a backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String backendId = "backendId_example"; // String | backendId
try {
    BackendResponse result = apiInstance.deleteBackend(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteContainer"></a>
# **deleteContainer**
> ContainerResponse deleteContainer(containerId, delete)

Delete an existing container

Delete an existing container including the stored objects if indicated.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String delete = "delete_example"; // String | delete
try {
    ContainerResponse result = apiInstance.deleteContainer(containerId, delete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **delete** | **String**| delete | [optional] [enum: RECURSIVE, EMPTY_ONLY]

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteObject"></a>
# **deleteObject**
> deleteObject(containerId, objectPath)

Delete an existing object from a container.

Delete an existing object from a container. There is no request nor response body for a delete request.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String objectPath = "objectPath_example"; // String | objectPath
try {
    apiInstance.deleteObject(containerId, objectPath);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **objectPath** | **String**| objectPath |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="getBackendInfo"></a>
# **getBackendInfo**
> BackendResponse getBackendInfo(backendId)

Get backend information

Get information on a backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String backendId = "backendId_example"; // String | backendId
try {
    BackendResponse result = apiInstance.getBackendInfo(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getBackendInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getContainerInfo"></a>
# **getContainerInfo**
> ContainerResponse getContainerInfo(containerId)

Get container information

Get information on a container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
try {
    ContainerResponse result = apiInstance.getContainerInfo(containerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getContainerInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getObject"></a>
# **getObject**
> byte[] getObject(containerId, objectPath)

Get an existing object from a container

Get an existing object from a container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String objectPath = "objectPath_example"; // String | objectPath
try {
    byte[] result = apiInstance.getObject(containerId, objectPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **objectPath** | **String**| objectPath |

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json;charset=UTF-8

<a name="listContainers"></a>
# **listContainers**
> List&lt;ContainerResponse&gt; listContainers(backendId)

List containers

List containers for the given backend name or id.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String backendId = "backendId_example"; // String | backendId
try {
    List<ContainerResponse> result = apiInstance.listContainers(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listContainers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |

### Return type

[**List&lt;ContainerResponse&gt;**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="listObjects"></a>
# **listObjects**
> List&lt;ObjectResponse&gt; listObjects(containerId, objectPath)

List objects in path

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String objectPath = "objectPath_example"; // String | objectPath
try {
    List<ObjectResponse> result = apiInstance.listObjects(containerId, objectPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **objectPath** | **String**| objectPath |

### Return type

[**List&lt;ObjectResponse&gt;**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listObjectsInFolder"></a>
# **listObjectsInFolder**
> List&lt;ObjectResponse&gt; listObjectsInFolder(containerId)

List objects in path

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
try {
    List<ObjectResponse> result = apiInstance.listObjectsInFolder(containerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listObjectsInFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |

### Return type

[**List&lt;ObjectResponse&gt;**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listObjectsInFolder1"></a>
# **listObjectsInFolder1**
> List&lt;ObjectResponse&gt; listObjectsInFolder1(containerId)

List objects in path

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
try {
    List<ObjectResponse> result = apiInstance.listObjectsInFolder1(containerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listObjectsInFolder1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |

### Return type

[**List&lt;ObjectResponse&gt;**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listObjectsInFolder2"></a>
# **listObjectsInFolder2**
> List&lt;ObjectResponse&gt; listObjectsInFolder2(containerId)

List objects in path

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
try {
    List<ObjectResponse> result = apiInstance.listObjectsInFolder2(containerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listObjectsInFolder2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |

### Return type

[**List&lt;ObjectResponse&gt;**](ObjectResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBackend"></a>
# **updateBackend**
> BackendResponse updateBackend(backendId, backendRequest)

Update a backend

Update a backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String backendId = "backendId_example"; // String | backendId
BackendRequest backendRequest = new BackendRequest(); // BackendRequest | backendRequest
try {
    BackendResponse result = apiInstance.updateBackend(backendId, backendRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |
 **backendRequest** | [**BackendRequest**](BackendRequest.md)| backendRequest |

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateContainer"></a>
# **updateContainer**
> ContainerResponse updateContainer(containerId, containerRequest)

Update a container

Update an existing container with new container settings

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
ContainerRequest containerRequest = new ContainerRequest(); // ContainerRequest | containerRequest
try {
    ContainerResponse result = apiInstance.updateContainer(containerId, containerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **containerRequest** | [**ContainerRequest**](ContainerRequest.md)| containerRequest |

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

