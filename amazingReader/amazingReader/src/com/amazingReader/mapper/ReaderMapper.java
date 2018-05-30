package com.amazingReader.mapper;

import com.amazingReader.entity.Reader;

public interface ReaderMapper {
	//?????Reader里有数据在添加时应该有默认值，修改时不能手动修改
	//从页面传默认值还是数据库自动添加默认值？
	boolean add(Reader reader);
	boolean alter(Reader reader);
	boolean remove(int readerId);
	Reader getReader(int readerId);
	Reader getReaderByName(String readerNeckName);
	
}