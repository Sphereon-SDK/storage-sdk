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


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Sphereon.SDK.Storage.Api;
using Sphereon.SDK.Storage.Model;
using Sphereon.SDK.Storage.Client;
using System.Reflection;

namespace Sphereon.SDK.Storage.Test
{
    /// <summary>
    ///  Class for testing StreamInfo
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class StreamInfoTests
    {
        // TODO uncomment below to declare an instance variable for StreamInfo
        //private StreamInfo instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of StreamInfo
            //instance = new StreamInfo();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of StreamInfo
        /// </summary>
        [Test]
        public void StreamInfoInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" StreamInfo
            //Assert.IsInstanceOfType<StreamInfo> (instance, "variable 'instance' is a StreamInfo");
        }

        /// <summary>
        /// Test the property 'StreamLocation'
        /// </summary>
        [Test]
        public void StreamLocationTest()
        {
            // TODO unit test for the property 'StreamLocation'
        }
        /// <summary>
        /// Test the property 'ContainerName'
        /// </summary>
        [Test]
        public void ContainerNameTest()
        {
            // TODO unit test for the property 'ContainerName'
        }
        /// <summary>
        /// Test the property 'ProviderId'
        /// </summary>
        [Test]
        public void ProviderIdTest()
        {
            // TODO unit test for the property 'ProviderId'
        }
        /// <summary>
        /// Test the property 'StreamLength'
        /// </summary>
        [Test]
        public void StreamLengthTest()
        {
            // TODO unit test for the property 'StreamLength'
        }
        /// <summary>
        /// Test the property 'ETag'
        /// </summary>
        [Test]
        public void ETagTest()
        {
            // TODO unit test for the property 'ETag'
        }
        /// <summary>
        /// Test the property 'Etag'
        /// </summary>
        [Test]
        public void EtagTest()
        {
            // TODO unit test for the property 'Etag'
        }
        /// <summary>
        /// Test the property 'TimeCreated'
        /// </summary>
        [Test]
        public void TimeCreatedTest()
        {
            // TODO unit test for the property 'TimeCreated'
        }
        /// <summary>
        /// Test the property 'BackendLocation'
        /// </summary>
        [Test]
        public void BackendLocationTest()
        {
            // TODO unit test for the property 'BackendLocation'
        }
        /// <summary>
        /// Test the property 'ContentType'
        /// </summary>
        [Test]
        public void ContentTypeTest()
        {
            // TODO unit test for the property 'ContentType'
        }
        /// <summary>
        /// Test the property 'TimeModified'
        /// </summary>
        [Test]
        public void TimeModifiedTest()
        {
            // TODO unit test for the property 'TimeModified'
        }
        /// <summary>
        /// Test the property 'UserMetadata'
        /// </summary>
        [Test]
        public void UserMetadataTest()
        {
            // TODO unit test for the property 'UserMetadata'
        }

    }

}