package com.coupang.model;

import java.util.Objects;

public class Seller {
	
	private String name; // 물품명
	private int number; // 개수
	private int price; // 가격
	private String seller; // 판매자
	
	public Seller() {}

	public Seller(String name, int number, int price, String seller) {
		this.name = name;
		this.number = number;
		this.price = price;
		this.seller = seller;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number, price, seller);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(name, other.name) && number == other.number && price == other.price
				&& Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() {
		return "Seller [name=" + name + ", number=" + number + ", price=" + price + ", seller=" + seller + "]";
	}
	
}