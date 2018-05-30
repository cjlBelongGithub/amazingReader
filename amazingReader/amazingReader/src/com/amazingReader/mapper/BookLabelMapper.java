package com.amazingReader.mapper;

import java.util.List;

import com.amazingReader.entity.BookLabel;

public interface BookLabelMapper {
	public int getMaxIndex();
	public boolean add(BookLabel bookLabel);
	public boolean alter(BookLabel bookLabel);
	public boolean removeBookByBookLabe( BookLabel bookLabel);
	public boolean removeBooksByBookLabelId(int bookLabelId);
	public BookLabel getBookLabel(int labelId);
	public List<BookLabel> getBookLabels();





}