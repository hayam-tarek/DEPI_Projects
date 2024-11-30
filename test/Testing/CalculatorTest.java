/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hayam tarek
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = Calculator.sum(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 3;
        int b = 10;
        int expResult = -7;
        int result = Calculator.subtract(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 3;
        int b = 5;
        int expResult = 15;
        int result = Calculator.multiply(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 15;
        int b = 3;
        double expResult = 5.0;
        double result = Calculator.division(a, b);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    
}
