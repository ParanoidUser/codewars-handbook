package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackOrWhiteKeyTest
{
    @Test
    void sample()
    {
        assertEquals("white", BlackOrWhiteKey.kata(1));
        assertEquals("black", BlackOrWhiteKey.kata(5));
        assertEquals("black", BlackOrWhiteKey.kata(12));
        assertEquals("white", BlackOrWhiteKey.kata(42));
        assertEquals("white", BlackOrWhiteKey.kata(88));
        assertEquals("white", BlackOrWhiteKey.kata(89));
        assertEquals("white", BlackOrWhiteKey.kata(92));
        assertEquals("black", BlackOrWhiteKey.kata(100));
        assertEquals("white", BlackOrWhiteKey.kata(111));
        assertEquals("black", BlackOrWhiteKey.kata(200));
        assertEquals("white", BlackOrWhiteKey.kata(2017));
    }
}
