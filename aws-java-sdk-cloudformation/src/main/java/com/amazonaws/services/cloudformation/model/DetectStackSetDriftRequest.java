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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackSetDrift" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectStackSetDriftRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack set on which to perform the drift detection operation.
     * </p>
     */
    private String stackSetName;

    private StackSetOperationPreferences operationPreferences;
    /**
     * <p>
     * <i>The ID of the stack set operation.</i>
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String callAs;

    /**
     * <p>
     * The name of the stack set on which to perform the drift detection operation.
     * </p>
     * 
     * @param stackSetName
     *        The name of the stack set on which to perform the drift detection operation.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name of the stack set on which to perform the drift detection operation.
     * </p>
     * 
     * @return The name of the stack set on which to perform the drift detection operation.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name of the stack set on which to perform the drift detection operation.
     * </p>
     * 
     * @param stackSetName
     *        The name of the stack set on which to perform the drift detection operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectStackSetDriftRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * @param operationPreferences
     */

    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * @return
     */

    public StackSetOperationPreferences getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * @param operationPreferences
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectStackSetDriftRequest withOperationPreferences(StackSetOperationPreferences operationPreferences) {
        setOperationPreferences(operationPreferences);
        return this;
    }

    /**
     * <p>
     * <i>The ID of the stack set operation.</i>
     * </p>
     * 
     * @param operationId
     *        <i>The ID of the stack set operation.</i>
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * <i>The ID of the stack set operation.</i>
     * </p>
     * 
     * @return <i>The ID of the stack set operation.</i>
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * <i>The ID of the stack set operation.</i>
     * </p>
     * 
     * @param operationId
     *        <i>The ID of the stack set operation.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectStackSetDriftRequest withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @see CallAs
     */

    public void setCallAs(String callAs) {
        this.callAs = callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *         organization's management account or as a delegated administrator in a member account.</p>
     *         <p>
     *         By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *         permissions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are signed in to the management account, specify <code>SELF</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *         </p>
     *         <p>
     *         Your AWS account must be registered as a delegated administrator in the management account. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *         >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *         </p>
     *         </li>
     * @see CallAs
     */

    public String getCallAs() {
        return this.callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public DetectStackSetDriftRequest withCallAs(String callAs) {
        setCallAs(callAs);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public DetectStackSetDriftRequest withCallAs(CallAs callAs) {
        this.callAs = callAs.toString();
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: ").append(getOperationPreferences()).append(",");
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getCallAs() != null)
            sb.append("CallAs: ").append(getCallAs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectStackSetDriftRequest == false)
            return false;
        DetectStackSetDriftRequest other = (DetectStackSetDriftRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getCallAs() == null ^ this.getCallAs() == null)
            return false;
        if (other.getCallAs() != null && other.getCallAs().equals(this.getCallAs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getCallAs() == null) ? 0 : getCallAs().hashCode());
        return hashCode;
    }

    @Override
    public DetectStackSetDriftRequest clone() {
        return (DetectStackSetDriftRequest) super.clone();
    }

}
