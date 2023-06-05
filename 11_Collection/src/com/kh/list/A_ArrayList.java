package com.kh.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.list.model.Person;

/* 컬렉션 : 자바에서 제공하는 자료구조를 담당하는 프레임워크
 * - java.util : 패키지에 컬렉션과 관련된 인터페이스와 클래스들이 포함되어있음
 * - 컬렉션을 사용하면 데이터 추가, 삭제, 정렬 등의 처리가 간단하게 해굘되어 자료구조적 알고리즘을 구현할 필요가 없음
 */

/* List
 * - 중복 허용
 * - 순서가 있음 
 */

public class A_ArrayList {
	
	public static void main(String[] args) {
		A_ArrayList a = new A_ArrayList();
//		a.method1();
//		a.method2();
//		a.method3();
	}
	
	public void method1() {
		
		List list = new ArrayList(); // import 필수, 배열과 달리 사이즈 크기 지정 안함
		
		list.add("가나다");
		list.add("라마바");
		list.add("사아자");
		list.add("차카타");
		list.add("파하");
		
		System.out.println(list);
		
	}
	
	public void method2() {
		
		/* 제네릭스(Generics)
		 * - 컴파일 시 타입을 체크해주는 기능
		 * - <> 다이아몬드 연산자를 사용함
		 * 
		 * 컬렉션에서 제네릭스를 사용하는 이유
		 * - 명시된 타입의 객체만 저장하도록 제한을 두기 위해 사용함
		 * - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환을 하지 않아도 됨 
		 */
		
		ArrayList<Person> list = new ArrayList(); // 제네릭스로 <Person> 작성 시 타입이 맞지 않으면 오류가 발생된다
		
		//1. add(E e) : 리스트 끝에 추가
		list.add(new Person("전현무", "삼성동", 45));
		list.add(new Person("남궁민", "서울숲", 45));
		list.add(new Person("이시언", "상동", 40));
		list.add(new Person("이제훈", "서울숲", 38));
//		list.add(new Person("유재석")); // 제네릭스를 사용하지 않으면 오류가 발생하지 않지만 <Person> 제네릭스를 추가하여 타입이 맞지 않기에 오류 발생됨
		
		// 2. add(int index, E e) : 인덱스를 지정하여 해당 인덱스에 추가
		list.add(1, new Person("유재석", "압구정", 50)); // 리스트에서 2번째 위치에 추가됨
		list.add(3, new Person("강호동", "압구정", 52)); // 리스트에서 4번째 위치에 추가됨
		
		// 3.set(int index, E e) : 해당 인덱스의 값을 변경할때 사용함
		list.set(3, new Person("오은영", "강남", 57));
		
		System.out.println(list);
		
		// 4. size() : 리스트 안에 몇 개의 데이터가 있는지
		System.out.println("사람 수 : " + list.size());
		
		// 5. remove(int index) : 해당 인덱스의 객체 삭제
		System.out.println(list.remove(0) + " 삭제");
		System.out.println(list);
		System.out.println("사람 수 : " + list.size());
		
		// 6. get(int index) : 해당 인덱스로 객체 가져오기 (getter 라고 생각하면됨)
		System.out.println(list.get(0));
		
		// 7. sublist(int index1, int index2) : 추출해서 새로운 List로 반환
		List sub = list.subList(0,  2); // 0번째~ 2번째 사이 요소인 0, 1만 추출하여 새로운 리스트로 만듦
		System.out.println(sub);
		
		// 8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가하는 메서드
		list.addAll(sub);
		System.out.println(list); // sub에서 새로운 list인 0, 1번 요소가 리스트 맨뒤에 중복되어 추가됨
		
		// 9. isEmpty() : 컬렉션이 비어있는지 묻는 메서드
		System.out.println("리스트가 비어있는지 : " + list.isEmpty());
		
		
		// [실습] 1. 리스트에 저장된 사람들의 평균 연령을 출력해보기
		int sum = 0;
		for(Person p : list) {
			sum += p.getAge();
		}
		System.out.println("평균 연령 : " + sum / list.size());
		
		// [실습] 2. 저장된 사람들의 이름만 출력해보기
		for(Person p : list) {
			System.out.print(p.getName() + " ");
		}
		
		
		// [실습] 3. 서울숲에 사는 사람들만 출력
		for(Person p : list) {
			if(p.getAddr().equals("서울숲")) {
				System.out.println(p);
			}
		}
		
		// [실습] 4. 나이 순서대로 출력해보기 // 이름순으로 출력해보기
		Collections.sort(list);
		System.out.println(list);		
		
		// 10. clear() : 전체 삭제
		list.clear();
		System.out.println("리스트가 비어있는지 : " + list.isEmpty());
		System.out.println(list);
	}
	
	public void method3() {
		// 11. indexOf(Object o) : 해당 객체가 위치하는 인덱스값 반환
		List<String> list = new ArrayList<>();
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");

		System.out.println(list.indexOf("apple")); // apple의 인덱스인 1 반환함
		
		// 12. 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 13. 내림차순 정렬
		Collections.reverse(list); // reverse 는 위에서 오름차순을 했기 때문에 내림차순이 가능해짐 오름차순을 안하면 리스트의 역순으로밖에 출력 안됨
		System.out.println(list);
		
	}
}
