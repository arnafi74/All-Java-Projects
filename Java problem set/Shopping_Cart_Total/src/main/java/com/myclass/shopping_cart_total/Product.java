package com.myclass.shopping_cart_total;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nafid
 */
public class Product {

    String name;
    double price;
    int quantity;

    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    double getTotal() {
        return price * quantity;
    }
}
