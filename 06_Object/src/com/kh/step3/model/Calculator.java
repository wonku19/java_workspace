package com.kh.step3.model;

public class Calculator {
	
	/* 메서드, 매소드 (method)
	 *  - 작업을 수행하기 위한 명령문의 집합
	 *  - 어떤 값을 입력 받아서 처리하고 그 결과를 돌려준다.
	 *  - 단 입력받는 값이 없을 수도 있고 결과를 돒려주지 않을 수도 있음
	 *  - 하나의 메서드는 한 가지의 기능만 수행하도록 작성하는 것을 권고
	 * [표현법]
	 *  리턴타입 메서드이름(타입 변수명, 타입 변수명, ....) {
	 *    메서드 호출 시 수행될 코드
	 *    return;
	 *  }  
	 *  
	 * return 문
	 *  - 메서드에서 return문을 만나면 종료
	 *  - 반환값이 없는(void) 경우 return문만 사용
	 *  - 반환값이 있는 경우 return문 뒤에 반환값을 지정해야 함
	 */
	
	public int a; 
	public int b;
	
	// 최대값을 구하는 메서드
	public int max() { //void 는 반환하는 값이 없을 수도 있는 경우 이고 다른게 들어가면 무조건 반환값이 있어야함 반환값이 없으면 오류 체크됨
		
		if(a > b) return a;
		
		return b; // 0을 기본적으로 반환하게 설정
	}
	
	/* 1. 인스턴스 메서드
	 *  - 인스턴스 생성 후 '참조변수.메서드이름()' 으로 호출
	 *  - 인스턴스 변수나 인스턴스 메서드와 관련된 작업을 하는 메서드
	 * 2. 클래스 메서드 (static메서드)
	 *  - 객체 생성 없이 '클래스이름.메서드이름()' 으로 호출
	 *  - 인스턴스 변수나 인스턴스 메서드와 관련 없는 작업을 하는 메서드
	 */
	
	public int add() {
		// 더하기
		return a+b;
	} 
	
	public int substract() {
		// 빼기
		return a-b;
	}
	
	public static int multiply(int a, int b) { // static은 인스턴스 변수를 사용할 수 없어서 매개변수 int a, int b 를 지정함
		// 곱하기
		return a*b;
	}
	public static String divide(int a, int b){
		// 나누기 -> 형태 : "몫은 " 1 "나머지는" 3 으로 만들기 
		return "몫은 " + quotient(a, b) + ", 나머지는 " + remainder(a, b);
	}
	
	public static int quotient(int a, int b) {
		return a/b;
	}
	
	public static int remainder(int a, int b) {
		return a%b;
	}
	
	public int factorial(int n) {
		
		/* 팩토리얼!
		 * 1! = 1
		 * 2! = 2 X 1 = 2
		 * 3! = 3 X 2 X 1 = 6
		 */
		
		/* 재귀함수 (Recursion Function)
		 * - 메서드 내에서 자기 자신을 반복적으로 호출함
		 * - 반복문으로 바꿀 수 있으며 반복문보다 성능이 나쁨
		 * - 이해하기 슆고 간결한 코드 작성이 가능해서 사용함
		 */
		
		int fac = 1;
		
		if(n!=1) fac = n * factorial(n-1); // 재귀함수
				
		return fac;
	}
	
}
