package com.kh.example.practice5.controller;

import com.kh.example.practice5.model.Employee;

public class EmployeeController {

	private Employee employee = new Employee();
	
	// 오버로딩 : 매개변수 갯수가 다르고 종류가 달라서 같은 이름을 써도 오류가 발생되지 않음
	public void add(int empNo, String name, char gender, String phone) {
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		this.add(empNo, name, gender, phone);
		employee.setDept(dept);
		employee.setSalary(salary);
		employee.setBonus(bonus);
	}
	
	public void modify(String phone) {
		employee.setPhone(phone);
	}
	
	public void modify(int salary) {
		employee.setSalary(salary);
	}
	
	public void modify(double bonus) {
		employee.setBonus(bonus);
	}
	
	public Employee info() {
		return employee;
	}	
	
}
