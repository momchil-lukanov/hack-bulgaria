package com.hackbulgaria.programming51.week3;

public class IntegerVectorStatic {

	public static String toString(IntegerVector v) {
		String result = "";
		for (int i = 0; i < v.data.length; i++) {
			result += v.data[i];
			if (i != v.data.length - 1) {
				result += ",";
			}
		}
		return result;
	}

	public static void sort(IntegerVector v) {
		for (int i = 0; i < v.data.length; i++) {
			for (int j = i; j < v.data.length; j++) {
				if (v.data[i] > v.data[j]) {
					int temp = v.data[i];
					v.data[i] = v.data[j];
					v.data[j] = temp;
				}
			}
		}
	}

	public static IntegerVector reverse(IntegerVector v) {
		int counter = v.data.length - 1;
		for (int i = 0; i < v.data.length / 2; i++) {
			int temp = v.data[counter];
			v.data[counter] = v.data[i];
			v.data[i] = temp;
			counter--;
		}
		return v;

	}

	public static String join(IntegerVector v, String glue) {
		String result = "";
		for (int i = 0; i < v.data.length; i++) {
			result += v.data[i];
			if (i != v.data.length - 1) {
				result += glue;
			}
		}
		return result;
	}

	public static int sum(IntegerVector v) {
		int result = 0;
		for (int i = 0; i < v.data.length; i++) {
			result += v.data[i];
		}
		return result;
	}

	public static IntegerVector range(int a, int b) {
		IntegerVector temp = new IntegerVector();
		int capacity = b - a;
		temp.data = new int[capacity];
		for (int i = 0; i < capacity; i++) {
			temp.data[i] = a;
			a++;
		}
		return temp;
	}

	public static IntegerVector filterOdd(IntegerVector v) {
		int newCapacity = 0;
		IntegerVector result = new IntegerVector();
		int index = 0;

		for (int i = 0; i < v.data.length; i++) {
			if (v.data[i] % 2 != 0) {
				newCapacity++;
			}
		}

		result.data = new int[newCapacity];
		
		for (int j = 0; j < v.data.length; j++) {
			if (v.data[j] % 2 != 0) {
				result.data[index] = v.data[j];
				index++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		  IntegerVector v = new IntegerVector();
		  v = IntegerVectorStatic.range(10,20);
		  System.out.println(IntegerVectorStatic.toString(v));
	}

}
