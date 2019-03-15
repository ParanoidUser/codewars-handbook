package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GuessSequenceTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[]{ 1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9 }, GuessSequence.kata(16));
    }
}
