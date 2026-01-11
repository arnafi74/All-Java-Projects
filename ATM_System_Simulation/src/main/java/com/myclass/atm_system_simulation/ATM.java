/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.atm_system_simulation;

/**
 *
 * @author nafid
 */
public class ATM {

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
