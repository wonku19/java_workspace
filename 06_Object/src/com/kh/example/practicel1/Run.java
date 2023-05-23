package com.kh.example.practicel1;

import java.util.Scanner;

import com.kh.example.practicel1.model.Member;

public class Run {
	
	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.printName();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 이름 > ");
		String name = sc.nextLine();
		
		m.changeName(name);
		m.printName();
	}
	
}
