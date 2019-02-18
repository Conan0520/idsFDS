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
import com.ids.secstar.model.pf.type.Capacity;
import com.ids.secstar.model.pf.type.OneWayStair;

import java.util.List;
import java.util.Map;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Ramp")
public class Ramp extends Component {

    @DescribedBy("顶部idsPopId")
    private int topIdsPopId;

    @DescribedBy("底部idsPopId")
    private int bottomIdsPopId;

    @DescribedBy("idsPathId")
    private int idsPathId;

    @DescribedBy("长度")
    private double length;

    @DescribedBy("宽度")
    private double width;

    @DescribedBy("上方门")
    private Door topDoor;

    @DescribedBy("下方门")
    private Door bottomDoor;

    @DescribedBy("是否避难区")
    private boolean refugeArea;

    @DescribedBy("容量")
    private Capacity capacity;

    @DescribedBy("单向")
    private OneWayStair oneWay;

    @DescribedBy("初始速度")
    private double initSpeed;

    @DescribedBy("速度")
    private Map<Double, Double> speedModifier;

    @DescribedBy("扶梯")
    private boolean escalator;

    @DescribedBy("扶梯速度")
    private double escalatorSpeed;

    @DescribedBy("扶梯速度")
    private Map<Double, Double> escalatorSpeedModifier;

    @DescribedBy("接受配置Id")
    private List<Integer> acceptedProfileIds;

    public int getTopIdsPopId() {
        return topIdsPopId;
    }

    public void setTopIdsPopId(int topIdsPopId) {
        this.topIdsPopId = topIdsPopId;
    }

    public int getBottomIdsPopId() {
        return bottomIdsPopId;
    }

    public void setBottomIdsPopId(int bottomIdsPopId) {
        this.bottomIdsPopId = bottomIdsPopId;
    }

    public int getIdsPathId() {
        return idsPathId;
    }

    public void setIdsPathId(int idsPathId) {
        this.idsPathId = idsPathId;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Door getTopDoor() {
        return topDoor;
    }

    public void setTopDoor(Door topDoor) {
        this.topDoor = topDoor;
    }

    public Door getBottomDoor() {
        return bottomDoor;
    }

    public void setBottomDoor(Door bottomDoor) {
        this.bottomDoor = bottomDoor;
    }

    public boolean isRefugeArea() {
        return refugeArea;
    }

    public void setRefugeArea(boolean refugeArea) {
        this.refugeArea = refugeArea;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public OneWayStair getOneWay() {
        return oneWay;
    }

    public void setOneWay(OneWayStair oneWay) {
        this.oneWay = oneWay;
    }

    public double getInitSpeed() {
        return initSpeed;
    }

    public void setInitSpeed(double initSpeed) {
        this.initSpeed = initSpeed;
    }

    public Map<Double, Double> getSpeedModifier() {
        return speedModifier;
    }

    public void setSpeedModifier(Map<Double, Double> speedModifier) {
        this.speedModifier = speedModifier;
    }

    public boolean isEscalator() {
        return escalator;
    }

    public void setEscalator(boolean escalator) {
        this.escalator = escalator;
    }

    public double getEscalatorSpeed() {
        return escalatorSpeed;
    }

    public void setEscalatorSpeed(double escalatorSpeed) {
        this.escalatorSpeed = escalatorSpeed;
    }

    public Map<Double, Double> getEscalatorSpeedModifier() {
        return escalatorSpeedModifier;
    }

    public void setEscalatorSpeedModifier(Map<Double, Double> escalatorSpeedModifier) {
        this.escalatorSpeedModifier = escalatorSpeedModifier;
    }

    public List<Integer> getAcceptedProfileIds() {
        return acceptedProfileIds;
    }

    public void setAcceptedProfileIds(List<Integer> acceptedProfileIds) {
        this.acceptedProfileIds = acceptedProfileIds;
    }

}
