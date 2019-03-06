/* 
 * Storage
 *
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.8
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
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
    ///  Class for testing CredentialsRequest
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class CredentialsRequestTests
    {
        // TODO uncomment below to declare an instance variable for CredentialsRequest
        //private CredentialsRequest instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of CredentialsRequest
            //instance = new CredentialsRequest();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CredentialsRequest
        /// </summary>
        [Test]
        public void CredentialsRequestInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" CredentialsRequest
            //Assert.IsInstanceOfType<CredentialsRequest> (instance, "variable 'instance' is a CredentialsRequest");
        }

        /// <summary>
        /// Test the property 'CredentialType'
        /// </summary>
        [Test]
        public void CredentialTypeTest()
        {
            // TODO unit test for the property 'CredentialType'
        }
        /// <summary>
        /// Test the property 'Oauth2Credentials'
        /// </summary>
        [Test]
        public void Oauth2CredentialsTest()
        {
            // TODO unit test for the property 'Oauth2Credentials'
        }
        /// <summary>
        /// Test the property 'OauthCredentials'
        /// </summary>
        [Test]
        public void OauthCredentialsTest()
        {
            // TODO unit test for the property 'OauthCredentials'
        }
        /// <summary>
        /// Test the property 'UsernamePasswordCredentials'
        /// </summary>
        [Test]
        public void UsernamePasswordCredentialsTest()
        {
            // TODO unit test for the property 'UsernamePasswordCredentials'
        }

    }

}
