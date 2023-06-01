package com.kh._abstract.step2;

public class PineApplePizza extends Pizza{
	
	public PineApplePizza(int price, String storeName) {
		super(price, storeName);
//		this.price = price; 		//위 super(price, storeName); 와 동일한 표현방식으로 사용 가능함
//		this.storeName = storeName; 
	}

	@Override
	public void topping() {
		System.out.println("PineApple Topping...");
	}

}
