package com.kh._interface.step3;

public interface Volume {

	// 인터페이스 = 추상메서드 + 상수 
	int MAX_VILUME = 10; // 상수는 대문자만 써야함!! // puvlic static final 이 앞에 숨겨져 있는거임
	int MIN_VOLUME = 0;
	
	// 인터페이스에서 메서드는 무조건 추상 메서드
	void setVolume(int volume);
	
}
