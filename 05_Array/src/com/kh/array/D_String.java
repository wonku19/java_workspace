package com.kh.array;

public class D_String {
	
	/* 문자열 : 문자의 배열, 여러 개의 문자가 배열을 이룬 것이 문자열이다.
	 * 자바에서는 문자는 작은따음표('') / 문자열은 큰따음표("") 를 사용하여 나타낼 수 있음
	 * - String.charAy(int index)
	 *   : 인덱스에 있는 문자를 char 형식으로 반환하는 매소드
	 * - String.toCharArray()
	 *   : 모든 문자가 들어 있는 char[] 형식으로 데이터를 반환하는 매소드
	 */

	public static void main(String[] args) {
		
		char[] arr = "Hello, World".toCharArray(); // 한글자씩 배열로 만들어줌
		
		for(char c : arr) {
			System.out.println(c);
		}

	}

}

/* 자주뜨는 에러 메시지
 * ArrayIndexOutBoundsException
 * --> 배열의 인덱스 범위를 벗어나서 발생하는 에러
 * 해결책 : 조건식 수정 (i < 배열의 길이, i <= 배열의 길이 -1) 
 */
 