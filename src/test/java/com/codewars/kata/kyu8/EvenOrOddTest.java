package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenOrOddTest
{
    @Test
    void sample()
    {
        assertEquals("Odd", EvenOrOdd.kata(1));
        assertEquals("Even", EvenOrOdd.kata(2));
        assertEquals("Odd", EvenOrOdd.kata(3));
    }
}
