package com.example.demo;

public class Order {
	private String name;
	private Float price;
	public Order(String name2, Float price2) {
		this.setName(name2);
		this.setPrice(price2);
	}
	public String getName() {
		return name;
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
	@Override
	public String toString() {
		return String.format("Order Name = %s, Order Price = %f", this.getName(), this.getPrice());
	}
}
