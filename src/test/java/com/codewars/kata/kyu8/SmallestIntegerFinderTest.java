package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestIntegerFinderTest
{
    @Test
    void sample()
    {
        assertEquals(11, SmallestIntegerFinder.kata(new int[]{ 78, 56, 232, 12, 11, 43 }));
        assertEquals(-33, SmallestIntegerFinder.kata(new int[]{ 78, 56, -2, 12, 8, -33 }));
        assertEquals(Integer.MIN_VALUE, SmallestIntegerFinder.kata(new int[]{ 0, Integer.MIN_VALUE, Integer.MAX_VALUE }));
    }
}
