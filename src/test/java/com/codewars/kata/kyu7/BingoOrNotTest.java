package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BingoOrNotTest
{
    @Test
    void sample()
    {
        assertEquals("LOSE", BingoOrNot.kata(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        assertEquals("WIN", BingoOrNot.kata(new int[] { 21, 13, 2, 7, 5, 14, 7, 15, 9, 10 }));
    }
}
