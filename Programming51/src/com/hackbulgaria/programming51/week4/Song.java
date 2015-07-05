package com.hackbulgaria.programming51.week4;

public class Song {
	private String name = "";
	private String artist = "";
	private int duration = 0;
	public String album = "";
	private int howManySongs = 0;

	public Song(String name, String artist, int duration, String album) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.album = album;
	}

	public String toString() {
		return name + ", " + artist + ", " + duration + ", " + album;  
	}
	
	public String getAlbum(){
		return album;
	}
	
	public String getName(){
		return name;
	}
	
	public String howManySongs(){
		return "(" + howManySongs + ")";
	}

}
