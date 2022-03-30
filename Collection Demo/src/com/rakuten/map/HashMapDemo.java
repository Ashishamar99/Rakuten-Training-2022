package com.rakuten.map;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Book> books = new HashMap<>();
		for(int i=0;i<10;i++) {
			Book book = new Book();
			book.setTitle("title" + i);
			book.setPrice((float) Math.random() * 1000);
			books.put("key"+i, book);
		}
		
		System.out.println(books);
	}
}
