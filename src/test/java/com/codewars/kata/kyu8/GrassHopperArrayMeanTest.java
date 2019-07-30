package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GrassHopperArrayMeanTest
{
    @Test
    void sample()
    {
        assertEquals(1, GrassHopperArrayMean.findAverage(new int[] { 1 }));
        assertEquals(4, GrassHopperArrayMean.findAverage(new int[] { 1, 3, 5, 7 }));
    }
}