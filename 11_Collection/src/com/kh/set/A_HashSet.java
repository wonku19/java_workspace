package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.set.model.Person;

/* Set의 특징
 * - 중복 없음
 * - 순서 없음
 * - List 와의 차이는 중복이 허용되느냐, 순서가 있냐 없냐의 차이임
 */ 

public class A_HashSet {

	/* HashSet
	 * - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
	 */

	public static void main(String[] args) {
		A_HashSet a = new A_HashSet();
//		a.method1();
		a.method2();
	}

	public void method1() {
		Set<String> set = new HashSet<>();
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set);
		System.out.println(set.size()); // .size() = 데이터의 갯수 표시
		System.out.println(set.contains("마동석")); // .contains() = 괄호안에 요소가 있는지 없는지 확인해줌
		
		set.remove("아오키 무네타카");
		
		System.out.println(set);
		
		set.clear();
		
		System.out.println("비었는지? " + set.isEmpty()); // .isEmpty() = .앞에 List, set에 요소가 비어있는지 아닌지를 확인해줌
	}
	
	public void method2() {
		
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("마동석", 52));
		set.add(new Person("이준셕", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));
		set.add(new Person("이준셕", 39));
		
		/* 객체의 주소값을 가지고 비교하기 떄문에 모두 다른 객체로 인식해서 중복 제거되지 않음
		 * --> Person 클래스에서 hashCoad(), equals() 메서드를 재정의 하면 주소값을 동일하게 설정하여 중복값이 제거됨
		 */
		System.out.println(set); 
		System.out.println(set.size());
		
		/* Iterator
		 * - 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
		 * - iterator() 를 호출해서 Iterator를 구현한 객체를 얻어서 사용
		 */
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) { // .hasNext() = 읽어올 요소가 있는지 확인하는 메서드
			System.out.println(it.next()); // .next() = 다음 요소를 읽어옴
			
		}
		
	}
	
}
