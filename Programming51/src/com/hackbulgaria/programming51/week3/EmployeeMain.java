package com.hackbulgaria.programming51.week3;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee rado = new Employee("Radoslav Georgiev");
		System.out.println(rado.toString());
		System.out.println(rado.toString().equals("Radoslav Georgiev")); // true
	}

}
