package com.kh.map;

import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties; // 모든 컬렉션은 java.util 에 있음
import java.util.Set;

/* Properties
 * - HashMap 구버전인 Hashtable(Object, Object) 을 상속받아 구현한 것
 * - Properties 는 (String, String) 형태로 단순화된 컬렉션 클래스
 * - 주로 환경설정과 관련된 속성(property)를 저장하는데 사용함
 */

public class B_Properties {

	public static void main(String[] args) {
		B_Properties b = new B_Properties();
//		b.method1();
		b.method2();		
	}
	
	public void method1() {
		
		Properties prop = System.getProperties();
		
		// prop 에 저장된 요소들을 Enumeration 을 이용해서 출력
		// 컬렉션 프레임워크 이전 구버전이므로 Iterator 가 아닌 Enumeration을 쓰는것 뿐임
		Enumeration en = prop.propertyNames();
		
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
	
	public void method2() {
		
		Properties prop = new Properties();
		// 순서 유지 X, 키값 중복 X
		// prop에 키와 값(key, value) 저장, 가져와보기
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("Stack", "값이 없음")); // 없는 키이기 때문에 null이 오지만 뒤에 "값이 없음" 을 입력해서 출력내용이 변경된다.
		
		Set<Entry<Object, Object>>entrySet = prop.entrySet();
		Iterator<Entry<Object, Object>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
}
