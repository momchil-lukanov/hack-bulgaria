package com.hackbulgaria.programming51.week4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class MaxSpan {

	public static int maxSpan(int[] numbers) {
		Vector<Integer> temp = new Vector<>();

		for (int i = 0; i < numbers.length; i++) {
			int maxSpan = 0;
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					maxSpan = j - i + 1;
				}
			}
			temp.add(maxSpan);
		}
		Collections.sort(temp);

		return temp.lastElement();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println(maxSpan(numbers));
	}

}
