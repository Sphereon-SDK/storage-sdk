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


import com.sphereon.sdk.storage.model.ErrorResponse;
import com.sphereon.sdk.storage.model.InfoResponse;
import com.sphereon.sdk.storage.model.StreamLocation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoApi {
    private ApiClient apiClient;

    public InfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listInfoUsingLocation
     * @param streamLocation streamLocation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listInfoUsingLocationCall(StreamLocation streamLocation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = streamLocation;
        
        // create path and map variables
        String localVarPath = "/info/location";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call listInfoUsingLocationValidateBeforeCall(StreamLocation streamLocation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'streamLocation' is set
        if (streamLocation == null) {
            throw new ApiException("Missing the required parameter 'streamLocation' when calling listInfoUsingLocation(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listInfoUsingLocationCall(streamLocation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List streams from location
     * Returns Stream(s) information from the given Stream Location. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param streamLocation streamLocation (required)
     * @return InfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InfoResponse listInfoUsingLocation(StreamLocation streamLocation) throws ApiException {
        ApiResponse<InfoResponse> resp = listInfoUsingLocationWithHttpInfo(streamLocation);
        return resp.getData();
    }

    /**
     * List streams from location
     * Returns Stream(s) information from the given Stream Location. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param streamLocation streamLocation (required)
     * @return ApiResponse&lt;InfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InfoResponse> listInfoUsingLocationWithHttpInfo(StreamLocation streamLocation) throws ApiException {
        com.squareup.okhttp.Call call = listInfoUsingLocationValidateBeforeCall(streamLocation, null, null);
        Type localVarReturnType = new TypeToken<InfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List streams from location (asynchronously)
     * Returns Stream(s) information from the given Stream Location. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param streamLocation streamLocation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listInfoUsingLocationAsync(StreamLocation streamLocation, final ApiCallback<InfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listInfoUsingLocationValidateBeforeCall(streamLocation, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listInfoUsingPath
     * @param containerId containerId (required)
     * @param path path (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listInfoUsingPathCall(String containerId, String path, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/info/path/{containerId}/{path}"
            .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()))
            .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call listInfoUsingPathValidateBeforeCall(String containerId, String path, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'containerId' is set
        if (containerId == null) {
            throw new ApiException("Missing the required parameter 'containerId' when calling listInfoUsingPath(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling listInfoUsingPath(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listInfoUsingPathCall(containerId, path, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List streams in path
     * Returns Stream(s) information on the given path. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param containerId containerId (required)
     * @param path path (required)
     * @return InfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InfoResponse listInfoUsingPath(String containerId, String path) throws ApiException {
        ApiResponse<InfoResponse> resp = listInfoUsingPathWithHttpInfo(containerId, path);
        return resp.getData();
    }

    /**
     * List streams in path
     * Returns Stream(s) information on the given path. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param containerId containerId (required)
     * @param path path (required)
     * @return ApiResponse&lt;InfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InfoResponse> listInfoUsingPathWithHttpInfo(String containerId, String path) throws ApiException {
        com.squareup.okhttp.Call call = listInfoUsingPathValidateBeforeCall(containerId, path, null, null);
        Type localVarReturnType = new TypeToken<InfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List streams in path (asynchronously)
     * Returns Stream(s) information on the given path. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param containerId containerId (required)
     * @param path path (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listInfoUsingPathAsync(String containerId, String path, final ApiCallback<InfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listInfoUsingPathValidateBeforeCall(containerId, path, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listInfoUsingRootPath
     * @param containerId containerId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listInfoUsingRootPathCall(String containerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/info/path/{containerId}/"
            .replaceAll("\\{" + "containerId" + "\\}", apiClient.escapeString(containerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call listInfoUsingRootPathValidateBeforeCall(String containerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'containerId' is set
        if (containerId == null) {
            throw new ApiException("Missing the required parameter 'containerId' when calling listInfoUsingRootPath(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listInfoUsingRootPathCall(containerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List streams in root path
     * Returns Stream(s) information from the root. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param containerId containerId (required)
     * @return InfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InfoResponse listInfoUsingRootPath(String containerId) throws ApiException {
        ApiResponse<InfoResponse> resp = listInfoUsingRootPathWithHttpInfo(containerId);
        return resp.getData();
    }

    /**
     * List streams in root path
     * Returns Stream(s) information from the root. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param containerId containerId (required)
     * @return ApiResponse&lt;InfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InfoResponse> listInfoUsingRootPathWithHttpInfo(String containerId) throws ApiException {
        com.squareup.okhttp.Call call = listInfoUsingRootPathValidateBeforeCall(containerId, null, null);
        Type localVarReturnType = new TypeToken<InfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List streams in root path (asynchronously)
     * Returns Stream(s) information from the root. When the path points to a file and if the file exists, a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     * @param containerId containerId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listInfoUsingRootPathAsync(String containerId, final ApiCallback<InfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listInfoUsingRootPathValidateBeforeCall(containerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}