package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.ReportComment;

public interface ReportCommentMapper {
	boolean add(ReportComment reportComment);
	boolean alter(ReportComment reportComment);
	List<ReportComment> getBymanagerId(int managerId);
}