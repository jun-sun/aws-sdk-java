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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeSlotTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSlotTypeResultJsonUnmarshaller implements Unmarshaller<DescribeSlotTypeResult, JsonUnmarshallerContext> {

    public DescribeSlotTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSlotTypeResult describeSlotTypeResult = new DescribeSlotTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSlotTypeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("slotTypeId", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setSlotTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeName", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setSlotTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeValues", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setSlotTypeValues(new ListUnmarshaller<SlotTypeValue>(SlotTypeValueJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("valueSelectionSetting", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setValueSelectionSetting(SlotValueSelectionSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("parentSlotTypeSignature", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setParentSlotTypeSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    describeSlotTypeResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeSlotTypeResult;
    }

    private static DescribeSlotTypeResultJsonUnmarshaller instance;

    public static DescribeSlotTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSlotTypeResultJsonUnmarshaller();
        return instance;
    }
}
