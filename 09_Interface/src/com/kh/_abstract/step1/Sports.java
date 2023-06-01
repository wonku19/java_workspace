package com.kh._abstract.step1;

public abstract class Sports { // 추상 메서드에는 추상 클래스로 구현해야함

	protected int numberOfPlayers; // 참여하는 사람의 수

	public Sports(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	/* 추상메서드 
	 * - {} (중괄호) 가 구현되지 않은 상태
	 * - 미완성된 추상 메서드가 있다는 이야기는 이 클래스 또한 미완성 상태라는 뜻
	 * - 즉 해당 클래스로 객체를 생성할 수 없다
	 * - 자식 클래스에서 무조건 재정의! 재정의 하지 않으면 에러 발생됨!
	 */
	public abstract void rule(); // abstract 추상메서드를 만드는것 추상 메서드는 구현부가 없음
	
}
