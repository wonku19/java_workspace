package com.kh.step4.model;

public class Car {

	/* 접근제어자(access modifier)
	 *  - 클래스, 멤버변수, 생성자, 메서드에 사용되며 외부로부터 접근을 제한하는걸 접근제어제 라고함
	 *  - 접근제어자를 사용하는 이유 : 외부로부터 데이터를 보호하기 위해
	 *                          내부적으로만 사용되는 부분을 감추기 위해서 (정보은닉)
	 * private : 같은 클래스 내에서만 접근이 가능해짐
	 * default : 같은 패키지 내에서만 접근이 가능함
	 * protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능함
	 * public : 접근제한이 없음 
	 */
	
	private String color; //색상
	private String gearType; // auto(자동) or manual(수동)
	private int door; // 문의 개수
	
	
	public String toString() {
	 return "색상 : " + color + " 변속기 : " + gearType + " 문의 개수 : " + door;	
	}

	
	/* 생성자
	 * - 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드' ex) Car c = new Car();
	 * - 인스턴스 변수의 초기화 또는 인스턴스 생성 시 수행할 작업에 사용
	 * [표현법]
	 *  클래스명(타입 변수명, 타입 변수명, 타입 변수명, ...) {
	 *    인스턴스 생성 시 수행될 코드
	 *    주로 인스턴스 변수의 초기화 코드 작성
	 *  }
	 *  
	 * 생성자 작성 시 주의!!!
	 * - 반드시 생성자명은 클래스명과 동일해야함 (대,소문자 구분)
	 * - 반환형이 존재하지 않음 --> 만약 반환형을 쓰게되면 메서드로 인식
	 */
	
	/* 기본 생성자 (default constructor)
	 * - 매개변수가 없는 생성자
	 * - 클래스에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가
	 * - 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않음
	 */
	public Car() {} // 기본 생성자 
	
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	
	public Car(String color, String gearType, int door) { // 오버로딩
		
		/* this : 인스턴스 자신을 가르키는 참조 변수 
		 *        인스턴스의 주소가 저장되어 있음
		 *        모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
		 */
		
		this(color, gearType); // 이처럼 중복되는 동일한 초기화하는 내용의 생성자가 있는 경우 this() 사용 가능
		                       // 유의사항 : 반드시 첫줄에 작성 해야함
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

