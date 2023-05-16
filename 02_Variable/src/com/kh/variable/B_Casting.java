package com.kh.variable;

public class B_Casting {

	/* 형변환(Casting)
	   - 값의 타입을 다른 타입으로 변환하는것
	   - boolean을 제외한 기본형은 서로 형변환이 가능하다
	 */
	
	public static void main(String[] args) {
		B_Casting b = new B_Casting();
//		b.autoCastinf(); //오토케스팅 (자동형변환) 을 하기 위한 메소드
		b.casting();
	}
	
	/* 자동 형변환 (묵시적 형 변환)
	   - 자동으로 형 변환이 이루어지기 때문에 따로 형변환을 하지 않아도 된다.
	   - 데이터 범위가 작은 자료형을 큰 자료형으로 변환한다.
	 */
	public void autoCastinf() {
		byte b = 10; // 1byte
		short s = b; // 2byte
		int i = s; // 4byte
		long l = i; // 8byte
		
		float f = l; // 4byte - 표현 가능한 수의 범위가 더 크기 때문에 출력 가능
		double d = l; // 8byte - 
		
		System.out.println("b :" + b);
		System.out.println("s : "+s);
		System.out.println("i : "+i);
		System.out.println("l : "+l);
		System.out.println("f : "+f);		
		System.out.println("d : "+d);
	
		System.out.println("--------------------");
		
		double result = 12 + 3.3; // byte, short 타입의 데이터는 연산 시 무조건 int 타입으로 변환 후 처리한다.
		int result2 = b + s;
		
		System.out.println(result);
		System.out.println(result2);
	}
	
	/* 강제 형변환 (명시적 형변환)
	   [표현법] (자료형) 데이터;
	   - 범위가 큰 크기의 자료형의 데이터를 작은 크기의 자료형으로 변환하려고 할때 사용함
	   - 강제 형변환의 경우 데이터 손실이 발생할 수 있다.
	 */
	
	public void casting() {
		double d = 4.12345678904567890; // 15자리 표현 가능
		float f = (float) d; // 6자리 표현 가능
		int i = (int)f; // 정수만 표현 가능하여 데이터 손실 발생
	 	
		System.out.println("d : "+ d);
		System.out.println("f : " +f); // double에서 float로 형변환 되면서 데이터 손실 발생
		System.out.println("i : " +i);
		
		System.out.println("--------------------");

		
		int sum = (int) (i + d);
		int sum2 = i + (int)d;
		
		System.out.println("sum : "+sum);
		System.out.println("sum2 : "+sum2);

		System.out.println("--------------------");
		int number = 290;
		byte bNumber = (byte)number;
		
		System.out.println(bNumber); 
		
		int number2 = 128;
		byte bNumber2 = (byte)number2;
		System.out.println(bNumber2); // byte는 -128부터 127까지 표현 가능하여 128을 표현하기 위헤 다음자리인 -128이 출력됨
		
		// char <-> int : 각 문자들마다 고유한 숫자(유니코드)가 지정되어 있기 때문에 쌍방향으로 형변환이 가능하다
		// char는 음수값 저장 불가 = 값의 범위가 0~65535 (2byte) 만 표현 가능
		int num = 'A';
		System.out.println("num :" +num);
		
		char ch = 52143;
		System.out.println("ch : " + ch);
	}
	 
}
