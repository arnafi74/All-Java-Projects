/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.atm_system_simulation;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Press 1 to deposit \nPress 2 to withdraw \nPress 3 to check balance");
        ATM atm = new ATM();
        atm.ini(5000);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
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
        } else {
            System.out.println("Invalid option");
        }

    }
}
