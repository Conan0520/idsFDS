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
import com.ids.secstar.model.pf.type.RoomType;

import java.util.HashMap;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Room")
public class Room extends Component{

    @DescribedBy("楼层Id")
    private int floorId;

    @DescribedBy("店铺Id")
    private int idsShopId;

    @DescribedBy("房间类型")
    private RoomType roomType;

    @DescribedBy("名称")
    private String name;

    @DescribedBy("描述")
    private String description;

    @DescribedBy("轮廓")
    private double[] shape;

    @DescribedBy("避难区")
    private boolean refugeArea;

    @DescribedBy("人数")
    private int persons;

    @DescribedBy("速度调节")
    private HashMap<Double, Double> speedModifier;

    @DescribedBy("容量")
    private Capacity capacity;

    @DescribedBy("属性Id")
    private int[] acceptedProfileIds;

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public int getIdsShopId() {
        return idsShopId;
    }

    public void setIdsShopId(int idsShopId) {
        this.idsShopId = idsShopId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
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

    public double[] getShape() {
        return shape;
    }

    public void setShape(double[] shape) {
        this.shape = shape;
    }

    public boolean isRefugeArea() {
        return refugeArea;
    }

    public void setRefugeArea(boolean refugeArea) {
        this.refugeArea = refugeArea;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public HashMap<Double, Double> getSpeedModifier() {
        return speedModifier;
    }

    public void setSpeedModifier(HashMap<Double, Double> speedModifier) {
        this.speedModifier = speedModifier;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public int[] getAcceptedProfileIds() {
        return acceptedProfileIds;
    }

    public void setAcceptedProfileIds(int[] acceptedProfileIds) {
        this.acceptedProfileIds = acceptedProfileIds;
    }

}
