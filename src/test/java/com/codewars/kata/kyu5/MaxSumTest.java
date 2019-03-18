package com.codewars.kata.kyu5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxSumTest
{
    @Test
    void sample()
    {
        assertEquals(24, MaxSum.kata(new int[] { 3, -4, 8, 7, -10, 19, -3 }));
        assertEquals(9, MaxSum.kata(new int[] { 2, -3, -3, 9, -29, 8, -9 }));
        assertEquals(5, MaxSum.kata(new int[] { -8, -10, -12, -2, -3, 5 }));
    }
}
