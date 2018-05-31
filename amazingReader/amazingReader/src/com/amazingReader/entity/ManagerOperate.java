package com.amazingReader.entity;

public class ManagerOperate {
    private Integer managerOperateId;

    private String managerOperateName;
    
    public ManagerOperate() {
	}

    public Integer getManagerOperateId() {
        return managerOperateId;
    }

    public void setManagerOperateId(Integer managerOperateId) {
        this.managerOperateId = managerOperateId;
    }

    public String getManagerOperateName() {
        return managerOperateName;
    }

    public void setManagerOperateName(String managerOperateName) {
        this.managerOperateName = managerOperateName == null ? null : managerOperateName.trim();
    }
}