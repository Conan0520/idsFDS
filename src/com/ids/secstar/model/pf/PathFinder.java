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
import com.ids.secstar.model.pf.space.*;

import java.util.List;

/**
 * Created by Xinlu on 2019/1/11.
 */
@SecAnnotated
@DescribedBy("PathFinder")
public class PathFinder {

    @DescribedBy("id")
    private int id;

    @DescribedBy("消防预案Id")
    private int xfyaId;

    @DescribedBy("mallId")
    private int idsMallId;

    @DescribedBy("几何文件")
    private String geometryFile;

    @DescribedBy("相机")
    private List<ViewCamera> cameras;

    @DescribedBy("属性")
    private List<Profile> profiles;

    @DescribedBy("交通工具")
    private List<Vehicle> vehicles;

    @DescribedBy("行为")
    private List<Behavior> behaviors;

    @DescribedBy("人员")
    private List<Occupant> occupants;

    @DescribedBy("人员来源")
    private List<OccupantSource> occupantSources;

    @DescribedBy("疏散救援队")
    private List<AssistedEvacuationTeam> assistedEvacuationTeams;

    @DescribedBy("电梯")
    private List<Elevator> elevators;

    @DescribedBy("扶梯")
    private List<Escalator> escalators;

    @DescribedBy("楼梯")
    private List<Stair> stairs;

    @DescribedBy("斜梯")
    private List<Ramp> ramps;

    @DescribedBy("楼层")
    private List<Floor> floors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getXfyaId() {
        return xfyaId;
    }

    public void setXfyaId(int xfyaId) {
        this.xfyaId = xfyaId;
    }

    public int getIdsMallId() {
        return idsMallId;
    }

    public void setIdsMallId(int idsMallId) {
        this.idsMallId = idsMallId;
    }

    public String getGeometryFile() {
        return geometryFile;
    }

    public void setGeometryFile(String geometryFile) {
        this.geometryFile = geometryFile;
    }

    public List<ViewCamera> getCameras() {
        return cameras;
    }

    public void setCameras(List<ViewCamera> cameras) {
        this.cameras = cameras;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Behavior> getBehaviors() {
        return behaviors;
    }

    public void setBehaviors(List<Behavior> behaviors) {
        this.behaviors = behaviors;
    }

    public List<Occupant> getOccupants() {
        return occupants;
    }

    public void setOccupants(List<Occupant> occupants) {
        this.occupants = occupants;
    }

    public List<OccupantSource> getOccupantSources() {
        return occupantSources;
    }

    public void setOccupantSources(List<OccupantSource> occupantSources) {
        this.occupantSources = occupantSources;
    }

    public List<AssistedEvacuationTeam> getAssistedEvacuationTeams() {
        return assistedEvacuationTeams;
    }

    public void setAssistedEvacuationTeams(List<AssistedEvacuationTeam> assistedEvacuationTeams) {
        this.assistedEvacuationTeams = assistedEvacuationTeams;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public List<Escalator> getEscalators() {
        return escalators;
    }

    public void setEscalators(List<Escalator> escalators) {
        this.escalators = escalators;
    }

    public List<Stair> getStairs() {
        return stairs;
    }

    public void setStairs(List<Stair> stairs) {
        this.stairs = stairs;
    }

    public List<Ramp> getRamps() {
        return ramps;
    }

    public void setRamps(List<Ramp> ramps) {
        this.ramps = ramps;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

}
