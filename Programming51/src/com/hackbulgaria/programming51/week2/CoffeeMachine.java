package com.hackbulgaria.programming51.week2;

public class CoffeeMachine {
	int capacity = 10;
	Coffee[] brandsOfCoffee = new Coffee[capacity];
	double balance = 0;
	int coffeeCounter = 0;
	
	public String toString(){
		String result = "";
		for (Coffee Coffee: brandsOfCoffee){
			if (Coffee != null){
				result += Coffee.brand + " " + Coffee.price + "\n";
			}
		}
		return result;
	}
	
	public boolean addCoffee(Coffee coffee){
		if (coffeeCounter < capacity) {
			brandsOfCoffee[coffeeCounter] = coffee;
			coffeeCounter++;
			return true;
			}
		return false;
	}
	
	public double buyCoffee(String brand, double d){
		double change = 0;
		for (int i = 0; i < brandsOfCoffee.length; i++) {
			if (brandsOfCoffee[i].brand.equals(brand)) {
				if (d >= brandsOfCoffee[i].price) {
					change = d - brandsOfCoffee[i].price;
					balance += brandsOfCoffee[i].price;
					return change;
				} else {
					return d;
				}
			}
		}
		return -1;
	}
}
