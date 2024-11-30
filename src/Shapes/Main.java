/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author hayam tarek
 */
public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3,4);
        Shape triangle = new Triangle(5,6,7);
        Shape circle = new Circle(5);

        double totalArea = Picture.sumAreas(rectangle, triangle, circle);
        System.out.println("Total area: " + totalArea);

    }
}
