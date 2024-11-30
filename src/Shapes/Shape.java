/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author hayam tarek
 */
public abstract class Shape {

    int dim;

    public Shape(int dim) {
        this.dim = dim;
    }

    public abstract double calculateArea();
}
