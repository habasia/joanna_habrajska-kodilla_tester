
package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator bean;

    @Test
    public void shouldAddNumbers() {
        double value = bean.add(1, 1);
        Assertions.assertEquals(2, value);
    }

    @Test
    public void shouldSubtractNumbers() {
        double value = bean.subtract(2, 1);
        Assertions.assertEquals(1, value);
    }

    @Test
    public void shouldMultiplyNumbers() {
        double value = bean.multiply(2, 3);
        Assertions.assertEquals(6, value);
    }

    @Test
    public void shouldDivideNumbers() {
        double value = bean.divide(6, 2);
        Assertions.assertEquals(3, value);
    }
}