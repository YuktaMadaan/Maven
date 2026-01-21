package com.example.adder;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    // ADD Test
    public void testAdd() {
        int result = App.add(10, 20);
        assertEquals(30, result);
    }

    // SUB Test
    public void testSub() {
        int result = App.sub(50, 20);
        assertEquals(30, result);
    }

    // MUL Test
    public void testMul() {
        int result = App.mul(5, 6);
        assertEquals(30, result);
    }

    // DIV Test
    public void testDiv() {
        int result = App.div(40, 8);
        assertEquals(5, result);
    }

    // DIV by Zero Test (optional)
    public void testDivByZero() {
        try {
            App.div(10, 0);
            fail("Division by zero should throw exception!");
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }
}
