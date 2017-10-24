/* 
 * Storage
 *
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.7
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Sphereon.SDK.Storage.Client;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Model;

namespace Sphereon.SDK.Storage.Test
{
    /// <summary>
    ///  Class for testing StorageApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class StorageApiTests
    {
        private StorageApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new StorageApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of StorageApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' StorageApi
            //Assert.IsInstanceOfType(typeof(StorageApi), instance, "instance is a StorageApi");
        }

        
        /// <summary>
        /// Test CreateBackend
        /// </summary>
        [Test]
        public void CreateBackendTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //BackendRequest backendRequest = null;
            //var response = instance.CreateBackend(backendRequest);
            //Assert.IsInstanceOf<BackendResponse> (response, "response is BackendResponse");
        }
        
        /// <summary>
        /// Test CreateContainer
        /// </summary>
        [Test]
        public void CreateContainerTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ContainerRequest containerRequest = null;
            //var response = instance.CreateContainer(containerRequest);
            //Assert.IsInstanceOf<ContainerResponse> (response, "response is ContainerResponse");
        }
        
        /// <summary>
        /// Test CreateObject
        /// </summary>
        [Test]
        public void CreateObjectTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //string objectPath = null;
            //System.IO.Stream stream = null;
            //string overwriteMode = null;
            //var response = instance.CreateObject(containerId, objectPath, stream, overwriteMode);
            //Assert.IsInstanceOf<ObjectResponse> (response, "response is ObjectResponse");
        }
        
        /// <summary>
        /// Test CreateObjectInFolder
        /// </summary>
        [Test]
        public void CreateObjectInFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //System.IO.Stream stream = null;
            //string overwriteMode = null;
            //var response = instance.CreateObjectInFolder(containerId, stream, overwriteMode);
            //Assert.IsInstanceOf<ObjectResponse> (response, "response is ObjectResponse");
        }
        
        /// <summary>
        /// Test CreateObjectInFolder1
        /// </summary>
        [Test]
        public void CreateObjectInFolder1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //System.IO.Stream stream = null;
            //string overwriteMode = null;
            //var response = instance.CreateObjectInFolder1(containerId, stream, overwriteMode);
            //Assert.IsInstanceOf<ObjectResponse> (response, "response is ObjectResponse");
        }
        
        /// <summary>
        /// Test DeleteBackend
        /// </summary>
        [Test]
        public void DeleteBackendTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string backendId = null;
            //var response = instance.DeleteBackend(backendId);
            //Assert.IsInstanceOf<BackendResponse> (response, "response is BackendResponse");
        }
        
        /// <summary>
        /// Test DeleteContainer
        /// </summary>
        [Test]
        public void DeleteContainerTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //string delete = null;
            //var response = instance.DeleteContainer(containerId, delete);
            //Assert.IsInstanceOf<ContainerResponse> (response, "response is ContainerResponse");
        }
        
        /// <summary>
        /// Test DeleteObject
        /// </summary>
        [Test]
        public void DeleteObjectTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //string objectPath = null;
            //instance.DeleteObject(containerId, objectPath);
            
        }
        
        /// <summary>
        /// Test GetBackendInfo
        /// </summary>
        [Test]
        public void GetBackendInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string backendId = null;
            //var response = instance.GetBackendInfo(backendId);
            //Assert.IsInstanceOf<BackendResponse> (response, "response is BackendResponse");
        }
        
        /// <summary>
        /// Test GetContainerInfo
        /// </summary>
        [Test]
        public void GetContainerInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //var response = instance.GetContainerInfo(containerId);
            //Assert.IsInstanceOf<ContainerResponse> (response, "response is ContainerResponse");
        }
        
        /// <summary>
        /// Test GetObject
        /// </summary>
        [Test]
        public void GetObjectTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //string objectPath = null;
            //var response = instance.GetObject(containerId, objectPath);
            //Assert.IsInstanceOf<byte[]> (response, "response is byte[]");
        }
        
        /// <summary>
        /// Test ListContainers
        /// </summary>
        [Test]
        public void ListContainersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string backendId = null;
            //var response = instance.ListContainers(backendId);
            //Assert.IsInstanceOf<List<ContainerResponse>> (response, "response is List<ContainerResponse>");
        }
        
        /// <summary>
        /// Test ListObjects
        /// </summary>
        [Test]
        public void ListObjectsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //string objectPath = null;
            //var response = instance.ListObjects(containerId, objectPath);
            //Assert.IsInstanceOf<List<ObjectInfoResponse>> (response, "response is List<ObjectInfoResponse>");
        }
        
        /// <summary>
        /// Test ListObjectsInFolder
        /// </summary>
        [Test]
        public void ListObjectsInFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //var response = instance.ListObjectsInFolder(containerId);
            //Assert.IsInstanceOf<List<ObjectInfoResponse>> (response, "response is List<ObjectInfoResponse>");
        }
        
        /// <summary>
        /// Test ListObjectsInFolder1
        /// </summary>
        [Test]
        public void ListObjectsInFolder1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //var response = instance.ListObjectsInFolder1(containerId);
            //Assert.IsInstanceOf<List<ObjectInfoResponse>> (response, "response is List<ObjectInfoResponse>");
        }
        
        /// <summary>
        /// Test ListObjectsInFolder2
        /// </summary>
        [Test]
        public void ListObjectsInFolder2Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //var response = instance.ListObjectsInFolder2(containerId);
            //Assert.IsInstanceOf<List<ObjectInfoResponse>> (response, "response is List<ObjectInfoResponse>");
        }
        
        /// <summary>
        /// Test UpdateBackend
        /// </summary>
        [Test]
        public void UpdateBackendTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string backendId = null;
            //BackendRequest backendRequest = null;
            //var response = instance.UpdateBackend(backendId, backendRequest);
            //Assert.IsInstanceOf<BackendResponse> (response, "response is BackendResponse");
        }
        
        /// <summary>
        /// Test UpdateContainer
        /// </summary>
        [Test]
        public void UpdateContainerTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string containerId = null;
            //ContainerRequest containerRequest = null;
            //var response = instance.UpdateContainer(containerId, containerRequest);
            //Assert.IsInstanceOf<ContainerResponse> (response, "response is ContainerResponse");
        }
        
    }

}
