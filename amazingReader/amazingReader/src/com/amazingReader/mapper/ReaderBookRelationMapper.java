package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.ReaderBookRelation;

public interface ReaderBookRelationMapper {
	//收藏表里，读者id一栏加了自动递增，已删
	public boolean add(ReaderBookRelation readerBookRelation);
	public boolean alter(ReaderBookRelation readerBookRelation);
	public boolean remove(ReaderBookRelation readerBookRelation);
	public List<ReaderBookRelation> getByReaderId(int readerId);
	public List<ReaderBookRelation> getByBookId(int bookId);
	public int countBook(int readerId);
	public int countReader(int bookId);
}