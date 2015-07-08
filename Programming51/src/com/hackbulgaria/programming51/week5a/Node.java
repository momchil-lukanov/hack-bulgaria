package com.hackbulgaria.programming51.week5a;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T data){
		this.data = data;
		next = null;
	}
}
