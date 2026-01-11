/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.problem2_ride_fare_estimator;

/**
 *
 * @author nafid
 */
public class Problem2_Ride_Fare_Estimator {

    public static void main(String[] args) {
        FareEstimator fe = new FareEstimator();
        fe.estimateFare(5);
        double t1 = fe.estimateFare(5);
        System.out.println("Without time : "+t1);
        fe.estimateFare(5, 5);
        double t2 = fe.estimateFare(5, 15);
        System.out.println("With time : "+t2);
    }
}
