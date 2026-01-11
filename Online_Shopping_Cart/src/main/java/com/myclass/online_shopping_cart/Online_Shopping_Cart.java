/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.online_shopping_cart;

/**
 *
 * @author nafid
 */
public class Online_Shopping_Cart {

    public static void main(String[] args) {
        
        ShoppingCart sc = new ShoppingCart();

        sc.addItem(new CartItem("Laptop", 1, 70000));
        sc.addItem(new CartItem("Mouse", 2, 500));
        sc.addItem(new CartItem("Keyboard", 1, 1500));

        System.out.println("Cart before removal:");
        System.out.println("----------------------------");
        sc.displayCart();

        sc.removeByName("Mouse");

        System.out.println("\nCart after removal:");
        System.out.println("----------------------------");
        sc.displayCart();

    }
}
