package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository library;
	
	void saveBook(Book book) {
		library.save(book);
	}
	
	List<Book> getBooks(){
		return library.findAll();
	}
}
