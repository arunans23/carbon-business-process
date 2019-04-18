/**
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.bpmn.core;

import java.io.File;

/**
 *
 * Class to store the static final variables of BPMN
 *
 */

public class BPMNConstants {

    public static final String ACTIVITI_CONFIGURATION_FILE_NAME = "activiti.xml";

    public static final String LATEST_CHECKSUM_PROPERTY = "latestChecksum";
    public static final String BPMN_REGISTRY_PATH = "/bpmn/deployments";
    public static final String REGISTRY_PATH_SEPARATOR = "/";
    public static final String BPMN_REPO_NAME = "bpmn";

    public static final String BPMN_PACKAGE_EXTENSION = "bar";
    public static final String BPMN_PACKAGE_TEMP_DIRECTORY = File.separator + "tmp" + File.separator + "bpmnuploads";
    public static final int    SUPER_TENANT_ID = -1234;

	public static final String BPS_BPMN_DEPLOYMENT_METADATA_TABLE = "BPS_BPMN_DEPLOYMENT_METADATA";
    public static final String SPRING_NAMESPACE = "http://www.springframework.org/schema/beans";
    public static final String BEAN = "bean";
    public static final String BEAN_ID = "id";
    public static final String BEAN_CLASS = "class";
    public static final String PROPERTY = "property";
    public static final String NAME = "name";
    public static final String VALUE = "value";

    public static final String NOT_DEFINED_VAR = "NOT_DEFINED";

    public static final int    ACTIVITI_INSTANCE_MAX_DELETE_COUNT = 1000;
    public static final String ACTIVITI_INSTANCE_MAX_DELETE_CONFIG = "activitiInstanceDeleteConfig";
    public static final String ACTIVITI_INSTANCE_MAX_DELETE_CONFIG_MAX_COUNT_PROPERTY = "maxCount";




    public static final String ACT_BPS_SUBSTITUTES_TABLE = "ACT_BPS_SUBSTITUTES";
    public static final String TRANSITIVE_SUB_NOT_APPLICABLE ="_N/A";
    public static final String TRANSITIVE_SUB_UNDEFINED = "_UNDEFINED";
    public static final String BULK_REASSIGN_PROCESSED = "_PROCESSED";
    public static final String SUBSTITUTION_PERMISSION_PATH = "/permission/admin/manage/bpmn/substitute";
    public static final String BPMN_PERMISSION_PATH = "/permission/admin/manage/bpmn";
    public static final String ADMIN_PERMISSION_PATH = "/permission/admin";
    public static final String ROOT_PERMISSION_PATH = "/permission";
    public static final String SUBSTITUTION_CONFIG = "userSubstitutionConfiguration";
    public static final String SUBSTITUTION_TRANSITIVITY_PROPERTY = "enableTransitivity";
    public static final String SUBSTITUTION_SCHEDULER_INTERVAL = "activationInterval";
    public static final boolean SUBSTITUTION_TRANSITIVITY_DEFAULT = false;
    public static final int DEFAULT_SUBSTITUTION_INTERVAL_IN_MINUTES = 60 * 24;
    public static final String SUBSTITUTION_ENABLED = "enabled";
    public static final String DBMS_MYSQL = "mysql";
    public static final long MYSQL_SUBSTITUTION_MAX_END_DATE = 2147365800000L; //Date 2038/jan/18, max timestamp allowed in mysql
    public static final long DEFAULT_SUBSTITUTION_MAX_END_DATE = 95617564200000L; //5000/1/1

    /**
     * {@value #RESOLVE_DEPLOYMENT_SYS_PROP} System property to avoid resolving deployment to avoid inconsistencies
     */
    public static final String RESOLVE_DEPLOYMENT_SYS_PROP = "resolveDeploymentsAtStartup";

    //For secure vault implementation in ActivitiEngine
    public static final String SECURE_VAULT_NS = "http://org.wso2.securevault/configuration";
    public static final String SECRET_ALIAS_ATTR_NAME = "secretAlias";
}

