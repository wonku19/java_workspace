package com.kh._interface.step1;

public class Bus implements Vehicle{ // 인터페이스를 가져올때는 implements 사용

	@Override
	public void run() {		
		System.out.println("버스가 달립니다.");
	} 

}
