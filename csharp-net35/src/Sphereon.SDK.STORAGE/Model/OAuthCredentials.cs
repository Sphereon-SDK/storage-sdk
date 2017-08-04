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
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Sphereon.SDK.STORAGE.Model
{
    /// <summary>
    /// OAuthCredentials
    /// </summary>
    [DataContract]
    public partial class OAuthCredentials :  IEquatable<OAuthCredentials>
    {
        /// <summary>
        /// Gets or Sets AuthenticationProvider
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AuthenticationProviderEnum
        {
            
            /// <summary>
            /// Enum APISUPPLIER for "API_SUPPLIER"
            /// </summary>
            [EnumMember(Value = "API_SUPPLIER")]
            APISUPPLIER,
            
            /// <summary>
            /// Enum ENDUSER for "END_USER"
            /// </summary>
            [EnumMember(Value = "END_USER")]
            ENDUSER
        }

        /// <summary>
        /// Gets or Sets AuthenticationProvider
        /// </summary>
        [DataMember(Name="authenticationProvider", EmitDefaultValue=false)]
        public AuthenticationProviderEnum? AuthenticationProvider { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OAuthCredentials" /> class.
        /// </summary>
        /// <param name="AuthenticationProvider">AuthenticationProvider.</param>
        /// <param name="Secretkey">Secretkey.</param>
        /// <param name="Accesskeyid">Accesskeyid.</param>
        public OAuthCredentials(AuthenticationProviderEnum? AuthenticationProvider = null, string Secretkey = null, string Accesskeyid = null)
        {
            this.AuthenticationProvider = AuthenticationProvider;
            this.Secretkey = Secretkey;
            this.Accesskeyid = Accesskeyid;
        }
        
        /// <summary>
        /// Gets or Sets Secretkey
        /// </summary>
        [DataMember(Name="secretkey", EmitDefaultValue=false)]
        public string Secretkey { get; set; }
        /// <summary>
        /// Gets or Sets Accesskeyid
        /// </summary>
        [DataMember(Name="accesskeyid", EmitDefaultValue=false)]
        public string Accesskeyid { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OAuthCredentials {\n");
            sb.Append("  AuthenticationProvider: ").Append(AuthenticationProvider).Append("\n");
            sb.Append("  Secretkey: ").Append(Secretkey).Append("\n");
            sb.Append("  Accesskeyid: ").Append(Accesskeyid).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as OAuthCredentials);
        }

        /// <summary>
        /// Returns true if OAuthCredentials instances are equal
        /// </summary>
        /// <param name="other">Instance of OAuthCredentials to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OAuthCredentials other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.AuthenticationProvider == other.AuthenticationProvider ||
                    this.AuthenticationProvider != null &&
                    this.AuthenticationProvider.Equals(other.AuthenticationProvider)
                ) && 
                (
                    this.Secretkey == other.Secretkey ||
                    this.Secretkey != null &&
                    this.Secretkey.Equals(other.Secretkey)
                ) && 
                (
                    this.Accesskeyid == other.Accesskeyid ||
                    this.Accesskeyid != null &&
                    this.Accesskeyid.Equals(other.Accesskeyid)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.AuthenticationProvider != null)
                    hash = hash * 59 + this.AuthenticationProvider.GetHashCode();
                if (this.Secretkey != null)
                    hash = hash * 59 + this.Secretkey.GetHashCode();
                if (this.Accesskeyid != null)
                    hash = hash * 59 + this.Accesskeyid.GetHashCode();
                return hash;
            }
        }
    }

}
