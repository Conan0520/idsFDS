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
public enum RoomDensityType implements NameValuePair {
    ASSEMBLY_CONCENTRATED(1, "Assembly (Concentrated) - 0.65 m2 / pers"),
    ASSEMBLY_UNCONCENTRATED(2, "Assembly (Unconcentrated) - 1.39 m2 / pers"),
    BUSINESS(3, "Business (gross) - 9.29 m2 / pers"),
    COURTROOMS(4, "Courtrooms - 3.72 m2 / pers"),
    EMPTY(5, "Empty"),
    GROSS(6, "Industrial (gross) - 9.29 m2 / pers"),
    INPATIENT(7, "Institutional (Inpatient) - 22.3 m2 / pers"),
    OUT_PATIENT(8, "Institutional (OutPatient) - 9.29 m2 / pers"),
    SLEEPING(9, "Institutional (Sleeping) - 9.29 m2 / pers"),
    READING_ROOM(10, "Library (Reading Room) - 4.65 m2 / pers"),
    STACKS(11, "Library (Stacks) - 9.29 m2 / pers"),
    STORAGE(12, "Mechanical / Storage - 27.87 m2 / pers"),
    MERCANTILE_STORAGE(13, "Mercantile (Storage) - 27.87 m2 / pers"),
    MERCANTILE_GRADE(14, "Mercantile (Grade) - 2.79 m2 / pers"),
    MERCANTILE_PUBLIC(15, "Mercantile (Public / Other) - 5.57 m2 / pers"),
    PARKING_GARAGE(16, "Parking Garage - 18.58 m2 / pers"),
    RESIDENTIAL(17, "Residential - 18.58 m2 / pers"),
    RESTAURANT(18, "Restaurant - 1.39 m2 / pers"),
    WAITING_SPACES(19, "Waiting Spaces - 0.28 m2 / pers"),
    ;

    private final int value;
    private final String name;

    RoomDensityType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public final static RoomDensityType get(int value) {
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
