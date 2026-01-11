/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.parcel_delivery_charge_calculator;

/**
 *
 * @author nafid
 */
import java.util.Scanner;

public class Parcel {

    String DeliveryType;
    double weight, pay,totalpay;

    public void InputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Delivery Type (regular/express): ");
        DeliveryType = sc.nextLine();
        System.out.println("Weight in kg: ");
        weight = sc.nextDouble();
    }

    public double Calc() {
        if ("regular".equals(DeliveryType)) {
             pay = 50 * weight;
        } else if ("express".equals(DeliveryType)) {
             pay = 80 * weight;
        }if (weight > 10) {
            return totalpay = pay+100;
        }else{
            return totalpay=pay;
        }
        
    }

    public void display() {
        System.out.println("Total delivery charge: " + totalpay + " TK");
    }

}
