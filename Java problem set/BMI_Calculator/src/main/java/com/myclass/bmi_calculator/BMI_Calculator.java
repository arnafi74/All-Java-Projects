/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.bmi_calculator;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class BMI_Calculator {

    public static void main(String[] args) {
        double h, w;
        Person p = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in meters : ");
        h = sc.nextDouble();
        System.out.println("Enter the weight in kg : ");
        w = sc.nextDouble();
        p.GetValue(h, w);
        p.BMI_VALUE();
    }
}
