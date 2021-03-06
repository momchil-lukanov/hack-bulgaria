package com.hackbulgaria.programming51.week4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class MissingStudents {

	public static Vector<Vector<String>> missingStudents(
			Vector<String> students, Vector<Vector<String>> presence) {

		Vector<Vector<String>> temp = new Vector<Vector<String>>();
		Vector<String> sth = new Vector<String>();

		for (int i = 0; i < presence.size(); i++) {
			for (int j = 0; j < students.size(); j++) {
				if (!presence.get(i).contains(students.get(j))) {
					sth.add(students.get(j));
				}
			}
			Collections.sort(sth);
			temp.add(sth);
			sth = new Vector<String>();
		}
		return temp;
	}

	public static String toString(Vector<Vector<String>> x) {
		String result = "[";
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i).size() >= 1) {
				result += "[";
				for (int j = 0; j < x.get(i).size(); j++) {
					if (j != x.get(i).size()-1) {
						result += x.get(i).get(j) + ", ";
					} else {
						result += x.get(i).get(j);
					}
				}
				result += "], ";
			}
		}
		return result + "]";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    Vector<String> students = new Vector<>();
	    Vector<Vector<String>> presence = new Vector<>();

	    int studentsCount = Integer.parseInt(scanner.nextLine());

	    for (int i = 0; i < studentsCount; i++) {
	      String student = scanner.nextLine();
	      students.add(student);
	    }

	    int days = Integer.parseInt(scanner.nextLine());

	    for (int i = 0; i < days; i++) {
	      int studentsForThatDay = Integer.parseInt(scanner.nextLine());
	      Vector<String> presenceForDay = new Vector<>();
	      for (int j = 0; j < studentsForThatDay; j++) {
	        presenceForDay.add(scanner.nextLine());
	      }

	      presence.add(presenceForDay);
	    }

	    Vector<Vector<String>> missing = missingStudents(students, presence);

	    System.out.println(missing);
	}
}
