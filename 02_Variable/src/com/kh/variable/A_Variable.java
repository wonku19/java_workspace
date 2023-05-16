package com.kh.variable;

public class A_Variable {

	// 변수(Varible)란? - 하나의 값을 저장하는 "공간"
	
	public static void main(String[] args) {
		
		// 실행할 메소드가 있는 클래스를 생성(new 키워드 사용) 해야한다.
		A_Variable v = new A_Variable();
		
		// 생성한 클래스로 메소드 실행(호출)
		v.printValue();
	}

	public void printValue() {

		//변수를 사용하지 않으면
		System.out.println(10 * 2 * 3.141592); // 원의둘레를 구하는 수식 = 반지름 x 2 x 3.14
		System.out.println(10 * 10 * 3.141592); // 원의 넓이를 구하는 수식 = 반지름 x 반지름 x 3.14
		
		System.out.println("----------------------------");
		
		//변수를 사용하면
		int r = 10;
		double pi = 3.141592;
		
		System.out.println(r * 2 * pi);
		System.out.println(r * r * pi);		
		// 변수를 사용하지 않은 위 구문과 동일한 결과가 출력되지만 위보다 아래가 깔끔해짐
	}
	
	public void variableTest( ) {
		/* 변수의 선언  
		   [표현법] 자료형, 변수명
		   1. 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당받을지에 대한 정보이다.
		   2. 변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우는 작업을 할 때 사용한다.
		   
		   변수의 초기화
		   [표현법] 변수명 = 값(리터럴)
		   - 변수에 처음으로 값을 저장하는 것
		   - '=' 는 오른쪽 데이터를 왼쪽의 변수에 대입(저장) 하는 연산자이다.
		     수학적 표현인 =(등호 : 같다) 와는 의미가 다르다
		 */
		
	     /* 기본 자료형(Primitive type)
		    - 실제 값을 저장함
		    1. 논리형 - [boolean] - 참(ture), 거짓(false) 만 입력 가능함 / 1byte
		 */
		boolean isTure;
		isTure = true;
		
		boolean isFalse = false;
//		isFalse = 1; // 참, 거짓이 아닌 숫자가 들어와서 오류 발생
		
		// 2. 문자형 - [char] - 한글자의 문자만 입력 가능함 / 2byte
		char ch = 'a';
//		ch = 'ab'; // 문자 2개가 입력되어 오류 발생
		
		// 3. 정수형 
		byte bNum; //byte - 1byte (8bit) : -128 ~ 127 사이의 숫자 출력 가능
		short sNum; // short - 2byte
		int iNum; //int - 4byte (숫자를 입력하게되면 기본값으로 인트 사용함)
		long lNum; //long - 8 byte
		
//		bNum = 128; // 출력가능범위인 127을 넘어서 에러 발생 오버플로우(Overflow) 라고함
		lNum = 98153496857489L; // long 변수 사용 시 숫자 뒤에 L또는 l을 넣어야 오류가 안생김
		
		// 4. 실수형 
		float fNum; // float - 4byte
		double dNum; //double - 8byte (실수형 사용 시 기본값으로 더블 사용함)
		
		fNum = 3.14F; // long 변수처럼 숫자 뒤에 F를 써줘야 오류가 안생김
		dNum = 3.14;
		
		/* 참조 자료형 : String - 4byte 위에서 배운 기본형 7가지를 제외한 나머지가 모두 참조 자료형임 (클래스)
		   - 주소값을 저장함
		 */
		String name = "강원구";
		
		// 변수의 명명 규칙
		// 1. 대소문자 구분된다.
		int number;
		int NUMBER;
		int Number;
//		String number; // 자료명이 달라도 이미 사용한 변수명이 중복으로 사용되면 오류 발생함
		
		// 2. 숫자로 시작하면 안된다.
//		int 1age; // 숫자로 시작해서 오류 발생
		int a5g4e2; 
		
		// 3. 특수문자는 '_', '$' 만 사용이 가능하다
		int _age;
		int a_g_e;
		int age$;
//		int %age; // 사용할 수 없는 문자 사용하여 오류 발생
		
		// 4. 예약어(Reserved word) 를 사용하면 안된다. (예약어 = public, void, int, class)
//		int public; // 예약어 사용으로 오류 발생
		
		/* 5. 낙타표기법 (카멜 케이스) ※권장사항으로 지키지 않는다고 오류가 나진 않음
		   - 첫글자는 항상 소문자로 작성 
		   - 여러 단어가 올 때는 각 단어의 첫 글자를 대문자로
		 */
		int maxnumber;
		int max_number;
		int maxNumber; // 카멜케이스로 기재한 예시
	}
	
	public void constant() {
		/* 상수 (constant)
		   [표현법] final 자료형, 변수명
		   - 변하지 않는 값으로 특정 변수의 값이 변경되는걸 원하지 않을 떄 사용한다
		   - 초기화 이후에는 값을 변경할 수 없다.
		 */
		int age;
		age = 20;
		age = 25; // 변수이기 때문에 변수명이 20에서 25로 바뀌어도 오류 발생X
				
		final int AGE;
		AGE = 30;
//		AGE = 35; // 상수이기 때문에 이미 변수명이 30으로 등록되어 오류 발생됨
	}
}
