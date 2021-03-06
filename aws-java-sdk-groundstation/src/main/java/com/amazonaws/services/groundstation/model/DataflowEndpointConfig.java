/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the dataflow endpoint <code>Config</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DataflowEndpointConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataflowEndpointConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of a dataflow endpoint.
     * </p>
     */
    private String dataflowEndpointName;
    /**
     * <p>
     * Region of a dataflow endpoint.
     * </p>
     */
    private String dataflowEndpointRegion;

    /**
     * <p>
     * Name of a dataflow endpoint.
     * </p>
     * 
     * @param dataflowEndpointName
     *        Name of a dataflow endpoint.
     */

    public void setDataflowEndpointName(String dataflowEndpointName) {
        this.dataflowEndpointName = dataflowEndpointName;
    }

    /**
     * <p>
     * Name of a dataflow endpoint.
     * </p>
     * 
     * @return Name of a dataflow endpoint.
     */

    public String getDataflowEndpointName() {
        return this.dataflowEndpointName;
    }

    /**
     * <p>
     * Name of a dataflow endpoint.
     * </p>
     * 
     * @param dataflowEndpointName
     *        Name of a dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowEndpointConfig withDataflowEndpointName(String dataflowEndpointName) {
        setDataflowEndpointName(dataflowEndpointName);
        return this;
    }

    /**
     * <p>
     * Region of a dataflow endpoint.
     * </p>
     * 
     * @param dataflowEndpointRegion
     *        Region of a dataflow endpoint.
     */

    public void setDataflowEndpointRegion(String dataflowEndpointRegion) {
        this.dataflowEndpointRegion = dataflowEndpointRegion;
    }

    /**
     * <p>
     * Region of a dataflow endpoint.
     * </p>
     * 
     * @return Region of a dataflow endpoint.
     */

    public String getDataflowEndpointRegion() {
        return this.dataflowEndpointRegion;
    }

    /**
     * <p>
     * Region of a dataflow endpoint.
     * </p>
     * 
     * @param dataflowEndpointRegion
     *        Region of a dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowEndpointConfig withDataflowEndpointRegion(String dataflowEndpointRegion) {
        setDataflowEndpointRegion(dataflowEndpointRegion);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataflowEndpointName() != null)
            sb.append("DataflowEndpointName: ").append(getDataflowEndpointName()).append(",");
        if (getDataflowEndpointRegion() != null)
            sb.append("DataflowEndpointRegion: ").append(getDataflowEndpointRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataflowEndpointConfig == false)
            return false;
        DataflowEndpointConfig other = (DataflowEndpointConfig) obj;
        if (other.getDataflowEndpointName() == null ^ this.getDataflowEndpointName() == null)
            return false;
        if (other.getDataflowEndpointName() != null && other.getDataflowEndpointName().equals(this.getDataflowEndpointName()) == false)
            return false;
        if (other.getDataflowEndpointRegion() == null ^ this.getDataflowEndpointRegion() == null)
            return false;
        if (other.getDataflowEndpointRegion() != null && other.getDataflowEndpointRegion().equals(this.getDataflowEndpointRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataflowEndpointName() == null) ? 0 : getDataflowEndpointName().hashCode());
        hashCode = prime * hashCode + ((getDataflowEndpointRegion() == null) ? 0 : getDataflowEndpointRegion().hashCode());
        return hashCode;
    }

    @Override
    public DataflowEndpointConfig clone() {
        try {
            return (DataflowEndpointConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.DataflowEndpointConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
