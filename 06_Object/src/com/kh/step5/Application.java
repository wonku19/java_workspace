package com.kh.step5;

import com.kh.step5.model.Book;

public class Application {

	public static void main(String[] args) {

		Book b1 = new Book("HTML+CSS+자바스크립트", 30000, 0.2, "고경희");
		Book b2 = new Book();
		b2.setTitle("리액트 200제");
		b2.SetPrice(25000);
		b2.SetDiscountRate(0.1);
		b2.SetAuthor("이정열");
		
		System.out.println(b1);
		System.out.println(b2);
		
		// Getter 를 이용하여 두 객체의 각각 할인율을 적용한 책 가격을 계산하여 출력
		System.out.println(b1.getTitle() + " 의 할인된 가격은 " + (b1.getPrice() - (b1.getPrice() * b1.getDiscountRate())) + " 원 입니다.");
		System.out.println(b2.getTitle() + " 의 할인된 가격은 " + (b2.getPrice() - (b2.getPrice() * b2.getDiscountRate())) + " 원 입니다.");
	}

}