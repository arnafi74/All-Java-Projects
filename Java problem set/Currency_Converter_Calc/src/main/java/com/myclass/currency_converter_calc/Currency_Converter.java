/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.currency_converter_calc;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class Currency_Converter {

    double currency, convert;
    String CurrencyType;

    public void InputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target currency as (USD,EUR,INR): ");
        CurrencyType = sc.nextLine().toUpperCase();
        System.out.println("Enter amount in BDT: ");
        currency = sc.nextDouble();

    }

    public double Converter() {
        if ("USD".equals(CurrencyType)) {
            return convert = currency / 110;
        } else if ("EUR".equals(CurrencyType)) {
            return convert = currency / 120;
        } else if ("INR".equals(CurrencyType)) {
            return convert = currency / 1.3;
        } else {
            return 0;
        }
    }

    public void Display() {
        System.out.println("Amount will be : " + convert +" "+ CurrencyType);
    }
}
