package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadData implements Runnable {

	@Override
	public void run() {
		
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요....");
		System.out.println("입력하신 숫자는 " + input + " 입니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}


