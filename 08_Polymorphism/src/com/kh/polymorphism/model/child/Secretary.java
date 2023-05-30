package com.kh.polymorphism.model.child;

import com.kh.polymorphism.model.parent.Employee;

public class Secretary extends Employee{ // import 필요할때 컨트롤 + 스페이스 누르면 자동으로 임포트 작성됨

	private String nameOfBoss;

	public Secretary() {}

	public Secretary(String name, int salary, String nameOfBoss) {
		super(name, salary);
		this.nameOfBoss = nameOfBoss;
	}

	public String getNameOfBoss() {
		return nameOfBoss;
	}

	public void setNameOfBoss(String nameOfBoss) {
		this.nameOfBoss = nameOfBoss;
	}

	@Override
	public String toString() {
		return super.toString() + " / Secretary [nameOfBoss=" + nameOfBoss + "]";
	}
	
}
