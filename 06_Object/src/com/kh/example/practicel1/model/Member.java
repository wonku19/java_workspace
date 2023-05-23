package com.kh.example.practicel1.model;

public class Member {

	public String memberId;
	public String memberPwd;
	public String memberName = "강원구";
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public void changeName(String name) { // 매개변수 changeName를 호출하면 String name을 전달한다
				memberName = name;
	}
	
	public void printName() {
		System.out.println(memberName);
	}

}
