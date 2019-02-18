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

import java.util.Map;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Configurable Value")
public class ConfigurableValue {

    private ValueType valueType;

    private double constantValue;

    private double uniformMin;

    private double uniformMax;

    private double normalMin;

    private double normalMax;

    private double normalMean;

    private double normalStdDev;

    private double logNormalMin;

    private double logNormalMax;

    private double logNormalLocation;

    private double logNormalScale;

    private Map<Double, Double> discretePercentageValue;

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public double getConstantValue() {
        return constantValue;
    }

    public void setConstantValue(double constantValue) {
        this.constantValue = constantValue;
    }

    public double getUniformMin() {
        return uniformMin;
    }

    public void setUniformMin(double uniformMin) {
        this.uniformMin = uniformMin;
    }

    public double getUniformMax() {
        return uniformMax;
    }

    public void setUniformMax(double uniformMax) {
        this.uniformMax = uniformMax;
    }

    public double getNormalMin() {
        return normalMin;
    }

    public void setNormalMin(double normalMin) {
        this.normalMin = normalMin;
    }

    public double getNormalMax() {
        return normalMax;
    }

    public void setNormalMax(double normalMax) {
        this.normalMax = normalMax;
    }

    public double getNormalMean() {
        return normalMean;
    }

    public void setNormalMean(double normalMean) {
        this.normalMean = normalMean;
    }

    public double getNormalStdDev() {
        return normalStdDev;
    }

    public void setNormalStdDev(double normalStdDev) {
        this.normalStdDev = normalStdDev;
    }

    public double getLogNormalMin() {
        return logNormalMin;
    }

    public void setLogNormalMin(double logNormalMin) {
        this.logNormalMin = logNormalMin;
    }

    public double getLogNormalMax() {
        return logNormalMax;
    }

    public void setLogNormalMax(double logNormalMax) {
        this.logNormalMax = logNormalMax;
    }

    public double getLogNormalLocation() {
        return logNormalLocation;
    }

    public void setLogNormalLocation(double logNormalLocation) {
        this.logNormalLocation = logNormalLocation;
    }

    public double getLogNormalScale() {
        return logNormalScale;
    }

    public void setLogNormalScale(double logNormalScale) {
        this.logNormalScale = logNormalScale;
    }

    public Map<Double, Double> getDiscretePercentageValue() {
        return discretePercentageValue;
    }

    public void setDiscretePercentageValue(Map<Double, Double> discretePercentageValue) {
        this.discretePercentageValue = discretePercentageValue;
    }

}
