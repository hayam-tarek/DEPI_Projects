/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ComplexNumbers;

/**
 *
 * @author hayam tarek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Java");
        ComplexNumber c1 = new ComplexNumber();
        c1.setReal(2);
        c1.setImg(2);
        ComplexNumber c2 = new ComplexNumber();
        c2.setReal(3);
        c2.setImg(3);
        ComplexNumber sum = ComplexNumber.sum(c1, c2);
        ComplexNumber subtract = ComplexNumber.subtract(c1, c2);
        sum.printComplexNumber();
        subtract.printComplexNumber();
    }

}
