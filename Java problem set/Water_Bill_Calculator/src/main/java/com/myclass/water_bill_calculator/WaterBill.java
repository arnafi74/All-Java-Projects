/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.water_bill_calculator;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class WaterBill {

    double liter,pay;

    public void InputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter liters: ");
        liter = sc.nextDouble();
    }

    public double Billing() {
        if (liter <= 500) {
            return pay=liter * 2;
        } else if (liter >= 501 && liter <= 1000) {
            return pay=liter * 3;
        }else if (liter>1000){
            return pay=liter*5;
        }else{
            return 0;
        }
    }
    public void Display(){
        System.out.println("Bill : "+pay+" BDT");
    }
}
