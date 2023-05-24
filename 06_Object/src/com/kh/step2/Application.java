package com.kh.step2;

import com.kh.step2.model.Card;

public class Application {

	public static void main(String[] args) {
		
		// 클래스 변수는 인스턴스 생성 없이 호출이 가능하다
		System.out.println(Card.width);
		System.out.println(Card.hight);
		
		System.out.println();

		Card c1 = new Card();
		c1.Kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.Kind = "Spabe";
		c2.number = 3;
		
		// 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.
		c1.width = 50;
		c1.hight = 80;
		
		System.out.println("첫번째 카드는 " + c1.Kind + " " + c1.number + " " + "이며, 크기는" + c1.width + " X " + c1.hight + " 입니다. ");
		System.out.println("두번째 카드는 " + c2.Kind + " " + c2.number + " " + "이며, 크기는" + c2.width + " X " + c2.hight + " 입니다. ");
		
	}

}
