package com.hackbulgaria.programming51.week4;

import java.security.acl.LastOwnerException;

public class MusicOrganiser {

	private Vector<Song> songs;

	public MusicOrganiser() {
		songs = new Vector<Song>();
	}

	public void addSong(Song x) {
		songs.add(x);
	}

	public int getCount() {
		return songs.size();
	}

	public Vector<String> getAlbums() {
		Vector<String> result = new Vector<String>();
		Vector<String> albums = new Vector<String>();

		for (int i = 0; i < songs.size(); i++) {
			Song song = songs.get(i);
			if (!albums.contains(song.album)) {
				albums.add(song.album);
				result.add(song.album);
			}
		}
		return result;

	}

	public int getAlbumsCount() {
		int result = 0;
		Vector<String> albums = new Vector<String>();

		for (int i = 0; i < songs.size(); i++) {
			Song song = songs.get(i);
			if (!albums.contains(song.album)) {
				albums.add(song.album);
				result++;
			}
		}
		return result;
	}

	public Vector<Song> getAlbumSongs(String albumName) {
		Vector<Song> result = new Vector<Song>();

		for (int i = 0; i < songs.size(); i++) {
			if (albumName == songs.get(i).album) {
				result.add(songs.get(i));
			}
		}
		return result;
	}

	public String getNumberOfAlbumSongs(String albumName) {
		String result = "";
		int counter = 0;

		for (int i = 0; i < songs.size(); i++) {
			if (albumName == songs.get(i).album) {
				counter++;
				result = "(" + counter + ")";
			}
		}
		return result;
	}

	public Vector<String> getAlbumsAndSongs() {

		Vector<String> result = new Vector<String>();
		Vector<String> albums = new Vector<String>();

		for (int i = 0; i < songs.size(); i++) {
			Song song = songs.get(i);
			if (!albums.contains(song.album)) {
				albums.add(song.album);
				result.add(song.album + getNumberOfAlbumSongs(song.album));
			}
		}
		return result;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < songs.size(); i++) {
			result += songs.get(i) + " ";
		}
		return result;
	}

}
