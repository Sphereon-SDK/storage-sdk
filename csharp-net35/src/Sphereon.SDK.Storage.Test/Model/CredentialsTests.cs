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
    ///  Class for testing Credentials
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class CredentialsTests
    {
        // TODO uncomment below to declare an instance variable for Credentials
        //private Credentials instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of Credentials
            //instance = new Credentials();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of Credentials
        /// </summary>
        [Test]
        public void CredentialsInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" Credentials
            //Assert.IsInstanceOfType<Credentials> (instance, "variable 'instance' is a Credentials");
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
        /// Test the property 'AuthenticationProvider'
        /// </summary>
        [Test]
        public void AuthenticationProviderTest()
        {
            // TODO unit test for the property 'AuthenticationProvider'
        }

    }

}
