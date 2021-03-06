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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DateColumnStatisticsDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DateColumnStatisticsDataMarshaller {

    private static final MarshallingInfo<java.util.Date> MINIMUMVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumValue").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> MAXIMUMVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumValue").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> NUMBEROFNULLS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NumberOfNulls").build();
    private static final MarshallingInfo<Long> NUMBEROFDISTINCTVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfDistinctValues").build();

    private static final DateColumnStatisticsDataMarshaller instance = new DateColumnStatisticsDataMarshaller();

    public static DateColumnStatisticsDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DateColumnStatisticsData dateColumnStatisticsData, ProtocolMarshaller protocolMarshaller) {

        if (dateColumnStatisticsData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dateColumnStatisticsData.getMinimumValue(), MINIMUMVALUE_BINDING);
            protocolMarshaller.marshall(dateColumnStatisticsData.getMaximumValue(), MAXIMUMVALUE_BINDING);
            protocolMarshaller.marshall(dateColumnStatisticsData.getNumberOfNulls(), NUMBEROFNULLS_BINDING);
            protocolMarshaller.marshall(dateColumnStatisticsData.getNumberOfDistinctValues(), NUMBEROFDISTINCTVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
