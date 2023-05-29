package com.kh.practice.controller;

import com.kh.practice.model.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		// 면적 : 너비 * 높이
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return r.draw() + " / " + width * height;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		// 둘레 : 2 * (너비 + 높이)
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return r.draw() + " / " + 2 * (width + height);
	}
	
}
