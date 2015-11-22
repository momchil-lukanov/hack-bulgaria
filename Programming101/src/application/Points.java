package application;

import java.util.Scanner;

public class Points {

	public static int x = 0;
	public static int y = 0;
	public static int difference = 1;

	public static String position(String signs) {

		String result = "";

		for (int i = 0; i < signs.length(); i++) {
			Character random = signs.charAt(i);
			if (random.equals('>')) {
				x += difference;
			} else if (random.equals('<')) {
				x -= difference;
			} else if (random.equals('^')) {
				y -= difference;
			} else if (random.equals('v')) {
				y += difference;
			} else if (random.equals('~')) {
				difference = -difference;
			}
		}

		result = "(" + x + ", " + y + ")";

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		System.out.println(Points.position(a));
	}

}