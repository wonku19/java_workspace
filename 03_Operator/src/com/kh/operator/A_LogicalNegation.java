package com.kh.operator;

public class A_LogicalNegation {

	/* 논리 부정 연산자
	 * [표현법] !논리값(true, false)
	 * - 논리 값을 반대로 바꾸는 연산자 
	 *   ex) true -> false / false -> true	 
	 * - 논리 부정 연산자를 입력한다고 해서 입력된 논리값 자체가 바뀌진 않음 
	 * - 느낌표를 2번 붙이면 두번 바뀜 
	 */
	
	public static void main(String[] args) {
	
	boolean b1 = true;
	boolean b2 = false;
	
	System.out.println("b1 : " + b1);
	System.out.println("b1 : "+ !b1);
	System.out.println("b1 : "+ b1);
	
	b1 = !b2;
	System.out.println("b1의 부정" + !!b1);
}
	
}