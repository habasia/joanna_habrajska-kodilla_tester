package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(14, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractionResult = calculator.subtract(a, b);
        assertEquals(-3, subtractionResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator(); // czy za każdym razem trzeba tworzyć nowy obiekt?
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25,squareResult);
    }
}