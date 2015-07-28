package com.hackbulgaria.programming51.week8;

public class BST<T extends Comparable<T>> {
	private Node<T> root;

	public BST() {
		root = null;
	}

	public boolean empty() {
		return root == null;
	}

	public void add(T data) {
		if (empty()) {
			root = new Node<T>(data); // ������ �� ������� � ������
		} else {
			if (data.compareTo(root.data) < 0) {
				// �������� � ����
				if (root.left == null) {
					root.left = new Node<T>(data);
				} else {
					addRecursive(data, root.left);
				}
			} else {
				// �������� � �����
				if (root.right == null) {
					root.right = new Node<T>(data);
				} else {
					addRecursive(data, root.right);
				}
			}
		}
	}

	private void addRecursive(T data, Node<T> root) {
		if (data.compareTo(root.data) < 0) { // �������� ���� data � ��-�����
			// �� �������� � ����
			if (root.left == null) {
				root.left = new Node<T>(data);
			} else {
				addRecursive(data, root.left);// �������� � ������ ��������
			}
		} else {
			// �� �������� � �����
			if (root.right == null) {
				root.right = new Node<T>(data);
			} else {
				addRecursive(data, root.right); // �������� � ������� ��������
			}
		}
	}

	private String toStringRecursive(Node<T> root) {
		if (root == null)
			return "";
		String str = "";
		str += toStringRecursive(root.left);
		str += root.data + " ";
		str += toStringRecursive(root.right);
		return str;
	}

	public String toString() {
		String str = "";
		str += toStringRecursive(root);
		return str;
	}
	
	public void printLevel(int level) {
		printLevelRecursive(level, root);
	}
	
	private void printLevelRecursive(int level, Node<T> rood) {
		if (root == null) {
			return;
		}
		
		if (level == 0) {
			System.out.println(root.data + " ");
		} else {
			printLevelRecursive(level-1, root.left);
			printLevelRecursive(level-2, root.right);
		}
	}

}