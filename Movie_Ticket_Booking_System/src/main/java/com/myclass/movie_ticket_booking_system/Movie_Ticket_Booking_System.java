/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.movie_ticket_booking_system;

/**
 *
 * @author nafid
 */
public class Movie_Ticket_Booking_System {

    public static void main(String[] args) {

        CinemaHall ch = new CinemaHall();
        ch.book(6);
        ch.book(9);
        ch.cancel(9);
        ch.show();
    }
}
