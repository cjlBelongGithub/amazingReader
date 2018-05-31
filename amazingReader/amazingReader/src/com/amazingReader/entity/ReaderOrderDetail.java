package com.amazingReader.entity;

public class ReaderOrderDetail {
    private Integer readerOrderId;

    private Integer readerOrderDetailChapterId;

    private Integer readerOrderDetailBookId;

    private Double readerOrderDetailPrice;
    
    private int readerId;
    
    public ReaderOrderDetail() {
	}

    public Integer getReaderOrderId() {
        return readerOrderId;
    }

    public void setReaderOrderId(Integer readerOrderId) {
        this.readerOrderId = readerOrderId;
    }

    public Integer getReaderOrderDetailChapterId() {
        return readerOrderDetailChapterId;
    }

    public void setReaderOrderDetailChapterId(Integer readerOrderDetailChapterId) {
        this.readerOrderDetailChapterId = readerOrderDetailChapterId;
    }

    public Integer getReaderOrderDetailBookId() {
        return readerOrderDetailBookId;
    }

    public void setReaderOrderDetailBookId(Integer readerOrderDetailBookId) {
        this.readerOrderDetailBookId = readerOrderDetailBookId;
    }

    public Double getReaderOrderDetailPrice() {
        return readerOrderDetailPrice;
    }

    public void setReaderOrderDetailPrice(Double readerOrderDetailPrice) {
        this.readerOrderDetailPrice = readerOrderDetailPrice;
    }

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
}