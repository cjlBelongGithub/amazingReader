package com.amazingReader.entity;

import java.sql.Blob;

public class ChapterAdditionRemarks {
    private Integer bookChapterId;

    private String bookCharacter;
    
    private Blob bookImg1;

    private Blob bookImag2;

    private Blob bookImag3;

    public Blob getBookImg1() {
        return bookImg1;
    }
    
    public ChapterAdditionRemarks() {
	}

    public void setBookImg1(Blob bookImg1) {
        this.bookImg1 = bookImg1;
    }

    public Blob getBookImag2() {
        return bookImag2;
    }

    public void setBookImag2(Blob bookImag2) {
        this.bookImag2 = bookImag2;
    }

    public Blob getBookImag3() {
        return bookImag3;
    }

    public void setBookImag3(Blob bookImag3) {
        this.bookImag3 = bookImag3;
    }
    

    public Integer getBookChapterId() {
        return bookChapterId;
    }

    public void setBookChapterId(Integer bookChapterId) {
        this.bookChapterId = bookChapterId;
    }

    public String getBookCharacter() {
        return bookCharacter;
    }

    public void setBookCharacter(String bookCharacter) {
        this.bookCharacter = bookCharacter == null ? null : bookCharacter.trim();
    }
}