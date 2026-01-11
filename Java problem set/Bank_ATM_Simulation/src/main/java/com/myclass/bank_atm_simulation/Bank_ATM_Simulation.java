/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.bank_atm_simulation;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class Bank_ATM_Simulation {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            a = sc.nextInt();
            BankAccount atm = new BankAccount();
            atm.ini(5000);
            if (a == 1) {
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                atm.deposit(depositAmount);
                System.out.println("Current balance: " + atm.getBalance());
            } else if (a == 2) {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                atm.withdraw(withdrawAmount);
                System.out.println("Current balance: " + atm.getBalance());
            } else if (a == 3) {
                System.out.println("Current balance: " + atm.getBalance());
            } else if (a == 4) {
                System.out.println("Exiting ATM. Thank you!");
                break;
            }else{
                System.out.println("Invalid option");
            }
        }

    }
}
