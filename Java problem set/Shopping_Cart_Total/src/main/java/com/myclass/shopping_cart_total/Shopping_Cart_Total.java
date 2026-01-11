/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.shopping_cart_total;

import java.util.Scanner;

public class Shopping_Cart_Total {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] cart = new Product[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("\nProduct Number " + (i + 1) + ":");
            System.out.print("\nName: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            cart[i] = new Product(name, price, qty);
        }

        double total = 0;
        System.out.println("\nCart Summary");
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            Product p = cart[i];
            double itemTotal = p.getTotal();
            System.out.println(cart[i].name + ": " + itemTotal);
            total += itemTotal;
        }

        double discount = 0;
        if (total > 1000) {
            discount = total * 0.10;
            total -= discount;
        }

        System.out.println("\nDiscount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}
