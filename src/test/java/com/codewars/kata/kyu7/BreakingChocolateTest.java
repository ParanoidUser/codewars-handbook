package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BreakingChocolateTest
{
    @Test
    void myTests()
    {
        assertEquals(24, BreakingChocolate.kata(5, 5));
        assertEquals(0, BreakingChocolate.kata(1, 1));
    }
}
