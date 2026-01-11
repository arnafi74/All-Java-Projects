/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.problem3_e.commerce_checkout;

/**
 *
 * @author nafid
 */
public class Problem3_ECommerce_Checkout {

    public static void main(String[] args) {
        CheckoutSystem cs = new CheckoutSystem();
        cs.checkout(2, 500);
        double t1 = cs.checkout(2, 500);
        System.out.println("Without Shipping Fee : "+t1);
        cs.checkout(2, 500, 100);
        double t2 = cs.checkout(2, 500, 100);
        System.out.println("With Shipping Fee : "+t2);
    }
}
