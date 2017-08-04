package com.sphereon.sdk.storage.api;

import com.sphereon.sdk.storage.handler.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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

public interface StorageApi {
  /**
   * Create a new backend
   * Create a new backend
   * @param backendRequest backendRequest (required)
   * @return Call&lt;BackendResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("bucket-storage/0.7/backends")
  Call<BackendResponse> createBackend(
    @retrofit2.http.Body BackendRequest backendRequest
  );

  /**
   * Create a new container
   * Create a new container
   * @param containerRequest containerRequest (required)
   * @return Call&lt;ContainerResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("bucket-storage/0.7/containers")
  Call<ContainerResponse> createContainer(
    @retrofit2.http.Body ContainerRequest containerRequest
  );

  /**
   * Create a new object within a container
   * Create a new object within a container. If the container did not exist yet, it will be created on the fly with a default policy, hence no 404 http status will be returned
   * @param containerId containerId (required)
   * @param objectPath objectPath (required)
   * @param stream stream (required)
   * @return Call&lt;Void&gt;
   */
  
  @retrofit2.http.Multipart
  @POST("bucket-storage/0.7/containers/{containerId}/objects/{objectPath}")
  Call<Void> createObject(
    @retrofit2.http.Path("containerId") String containerId, @retrofit2.http.Path("objectPath") String objectPath, @retrofit2.http.Part("stream\"; filename=\"stream") RequestBody stream
  );

  /**
   * Delete a backend
   * Delete a backend
   * @param backendId backendId (required)
   * @return Call&lt;BackendResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @DELETE("bucket-storage/0.7/backends/{backendId}")
  Call<BackendResponse> deleteBackend(
    @retrofit2.http.Path("backendId") String backendId
  );

  /**
   * Delete an existing container
   * Delete an existing container including the stored objects if indicated.
   * @param containerId containerId (required)
   * @param delete delete (optional)
   * @return Call&lt;ContainerResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @DELETE("bucket-storage/0.7/containers/{containerId}")
  Call<ContainerResponse> deleteContainer(
    @retrofit2.http.Path("containerId") String containerId, @retrofit2.http.Query("delete") String delete
  );

  /**
   * Delete an existing object from a container.
   * Delete an existing object from a container. There is no request nor response body for a delete request.
   * @param containerId containerId (required)
   * @param objectPath objectPath (required)
   * @return Call&lt;Void&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @DELETE("bucket-storage/0.7/containers/{containerId}/objects/{objectPath}")
  Call<Void> deleteObject(
    @retrofit2.http.Path("containerId") String containerId, @retrofit2.http.Path("objectPath") String objectPath
  );

  /**
   * Get backend information
   * Get information on a backend
   * @param backendId backendId (required)
   * @return Call&lt;ContainerResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("bucket-storage/0.7/backends/{backendId}")
  Call<ContainerResponse> getBackendInfo(
    @retrofit2.http.Path("backendId") String backendId
  );

  /**
   * Get container information
   * Get information on a container
   * @param containerId containerId (required)
   * @return Call&lt;ContainerResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("bucket-storage/0.7/containers/{containerId}")
  Call<ContainerResponse> getContainerInfo(
    @retrofit2.http.Path("containerId") String containerId
  );

  /**
   * Get an existing object from a container
   * Get an existing object from a container
   * @param containerId containerId (required)
   * @param objectPath objectPath (required)
   * @return Call&lt;byte[]&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("bucket-storage/0.7/containers/{containerId}/objects/{objectPath}")
  Call<byte[]> getObject(
    @retrofit2.http.Path("containerId") String containerId, @retrofit2.http.Path("objectPath") String objectPath
  );

  /**
   * List containers
   * List containers for the given backend name or id.
   * @param backendId backendId (required)
   * @return Call&lt;ContainerResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @GET("bucket-storage/0.7/backends/{backendId}/containers")
  Call<ContainerResponse> listContainers(
    @retrofit2.http.Path("backendId") String backendId
  );

  /**
   * Update a backend
   * Update a backend
   * @param backendId backendId (required)
   * @param backendRequest backendRequest (required)
   * @return Call&lt;BackendResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("bucket-storage/0.7/backends/{backendId}")
  Call<BackendResponse> updateBackend(
    @retrofit2.http.Path("backendId") String backendId, @retrofit2.http.Body BackendRequest backendRequest
  );

  /**
   * Update a container
   * Update an existing container with new container settings
   * @param containerId containerId (required)
   * @param containerRequest containerRequest (required)
   * @return Call&lt;ContainerResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("bucket-storage/0.7/containers/{containerId}")
  Call<ContainerResponse> updateContainer(
    @retrofit2.http.Path("containerId") String containerId, @retrofit2.http.Body ContainerRequest containerRequest
  );

}
