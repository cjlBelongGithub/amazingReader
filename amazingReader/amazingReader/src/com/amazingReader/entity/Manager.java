package com.amazingReader.entity;

import java.sql.Blob;

public class Manager {
    private Integer managerId;

    private String managerNeckname;

    private String managerPassword;

    private String managerPermission;

    private Integer managerTypeId;

    private Blob managerPortrait;
    
  

    public Manager() {
		super();
		this.managerId = 0;
		this.managerTypeId = 0;
	}

	public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerNeckname() {
        return managerNeckname;
    }

    public void setManagerNeckname(String managerNeckname) {
        this.managerNeckname = managerNeckname == null ? null : managerNeckname.trim();
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword == null ? null : managerPassword.trim();
    }

    public String getManagerPermission() {
        return managerPermission;
    }

    public void setManagerPermission(String managerPermission) {
        this.managerPermission = managerPermission == null ? null : managerPermission.trim();
    }

    public Integer getManagerTypeId() {
        return managerTypeId;
    }

    public void setManagerTypeId(Integer managerTypeId) {
        this.managerTypeId = managerTypeId;
    }

    public Blob getManagerPortrait() {
        return managerPortrait;
    }

    public void setManagerPortrait(Blob managerPortrait) {
        this.managerPortrait = managerPortrait;
    }
}