package com.kh.practice;

/* 컴파일 에러 (compile-time error) : 컴파일 시에 발생하는 에러 (빨간줄 확인 가능)
 * 런타임 에러 (runtime error) : 실행시에 발생하는 에러 (빨간줄은 확인 안되지만 콘솔창에서 오류내용 확인 가능)
 * 논리적 에러 (logical error) : 실행은 되지만, 의도와 다르게 동작함 (코드를 잘못짜서 다시 짜야함)
 * 
 * 런타임 에러의 종류 2가지
 * - 에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
 *   --> 메모리 부족(OutOfMememoryError) 또는 스택오버플로우(StackOverflowError)
 * - 예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 오류
 * 
 * Object(최상위클래스) > Throwable > Exception / Error
 */

public class A_TryCatch {

	/* try ~ catch 
	 * [표현법]
	 * try {
	 * 		// 예외가 발생할 가능성이 있는 코드
	 * } catch(예외클래스 e) {
	 * 		// try 블록에서 예외가 발생할 때 --> catch블록으로 이동하여 예외처리 코드 실행
	 * } finally { // finally는 있어도 되고 없어도 됨
	 * 		// 예외가 발생하거나 발생하지 않거나 무조건 실행
	 * 		// finally 주로 자원을 반납하는 코드 ... close()
	 * }
	 * 
	 * - printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외의 메시지를 화면에 출력
	 * - getMassage() : 발생한 예외클래스의 객체에 저장된 메시지를 얻을 수 있음
	 */
	
	public static void main(String[] args) {
	
		try {
			throw new Exception(); // 고의로 예외 발생! throw new Exception(); 가 try 밖에 있으면 빨간줄로 오류가 표시됨
		} catch(Exception e) {
//			e.printStackTrace(); // 실행 시 콘솔창에서 오류메시지 확인 가능
			System.out.println(e.getMessage());
		}
		
	}
	
}
