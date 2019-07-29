package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvenOrOddTest
{
    @Test
    void sample()
    {
        assertEquals("Odd", EvenOrOdd.even_or_odd(1));
        assertEquals("Even", EvenOrOdd.even_or_odd(2));
        assertEquals("Odd", EvenOrOdd.even_or_odd(3));
    }
}
