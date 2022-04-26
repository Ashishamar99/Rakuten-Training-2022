package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/library")
public class BookController {
	
	@Autowired
	BookService service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void saveBook(Book book) {
		service.saveBook(book);
	}
	
	List<Book> getBooks(){
		return service.getBooks();
	}
	

}
