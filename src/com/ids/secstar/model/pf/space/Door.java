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

package com.ids.secstar.model.pf.space;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;
import com.ids.secstar.model.pf.type.ConfigurableValue;
import com.ids.secstar.model.pf.type.DoorState;

import java.util.List;
import java.util.Map;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Door")
public class Door extends Component {

    @DescribedBy("idsPonId")
    private int idsPonId;

    @DescribedBy("宽度")
    private double width;

    @DescribedBy("流量")
    private double flowRate;

    @DescribedBy("初始状态")
    private DoorState initState;

    @DescribedBy("状态")
    private Map<Double, DoorState> states;

    @DescribedBy("等待时间")
    private ConfigurableValue waitTime;

    @DescribedBy("接受属性Id")
    private List<Integer> acceptedProfileIds;

    public int getIdsPonId() {
        return idsPonId;
    }

    public void setIdsPonId(int idsPonId) {
        this.idsPonId = idsPonId;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getFlowRate() {
        return flowRate;
    }

    public void setFlowRate(double flowRate) {
        this.flowRate = flowRate;
    }

    public DoorState getInitState() {
        return initState;
    }

    public void setInitState(DoorState initState) {
        this.initState = initState;
    }

    public Map<Double, DoorState> getStates() {
        return states;
    }

    public void setStates(Map<Double, DoorState> states) {
        this.states = states;
    }

    public ConfigurableValue getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(ConfigurableValue waitTime) {
        this.waitTime = waitTime;
    }

    public List<Integer> getAcceptedProfileIds() {
        return acceptedProfileIds;
    }

    public void setAcceptedProfileIds(List<Integer> acceptedProfileIds) {
        this.acceptedProfileIds = acceptedProfileIds;
    }
}
