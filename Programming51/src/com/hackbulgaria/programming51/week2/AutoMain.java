package com.hackbulgaria.programming51.week2;

import com.hackbulgaria.programming51.week2.Auto;

public class AutoMain {

	public static void main(String[] args) {
		Person ivan = new Person();
		ivan.name = "Ivan";
		ivan.lastName = "Ivanov";
		ivan.age = 25;

		Auto audi = new Auto();

		audi.owner = ivan;
		audi.maxSpeed = 200;
		audi.brand = "Audi";
		audi.name = "Begachka";
		audi.price = 5000;

		System.out.println(audi);
	}

}
