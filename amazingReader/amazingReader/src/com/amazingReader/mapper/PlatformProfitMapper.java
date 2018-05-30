package com.amazingReader.mapper;

import java.util.Date;

import com.amazingReader.entity.PlatformProfit;

public interface PlatformProfitMapper {
	public boolean add(PlatformProfit platformProfit);
	public double countProfit();

	public double countProfitBetween(Date dateBottom, Date dateTop);

	public double countProfitBetweenTimeByType(Date dateBottom, Date dateTop, int Type_id);
}