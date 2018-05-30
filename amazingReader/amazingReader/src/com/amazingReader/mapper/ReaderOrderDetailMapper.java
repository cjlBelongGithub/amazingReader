package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.ReaderOrderDetail;

public interface ReaderOrderDetailMapper {
	boolean add(ReaderOrderDetail readerOrderDetail);
	boolean alter(ReaderOrderDetail readerOrderDetail);
	boolean remove(int ReaderOrderDetailId);
	List<ReaderOrderDetail> getOrderDetail(int readerId,int orderId);
	ReaderOrderDetail get(int readerId,int chapterId);
	ReaderOrderDetail getOrderDetailByOrderID(int orderId);
	
}