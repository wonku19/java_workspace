package com.kh.stream.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.kh.model.Student;

/* 수집
 * - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴하는 collect() 를 제공
 */

public class C_Collect {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(new Student("김종휘", 17, "남자", 90, 100), new Student("박승환", 16, "남자", 70, 80), new Student("박진실", 15, "여자", 80, 90),
											   new Student("김민수", 14, "남자", 100, 70), new Student("문병철", 18, "남자", 90, 60));
		
		// List 컬렉션으로 수집해보기 -> 수학 점수가 90점 이상인 사람들만 수집해보기
		List<Student> list = students.stream().filter(student -> student.getMath() >= 90)
//											  .collect(Collectors.toList()); // toList() = 리스트로만 반환한다
											  .collect(Collectors.toCollection(() -> new ArrayList<>())); // toCollection() = 괄호 안에 들어가는 람다식으로 반환한다 
		System.out.println("수학점수 90점 이상인 사람들");																								  // 예시의 경우 ArrayList로 반환하게 작성했음
		System.out.println(list);
		
		// Set 컬렉션으로 수집해보기 -> 중학생인 사람들만 수집해보기
		Set<Student> set = students.stream().filter(student -> student.getAge() <= 16)
//																					  .collect(Collectors.toSet()); // Set 으로 반환
																					  .collect(Collectors.toCollection(() -> new HashSet<>())); // HashSet으로 반환
		System.out.println("나이가 중학생(16세 이상)인 사람들");
		System.out.println(set);
		
		// Map 컬렉션으로 수집 -> 이름, 나이의 맵 형태로 수집해보기
		Map<String, Integer> map = students.stream().collect(Collectors.toMap(student -> student.getName(), student -> student.getAge()));
		HashMap<String, Integer> hMap = (HashMap<String, Integer>) map; // map 을 hashmap으로 형변환
		System.out.println(hMap);
	}

}
