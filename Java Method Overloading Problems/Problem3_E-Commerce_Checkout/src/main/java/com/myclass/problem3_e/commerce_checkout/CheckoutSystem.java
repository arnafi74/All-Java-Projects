/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.problem3_e.commerce_checkout;

/**
 *
 * @author nafid
 */
public class CheckoutSystem {
    public double checkout(int quantity, double unitPrice){
        double total = quantity * unitPrice;
        return total;
    }
    public double checkout(int quantity, double unitPrice, double shippingFee){
        double total = quantity * unitPrice;
        double totalWithShippingFee = total + shippingFee;
        return totalWithShippingFee;
    }
}
