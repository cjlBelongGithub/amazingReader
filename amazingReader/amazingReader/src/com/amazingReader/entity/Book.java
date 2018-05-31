package com.amazingReader.entity;

import java.sql.Blob;

public class Book {
    private Integer bookId;

    private String bookName;

    private Integer bookWriterId;

    private Integer bookStatuId;

    private Integer bookStyleId;

    private Integer bookRecommendTicket;

    private String bookShortDescribe;

    private Integer bookCollectedNum;

    private Boolean bookActivityStatu;

    private Blob bookCover;
    
    private Integer clickTimes;
    
    public Book() {
		super();
		this.bookId = 0;
		this.bookWriterId = 0;
		this.bookStatuId = 0;
		this.bookStyleId = 0;
		this.bookRecommendTicket = 0;
		this.bookCollectedNum = 0;
		this.clickTimes = 0;
	}



	public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Integer getBookWriterId() {
        return bookWriterId;
    }

    public void setBookWriterId(Integer bookWriterId) {
        this.bookWriterId = bookWriterId;
    }

    public Integer getBookStatu() {
        return bookStatuId;
    }

    public void setBookStatu(Integer bookStatuId) {
        this.bookStatuId = bookStatuId;
    }

    public Integer getBookStyleId() {
        return bookStyleId;
    }

    public void setBookStyleId(Integer bookStyleId) {
        this.bookStyleId = bookStyleId;
    }

    public Integer getBookRecommendTicket() {
        return bookRecommendTicket;
    }

    public void setBookRecommendTicket(Integer bookRecommendTicket) {
        this.bookRecommendTicket = bookRecommendTicket;
    }

    public String getBookShortDescribe() {
        return bookShortDescribe;
    }

    public void setBookShortDescribe(String bookShortDescribe) {
        this.bookShortDescribe = bookShortDescribe == null ? null : bookShortDescribe.trim();
    }

    public Integer getBookCollectedNum() {
        return bookCollectedNum;
    }

    public void setBookCollectedNum(Integer bookCollectedNum) {
        this.bookCollectedNum = bookCollectedNum;
    }

    public Boolean getBookActivityStatu() {
        return bookActivityStatu;
    }

    public void setBookActivityStatu(Boolean bookActivityStatu) {
        this.bookActivityStatu = bookActivityStatu;
    }

    public Blob getBookCover() {
        return bookCover;
    }

    public void setBookCover(Blob bookCover) {
        this.bookCover = bookCover;
    }



	public Integer getClickTimes() {
		return clickTimes;
	}



	public void setClickTimes(Integer clickTimes) {
		this.clickTimes = clickTimes;
	}
}
