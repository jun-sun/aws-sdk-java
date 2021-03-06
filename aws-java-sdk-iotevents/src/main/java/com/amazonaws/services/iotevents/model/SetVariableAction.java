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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the variable and its new value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/SetVariableAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetVariableAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the variable.
     * </p>
     */
    private String variableName;
    /**
     * <p>
     * The new value of the variable.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param variableName
     *        The name of the variable.
     */

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @return The name of the variable.
     */

    public String getVariableName() {
        return this.variableName;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param variableName
     *        The name of the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetVariableAction withVariableName(String variableName) {
        setVariableName(variableName);
        return this;
    }

    /**
     * <p>
     * The new value of the variable.
     * </p>
     * 
     * @param value
     *        The new value of the variable.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The new value of the variable.
     * </p>
     * 
     * @return The new value of the variable.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The new value of the variable.
     * </p>
     * 
     * @param value
     *        The new value of the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetVariableAction withValue(String value) {
        setValue(value);
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
        if (getVariableName() != null)
            sb.append("VariableName: ").append(getVariableName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetVariableAction == false)
            return false;
        SetVariableAction other = (SetVariableAction) obj;
        if (other.getVariableName() == null ^ this.getVariableName() == null)
            return false;
        if (other.getVariableName() != null && other.getVariableName().equals(this.getVariableName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariableName() == null) ? 0 : getVariableName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public SetVariableAction clone() {
        try {
            return (SetVariableAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.SetVariableActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
