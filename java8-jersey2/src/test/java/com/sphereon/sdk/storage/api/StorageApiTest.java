/*
 * Storage
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.8
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.storage.api;

import com.sphereon.sdk.storage.handler.ApiException;
import com.sphereon.sdk.storage.model.BackendRequest;
import com.sphereon.sdk.storage.model.BackendResponse;
import com.sphereon.sdk.storage.model.ContainerRequest;
import com.sphereon.sdk.storage.model.ContainerResponse;
import com.sphereon.sdk.storage.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.storage.model.InfoResponse;
import com.sphereon.sdk.storage.model.StreamLocation;
import com.sphereon.sdk.storage.model.StreamResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorageApi
 */
@Ignore
public class StorageApiTest {

    private final StorageApi api = new StorageApi();

    
    /**
     * Create a new backend
     *
     * Create a new backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBackendTest() throws ApiException {
        BackendRequest backendRequest = null;
        BackendResponse response = api.createBackend(backendRequest);

        // TODO: test validations
    }
    
    /**
     * Create a new container
     *
     * Create a new container
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContainerTest() throws ApiException {
        ContainerRequest containerRequest = null;
        ContainerResponse response = api.createContainer(containerRequest);

        // TODO: test validations
    }
    
    /**
     * Create a new stream within a container
     *
     * Create a new stream within a container. Query parameter creationMode accepts values NEW_ONLY to create a new stream, REQUIRE_EXISTING to update an stream and ALLOW_EXISTING to create a new stream or overwrite an existing stream.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createStreamUsingPathTest() throws ApiException {
        String containerId = null;
        String path = null;
        File stream = null;
        String propagationType = null;
        StreamResponse response = api.createStreamUsingPath(containerId, path, stream, propagationType);

        // TODO: test validations
    }
    
    /**
     * Delete a backend
     *
     * Delete a backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBackendTest() throws ApiException {
        String backendId = null;
        BackendResponse response = api.deleteBackend(backendId);

        // TODO: test validations
    }
    
    /**
     * Delete an existing container
     *
     * Delete an existing container including the stored streams if indicated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContainerTest() throws ApiException {
        String containerId = null;
        String delete = null;
        ContainerResponse response = api.deleteContainer(containerId, delete);

        // TODO: test validations
    }
    
    /**
     * Delete an existing stream from a container by stream location.
     *
     * Delete an existing stream from a container by stream location. There is no request nor response body for a delete request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStreamUsingLocationTest() throws ApiException {
        StreamLocation streamLocation = null;
        api.deleteStreamUsingLocation(streamLocation);

        // TODO: test validations
    }
    
    /**
     * Delete an existing stream from a container.
     *
     * Delete an existing stream from a container. There is no request nor response body for a delete request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStreamUsingPathTest() throws ApiException {
        String containerId = null;
        String path = null;
        api.deleteStreamUsingPath(containerId, path);

        // TODO: test validations
    }
    
    /**
     * Get backend information
     *
     * Get information on a backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBackendInfoTest() throws ApiException {
        String backendId = null;
        String credentials = null;
        BackendResponse response = api.getBackendInfo(backendId, credentials);

        // TODO: test validations
    }
    
    /**
     * Get container information
     *
     * Get information on a container
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContainerTest() throws ApiException {
        String containerId = null;
        ContainerResponse response = api.getContainer(containerId);

        // TODO: test validations
    }
    
    /**
     * Get an existing stream from a container by stream location
     *
     * Get an existing stream from a container by stream location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStreamUsingLocationTest() throws ApiException {
        StreamLocation streamLocation = null;
        byte[] response = api.getStreamUsingLocation(streamLocation);

        // TODO: test validations
    }
    
    /**
     * Get an stream from a container
     *
     * Get an existing stream from a container
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStreamUsingPathTest() throws ApiException {
        String containerId = null;
        String path = null;
        byte[] response = api.getStreamUsingPath(containerId, path);

        // TODO: test validations
    }
    
    /**
     * List streams in path by stream location
     *
     * Returns stream informations on the given stream location. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInfoUsingLocationTest() throws ApiException {
        StreamLocation streamLocation = null;
        InfoResponse response = api.listInfoUsingLocation(streamLocation);

        // TODO: test validations
    }
    
    /**
     * List streams in path
     *
     * Returns streams information on the given path. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInfoUsingPathTest() throws ApiException {
        String containerId = null;
        String path = null;
        InfoResponse response = api.listInfoUsingPath(containerId, path);

        // TODO: test validations
    }
    
    /**
     * List streams in root
     *
     * Returns strean information from the root. When the path points to a file (and if the file exists,) a StreamInfo record of that single file will be returned. When the path points to a folder, the StreamInfo records of all files in that folder will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInfoUsingRootTest() throws ApiException {
        String containerId = null;
        InfoResponse response = api.listInfoUsingRoot(containerId);

        // TODO: test validations
    }
    
    /**
     * Update a backend
     *
     * Update a backend
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBackendTest() throws ApiException {
        String backendId = null;
        BackendRequest backendRequest = null;
        BackendResponse response = api.updateBackend(backendId, backendRequest);

        // TODO: test validations
    }
    
    /**
     * Update a container
     *
     * Update an existing container with new container settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContainerTest() throws ApiException {
        String containerId = null;
        ContainerRequest containerRequest = null;
        ContainerResponse response = api.updateContainer(containerId, containerRequest);

        // TODO: test validations
    }
    
    /**
     * Update stream within a container
     *
     * Update stream within a container.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStreamUsingPathTest() throws ApiException {
        String containerId = null;
        String path = null;
        File stream = null;
        StreamResponse response = api.updateStreamUsingPath(containerId, path, stream);

        // TODO: test validations
    }
    
}
