/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.employee_bonus_calculator;

/**
 *
 * @author nafid
 */
public class Employee {
    String name;
    double basic_salary,bonus;
    double YearsOfService;
    public void GetValue(String name,double basic_salary,double YearsOfService){
        this.name=name;
        this.basic_salary=basic_salary;
        this.YearsOfService=YearsOfService;
    }
     public double Logic() {
        if (YearsOfService<5) {
            return bonus = basic_salary;
        } else if (YearsOfService>=5 && YearsOfService<=10) {
            return bonus = basic_salary +(basic_salary*.05);
        } else if (YearsOfService>10) {
            return bonus = basic_salary +(basic_salary*.10);
        } else {
            return 0;
        }
     }
     public void display(){
         System.out.println("Name: "+name);
         System.out.println("Basic Salary: "+basic_salary);
         System.out.println("Total salary with bonus: "+bonus);
     }
    
}
