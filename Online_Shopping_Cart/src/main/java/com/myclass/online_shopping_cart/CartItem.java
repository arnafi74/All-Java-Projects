/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.online_shopping_cart;


/**
 *
 * @author nafid
 */
public class CartItem {
    String name;
    int quantity;
    double price;

    CartItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotalPrice() {
        return quantity * price;
    }
}
