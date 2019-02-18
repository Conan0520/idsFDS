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

package com.ids.secstar.model.pf.action;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;
import com.ids.secstar.model.pf.type.ConfigurableValue;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Wait Until")
public class WaitUntil extends BehaviorAction {

    @DescribedBy("等待时间")
    private ConfigurableValue waitUtilTime;

    public ConfigurableValue getWaitUtilTime() {
        return waitUtilTime;
    }

    public void setWaitUtilTime(ConfigurableValue waitUtilTime) {
        this.waitUtilTime = waitUtilTime;
    }

}
