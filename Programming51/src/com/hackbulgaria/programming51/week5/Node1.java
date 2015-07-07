package com.hackbulgaria.programming51.week5;

public class Node1<T> {

	private T data;
	private Node<T> next;

	public Node1(T data){
		this.data = data;
		next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
