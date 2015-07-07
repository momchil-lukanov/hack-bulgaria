package com.hackbulgaria.programming51.week5;

public class Node<T> {
	public T data;
	public Node<T> next;

	public Node(T data) {
		this.data = data;
		next = null;
	}
}

// public String toString() {
// if(next == null) {
// return data.toString();
// }
//
// return data.toString() + ", " + next.toString();
// }

// public static void main(String[] args) {
// // boxing: Primitive type -> Referential type
// Node<Integer> a = new Node<>(1);
// Node<Integer> a1 = new Node<>(2);
// Node<Integer> a2 = new Node<>(3);
// Node<Integer> a3 = new Node<>(4);
// Node<Integer> a4 = new Node<>(5);
// Node<Integer> a5 = new Node<>(6);
//
//
// a.next = a1;
// a1.next = a2;
// a2.next = a3;
// a3.next = a4;
// a4.next = a5;
//
// // a -> a1 -> a2 -> a3 -> a4 -> a5 -> null
// // a.toString() = 1 + ", " + a1.toString()
// // a1.toString() = 1 + ", " + 2 + ", " + a2.toString()
// //
// //
// //
// System.out.println(a.toString());
// }
// }
