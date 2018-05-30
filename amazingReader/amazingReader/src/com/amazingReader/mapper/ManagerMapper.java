package com.amazingReader.mapper;

import com.amazingReader.entity.Manager;

public interface ManagerMapper {
	public int getMaxIndex();
	public boolean add(Manager manager);
	public boolean alter(Manager manager);

//	public boolean remove(Manager manager);
	public boolean removeById(int managerId);
	public Manager get(int managerId);
}