package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrassHopperTest
{
    @Test
    void sample()
    {
        assertEquals(3, GrassHopper.summation(2));
        assertEquals(36, GrassHopper.summation(8));
    }
}
