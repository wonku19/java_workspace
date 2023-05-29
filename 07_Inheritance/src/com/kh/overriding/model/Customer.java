package com.kh.overriding.model;

/* 모든 클래스는 Object 클래스의 후손이다.
 * 즉 최상위 클래스는 항상 Object 이다
 * Object 클래스에 있는 모든 메서드를 사용할 수 있다.
 */

public class Customer extends Object {

	protected String name; // 고객 이름
	protected String grade; // 고객 등급
	protected int bonusPoint; // 보너스 포인트
	protected double bonusRatio; // 보너스 적립 비율
	
	public Customer() {}

	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER";
		this.bonusRatio = 0.01;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override // <-- 에노테이션 이라고함 '이 메서드는 재정의된 메서드이다.' 라고 컴파일러에 명확히 알려주는 역할
	public boolean equals(Object obj) {
		Customer c = (Customer) obj; // 다형성에서 내용 재확인하기
		return this.name == c.name;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price;
	}
	
}
