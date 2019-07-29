package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SidTest
{
    @Test
    void sample()
    {
        assertEquals(9, Sid.simpleMultiplication(1));
        assertEquals(27, Sid.simpleMultiplication(3));
        assertEquals(189, Sid.simpleMultiplication(21));
        assertEquals(207, Sid.simpleMultiplication(23));
        assertEquals(16, Sid.simpleMultiplication(2));
        assertEquals(32, Sid.simpleMultiplication(4));
        assertEquals(176, Sid.simpleMultiplication(22));
        assertEquals(208, Sid.simpleMultiplication(26));
    }
}
