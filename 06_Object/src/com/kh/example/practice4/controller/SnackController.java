package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

// controller : 사용자가 화면에서 요청한 부분을 처리하는 기능 담당 이떄 처리후의 결과를 여기서 출력는것이 아니라 결과값을 다시 view에 반환하여 처리하도록 해야함

public class SnackController {
	
    private	Snack s = new Snack();

    public SnackController() {}
    
	// 데이터를 setter을 이용해 저장하고 저장되었단든 결과를 반환하는 메서드
	public boolean saveData(Snack s) { // Snack s 로 해당 클래스의 결과를 모두 가져옴
		
		this.s.setKind(s.getKind());
		this.s.setName(s.getName());
		this.s.setFlavor(s.getFlavor());
		this.s.setNumOf(s.getNumOf());
		this.s.setPrice(s.getPrice());
		
		return true;
	}
	
	// 저장된 데이터를 반환하는 메서드
	public Snack confirmData() { // Snack에 있는 결과를 그대로 반환할 예정이기 때문에 Snack로 작성
		return this.s;
	}
}
