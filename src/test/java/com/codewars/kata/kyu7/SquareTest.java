package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SquareTest
{
    @Test
    void sample()
    {
        assertFalse(Square.kata(-1));
        assertTrue(Square.kata(0));
        assertFalse(Square.kata(3));
        assertTrue(Square.kata(4));
        assertTrue(Square.kata(25));
        assertFalse(Square.kata(26));
    }
}
