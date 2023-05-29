package com.kh.overriding;

import com.kh.overriding.model.Customer;
import com.kh.overriding.model.VIPCustomer;

public class Application {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("강원구");
		Customer customer2 = new Customer("김원구");
		
		System.out.println(customer1);
		System.out.println(customer2);
		
		System.out.println(customer1.equals(customer2));
		
		VIPCustomer customer3 = new VIPCustomer("가나다");
		VIPCustomer customer4 = new VIPCustomer("가나다");
		
		System.out.println(customer3.equals(customer4));
		
		
		System.out.printf("%s님의 등급은 %s이며, 지불해야 하는 금액은 %d이며, 적립된 포인트는 %d점 입니다.\n", customer2.getName(), customer2.getGrade(), customer2.calcPrice(1000), customer2.getBonusPoint());
		System.out.printf("%s님의 등급은 %s이며, 지불해야 하는 금액은 %d이며, 적립된 포인트는 %d점 입니다.\n", customer4.getName(), customer4.getGrade(), customer4.calcPrice(1000), customer4.getBonusPoint());
	}

}
