/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.student_grades_system;

import java.util.ArrayList;

/**
 *
 * @author nafid
 */
public class Student {
    String name;
    ArrayList<Integer> marks;

    Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    void addMark(int mark) {
        marks.add(mark);
    }

    double calculateAverage() {
        if (marks.isEmpty()) return 0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Average: " + calculateAverage());
        System.out.println();
    }
}
