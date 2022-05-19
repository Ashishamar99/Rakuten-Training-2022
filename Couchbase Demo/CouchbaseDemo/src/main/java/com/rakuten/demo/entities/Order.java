package com.rakuten.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
public class Order {
//	@Getter
//	@Setter
	
	@Id
	@GeneratedValue(strategy = GenerationStrategy.UNIQUE)
	private String id;
	
//	@Getter
//	@Setter
	private String item_name;
	
public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//  @Field("Price")
//	@Getter
//	@Setter
	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
}
