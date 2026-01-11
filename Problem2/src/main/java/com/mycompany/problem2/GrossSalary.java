/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class GrossSalary {
    double basic_salary = 100, hra = 50, da = 100,  grosssalary; 
    public void ValueInput(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the basic salary : ");
        basic_salary= scan.nextDouble();
        System.out.println("Enter the hra : ");
        hra= scan.nextDouble();
        System.out.println("Enter the da : ");
        da= scan.nextDouble();
    }
    public void grosssalarycalculation(){
        grosssalary = basic_salary+hra+da;
    }
    public void display(){
        System.out.println("gross salary "+grosssalary);
    }
}
