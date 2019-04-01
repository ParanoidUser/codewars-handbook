package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OddOrEvenTest
{
    @Test
    void sample()
    {
        assertEquals("odd", OddOrEven.kata(new int[] { 2, 5, 34, 6 }));
    }
}
