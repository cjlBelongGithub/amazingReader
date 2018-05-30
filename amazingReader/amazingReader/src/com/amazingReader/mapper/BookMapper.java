package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.Book;

public interface BookMapper {
	public int getMaxIndex();
	public boolean add(Book book);
	public boolean alter(Book book);
	/**
	 * 仅将书籍下架
	 * @param book
	 * @return
	 */
	public boolean removeBook(Book book);
	public boolean removeByBookId(int bookId);
	public Book getBookById(int bookId);
	public Book getBookByName(String bookName);
	public List<Book> getBooksByLabelId(int LabelId);
	public void addRecommendTicket(int tickets,int bookId );
	public String selectBookContent(String content);
}