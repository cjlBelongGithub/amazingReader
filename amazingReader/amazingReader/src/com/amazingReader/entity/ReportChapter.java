package com.amazingReader.entity;

import java.util.Date;

public class ReportChapter {
    private Integer reportId;

    private Integer chapterId;

    private Integer readerId;

    private Integer reportTypeId;

    private String reportReason;

    private Date reportTime;

    private String reportSolution;

    private Integer reportStatuId;

    private Integer reportManagerId;

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public Integer getReportTypeId() {
        return reportTypeId;
    }

    public void setReportTypeId(Integer reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public String getReportReason() {
        return reportReason;
    }

    public void setReportReason(String reportReason) {
        this.reportReason = reportReason == null ? null : reportReason.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportSolution() {
        return reportSolution;
    }

    public void setReportSolution(String reportSolution) {
        this.reportSolution = reportSolution == null ? null : reportSolution.trim();
    }

    public Integer getReportStatuId() {
        return reportStatuId;
    }

    public void setReportStatuId(Integer reportStatuId) {
        this.reportStatuId = reportStatuId;
    }

    public Integer getReportManagerId() {
        return reportManagerId;
    }

    public void setReportManagerId(Integer reportManagerId) {
        this.reportManagerId = reportManagerId;
    }
}