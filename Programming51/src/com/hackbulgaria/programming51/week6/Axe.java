package com.hackbulgaria.programming51.week6;

public class Axe implements Weapon {
	private int durability = 50;
	private int currentDurability = durability;
	private int damage = 10;
	private int currentDamage = damage;
	private String type = "TO_SMASH";

	@Override
	public int getDamage() {
		if (currentDurability != 0 && currentDurability >= durability / 2) {
			currentDurability--;
		} else if (currentDamage > 1) {
			currentDamage--;
			return currentDamage;
		}
		
		return currentDamage;
	}

	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return durability;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
