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
public class TriangleArea {
    public double area, base ,height;
    
    public void ValueInput(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the height : ");
        height= scan.nextDouble();
        System.out.println("Enter the base : ");
        base= scan.nextDouble();
    }
    public void areacalculation(){
        area= 0.5*base*height;
    }
    public void display(){
        System.out.println("Triangle Area: "+area);
    }
}
