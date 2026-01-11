/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.hospital_patient_management;

/**
 *
 * @author nafid
 */
public class Hospital_Patient_Management {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.admit(new Patient("Taief", 30, "flu"));
        hospital.admit(new Patient("Tauha", 45, "diabetes"));
        hospital.admit(new Patient("Linkon", 25, "diarrhea"));

        hospital.disease("flu");

        hospital.discharge("Linkon");

        System.out.println("\nCurrent Patients:");
        hospital.display();

    }
}
