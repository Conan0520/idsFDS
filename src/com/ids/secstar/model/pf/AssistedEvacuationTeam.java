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
import com.ids.secstar.model.pf.type.ClientPriorityType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Xinlu on 2019/1/10.
 */
@SecAnnotated
@DescribedBy("Assisted Evacuation Team")
public class AssistedEvacuationTeam implements Serializable{

    @DescribedBy("id")
    private int id;

    @DescribedBy("名称")
    private String name;

    @DescribedBy("描述")
    private String description;

    @TypeReference(ClientPriorityType.class)
    @DescribedBy("优先级")
    private int clientPriority;

    @DescribedBy("人员")
    private List<Integer> priorityAssistantIds;

    @DescribedBy("救援人员")
    private List<Integer> assistantIds;

    @DescribedBy("被救人员")
    private List<Integer> clientIds;

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

    public int getClientPriority() {
        return clientPriority;
    }

    public void setClientPriority(int clientPriority) {
        this.clientPriority = clientPriority;
    }

    public List<Integer> getPriorityAssistantIds() {
        return priorityAssistantIds;
    }

    public void setPriorityAssistantIds(List<Integer> priorityAssistantIds) {
        this.priorityAssistantIds = priorityAssistantIds;
    }

    public List<Integer> getAssistantIds() {
        return assistantIds;
    }

    public void setAssistantIds(List<Integer> assistantIds) {
        this.assistantIds = assistantIds;
    }

    public List<Integer> getClientIds() {
        return clientIds;
    }

    public void setClientIds(List<Integer> clientIds) {
        this.clientIds = clientIds;
    }

}
