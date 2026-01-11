/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.taxi_fare_calculator;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class TaxiFareCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance traveled (km): ");
        int km = sc.nextInt();
        Taxi t = new Taxi();
        t.CalculateFare(km);
    }
}
