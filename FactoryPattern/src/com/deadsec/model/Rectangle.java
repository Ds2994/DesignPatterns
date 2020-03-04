package com.deadsec.model;

public class Rectangle implements Shape {

	public Rectangle() {
		System.out.println("Initializing a rectangle!");
	}
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle!!");
	}
}
