/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.bank_atm_simulation;

/**
 *
 * @author nafid
 */
public class BankAccount {
     private double balance;
    
    public void ini(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
        System.out.println("Deposited " + depositAmount+ " Successfuly");
    }
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= this.balance) {
            this.balance = this.balance - withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount+ " Successfuly");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return this.balance;
    }
}
