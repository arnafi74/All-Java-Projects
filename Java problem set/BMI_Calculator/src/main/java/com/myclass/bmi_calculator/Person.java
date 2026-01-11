/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.bmi_calculator;

/**
 *
 * @author nafid
 */
public class Person {

    private double height, weight, BMI;

    public void GetValue(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void BMI_VALUE() {
        this.BMI = weight / (height * height);
        System.out.println("BMI = "+this.BMI);
        if (this.BMI < 18.5) {
            System.out.println("Underweight");
        } else if (this.BMI >= 18.5 && this.BMI <= 24.9) {
            System.out.println("Normal");
        } else if (this.BMI >= 25 && this.BMI <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
