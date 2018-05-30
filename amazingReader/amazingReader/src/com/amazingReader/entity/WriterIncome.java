package com.amazingReader.entity;

import java.util.Date;

public class WriterIncome {
    private Integer writerId;

    private Integer writerIncomeTypeId;

    private String writerIncomeTotal;

    private Date writerIncomeDate;

    private Integer readerId;

    public Integer getWriterId() {
        return writerId;
    }

    public void setWriterId(Integer writerId) {
        this.writerId = writerId;
    }

    public Integer getWriterIncomeTypeId() {
        return writerIncomeTypeId;
    }

    public void setWriterIncomeTypeId(Integer writerIncomeTypeId) {
        this.writerIncomeTypeId = writerIncomeTypeId;
    }

    public String getWriterIncomeTotal() {
        return writerIncomeTotal;
    }

    public void setWriterIncomeTotal(String writerIncomeTotal) {
        this.writerIncomeTotal = writerIncomeTotal == null ? null : writerIncomeTotal.trim();
    }

    public Date getWriterIncomeDate() {
        return writerIncomeDate;
    }

    public void setWriterIncomeDate(Date writerIncomeDate) {
        this.writerIncomeDate = writerIncomeDate;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }
}