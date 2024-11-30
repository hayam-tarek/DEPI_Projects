/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author hayam tarek
 */
public class Picture {

    public static double sumAreas(Shape shape1, Shape shape2, Shape shape3) {
        return shape1.calculateArea() + shape2.calculateArea() + shape3.calculateArea();
    }
}
