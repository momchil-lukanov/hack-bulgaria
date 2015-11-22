package com.hackbulgaria.programming51.week4;

public class Pair<F, S> {

	public F first;
	public S second;

	public String getPairString(){
		return (String) first;
	}
	
	public int getPairInt(){
		return (int) second;
	}
	
	public Pair(String string, Integer integer){
		first = (F) string;
		second =  (S) integer;
	}
}
