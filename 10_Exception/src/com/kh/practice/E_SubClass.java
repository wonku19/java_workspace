package com.kh.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class E_SubClass extends E_SuperClass {

//	@Override
//	public void method() {
//		// 오버라이딩 시 throws를 작성하지 않아도 됨 이미 부모 클래스인 SuperClass에서 작성했기 때문에
//	}
	
//	public void method() throws IOException {
//		// 부모 클래스의 메서드와 같은 Exception 을 throws 하는 것은 가능
//	}
	
//	@Override
//	public void method() throws Exception {
//		// 부모 클래스의 메서드보다 더 상위 타입의 Exception을 throws 하는 것은 불가능
//	}

	public void method() throws FileNotFoundException {
		// 부모 클래스의 메서드보다 더 하위 타입의 Exception을 throws 하는 것은 가능
	}
	
}
