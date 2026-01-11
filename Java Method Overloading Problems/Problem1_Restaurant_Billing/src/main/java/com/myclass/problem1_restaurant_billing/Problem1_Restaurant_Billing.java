/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.problem1_restaurant_billing;

/**
 *
 * @author nafid
 */
public class Problem1_Restaurant_Billing {
    public static void main(String[] args) {
        BillCalculator bc = new BillCalculator();
        bc.calculateBill(250, 3);
        double t1 = bc.calculateBill(250, 3);
        System.out.println("Total without discount: " +t1) ;
        bc.calculateBill(250, 3, 10);
        double t2 = bc.calculateBill(250, 3, 10);
        System.out.println("Total with discount: " +t2);
        
    }
}
