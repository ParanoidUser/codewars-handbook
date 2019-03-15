package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfPositiveTest
{
    @Test
    void sample()
    {
        assertEquals(15, SumOfPositive.kata(new int[]{ 1, 2, 3, 4, 5 }));
        assertEquals(13, SumOfPositive.kata(new int[]{ 1, -2, 3, 4, 5 }));
        assertEquals(0, SumOfPositive.kata(new int[]{}));
        assertEquals(0, SumOfPositive.kata(new int[]{ -1, -2, -3, -4, -5 }));
        assertEquals(9, SumOfPositive.kata(new int[]{ -1, 2, 3, 4, -5 }));
    }
}
