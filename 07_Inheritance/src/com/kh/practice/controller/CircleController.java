package com.kh.practice.controller;

import com.kh.practice.model.Circle;

public class CircleController {

	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		// 면적 : PI * 반지름 * 반지름
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return c.draw() + " / " + Math.PI * radius * radius; // Math.PI = 파이 불러오는 메스 클래스 호출어
	}
	
	public String calcCircum(int x, int y, int radius) {
		// 둘레 : PI * 반지름 * 2
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return c.draw() + " / " + Math.PI * radius * 2;
	}
	
}
