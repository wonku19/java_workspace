package com.kh.step1.model;

public class Tv {
	 
	public boolean power; // public 으로 여기저기에서 쓸 수 있게 지정해줌
	public int channel = 20;
	
	public void power() {
		power = !power;
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
	

}