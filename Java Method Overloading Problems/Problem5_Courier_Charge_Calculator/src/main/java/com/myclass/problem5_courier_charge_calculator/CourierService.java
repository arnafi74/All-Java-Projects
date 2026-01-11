/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.problem5_courier_charge_calculator;

/**
 *
 * @author nafid
 */
public class CourierService {
    double LocalCharge=50,IntCharge=120;
    public double calculateCharge(double weightInKg){
        double charge = LocalCharge * weightInKg;
        return charge;
    }
    public double calculateCharge(double weightInKg, String destinationType){
        if(destinationType=="International"){
            return weightInKg*IntCharge;
        }else{
            return 0;
        }
    }
}
