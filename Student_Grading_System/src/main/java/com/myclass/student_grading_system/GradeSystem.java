/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myclass.student_grading_system;

import java.util.Scanner;

/**
 *
 * @author nafid
 */
public class GradeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Quiz Marks (out of 20): ");
        double quiz = sc.nextDouble();
        if (quiz <= 20) {
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Enter Midterm Marks (out of 30): ");
        double midterm = sc.nextDouble();
        if (midterm <= 30) {
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Enter Assignment Marks (out of 20): ");
        double assignment = sc.nextDouble();
        if (assignment <= 20) {
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Enter Final Exam Marks (out of 30):  ");
        double finalExam = sc.nextDouble();
        if (finalExam <= 30) {
        } else {
            System.out.println("Invalid");
        }
        Student st = new Student(quiz, midterm, assignment, finalExam);
        st.calculateTotalMarks();
        st.getGrade();
    }
}
