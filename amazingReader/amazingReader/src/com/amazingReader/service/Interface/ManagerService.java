package com.amazingReader.service.Interface;

import java.util.List;

import com.amazingReader.entity.Manager;
import com.amazingReader.entity.ReportChapter;
import com.amazingReader.entity.ReportComment;

public interface ManagerService {
	void login(Manager manager);
	
	void register(Manager manager);
	List<ReportChapter> getReportChapter(int managerID);
	List<ReportComment> getReportComment(int managerID);
	/**
	 * 鎺ュ彈涓炬姤锛岃繘鍏ュ鐞嗙姸鎬�
	 */
	void acepteReportChapter(int reportId);
	
	void acepteReportComment(int reportId);
	/**
	 * 鎷掔粷涓炬姤
	 * @param reportId
	 */
	void refuseReportChapter(int reportId);
	
	void refuseReportComment(int reportId);
	
	/**
	 * 澶勭悊涓炬姤
	 * @param reportSolution
	 */
	void dealReportChapter(int reportId,String reportSolution);
	
	void dealReportComment(int reportId,String reportSolution);
	
	
}
