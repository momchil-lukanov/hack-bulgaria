package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Binary {

	public static String toBinary(int n) {

		String result = "";

		while (n != 0) {
			result = (n % 2) + result;
			n = n / 2;
		}
		return result;
	}

	public static int toNumber(String binary) {

		int integer = 0;

		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(binary.length() - 1 - i) == '1') {
				int result = 1;
				int j = 0;
				while (j < i) {
					result *= 2;
					j++;
				}
				integer += result;
			}
		}
		return integer;

	}

	public static int countBits(int n) {

		int result = 0;

		while (n != 0) {
			n = n / 2;
			result += 1;
		}
		return result;
	}

	public static boolean isPowerOfTwo(String binary) {

		boolean result = false;
		int counter = 0;

		if (binary.charAt(binary.length() - 1) != '1') {
			for (int i = 0; i < binary.length() - 1; i++) {
				if (binary.charAt(i) == '1') {
					counter += 1;
				}
			}
			if (counter == 1) {
				result = true;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b = scanner.next();
		int c = scanner.nextInt();
		String d = scanner.next();
		System.out.println(toBinary(a));
		System.out.println(toNumber(b));
		System.out.println(countBits(c));
		System.out.println(isPowerOfTwo(d));

	}

}