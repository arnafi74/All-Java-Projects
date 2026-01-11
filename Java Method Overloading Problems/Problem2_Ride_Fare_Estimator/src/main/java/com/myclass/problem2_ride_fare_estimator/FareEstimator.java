/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.problem2_ride_fare_estimator;

/**
 *
 * @author nafid
 */
public class FareEstimator {
    double baseFare=50, PriceperKm=20, pricePerMinute=2;
    public double estimateFare(double distance){
        double total = baseFare+(PriceperKm*distance);
        return total;
    }
    
    public double estimateFare(double distance, double time){
        double total = baseFare+(PriceperKm*distance);
        double totalwithtime = total+(time*pricePerMinute);
        return totalwithtime;
    }
}
