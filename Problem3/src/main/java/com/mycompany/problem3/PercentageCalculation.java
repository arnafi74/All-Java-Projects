/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PercentageCalculation {
    double sub1, sub2, sub3, sub4, sub5, percentage, total_marks=500,obtained_marks;
    public void ValueInput(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the mark for 1st : ");
        sub1= scan.nextDouble();
        System.out.println("Enter the mark for 2nd : ");
        sub2= scan.nextDouble();
        System.out.println("Enter the mark for 3rd : ");
        sub3= scan.nextDouble();
        System.out.println("Enter the mark for 4th : ");
        sub4= scan.nextDouble();
        System.out.println("Enter the mark for 5th : ");
        sub5= scan.nextDouble();
        
    }
    public void percentagecalculation(){
        obtained_marks=sub1+sub2+sub3+sub4+sub5;
        percentage = (obtained_marks/total_marks)*100;
    }
    public void display(){
        System.out.println("Percentage will be "+percentage+"%");
    }
}
