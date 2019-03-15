package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DivSevenTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new long[]{ 37, 0 }, DivSeven.kata(37));
        assertArrayEquals(new long[]{ 35, 1 }, DivSeven.kata(371));
        assertArrayEquals(new long[]{ 33, 1 }, DivSeven.kata(372));
        assertArrayEquals(new long[]{ 7, 2 }, DivSeven.kata(1603));
        assertArrayEquals(new long[]{ 28, 7 }, DivSeven.kata(477557101));
        assertArrayEquals(new long[]{ 42, 1 }, DivSeven.kata(483));
    }
}
