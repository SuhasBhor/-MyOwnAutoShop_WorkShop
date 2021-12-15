package com.myAutoShop;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Car car = new Car(120, 200000, "White");
		System.out.println("Sale Price Of Car: " + car.getSalePrice());

		Truck truck = new Truck(150, 500000, "Blue", 20000);
		System.out.println("Sale Price Of Truck: " + truck.getSalePrice());

		Sedan sedan = new Sedan(200, 700000, "Red", 25);
		System.out.println("Sale Price Of Sedan: " + sedan.getSalePrice());

		Ford maroonFord = new Ford(200, 1000000, "Maroon", 2021, 15);
		System.out.println("Sale Price Of Ford: " + maroonFord.getSalePrice());

		Ford yellowFord = new Ford(250, 1200000, "Yellow", 2020, 20);
		System.out.println("Sale Price Of Ford: " + yellowFord.getSalePrice());
	}
}
