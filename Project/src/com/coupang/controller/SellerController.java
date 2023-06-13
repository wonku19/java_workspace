package com.coupang.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.coupang.model.Seller;

public class SellerController {
	
	HashMap<String, ArrayList> map = new HashMap();
	
	Seller se = new Seller();	
	
	// 물품 등록 > 물품명, 물품 갯수, 물품 금액, 판매자 정보	
	public boolean listup(String name, Seller se) {
		
		if(!map.containsKey(name)) {
			
			ArrayList list = new ArrayList();
			
			list.add(se.getName());
			list.add(se.getNumber());
			list.add(se.getPrice());
			list.add(se.getSeller());
			
			map.put(name, list);
			System.out.println("입력물품 : " + se.toString());
			System.out.println(map);
			return true;
		}
		return false;
	}
	
	// 등록물품 리스트 전체 조회
	public HashMap viewlist() {
		return map;
	}
	
	// 물품 변경 > 물품명, 물품 갯수, 물품 금액, 판매자 정보 변경
	public boolean change(String name, ArrayList list) {
		if(!map.containsKey(name)) {
			map.put(name, list);
			return true;
		}
		return false;
	}
	
	// 물품 변경 시 사용할 메서드
	public boolean changeup(String name, Seller se) {
		
		if(map.containsKey(name)) {
			
			ArrayList list = new ArrayList();
			
			list.add(se.getName());
			list.add(se.getNumber());
			list.add(se.getPrice());
			list.add(se.getSeller());
			
			map.put(name, list);
			System.out.println("입력물품 : " + se.toString());
			System.out.println(map);
			return true;
		}
		return false;
	}
	
	// 물품 삭제 > 물품명 입력 후 해당 물품의 정보 삭제
	public boolean remove(String name) {
		if(map.containsKey(name)) {
			map.remove(name);
			return true;
		}
		return false;
	}

}

