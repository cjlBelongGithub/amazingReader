package com.amazingReader.entity;

public class ManangerOperateLog {
    private Integer managerLogId;

    private Integer managerId;

    private Integer managerOperateId;

    private String managerOperateObject;
    
    public ManangerOperateLog() {
	}

    public Integer getManagerLogId() {
        return managerLogId;
    }

    public void setManagerLogId(Integer managerLogId) {
        this.managerLogId = managerLogId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getManagerOperateId() {
        return managerOperateId;
    }

    public void setManagerOperateId(Integer managerOperateId) {
        this.managerOperateId = managerOperateId;
    }

    public String getManagerOperateObject() {
        return managerOperateObject;
    }

    public void setManagerOperateObject(String managerOperateObject) {
        this.managerOperateObject = managerOperateObject == null ? null : managerOperateObject.trim();
    }
}