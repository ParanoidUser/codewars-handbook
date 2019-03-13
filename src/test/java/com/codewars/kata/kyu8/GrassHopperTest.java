package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrassHopperTest
{
    @Test
    void should()
    {
        assertEquals(3, GrassHopper.kata(2));
        assertEquals(36, GrassHopper.kata(8));
    }
}
