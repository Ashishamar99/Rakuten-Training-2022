package com.demo;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class BookCompositeId implements Serializable{
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer book_id;
	private BigInteger author_contact;
	
	
	public BookCompositeId() {
		super();
	}


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


	public BookCompositeId(Integer book_id, BigInteger author_contact) {
		super();
		this.book_id = book_id;
		this.author_contact = author_contact;
	}
	
	
	
	
}
