package com.library.services;

import com.library.models.Book;

public interface BookService {

	public void saveBookInfo();
	public Book getBookInfo();
	public Book updateBookInfo();
	public void deleteBookInfo();
}
