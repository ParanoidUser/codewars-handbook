package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrassHopperSummationTest
{
    @Test
    void sample()
    {
        assertEquals(3, GrassHopperSummation.summation(2));
        assertEquals(36, GrassHopperSummation.summation(8));
    }
}
