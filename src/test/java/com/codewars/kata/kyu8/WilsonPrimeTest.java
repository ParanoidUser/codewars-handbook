package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class WilsonPrimeTest
{
    @Test
    void sample()
    {
        assertFalse(WilsonPrime.kata(0));
        assertFalse(WilsonPrime.kata(1));
        assertTrue(WilsonPrime.kata(5));
    }
}
