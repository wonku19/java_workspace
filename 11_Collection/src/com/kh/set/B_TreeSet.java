package com.kh.set;

import java.util.Set;
import java.util.TreeSet;

import com.kh.set.model.Person;

/* TreeSet
 * - 중복없음, 순서없음은 set과 동일 하지만 저장과 동시에 자동 오름차순 정렬함
 * - HashSet보다 데이터 추가, 삭제에 시간이 더 걸림
 * - HashSet 과 모든부분이 동일하지만 정렬기능이 있냐 없냐의 차이가 있음
 */

public class B_TreeSet {

	public static void main(String[] args) {
		B_TreeSet b = new B_TreeSet();
//		b.method1();
		b.method2();

	}

	public void method1() {
		
		Set<String> set = new TreeSet<>();
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set);
		
	}
	
	public void method2() {
		
		TreeSet<Person> set = new TreeSet<Person>();
		
		set.add(new Person("마동석", 52));
		set.add(new Person("이준셕", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));
		set.add(new Person("이준셕", 39));
		
		System.out.println(set);
	}
	
}
