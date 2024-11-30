/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exams.Shape;

import java.util.Scanner;

/**
 *
 * @author hayam tarek
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();
        Rectangle r = new Rectangle(length, breadth);
        r.area();

    }
}
