package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountOddNumbersTest
{
    @Test
    void sample()
    {
        assertEquals(3, CountOddNumbers.oddCount(7));
        assertEquals(7, CountOddNumbers.oddCount(15));
        assertEquals(7511, CountOddNumbers.oddCount(15023));
    }
}
