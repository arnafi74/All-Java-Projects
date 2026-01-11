/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.problem1_restaurant_billing;

/**
 *
 * @author nafid
 */
public class BillCalculator {
    public double calculateBill(double pricePerItem,int quantity){
        double total = pricePerItem * quantity;
        return total;
    }
    public double calculateBill(double pricePerItem,int quantity,double discountPercent){
        double total = (pricePerItem * quantity);
        double discountedtotal = total - (total*discountPercent/100);
        return discountedtotal;
    }
    
}
