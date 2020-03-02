package com.taskepam.maven_OOP;

public class chocolates {
	public String name;
	public double price;
	public chocolates() {
		super();
	}
	public chocolates(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Chocolates [name=" + name + ", price=" + price + "]";
	}
}
