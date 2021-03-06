package com.hackbulgaria.programming51.week7a;

import java.util.LinkedList;
import com.hackbulgaria.programming51.week7.Queue;

public class Stack<T> {

	// use only this interface:
	// public interface Queue<T> {
	// public T pop(); // removes the head and returns it
	// public T peek(); // only returns the head without removing it
	// public boolean isEmpty(); // returns true if empty
	// public void push(T data); // pushes data into the queue
	// }

	public Queue<T> firstQueue = new Queue<T>();
	public Queue<T> secondQueue = new Queue<T>();
	
	public T pop() {
		return firstQueue.pop();
	}

	public T peek() {
		return firstQueue.peek();
	}

	public boolean isEmpty() {
		return firstQueue.peek() == null;
	}

	public String toString() {

		String result = "";

		for (int i = 0; i < firstQueue.size(); i++) {
			result += ", " + firstQueue.pop();
		}

		return result;

	}

	public void push(T data) {
		if (secondQueue.empty()) {
			secondQueue.push(data);
		}
		while (!firstQueue.empty()) {
			secondQueue.push(firstQueue.pop());
		}
		firstQueue = secondQueue;
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		for (int i = 10; i < 20; i++) {
			s.push(i);
		}
		System.out.println(s);
	}
}
