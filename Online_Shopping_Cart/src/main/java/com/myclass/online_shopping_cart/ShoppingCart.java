/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.online_shopping_cart;

import java.util.ArrayList;

/**
 *
 * @author nafid
 */
public class ShoppingCart {

    ArrayList<CartItem> items=new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void removeByName(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equals(name)) {
                items.remove(i);
                break;
            }
        }
    }

    public void displayCart() {
        for (CartItem item : items) {
            System.out.println(item.name + "   Quantity: " + item.quantity + "   Unit Price: " + item.price);
        }
        System.out.println("Total Price: " + calculateTotal()+" tk");
    }
}
