/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.problem1;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class CircleArea {
    public double area, pi=3.1416,r;
    public void ValueInput(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the radius : ");
        r= scan.nextDouble();
    }
    public void areacalculation(){
        area=pi*r*r;
    }
    public void display(){
        System.out.println("Circle Area : "+area);
    }
}
