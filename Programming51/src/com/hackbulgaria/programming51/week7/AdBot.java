package com.hackbulgaria.programming51.week7;

import java.util.LinkedList;
import java.util.Queue;

public class AdBot {
	
	public String[] a;
	public Queue<String> b;

	public AdBot(String[] a){
		this.a = a;
		b = new LinkedList<String>();
		for (String word: a) {
			b.add(word);
		}
	}
	
	public void showNextAdd(){
		String temp = b.peek();
		System.out.println(temp);
		b.poll();
		b.add(temp);
	}
	
	public static void main(String[] args) throws InterruptedException {

        String[] s = {
            "Try the new invention! It gives you the ability to go from one room to another trough the wall. It is called a 'Door'!",
            "The new thing is out! It's called Sleeping! Sleeping helps you get energy for your next day! Try Sleeping TODAY!",
            "Here's another advertisement that I didn't want to think text for. Enjoy!",
            "Oh, and another AD. My, my! How exciting!"
        };

        AdBot ad = new AdBot(s);
        for (int i = 0; i < 100; i++) {
            ad.showNextAdd();
            Thread.sleep(1000);
        }
    }
}
