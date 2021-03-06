package com.hackbulgaria.programming51.week7;

import java.util.ArrayList;
import java.util.Stack;

public class FunctionComposition {
	
	private Stack<Function> callStack = new Stack<>();
	
	public FunctionComposition(String composition){
		
		String[] functions = composition.split(" . ");
		
		for (String f: functions) {
			this.callStack.add(Context.allFunctions.get(f));
		}
		
	}
	
	public int evaluate(int x){
		
		while (!callStack.isEmpty()) {
			Function f = callStack.pop();
			x = f.evaluate(x);
		}
		return x;
	}
	
}
