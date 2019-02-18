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
import com.ids.secstar.model.pf.type.CharacterShapeType;
import com.ids.secstar.model.pf.type.ConfigurableValue;
import com.ids.secstar.model.pf.type.ValueType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Profile")
public class Profile implements Serializable{

    @DescribedBy("id")
    private int id;

    @DescribedBy("名称")
    private String name;

    @DescribedBy("描述")
    private String description;

    @DescribedBy("动画模型")
    private List<AnimationModel> animationModels;

    @DescribedBy("颜色")
    private int color;

    @DescribedBy("颜色")
    private int[] rgb = new int[3];

    @DescribedBy("优先级")
    private int priorityLevel;

    @DescribedBy("速度")
    private ConfigurableValue speed;

    @DescribedBy("角色形状类型")
    private CharacterShapeType shapeType;

    // cylinder
    @DescribedBy("圆柱直径")
    private ConfigurableValue cylinderDiameter;

    @DescribedBy("圆柱高度")
    private ConfigurableValue cylinderHeight;

    @DescribedBy("是否减少圆柱直径")
    private boolean cylinderDiameterReduced;

    @DescribedBy("圆柱换算系数")
    private double cylinderReductionFactor;

    @DescribedBy("是否减少圆柱直径通过隘口")
    private boolean cylinderDiameterReducedToPassNarrow;

    @DescribedBy("圆柱最小直径")
    private double cylinderMinDiameter;

    // polygon
    @DescribedBy("交通工具Id")
    private int vehicleId;

    @DescribedBy("交通工具Id")
    private Vehicle vehicle;

    @DescribedBy("是否减少多边形直径")
    private boolean polygonDiameterReduced;

    @DescribedBy("圆柱换算系数")
    private double polygonReductionFactor;

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

    public List<AnimationModel> getAnimationModels() {
        return animationModels;
    }

    public void setAnimationModels(List<AnimationModel> animationModels) {
        this.animationModels = animationModels;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public ConfigurableValue getSpeed() {
        return speed;
    }

    public void setSpeed(ConfigurableValue speed) {
        this.speed = speed;
    }

    public CharacterShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(CharacterShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ConfigurableValue getCylinderDiameter() {
        return cylinderDiameter;
    }

    public void setCylinderDiameter(ConfigurableValue cylinderDiameter) {
        this.cylinderDiameter = cylinderDiameter;
    }

    public ConfigurableValue getCylinderHeight() {
        return cylinderHeight;
    }

    public void setCylinderHeight(ConfigurableValue cylinderHeight) {
        this.cylinderHeight = cylinderHeight;
    }

    public boolean isCylinderDiameterReduced() {
        return cylinderDiameterReduced;
    }

    public void setCylinderDiameterReduced(boolean cylinderDiameterReduced) {
        this.cylinderDiameterReduced = cylinderDiameterReduced;
    }

    public double getCylinderReductionFactor() {
        return cylinderReductionFactor;
    }

    public void setCylinderReductionFactor(double cylinderReductionFactor) {
        this.cylinderReductionFactor = cylinderReductionFactor;
    }

    public boolean isCylinderDiameterReducedToPassNarrow() {
        return cylinderDiameterReducedToPassNarrow;
    }

    public void setCylinderDiameterReducedToPassNarrow(boolean cylinderDiameterReducedToPassNarrow) {
        this.cylinderDiameterReducedToPassNarrow = cylinderDiameterReducedToPassNarrow;
    }

    public double getCylinderMinDiameter() {
        return cylinderMinDiameter;
    }

    public void setCylinderMinDiameter(double cylinderMinDiameter) {
        this.cylinderMinDiameter = cylinderMinDiameter;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isPolygonDiameterReduced() {
        return polygonDiameterReduced;
    }

    public void setPolygonDiameterReduced(boolean polygonDiameterReduced) {
        this.polygonDiameterReduced = polygonDiameterReduced;
    }

    public double getPolygonReductionFactor() {
        return polygonReductionFactor;
    }

    public void setPolygonReductionFactor(double polygonReductionFactor) {
        this.polygonReductionFactor = polygonReductionFactor;
    }

}
