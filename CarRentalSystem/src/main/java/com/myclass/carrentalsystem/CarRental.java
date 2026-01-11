/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.carrentalsystem;

/**
 *
 * @author nafid
 */
public class CarRental {

    String carModel, renterName;
    double rentalDays;
    double dailyRate;
    boolean hasLife;

    CarRental(String carModel, String renterName, double rentalDays, boolean hasLife) {
        this.carModel = carModel;
        this.renterName = renterName;
        this.rentalDays = rentalDays;
        this.hasLife=hasLife;
    }
    public String getRentalDetails() {
        return "Car Model = " + carModel + " Renter = " + renterName + " Days = " + String.format("%,.2f", rentalDays) + " Life: " + hasLife;
    }
    public static void main(String[] args) {
        CarRental cr1 = new CarRental("Toyota Corolla","Alice",12742,true);
        System.out.println(cr1.getRentalDetails());


    }
}
