/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem6;

/**
 *
 * @author Student
 */
public class DiscountedBill {
    double Costshirt=1300, Costpant=1700,Costpanjabi=2300,
            amount_shirt=2,amount_pant=2,amount_panjabi=2,PriceShirt,PricePant,
            PricePanjabi,TotalBill,Vat,DiscountedShirt,DiscountedPant,DiscountedPanjabi;
    public void billingcalculation(){
        PriceShirt = (Costshirt*amount_shirt*.30);
        DiscountedShirt=(Costshirt*amount_shirt)-PriceShirt;
        PricePant = (Costpant*amount_pant*.50);
        DiscountedPant=(Costpant*amount_pant)-PricePant;
        PricePanjabi = Costpanjabi*amount_panjabi;
        Vat= (DiscountedShirt+DiscountedPant+PricePanjabi) * .15;
        TotalBill=DiscountedShirt+DiscountedPant+PricePanjabi+Vat;
    }
    public void display(){
        System.out.println("Payable Amount : "+TotalBill+ "TAKA");
    }
}
