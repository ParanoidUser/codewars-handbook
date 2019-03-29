package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountOddNumbersTest
{
    @Test
    void sample()
    {
        assertEquals(3, CountOddNumbers.kata(7));
        assertEquals(7, CountOddNumbers.kata(15));
        assertEquals(7511, CountOddNumbers.kata(15023));
    }
}
