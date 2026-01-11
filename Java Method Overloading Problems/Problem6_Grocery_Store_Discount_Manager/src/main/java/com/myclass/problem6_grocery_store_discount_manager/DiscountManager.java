/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.problem6_grocery_store_discount_manager;

/**
 *
 * @author nafid
 */
public class DiscountManager {
    public double applyDiscount(double totalAmount){
        double discount = totalAmount - (totalAmount * .05);
        return discount;
    }
    public double applyDiscount(double totalAmount, String membershipLevel){
        double discount=0.5;
        if(membershipLevel.equals("Silver")){
            discount=.10;
        }else if ("Gold".equals(membershipLevel)){
            discount = 0.15;
        }
        return totalAmount-(totalAmount*discount);
    }
}
