package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

public class Anagrams {

	public static boolean areAnagrams(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				String x = a.substring(i, i + 1);
				String y = b.substring(j, j + 1);
				if (x.equals(y)) {
					String a1 = a.substring(0, i);
					String a2 = a.substring(i + 1, a.length());
					String b1 = b.substring(0, j);
					String b2 = b.substring(j + 1, b.length());
					a = a1 + "*" + a2;
					b = b1 + "*" + b2;
				}

			}
		}

		return a.equals(b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		String b = scanner.next();

		if (areAnagrams(a, b)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}
	}
}
