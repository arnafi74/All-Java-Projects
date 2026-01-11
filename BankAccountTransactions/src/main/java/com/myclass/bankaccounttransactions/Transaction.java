/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.bankaccounttransactions;

/**
 *
 * @author nafid
 */
public class Transaction {
    String date;
    double amount;
    String transactionType;

    Transaction(String date, double amount, String transactionType) {
        this.date = date;
        this.amount = amount;
        this.transactionType = transactionType;
    }
}
