package com.amazingReader.entity;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Integer commentTid;

    private Integer commentCommentedId;

    private Integer commentReaderId;

    private Integer commentBookId;

    private Integer commentChapterId;

    private Date commentPushDate;

    private String commentContent;

    private Integer commentLikeNum;

    private Boolean commentStatu;


    /**
     * 用户评分
     */
    private Integer commentGraded;

    private boolean commentIsRead;
    
    public Comment() {
		// TODO Auto-generated constructor stub
	}

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentTid() {
        return commentTid;
    }

    public void setCommentTid(Integer commentTid) {
        this.commentTid = commentTid;
    }

    public Integer getCommentCommentedId() {
        return commentCommentedId;
    }

    public void setCommentCommentedId(Integer commentCommentedId) {
        this.commentCommentedId = commentCommentedId;
    }

    public Integer getCommentReaderId() {
        return commentReaderId;
    }

    public void setCommentReaderId(Integer commentReaderId) {
        this.commentReaderId = commentReaderId;
    }

    public Integer getCommentBookId() {
        return commentBookId;
    }

    public void setCommentBookId(Integer commentBookId) {
        this.commentBookId = commentBookId;
    }

    public Integer getCommentChapterId() {
        return commentChapterId;
    }

    public void setCommentChapterId(Integer commentChapterId) {
        this.commentChapterId = commentChapterId;
    }

    public Date getCommentPushDate() {
        return commentPushDate;
    }

    public void setCommentPushDate(Date commentPushDate) {
        this.commentPushDate = commentPushDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getCommentLikeNum() {
        return commentLikeNum;
    }

    public void setCommentLikeNum(Integer commentLikeNum) {
        this.commentLikeNum = commentLikeNum;
    }

    public Boolean getCommentStatu() {
        return commentStatu;
    }

    public void setCommentStatu(Boolean commentStatu) {
        this.commentStatu = commentStatu;
    }

    public Integer getCommentGraded() {
        return commentGraded;
    }

    public void setCommentGraded(Integer commentGraded) {
        this.commentGraded = commentGraded;
    }

    public boolean isCommentIsRead() {
        return commentIsRead;
    }

    public void setCommentIsRead(boolean commentIsRead) {
        this.commentIsRead = commentIsRead;
    }
}