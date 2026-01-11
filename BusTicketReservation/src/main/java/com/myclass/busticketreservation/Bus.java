/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.busticketreservation;

/**
 *
 * @author nafid
 */
public class Bus {
    boolean[] seats = new boolean[40];
    
    public void reserve(int sn) {
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

    public void display() {
        System.out.print("Available seats: ");
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
