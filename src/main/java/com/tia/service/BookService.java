package com.tia.service;


import java.util.List;

import com.tia.entity.Book;

public interface BookService {
	public Book getById (long bookId);
	public List<Book> getList();
}
