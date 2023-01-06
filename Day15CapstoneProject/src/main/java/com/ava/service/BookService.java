package com.ava.service;

import java.util.List;
import com.ava.model.Book;

public interface BookService {

	public Book findById(int id);

	public List<Book> getAllBooks();

	public Book insertBook(Book book);

	public Book updateBookById(Book book, int id);

	public void removeBookById(int id);

	public void removeBookAll();



	


}

