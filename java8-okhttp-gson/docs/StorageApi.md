# StorageApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/bucket-storage/0.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](StorageApi.md#createBackend) | **POST** /backends | Create a new backend
[**createContainer**](StorageApi.md#createContainer) | **POST** /containers | Create a new container
[**createStreamUsingPath**](StorageApi.md#createStreamUsingPath) | **POST** /streams/path/{containerId}/{path} | Create a new stream within a container
[**deleteBackend**](StorageApi.md#deleteBackend) | **DELETE** /backends/{backendId} | Delete a backend
[**deleteContainer**](StorageApi.md#deleteContainer) | **DELETE** /containers/{containerId} | Delete an existing container
[**deleteStreamUsingLocation**](StorageApi.md#deleteStreamUsingLocation) | **DELETE** /streams/location | Delete an existing stream from a container by stream location.
[**deleteStreamUsingPath**](StorageApi.md#deleteStreamUsingPath) | **DELETE** /streams/path/{containerId}/{path} | Delete an existing stream from a container.
[**getBackendInfo**](StorageApi.md#getBackendInfo) | **GET** /backends/{backendId} | Get backend information
[**getContainer**](StorageApi.md#getContainer) | **GET** /containers/{containerId} | Get container information
[**getStreamUsingLocation**](StorageApi.md#getStreamUsingLocation) | **POST** /streams/location | Get an existing stream from a container by stream location
[**getStreamUsingPath**](StorageApi.md#getStreamUsingPath) | **GET** /streams/path/{containerId}/{path} | Get an stream from a container
[**listInfoUsingLocation**](StorageApi.md#listInfoUsingLocation) | **POST** /info/location | List streams in path by stream location
[**listInfoUsingPath**](StorageApi.md#listInfoUsingPath) | **GET** /info/path/{containerId}/{path} | List streams in path
[**listInfoUsingRoot**](StorageApi.md#listInfoUsingRoot) | **GET** /info/path/{containerId}/ | List streams in root
[**updateBackend**](StorageApi.md#updateBackend) | **PUT** /backends/{backendId} | Update a backend
[**updateContainer**](StorageApi.md#updateContainer) | **PUT** /containers/{containerId} | Update a container
[**updateStreamUsingPath**](StorageApi.md#updateStreamUsingPath) | **PUT** /streams/path/{containerId}/{path} | Update stream within a container


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

<a name="createStreamUsingPath"></a>
# **createStreamUsingPath**
> StreamResponse createStreamUsingPath(containerId, path, stream, propagationType)

Create a new stream within a container

Create a new stream within a container. Query parameter creationMode accepts values NEW_ONLY to create a new stream, REQUIRE_EXISTING to update an stream and ALLOW_EXISTING to create a new stream or overwrite an existing stream.

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
String path = "path_example"; // String | path
File stream = new File("/path/to/file.txt"); // File | stream
String propagationType = "propagationType_example"; // String | propagationType
try {
    StreamResponse result = apiInstance.createStreamUsingPath(containerId, path, stream, propagationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createStreamUsingPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **path** | **String**| path |
 **stream** | **File**| stream |
 **propagationType** | **String**| propagationType | [optional] [enum: NO, REQUIRE, ALLOW]

### Return type

[**StreamResponse**](StreamResponse.md)

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

Delete an existing container including the stored streams if indicated.

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

<a name="deleteStreamUsingLocation"></a>
# **deleteStreamUsingLocation**
> deleteStreamUsingLocation(streamLocation)

Delete an existing stream from a container by stream location.

Delete an existing stream from a container by stream location. There is no request nor response body for a delete request.

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
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    apiInstance.deleteStreamUsingLocation(streamLocation);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteStreamUsingLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: *_/_*

<a name="deleteStreamUsingPath"></a>
# **deleteStreamUsingPath**
> deleteStreamUsingPath(containerId, path)

Delete an existing stream from a container.

Delete an existing stream from a container. There is no request nor response body for a delete request.

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
String path = "path_example"; // String | path
try {
    apiInstance.deleteStreamUsingPath(containerId, path);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteStreamUsingPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **path** | **String**| path |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="getBackendInfo"></a>
# **getBackendInfo**
> BackendResponse getBackendInfo(backendId, credentials)

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
String credentials = "credentials_example"; // String | credentials
try {
    BackendResponse result = apiInstance.getBackendInfo(backendId, credentials);
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
 **credentials** | **String**| credentials | [optional] [enum: OMIT, INCLUDE]

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getContainer"></a>
# **getContainer**
> ContainerResponse getContainer(containerId)

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
    ContainerResponse result = apiInstance.getContainer(containerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getContainer");
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

<a name="getStreamUsingLocation"></a>
# **getStreamUsingLocation**
> byte[] getStreamUsingLocation(streamLocation)

Get an existing stream from a container by stream location

Get an existing stream from a container by stream location

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
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    byte[] result = apiInstance.getStreamUsingLocation(streamLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getStreamUsingLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation |

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/octet-stream, application/json;charset=UTF-8

<a name="getStreamUsingPath"></a>
# **getStreamUsingPath**
> byte[] getStreamUsingPath(containerId, path)

Get an stream from a container

Get an existing stream from a container

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
String path = "path_example"; // String | path
try {
    byte[] result = apiInstance.getStreamUsingPath(containerId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getStreamUsingPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **path** | **String**| path |

### Return type

**byte[]**

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json;charset=UTF-8

<a name="listInfoUsingLocation"></a>
# **listInfoUsingLocation**
> InfoResponse listInfoUsingLocation(streamLocation)

List streams in path by stream location

Returns stream informations on the given stream location. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

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
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    InfoResponse result = apiInstance.listInfoUsingLocation(streamLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listInfoUsingLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| streamLocation |

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json

<a name="listInfoUsingPath"></a>
# **listInfoUsingPath**
> InfoResponse listInfoUsingPath(containerId, path)

List streams in path

Returns streams information on the given path. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

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
String path = "path_example"; // String | path
try {
    InfoResponse result = apiInstance.listInfoUsingPath(containerId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listInfoUsingPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **path** | **String**| path |

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listInfoUsingRoot"></a>
# **listInfoUsingRoot**
> InfoResponse listInfoUsingRoot(containerId)

List streams in root

Returns strean information from the root. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.

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
    InfoResponse result = apiInstance.listInfoUsingRoot(containerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listInfoUsingRoot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |

### Return type

[**InfoResponse**](InfoResponse.md)

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

<a name="updateStreamUsingPath"></a>
# **updateStreamUsingPath**
> StreamResponse updateStreamUsingPath(containerId, path, stream)

Update stream within a container

Update stream within a container.

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
String path = "path_example"; // String | path
File stream = new File("/path/to/file.txt"); // File | stream
try {
    StreamResponse result = apiInstance.updateStreamUsingPath(containerId, path, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateStreamUsingPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **path** | **String**| path |
 **stream** | **File**| stream |

### Return type

[**StreamResponse**](StreamResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

