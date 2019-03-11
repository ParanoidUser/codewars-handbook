package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTesterTest
{
    @Test
    void publicTests()
    {
        assertTrue(TriangleTester.kata(1, 2, 2));
        assertFalse(TriangleTester.kata(7, 2, 2));
    }
}
