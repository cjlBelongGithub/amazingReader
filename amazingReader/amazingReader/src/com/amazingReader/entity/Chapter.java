package com.amazingReader.entity;

import java.util.Date;

public class Chapter {
    private Integer chapterId;

    private Integer chapterNum;

    private Integer chapterBookId;

    private String chapterName;

    private Integer chapterWordNum;

    private Integer chapterClickNum;

    private Double chapterPrice;

    private Date chapterRefreshTime;

    private Boolean chapterStatu;

    private String chapterContent;

    private Boolean chapterAddition;
    
    public Chapter() {
		// TODO Auto-generated constructor stub
	}

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getChapterNum() {
        return chapterNum;
    }

    public void setChapterNum(Integer chapterNum) {
        this.chapterNum = chapterNum;
    }

    public Integer getChapterBookId() {
        return chapterBookId;
    }

    public void setChapterBookId(Integer chapterBookId) {
        this.chapterBookId = chapterBookId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Integer getChapterWordNum() {
        return chapterWordNum;
    }

    public void setChapterWordNum(Integer chapterWordNum) {
        this.chapterWordNum = chapterWordNum;
    }

    public Integer getChapterClickNum() {
        return chapterClickNum;
    }

    public void setChapterClickNum(Integer chapterClickNum) {
        this.chapterClickNum = chapterClickNum;
    }

    public Double getChapterPrice() {
        return chapterPrice;
    }

    public void setChapterPrice(Double chapterPrice) {
        this.chapterPrice = chapterPrice;
    }

    public Date getChapterRefreshTime() {
        return chapterRefreshTime;
    }

    public void setChapterRefreshTime(Date chapterRefreshTime) {
        this.chapterRefreshTime = chapterRefreshTime;
    }

    public Boolean getChapterStatu() {
        return chapterStatu;
    }

    public void setChapterStatu(Boolean chapterStatu) {
        this.chapterStatu = chapterStatu;
    }

    public String getChapterContent() {
        return chapterContent;
    }

    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent;
    }

    public Boolean getChapterAddition() {
        return chapterAddition;
    }

    public void setChapterAddition(Boolean chapterAddition) {
        this.chapterAddition = chapterAddition;
    }
}
