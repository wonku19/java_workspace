package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	
	Scanner sc = new Scanner(System.in);

	/* 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음
	 *       "같은 자료형의 값" 으로만 담을 수 있음 
	 *       배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작함)
	 *       
	 * 1. 배열의 선언
	 * [표현법]
	 *  자료형[] 배열명;
	 *  자료형 배열명 [];
	 * 2. 배열의 초기화
	 * [표현법]
	 *  배열명 = new 자료형[배열크기];
	 * 3. 배열의 선언과 초기화를 동시에 진행 가능함
	 * [표현법]
	 *  자료형[] 배열명 = new 자료형[배열크기];
	 *  자료형 배열명[] = new 자료형[배열크기];
	 */
	
	public void method1 () {
		
		/* 배열의 선언과 초기화
		 * 1) 배열 변수와 인덱스를 이용해 초기화
		 */
		
		int[] score = new int[5]; //배열의 크기를 지정하지 않으면 에러 발생 여기선 5로 지정함
		
		/* 기본 자료형 : 스택 메모리에 생성된 공간에 실제 변수값을 저장함
		 * 참조 자료형 : 실제 데이터 값은 힙 메모리에 저장하고 스택 메모리에 변수 공간에는 실제 변수값이 저장된 힙 메모리에 주소값 저장됨 
		 */
		
		/* - 배열을 생성하고 초기화 해주지 않아도 문제없이 출력됨
		 * - JVM이 지정한 기본값으로 배열이 초기화됨
		 *   (정수형 : 0, 실수형 : 0.0, 문자형 : \u0000, 논리형 : false, 참조형 : null)
		 */
		
		// 초기화 하기
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
		
		System.out.println(score); // 출력 시 : [I@3d012ddd
		System.out.println(score[0]); // 초기화 하지 않으면 0~4까지 출력시 동일하게 0이 출력됨
		System.out.println(score[1]); // 초기화를 했기 때문에 초기화떄 입력한 값이 각각 출력됨
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
	}
	
	public void method2() {
		
		// 2) 선언과 동시에 초기화
		
		int[] score = /*new int[]*/ {100, 90, 80, 70, 60}; // new int[] 부분은 생략 가능
		
//		int[] score2;
//		score2 = {100, 90, 80, 70, 60};  이런 초기화 선언은 오류남!
	
		//반복문을 사용해서 배열에 있는 값 모두 출력하는 출력문 만들기
		
		// 문자열,length(), 배열.length 로 입력해야함
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}
	
	public void method3() {
		// 3) 반복문을 이용한 초기화
		
		int[] score = new int[5];
		int num = 100;
		
		for(int i=0; i<score.length; i++) {
			score[i] = num;
			num-=10;
			System.out.println(score[i]);
		}
		
		/* 향상된 for문
		 * - 자바5부터 배열 및 컬렉션 클래스를 좀 더 쉽게 처리할 목적으로 제공
		 * - 증감식을 사용하지 않고 배열 및 컬렉션의 요소 개수만큼 반복하고 for문을 종료함
		 */
		
		for(int s : score) {
			System.out.println(s);
		}
		
	}
	
	public void method4() {
		
		/* 3명의 키를 입력받아 배열에 저장하고 3명의 키의 평균값을 구하시오
		 * 1번 키 입력 > 180
		 * 2번 키 입력 > 177.3
		 * 3번 키 입력 > 168.2
		 * 1, 2, 3의 평균 키 > 175.2
		 */
		
//		float[] height = new float[3+1];
//		
//		for(int i=1; i<height.length; i++) {
//			System.out.print(i + "번 키 입력 > ");
//			height[i] = sc.nextFloat();
//		}
//		float average = (height[1] + height[2] + height[3]) / 3;
//		System.out.printf("%.1f", average); 
		
		double[] arr = new double[3];
		double sum = 0.0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("키 입력 : ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		System.out.printf("%.1f", sum/arr.length);
	}
	
	public void method5() {
		
		/* 배열의 복사
		 * 1. 얕은 복사 : 배열의 주소만 복사
		 */
		
		int[] number = {1, 2, 3, 4, 5};
		int[] copy = number;
		
		System.out.println(number); // 주소갚이 출력됨
		System.out.println(copy);
		System.out.println(Arrays.toString(number)); // Arrays.toString 주소값이 입력값으로 출력되도록 해줌
		System.out.println(Arrays.toString(copy));
		
		copy[1] = 20; // 복사한 copy 를 수정했는데 원본인 number의 값까지 같이 바뀜
	
		System.out.println(Arrays.toString(number)); 
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(number) == Arrays.toString(copy)); // 출력값은 동일하지만 동일하진 않기에 false 출력됨
		System.out.println(number.hashCode()); // hashCode() : 객체를 식별할 하나의 정수 값 2137211482 출력됨
		System.out.println(copy.hashCode());
		System.out.println(number.hashCode() == copy.hashCode()); // 객체를 식별할 정수값으로 확인했기 때문에 true 출력됨
	}
	
	public void method6() {
		
		/* 2. 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 내부의 값들도 함께 복사
		 *  - 깊은복사 방법 1. for문을 이용한 깊은 복사
		 */
		
		int[] number = {1, 2, 3, 4, 5};
		int[] copy = new int[5];
				
		for(int i=0; i<number.length; i++) {
			copy[i] = number[i]; // copy의 i번 배열에 number i번 배열 값을 입력함
		}
		
		copy[1]	= 20;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy)); // 깊은 복사는 기존값은 변경되지 않고 복사한 copy의 1번째 값만 2에서 20으로 변경됨
		
		System.out.println(number.hashCode()); // 2137211482 개체 식별 정수값도 차이남
		System.out.println(copy.hashCode()); // 920011586
	}
	
	public void method7 () {
		
		/* - 깊은복사 방법 2. System 클래스에서 제공하는 arraycopy(); 매소드를 이용한 깊은 복사
		 * [표현법]
		 *  System.arraycopy(원본 배열, 복사 시작 인덱스, 복사본 배열, 복사 시작 인덱스, 복사할 길이);
		 */
		
		int[] number = {1, 2, 3, 4, 5};
		int[] copy = new int[5];
		
		System.arraycopy (number, 0, copy, 0, number.length);
		
		copy[2] = 30;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
		
	}
	
	public void method8() {
		
		/* - 깊은복사 방법 3. Arrays 클래스에서 제공하는 copyOf() 클래스를 이용한 깊은 복사
		 * [표현법]
		 *  Arrays.copyOf(원본 배열, 복사본 배열 길이)ㅣ
		 */
		
		int[] number = {1, 2, 3, 4, 5};
		int[] copy = null;
		
		copy = Arrays.copyOf(number, number.length);
		
		copy[3] = 10;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
		
	}
	
	public void method9() {
		
		/* - 깊은복사 방법 4. 배열의 clone() 메소드를 이용하는 방법
		 * 
		 */
		
		int[] number = {1, 2, 3, 4, 5};
		int[] copy = null;
		
		copy = number.clone();
		
		copy[4] = 90;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
		
	}
	
	public static void main(String[] args) {

		A_Array a = new A_Array();
//		a. method1();
//		a. method2();
//		a. method3();
//		a. method4();
//		a. method5();
//		a. method6();
//		a. method7();		
//	    a. method8();	
//		a. method9();
		
	}

}
