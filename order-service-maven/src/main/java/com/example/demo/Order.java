package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO	)
	private Integer id;
	
	private String name;
	private Float price;
	private Integer discount;
	private Float discountedprice;
	
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Float getDiscountedprice() {
		return discountedprice;
	}
	public void setDiscountedprice(Float discountedprice) {
		this.discountedprice = discountedprice;
	}
	@Override
	public String toString() {
		return String.format("Order Name = %s, Order Price = %f", this.getName(), this.getPrice());
	}
}
