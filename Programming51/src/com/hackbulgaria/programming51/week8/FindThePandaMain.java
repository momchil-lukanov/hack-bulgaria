package com.hackbulgaria.programming51.week8;

import java.util.Scanner;

public class FindThePandaMain {

	public static void main(String[] args) {
		FindThePanda something = new FindThePanda();
		Scanner scanner = new Scanner(System.in);
		String direction;
		while(!something.isCompleted()) {
			System.out.println(something);
			System.out.println("Choose a direction to move: ");
			direction = scanner.next();
			
			switch(direction) {
				case "u" : something.movePerson(new PandaPlayerMoveUp()); break;
				case "d" : something.movePerson(new PandaPlayerMoveDown()); break;
				case "l" : something.movePerson(new PandaPlayerMoveLeft()); break;
				case "r" : something.movePerson(new PandaPlayerMoveRight()); break;
			}
		}
		System.out.println(something);
		System.out.println("Mnogo si lud!");
	}

}
