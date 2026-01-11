/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.problem1;

/**
 *
 * @author nafid
 */
public class Area {

    public static void main(String[] args) {    
        CircleArea cr =new CircleArea();
        cr.ValueInput();
        cr.areacalculation();
        cr.display();
        TriangleArea tc = new TriangleArea();
        tc.ValueInput();
        tc.areacalculation();
        tc.display();
    }
}
