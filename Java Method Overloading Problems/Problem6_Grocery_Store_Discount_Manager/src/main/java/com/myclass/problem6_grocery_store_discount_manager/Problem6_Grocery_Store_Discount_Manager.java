/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.problem6_grocery_store_discount_manager;

/**
 *
 * @author nafid
 */
public class Problem6_Grocery_Store_Discount_Manager {

    public static void main(String[] args) {
        DiscountManager dm = new DiscountManager();
        dm.applyDiscount(2000);
        double discount = dm.applyDiscount(2000);
        System.out.println("Normal Discount: "+discount);
        dm.applyDiscount(2000, "Gold");
        double membership = dm.applyDiscount(2000,"Gold");
        System.out.println("Membership Discount: "+membership);
    }
}
