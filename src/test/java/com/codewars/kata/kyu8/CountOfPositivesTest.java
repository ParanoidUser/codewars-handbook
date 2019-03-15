package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountOfPositivesTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[]{ 10, -65 }, CountOfPositives.kata(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 }));
        assertArrayEquals(new int[]{ 8, -50 }, CountOfPositives.kata(new int[]{ 0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14 }));
    }
}
