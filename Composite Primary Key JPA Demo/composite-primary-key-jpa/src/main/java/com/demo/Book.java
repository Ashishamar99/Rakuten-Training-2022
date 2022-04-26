package com.demo;

import java.math.BigInteger;

public class Book {
	
	private Integer book_id;
	private BigInteger author_contact;
	private String book_title, author_name;
	
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public BigInteger getAuthor_contact() {
		return author_contact;
	}
	public void setAuthor_contact(BigInteger author_contact) {
		this.author_contact = author_contact;
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
	
}
