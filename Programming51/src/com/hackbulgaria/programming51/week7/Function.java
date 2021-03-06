package com.hackbulgaria.programming51.week7;

import java.util.LinkedList;

import javax.swing.text.AbstractDocument.Content;

public class Function {
	private String fName;
	private String argumentName;
	private String source;
	private String fBody;

	public Function(String source) {
		this.source = source;

		String[] FParts = source.split(" = ");
		fBody = FParts[1];
		String[] fDefinitionsParts = FParts[0].split(" ");
		fName = fDefinitionsParts[0];
		argumentName = fDefinitionsParts[1];
	}

	public String getName() {
		return fName;
	}

	public String getArgumentName() {
		return argumentName;
	}

	public int evaluate(int x) {

		String[] expressionParts = fBody.split(" ");
		LinkedList<String> operations = new LinkedList<>();
		LinkedList<Integer> values = new LinkedList<>();
		for (String token : expressionParts) {
			if (token.equals("+") || token.equals("-")) {
				operations.add(token);
			} 
			
			if (isStringInteger(token)) {
				values.add(Integer.parseInt(token));
			}
			
			if (token.equals(argumentName)) {
				values.add(x);
			}
			
			if (isFunction(token)) {
				values.add(callOtherFunction(token, x));
			}
		}
		
		while (!operations.isEmpty()) {
			String op = operations.removeFirst();
			int left = values.removeFirst();
			int right = values.removeFirst();
			int result = 0;
					
			switch (op) {
			case "+":
				result = left + right;
				break;
			case "-":
				result = left - right;
			}
			
			values.addFirst(result);
			
		}

		return values.removeFirst();
	}

	public String toString() {
		return source;
	}
	
	private int callOtherFunction(String token, int x){
		String[] fParts = token.split("\\(");
		String fName = fParts[0];
		String argument = fParts[1].substring(0, fParts[1].length()-1);
		
		int argumentValue = 0;
		if (argument.equals(argumentName)) {
			argumentValue = x;
		} else if (isStringInteger(argument)) {
			argumentValue = Integer.parseInt(argument);
		}
		
		return Context.allFunctions.get(fName).evaluate(argumentValue);
	}
	
	private boolean isFunction(String token){
		
		int indexOfOpenBrackets = token.indexOf("(");
		int indexOfClosedBrackets = token.indexOf(")");
		
		if (indexOfOpenBrackets == -1 && indexOfClosedBrackets == -1) {
			return false;
		}
		
		return indexOfOpenBrackets < indexOfClosedBrackets;
	}
	
	private boolean isOperation(String token){
		return (token.equals("+") || token.equals("-"));
	}
	
	private boolean isStringInteger(String token){
		for (char ch: token.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
