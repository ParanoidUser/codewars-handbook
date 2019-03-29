package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OppositesAttractTest
{
    @Test
    void sample()
    {
        assertTrue(OppositesAttract.kata(1, 4));
        assertTrue(OppositesAttract.kata(0, 1));
        assertFalse(OppositesAttract.kata(2, 2));
        assertFalse(OppositesAttract.kata(1, 1));
    }
}
