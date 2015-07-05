package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class LilisLibrary {

	public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {

		Vector<Pair<String, Integer>> temp = new Vector<>();
		Vector<String> tempString = new Vector<>();
		Vector<Integer> tempInt = new Vector<>();
		int counter = 0;

		for (int i = 0; i < books.size(); i++) {
			if (!tempString.contains(books.get(i))) {
				counter = 1;
				for (int j = i + 1; j < books.size(); j++) {
					if (books.get(i).equals(books.get(j))) {
						counter++;
					}
				}
				tempString.add(books.get(i));
				tempInt.add(counter);
			}

		}

		for (int i = 0; i < tempString.size(); i++) {
			Pair<String, Integer> e = new Pair(tempString.get(i),
					tempInt.get(i));
			temp.add(e);
		}
		return LilisLibrary.sorted(temp);
	}
	
	public static Vector<Pair<String, Integer>> sorted(Vector<Pair<String, Integer>> x){
		
		Vector<Pair<String, Integer>> temp = new Vector<>();
		String alphabet = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
		int counter = 0;
		for (int i = 0; i < alphabet.length(); i++) {
			for (int j = 0; j < x.size(); j++) {
				if (x.get(j).first.charAt(0) == alphabet.charAt(i)) {
					Pair<String, Integer> e = new Pair(x.get(j).first, x.get(j).second);
					temp.add(e);
				}
			}
		}
		return temp;
	} 

	public String toString(Vector<Pair<String, Integer>> temp) {
		String result = "";
		for (int i = 0; i < temp.size(); i++) {
			result += temp.get(i).getPairString() + ":"
					+ temp.get(i).getPairInt();
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vector<String> books = new Vector<String>();
		int booksCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < booksCount; i++) {
			books.add(scanner.nextLine());
		}

		Vector<Pair<String, Integer>> result = orderBooks(books);

		for (Pair<String, Integer> titleCount : result) {
			System.out.println(titleCount.first + " : " + titleCount.second);
		}
	}
}