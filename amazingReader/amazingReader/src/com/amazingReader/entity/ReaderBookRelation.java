package com.amazingReader.entity;

import java.util.Date;

public class ReaderBookRelation {
    private Integer readerId;

    private Integer readerBookBookId;

    private Integer readerBookReadingChapterNum;

    private Date readerBookAddTime;
    
    public ReaderBookRelation() {
	}

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public Integer getReaderBookBookId() {
        return readerBookBookId;
    }

    public void setReaderBookBookId(Integer readerBookBookId) {
        this.readerBookBookId = readerBookBookId;
    }

    public Integer getReaderBookReadingChapterNum() {
        return readerBookReadingChapterNum;
    }

    public void setReaderBookReadingChapterNum(Integer readerBookReadingChapterNum) {
        this.readerBookReadingChapterNum = readerBookReadingChapterNum;
    }

    public Date getReaderBookAddTime() {
        return readerBookAddTime;
    }

    public void setReaderBookAddTime(Date readerBookAddTime) {
        this.readerBookAddTime = readerBookAddTime;
    }
}