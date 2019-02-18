/*
 * ==============================BEGIN_COPYRIGHT===============================
 * =======Wangluo Electronic Technology Co., LTD. PROPRIETARY INFORMATION======
 * This software and its associated IndoorStar products are supplied under the
 * terms of a license agreement or nondisclosure agreement (NDA) with Wangluo
 * Electronic Technology Co., LTD., Shanghai and may not be copied or disclosed
 * except in accordance with the terms of that agreement.
 * Copyright (c) 2013 - 2015
 * Wangluo Electronic Technology Co., LTD., Shanghai. All Rights Reserved.
 * ===============================END_COPYRIGHT================================
 *
 * @author - IDS R&D Group - Xinlu Wang
 * @date   - 2019-01-11
 */

package com.ids.secstar.model.pf;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;
import com.ids.secstar.model.pf.type.ComponentType;

import java.util.Map;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("OccupantSource")
public class OccupantSource {

    @DescribedBy("id")
    private int id;

    @DescribedBy("名称")
    private String name;

    @DescribedBy("描述")
    private String description;

    @DescribedBy("流量")
    private double flowRate;

    private Map<Double,Double> timeFlowRate;

    @DescribedBy("流量")
    private boolean enforceFlowRate;

    @DescribedBy("属性分配")
    private Map<Integer, Double> profileDistributionMap;

    @DescribedBy("行为分配")
    private Map<Integer, Double> behaviorDistributionMap;

    @DescribedBy("组件Id")
    private int componentId;

    @DescribedBy("组件类型")
    private ComponentType componentType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFlowRate() {
        return flowRate;
    }

    public void setFlowRate(double flowRate) {
        this.flowRate = flowRate;
    }

    public Map<Double, Double> getTimeFlowRate() {
        return timeFlowRate;
    }

    public void setTimeFlowRate(Map<Double, Double> timeFlowRate) {
        this.timeFlowRate = timeFlowRate;
    }

    public boolean isEnforceFlowRate() {
        return enforceFlowRate;
    }

    public void setEnforceFlowRate(boolean enforceFlowRate) {
        this.enforceFlowRate = enforceFlowRate;
    }

    public Map<Integer, Double> getProfileDistributionMap() {
        return profileDistributionMap;
    }

    public void setProfileDistributionMap(Map<Integer, Double> profileDistributionMap) {
        this.profileDistributionMap = profileDistributionMap;
    }

    public Map<Integer, Double> getBehaviorDistributionMap() {
        return behaviorDistributionMap;
    }

    public void setBehaviorDistributionMap(Map<Integer, Double> behaviorDistributionMap) {
        this.behaviorDistributionMap = behaviorDistributionMap;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
    }

}
