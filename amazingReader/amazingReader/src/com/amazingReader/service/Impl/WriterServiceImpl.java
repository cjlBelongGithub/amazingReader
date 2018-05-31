package com.amazingReader.service.Impl;

import com.amazingReader.entity.Book;
import com.amazingReader.mapper.BookMapper;
import com.amazingReader.service.Interface.WriterService;
import org.springframework.stereotype.Service;

@Service
public class WriterServiceImpl implements WriterService{
	private BookMapper bookMapper;
	@Override
	public boolean newABook(Book book) {
		return bookMapper.add(book);
	}
}
