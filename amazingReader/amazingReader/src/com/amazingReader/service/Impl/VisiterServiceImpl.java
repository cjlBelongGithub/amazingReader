package com.amazingReader.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazingReader.entity.Book;
import com.amazingReader.entity.Chapter;
import com.amazingReader.mapper.ChapterMapper;
import com.amazingReader.service.Interface.VisitorService;

public class VisiterServiceImpl implements VisitorService{
	@Autowired
	private ChapterMapper chapterMapper;
	@Override
	public Chapter read(int chapterID) {
		return chapterMapper.getChapterById(chapterID);
	}

	@Override
	public Chapter readFirstChapterBy(int bookID) {
		int chapterId = chapterMapper.getChapterIdBy(bookID, 1);
		return chapterMapper.getChapterById(chapterId);
	}

	@Override
	public List<Book> getFirstPageBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
