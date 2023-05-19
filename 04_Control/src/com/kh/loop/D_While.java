package com.kh.loop;

import java.util.Scanner;

public class D_While {
	
	Scanner sc = new Scanner(System.in);
	
	/* while 문
	 * [표현법] while(조건식) {
	 *             .... 실행코드 ....
	 *        }
	 */
	
	/* break문
	 * - switck, 반복문의 실행을 중지하고 빠져나갈 때 사용
	 * - 반복문이 중첩되는 경우 break문이 포함되어 있는 반복문만 빠져나간다.
	 */

	public void method1() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method2() {
		
		// for문에서 무한루프(무한반복)이 생기는 경우
		
		for(int i=1; i<=5; ) {
			System.out.println(i);
			i++; // 이걸 작성하지 않으면 무한루프 발생됨
		}
		
		for(int i=1; ;) {
			if(i<=5) {
				System.out.println(i);
			} else {
				break; // 이걸 작성하지 않으면 무한루프 발생
			}
			i++;
		}
		}
	
	public void method3() {
		
		int input = 0;
		while(true) {
			System.out.print("숫자 입력 > ");
			input = sc.nextInt();
			System.out.println(input);
		}
	}

	public void method4() {
		
		/* do-while 문
		 * [표현법] 
		 * do {
		 *    ..... 실행코드 ....
		 *    } while(조건식);
		 * - 실 업무에서는 거의 쓰이지 않음
		 * - 조건과 상관없이 무조건 한번은 실행한다
		 */
	
		int number = 1;
		
		while(number == 0) {
			System.out.println("while 문");
		}
		
		do {
			System.out.println("do-while문");
		} while(number==0);
	}

	public void method5() {
		
		// 반복문 + 조건문을 사용 1과 100 사이의 값을 입력해서 임의로 지정한 랜덤값을 맞추면 게임이 끝나도록 만들고
		// 게임이 끝나면 몇번만에 숫자를 맞췄는지 출력문 만들기
		
		// 예시
		// 랜덤값이 57이다
		// 1과 100 사이의 값 입력 > 35
		// 더 큰 수를 입력하세요.
		// 1과 100 사이의 값 입력 > 70
		// 더 작은 수를 입력하세요.
		// 1과 100 사이의 값 입력 > 57
		// 3번만에 맞췄습니다.
		
		double random1 = Math.random(); 
		random1 = Math.random() * 100 + 1; 
		int random2 = (int) random1; 
		int count = 0;
		
		while(true) { 
			count++;
			System.out.print("1과 100 사이의 값 입력 > ");
			int num1 = sc.nextInt();
		 if (random2 == num1) {
			System.out.println(count + "번 만에 맞췄습니다.");
			break;
		} else if (random2 > num1) {
			System.out.println("더 큰 수를 입력하세요.");
		} else if (random2 < num1) {
			System.out.println("더 작은 수를 입력하세요.");
		} 
	}
}


	public static void main(String[] args) {
		D_While d = new D_While();
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
		d.method5();

	}

}
