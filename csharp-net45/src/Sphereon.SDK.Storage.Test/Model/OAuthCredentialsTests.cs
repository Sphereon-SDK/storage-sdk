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
    ///  Class for testing OAuthCredentials
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class OAuthCredentialsTests
    {
        // TODO uncomment below to declare an instance variable for OAuthCredentials
        //private OAuthCredentials instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of OAuthCredentials
            //instance = new OAuthCredentials();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of OAuthCredentials
        /// </summary>
        [Test]
        public void OAuthCredentialsInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" OAuthCredentials
            //Assert.IsInstanceOfType<OAuthCredentials> (instance, "variable 'instance' is a OAuthCredentials");
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
        /// Test the property 'Secretkey'
        /// </summary>
        [Test]
        public void SecretkeyTest()
        {
            // TODO unit test for the property 'Secretkey'
        }
        /// <summary>
        /// Test the property 'Accesskeyid'
        /// </summary>
        [Test]
        public void AccesskeyidTest()
        {
            // TODO unit test for the property 'Accesskeyid'
        }

    }

}