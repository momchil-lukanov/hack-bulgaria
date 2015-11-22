package com.hackbulgaria.programming51.week3;

public class IntegerVectorMain {

	public static void main(String[] args) {
		
		    
	
		    
		IntegerVector v = new IntegerVector();
	    for (int i = 0; i < 10; i++) {
	        v.add(i);
	    }
	    System.out.println(v);
	    v.remove(3);
	    System.out.println(v);
	}

}
