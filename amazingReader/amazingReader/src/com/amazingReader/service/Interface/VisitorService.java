package com.amazingReader.service.Interface;

import java.util.List;

import com.amazingReader.entity.Book;
import com.amazingReader.entity.Chapter;

public interface VisitorService {
	/**
	 * 控制其阅读权限，仅限于读取免费章节
	 * @param chapterID
	 * @return
	 */
	Chapter read(int chapterID);
	/**
	 * 返回传入书籍ID的首章
	 * @param bookID
	 * @return
	 */
	Chapter readFirstChapterBy(int bookID);
	
	List<Book> getFirstPageBook();
	
}
