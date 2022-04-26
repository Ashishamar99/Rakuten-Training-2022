package com.demo;

import java.io.Serializable;
import java.math.BigInteger;

public class BookCompositeId implements Serializable{
	
	private Integer book_id;
	private BigInteger author_contact;
	
	
	public BookCompositeId() {
		super();
	}


	public BookCompositeId(Integer book_id, BigInteger author_contact) {
		super();
		this.book_id = book_id;
		this.author_contact = author_contact;
	}
	
	
	
	
}
