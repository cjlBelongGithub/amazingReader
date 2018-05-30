package com.amazingReader.service.Interface;

import com.amazingReader.entity.Chapter;

public interface ChapterService {
	
	/**
	 * 获取章节内容的同时记录阅读记录
	 * @param chapterId
	 * @param readerId
	 * @return
	 */
	Chapter getChapterForReader(int chapterId,int readerId);
	Chapter getChapterForReaderBy(int bookId, int chapterNum,int readerId);
	/**
	 * 此方法给作者使用，不判断其会员等信息
	 * 读者禁用
	 * @param chapterId
	 * @return
	 */
	Chapter getChapterForWriter(int chapterId);
	
	boolean removeChapter(int chapterId);
	boolean alterChapter(int chapterId);
	
}
