/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.supermarketinventory;

/**
 *
 * @author nafid
 */
public class SupermarketInventory {

    public static void main(String[] args) {
        ProductDetails pd = new ProductDetails();

        pd.addproduct(new Product("Juice", 16, 70));
        pd.addproduct(new Product("Eggs", 12, 8));
        pd.addproduct(new Product("Watermelon", 2, 150));

        System.out.println("All products");
        System.out.println("-----------------------------");
        pd.display();

        pd.updateproduct("Eggs", 2);//update product by name

        System.out.println("Update Product");
        System.out.println("-----------------------------");
        pd.display();

        System.out.println("Stock less than 10");
        System.out.println("-----------------------------");
        pd.displayless10();
    }
}
