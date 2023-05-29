package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class Tv extends Product { // extends Product 후 import 필수

//	private String brand;
//	private String pCode;
//	private String name;
//	private int price; // 부모클래스에 기재했기 때문에 삭제해도됨
	private int inch;

	public Tv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tv(String brand, String pCode, String name, int price, int inch) {
		super(brand, pCode, name, price);
		this.inch = inch;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "Tv [inch=" + inch + "]";
	}
	
}
