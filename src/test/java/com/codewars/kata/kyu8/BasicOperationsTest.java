package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicOperationsTest
{
    @Test
    void sample()
    {
        assertEquals(11, BasicOperations.kata("+", 4, 7));
        assertEquals(-3, BasicOperations.kata("-", 15, 18));
        assertEquals(25, BasicOperations.kata("*", 5, 5));
        assertEquals(7, BasicOperations.kata("/", 49, 7));
    }
}
