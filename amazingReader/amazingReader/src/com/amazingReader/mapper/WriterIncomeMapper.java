package com.amazingReader.mapper;

import java.util.List;
import java.util.Map;

import com.amazingReader.entity.WriterIncome;

public interface WriterIncomeMapper {
	boolean add(WriterIncome writerIncome);
	List<WriterIncome> getByWriterId(int writerId);
	/**
	 * 按作家分组获得各个作家的收入
	 * 可用于制作作家收入榜
	 * @return
	 */
	Map<String, Double> countByWriterProfit();
}