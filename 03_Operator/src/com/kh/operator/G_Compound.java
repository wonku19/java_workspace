package com.kh.operator;

public class G_Compound {
	
	/* 복합 대입 연산자
	 * - 산술 연산자와 대입 연산자가 결합 되어있는 형태
	 * - 연산 처리속도가 빨라지므로 사용하는걸 권장함
	 * - 산술연산자 +, -, *, /. % 에다가 = 표시를 붙여줌
	 *   복합대입연산자 +=, -=, *=, /=, %=
	 * - a = a + 3; 을 좀 더 간결하게 표현하기 위해 복합연산자 사용하여 a += 3; 으로 표현 가능
	 * 
	 *   a = a + 3;		=> a += 3;
	 *   a = a - 3;		=> a -= 3;
	 *   a = a * 3;		=> a *= 3;
	 *   a = a / 3;		=> a /= 3;
	 *   a = a % 3;		=> a %= 3;
	 */

	public static void main(String[] args) {
		int number = 12;
		String str = "Hello";
		
		number += 3; 
		System.out.println(number); // number(12) + 3 = 15
		
		number -= 5;
		System.out.println(number); // number(15) - 5 = 10
		
		number *= 6;
		System.out.println(number); // number(10) * 6 = 60
		
		number /= 3;
		System.out.println(number);	// number(60) / 3 = 20
		
		number %= 3;
		System.out.println(number); // number(20) % 3 = 몫 6, 나머지 2 로 2가 출력됨
		
		str += ", World!";
		System.out.println(str); // str(Hello) + , World = Hello, World!
	}
	
}
