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
package com.amazonaws.services.imagebuilder.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InfrastructureConfigurationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InfrastructureConfigurationSummaryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateCreated").build();
    private static final MarshallingInfo<String> DATEUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateUpdated").build();
    private static final MarshallingInfo<Map> RESOURCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceTags").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> INSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instanceTypes").build();
    private static final MarshallingInfo<String> INSTANCEPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceProfileName").build();

    private static final InfrastructureConfigurationSummaryMarshaller instance = new InfrastructureConfigurationSummaryMarshaller();

    public static InfrastructureConfigurationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InfrastructureConfigurationSummary infrastructureConfigurationSummary, ProtocolMarshaller protocolMarshaller) {

        if (infrastructureConfigurationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getDateUpdated(), DATEUPDATED_BINDING);
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getResourceTags(), RESOURCETAGS_BINDING);
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getInstanceTypes(), INSTANCETYPES_BINDING);
            protocolMarshaller.marshall(infrastructureConfigurationSummary.getInstanceProfileName(), INSTANCEPROFILENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
