package com.hackbulgaria.programming51.week2;

public class Person {
	
	public String name = "";
	public String lastName = "";
	public int age = 0;
	
	public Person(){
	}	
	
	public Person(String name, String lastName, int age){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}	
	
	public String toString(){
		
		return name + " " + lastName + "(" + age + ")";
	}
}
