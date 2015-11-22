package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();

		System.out.println(a);
		System.out.println(oper);
		System.out.println(b);

		if (oper == '+') {
			System.out.println(a + b);
		} else if (oper == '-') {
			System.out.println(a - b);
		} else if (oper == '*') {
			System.out.println(a * b);
		} else if (oper == '/') {
			System.out.println(a / b);
		} else if (oper == '^') {
			int result = 1;
			for (int i = 0; i < b; i++) {
				result *= a;
			}
			System.out.println(result);
		} else if (oper == '?') {
			int resulta = 1;
			for (int i = 1; i < a + 1; i++) {
				resulta *= i;
			}
			int resultb = 1;
			for (int j = 1; j < b + 1; j++) {
				resultb *= j;
			}
			System.out.println(resulta + resultb);
		}
	}
}