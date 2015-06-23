package com.hackbulgaria.programming51.week2;

public class AutoShopMain {

	public static void main(String[] args) {
		
		Person ivan = new Person();
		ivan.name = "Ivan";
		ivan.age = 25;

		Auto audi = new Auto();

		audi.owner = ivan;
		audi.maxSpeed = 250;
		audi.brand = "Audi";
		audi.name = "Begachka";
		audi.price = 5000;

		Person gosho = new Person();
		gosho.name = "Gosho";
		gosho.age = 25;

		Auto peugeot = new Auto();

		peugeot.owner = gosho;
		peugeot.maxSpeed = 220;
		peugeot.brand = "Peugeot";
		peugeot.name = "Dragster";
		peugeot.price = 10000;

		AutoShop as = new AutoShop();
		as.addCar(audi);
		as.addCar(peugeot);

		System.out.println(as.getTopSpeed());

	}

}
