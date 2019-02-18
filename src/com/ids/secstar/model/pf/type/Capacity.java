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

package com.ids.secstar.model.pf.type;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Capacity")
public class Capacity {

    private RoomCapacityType roomCapacityType;

    private double capacity;

    private double density;

    private RoomDensityType roomDensityType;

    public RoomCapacityType getRoomCapacityType() {
        return roomCapacityType;
    }

    public void setRoomCapacityType(RoomCapacityType roomCapacityType) {
        this.roomCapacityType = roomCapacityType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public RoomDensityType getRoomDensityType() {
        return roomDensityType;
    }

    public void setRoomDensityType(RoomDensityType roomDensityType) {
        this.roomDensityType = roomDensityType;
    }

}
