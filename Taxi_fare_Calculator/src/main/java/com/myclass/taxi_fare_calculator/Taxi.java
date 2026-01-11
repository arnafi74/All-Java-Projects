/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.taxi_fare_calculator;

/**
 *
 * @author nafid
 */
public class Taxi {

    private double baseFare = 50, farePerKm = 10;

    public void CalculateFare(int km) {
        if (km <= 10) {
            double totalfare = this.baseFare + (km * this.farePerKm);
            System.out.println("Total fare : " + totalfare);
        } else if (km > 10) {
            double totalfare = this.baseFare + (km * this.farePerKm);
            double discount = totalfare * .10;
            double discountTotal = totalfare - discount;
            System.out.println("Total fare with discount : " + discountTotal);
        }
    }
}
