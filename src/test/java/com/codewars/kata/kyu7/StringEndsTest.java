package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringEndsTest
{
    @Test
    void testSomething()
    {
        assertTrue(StringEnds.kata("abc", "bc"));
        assertFalse(StringEnds.kata("abc", "d"));
    }
}