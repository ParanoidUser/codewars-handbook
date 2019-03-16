package com.codewars.kata.kyu3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest
{
    @Test
    void sample()
    {
        assertEquals(7, Calculator.kata("2 / 2 + 3 * 4 - 6"));
        assertEquals(127, Calculator.kata("127"));
        assertEquals(5, Calculator.kata("2 + 3"));
        assertEquals(-5, Calculator.kata("2 - 3 - 4"));
        assertEquals(10, Calculator.kata("10 * 5 / 5"));
        assertEquals(13, Calculator.kata("2 / 2 + 3 * 4"));
        assertEquals(0, Calculator.kata("7.7 - 3.3 - 4.4"));
    }
}
