package com.hackbulgaria.programming51.week5a;

import java.util.Scanner;

import com.hackbulgaria.programming51.week4.Vector;

public class GPS {

	  public static Vector<Integer> getGasStations(int tripDistance, int tankSize, Vector<Integer> gasStations) {
		  Vector<Integer> temp = new Vector<Integer>();
		  int km = tankSize;
		  int gasStationsCount = gasStations.size();
		  for (int i = gasStationsCount - 1; i >= 0; i++) {
			if (tankSize >= gasStations.get(i)) {
				temp.add(gasStations.get(i));
				if (km + gasStations.get(i)) {
					km = gasStations.get(i);
				}
			}
		}
	    return new Vector<Integer>();
	  }

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int tripDistance = scanner.nextInt();
	    int tankSize = scanner.nextInt();

	    int gasStationsCount = scanner.nextInt();
	    Vector<Integer> gasStations = new Vector<Integer>();

	    for (int i = 0; i < gasStationsCount; i++) {
	      gasStations.add(scanner.nextInt());
	    }

	    Vector<Integer> result = getGasStations(tripDistance, tankSize, gasStations);

	    for (int i = 0; i < result.size(); i++) {
	        System.out.println(result.get(i));
	    }

	  }
	}