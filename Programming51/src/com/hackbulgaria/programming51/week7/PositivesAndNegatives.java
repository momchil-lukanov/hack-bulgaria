package com.hackbulgaria.programming51.week7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PositivesAndNegatives {

	public static void descendingSort(ArrayList<Integer> a) {

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size(); j++) {
				if (a.get(j) > a.get(i)) {
					int x = a.get(i);
					a.set(i, a.get(j));
					a.set(j, x);
				}
			}
		}

	}

	public static void asscendingSort(ArrayList<Integer> a) {

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size(); j++) {
				if (a.get(j) < a.get(i)) {
					int x = a.get(i);
					a.set(i, a.get(j));
					a.set(j, x);
				}
			}
		}

	}

	public static Stack<Integer> reorder(int[] numbers) {

		Stack<Integer> temp = new Stack<>();
		ArrayList<Integer> positive = new ArrayList<Integer>();
		ArrayList<Integer> negative = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positive.add(numbers[i]);
			} else if (numbers[i] < 0) {
				negative.add(numbers[i]);
			}
		}
		
		PositivesAndNegatives.descendingSort(positive);
		PositivesAndNegatives.asscendingSort(negative);
		
		for (int i = 0; i < positive.size(); i++) {
			temp.push(positive.get(i));
		}
		
		for (int i = 0; i < negative.size(); i++) {
			temp.push(negative.get(i));
		}

		return temp;
	}
	
	public static void main(String[] args) {
		int[] n = {1, 2, 3, -10, -5, 8, -100};
		Stack<Integer> result = reorder(n); 

		while(!result.isEmpty()) {
		  System.out.println(result.pop());
		}

	}

}
