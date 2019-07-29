package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class WilsonPrimeTest
{
    @Test
    void sample()
    {
        assertFalse(WilsonPrime.am_i_wilson(0));
        assertFalse(WilsonPrime.am_i_wilson(1));
        assertTrue(WilsonPrime.am_i_wilson(5));
    }
}
