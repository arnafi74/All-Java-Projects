/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.movie_ticket_booking_system;

/**
 *
 * @author nafid
 */
public class CinemaHall {
    boolean[] seats = new boolean[10];
    
    public void book(int sn) {
        if (sn < 0 || sn >= seats.length) {
            System.out.println("Invalid seat number.");
        } else if (seats[sn]) {
            System.out.println("Seat " + sn + " is already booked.");
        } else {
            seats[sn] = true;
            System.out.println("Seat " + sn + " booked successfully.");
        }
    }

    public void cancel(int sn) {
        if (sn < 0 || sn >= seats.length) {
            System.out.println("Invalid seat number.");
        } else if (!seats[sn]) {
            System.out.println("Seat " + sn + " is not booked.");
        } else {
            seats[sn] = false;
            System.out.println("Booking for seat " + sn + " cancelled.");
        }
    }

    public void show() {
        System.out.print("Available seats: ");
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
