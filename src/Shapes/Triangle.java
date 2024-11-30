/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author hayam tarek
 */
public class Triangle extends Shape {

    int dim2, dim3;

    public Triangle(int dim, int dim2, int dim3) {
        super(dim);
        this.dim2 = dim2;
        this.dim3 = dim3;
    }

    @Override
    public double calculateArea() {
        double s = (super.dim + dim2 + dim3) / 2.0;
        return Math.sqrt(s * (s - super.dim) * (s - dim2) * (s - dim3));
    }
}
