/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.numbercomparator;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class LargestNumberFinder {

    public static void main(String[] args) {
        NumberComparator nc = new NumberComparator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter value of Number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter value of Number 3: ");
        int c = sc.nextInt();
        nc.GetValue(a, b, c);
        int largest = nc.findLargest();
        if (largest == 0) {
            System.out.println("There are few equal values.");
        } else {
            System.out.println("Largest value is: " + largest);
        }
    }
}
