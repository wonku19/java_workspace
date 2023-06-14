package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest3 {

	// 출력시 팝업창 + 10초 카운트가 시작되고 입력하면 카운팅 중단, 카운팅이 끝나면 프로그램 종료
	
	boolean inputCheck = false;
	
	public static void main(String[] args) {
		
		InputThreadTest3 process = new InputThreadTest3();
		
		Thread t2 = new Thread (new InputThread(process));
		Thread t = new Thread(new Counting(process));
		t.start();
		t2.start();	
	}
}

class InputThread implements Runnable {
	
	InputThreadTest3 process;
	
	InputThread(InputThreadTest3 process) {
		this.process = process;
	}

	@Override
	public void run() {
		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요....");
		System.out.println("입력하신 숫자는 " + input + " 입니다.");
		
		process.inputCheck = true;
	}
}

class Counting implements Runnable {
	
	InputThreadTest3 process;
	Counting(InputThreadTest3 process) {
		this.process = process;
	}
	
	@Override
	public void run() {
		// 2. 카운팅 작업
		for(int i=10; i>0; i--) {
			try {
				if(process.inputCheck) { 
					break;
				}
					System.out.println(i);
					Thread.sleep(1000);				
			} catch (InterruptedException e) {}
		} 
		if(!process.inputCheck) {
			System.out.println("입력시간이 초과되었습니다.");
			System.exit(0); // 프로그렘 종료시켜줌
		}
	}
}