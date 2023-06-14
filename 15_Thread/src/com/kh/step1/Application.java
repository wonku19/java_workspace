package com.kh.step1;

/* ▶ 프로세스 (공장 이라고 생각하면됨)
 * - 운영체제에서 실행 중인 하나의 프로그램(애플리케이션 이라고도 함)
 * 
 * ▶ 스레드 (공장에서 일하는 일꾼이라고 생각하면됨)
 * - 프로세스 내에서 할당된 자원을 이용해 실제 작업을 수행하는 작업 단위
 * - 모든 프로세스는 하나 이상의 스레드를 가지며 각각 독립적인 작업 단위를 가진다.
 * - 하나의 스레드는 하나의 코드 실행 흐름이기 때문에 한 프로세스 내에 여러 개의 스레드가 존재한다면 여러 개의 실행 흐름이 생긴다는 의미이다.
 * 
 * ▶ 멀티 스레드 
 * - 하나의 프로세스 내에서 여러 스레드가 동시에 작업을 수행하는 것
 * - 단일 스레드로 작업을 진행하면 2개의 작업을 시켜도 하나를 완료하고 다음 작업을 시작하게 되고 멀티 스레드로 하게 되면 동시에 2개의 작업을 실행하게 된다.
 */

public class Application {

	public static void main(String[] args) {
		
		// 1. Thread 생성
		ComeThread come = new ComeThread("ComeThread");
		GoThread go = new GoThread("GoThread"); // 기존 come 일꾼에 go 일꾼 추가

		// 2. start 호출
		come.start();
		go.start();
	}

}
