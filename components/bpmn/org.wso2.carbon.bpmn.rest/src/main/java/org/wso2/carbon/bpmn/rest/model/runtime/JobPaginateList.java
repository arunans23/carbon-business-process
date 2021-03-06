/*
 * Copyright (c) 2015. WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * /
 */

package org.wso2.carbon.bpmn.rest.model.runtime;

import org.wso2.carbon.bpmn.rest.common.AbstractPaginateList;
import org.wso2.carbon.bpmn.rest.common.RestResponseFactory;

import javax.ws.rs.core.UriInfo;
import java.util.List;

public class JobPaginateList extends AbstractPaginateList {
    protected RestResponseFactory restResponseFactory = new RestResponseFactory();

    public JobPaginateList(RestResponseFactory restResponseFactory, UriInfo uriInfo) {
        super(restResponseFactory,uriInfo);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    protected List processList(List list) {
        return restResponseFactory.createJobResponseList(list, uriInfo.getBaseUri().toString());
    }


}
