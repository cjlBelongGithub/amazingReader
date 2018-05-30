package com.amazingReader.mapper;

import com.amazingReader.entity.ManagerOperate;

public interface ManagerOperateMapper {
	public int getMaxIndex();
	public ManagerOperate get(int operateId);
}