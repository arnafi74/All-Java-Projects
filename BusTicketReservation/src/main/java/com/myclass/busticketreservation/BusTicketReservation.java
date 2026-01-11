/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.busticketreservation;

/**
 *
 * @author nafid
 */
public class BusTicketReservation {

    public static void main(String[] args) {
        Bus b = new Bus();
        b.reserve(6);
        b.reserve(39);
        b.reserve(9);
        b.cancel(9);
        b.display();
    }
}
