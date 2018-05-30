package com.amazingReader.service.Interface;

import com.amazingReader.entity.Book;

public interface BookService {
	Book getBookInfo(int bookId);
	int getClickTimes(int bookId);
	int getRecommendTickets(int bookId);
}
