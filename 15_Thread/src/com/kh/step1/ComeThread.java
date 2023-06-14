package com.kh.step1;

/* 스레드 생성 방법
 * 1. Thread 클래스를 상속받는 방법
 *  - Thread 클래스를 상속 후에 run() 메서드를 오버라이딩 한다
 *  - Thread 클래스를 상속한 자식 클래스를 생성 후 start() 메서드를 호출 한다
 */

public class ComeThread extends Thread{ // 자바 클래스인 Thread를 상속받는다

	public ComeThread(String name) { // 매개변수인 String name 를 받는다
		super(name); // Thread 로 name 을 넘긴다
	} 
	
	// 스레드가 작동하는 부분
	public void run() { // run() 메서드 오버라이딩 : 작업하고자 하는 내용 작성
		
		/* sleep() : 지정된 시간동안 스레드를 멈추게 한다
		 * - sleep()에 의해 일시정지 상태가 된 스레드는 지정된 시간이 다 되거나 interrupt()가 호출되면 InterruptedException이 발생되어 잠에서 깨어나 실행 대기 상태가 된다.
		 */
		for(int i=0; i<20; i++) {
			try {
				Thread.sleep(1000); // Thread.sleep(1000); 이부분만 작성하면 오류생김 try, catch 추가 / 1000 이 1초임
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread :: " + name + ", " + i);
		}
	}
}
