package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NthPowerTest
{
    @Test
    void sample()
    {
        assertEquals(-1, NthPower.kata(new int[] { 1, 2 }, 2));
        assertEquals(8, NthPower.kata(new int[] { 3, 1, 2, 2 }, 3));
        assertEquals(4, NthPower.kata(new int[] { 3, 1, 2 }, 2));
    }
}
