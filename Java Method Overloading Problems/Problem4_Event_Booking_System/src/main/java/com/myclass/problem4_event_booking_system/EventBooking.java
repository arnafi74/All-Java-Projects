/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.problem4_event_booking_system;

/**
 *
 * @author nafid
 */
public class EventBooking {
    public void book(String eventName){
        System.out.println("Event: " + eventName);
    }
    public void book(String eventName, int guests){
        System.out.println("Event: " + eventName+ " Guests "+guests);
    }
    public void book(String eventName,int guests, boolean includeCatering){
        System.out.println("Event: " + eventName+ " Guests: "+guests+" Catering: "+ includeCatering);
    }
}
