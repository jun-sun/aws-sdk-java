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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstanceAccessControlAttributeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInstanceAccessControlAttributeConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * Updates the attributes for your ABAC configuration.
     * </p>
     */
    private InstanceAccessControlAttributeConfiguration instanceAccessControlAttributeConfiguration;

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed.
     * </p>
     * 
     * @return The ARN of the SSO instance under which the operation will be executed.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceAccessControlAttributeConfigurationRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * Updates the attributes for your ABAC configuration.
     * </p>
     * 
     * @param instanceAccessControlAttributeConfiguration
     *        Updates the attributes for your ABAC configuration.
     */

    public void setInstanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfiguration instanceAccessControlAttributeConfiguration) {
        this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
    }

    /**
     * <p>
     * Updates the attributes for your ABAC configuration.
     * </p>
     * 
     * @return Updates the attributes for your ABAC configuration.
     */

    public InstanceAccessControlAttributeConfiguration getInstanceAccessControlAttributeConfiguration() {
        return this.instanceAccessControlAttributeConfiguration;
    }

    /**
     * <p>
     * Updates the attributes for your ABAC configuration.
     * </p>
     * 
     * @param instanceAccessControlAttributeConfiguration
     *        Updates the attributes for your ABAC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceAccessControlAttributeConfigurationRequest withInstanceAccessControlAttributeConfiguration(
            InstanceAccessControlAttributeConfiguration instanceAccessControlAttributeConfiguration) {
        setInstanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration);
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getInstanceAccessControlAttributeConfiguration() != null)
            sb.append("InstanceAccessControlAttributeConfiguration: ").append(getInstanceAccessControlAttributeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInstanceAccessControlAttributeConfigurationRequest == false)
            return false;
        UpdateInstanceAccessControlAttributeConfigurationRequest other = (UpdateInstanceAccessControlAttributeConfigurationRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getInstanceAccessControlAttributeConfiguration() == null ^ this.getInstanceAccessControlAttributeConfiguration() == null)
            return false;
        if (other.getInstanceAccessControlAttributeConfiguration() != null
                && other.getInstanceAccessControlAttributeConfiguration().equals(this.getInstanceAccessControlAttributeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceAccessControlAttributeConfiguration() == null) ? 0 : getInstanceAccessControlAttributeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInstanceAccessControlAttributeConfigurationRequest clone() {
        return (UpdateInstanceAccessControlAttributeConfigurationRequest) super.clone();
    }

}
