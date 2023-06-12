package com.coupang.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.coupang.model.User;

public class UserController {
	
	HashMap<String, ArrayList> map = new HashMap();
	User us = new User();
	
	// 회원가입
	public boolean join(String id, User us) {
		
		if(!map.containsKey(id)) {
			
			ArrayList list = new ArrayList();
			
			list.add(us.getId());
			list.add(us.getName());
			list.add(us.getPassword());
			list.add(us.getAddress());
			list.add(us.getNumber());
			
			map.put(id, list);
			return true;
		}
		return false;
	}
	
	// 로그인
	public String login(String id, String password) {
		
		ArrayList infoList = new ArrayList();
		infoList = map.get(id);
				
		if(map.containsKey(id) && infoList.get(2).equals(password)) {
			return (String)infoList.get(1);
		}
		return null;
	}

	// 비밀번호 변경
	public boolean passwordchange() {
		
		return false;
	}
	
	// 주소 변경
	public boolean addresschange() {
		
		return false;
	}
	
	// 전화번호 변경
	public boolean numberchange() {
		
		return false;
	}
	
	// 회원 탈퇴
	public boolean removeuser(String id, String password) {
		ArrayList infoList = new ArrayList();
		infoList = map.get(id);
		
		if(map.containsKey(id) && infoList.get(2).equals(password)) {
			map.remove(id);
			return true;
		}
		return false;
	}
	
	public HashMap viewUserList() {
		return map;
	}
	

}
