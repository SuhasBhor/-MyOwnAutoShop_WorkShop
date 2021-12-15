package com.myAutoShop;

public class Car {
	// Initialize three variable for Car Attribute
	int speed;
	double regularPrice;
	String color;

	// Initialize constructor
	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	// Method for taking Regular Price
	public double getSalePrice() {
		return regularPrice;
	}
}
