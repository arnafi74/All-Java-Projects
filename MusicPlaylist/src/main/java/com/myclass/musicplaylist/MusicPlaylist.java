/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.musicplaylist;

/**
 *
 * @author nafid
 */
public class MusicPlaylist {

    public static void main(String[] args) {
        SongDetails sd =new SongDetails();
        
        sd.addsongs(new Song("a","e",3.42));
        sd.addsongs(new Song("b","e",2.42));
        sd.addsongs(new Song("c","e",3.00));
        
        System.out.println("Songs before deleted:");
        sd.display();

        sd.removeByTitle("b");

        System.out.println("\nSongs after deleted:");
        sd.display();
        
        System.out.println("\nSongs longer than 3 minutes:");
        sd.displayAbove3Minutes();
    }
}
