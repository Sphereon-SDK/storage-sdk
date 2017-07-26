/* 
 * Storage
 *
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.6.0
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
using Sphereon.SDK.STORAGE.Api;
using Sphereon.SDK.STORAGE.Model;
using Sphereon.SDK.STORAGE.Client;
using System.Reflection;

namespace Sphereon.SDK.STORAGE.Test
{
    /// <summary>
    ///  Class for testing BackendRequest
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class BackendRequestTests
    {
        // TODO uncomment below to declare an instance variable for BackendRequest
        //private BackendRequest instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of BackendRequest
            //instance = new BackendRequest();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of BackendRequest
        /// </summary>
        [Test]
        public void BackendRequestInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" BackendRequest
            //Assert.IsInstanceOfType<BackendRequest> (instance, "variable 'instance' is a BackendRequest");
        }

        /// <summary>
        /// Test the property 'AuthenticationProvider'
        /// </summary>
        [Test]
        public void AuthenticationProviderTest()
        {
            // TODO unit test for the property 'AuthenticationProvider'
        }
        /// <summary>
        /// Test the property 'BackendType'
        /// </summary>
        [Test]
        public void BackendTypeTest()
        {
            // TODO unit test for the property 'BackendType'
        }
        /// <summary>
        /// Test the property 'BackendSecret'
        /// </summary>
        [Test]
        public void BackendSecretTest()
        {
            // TODO unit test for the property 'BackendSecret'
        }
        /// <summary>
        /// Test the property 'Name'
        /// </summary>
        [Test]
        public void NameTest()
        {
            // TODO unit test for the property 'Name'
        }
        /// <summary>
        /// Test the property 'Description'
        /// </summary>
        [Test]
        public void DescriptionTest()
        {
            // TODO unit test for the property 'Description'
        }
        /// <summary>
        /// Test the property 'BackendKey'
        /// </summary>
        [Test]
        public void BackendKeyTest()
        {
            // TODO unit test for the property 'BackendKey'
        }
        /// <summary>
        /// Test the property 'ParentId'
        /// </summary>
        [Test]
        public void ParentIdTest()
        {
            // TODO unit test for the property 'ParentId'
        }

    }

}
