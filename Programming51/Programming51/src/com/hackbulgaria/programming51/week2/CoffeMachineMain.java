package com.hackbulgaria.programming51.week2;

public class CoffeMachineMain {

	public static void main(String[] args) {
		CoffeeMachine hack = new CoffeeMachine();
		Coffee java = new Coffee("Java", 10);
		
		hack.addCoffee(java);
	}

}
