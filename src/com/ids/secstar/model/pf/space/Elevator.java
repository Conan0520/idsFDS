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

import java.util.List;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Elevator")
public class Elevator extends Component {

    @DescribedBy("idsPopIds")
    private List<Integer> idsPopIds;

    @DescribedBy("上层楼层Id")
    private int topIdsFloorId;

    @DescribedBy("下层楼层Id")
    private int bottomIdsFloorId;

    @DescribedBy("额定负载")
    private double nominalLoad;

    @DescribedBy("打开延迟")
    private double openDelay;

    @DescribedBy("关闭延迟")
    private double closeDelay;

    @DescribedBy("下客楼层Id")
    private int dischargeFloorId;

    @DescribedBy("初始楼层Id")
    private int initialFloorId;

    @DescribedBy("楼层优先级")
    private List<Integer> floorPriority;

    @DescribedBy("操控距离")
    private double callDistance;

    @DescribedBy("是否双层")
    private boolean doubleDeck;

    public List<Integer> getIdsPopIds() {
        return idsPopIds;
    }

    public void setIdsPopIds(List<Integer> idsPopIds) {
        this.idsPopIds = idsPopIds;
    }

    public int getTopIdsFloorId() {
        return topIdsFloorId;
    }

    public void setTopIdsFloorId(int topIdsFloorId) {
        this.topIdsFloorId = topIdsFloorId;
    }

    public int getBottomIdsFloorId() {
        return bottomIdsFloorId;
    }

    public void setBottomIdsFloorId(int bottomIdsFloorId) {
        this.bottomIdsFloorId = bottomIdsFloorId;
    }

    public double getNominalLoad() {
        return nominalLoad;
    }

    public void setNominalLoad(double nominalLoad) {
        this.nominalLoad = nominalLoad;
    }

    public double getOpenDelay() {
        return openDelay;
    }

    public void setOpenDelay(double openDelay) {
        this.openDelay = openDelay;
    }

    public double getCloseDelay() {
        return closeDelay;
    }

    public void setCloseDelay(double closeDelay) {
        this.closeDelay = closeDelay;
    }

    public int getDischargeFloorId() {
        return dischargeFloorId;
    }

    public void setDischargeFloorId(int dischargeFloorId) {
        this.dischargeFloorId = dischargeFloorId;
    }

    public int getInitialFloorId() {
        return initialFloorId;
    }

    public void setInitialFloorId(int initialFloorId) {
        this.initialFloorId = initialFloorId;
    }

    public List<Integer> getFloorPriority() {
        return floorPriority;
    }

    public void setFloorPriority(List<Integer> floorPriority) {
        this.floorPriority = floorPriority;
    }

    public double getCallDistance() {
        return callDistance;
    }

    public void setCallDistance(double callDistance) {
        this.callDistance = callDistance;
    }

    public boolean isDoubleDeck() {
        return doubleDeck;
    }

    public void setDoubleDeck(boolean doubleDeck) {
        this.doubleDeck = doubleDeck;
    }

}
