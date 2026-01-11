/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.hospital_patient_management;

import java.util.ArrayList;

/**
 *
 * @author nafid
 */
public class Hospital {

    ArrayList<Patient> patients=new ArrayList<>();

    public void admit(Patient p) {
        patients.add(p);
    }

    public void disease(String disease) {
        System.out.println("Patients with disease: " + disease);
        for (Patient p : patients) {
            if (p.disease.equals(disease)) {
                p.display();
            }
        }
    }

    public void discharge(String name) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).name.equals(name)) {
                patients.remove(i);
                System.out.println("Patient " + name + " has been discharged.");
                return;
            }
        }
        System.out.println("Patient " + name + " not found.");
    }

    public void display() {
        for (Patient p : patients) {
            p.display();
        }
    }
}
