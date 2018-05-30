package com.amazingReader.mapper;

import com.amazingReader.entity.Chapter;

public interface ChapterMapper {
	public int getMaxIndex();
	/**
	 * 获得某本书的首章ID
	 * @param bookID
	 * @return thisBook.FirstChapterId
	 */
	public int getFirstChapterIdOf(int bookID);
	public boolean add(Chapter chapter);
	public boolean alter(Chapter chapter);
	public boolean remove(Chapter chapter);
	public boolean removeByChapterId(int chapterId);
	public boolean removeByBookId(int bookId);
	public Chapter getChapterById(int chapterId);
	public String  getChapterContent(int chapterId);
	/**
	 * 获得某本书的总阅读数
	 * @param bookId
	 * @return
	 */
	int getClickNum(int chapterId);
	/**
	 * 点击之后点击次数自加
	 * @param chapter
	 */
	void click(int chapterId);
	
	int getChapterIdBy(int bookId,int chapterNum);
}