package com.sphereon.sdk.storage.api;

import com.sphereon.sdk.storage.handler.ApiException;
import com.sphereon.sdk.storage.handler.ApiClient;
import com.sphereon.sdk.storage.handler.Configuration;
import com.sphereon.sdk.storage.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.storage.model.BackendRequest;
import com.sphereon.sdk.storage.model.BackendResponse;
import com.sphereon.sdk.storage.model.ErrorResponse;
import com.sphereon.sdk.storage.model.ContainerResponse;
import com.sphereon.sdk.storage.model.ContainerRequest;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-26T16:23:49.807+02:00")
public class StorageApi {
  private ApiClient apiClient;

  public StorageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StorageApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new backend
   * Create a new backend
   * @param backendRequest backendRequest (required)
   * @return BackendResponse
   * @throws ApiException if fails to make API call
   */
  public BackendResponse createBackend(BackendRequest backendRequest) throws ApiException {
    Object localVarPostBody = backendRequest;
    
    // verify the required parameter 'backendRequest' is set
    if (backendRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'backendRequest' when calling createBackend");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/backends".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<BackendResponse> localVarReturnType = new GenericType<BackendResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new container
   * Create a new container
   * @param containerRequest containerRequest (required)
   * @return ContainerResponse
   * @throws ApiException if fails to make API call
   */
  public ContainerResponse createContainer(ContainerRequest containerRequest) throws ApiException {
    Object localVarPostBody = containerRequest;
    
    // verify the required parameter 'containerRequest' is set
    if (containerRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'containerRequest' when calling createContainer");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/containers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ContainerResponse> localVarReturnType = new GenericType<ContainerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new object within a container
   * Create a new object within a container. If the container did not exist yet, it will be created on the fly with a default policy, hence no 404 http status will be returned
   * @param containerId containerId (required)
   * @param objectPath objectPath (required)
   * @param stream stream (required)
   * @throws ApiException if fails to make API call
   */
  public void createObject(String containerId, String objectPath, File stream) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'containerId' is set
    if (containerId == null) {
      throw new ApiException(400, "Missing the required parameter 'containerId' when calling createObject");
    }
    
    // verify the required parameter 'objectPath' is set
    if (objectPath == null) {
      throw new ApiException(400, "Missing the required parameter 'objectPath' when calling createObject");
    }
    
    // verify the required parameter 'stream' is set
    if (stream == null) {
      throw new ApiException(400, "Missing the required parameter 'stream' when calling createObject");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()))
      .replaceAll("\\{" + "objectPath" + "\\}", apiClient.escapeString(objectPath.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (stream != null)
      localVarFormParams.put("stream", stream);

    final String[] localVarAccepts = {
      "*_/_*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a backend
   * Delete a backend
   * @param backendId backendId (required)
   * @return BackendResponse
   * @throws ApiException if fails to make API call
   */
  public BackendResponse deleteBackend(String backendId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'backendId' is set
    if (backendId == null) {
      throw new ApiException(400, "Missing the required parameter 'backendId' when calling deleteBackend");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/backends/{backendId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "backendId" + "\\}", apiClient.escapeString(backendId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<BackendResponse> localVarReturnType = new GenericType<BackendResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an existing container
   * Delete an existing container including the stored objects if indicated.
   * @param containerId containerId (required)
   * @param delete delete (optional)
   * @return ContainerResponse
   * @throws ApiException if fails to make API call
   */
  public ContainerResponse deleteContainer(String containerId, String delete) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'containerId' is set
    if (containerId == null) {
      throw new ApiException(400, "Missing the required parameter 'containerId' when calling deleteContainer");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/containers/{containerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete", delete));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ContainerResponse> localVarReturnType = new GenericType<ContainerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an existing object from a container.
   * Delete an existing object from a container. There is no request nor response body for a delete request.
   * @param containerId containerId (required)
   * @param objectPath objectPath (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteObject(String containerId, String objectPath) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'containerId' is set
    if (containerId == null) {
      throw new ApiException(400, "Missing the required parameter 'containerId' when calling deleteObject");
    }
    
    // verify the required parameter 'objectPath' is set
    if (objectPath == null) {
      throw new ApiException(400, "Missing the required parameter 'objectPath' when calling deleteObject");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()))
      .replaceAll("\\{" + "objectPath" + "\\}", apiClient.escapeString(objectPath.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*_/_*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get an existing object from a container
   * Get an existing object from a container
   * @param containerId containerId (required)
   * @param objectPath objectPath (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getObject(String containerId, String objectPath) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'containerId' is set
    if (containerId == null) {
      throw new ApiException(400, "Missing the required parameter 'containerId' when calling getObject");
    }
    
    // verify the required parameter 'objectPath' is set
    if (objectPath == null) {
      throw new ApiException(400, "Missing the required parameter 'objectPath' when calling getObject");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()))
      .replaceAll("\\{" + "objectPath" + "\\}", apiClient.escapeString(objectPath.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/octet-stream", "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a backend
   * Update a backend
   * @param backendId backendId (required)
   * @param backendRequest backendRequest (required)
   * @return BackendResponse
   * @throws ApiException if fails to make API call
   */
  public BackendResponse updateBackend(String backendId, BackendRequest backendRequest) throws ApiException {
    Object localVarPostBody = backendRequest;
    
    // verify the required parameter 'backendId' is set
    if (backendId == null) {
      throw new ApiException(400, "Missing the required parameter 'backendId' when calling updateBackend");
    }
    
    // verify the required parameter 'backendRequest' is set
    if (backendRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'backendRequest' when calling updateBackend");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/backends/{backendId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "backendId" + "\\}", apiClient.escapeString(backendId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<BackendResponse> localVarReturnType = new GenericType<BackendResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a container
   * Update an existing container with new container settings
   * @param containerId containerId (required)
   * @param containerRequest containerRequest (required)
   * @return ContainerResponse
   * @throws ApiException if fails to make API call
   */
  public ContainerResponse updateContainer(String containerId, ContainerRequest containerRequest) throws ApiException {
    Object localVarPostBody = containerRequest;
    
    // verify the required parameter 'containerId' is set
    if (containerId == null) {
      throw new ApiException(400, "Missing the required parameter 'containerId' when calling updateContainer");
    }
    
    // verify the required parameter 'containerRequest' is set
    if (containerRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'containerRequest' when calling updateContainer");
    }
    
    // create path and map variables
    String localVarPath = "/bucket-storage/0.6.0/containers/{containerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ContainerResponse> localVarReturnType = new GenericType<ContainerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
