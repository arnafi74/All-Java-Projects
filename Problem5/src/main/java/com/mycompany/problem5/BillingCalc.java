/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem5;
/**
 *
 * @author Student
 */
public class BillingCalc {
    double Costshirt=1300, Costpant=1700,amount_shirt=3,amount_pant=2,PriceShirt,PricePant,TotalBill,Vat;
    public void billingcalculation(){
        PriceShirt = Costshirt*amount_shirt;
        PricePant = Costpant*amount_pant;
        Vat= (PriceShirt+PricePant) * .15;
        TotalBill=PriceShirt + PricePant+Vat;
    }
    public void display(){
        System.out.println("Payable Amount : "+TotalBill+ "TAKA");
    }
}
