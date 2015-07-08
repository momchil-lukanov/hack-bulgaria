package com.hackbulgaria.programming51.week5a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int n;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            l.addLast(scanner.nextInt());
        }

        l.insertAfter(3,scanner.nextInt());

        l.remove(2);

        l.addFirst(scanner.nextInt());

        int x = scanner.nextInt();

        System.out.println(l.contains(x));
        System.out.println(l.getFirst() + " " + l.getLast());
        System.out.println(l);
        System.out.println(StaticLinkedList.reverse(l));


    }

}