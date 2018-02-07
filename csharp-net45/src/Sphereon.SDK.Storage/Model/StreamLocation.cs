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

namespace Sphereon.SDK.Storage.Model
{
    /// <summary>
    /// Location record of data stream
    /// </summary>
    [DataContract]
    public partial class StreamLocation :  IEquatable<StreamLocation>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StreamLocation" /> class.
        /// </summary>
        /// <param name="FolderPath">FolderPath.</param>
        /// <param name="OriginalFileName">OriginalFileName.</param>
        /// <param name="FileName">FileName.</param>
        /// <param name="ContainerId">ContainerId.</param>
        public StreamLocation(string FolderPath = null, string OriginalFileName = null, string FileName = null, string ContainerId = null)
        {
            this.FolderPath = FolderPath;
            this.OriginalFileName = OriginalFileName;
            this.FileName = FileName;
            this.ContainerId = ContainerId;
        }
        
        /// <summary>
        /// Gets or Sets FolderPath
        /// </summary>
        [DataMember(Name="folderPath", EmitDefaultValue=false)]
        public string FolderPath { get; set; }
        /// <summary>
        /// Gets or Sets OriginalFileName
        /// </summary>
        [DataMember(Name="originalFileName", EmitDefaultValue=false)]
        public string OriginalFileName { get; set; }
        /// <summary>
        /// Gets or Sets FileName
        /// </summary>
        [DataMember(Name="fileName", EmitDefaultValue=false)]
        public string FileName { get; set; }
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; private set; }
        /// <summary>
        /// Gets or Sets ContainerId
        /// </summary>
        [DataMember(Name="containerId", EmitDefaultValue=false)]
        public string ContainerId { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StreamLocation {\n");
            sb.Append("  FolderPath: ").Append(FolderPath).Append("\n");
            sb.Append("  OriginalFileName: ").Append(OriginalFileName).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ContainerId: ").Append(ContainerId).Append("\n");
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
            return this.Equals(obj as StreamLocation);
        }

        /// <summary>
        /// Returns true if StreamLocation instances are equal
        /// </summary>
        /// <param name="other">Instance of StreamLocation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StreamLocation other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.FolderPath == other.FolderPath ||
                    this.FolderPath != null &&
                    this.FolderPath.Equals(other.FolderPath)
                ) && 
                (
                    this.OriginalFileName == other.OriginalFileName ||
                    this.OriginalFileName != null &&
                    this.OriginalFileName.Equals(other.OriginalFileName)
                ) && 
                (
                    this.FileName == other.FileName ||
                    this.FileName != null &&
                    this.FileName.Equals(other.FileName)
                ) && 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.ContainerId == other.ContainerId ||
                    this.ContainerId != null &&
                    this.ContainerId.Equals(other.ContainerId)
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
                if (this.FolderPath != null)
                    hash = hash * 59 + this.FolderPath.GetHashCode();
                if (this.OriginalFileName != null)
                    hash = hash * 59 + this.OriginalFileName.GetHashCode();
                if (this.FileName != null)
                    hash = hash * 59 + this.FileName.GetHashCode();
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this.ContainerId != null)
                    hash = hash * 59 + this.ContainerId.GetHashCode();
                return hash;
            }
        }
    }

}
