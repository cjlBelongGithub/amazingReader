package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.ReportChapter;

public interface ReportChapterMapper {
	boolean add(ReportChapter reportChapter);
	boolean alter(ReportChapter reportChapter);
	List<ReportChapter> getBymanagerId(int managerId);
	
}