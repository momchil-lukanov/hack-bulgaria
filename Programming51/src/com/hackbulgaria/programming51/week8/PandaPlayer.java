package com.hackbulgaria.programming51.week8;

public class PandaPlayer {
	private int x;
	private int y;
	private char symbol;
	
	public PandaPlayer(int x, int y) {
		this.x = x;
		this.y = y;
		this.setSymbol(symbol);
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}
