package com.kh._abstract.step1;

public class BasketBall extends Sports {

	public BasketBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}

	@Override
	public void rule() { // 부모클래스인 Sport 클래스가 추상클래스이기 때문에 매서드 재정의를 무조건 해야 오류가 발생되지 않음
		System.out.println("BasketBall의 선수의 수는 " + this.numberOfPlayers + "명, 공을 던져서 링에 넣어야 한다");
	}
	
	

}
