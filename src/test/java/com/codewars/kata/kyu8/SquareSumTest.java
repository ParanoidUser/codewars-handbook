package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareSumTest
{
    @Test
    void sample()
    {
        assertEquals(9, SquareSum.squareSum(new int[] { 1, 2, 2 }));
        assertEquals(5, SquareSum.squareSum(new int[] { 1, 2 }));
        assertEquals(50, SquareSum.squareSum(new int[] { 5, -3, 4 }));
    }
}
