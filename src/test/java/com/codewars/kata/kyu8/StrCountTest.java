package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StrCountTest
{
    @Test
    void sample()
    {
        assertEquals(1, StrCount.kata("Hello", 'o'));
        assertEquals(2, StrCount.kata("Hello", 'l'));
        assertEquals(0, StrCount.kata("", 'z'));
    }
}
