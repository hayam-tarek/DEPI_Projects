/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComplexNumbers;

/**
 *
 * @author hayam tarek
 */
public class ComplexNumber {

    private int real;
    private int img;

    public int getImg() {
        return img;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void printComplexNumber() {
        System.out.println(real + "+" + img + "i");
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber c3 = new ComplexNumber();
        c3.setReal(c1.getReal() + c2.getReal());
        c3.setImg(c1.getImg() + c2.getImg());
        return c3;
    }

    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber c3 = new ComplexNumber();
        c3.setReal(c1.getReal() - c2.getReal());
        c3.setImg(c1.getImg() - c2.getImg());
        return c3;
    }
}
