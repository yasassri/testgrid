/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.wso2.testgrid.common.config;


import org.apache.commons.collections4.ListUtils;
import org.wso2.testgrid.common.ConfigChangeSet;
import org.wso2.testgrid.common.TestGridConstants;
import org.wso2.testgrid.common.TestScenario;
import java.io.Serializable;
import java.util.List;

/**
 * Represent the scenario configuration in the testgrid.yaml file that is
 * denoted by the {@link TestgridYaml}.
 *
 */
public class ScenarioConfig implements Serializable {
    private static final long serialVersionUID = 6295205041044769906L;

    private List<ConfigChangeSet> configChangeSets;
    private List<TestScenario> scenarios;
    private List<Script> scripts;
    //keep default value of test type as functional
    private String testType = TestGridConstants.TEST_TYPE_FUNCTIONAL;
    private String repository;
    private String resourceLocation;

    /**
     * This method returns the list of scenarios.
     *
     * @return List of test scenarios that need to be run in testgrid.
     */

    public List<ConfigChangeSet> getConfigChangeSets() {
        return configChangeSets;
    }

    public void setConfigChangeSets(List<ConfigChangeSet> configChangeSets) {
        this.configChangeSets = configChangeSets;
    }

    public List<TestScenario> getScenarios() {
        return ListUtils.emptyIfNull(scenarios);
    }

    public void setScenarios(List<TestScenario> scenarios) {
        this.scenarios = scenarios;
    }

    public List<Script> getScripts() {
        return scripts;
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getResourceLocation() {
        return resourceLocation;
    }

    public void setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
    }
}
