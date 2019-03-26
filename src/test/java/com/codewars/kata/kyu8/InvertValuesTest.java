package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class InvertValuesTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, InvertValues.kata(new int[] { -1, -2, -3, -4, -5 }));
        assertArrayEquals(new int[] { -1, 2, -3, 4, -5 }, InvertValues.kata(new int[] { 1, -2, 3, -4, 5 }));
        assertArrayEquals(new int[] { 0 }, InvertValues.kata(new int[] { 0 }));
        assertArrayEquals(new int[0], InvertValues.kata(new int[0]));
    }
}
