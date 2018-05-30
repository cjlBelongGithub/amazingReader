package com.amazingReader.entity;

import java.sql.Blob;

public class Writer {
    private Integer writerId;

    private String writerNeckName;

    private String writerPassword;

    private String writerShortRecommend;

    private String writerRealName;

    private Boolean writerSex;

    private String writerAddress;

    private String writerTel;

    private Integer writerStatuId;

    private Blob writerPortrait;
    
    private String writerAccount;
    
    

    public Writer() {
		super();
		this.writerId = 0;
		this.writerStatuId = 0;
	}

	public Integer getWriterId() {
        return writerId;
    }

    public void setWriterId(Integer writerId) {
        this.writerId = writerId;
    }

    public String getWriterNeckName() {
        return writerNeckName;
    }

    public void setWriterNeckName(String writerNeckName) {
        this.writerNeckName = writerNeckName == null ? null : writerNeckName.trim();
    }

    public String getWriterPassword() {
        return writerPassword;
    }

    public void setWriterPassword(String writerPassword) {
        this.writerPassword = writerPassword == null ? null : writerPassword.trim();
    }

    public String getWriterShortRecommend() {
        return writerShortRecommend;
    }

    public void setWriterShortRecommend(String writerShortRecommend) {
        this.writerShortRecommend = writerShortRecommend == null ? null : writerShortRecommend.trim();
    }

    public String getWriterRealName() {
        return writerRealName;
    }

    public void setWriterRealName(String writerRealName) {
        this.writerRealName = writerRealName == null ? null : writerRealName.trim();
    }

    public Boolean getWriterSex() {
        return writerSex;
    }

    public void setWriterSex(Boolean writerSex) {
        this.writerSex = writerSex;
    }

    public String getWriterAddress() {
        return writerAddress;
    }

    public void setWriterAddress(String writerAddress) {
        this.writerAddress = writerAddress == null ? null : writerAddress.trim();
    }

    public String getWriterTel() {
        return writerTel;
    }

    public void setWriterTel(String writerTel) {
        this.writerTel = writerTel == null ? null : writerTel.trim();
    }

    public Integer getWriterStatuId() {
        return writerStatuId;
    }

    public void setWriterStatuId(Integer writerStatuId) {
        this.writerStatuId = writerStatuId;
    }

    public Blob getWriterPortrait() {
        return writerPortrait;
    }

    public void setWriterPortrait(Blob writerPortrait) {
        this.writerPortrait = writerPortrait;
    }

	public String getWriterAccount() {
		return writerAccount;
	}

	public void setWriterAccount(String writerAccount) {
		this.writerAccount = writerAccount;
	}
}