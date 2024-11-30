/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author hayam tarek
 */
public class Rectangle extends Shape {
    int dim2;
    public Rectangle(int dim, int dim2) {
        super(dim);
        this.dim2 = dim2;
    }

    @Override
    public double calculateArea() {
        return super.dim * dim2;
    }

}
