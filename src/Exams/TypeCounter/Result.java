/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exams.TypeCounter;

/**
 *
 * @author hayam tarek
 */
public class Result {

    public static void typeCounter(String sentence) {
        String[] words = sentence.split("\\s+");
        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;
        for (String word : words) {
            if (isInteger(word)) {
                integerCount++;
            } else if (isDouble(word)) {
                doubleCount++;
            } else if (isString(word)) {
                stringCount++;
            }
        }

        System.out.println("string " + stringCount);
        System.out.println("integer " + integerCount);
        System.out.println("double " + doubleCount);
    }

    public static boolean isString(String word) {
        return word.matches("[a-z]+");
    }

    public static boolean isInteger(String word) {
        return word.matches("\\d+");
    }

    public static boolean isDouble(String word) {
        return word.matches("\\d+\\.\\d+");
    }
}
