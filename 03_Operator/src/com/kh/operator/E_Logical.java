package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/* 논리 연산자
	 * - 두개의 논리값을 연산해주는 연산자
	 * - 논리연산한 결과 마저도 논리값이다.
	 * 
	 * 논리값 && 논리값 : (and, 그리고) 왼쪽, 오른쪽 둘다 true 일 경우 결과값은 true 
	 * 논리값 || 논리값 : (or, 또는) 왼쪽, 오른쪽 둘중 하나라도 true 일 경우만 결과값은 true
	 */
	
	public static void main(String[] args) {
		E_Logical e = new E_Logical();
//		e.method1();
//		e.method2();
		e.method3();


	}

	public void method1() {
		
		int number = 0;
		boolean result = false; // 0과 false를 미리 입력해서 초기화 시켜둔거임
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인해보기
		System.out.println("임의의 정수를 입력 해주세요. > ");
		number = sc.nextInt();
		
		// 1 <= number <= 100 을 동시에 못하기 떄문에 1이상, 100이하 논리값을 나눠서 논리연산자를 추가해줌
		result = (number >= 1) && (number <= 100);
		System.out.println(number + "는 1부터 100 사이의 값인가요? : " + result);
	}
	
	public void method2() {
		
		// Short Cut Evaluation
		int number = 10;
		boolean result = false;
		
		// && 앞에 작성된 연산자를 기준으로 앞에서 이미 false가 나오면 뒤의 연산은 수행되지 않는다.
		result = (number < 5) && (++number > 0);
		
		System.out.println(result); // number 가 10으로 5보다 크기때문에 false
		System.out.println(number);	// 10으로 출력됨 result에 ++number이 있지만 number < 5 의 결과가 false 였기 때문에 실행되지 않아서 10 그대로의 값이 출력됨
		
		// || 연산자를 기준으로 앞에서 이미 true가 나오면 뒤의 연산은 수행되지 않는다
		
		result = (number < 20) || (++number > 0);
		System.out.println(result);	// number 가 10으로 20보다 작기때문에 true
		System.out.println(number);	// 10으로 출력됨 result에 ++number이 있지만 number > 20 의 결과가 true 였기 때문에 실행되지 않아서 10 그대로의 값이 출력됨

	}
	
	public void method3() {
		
		// 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기 대문자는 65~90까지로 표현됨
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("알파벳을 입력 해주세요 : ");
//		char a = sc.nextLine().charAt(0);
//		
//		int b = (int)a;
//		boolean result = false;
//		result = (b >= 65) && (b <= 90);
//		
//		System.out.println("입력된 알파벳은 대문자 입니까? : " + result);
		
		char ch = sc.nextLine().charAt(0);
		System.out.println("사용자가 입력한 값이 대문자입니까? :" + ((ch >= 'A') && (ch <= 'Z')));

	}
}
