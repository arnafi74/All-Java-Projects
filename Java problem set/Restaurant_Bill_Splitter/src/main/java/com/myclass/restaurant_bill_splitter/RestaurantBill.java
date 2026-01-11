/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.restaurant_bill_splitter;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class RestaurantBill {
    double bill,nop,totalbill,split;
    public void InputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bill: ");
        bill = sc.nextDouble();
        System.out.println("Number of people: ");
        nop = sc.nextDouble();
    }
    public double Calc(){
        if(bill>2000){
            totalbill=bill+(bill*.10);
            split=totalbill/nop;
        }else{
            totalbill=bill;
            split=totalbill/nop;
        }
        return split;
    }
    public void display(){
        System.out.println("Total Bill: "+totalbill);
        System.out.println("Each person share will be: "+split);
    }
}
