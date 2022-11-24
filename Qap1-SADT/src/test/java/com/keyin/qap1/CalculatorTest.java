package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testMultiply() {

        Calculator calculator = new Calculator();

        int resultOne = calculator.multiply(6,2);

        Assertions.assertNotEquals(10, resultOne);

        System.out.println("Result one does equal " + resultOne);
    }

    @Test
    public void testAdd() {

        Calculator calculator = new Calculator();

        int resultTwo = calculator.add(11, 10);

        Assertions.assertEquals(21, resultTwo);

        System.out.println("Result two does equal " + resultTwo);
    }

    @Test
    public void testSubtract() {

        Calculator calculator = new Calculator();

        int resultThree = calculator.subtract(100, 50);

        Assertions.assertEquals(50, resultThree);

        System.out.println("Result three does equal " + resultThree);
    }
}
