# StorageApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/bucket-storage/0.7*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](StorageApi.md#createBackend) | **POST** /backends | Create a new backend
[**createContainer**](StorageApi.md#createContainer) | **POST** /containers | Create a new container
[**createObject**](StorageApi.md#createObject) | **POST** /containers/{containerId}/objects/{objectPath} | Create a new object within a container
[**deleteBackend**](StorageApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete a backend
[**deleteContainer**](StorageApi.md#deleteContainer) | **DELETE** /containers/{containerId} | Delete an existing container
[**deleteObject**](StorageApi.md#deleteObject) | **DELETE** /containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
[**deleteObject1**](StorageApi.md#deleteObject1) | **DELETE** /containers/{containerId}/objects | Delete an existing object from a container by stream location.
[**getBackendInfo**](StorageApi.md#getBackendInfo) | **GET** /backends/{backendId} | Get backend information
[**getContainerInfo**](StorageApi.md#getContainerInfo) | **GET** /containers/{containerId} | Get container information
[**getObject**](StorageApi.md#getObject) | **GET** /containers/{containerId}/objects/{objectPath} | Get an existing object from a container
[**getObject1**](StorageApi.md#getObject1) | **POST** /containers/{containerId}/objects | Get an existing object from a container by stream location
[**listContainers**](StorageApi.md#listContainers) | **GET** /backends/{backendId}/containers | List containers
[**listObjects**](StorageApi.md#listObjects) | **GET** /containers/{containerId}/info | List objects in path
[**listObjects1**](StorageApi.md#listObjects1) | **GET** /containers/{containerId}/info/{objectPath} | List objects in path
[**listObjects2**](StorageApi.md#listObjects2) | **POST** /containers/{containerId}/info | List objects in path by stream location
[**updateBackend**](StorageApi.md#updateBackend) | **POST** /backends/{backendId} | Update a backend
[**updateContainer**](StorageApi.md#updateContainer) | **POST** /containers/{containerId} | Update a container


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
> ObjectResponse createObject(containerId, objectPath, stream, creationMode)

Create a new object within a container

Create a new object within a container. Query parameter creationMode accepts values NEW_ONLY to create a new object, REQUIRE_EXISTING to update an object and ALLOW_EXISTING to create a new object or overwrite an existing object.

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
String creationMode = "creationMode_example"; // String | creationMode
try {
    ObjectResponse result = apiInstance.createObject(containerId, objectPath, stream, creationMode);
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
 **creationMode** | **String**| creationMode | [optional] [enum: NEW_ONLY, REQUIRE_EXISTING, ALLOW_EXISTING]

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

<a name="deleteObject1"></a>
# **deleteObject1**
> deleteObject1(containerId, streamLocation)

Delete an existing object from a container by stream location.

Delete an existing object from a container by stream location. There is no request nor response body for a delete request.

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
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    apiInstance.deleteObject1(containerId, streamLocation);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteObject1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
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

<a name="getObject1"></a>
# **getObject1**
> byte[] getObject1(containerId, streamLocation)

Get an existing object from a container by stream location

Get an existing object from a container by stream location

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
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    byte[] result = apiInstance.getObject1(containerId, streamLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getObject1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation |

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
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
> ObjectInfoResponse listObjects(containerId, objectPath)

List objects in path

Returns object information on the given path. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

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
    ObjectInfoResponse result = apiInstance.listObjects(containerId, objectPath);
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

[**ObjectInfoResponse**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listObjects1"></a>
# **listObjects1**
> ObjectInfoResponse listObjects1(containerId, objectPath)

List objects in path

Returns object information on the given path. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

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
    ObjectInfoResponse result = apiInstance.listObjects1(containerId, objectPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listObjects1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **objectPath** | **String**| objectPath |

### Return type

[**ObjectInfoResponse**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listObjects2"></a>
# **listObjects2**
> ObjectInfoResponse listObjects2(containerId, streamLocation)

List objects in path by stream location

Returns object information on the given stream location. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

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
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    ObjectInfoResponse result = apiInstance.listObjects2(containerId, streamLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listObjects2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation |

### Return type

[**ObjectInfoResponse**](ObjectInfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
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

