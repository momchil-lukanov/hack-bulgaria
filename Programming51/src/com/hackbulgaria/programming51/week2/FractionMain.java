package com.hackbulgaria.programming51.week2;

public class FractionMain {

	public static void main(String[] args) {
		Fraction a = new Fraction();
		a.num = 4;
		a.den = 12;
		System.out.println(a);
		a.simplify();
		System.out.println(a);
	}
	
}
