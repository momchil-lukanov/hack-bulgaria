package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

public class VectorOfVectors {

	public static Vector<Integer> sorting(Vector<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			for (int j = i; j < a.size(); j++) {
				if (a.get(j) < a.get(i)) {
					int temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
		}
		return a;
	}

	public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
		Vector<Integer> temp = new Vector<Integer>();
		for (int i = 0; i < v.size(); i++) {
			for (int j = 0; j < v.get(i).size(); j++) {
				if (!temp.contains(v.get(i).get(j))) {
					temp.add(v.get(i).get(j));
				}
			}
		}
		VectorOfVectors.sorting(temp);
		return temp;
	}
	
	public static String toString(Vector<Integer> x){
		String result = "";
		for (int i = 0; i < x.size(); i++) {
			result += x.get(i) + " ";
		}
		return result.substring(0, result.length()-1);
	}


    public static void main(String[] args) {

        Vector<Vector<Integer>> vi = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Vector<Integer> v = new Vector<Integer>();
            int num = scanner.nextInt();
            for (int k = 0; k < num; k++) {
                v.add(scanner.nextInt());
            }
            vi.add(v);
        }
        Vector<Integer> a = sortAndUnique(vi);
        System.out.println(VectorOfVectors.toString(a));
    }

}