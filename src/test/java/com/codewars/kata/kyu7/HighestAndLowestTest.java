package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestAndLowestTest
{
    @Test
    void sample()
    {
        assertEquals("42 -9", HighestAndLowest.kata("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
