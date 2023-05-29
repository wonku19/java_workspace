package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class SmartPhone extends Product { // extends Product 후 import 필수

//	private String brand;
//	private String pCode;
//	private String name;
//	private int price; // 부모클래스에 기재했기 때문에 삭제해도됨
	private String mobileAgency; // 통신사

	public SmartPhone() {}

	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);
		this.mobileAgency = mobileAgency; 
	}

	@Override
	public String toString() {
		return super.toString() + "SmartPhone [mobileAgency=" + mobileAgency + "]";
	}
	
}
