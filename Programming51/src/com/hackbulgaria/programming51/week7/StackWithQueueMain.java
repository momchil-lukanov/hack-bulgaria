package com.hackbulgaria.programming51.week7;

public class StackWithQueueMain {

	public static void main(String[] args) {

		StackWithQueue<Integer> s = new StackWithQueue<>();
		for (int i = 10; i < 20; i++) {

			s.push(i);

		}
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.pop());

	}
}
