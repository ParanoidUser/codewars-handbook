package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HexToDecimalTest
{
    @Test
    void sample()
    {
        assertEquals(1, HexToDecimal.kata("1"));
        assertEquals(10, HexToDecimal.kata("a"));
        assertEquals(16, HexToDecimal.kata("10"));
        assertEquals(255, HexToDecimal.kata("FF"));
        assertEquals(-12, HexToDecimal.kata("-C"));
    }
}
