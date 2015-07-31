package com.hackbulgaria.programming51.week7;

import java.util.Scanner;

public class Parser {

	public static int f4(int x) {
		return 2 * f1(x);
	}

	public static int f3(int x) {
		return x + 1;
	}

	public static int f2(int x) {
		return 2 * x;
	}

	public static int f1(int x) {
		return f2(x) + f3(x);

	}

	public static int evaluate(String formula, int x) {

		for (int i = formula.length() - 1; i >= 0; i--) {

			Character y = formula.charAt(i);
			if (y.equals('1')) {
				x = f1(x);
			} else if (y.equals('2')) {
				x = f2(x);
			} else if (y.equals('3')) {
				x = f3(x);
			} else if (y.equals('4')) {
				x = f4(x);
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int x = scanner.nextInt();

		System.out.println(evaluate(input, x));

	}

}
