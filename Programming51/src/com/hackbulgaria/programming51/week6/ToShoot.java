package com.hackbulgaria.programming51.week6;

public class ToShoot extends Weapon {

	public ToShoot(int damage, int durability) {
		super(damage, durability);
		// TODO Auto-generated constructor stub
	}
	
	public int hit(){
		int dmg = damage;
		if (durability > 0) {
			durability--;
		}
		if (durability == 0) {
			damage = 1;
		}
		return dmg;
	}
	
	public String getType(){
		return "TO_SHOOT";
	}

}
