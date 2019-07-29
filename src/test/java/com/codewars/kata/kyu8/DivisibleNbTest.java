package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DivisibleNbTest
{
    @Test
    void sample()
    {
        assertTrue(DivisibleNb.isDivisible(12, 4, 3));
        assertFalse(DivisibleNb.isDivisible(3, 3, 4));
    }
}
