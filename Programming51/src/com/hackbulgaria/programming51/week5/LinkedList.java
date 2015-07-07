package com.hackbulgaria.programming51.week5;

public class LinkedList<T> {
	private Node<T> head;
    private Node<T> tail;

    public LinkedList(){
    	head = null;
    	tail = null;
    }

    public void add(T data){
        if (head == null) {
			head = new Node<T>(data);
			tail = head;
		} else {
			Node<T> temp = new Node<T>(data);
			tail.next = temp;
			tail = temp;
		}
    }

    public T get(int index){
        // Return the element at the index place
        return null;
    }

    public void set(int index, T el){
        // Set the value at the index place
    }

    public void remove(int index){
        // Remove an element form the index place
    }

    public void insert(int index, T el){
        // Insert an element on the index place
    }

    public String toString(){
        return "Implement toString() method";
    }
}
