package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static int reverseNumber(int a) {

		int result = 0;

		while (a != 0) {
			int digit = a % 10;
			result = result * 10 + digit;
			a = a / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		int b = a + reverseNumber(a);

		if (b == reverseNumber(b)) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
	}

}
