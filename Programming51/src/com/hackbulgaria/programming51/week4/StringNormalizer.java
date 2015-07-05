package com.hackbulgaria.programming51.week4;

import java.util.Vector;
import java.util.Scanner;

public class StringNormalizer {
	
	public static String normalizeString(String str) {
        str = str.toLowerCase();
        String[] rawWords = str.split(" ");
        String result = "";
        
        Vector<String> words = new Vector<String>();
        for (String whatever: rawWords) {
			if(!whatever.equals("")){
				words.add(whatever);
				result += whatever + "*";
			}
		}
		return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(normalizeString(s));
    }

}