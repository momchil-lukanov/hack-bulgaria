package com.hackbulgaria.programming51.week4;

public class MusicOrganiserMain {

	public static void main(String[] args) {

		MusicOrganiser mo = new MusicOrganiser();

		mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
		mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
		mo.addSong(new Song("When I'm Gone", "Eminem", 256, "The Marshall Mathers LP"));
		mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));

		Vector<String> songs = mo.getAlbumsAndSongs();

		for(int i = 0; i < songs.size(); i++) {
		    System.out.println(songs.get(i));
		}
	}

}
