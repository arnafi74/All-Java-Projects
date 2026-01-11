/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.problem4_event_booking_system;

/**
 *
 * @author nafid
 */
public class Problem4_Event_Booking_System {
    
    public static void main(String[] args) {
        EventBooking eb = new EventBooking();
        System.out.println("Method : book(String eventName)");
        System.out.println("Method : book(String eventName,int guests)");
        System.out.println("Method : book(String eventName,int guests,includeCathering)");
        eb.book("Workshop");
        eb.book("Wedding", 100);
        eb.book("Birthday", 50, true);
    }
}
