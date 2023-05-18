package com.kh.loop;

import java.util.Scanner;

public class C_For {
	
	Scanner sc = new Scanner(System.in);
	
	/* for문
	 * [표기법]
	 * for(초기식; 조건식; 증감식) {
	 *   ..... 실행코드 .....
	 * }
	 * - 주어진 횟수만큼 코드를 반복 실행하는 구문
	 * - 초기식은 반복문이 수행될때 단 한번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * - 조건식의 결과가 false이면 실행코드를 수행하지 않고 반복문을 빠져나간다.
	 * - 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 */
	
	public void method1() {
		
		// 1~5 출력
		// 반복문 사용하지 않은 출력문
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		// 반복문을 사용한 출력문
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		// 위 for문과 동일한 결과 출력되는 출력문
		
		for(int i=0; i<5; i++) {
			System.out.println(i+1);
		}
		
	}
	
	public void method2() {
		
		// 1~5까지를 반대로 출력하는 출력문 만들기
		//5
		//4
		//3
		//2
		//1
		
		for(int i=5; i>0; i--) {
			System.out.println(i);
		}
		
	}
	
	public void method3() {
		
		// 1~10 사이에 홀수만 출력하는 출력문 만들기
				
		
		// if 문을 활용한 출력문
		for(int i=1; i<=10; i++) {
			if(i % 2 ==1) {
			System.out.println(i);
			}
		}
		// 1로 시작해서 10이 퇴기전까지 i값에 +2씩 더해서 출력하는 출력문
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		}


	public static void main(String[] args) {
		C_For c = new C_For();
//		c.method1();
//		c.method2();
		c.method3();

	}

}
