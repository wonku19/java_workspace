package com.kh.step3;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		
		BeepPrintThread bpt = new BeepPrintThread();
		BeepThread bt = new BeepThread();
		
		Thread bpThread = new Thread(bpt, "BeepPrintThread");
		Thread bThread = new Thread(bt, "BeepThread");
		
		bpThread.start();
		bThread.start();
		
	}

}