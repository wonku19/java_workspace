package com.kh.example.practice2;

import com.kh.example.practice2.model.Cricle;

public class Run {

	public static void main(String[] args) {
		Cricle c = new Cricle();
		c.incrementRadius();
		c.incrementRadius();
		
		// 원의 둘레 = 2 x 반지름 x PI
		System.out.println(2 * c.radius * Cricle.PI);
		
		// 원의 넓이 = 반지름 x 반지름 x PI
		System.out.println(c.radius * c.radius * Cricle.PI);

	}	
	
}
