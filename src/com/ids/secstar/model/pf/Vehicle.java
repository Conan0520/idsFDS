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
import com.ids.secstar.model.annotations.TypeReference;
import com.ids.secstar.model.pf.space.Point;
import com.ids.secstar.model.pf.type.VehicleValueType;

import java.util.List;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Vehicle")
public class Vehicle {

    @DescribedBy("id")
    private int id;

    @DescribedBy("名称")
    private String name;

    @DescribedBy("描述")
    private String description;

    @DescribedBy("高度")
    private float height;

    @DescribedBy("动画模型")
    private AnimationModel animationModel;

    @TypeReference(VehicleValueType.class)
    @DescribedBy("人员动画")
    private int occupantAnimation;

    @DescribedBy("人员偏移量X")
    private double occupantOffsetX;

    @DescribedBy("人员偏移量Y")
    private double occupantOffsetY;

    @DescribedBy("人员偏移量Z")
    private double occupantOffsetZ;

    @DescribedBy("点")
    private List<Point> points;

    @DescribedBy("中轴")
    private Point pivot;

    @DescribedBy("人员位置")
    private List<Point> positionOfAttachedOccupants;


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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public AnimationModel getAnimationModel() {
        return animationModel;
    }

    public void setAnimationModel(AnimationModel animationModel) {
        this.animationModel = animationModel;
    }

    public int getOccupantAnimation() {
        return occupantAnimation;
    }

    public void setOccupantAnimation(int occupantAnimation) {
        this.occupantAnimation = occupantAnimation;
    }

    public double getOccupantOffsetX() {
        return occupantOffsetX;
    }

    public void setOccupantOffsetX(double occupantOffsetX) {
        this.occupantOffsetX = occupantOffsetX;
    }

    public double getOccupantOffsetY() {
        return occupantOffsetY;
    }

    public void setOccupantOffsetY(double occupantOffsetY) {
        this.occupantOffsetY = occupantOffsetY;
    }

    public double getOccupantOffsetZ() {
        return occupantOffsetZ;
    }

    public void setOccupantOffsetZ(double occupantOffsetZ) {
        this.occupantOffsetZ = occupantOffsetZ;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Point getPivot() {
        return pivot;
    }

    public void setPivot(Point pivot) {
        this.pivot = pivot;
    }

    public List<Point> getPositionOfAttachedOccupants() {
        return positionOfAttachedOccupants;
    }

    public void setPositionOfAttachedOccupants(List<Point> positionOfAttachedOccupants) {
        this.positionOfAttachedOccupants = positionOfAttachedOccupants;
    }

}
