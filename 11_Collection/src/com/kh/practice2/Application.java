package com.kh.practice2;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		Application app = new Application();
		app.method1();
	} 
	
	// TreeSet 사용해서 만들기
	public void method1() {
		
		TreeSet<Integer> lotto = new TreeSet<>();
		
		int count = 0;
		while(true) {
			TreeSet<Integer> myLotto = new TreeSet<>();
			count++;
			
			for(int i=0; lotto.size()<6; i++) {
				int num = (int)(Math.random() * 45) + 1;
				lotto.add(num);
				
			} for(int j=0; myLotto.size()<6; j++) {	
				int num = (int)(Math.random() * 45) + 1;
				myLotto.add(num);
			}
			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호 : " + myLotto);
			if(myLotto.equals(lotto)) {
				System.out.println("횟수 : " + count);
				 break;
			}
		}
	}
}
