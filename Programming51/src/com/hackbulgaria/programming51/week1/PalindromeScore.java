package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class PalindromeScore {

	public static int reverseNumber(int a) {

		int result = 0;

		while (a != 0) {
			int digit = a % 10;
			result = result * 10 + digit;
			a = a / 10;
		}
		return result;
	}

	public static boolean isPalindrom(int b) {
		return b == reverseNumber(b);
	}

	public static void main(String[] args) {

		int result = 1;

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		while (true) {
			if (isPalindrom(a)) {
				System.out.println(result);
				break;
			} else {
				result += 1;
				a = a + reverseNumber(a);
			}
		}
	}
}