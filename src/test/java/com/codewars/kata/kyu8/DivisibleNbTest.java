package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivisibleNbTest
{
    @Test
    void test1()
    {
        assertTrue(DivisibleNb.kata(12, 4, 3));
    }

    @Test
    void test2()
    {
        assertFalse(DivisibleNb.kata(3, 3, 4));
    }
}
