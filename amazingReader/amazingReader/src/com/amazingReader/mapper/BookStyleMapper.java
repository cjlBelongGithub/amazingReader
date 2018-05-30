package com.amazingReader.mapper;

import com.amazingReader.entity.BookStyle;

public interface BookStyleMapper {
	public boolean add(BookStyle bookStyle);
	public boolean alter(BookStyle bookStyle);
	public boolean remove(BookStyle bookStyle);
	public boolean removeById(int styleId);
	public BookStyle getBookStyle(int styleId);
}