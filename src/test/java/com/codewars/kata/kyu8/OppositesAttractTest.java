package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OppositesAttractTest
{
    @Test
    void sample()
    {
        assertTrue(OppositesAttract.isLove(1, 4));
        assertTrue(OppositesAttract.isLove(0, 1));
        assertFalse(OppositesAttract.isLove(2, 2));
        assertFalse(OppositesAttract.isLove(1, 1));
    }
}
