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
public enum DoorState implements NameValuePair {
    OPEN(1, "Open"),
    CLOSED(2, "Closed"),
    X(3, "+X"),
    NX(4, "-X"),
    Y(5, "+Y"),
    NY(6, "-Y"),
    ;

    private final int value;
    private final String name;

    DoorState(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public final static DoorState get(int value) {
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
