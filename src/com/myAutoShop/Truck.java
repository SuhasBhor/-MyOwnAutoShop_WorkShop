package com.myAutoShop;

//Extends the car class to inherit variable and Method 
public class Truck extends Car {
	// Initialize variable
	int weight;

	// Constructor for taking Inherited class variable and this class variable
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	// Method to take regular price
	public double getSalePrice() {
		if (weight > 2000)
			return regularPrice - (regularPrice * 0.1);
		else
			return regularPrice - (regularPrice * 0.2);
	}
}
