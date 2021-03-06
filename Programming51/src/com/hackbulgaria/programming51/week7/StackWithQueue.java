package com.hackbulgaria.programming51.week7;

public class StackWithQueue<T> {

	private Queue<T> firstQueue = new Queue<>();
	private Queue<T> q = new Queue<>();

	public T pop() {
		return firstQueue.pop();
	}

	public T peek() {
		return firstQueue.peek();
	}

	public boolean isEmpty() {
		return firstQueue.empty();
	}

	public void push(T data) {
		if (firstQueue.peek() == null) {
			firstQueue.push(data);
		} else {
			for (int i = firstQueue.size(); i > 0; i--) {
				q.push(firstQueue.pop());
			}
			firstQueue.push(data);
			for (int j = q.size(); j > 0; j--) {
				firstQueue.push(q.pop());
			}

		}
	}

	public String toString() {
		return firstQueue.toString();
	}

}
