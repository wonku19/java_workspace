package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	
	public static void main(String[] args) {
		
		CastingPractice cp = new CastingPractice();
		cp.method1();
		cp.method2();

	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char a = sc.nextLine().charAt(0);
		int b = (int)a;
		char c = (char) (a + 1);
		int d = (int)c;
		
		System.out.println(a + " unicoad : " + b);	
		System.out.println(c + " unicoad : " + d);	
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int a = sc.nextInt();
		System.out.print("영어 : ");
		int b = sc.nextInt();
		System.out.print("수학 : ");
		int c = sc.nextInt();
		int d = a + b + c;
		float e = (a + b + c) / 3f;
		System.out.printf("총점 : %d\n", d);
		System.out.printf("평균 : %.2f", e);
		
	}
}

