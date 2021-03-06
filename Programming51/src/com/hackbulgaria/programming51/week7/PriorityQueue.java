package com.hackbulgaria.programming51.week7;

import java.util.Collections;
import java.util.Vector;
import java.util.Queue;

public class PriorityQueue<T extends Comparable<T>> implements PriorityQueueInterface<T> {

	private Vector<T> v = new Vector<>();

	public int pop() {
		Collections.sort(v);
		int x = (int) v.elementAt(v.size() - 1);
		v.removeElementAt(v.size() - 1);
		return x;
	}

	public int peek() {
		Collections.sort(v);
		return (int) v.elementAt(v.size() - 1);
	}

	public boolean isEmpty() {
		return v.isEmpty();
	}

	public void push(T data) {
		v.add(data);
	}

	public String toString() {
		return v.toString();
	}

}
