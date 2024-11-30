/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exams.Shape;

/**
 *
 * @author hayam tarek
 */
public class Rectangle extends Shape {

    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void area() {
        super.area();
        System.out.println(this.length * this.breadth);

    }
}
