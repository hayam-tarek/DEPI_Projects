/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exams.Shape;

/**
 *
 * @author hayam tarek
 */
public class Shape {

    int length;
    int breadth;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println(length + " " + breadth);
    }
}
