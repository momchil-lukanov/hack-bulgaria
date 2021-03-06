package com.hackbulgaria.programming51.week5;

import java.util.ArrayList;
import java.util.Scanner;

public class WordMain {

	public static String stringReverse(String a) {
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			result = a.charAt(i) + result;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String searched = scanner.next();
		char[][] map;
		int n, m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		map = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scanner.next().charAt(0);
			}
		}

		String result = "";
		ArrayList<String> temp = new ArrayList<>();
		int counter = 0;

		// left to right and right to left horizontal
		for (int i = 0; i < map.length; i++) {
			result = "";
			for (int j = 0; j < map[i].length; j++) {
				result += map[i][j];
			}
			temp.add(result);
			temp.add(stringReverse(result));
		}

		// up down & down up vertical
		result = "";
		while (counter != map[0].length) {
			for (int i = 0; i < map.length; i++) {
				result += map[i][counter];
			}
			temp.add(result);
			temp.add(stringReverse(result));
			result = "";
			counter++;
		}

		// across main diagonal to right
		result = "";
		int itCan = Math.min(map[0].length, map.length);
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				result += map[i][j];
			}
		}
		for (int i = 0; i < result.length(); i++) {
			int step = map[0].length + 1;
			int accStep = i;
			String tempResult = "";
			for (int j = 0; j < itCan; j++) {
				if (accStep < result.length()) {
					tempResult += result.charAt(accStep);
					accStep += step;
				}
			}
			itCan--;
			if (tempResult != "" && tempResult.length() >= searched.length()) {
				temp.add(tempResult);
				temp.add(stringReverse(tempResult));
			}
		}
		itCan = Math.min(map[0].length, map.length);
		for (int i = map[0].length; i < result.length(); i += map[0].length) {
			int step = map[0].length + 1;
			int accStep = i;
			String tempResult = "";
			for (int j = 0; j < itCan; j++) {
				if (accStep < result.length()) {
					tempResult += result.charAt(accStep);
					accStep += step;
				}
			}
			itCan--;
			if (tempResult != "" && tempResult.length() >= searched.length()) {
				temp.add(tempResult);
				temp.add(stringReverse(tempResult));
			}
		}

		int howMany = 0;

		for (String word : temp) {
			if (word.contains(searched)) {
				howMany++;
			}
		}

		if (searched == stringReverse(searched)) {
			howMany = howMany / 2;
		}

		System.out.println(howMany);
		System.out.println(temp);
	}

}