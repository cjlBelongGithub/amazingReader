package com.amazingReader.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazingReader.entity.Manager;
import com.amazingReader.entity.ReportChapter;
import com.amazingReader.entity.ReportComment;
import com.amazingReader.mapper.ManagerMapper;
import com.amazingReader.mapper.ReportChapterMapper;
import com.amazingReader.mapper.ReportCommentMapper;
import com.amazingReader.service.Interface.ManagerService;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService{
	@Autowired
	private ManagerMapper managerMapper;
	@Autowired
	private ReportChapterMapper reportChapterMapper;
	@Autowired
	private ReportCommentMapper reportCommentMapper;


	@Override
	public void login(Manager manager) {
		//TODO
	}

	@Override
	public void register(Manager manager) {
		managerMapper.add(manager);
	}

	@Override
	public List<ReportChapter> getReportChapter(int managerID) {
		return reportChapterMapper.getBymanagerId(managerID);
	}

	@Override
	public List<ReportComment> getReportComment(int managerID) {
		return reportCommentMapper.getBymanagerId(managerID);
	}

	@Override
	public void acepteReportChapter(int reportId) {
		ReportChapter reportChapter = new ReportChapter();
		reportChapter.setReportId(reportId);
		reportChapter.setReportStatuId(2);
		reportChapterMapper.alter(reportChapter);
	}

	@Override
	public void acepteReportComment(int reportId) {
		ReportComment reportComment = new ReportComment();
		reportComment.setReportId(reportId);
		reportComment.setReportStatuId(2);
		reportCommentMapper.alter(reportComment);
	}

	@Override
	public void refuseReportChapter(int reportId) {
		ReportChapter reportChapter = new ReportChapter();
		reportChapter.setReportId(reportId);
		reportChapter.setReportStatuId(0);
		reportChapterMapper.alter(reportChapter);
		
	}

	@Override
	public void refuseReportComment(int reportId) {
		ReportComment reportComment = new ReportComment();
		reportComment.setReportId(reportId);
		reportComment.setReportStatuId(0);
		reportCommentMapper.alter(reportComment);
	}

	@Override
	public void dealReportChapter(int reportId,String reportSolution) {
		ReportChapter reportChapter = new ReportChapter();
		reportChapter.setReportId(reportId);
		reportChapter.setReportStatuId(3);
		reportChapter.setReportSolution(reportSolution);
		reportChapterMapper.alter(reportChapter);
		
	}

	@Override
	public void dealReportComment(int reportId,String reportSolution) {
		ReportComment reportComment = new ReportComment();
		reportComment.setReportId(reportId);
		reportComment.setReportStatuId(3);
		reportComment.setReportSolution(reportSolution);
		reportCommentMapper.alter(reportComment);		
	}

}
