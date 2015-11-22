package com.hackbulgaria.programming51.week7;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();
		Stack<Integer> s = new Stack<>();
		for (int i = 10; i < 20; i++) {
			q.push(i);
			s.push(i);
		}
		System.out.println(s);
		System.out.println(q);
	}

}
