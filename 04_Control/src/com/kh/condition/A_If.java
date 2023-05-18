package com.kh.condition;

import java.util.Scanner;

public class A_If {
	
	Scanner sc = new Scanner(System.in);
	
	/* if문
	 * [표현법] if(조건식) { ... } -> 조건식이 참(true) 일때 중괄호{} 안에 있는 코드 실행함
	 * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용한다 (true, false 로 출력되는 연산자임)
	 */
	
	public void method1() {
		
		int score = 80; // 지역 변수 (이 메소드 안에서만 사용하는 변수다)
		
		// 60점 이상이어야 합격 이하면 불합격 하는 if문
		if (score >= 60) { 
			System.out.println("합격!"); // i(score >=60) System.out.println("합격!"); 으로도 동일하게 출력 가능
		}
		if (score < 60) {
			System.out.println("불합격!");
		}
	}

	public void method2() {
		
		/* if-else문
		 * [표현법] if(조건식) { 
		 * 	...조건식이 true일때 실행할 코드 
		 * } else { 
		 * ...조건식이 false 일때 실행할 코드
		 * }
		 */
		
		int score = 0;
		
		System.out.print("점수입력 > ");
		score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}
		
		//삼항연산자 사용한 출력문
		//System.out.println((score >= 60) ? "합격!" : "불합격!");
	}
	
	public void method3() {
		
		String name = ""; 
		
		System.out.print("이름을 입력해주세요 > ");
		name = sc.nextLine();
		
		System.out.println("강원구" == name); // false
		System.out.println("강원구".equals(name)); // true String 클래스의 equals() 메소드 - 입력된 문자가 동일한지 확인
		System.out.println("강원구".charAt(0)); // 강 String 클래스의 charAt(0) 메소드 - 입력된 문자의 첫글자 출력
		
		// 본인이면 "본인이다,", 본인이 아니면 "본인이 아니다." 출력문		
//		System.out.println(("강원구".equals(name) ? "본인이다." : "본인이 아니다."));
		if("강원구".equals(name))	{
			System.out.println("본인이다.");
		} else {
			System.out.println("본인이 아니다.");
		}
		
	}
	
	public void method4() {
		
		int number = 0;
		
		System.out.print("숫자 입력 > ");
		number = sc.nextInt();
		
		// 0보다 크면 "양수", 그게 아니면 "음수" 0이라면 "0입니다" 라는 출력문 만들기
		// if문 안에 추가로 if문을 기재해서 사용 가능하다 (중첩 if 문) ※ 가능하면 안쓰는게 좋음 
		
		if(number > 0) {
			System.out.println("양수");
		} else {
			
			if(number == 0) { 
				System.out.println("0입니다.");
			} else {
				System.out.println("음수");
			}
		}
	}
	
	public void method5() {
		
		/* if-else if-else 문
		 * [표현법] if(조건식1) { 
		 * 조건식1이 true 일떄 실행할 코드 } else if(조건식2) {
		 * 조건식2가 true 일때 실행할 코드 
		 * } else { 조건식2가 false 일때 실행할 코드
		 * }
		 * 
		 * - else if 수는 제한 없이 사용 가능
		 * - 마지막은 else 로 끝나야함
		 */
		
		int number = 0;
		
		System.out.print("숫자 입력 > ");
		number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("양수");
		} else if (number < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0입니다.");
		}
	}
	
	public void method6() {
		
		/* 사용자에게 점수(0~100)을 입력받아 점수별로 등급을 출력하라
		 * - 90점 이상은 A 등급 / 90~80 B등급 / 80~70은 C등급 / 70~60은 D등급 / 60미만은 F등급
         */
		
		int number = 0;
		
		System.out.print("점수를 입력해주세요 > ");
		number = sc.nextInt();
		
		if(number >= 90) {
			System.out.println("A등급");
		} else if (number >= 80) {
			System.out.println("B등급");
		} else if (number >= 70) {
			System.out.println("C등급");
		} else if (number >= 60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
				
	}

	public void practice1() {
		
		/* 세 정수를 입력했을때 짝수만 출력하는 출력문 작성하기
		 * num1 입력 > 3
		 * num2 입력 > 4
		 * num3 입력 > 6
		 * 4
		 * 6
  		 */
		
		System.out.print("첫번째 정수를 입력해주세요. > ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요. > ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수를 입력해주세요. > ");
		int num3 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println(num1);
		}
		if(num2 % 2 == 0) {
			System.out.println(num2);
		}
		if(num3 % 2 == 0) {
			System.out.println(num3);
		}
	}
		
	public void practice2() {
		
		/* 정수 1개를 입력했을때 음수이면 (minus) 출력 / 양수이면 (plus) / 0이면 (zero) / 짝이면 (even) / 홀수이면 (odd) 출력하는 출력문 작성하기
		 * 정수입력 > -3
		 * minus
		 * odd
		 */
		
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("plus");
			
			if(num % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			
		} else if (num < 0) {
			System.out.println("minus");
		} else {
			System.out.println("zero");
		}
	}
		
	
	public static void main(String[] args) {

		A_If a = new A_If();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		a.practice1();
		a.practice2();
		

	}

}

