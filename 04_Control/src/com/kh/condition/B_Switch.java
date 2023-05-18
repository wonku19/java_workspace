package com.kh.condition;

import java.util.Scanner;

public class B_Switch {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		/* 숫자를 입력받아
		 * 1일경우 "빨간색"
		 * 2일경우 "파란색"
		 * 3일경우 "초록색"
		 * 잘못 입력했을 경우 잘못 입력했습니다."
		 */
		
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("빨간색");
		} else if(num == 2) {
			System.out.println("파란색");
		} else if(num == 3) {
			System.out.println("초록색");
		} else {
			System.out.println("잘못 입력했습니다");
		}
		
		// 위에 if문과 동일한 결과가 출력되는 switch문
		switch(num) {
		
		case 1:
			System.out.println("빨간색");
			break;
		case 2:
			System.out.println("파란색");
			break;
		case 3:
			System.out.println("초록색");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
		}
		
	}
	
	public void practice1() {
		
		/* 아래 출력문 만들기
		 * 1 : 권리권한, 글쓰기권한, 읽기권한
		 * 2 : 글쓰기권한, 읽기권한
		 * 3 : 읽기권한
		 */
		
		System.out.print("등급 입력 > ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("권리권한, 글쓰기권한, 읽기권한");
			break;
		case 2:
			System.out.println("글쓰기권한, 읽기권한");
			break;
		case 3:
			System.out.println("읽기권한");
			
		}
		
		
		System.out.print("등급 입력 > ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1: System.out.println("권리권한");
		case 2: System.out.println("글쓰기권한");
		case 3: System.out.println("읽기권한");
		
		}

	}
	
	public void practice2() {
		
		/* 월을 입력했을 때 계절을 출력
		 * 3, 4, 5 : 봄
		 * 6 , 7, 8 : 여름
		 * 9, 10 , 11 : 가을
		 * 12, 1, 2 : 겨울
		 * 
		 * 결과
		 * 월 > 6            월 > 11
		 * 봄                가을
		 */
		
		System.out.print("월 > ");
		int month = sc.nextInt();
		String season = ""; // System.out.println 을 반복적으로 쓰지 않아도 되고 밑에 최종으로 작성한 변수값이 들어간 출력문을 가져옴
		
		switch(month) {
		case 3:
		case 4:
		case 5: season = "봄";
		// case 3: case 4: case 5: 
		//   System.out.println("봄"); 으로 작성해도 위와 동일한 결과 출력됨
		break;
		case 6: 
		case 7:
		case 8: season = "여름";
		break;
		case 9: 
		case 10:			
		case 11: season = "가을";
		break;
		default: 
		case 12: 
		case 1:
		case 2: season = "겨울";		
		
		}
		
		System.out.println(season);
	}

	public static void main(String[] args) {
		B_Switch b = new B_Switch();
//		b.method1();
//		b.practice1();
		b.practice2();

		
		/* switch문
		 * [표현법] switch(조건식) { 
		 *               case 값1: 
		 *                      ..... 조건식의 결과가 값 1과 같을 경우 실행하는 코드
		 *                	  break;
		 *               case 값2:
		 *                      ..... 조건식의 결과가 값 2와 같을 경우 실행하는 코드
		 *                    break;  
		 *               default: 
		 *                      ...... 조건식의 결과가 일치하는 case문이 없을 때 실행 코드
		 *        }
		 * - case 문의 수는 제한이 없다
		 * - 조건식 결과는 정수, 문자, 문자열이어야 한다.
		 * - 조건문을 빠져나오려면 break; 가 필요하다.
		 * - defaulf 문은 생략 가능하다
		 * - break를 쓰지 않으면 case1의 결과에 만족하면 밑으로 작성되는 case2 부터 모든 casr가 출력된다.
		 */

	}

}
