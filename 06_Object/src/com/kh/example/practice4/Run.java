package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.model.Snack;
import com.kh.example.practice4.controller.SnackController;

public class Run {
	
	public static void main(String[] args) {
		
		/* 스낵류를 입력하세요.
		 * 종류 : 빵 // 빵은 입력값
		 * 이름 : 케이크 // 케이크는 입력값
		 * 맛 : 블루베리 // 블루베리는 입력값
		 * 개수 : 1 // 개수는 입력값
		 * 가격 : 15000 // 가격은 입력값
		 * 저장이 완료되었습니다.
		 * 빵(케이크 - 블루베리) 1개 15000
		 */
		
//		Snack s = new Snack();
		Scanner sc = new Scanner(System.in);
		
		SnackController scr = new SnackController();

		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine(); 
//		s.setKind(sc.nextLine()); // SnackController 클래스가 없을떄 입력받은 방법
				
		System.out.print("이름 : ");	
		String name = sc.nextLine();
//		s.setName(sc.nextLine());
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
//		s.setFlavor(sc.nextLine());
		
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
//		s.setNumOf(sc.nextInt());
		
		System.out.print("가격 : ");	
		int price = Integer.parseInt(sc.nextLine());
//	    s.setPrice(sc.nextInt());
		
		Snack s = new Snack(kind, name, flavor, numOf, price);
		
		if(scr.saveData(s)) {
			System.out.println("저장이 완료되었습니다.");
			System.out.println(scr.confirmData());
//			System.out.println(s.getKind() + "(" + s.getName() + " - " + s.getFlavor() + ")" + s.getNumOf() + "개" + s.getPrice() + "원"); // SnackController 클래스가 없을떄 출력 방법
		}
					
	}

}

