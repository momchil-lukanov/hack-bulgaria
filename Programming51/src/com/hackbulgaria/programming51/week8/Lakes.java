package com.hackbulgaria.programming51.week8;

import java.util.Scanner;

public class Lakes {

	int counterDowns = 0;
	int counterUps = 0;
	int size;
	Character down = 'd';
	Character up = 'u';
	Character horizontal = 'h';

	public Lakes() {
	}

	public static void main(String[] args) {
		Lakes lakes = new Lakes();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == lakes.down) {
				if (lakes.counterUps > 1) {
					lakes.counterUps--;
				} else {
					lakes.counterDowns++;
					lakes.size += 500 + (lakes.counterDowns - 1) * 1000;
				}
			} else if (input.charAt(i) == lakes.horizontal) {
				lakes.size += 1000 * lakes.counterDowns;
			} else if (input.charAt(i) == lakes.up) {
				if (lakes.counterDowns>0) {
					lakes.counterDowns--;
					lakes.counterUps++;
					lakes.size += 500 + lakes.counterDowns * 1000;
				}
			}
		}

		System.out.println(lakes.size);
	}

}
