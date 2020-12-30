/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies, as a map, one or more property-based conditions that filter the results of a query for findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/FindingCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A condition that specifies the property, operator, and one or more values to use to filter the results.
     * </p>
     */
    private java.util.Map<String, CriterionAdditionalProperties> criterion;

    /**
     * <p>
     * A condition that specifies the property, operator, and one or more values to use to filter the results.
     * </p>
     * 
     * @return A condition that specifies the property, operator, and one or more values to use to filter the results.
     */

    public java.util.Map<String, CriterionAdditionalProperties> getCriterion() {
        return criterion;
    }

    /**
     * <p>
     * A condition that specifies the property, operator, and one or more values to use to filter the results.
     * </p>
     * 
     * @param criterion
     *        A condition that specifies the property, operator, and one or more values to use to filter the results.
     */

    public void setCriterion(java.util.Map<String, CriterionAdditionalProperties> criterion) {
        this.criterion = criterion;
    }

    /**
     * <p>
     * A condition that specifies the property, operator, and one or more values to use to filter the results.
     * </p>
     * 
     * @param criterion
     *        A condition that specifies the property, operator, and one or more values to use to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingCriteria withCriterion(java.util.Map<String, CriterionAdditionalProperties> criterion) {
        setCriterion(criterion);
        return this;
    }

    /**
     * Add a single Criterion entry
     *
     * @see FindingCriteria#withCriterion
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FindingCriteria addCriterionEntry(String key, CriterionAdditionalProperties value) {
        if (null == this.criterion) {
            this.criterion = new java.util.HashMap<String, CriterionAdditionalProperties>();
        }
        if (this.criterion.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.criterion.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Criterion.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingCriteria clearCriterionEntries() {
        this.criterion = null;
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
        if (getCriterion() != null)
            sb.append("Criterion: ").append(getCriterion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingCriteria == false)
            return false;
        FindingCriteria other = (FindingCriteria) obj;
        if (other.getCriterion() == null ^ this.getCriterion() == null)
            return false;
        if (other.getCriterion() != null && other.getCriterion().equals(this.getCriterion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriterion() == null) ? 0 : getCriterion().hashCode());
        return hashCode;
    }

    @Override
    public FindingCriteria clone() {
        try {
            return (FindingCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.FindingCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
