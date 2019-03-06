# StreamsApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/bucket-storage/0.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStreamUsingPath**](StreamsApi.md#createStreamUsingPath) | **POST** /streams/path/{containerId}/{path} | Create a new stream
[**deleteStreamUsingPath**](StreamsApi.md#deleteStreamUsingPath) | **DELETE** /streams/path/{containerId}/{path} | Delete existing stream
[**getStreamUsingLocation**](StreamsApi.md#getStreamUsingLocation) | **POST** /streams/location | Get stream
[**getStreamUsingPath**](StreamsApi.md#getStreamUsingPath) | **GET** /streams/path/{containerId}/{path} | Get stream
[**updateStreamUsingPath**](StreamsApi.md#updateStreamUsingPath) | **PUT** /streams/path/{containerId}/{path} | Update existing stream


<a name="createStreamUsingPath"></a>
# **createStreamUsingPath**
> StreamResponse createStreamUsingPath(containerId, path, stream, propagationType)

Create a new stream

Create a new stream within a container. Query parameter creationMode accepts values NEW_ONLY to create a new stream, REQUIRE_EXISTING to update an stream and ALLOW_EXISTING to create a new stream or overwrite an existing stream.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
String containerId = "containerId_example"; // String | containerId
String path = "path_example"; // String | path
File stream = new File("/path/to/file.txt"); // File | stream
String propagationType = "propagationType_example"; // String | propagationType
try {
    StreamResponse result = apiInstance.createStreamUsingPath(containerId, path, stream, propagationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#createStreamUsingPath");
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

<a name="deleteStreamUsingPath"></a>
# **deleteStreamUsingPath**
> deleteStreamUsingPath(containerId, path)

Delete existing stream

Delete stream from a container. There is no request nor response body for a delete operation.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
String containerId = "containerId_example"; // String | containerId
String path = "path_example"; // String | path
try {
    apiInstance.deleteStreamUsingPath(containerId, path);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#deleteStreamUsingPath");
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
 - **Accept**: */*

<a name="getStreamUsingLocation"></a>
# **getStreamUsingLocation**
> byte[] getStreamUsingLocation(streamLocation)

Get stream

Get stream from a container using a StreamLocation

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | streamLocation
try {
    byte[] result = apiInstance.getStreamUsingLocation(streamLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#getStreamUsingLocation");
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

Get stream

Get stream from a container using a path

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
String containerId = "containerId_example"; // String | containerId
String path = "path_example"; // String | path
try {
    byte[] result = apiInstance.getStreamUsingPath(containerId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#getStreamUsingPath");
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

<a name="updateStreamUsingPath"></a>
# **updateStreamUsingPath**
> StreamResponse updateStreamUsingPath(containerId, path, stream)

Update existing stream

Update stream within a container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
String containerId = "containerId_example"; // String | containerId
String path = "path_example"; // String | path
File stream = new File("/path/to/file.txt"); // File | stream
try {
    StreamResponse result = apiInstance.updateStreamUsingPath(containerId, path, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#updateStreamUsingPath");
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

