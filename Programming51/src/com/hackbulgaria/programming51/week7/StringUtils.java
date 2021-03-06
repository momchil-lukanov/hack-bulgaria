package com.hackbulgaria.programming51.week7;

import java.util.Stack;

public class StringUtils {
	
	public static String reverseStringWithStack(String s) {
	    
		Stack<Character> temp = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			temp.push(s.charAt(i));
		}
		
		String result = "";
		
		while (!temp.empty()) {
			result += temp.peek();
			temp.pop();
		}
		
		return result;
	  }
	
	public static void main(String[] args) {
		String a = "hellorr";
		String b = StringUtils.reverseStringWithStack(a);
		System.out.println(b);

	}

}
