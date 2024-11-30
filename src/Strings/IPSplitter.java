/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author hayam tarek
 */
public class IPSplitter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();

        String[] spliter = ipAddress.split("\\.");

        System.out.println("Output:");
        for (int i = 0; i < spliter.length; i++) {
            System.out.println(spliter[i]);
        }

        scanner.close();
    }
}
