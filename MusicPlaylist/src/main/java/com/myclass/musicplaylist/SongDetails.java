/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.musicplaylist;

import java.util.ArrayList;

/**
 *
 * @author nafid
 */
public class SongDetails {

    ArrayList<Song> songs = new ArrayList<>();

    void addsongs(Song list) {
        songs.add(list);
    }

    void removeByTitle(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).title.equals(title)) {
                songs.remove(i);
                break;
            }
        }
    }

    void display() {
        for (Song song : songs) {
            System.out.println("Title: " + song.title + ", Artist: " + song.artist + ", Duration: " + song.duration + " mins");
        }
    }

    void displayAbove3Minutes() {
        for (Song song : songs) {
            if (song.duration >= 3) {
                System.out.println("Title: " + song.title + ", Artist: " + song.artist + ", Duration: " + song.duration + " mins");
            }
        }
    }
}
