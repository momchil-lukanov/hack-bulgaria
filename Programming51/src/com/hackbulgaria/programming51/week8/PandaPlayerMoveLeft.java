package com.hackbulgaria.programming51.week8;

public class PandaPlayerMoveLeft implements PandaPlayerMovement {
	public PandaPlayer move() {
		return new PandaPlayer(-1,0);
	}
}
