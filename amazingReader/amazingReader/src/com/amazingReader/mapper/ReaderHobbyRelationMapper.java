package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.ReaderHobbyRelation;

public interface ReaderHobbyRelationMapper {

	public boolean add(ReaderHobbyRelation readerHobbyRelation);
	public boolean alter(ReaderHobbyRelation readerHobbyRelation);
	public boolean remove(int readerId);
	public List<ReaderHobbyRelation> getHobbyBy(int readerId);
}