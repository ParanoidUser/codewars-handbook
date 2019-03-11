package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessSequenceTest
{
    @Test
    void test0()
    {
        int[] result = { 1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 16;
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(GuessSequence.kata(x));
        assertEquals(expected, actual);
    }
}
