package com.demo;

import java.math.BigInteger;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {
	
	@EmbeddedId
	private BookCompositeId bookid;
	
	private String book_title, author_name;
	
	public BookCompositeId getBookid() {
		return bookid;
	}
	public void setBookid(BookCompositeId bookid) {
		this.bookid = bookid;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public Book() {
	}
	
	public Book(BookCompositeId bookid, String book_title, String author_name) {
		this.bookid = bookid;
		this.book_title = book_title;
		this.author_name = author_name;
	}
	
}
