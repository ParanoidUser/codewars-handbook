package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberToStringTest
{
    @Test
    void sample()
    {
        assertEquals("123", NumberToString.kata(123));
        assertEquals("999", NumberToString.kata(999));
    }
}
