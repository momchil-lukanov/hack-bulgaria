package com.hackbulgaria.programming51.week2;

public class Coffee {
	
	public String brand = "";
	public double price = 0;
	
	public Coffee(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return brand + ": " + price;
	}
}
