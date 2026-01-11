/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.bankaccounttransactions;

import java.util.ArrayList;

/**
 *
 * @author nafid
 */
public class TransactionDetails {

    double total = 0;
    ArrayList<Transaction> transactions = new ArrayList<>();

    void addtransaction(Transaction list) {
        transactions.add(list);
    }

    void display() {
        for (Transaction transaction : transactions) {
            System.out.println("Date: " + transaction.date + "Amount: " + transaction.amount + "Transaction Type: " + transaction.transactionType);
        }
    }

    void displayCertainAmount() {
        for (Transaction transaction : transactions) {
            if (transaction.amount > 2000) {
                System.out.println("Date: " + transaction.date + "Amount: " + transaction.amount + "Transaction Type: " + transaction.transactionType);
            }
        }
    }

    void calculate() {
        for (Transaction transaction : transactions) {
            if (transaction.transactionType.equals("Deposit")) {
                total += transaction.amount;
                System.out.println("Deposited " + transaction.amount + " successfully");
            } else if (transaction.transactionType.equals("Withdraw")) {
                if (total >= transaction.amount) {
                    total -= transaction.amount;
                    System.out.println("Withdrawed " + transaction.amount + " successfully");
                } else {
                    System.out.println("Insufficient balance for withdrawal of " + transaction.amount);
                }
            }
        }
    }

    void displaycalculation() {
        System.out.println("Total Balance: " + total);
    }
}
