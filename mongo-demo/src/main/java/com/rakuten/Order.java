package com.rakuten;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "orders") // This is used for mongo db, same as @Entity in SQL databases.
public class Order {
	
	@MongoId // This is the same as @Id in SQL (javax.persistance) package.
	private String Id;
	
	private String item;
	private float price;

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
