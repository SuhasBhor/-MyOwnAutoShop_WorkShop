package com.myAutoShop;

//Extends the car class to inherit variable and Method 
public class Sedan extends Car {

	// Initialize Variable
	int length;

	// Constructor for taking Inherited class variable and this class variable
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	// Method to take regular price
	public double getSalePrice() {
		if (length > 20)
			return regularPrice - (regularPrice * 0.05);
		else
			return regularPrice - (regularPrice * 0.1);
	}

}
