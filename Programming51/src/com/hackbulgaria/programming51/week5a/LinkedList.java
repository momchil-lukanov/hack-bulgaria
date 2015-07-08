package com.hackbulgaria.programming51.week5a;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void addFirst(T data) {
		Node<T> temp = new Node<T>(data);
		if (head != null) {
			temp.next = head;
		}
		head = temp;
	}

	public void addLast(T data) {
		Node<T> temp = new Node<T>(data);
		if (head == null) {
			head = temp;
		} else {
			tail.next = temp;
		}
		tail = temp;
	}

	public T getFirst() {
		return head.data;
	}

	public T getLast() {
		return tail.data;
	}

	public T getData(int index) {
		return getElement(index).data;
	}
	
	public int getElementIndex(T data){
		Node<T> temp = head;
		int index = 0;
		while (temp != null){
			if (temp.data == data) {
				break;
			}
			temp = temp.next;
			index++;
		}
		return index;
	}

	public boolean contains(T data) {
		Node<T> temp = head;
		int counter = 0;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
			counter++;
		}
		return false;
	}

	public Node<T> getElement(int index) {

		int counter = 0;
		Node<T> temp = head;
		while (temp != null) {
			if (counter == index) {
				break;
			}
			temp = temp.next;
			counter++;
		}
		return temp;
	}

	public void insertAfter(int index, T data) {
		Node<T> temp = new Node(data);
		Node<T> el = getElement(index);
		temp.next = el.next;
		el.next = temp;
	}

	public void remove(int index) {

		if (index == 0) {
			head = head.next;
		} else {
			Node<T> temp = getElement(index - 1);
			temp.next = temp.next.next;
		}
	}

	public String toString() {
		String str = "[";
		Node<T> temp = head;
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str + temp.data + "]";
	}

	public void clear() {
		head = null;
	}

	public int size() {
		int counter = 0;
		Node<T> temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	public void set(int index, T el) {
		getElement(index).data = el;
	}
}
