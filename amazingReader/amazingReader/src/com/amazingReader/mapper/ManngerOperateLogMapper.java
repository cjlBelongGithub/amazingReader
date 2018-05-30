package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.ManangerOperateLog;

public interface ManngerOperateLogMapper {
	public boolean add(ManangerOperateLog managerOperateLog);
	public List<ManangerOperateLog> getBy(int ManagerId);
}