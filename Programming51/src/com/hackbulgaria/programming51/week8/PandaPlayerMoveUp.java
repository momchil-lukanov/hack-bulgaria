package com.hackbulgaria.programming51.week8;

public class PandaPlayerMoveUp implements PandaPlayerMovement {

	public PandaPlayer move() {
		return new PandaPlayer(0,-1);
	}
}
