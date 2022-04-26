package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	List<Book> books = new ArrayList<>();
	
	void saveBook(Book book) {
		books.add(book);
	}
	
	List<Book> getBooks(){
		return books;
	}
}
