package com.hackbulgaria.programming51.week7;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {

	public static boolean areCorrect(String brackets) {

		Stack<Character> temp = new Stack<>();

		for (int i = 0; i < brackets.length(); i++) {
			Character x = brackets.charAt(i);
			if (x.equals('(') || x.equals('[') || x.equals('{')) {
				temp.push(x);
			}
			if (x.equals(')') && temp.peek().equals('(') || x.equals(']')
					&& temp.peek().equals('[') || x.equals('}')
					&& temp.peek().equals('{')) {
				temp.pop();
			} else {
				return false;
			}
		}

		return temp.empty();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		System.out.println(Brackets.areCorrect(a));

	}
}
