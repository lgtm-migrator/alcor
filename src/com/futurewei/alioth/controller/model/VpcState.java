package com.futurewei.alioth.controller.model;

import lombok.Data;

@Data
public class VpcState {

    private String projectId;
    private String id;
    private String name;
    private String cidr;

    public VpcState() {}

    public VpcState(String projectId, String id, String name, String cidr){
        this.projectId = projectId;
        this.id = id;
        this.name = name;
        this.cidr = cidr;
    }

}


