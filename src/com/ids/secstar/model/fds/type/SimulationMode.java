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
 * @author - IDS R&D Group - Patrick Zhang
 * @date   - 2015-06-29 16:23
 */

package com.ids.secstar.model.fds.type;

import com.ids.model.map.type.NameValuePair;

//  basic modes of operation
public enum SimulationMode implements NameValuePair {
    DNS(10, "Direction Numerical Simulation"),
    LES(20, "Large Eddy Simulation"),
    VLES(30, "Very Large Eddy Simulation"),
    SVLES(40, "Simple Very Large Eddy Simulation—VLES with simplified physics");

    private final int value;
    private final String name;

    SimulationMode(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public final static SimulationMode get(int value) {
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
