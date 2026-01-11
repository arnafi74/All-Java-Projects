/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.problem5_courier_charge_calculator;

/**
 *
 * @author nafid
 */
public class Problem5_Courier_Charge_Calculator {

    public static void main(String[] args) {
        CourierService cs = new CourierService();
        cs.calculateCharge(2);
        double local = cs.calculateCharge(2);
        System.out.println("Local Charge : "+local);
        cs.calculateCharge(local, "International");
        double inter = cs.calculateCharge(2,"International");
        System.out.println("International Charege : "+inter);
    }
}
