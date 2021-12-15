package com.myAutoShop;

//Extends the car class to inherit variable and Method 
public class Ford extends Car {

	int year;
	int manufacturerDiscount;

	// Constructor for taking Inherited class variable and this class variable
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	// Method to take regular price
	public double getSalePrice() {
		return regularPrice - regularPrice * (manufacturerDiscount / 100.0);
	}

}
