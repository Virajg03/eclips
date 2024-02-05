package com.springcore.lifecycle;

public class Smosa {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("setting price..");
		this.price = price;
	}

	public Smosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Smosa [price=" + price + "]";
	}

	public void init() {
		System.out.println("this is in the init method..");
	}

	public void destroy() {
		System.out.println("this is in the destroy method..");
	}

}
