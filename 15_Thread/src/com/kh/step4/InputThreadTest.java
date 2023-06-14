package com.kh.step4;

public class InputThreadTest {

	public static void main(String[] args) {
		
		InputThreadData data = new InputThreadData();
		InputThreadCount count = new InputThreadCount();
		
		Thread dataThread = new Thread(data, "InputThreadData");
		Thread countThread = new Thread(count, "InputThreadCount");
		
		dataThread.start();
		countThread.start();
		
	}

}
