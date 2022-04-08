package com.rakuten;

import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "orders") // This is used for mongo db, same as @Entity in SQL databases.
public class Order {
	
	@MongoId // This is the same as @Id in SQL (javax.persistance) package.
	private String Id;
	
	private String item;
	private float price;
	private BigInteger contact;

	public BigInteger getContact() {
		return contact;
	}

	public void setContact(BigInteger contact) {
		this.contact = contact;
	}

	public String getItem() {
		return item;

	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {

		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
}
