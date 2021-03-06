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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UntagSAMLProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagSAMLProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the SAML identity provider in IAM from which you want to remove tags.
     * </p>
     * <p>
     * This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any
     * of the following characters: =,.@-
     * </p>
     */
    private String sAMLProviderArn;
    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified SAML
     * identity provider.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;

    /**
     * <p>
     * The ARN of the SAML identity provider in IAM from which you want to remove tags.
     * </p>
     * <p>
     * This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any
     * of the following characters: =,.@-
     * </p>
     * 
     * @param sAMLProviderArn
     *        The ARN of the SAML identity provider in IAM from which you want to remove tags.</p>
     *        <p>
     *        This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: =,.@-
     */

    public void setSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
    }

    /**
     * <p>
     * The ARN of the SAML identity provider in IAM from which you want to remove tags.
     * </p>
     * <p>
     * This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any
     * of the following characters: =,.@-
     * </p>
     * 
     * @return The ARN of the SAML identity provider in IAM from which you want to remove tags.</p>
     *         <p>
     *         This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: =,.@-
     */

    public String getSAMLProviderArn() {
        return this.sAMLProviderArn;
    }

    /**
     * <p>
     * The ARN of the SAML identity provider in IAM from which you want to remove tags.
     * </p>
     * <p>
     * This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any
     * of the following characters: =,.@-
     * </p>
     * 
     * @param sAMLProviderArn
     *        The ARN of the SAML identity provider in IAM from which you want to remove tags.</p>
     *        <p>
     *        This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagSAMLProviderRequest withSAMLProviderArn(String sAMLProviderArn) {
        setSAMLProviderArn(sAMLProviderArn);
        return this;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified SAML
     * identity provider.
     * </p>
     * 
     * @return A list of key names as a simple array of strings. The tags with matching keys are removed from the
     *         specified SAML identity provider.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified SAML
     * identity provider.
     * </p>
     * 
     * @param tagKeys
     *        A list of key names as a simple array of strings. The tags with matching keys are removed from the
     *        specified SAML identity provider.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified SAML
     * identity provider.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A list of key names as a simple array of strings. The tags with matching keys are removed from the
     *        specified SAML identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagSAMLProviderRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified SAML
     * identity provider.
     * </p>
     * 
     * @param tagKeys
     *        A list of key names as a simple array of strings. The tags with matching keys are removed from the
     *        specified SAML identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagSAMLProviderRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getSAMLProviderArn() != null)
            sb.append("SAMLProviderArn: ").append(getSAMLProviderArn()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagSAMLProviderRequest == false)
            return false;
        UntagSAMLProviderRequest other = (UntagSAMLProviderRequest) obj;
        if (other.getSAMLProviderArn() == null ^ this.getSAMLProviderArn() == null)
            return false;
        if (other.getSAMLProviderArn() != null && other.getSAMLProviderArn().equals(this.getSAMLProviderArn()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSAMLProviderArn() == null) ? 0 : getSAMLProviderArn().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagSAMLProviderRequest clone() {
        return (UntagSAMLProviderRequest) super.clone();
    }

}
