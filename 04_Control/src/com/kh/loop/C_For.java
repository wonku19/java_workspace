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

public void method4() {
	
	// 1~10 사이의 짝수만 쭐력하는 출력문 만들기
	for(int i=1; i<=10; i++) {
		if(i % 2 == 0) {
			System.out.println(i);
		}
	}

	/* continue 문
	 * - continue문은 반복문 안에서 사용 (건너뛰기)
	 * - 반복문 안에서 continue문을 만나게 되면 "현재 구문" 을 종료
	 * - 반복문을 벗어나는건 아님! 다음 반복을 계속 수행함
	 */
	
	for(int i=1; i<=10; i++) {
		if(i % 2 != 0) continue;
		System.out.println(i);
	}

}

public void method5() {
	
	// 1 ~ 10 까지의 합계를 반복문을 사용해서 출력문 작성하기
	
	int sum = 0;
	
	for(int i=1; i<=10; i++) {
		sum += i;
		System.out.println("1부터 " + i + "까지의 합계 = " + sum);
	}
	}

public void method6() {
	
	// 1부터 사용자가 입력한 수 까지의 합계
	
	System.out.print("숫자 입력 > : ");
	int num = sc.nextInt();
	int sum = 0;
			
			for(int i=1; i<=num; i++) {
				sum +=i;
			}
				System.out.print("1부터 " + num + "까지의 합계 :" + sum);
			}

public void method7() {
	
	/* 1부터 랜덤값 까지의 합계
	 * - java.lang.Mayh 클래스에서 제공하는 random() 메소드 호출해서 매번 다른 랜덤값을 얻어 낼 수 있음
	 */
	
	double random = Math.random(); //랜덤값 불러오기 랜덤값의 범위는 0.0~1.0까지임
	
	random = Math.random() * 10; // 랜덤값 범위가 0.0~10.0으로 늘어남

	random = Math.random() * 10 + 1; // 랜덤값 범위가 1.0~11.0으로 늘어남
	
	int num = (int) random; // double random 값을 int로 형변환 범위가 1~11로 변경됨
	
	int sum = 0;
	
	for(int i=1; i<=num; i++) {
		sum += i;
	} 
	System.out.print("1부터 " + num + "까지의 합계 : " + sum);
}

public void method8() {
	
	/* 출력문 만들기
	 * H
	 * e
	 * l
	 * l
	 * o
	 */
	
	String str = "Hello";
	
	for(int i=0; i<=4; i++) {
		System.out.println(str.charAt(i));
	}
}

public void method9() {
	
	/* 사용자한테 입력받은 문자열 출력
	 */
	
	System.out.print("문자열 입력 > ");
	String str = sc.nextLine();
	
//		str.length()  문자열 길이 출력하는 구문
	
	for(int i=0; i<str.length(); i++) {
		System.out.println(str.charAt(i));
	}
}

public void method10() {
	
	// 구구단 - 2단 출력하기 (반복문 사용하기)

	for(int i = 1; i<10; i++) {	
		int num1 = 2 * i;
		System.out.println("2 x " + i + " = " + num1);
	}
	
}

public void method11() {
	
	// 구구단 - 2~9단 출력하기 (반복문 사용하기)
	// 2~9 말고 다른 수 입력 시 "잘못 입력하셨습니다.
	
	System.out.print("단 수(2~9)를 입력 > ");
	int num1 = sc.nextInt();
	
	if(num1 > 1 && num1 < 10) {
		for(int i = 1; i<10; i++) {	
			  int num2 = num1 * i;
			  System.out.println(num1 + " x " + i + " = " + num2);
			} 
	} else {
		System.out.println("잘못 입력하셨습니다.");
		}
}

public void method12() {
	
	// 2~9단 출력
	
	for(int num1=2; num1<10; num1++) {
	 for(int num2=1; num2<10; num2++) {
		int num4 = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
	 }
	 System.out.println();
	}
}

public void method13() {
	
	// System.out.print("*"); 와 for 문을 사용해셔 별찍기
	// *****
	// *****
	// *****
	// *****

	for(int a=0; a<4; a++) {
		for(int b=0; b<5; b++) {
		System.out.print("*");
	} System.out.println();
	}
}

public void method14() {
	
	// 아래와같이 출력되도록 출력문 만들기
	// 1***
	// *2**
	// **3*
	// ***4
	
	for(int i=0; i<4; i++) {
		for(int j=0; j<4; j++) {
			if(i==j) {
				System.out.print(i+1);
			} else {
			System.out.print("*");
		}
		}
		System.out.println();
	}
}

public void method15() {
	
	// *
	// **
	// ***
	// ****
	// *****
	
//	for(int a=0; a<4; a++) {
//		for(int b=0; b<4; b++) {
//			if(a==b) {
//				System.out.print("*");
//			} else if(a>b) {
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//	}

	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++ ) {
			System.out.print("*");
			if(i==j) System.out.println();
			// 결과는 위와 같지만 위보다 깔끔해짐
	}
}
}

public void method16() {
	
	//     *
	//    **
	//   ***
	//  ****
	// *****
	
	// for, if문을 사용한 출력문
	for(int i=1; i<=5; i++) {
		for(int j=5; j>=1; j--) {
			if(i < j) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	// for문만 사용한 출력문
	for (int a = 1; a < 6; a++) {
		for (int b = 1; b < 6 - a; b++) {
			System.out.print(" ");
		}
		for (int b = 0; b < a; b++) {
			System.out.print("*");
		}
	System.out.println();
	}
}
	
	public static void main(String[] args) {
		C_For c = new C_For();
//		c.method1();
//		c.method2();
//		c.method3();
//		c.method4();
//		c.method5();
//		c.method6();
//		c.method7();
//		c.method8();
//		c.method9();
//		c.method10();
//		c.method11();
//		c.method12();
//		c.method13();
//		c.method14();
//		c.method15();
		c.method16();
		
	}

}
