package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountDigitsTest
{
    @Test
    void sample()
    {
        assertEquals(4, CountDigits.kata(10, 1));
        assertEquals(11, CountDigits.kata(25, 1));
        assertEquals(4700, CountDigits.kata(5750, 0));
        assertEquals(9481, CountDigits.kata(11011, 2));
        assertEquals(7733, CountDigits.kata(12224, 8));
        assertEquals(11905, CountDigits.kata(11549, 1));
    }
}
