package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class BirthdayRanges {

	public static class IntPair {
		public int start;
		public int end;
	}

	public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays,
			Vector<IntPair> ranges) {

		Vector<Integer> temp = new Vector<Integer>();

		for (int i = 0; i < ranges.size(); i++) {
			int result = 0;
			for (int j = 0; j < birthdays.size(); j++) {
				if (birthdays.elementAt(j) >= ranges.elementAt(i).start
						&& birthdays.elementAt(j) <= ranges.elementAt(i).end) {
					result++;
				}
			}
			temp.add(result);
		}
		return temp;
	}

	public static void main(String[] args) {
		Vector<Integer> birthdays = new Vector<Integer>();
		Vector<IntPair> ranges = new Vector<IntPair>();

		Scanner scanner = new Scanner(System.in);

		int bdaysCount = scanner.nextInt();
		int rangesCount = scanner.nextInt();

		for (int i = 0; i < bdaysCount; i++) {
			birthdays.add(scanner.nextInt());
		}

		for (int i = 0; i < rangesCount; i++) {
			IntPair pair = new IntPair();

			pair.start = scanner.nextInt();
			pair.end = scanner.nextInt();

			ranges.add(pair);
		}

		Vector<Integer> result = birthdaysCount(birthdays, ranges);

		for (int count : result) {
			System.out.println(count);
		}
	}
}
