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

import com.ids.model.map.type.NameValuePair;

//
public enum BehaviorActionType implements NameValuePair {
    GOTO_EXITS(1, "Goto Exits"),
    GOTO_ROOMS(2, "Goto Rooms"),
    GOTO_ELEVATORS(3, "Goto Elevators"),
    GOTO_WAYPOINT(4, "Goto Waypoint"),
    WAIT(5, "Wait"),
    WAIT_UNTIL(6, "Wait Until"),
    CHANGE_BEHAVIOR(7, "Change Behavior"),
    ASSIST_OCCUPANT(8, "Assist Occupant"),
    WAIT_ASSISTANCE(9, "Wait For Assistance"),
    DETACH_ASSISTANCE(10, "Detach From Assistance"),
    GOTO_REFUGE_ROOMS(11, "Goto Refuge Rooms"),;

    private final int value;
    private final String name;

    BehaviorActionType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public final static BehaviorActionType get(int value) {
        for (int i = 0; i < values().length; i++) {
            if (values()[i].value == value) {
                return values()[i];
            }
        }
        return null;
    }

    public String toString() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
