/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.supermarketinventory;

import java.util.ArrayList;

/**
 *
 * @author nafid
 */
public class ProductDetails {

    ArrayList<Product> products = new ArrayList<>();

    void addproduct(Product list) {
        products.add(list);
    }

    void updateproduct(String name, int quantity) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equals(name)) {
                products.get(i).quantity = quantity;
            }
        }
    }

    void display() {
        for (Product product : products) {
            System.out.println("Name: " + product.name + ", Quantity: " + product.quantity + ", Price: " + product.price + " tk");
        }
        System.out.println();
    }

    void displayless10() {
        for (Product product : products) {
            if (product.quantity < 10) {
                System.out.println("Name: " + product.name + ", Quantity: " + product.quantity + ", Price: " + product.price + " tk");
            }
        }
        System.out.println();
    }
}
