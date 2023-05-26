package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

public class SnackController {

	/* 멤버변수
	 * 생성자
	 * 메서드 구조로 만든다
	 */ 
	
	// 멤버변수 = 보통 모델(model) 로 만들어놓은 클래스가 온다
	Snack snack = new Snack(); // import 필수
	
	// 생성자
	public SnackController() {}
	
	// 메서드 
	// 데이터를 setter를 이용해 저장하고 저장되었다는 결과를 반환하는 메서드
	public boolean saveData(Snack viewSnack) {
		// snack 은 controller에서 만든 임시 데이터 창고이다
		// viewSanck은 Application(view) 에서 데이터를 담은 임시 데이터 창고
		
//		String kind = viewSanck.getKind();
//		snack.setKind(kind);
//		위 2줄은 아래 한줄과 동일한 내용이다.
		snack.setKind(viewSnack.getKind());
		snack.setName(viewSnack.getName());
		snack.setFlavor(viewSnack.getFlavor());
		snack.setNumOf(viewSnack.getNumOf());
		snack.setFlavor(viewSnack.getFlavor());
		
		// 위 경우 변수명을 Snack 으로 동일하게 만들면 아래에 this 를 사용해야 한다 변수명이 동일하기 때문에 동일한것을 표현해야 함으로
		
		return true;
	}
	
	// controller 에 저장된 데이터를 반환하는 메서드
	public Snack confirmData() {
		return snack; // this.snack으로도 표현 가능함
	}
	
	
}
