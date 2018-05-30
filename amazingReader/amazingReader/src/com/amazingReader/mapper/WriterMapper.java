package com.amazingReader.mapper;

import com.amazingReader.entity.Writer;

public interface WriterMapper {
	boolean add(Writer writer);
	boolean alter(Writer writer);
	Writer get(int readerId);
	
}