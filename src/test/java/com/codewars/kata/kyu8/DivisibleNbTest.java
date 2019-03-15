package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivisibleNbTest
{
    @Test
    void sample()
    {
        assertTrue(DivisibleNb.kata(12, 4, 3));
        assertFalse(DivisibleNb.kata(3, 3, 4));
    }
}
