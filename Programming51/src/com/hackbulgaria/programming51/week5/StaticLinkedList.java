package com.hackbulgaria.programming51.week5;

public class StaticLinkedList {

    public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
        LinkedList<Integer> temp = new LinkedList<Integer>();
        int sth = l.size();
        for (int i = sth-1; i >= 0; i--) {
			temp.addLast(l.getData(i));
		}
		return temp;
    }


    public static LinkedList<Integer> sort(LinkedList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
        	for (int j = i; j < l.size(); j++) {
        		if (l.getData(i) < l.getData(j)) {
        			int temp = l.getData(i);
					l.set(i, l.getData(j));
					l.set(j, temp);
				}
				
			}
		}
        return l;
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b) {
    	LinkedList<Integer> temp = new LinkedList<Integer>();
    	for (int i = 0; i < a.size(); i++) {
			temp.addLast(a.getData(i));
		}
    	for (int j = 0; j < b.size(); j++) {
			temp.addLast(b.getData(j));
		}
    	
    	// Merges a and b into one sorted list
        return sort(temp);
    }
}
