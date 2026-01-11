/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem4;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class TempConvert {
    double celsius, farenheit;
    public void ValueInput(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the celsius : ");
        celsius= scan.nextDouble();
    }
    public void temperaturecovertion(){
        farenheit = (celsius * 9/5)+32;
    }
    public void display(){
        System.out.println("Farenheit will be : "+farenheit);
    }
}
