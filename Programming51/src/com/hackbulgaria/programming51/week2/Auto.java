package com.hackbulgaria.programming51.week2;

public class Auto {

	public Person owner;
	public int maxSpeed = 0;
	public String brand = "";
	public String name = "";
	public int price = 0;

	public Auto() {
	}
	
	Person ivan = new Person("Ivan", "Ivanonv", 25);

	public Auto(Person owner, int maxSpeed, String brand, String name, int price) {
		this.owner = owner;
		this.maxSpeed = maxSpeed;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return brand + " " + name + ", Max Speed: " + maxSpeed + ", Price: " + price
				+ ", Owner: " + owner;
	}
}
