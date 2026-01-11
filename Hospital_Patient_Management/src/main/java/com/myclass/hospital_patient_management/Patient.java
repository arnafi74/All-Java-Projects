/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.hospital_patient_management;

/**
 *
 * @author nafid
 */
public class Patient {
    String name;
    int age;
    String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + " \nDisease: " + disease+"\n");
    }
}
