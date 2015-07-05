package com.hackbulgaria.programming51.week3;

public class TravelExpenseMain {

	public static void main(String[] args) {

		Employee ivo = new Employee("Ivaylo");
		TravelExpense dinner = new TravelExpense("Dinner", ivo, 100);

		System.out.println(dinner.getType().equals("Dinner")); // true
		System.out.println(dinner.getEmployee().toString().equals("Ivaylo")); // true
		System.out.println(dinner.getNetCost() == 100); // true

	}

}
