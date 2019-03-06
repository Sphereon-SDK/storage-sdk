/*
 * Storage
 * Sphereon Storage API provides an abstraction layer for storage of (virtual) folders and streams (files/contents) fully agnostic with respect to supported storage backends. This allows for easy uniform access to and manipulation of contents regardless of the content backend being used. Currently the following backends are supported: Sphereon Cloud Storage, Amazon S3, Azure Blob Storage, Google Cloud Storage or one of the Xillio supported content repositories like Documentum, Dropbox etc. For more information about this API please visit https://docs.sphereon.com/api/storage/0.8/
 *
 * OpenAPI spec version: 0.8
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.storage.api;

import com.sphereon.sdk.storage.handler.ApiCallback;
import com.sphereon.sdk.storage.handler.ApiClient;
import com.sphereon.sdk.storage.handler.ApiException;
import com.sphereon.sdk.storage.handler.ApiResponse;
import com.sphereon.sdk.storage.handler.Configuration;
import com.sphereon.sdk.storage.handler.Pair;
import com.sphereon.sdk.storage.handler.ProgressRequestBody;
import com.sphereon.sdk.storage.handler.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sphereon.sdk.storage.model.ContainerRequest;
import com.sphereon.sdk.storage.model.ContainerResponse;
import com.sphereon.sdk.storage.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainerApi {
    private ApiClient apiClient;

    public ContainerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContainerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createContainer
     * @param containerRequest containerRequest (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createContainerCall(ContainerRequest containerRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = containerRequest;
        
        // create path and map variables
        String localVarPath = "/containers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createContainerValidateBeforeCall(ContainerRequest containerRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'containerRequest' is set
        if (containerRequest == null) {
            throw new ApiException("Missing the required parameter 'containerRequest' when calling createContainer(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createContainerCall(containerRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create container
     * Create a new container
     * @param containerRequest containerRequest (required)
     * @return ContainerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContainerResponse createContainer(ContainerRequest containerRequest) throws ApiException {
        ApiResponse<ContainerResponse> resp = createContainerWithHttpInfo(containerRequest);
        return resp.getData();
    }

    /**
     * Create container
     * Create a new container
     * @param containerRequest containerRequest (required)
     * @return ApiResponse&lt;ContainerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContainerResponse> createContainerWithHttpInfo(ContainerRequest containerRequest) throws ApiException {
        com.squareup.okhttp.Call call = createContainerValidateBeforeCall(containerRequest, null, null);
        Type localVarReturnType = new TypeToken<ContainerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create container (asynchronously)
     * Create a new container
     * @param containerRequest containerRequest (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createContainerAsync(ContainerRequest containerRequest, final ApiCallback<ContainerResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createContainerValidateBeforeCall(containerRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContainerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteContainer
     * @param containerId containerId (required)
     * @param delete delete (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteContainerCall(String containerId, String delete, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/containers/{containerId}"
            .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (delete != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete", delete));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteContainerValidateBeforeCall(String containerId, String delete, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'containerId' is set
        if (containerId == null) {
            throw new ApiException("Missing the required parameter 'containerId' when calling deleteContainer(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteContainerCall(containerId, delete, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete container
     * Delete a container Please note that you can delete a container both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant
     * @param containerId containerId (required)
     * @param delete delete (optional)
     * @return ContainerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContainerResponse deleteContainer(String containerId, String delete) throws ApiException {
        ApiResponse<ContainerResponse> resp = deleteContainerWithHttpInfo(containerId, delete);
        return resp.getData();
    }

    /**
     * Delete container
     * Delete a container Please note that you can delete a container both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant
     * @param containerId containerId (required)
     * @param delete delete (optional)
     * @return ApiResponse&lt;ContainerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContainerResponse> deleteContainerWithHttpInfo(String containerId, String delete) throws ApiException {
        com.squareup.okhttp.Call call = deleteContainerValidateBeforeCall(containerId, delete, null, null);
        Type localVarReturnType = new TypeToken<ContainerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete container (asynchronously)
     * Delete a container Please note that you can delete a container both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant
     * @param containerId containerId (required)
     * @param delete delete (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteContainerAsync(String containerId, String delete, final ApiCallback<ContainerResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteContainerValidateBeforeCall(containerId, delete, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContainerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getContainer
     * @param containerId containerId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContainerCall(String containerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/containers/{containerId}"
            .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getContainerValidateBeforeCall(String containerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'containerId' is set
        if (containerId == null) {
            throw new ApiException("Missing the required parameter 'containerId' when calling getContainer(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getContainerCall(containerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get container
     * Get an existing container. Please note that you can retrieve a container both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant
     * @param containerId containerId (required)
     * @return ContainerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContainerResponse getContainer(String containerId) throws ApiException {
        ApiResponse<ContainerResponse> resp = getContainerWithHttpInfo(containerId);
        return resp.getData();
    }

    /**
     * Get container
     * Get an existing container. Please note that you can retrieve a container both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant
     * @param containerId containerId (required)
     * @return ApiResponse&lt;ContainerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContainerResponse> getContainerWithHttpInfo(String containerId) throws ApiException {
        com.squareup.okhttp.Call call = getContainerValidateBeforeCall(containerId, null, null);
        Type localVarReturnType = new TypeToken<ContainerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get container (asynchronously)
     * Get an existing container. Please note that you can retrieve a container both by it&#39;s ID, which is globally unique among tenants and applications, as well as by name, which is unique within an application of a tenant
     * @param containerId containerId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContainerAsync(String containerId, final ApiCallback<ContainerResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getContainerValidateBeforeCall(containerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContainerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateContainer
     * @param containerId containerId (required)
     * @param containerRequest containerRequest (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateContainerCall(String containerId, ContainerRequest containerRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = containerRequest;
        
        // create path and map variables
        String localVarPath = "/containers/{containerId}"
            .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2schema" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateContainerValidateBeforeCall(String containerId, ContainerRequest containerRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'containerId' is set
        if (containerId == null) {
            throw new ApiException("Missing the required parameter 'containerId' when calling updateContainer(Async)");
        }
        
        // verify the required parameter 'containerRequest' is set
        if (containerRequest == null) {
            throw new ApiException("Missing the required parameter 'containerRequest' when calling updateContainer(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateContainerCall(containerId, containerRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update container
     * Update container with new information
     * @param containerId containerId (required)
     * @param containerRequest containerRequest (required)
     * @return ContainerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContainerResponse updateContainer(String containerId, ContainerRequest containerRequest) throws ApiException {
        ApiResponse<ContainerResponse> resp = updateContainerWithHttpInfo(containerId, containerRequest);
        return resp.getData();
    }

    /**
     * Update container
     * Update container with new information
     * @param containerId containerId (required)
     * @param containerRequest containerRequest (required)
     * @return ApiResponse&lt;ContainerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContainerResponse> updateContainerWithHttpInfo(String containerId, ContainerRequest containerRequest) throws ApiException {
        com.squareup.okhttp.Call call = updateContainerValidateBeforeCall(containerId, containerRequest, null, null);
        Type localVarReturnType = new TypeToken<ContainerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update container (asynchronously)
     * Update container with new information
     * @param containerId containerId (required)
     * @param containerRequest containerRequest (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateContainerAsync(String containerId, ContainerRequest containerRequest, final ApiCallback<ContainerResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateContainerValidateBeforeCall(containerId, containerRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContainerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
