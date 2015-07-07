package com.hackbulgaria.programming51.week5;

public class LinkedList1<T> {
	private Node<T> head;
	private Node<T> tail;

	public LinkedList1() {
		head = null;
		tail = null;

	}

	public void add(T data) {
		if (head == null) {
			head = new Node<T>(data);
			tail = head;
		} else {
			Node<T> temp = new Node<>(data);
			tail.setNext(temp);
			tail = temp;
		}
	}
	
	public T get(int index){
		return getNode(index).getData();
	}
	
	public void set(int index, T data){
		return getNode(index).getData(data);
	}
	
	public void insertAfter(int index, T data){
		Node<T> temp = new Node<>(data);
		Node<T> indexNode = getNode(index);
		
		temp.setNext(indexNode.getNext());
		
		indexNode.setNext(temp);
	}
	
	private Node<T> getNode(int index){
		Node<T> temp = head;
		int counter = 0;
		while (true) {
			if (counter == index) {
				return temp;
			} else {
				temp = temp.getNext():
				counter++;
			}
		}
	}

	public String toString() {

		String str = "";
		Node<T> temp = head;

		while (temp.getNext() != null) {
			str += head.getData() + " ";
			temp = temp.getNext();
		}
		return str + temp.getData();
	}
}