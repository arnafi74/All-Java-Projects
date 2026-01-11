/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.student_grades_system;

/**
 *
 * @author nafid
 */
public class Student_Grades_System {

    public static void main(String[] args) {
        Student st1 = new Student("NAFI");
        st1.addMark(85);
        st1.addMark(90);
        st1.addMark(78);

        Student st2 = new Student("LINKON");
        st2.addMark(9);
        st2.addMark(8);
        st2.addMark(80);
        st2.addMark(11);

        st1.displayInfo();
        st2.displayInfo();
    }
}
