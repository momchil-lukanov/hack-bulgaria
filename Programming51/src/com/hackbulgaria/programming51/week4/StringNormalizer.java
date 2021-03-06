package com.hackbulgaria.programming51.week4;

import java.util.Vector;
import java.util.Scanner;

public class StringNormalizer {
	
	public static String normalizeString(String str) {
        str = str.toLowerCase();
        String[] rawWords = str.split(" ");
        String result = "";
        
        for (String whatever: rawWords) {
			if(!whatever.equals("")){
				result += whatever.toUpperCase().charAt(0) + whatever.substring(1, whatever.length()) + " ";
			}
		}
		return result.substring(0, result.length()-1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(normalizeString(s));
    }

}