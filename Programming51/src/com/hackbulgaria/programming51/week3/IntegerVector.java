package com.hackbulgaria.programming51.week3;

public class IntegerVector {

	public int[] data;
	private int size = 0;
	private int capacity = 2;

	public IntegerVector() {
		this.data = new int[capacity];
		this.size = size;
		this.capacity = capacity;
	}

	private void resize() {
		capacity = capacity * 2 + 1;
		int[] temp = new int[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}

		data = temp;
	}

	public void add(int e) {
		if (size == capacity) {
			resize();
		}
		data[size] = e;
		size++;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += data[i];
			if (i != size - 1) {
				result += ", ";
			}
		}
		return result;
	}

	public int size() {
		return size;
	}

	public int sum() {
		int result = 0;
		for (int i = 0; i < size; i++) {
			result += data[i];
		}
		return result;
	}

	public void addAll(int[] n) {
		for (int i = 0; i < n.length; i++) {
			add(n[i]);
		}
	}

	public int get(int index) {
		return data[index];
	}

	public void set(int index, int sth) {
		data[index] = sth;
	}

	public void insert(int index, int data1) {
		add(data1);
		for (int i = data.length - 1; i > index; i--) {
			int temp = data[i - 1];
			data[i - 1] = data[i];
			data[i] = temp;
		}
	}

	public void remove(int index) {
		for (int i = index; i < data.length - 1; i++) {
			data[i] = data[i + 1];
		}
		size = size - 1;
	}
}
