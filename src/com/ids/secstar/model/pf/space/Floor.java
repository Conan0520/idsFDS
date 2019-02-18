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

import java.util.List;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Floor")
public class Floor {

    @DescribedBy("名称")
    private int id;

    @DescribedBy("idsFloorId")
    private int idsFloorId;

    @DescribedBy("名称")
    private String name;

    @DescribedBy("描述")
    private String description;

    @DescribedBy("轮廓")
    private double[] shape;

    @DescribedBy("高度(m)")
    private double z; // Floor height, unit is meter

    @DescribedBy("避难区")
    private boolean refugeArea;

    @DescribedBy("容量")
    private Capacity capacity;

    @DescribedBy("房间")
    private List<Integer> roomIds;

    @DescribedBy("门")
    private List<Integer> doorIds;

    @DescribedBy("出口")
    private List<Integer> exitIds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdsFloorId() {
        return idsFloorId;
    }

    public void setIdsFloorId(int idsFloorId) {
        this.idsFloorId = idsFloorId;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
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

    public List<Integer> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(List<Integer> roomIds) {
        this.roomIds = roomIds;
    }

    public List<Integer> getDoorIds() {
        return doorIds;
    }

    public void setDoorIds(List<Integer> doorIds) {
        this.doorIds = doorIds;
    }

    public List<Integer> getExitIds() {
        return exitIds;
    }

    public void setExitIds(List<Integer> exitIds) {
        this.exitIds = exitIds;
    }

}
