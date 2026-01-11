/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclass.student_grading_system;

/**
 *
 * @author nafid
 */
public class Student {

    private double quiz, midterm, assignment, finalExam, totalExam = 100, totalMarks;

    public Student(double quiz, double midterm, double assignment, double finalExam) {
        this.quiz = quiz;
        this.midterm = midterm;
        this.assignment = assignment;
        this.finalExam = finalExam;
    }

    public double calculateTotalMarks() {
        totalMarks = quiz + midterm + assignment + finalExam;
        if (totalMarks <= totalExam) {
            System.out.println("Total Marks: " + totalMarks);
        } else {
            System.out.println("Invalid");
        }
        return 0;
    }

    public double getGrade() {
        if (totalMarks >= 90) {
            System.out.println("Grade: A");
        } else if (totalMarks >= 80) {
            System.out.println("Grade: B");
        } else if (totalMarks >= 70) {
            System.out.println("Grade: C");
        } else if (totalMarks >= 60) {
            System.out.println("Grade: D");
        } else if (totalMarks < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid");
        }
        return 0;
    }
}
