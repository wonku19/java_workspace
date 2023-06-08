package com.kh.step3;

import java.util.Scanner;
import com.kh.step3.model.Calculator;

public class Application {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		/* 변수 호출 방법
		 *  - 참조변수.변수;
		 *  
		 * 메서드 호출 방법
		 *  - 참조변수.매서드이름();				// 매개변수가 없는 경우
		 *  - 참조변수.메서드이름(값1, 값2, ...); // 매개변수가 있는 경우
		 */
		
		Calculator c = new Calculator();
		
	
		c.a = 10;
		c.b = 5;
		
		System.out.println("최대값 : " + c.max());
		System.out.println("더하기 : " + c.add());
		System.out.println("빼기 : " + c.substract());
		System.out.println("곱셈 : " + c.multiply(c.a, c.b)); // 매개변수 사용했기 때문에 c.a, c.b를 입력해야됨
		System.out.println("나누기 : " + c.divide(c.a, c.b)); // c. 으로 매서드명을 정했지만 Calculator 로 작성해도 됨
		System.out.println("팩토리얼 : " + c.factorial(c.a));
		
	}
}

	
