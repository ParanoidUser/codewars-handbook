package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EvenNumbersTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[]{ 2, 4, 6 }, EvenNumbers.kata(new int[]{ 1, 2, 3, 4, 5, 6 }, 2));
        assertArrayEquals(new int[]{ 3, 6 }, EvenNumbers.kata(new int[]{ 1, 2, 3, 4, 5, 6 }, 3));
        assertArrayEquals(new int[]{ 0, 4 }, EvenNumbers.kata(new int[]{ 0, 1, 2, 3, 4, 5, 6 }, 4));
    }
}
