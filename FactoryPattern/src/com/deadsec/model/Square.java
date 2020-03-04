package com.deadsec.model;

public class Square implements Shape{

	public Square() {
		System.out.println("Initializing a square!");
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a Square!!");
	}
}
