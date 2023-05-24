package com.youtube.model;

public class User {

	public String email;
	public String phone;
	public String id;
	public String password;
	public String nickName;
	public char gender;
	
	public boolean login() { // 로그인
		return false;
	}
	
	public boolean signUp() { // 회원가입
		return false;
	}
	
	public User viewProfile() { // 프로필 보기
		return null;
	}
	
	public User updateProfile() { // 프로필 수정
		return null;
	}
	
	public boolean deleteProfile() { // 계정 삭제
		return false;
	}
	
}
