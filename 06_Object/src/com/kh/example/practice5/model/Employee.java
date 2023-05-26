package com.kh.example.practice5.model;

public class Employee {

	private int empNo; // 사원 번호
	private String name; // 사원 이름
	private char gender; // 사원 성별
	private String phone; // 전화 번호
	private String dept; // 사원 부서, 영업부
	private int salary; // 사원 연봉
	private double bonus; // 보너스 율
	
	public Employee() {
	}
	
	public Employee(int empNo,String name, char gender, String phone, String dept, int salary, double bonus) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", dept="
				+ dept + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
}
