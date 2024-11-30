/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author hayam tarek
 */
public class Circle extends Shape {

    public Circle(int dim) {
        super(dim);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(dim, 2);
    }
}
