package com.amazingReader.entity;

import java.sql.Blob;
import java.util.Date;

public class Reader {
    private Integer readerId;

    private String readerNeckName;

    private String readerPassword;

    private Double readerBalance;

    private Integer readerLevel;

    private Integer readerStatuId;

    private Integer readerRecommendTicket;

    private Boolean readerSex;

    private Date readerBirthday;

    private String readerColor;

    private String readerTel;

    private Blob readerPortrait;
    
    public Reader() {
		super();
		this.readerId = 0;
		this.readerLevel = 0;
		this.readerStatuId = 0;
		this.readerRecommendTicket = 0;
	}

	public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public String getReaderNeckName() {
        return readerNeckName;
    }

    public void setReaderNeckName(String readerNeckName) {
        this.readerNeckName = readerNeckName == null ? null : readerNeckName.trim();
    }

    public String getReaderPassword() {
        return readerPassword;
    }

    public void setReaderPassword(String readerPassword) {
        this.readerPassword = readerPassword == null ? null : readerPassword.trim();
    }

    public Double getReaderBalance() {
        return readerBalance;
    }

    public void setReaderBalance(Double readerBalance) {
        this.readerBalance = readerBalance;
    }

    public Integer getReaderLevel() {
        return readerLevel;
    }

    public void setReaderLevel(Integer readerLevel) {
        this.readerLevel = readerLevel;
    }

    public Integer getReaderStatuId() {
        return readerStatuId;
    }

    public void setReaderStatuId(Integer readerStatuId) {
        this.readerStatuId = readerStatuId;
    }

    public Integer getReaderRecommendTicket() {
        return readerRecommendTicket;
    }

    public void setReaderRecommendTicket(Integer readerRecommendTicket) {
        this.readerRecommendTicket = readerRecommendTicket;
    }

    public Boolean getReaderSex() {
        return readerSex;
    }

    public void setReaderSex(Boolean readerSex) {
        this.readerSex = readerSex;
    }

    public Date getReaderBirthday() {
        return readerBirthday;
    }

    public void setReaderBirthday(Date readerBirthday) {
        this.readerBirthday = readerBirthday;
    }

    public String getReaderColor() {
        return readerColor;
    }

    public void setReaderColor(String readerColor) {
        this.readerColor = readerColor;
    }

    public String getReaderTel() {
        return readerTel;
    }

    public void setReaderTel(String readerTel) {
        this.readerTel = readerTel == null ? null : readerTel.trim();
    }

    public Blob getReaderPortrait() {
        return readerPortrait;
    }

    public void setReaderPortrait(Blob readerPortrait) {
        this.readerPortrait = readerPortrait;
    }
}