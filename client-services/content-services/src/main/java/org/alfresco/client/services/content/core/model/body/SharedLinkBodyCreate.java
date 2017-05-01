/*
 *   Copyright (C) 2005-2016 Alfresco Software Limited.
 *
 *   This file is part of Alfresco Java Client.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.alfresco.client.services.content.core.model.body;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jpascal on 23/08/2016.
 */
public class SharedLinkBodyCreate
{
    @SerializedName("nodeId")
    public final String nodeId;

    @SerializedName("expiresAt")
    public final Date expiresAt;

    public SharedLinkBodyCreate(String nodeId)
    {
        this.nodeId = nodeId;
        this.expiresAt = null;
    }

    public SharedLinkBodyCreate(String nodeId, Date expiresAt)
    {
        this.nodeId = nodeId;
        this.expiresAt = expiresAt;
    }
}