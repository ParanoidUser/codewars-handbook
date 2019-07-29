package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HexToDecimalTest
{
    @Test
    void sample()
    {
        assertEquals(1, HexToDecimal.hexToDec("1"));
        assertEquals(10, HexToDecimal.hexToDec("a"));
        assertEquals(16, HexToDecimal.hexToDec("10"));
        assertEquals(255, HexToDecimal.hexToDec("FF"));
        assertEquals(-12, HexToDecimal.hexToDec("-C"));
    }
}
