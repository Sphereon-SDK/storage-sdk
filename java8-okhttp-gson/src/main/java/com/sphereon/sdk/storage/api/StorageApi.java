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
import com.sphereon.sdk.storage.model.StreamLocation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * Build call for deleteStreamUsingLocation
     * @param streamLocation streamLocation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteStreamUsingLocationCall(StreamLocation streamLocation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = streamLocation;
        
        // create path and map variables
        String localVarPath = "/streams/location";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteStreamUsingLocationValidateBeforeCall(StreamLocation streamLocation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'streamLocation' is set
        if (streamLocation == null) {
            throw new ApiException("Missing the required parameter 'streamLocation' when calling deleteStreamUsingLocation(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteStreamUsingLocationCall(streamLocation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete existing stream
     * Delete an existing stream from a container by stream location. There is no response body for a delete operation.
     * @param streamLocation streamLocation (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteStreamUsingLocation(StreamLocation streamLocation) throws ApiException {
        deleteStreamUsingLocationWithHttpInfo(streamLocation);
    }

    /**
     * Delete existing stream
     * Delete an existing stream from a container by stream location. There is no response body for a delete operation.
     * @param streamLocation streamLocation (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteStreamUsingLocationWithHttpInfo(StreamLocation streamLocation) throws ApiException {
        com.squareup.okhttp.Call call = deleteStreamUsingLocationValidateBeforeCall(streamLocation, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete existing stream (asynchronously)
     * Delete an existing stream from a container by stream location. There is no response body for a delete operation.
     * @param streamLocation streamLocation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteStreamUsingLocationAsync(StreamLocation streamLocation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteStreamUsingLocationValidateBeforeCall(streamLocation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}