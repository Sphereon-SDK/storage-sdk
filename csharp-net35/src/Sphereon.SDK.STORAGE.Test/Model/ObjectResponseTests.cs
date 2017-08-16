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
using Sphereon.SDK.STORAGE.Api;
using Sphereon.SDK.STORAGE.Model;
using Sphereon.SDK.STORAGE.Client;
using System.Reflection;

namespace Sphereon.SDK.STORAGE.Test
{
    /// <summary>
    ///  Class for testing ObjectResponse
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class ObjectResponseTests
    {
        // TODO uncomment below to declare an instance variable for ObjectResponse
        //private ObjectResponse instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of ObjectResponse
            //instance = new ObjectResponse();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ObjectResponse
        /// </summary>
        [Test]
        public void ObjectResponseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" ObjectResponse
            //Assert.IsInstanceOfType<ObjectResponse> (instance, "variable 'instance' is a ObjectResponse");
        }

        /// <summary>
        /// Test the property 'FileName'
        /// </summary>
        [Test]
        public void FileNameTest()
        {
            // TODO unit test for the property 'FileName'
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
        /// Test the property 'ContentLength'
        /// </summary>
        [Test]
        public void ContentLengthTest()
        {
            // TODO unit test for the property 'ContentLength'
        }
        /// <summary>
        /// Test the property 'FolderName'
        /// </summary>
        [Test]
        public void FolderNameTest()
        {
            // TODO unit test for the property 'FolderName'
        }
        /// <summary>
        /// Test the property 'State'
        /// </summary>
        [Test]
        public void StateTest()
        {
            // TODO unit test for the property 'State'
        }
        /// <summary>
        /// Test the property 'ContentType'
        /// </summary>
        [Test]
        public void ContentTypeTest()
        {
            // TODO unit test for the property 'ContentType'
        }

    }

}
