package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.ReaderOrder;
import com.amazingReader.entity.ReaderOrderDetail;

public interface ReaderOrderMapper {
	boolean add(ReaderOrder readerOrder);
	boolean alter(ReaderOrder readerOrder);
	boolean remove(int ReaderOrderDetailId);
	List<ReaderOrderDetail> getOrderDetail(int orderId);
	ReaderOrder getOrderByOrderID(int orderId);

	//添加一个方法：通过读者id 得到该读者的所有订单
	List<ReaderOrder> getOrdersByReaderId(int readerId);

	
}