package com.rakuten.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

@Document
public class OrderWithoutLombok {
	
	@Id
	@Field("my_id")
	@GeneratedValue(strategy = GenerationStrategy.USE_ATTRIBUTES)
	private Integer id;
	
	private String item_name;
	
	private Double price;

	public Integer getMyid() {
		return id;
	}

	public void setMyid(Integer myid) {
		this.id = myid;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
