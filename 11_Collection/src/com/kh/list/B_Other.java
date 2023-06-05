package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class B_Other {

	public static void main(String[] args) {
		B_Other b = new B_Other();
//		b.method1();		
//		b.method2();	
		b.method3();	
	}
	
	// Vector
	// - 동기화된(synchronized) 메서드로 구성, Vector과 ArrayList 의 차이가 동기화의 차이임, 속도차이가 있기에 ArrayList를 많이 씀
	public void method1() {
		Vector v = new Vector(); // import 필수
		v.add(0);
		v.add(1);
		v.trimToSize(); // 별도의 크기 지정 없이 입력값이 size가 됨
		
		v.add(3);
		v.add(4);
		v.ensureCapacity(5); // 남아있는 칸의 *2만큼 사이즈를 추가 지정함
		v.setSize(10); // 총 10칸을 지정하고 빈칸은 null 을 입력함
		v.clear(); // 전체 삭제, 공간만 남아있음
		v.trimToSize(); // 남아있는 공간 삭제
		
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity()); // capacity 의 기본값은 10임, new Vector() 에서 괄호 안에 숫자를 넣으면 해당 값으로 변경됨

	}
	
	// 스택(Stack) : 
	// - 마지막에 저장한 것을 제일 먼저 꺼내는 LIFO(Last In First Out) 구조 
	public void method2( ) {
		Stack s = new Stack(); // import 필수
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop(); // 마지막에 입력된 3이 빠짐
		s.push(4);
		s.pop(); // 마지막에 입력된 4가 빠짐
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop(); // 마지막에 입력된 7이 빠짐
		
		System.out.println(s); // 입력된 값 중에서 0, 1, 2, 5, 6 만 출력됨
	}
	
	// 큐(Queue) : 처음에 저장한 것을 제일 먼저 꺼내는 FIFO(First In First Out) 구조
	public void method3() {
		Queue q = new LinkedList();  // import 필수
		
		q.offer(0);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.poll(); // 처음 입력된 0 제거
		q.add(4);
		q.remove(); // 그다음 입력값 1 제거
		q.add(5);
		q.add(6);
		q.add(7);
		q.remove(); // 그다음 입력값 2 제거
		
		System.out.println(q);
	}
	
}
