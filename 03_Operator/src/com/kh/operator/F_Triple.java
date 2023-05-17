package com.kh.operator;

import java.util.Scanner;

public class F_Triple {
	
	/* 삼항 연산자
	 * [표현법] 조건식 ? 식1 : 식2
	 * - 조건식에는 주로 비교, 논리 연산자가 사용된다.
	 * - 조건식의 결과가 true 이면 식1을 수행한다
	 * - 조건식의 결과가 false 이면 식2를 수행한다.
	 */
	
	public static void main(String[] args) {
		
		F_Triple f = new F_Triple();
//		f.method1();
//		f.practice1();
		f.practice2();

		
	}
	
	public void method1() {
		
		int number = 0;
		String result = ""; //string = 문자열 , "" = 빈칸
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		number = sc.nextInt();
		
		// 입력받은 정수가 양수인지 음수인지 0인지 판단해보기
		result = (number > 0) ? "양수이다." : (number < 0) ? "음수이다." : "0이다.";
		
		System.out.println(result);
	}
		
		/* 문제 1 
		 * 사용자한테 두 개의 정수값을 받아서 두 정수의 곱셈 결과가 100보다 큰 경우
		 * "결과가 100 이상입니다", 아닌경우 "결과가 100보다 작습니다" 출력하게 만들기
		 */
		
	public void practice1() {
		
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		String result = null;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수값 입력 > ");
		number1 = sc.nextInt();
		System.out.print("두번째 정수값 입력 > ");
		number2 = sc.nextInt();
		
	    number3 = number1 * number2;
	    result = (number3 >= 100) ? "결과가 100 이상입니다." : "결과가 100 이하입니다.";
	    
	    System.out.print(result);
	    
	}
	    
	    /* 문제 2
	     * 사용자에게 문자를 하나 입력받아서 입력한 문자가 대문자이면 "알파벳 대문자이다." 아닌 경우 "알파벳 대문자가 아니다." 출력
	     */
		
	public void practice2() {
				
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z') ? "알파벳 대문자이다." : "알파벳 대문자가 아니다.";
			
		System.out.println(result);
		
	}
	
}
