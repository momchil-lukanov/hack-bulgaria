package com.hackbulgaria.programming51.week6;

public class CasualZombie implements Zombie {
	
	private int health;
	
	public CasualZombie(int health){
		this.health = health;
	}

	public int getTotalHealth() {
		// TODO Auto-generated method stub
		return health;
	}

	public int getCurrentHealth() {
		// TODO Auto-generated method stub
		return health;
	}

	public void hit(int damage) {
		// TODO Auto-generated method stub
		health -= damage;
		if (health <= 0) {
			health = 0;
		}
	}

	public boolean isDead() {
		// TODO Auto-generated method stub
		return health == 0;
	}

}
