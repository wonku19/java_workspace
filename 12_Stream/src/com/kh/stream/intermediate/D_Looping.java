package com.kh.stream.intermediate;

import java.util.Arrays;

/* 반복
 * - 요소 전체를 반복하는 역할
 * - peek() : 중간처리 단계에서 전체 요소를 반복한다
 * - forEach() : 최종처리 단계에서 전체 요소를 반복한다
 * 
 */

public class D_Looping {

	public static void main(String[] args) {
	
		int sum = 0;
		int[] values = {1, 2, 3, 4, 5};
		
		// 최종 처리 메서드가 호출 되어야 동작함
		sum = Arrays.stream(values).filter(i -> i % 2 ==0).peek(value -> System.out.println(value)).sum();
		System.out.println("sum : " + sum); // 최종처리 메서드인 sum() 이 입력되어 value와 sum을 출력할 수 있었다
		
		// 최종처리 메서드는 다른 최종처리 메서드를 호출할 수 없다 ex) 아래 예시에서 .sum() 을 추가하면 .forEach가 있기 때문에 오류 발생된다.
		Arrays.stream(values).filter(i -> i % 2 == 0).forEach(value -> System.out.println(value));
		
		Arrays.stream(values).filter(i -> i % 2 == 0).sum();
		System.out.println("sum2 : " + sum);
	}	
}
