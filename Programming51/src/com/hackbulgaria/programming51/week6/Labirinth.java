package com.hackbulgaria.programming51.week6;

public class Labirinth {

	public char[][] symbols;
	
	public Labirinth(char[][] symbols){
		this.symbols = symbols;
	}
	
	boolean movePerson(Movement move){
		
	}
	
	public void print(){
		System.out.println(toString());
	}
	
	public String toString(){
		
		String result = "";
		
		for (int i = 0; i < symbols.length; i++) {
			for (int j = 0; j < symbols[0].length; j++) {
				result += symbols[i][j];
			}
			result += "\n";
		}
		
		
		return result;
		
	}
}
